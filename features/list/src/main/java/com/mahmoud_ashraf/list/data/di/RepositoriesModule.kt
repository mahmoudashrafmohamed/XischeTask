package com.mahmoud_ashraf.list.data.di

import com.mahmoud_ashraf.list.data.remote.datasource.UniversitiesRemoteDataSource
import com.mahmoud_ashraf.list.data.repository.UniversitiesRepositoryImpl
import com.mahmoud_ashraf.list.data.repository.contracts.IUniversitiesRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
@Module
class RepositoriesModule {
  @Singleton
  @Provides
   fun provideRepository(universitiesRemoteDataSource: UniversitiesRemoteDataSource) : IUniversitiesRepository{
    return UniversitiesRepositoryImpl(universitiesRemoteDataSource)
   }
}