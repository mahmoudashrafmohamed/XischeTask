package com.mahmoud_ashraf.list.data.remote.datasource

import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem
import com.mahmoud_ashraf.list.data.remote.services.UniversityService

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class UniversitiesRemoteDataSource(private val universityService: UniversityService) {
   suspend fun getUniversities(): List<GetUniversitiesResponseItem> {
    return universityService.getUniversities()
  }
}