package com.mahmoud_ashraf.list.data.repository

import com.mahmoud_ashraf.list.data.remote.datasource.UniversitiesRemoteDataSource
import com.mahmoud_ashraf.core.data.GetUniversitiesResponseItem
import com.mahmoud_ashraf.list.data.repository.contracts.IUniversitiesRepository
import javax.inject.Inject

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class UniversitiesRepositoryImpl @Inject constructor(private val universitiesRemoteDataSource: UniversitiesRemoteDataSource) : IUniversitiesRepository {
  override suspend fun getUniversities(): List<GetUniversitiesResponseItem> {
    return universitiesRemoteDataSource.getUniversities()
  }
}