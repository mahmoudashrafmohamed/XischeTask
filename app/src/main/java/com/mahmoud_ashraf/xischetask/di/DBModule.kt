package com.mahmoud_ashraf.xischetask.di

import android.app.Application
import androidx.room.Room
import com.mahmoud_ashraf.list.data.local.UniversitiesListDao
import com.mahmoud_ashraf.list.data.local.UniversitiesListDatabase
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalDataSourcesKeys.UNIVERSITIES_LIST_DB_NAME
import com.mahmoud_ashraf.xischetask.AppController
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
@Module
class DBModule {
  @Singleton
  @Provides
  fun provideShoppingListDatabase(appController: Application): UniversitiesListDatabase {
    return  Room.databaseBuilder(
      appController.applicationContext,
      UniversitiesListDatabase::class.java,
      UNIVERSITIES_LIST_DB_NAME
    )
      .fallbackToDestructiveMigration()
      .build()
  }

  @Provides
  @Singleton
  fun provideUniversitiesListDao(universitiesListDatabase: UniversitiesListDatabase): UniversitiesListDao{
    return universitiesListDatabase.universitiesListDao
  }
}
