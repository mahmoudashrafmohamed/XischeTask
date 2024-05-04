package com.mahmoud_ashraf.list.data.repository

import com.mahmoud_ashraf.core.enitiy.University
import com.mahmoud_ashraf.list.data.di.IoDispatcher
import com.mahmoud_ashraf.list.data.local.datasource.UniversitiesLocalDataSource
import com.mahmoud_ashraf.list.data.mappers.localToDomainEntity
import com.mahmoud_ashraf.list.data.mappers.remoteToDomainEntity
import com.mahmoud_ashraf.list.data.mappers.toLocalEntity
import com.mahmoud_ashraf.list.data.remote.datasource.UniversitiesRemoteDataSource
import com.mahmoud_ashraf.list.data.repository.contracts.IUniversitiesRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class UniversitiesRepositoryImpl @Inject constructor(
  private val universitiesRemoteDataSource: UniversitiesRemoteDataSource,
  private val universitiesLocalDataSource: UniversitiesLocalDataSource,
  @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : IUniversitiesRepository {
  override suspend fun getUniversities(): List<University> {
    try {
      val universities = universitiesRemoteDataSource.getUniversities()
      withContext(ioDispatcher) {
        universitiesLocalDataSource.deleteAll()
        universitiesLocalDataSource.insertUniversitiesList(universities.toLocalEntity())
      }
      return universities.remoteToDomainEntity()
    } catch (e: Exception) {
      e.printStackTrace()
      val localData = withContext(ioDispatcher) {
        universitiesLocalDataSource.getUniversitiesList().localToDomainEntity()
      }
      return localData
    }
  }
}










