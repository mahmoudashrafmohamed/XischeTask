package com.mahmoud_ashraf.details.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mahmoud_ashraf.core.enitiy.University
import com.mahmoud_ashraf.core.navigator.NavigationKeys.UNIVERSITIES_ITEM
import com.mahmoud_ashraf.details.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {

  private var _binding: FragmentDetailsBinding? = null
  private val binding get() = _binding!!
  private val university by lazy {  arguments?.getParcelable<University>(UNIVERSITIES_ITEM)}


  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?,
  ): View {
    _binding = FragmentDetailsBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    university?.let { initView(it) }
  }

  private fun initView(university:University) {
    with(binding){
      tvName.text = university.name
      tvState.text = university.stateProvince
      tvCountry.text = university.country
      tvWebpage.text = university.webPage
      tvCountryCode.text = university.alphaTwoCode
    }
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }

}