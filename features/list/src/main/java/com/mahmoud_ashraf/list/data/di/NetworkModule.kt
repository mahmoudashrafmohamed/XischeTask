package com.mahmoud_ashraf.list.data.di

import com.mahmoud_ashraf.list.data.remote.constants.RemoteConstants.UNIVERSITY_BASE_URL
import com.mahmoud_ashraf.list.data.remote.services.UniversityService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
@Module
class NetworkModule {
  @Singleton
  @Provides
   fun provideUniversityService(): UniversityService {
    return Retrofit.Builder()
      .baseUrl(UNIVERSITY_BASE_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build()
      .create(UniversityService::class.java)
  }
}