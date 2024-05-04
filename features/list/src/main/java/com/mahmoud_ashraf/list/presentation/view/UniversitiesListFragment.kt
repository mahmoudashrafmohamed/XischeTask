package com.mahmoud_ashraf.list.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem
import com.mahmoud_ashraf.list.databinding.FragmentUniversitiesListBinding
import com.mahmoud_ashraf.list.presentation.viewmodel.UniversitiesListViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class UniversitiesListFragment :DaggerFragment() {

  @Inject
  lateinit var viewModelProviderFactory: ViewModelProvider.Factory

  private val viewModel: UniversitiesListViewModel by lazy {
    ViewModelProvider(this, viewModelProviderFactory)[UniversitiesListViewModel::class.java]
  }

  private var _binding: FragmentUniversitiesListBinding? = null
  private val binding get() = _binding!!

  private val universitiesListAdapter by lazy {  UniversitiesListAdapter() }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?,
  ): View {
    _binding = FragmentUniversitiesListBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.rvUniversities.adapter = universitiesListAdapter
      viewModel.universitiesList.observe(viewLifecycleOwner){
      Log.d("current list = ",""+it.toString())
      bindUI(it)
    }
    viewModel.getUniversities()
  }

  private fun bindUI(items: List<GetUniversitiesResponseItem>) {
    universitiesListAdapter.submitList(items)
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }

}