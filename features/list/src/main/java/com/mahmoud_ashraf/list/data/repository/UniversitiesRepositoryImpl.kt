package com.mahmoud_ashraf.list.data.repository

import com.mahmoud_ashraf.list.data.remote.datasource.UniversitiesRemoteDataSource
import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem
import com.mahmoud_ashraf.list.data.repository.contracts.IUniversitiesRepository

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class UniversitiesRepositoryImpl(private val universitiesRemoteDataSource: UniversitiesRemoteDataSource) : IUniversitiesRepository {
  override suspend fun getUniversities(): List<GetUniversitiesResponseItem> {
    return universitiesRemoteDataSource.getUniversities()
  }
}