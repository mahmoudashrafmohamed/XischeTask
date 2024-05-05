package com.mahmoud_ashraf.list.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahmoud_ashraf.list.domain.usecase.GetUniversitiesUseCase
import com.mahmoud_ashraf.list.presentation.model.UniversitiesListScreenState
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class UniversitiesListViewModel@Inject constructor(private val universitiesUseCase: GetUniversitiesUseCase) : ViewModel() {

  private val _screenState = MutableLiveData<UniversitiesListScreenState>()
  val screenState = _screenState
  var isRefreshRequired =  true

  fun getUniversities(){
    // to load the data only once and not refresh on configuration change
    if (isRefreshRequired) {
      viewModelScope.launch {
        _screenState.postValue(UniversitiesListScreenState.Loading)
        val universities = universitiesUseCase()
        _screenState.postValue(UniversitiesListScreenState.Success(universities))
        isRefreshRequired = false
      }
    }
  }

}