package com.mahmoud_ashraf.list.domain.usecase

import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem
import com.mahmoud_ashraf.list.data.repository.contracts.IUniversitiesRepository

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class GetUniversitiesUseCase(private val universitiesRepository: IUniversitiesRepository) {
  suspend operator fun invoke() : List<GetUniversitiesResponseItem>{
    return universitiesRepository.getUniversities()
  }
}