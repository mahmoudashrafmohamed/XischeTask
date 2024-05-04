package com.mahmoud_ashraf.list.presentation.model

import com.mahmoud_ashraf.core.enitiy.University

/**
 * Created by Mahmoud Ashraf on 05,May,2024
 */
sealed class UniversitiesListScreenState {
  data object Loading : UniversitiesListScreenState()
  data class Success(val data: List<University>) : UniversitiesListScreenState()
}