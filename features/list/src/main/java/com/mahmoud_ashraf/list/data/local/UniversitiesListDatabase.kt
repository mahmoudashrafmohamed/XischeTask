package com.mahmoud_ashraf.list.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalDataSourcesKeys.UNIVERSITIES_LIST_DB_VERSION
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalEntity


@Database(entities = [UniversityLocalEntity::class], version = UNIVERSITIES_LIST_DB_VERSION, exportSchema = false)
abstract class UniversitiesListDatabase : RoomDatabase() {
  abstract val universitiesListDao : UniversitiesListDao
}