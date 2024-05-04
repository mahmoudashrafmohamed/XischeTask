package com.mahmoud_ashraf.list.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.mahmoud_ashraf.core.androidExtensions.replaceFragment
import com.mahmoud_ashraf.core.enitiy.University
import com.mahmoud_ashraf.core.navigator.Fragments
import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem
import com.mahmoud_ashraf.list.databinding.FragmentUniversitiesListBinding
import com.mahmoud_ashraf.core.navigator.NavigationKeys.UNIVERSITIES_ITEM
import com.mahmoud_ashraf.list.presentation.model.UniversitiesListScreenState
import com.mahmoud_ashraf.list.presentation.viewmodel.UniversitiesListViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class UniversitiesListFragment : DaggerFragment() {

  @Inject
  lateinit var viewModelProviderFactory: ViewModelProvider.Factory

  private val viewModel: UniversitiesListViewModel by lazy {
    ViewModelProvider(this, viewModelProviderFactory)[UniversitiesListViewModel::class.java]
  }

  private var _binding: FragmentUniversitiesListBinding? = null
  private val binding get() = _binding!!

  private val universitiesListAdapter by lazy { UniversitiesListAdapter(::onUniversityItemClicked) }

  private fun onUniversityItemClicked(university: University) {
    val bundle = Bundle()
    bundle.putParcelable(
      UNIVERSITIES_ITEM,
      university
    )
    (this as Fragment).replaceFragment(Fragments.DetailsFragment, bundle = bundle)
  }

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
    viewModel.screenState.observe(viewLifecycleOwner) {
      handleScreenState(it)
    }
    viewModel.getUniversities()
  }

  private fun handleScreenState(it: UniversitiesListScreenState?) {
    when (it) {
      is UniversitiesListScreenState.Loading -> showLoading()
      is UniversitiesListScreenState.Success -> bindUI(it.data)
      else -> Unit
    }
  }

  private fun showLoading() {
    binding.progress.isVisible = true
  }
  private fun hideLoading() {
    binding.progress.isVisible = false
  }

  private fun bindUI(items: List<University>) {
    hideLoading()
    universitiesListAdapter.submitList(items)
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }

}