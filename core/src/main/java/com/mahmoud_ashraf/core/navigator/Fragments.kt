package com.mahmoud_ashraf.core.navigator

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
object Fragments {
  object UniversitiesListFragment : AddressableFragment {
    override val className: String = "com.mahmoud_ashraf.list.presentation.view.UniversitiesListFragment"
  }
  object DetailsFragment : AddressableFragment {
    override val className: String = "com.mahmoud_ashraf.details.presentation.view.DetailsFragment"
  }
}