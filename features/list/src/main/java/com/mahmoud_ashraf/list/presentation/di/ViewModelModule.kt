package com.mahmoud_ashraf.list.presentation.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mahmoud_ashraf.list.presentation.viewmodel.UniversitiesListViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import java.lang.annotation.RetentionPolicy
import kotlin.reflect.KClass

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
@Module
abstract class ViewModelModule {


  @Binds
  @IntoMap
  @ViewModelKey( UniversitiesListViewModel::class )
  // Bind your View Model here
  abstract fun bindUniversitiesListViewModel( mainViewModel: UniversitiesListViewModel ): ViewModel

  @Binds
  abstract fun bindViewModelFactory( factory: ViewModelFactory):
    ViewModelProvider.Factory

}

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)
