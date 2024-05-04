package com.mahmoud_ashraf.list.data.di

import com.mahmoud_ashraf.list.data.local.datasource.UniversitiesLocalDataSource
import com.mahmoud_ashraf.list.data.remote.datasource.UniversitiesRemoteDataSource
import com.mahmoud_ashraf.list.data.repository.UniversitiesRepositoryImpl
import com.mahmoud_ashraf.list.data.repository.contracts.IUniversitiesRepository
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
@Module
class RepositoriesModule {
  @Singleton
  @Provides
   fun provideRepository(universitiesRemoteDataSource: UniversitiesRemoteDataSource, universitiesLocalDataSource: UniversitiesLocalDataSource,@IoDispatcher ioDispatcher : CoroutineDispatcher) : IUniversitiesRepository{
    return UniversitiesRepositoryImpl(universitiesRemoteDataSource, universitiesLocalDataSource,ioDispatcher)
   }
}