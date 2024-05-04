package com.mahmoud_ashraf.list.data.remote.datasource

import com.mahmoud_ashraf.core.data.GetUniversitiesResponseItem
import com.mahmoud_ashraf.list.data.remote.services.UniversityService
import javax.inject.Inject

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class UniversitiesRemoteDataSource @Inject constructor(private val universityService: UniversityService) {
   suspend fun getUniversities(): List<GetUniversitiesResponseItem> {
    return universityService.getUniversities()
  }
}