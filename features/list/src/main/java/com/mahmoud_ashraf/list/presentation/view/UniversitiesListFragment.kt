package com.mahmoud_ashraf.list.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.mahmoud_ashraf.list.R
import com.mahmoud_ashraf.list.presentation.viewmodel.UniversitiesListViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class UniversitiesListFragment :DaggerFragment() {

  @Inject
  lateinit var viewModelProviderFactory: ViewModelProvider.Factory

  private val viewModel: UniversitiesListViewModel by lazy {
    ViewModelProvider(this, viewModelProviderFactory)[UniversitiesListViewModel::class.java]
  }


  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?,
  ): View? {
    return inflater.inflate(R.layout.fragment_universities_list, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    viewModel.universitiesList.observe(viewLifecycleOwner){
      Log.e("current list = ",""+it.toString())
    }
    viewModel.getUniversities()
  }


}