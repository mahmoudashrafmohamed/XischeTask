package com.mahmoud_ashraf.list.data.local.datasource

import com.mahmoud_ashraf.list.data.local.UniversitiesListDao
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalEntity
import javax.inject.Inject

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class UniversitiesLocalDataSource @Inject constructor(private val universitiesListDao: UniversitiesListDao) {
  suspend fun insertUniversitiesList(list: List<UniversityLocalEntity>) {
    universitiesListDao.insert(list)
  }

  suspend fun deleteAll() {
    return universitiesListDao.clearAll()
  }

  fun getUniversitiesList(): List<UniversityLocalEntity> {
    return universitiesListDao.getUniversities()
  }
}