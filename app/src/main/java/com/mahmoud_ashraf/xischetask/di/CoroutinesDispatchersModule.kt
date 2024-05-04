package com.mahmoud_ashraf.xischetask.di

import com.mahmoud_ashraf.list.data.di.IoDispatcher
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier

/**
 * Created by Mahmoud Ashraf on 05,May,2024
 */
@Module
class CoroutinesDispatchersModule {
  @IoDispatcher
  @Provides
  fun providesIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

}