package com.mahmoud_ashraf.list.domain.usecase

import com.mahmoud_ashraf.core.enitiy.University
import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem
import com.mahmoud_ashraf.list.data.repository.contracts.IUniversitiesRepository
import javax.inject.Inject

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class GetUniversitiesUseCase @Inject constructor(private val universitiesRepository: IUniversitiesRepository) {
  suspend operator fun invoke() : List<University>{
    return universitiesRepository.getUniversities()
  }
}