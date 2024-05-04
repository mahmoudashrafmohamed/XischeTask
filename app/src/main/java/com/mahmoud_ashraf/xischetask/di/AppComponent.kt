package com.mahmoud_ashraf.xischetask.di

import android.app.Application
import com.mahmoud_ashraf.list.data.di.NetworkModule
import com.mahmoud_ashraf.list.data.di.RepositoriesModule
import com.mahmoud_ashraf.list.presentation.di.ViewModelModule
import com.mahmoud_ashraf.xischetask.AppController
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
@Singleton
@Component(
  modules = [
    AndroidInjectionModule::class,
    NetworkModule::class,
    RepositoriesModule::class,
    FragmentBuildersModule::class,
    MainActivityModule::class,
  ViewModelModule::class
  ]
)
interface AppComponent : AndroidInjector<AppController> {

  override fun inject(instance: AppController)

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(application: Application): Builder

    fun build(): AppComponent
  }
}