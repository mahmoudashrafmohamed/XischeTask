package com.mahmoud_ashraf.xischetask.di

import com.mahmoud_ashraf.list.presentation.view.UniversitiesListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
@Module
abstract class FragmentBuildersModule {
  @ContributesAndroidInjector
  abstract fun contributeUniversitiesListFragment(): UniversitiesListFragment
}