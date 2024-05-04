package com.mahmoud_ashraf.list.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahmoud_ashraf.core.data.GetUniversitiesResponseItem
import com.mahmoud_ashraf.list.domain.usecase.GetUniversitiesUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class UniversitiesListViewModel@Inject constructor(private val universitiesUseCase: GetUniversitiesUseCase) : ViewModel() {

  private val _universitiesList = MutableLiveData<List<GetUniversitiesResponseItem>>()
  val universitiesList = _universitiesList

  fun getUniversities(){
    viewModelScope.launch {
      val universities = universitiesUseCase()
      _universitiesList.postValue(universities)

    }
  }

}