package com.mahmoud_ashraf.xischetask.di

import com.mahmoud_ashraf.xischetask.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */

@Module
abstract class MainActivityModule {
  @ContributesAndroidInjector
  abstract fun bindMainActivity(): MainActivity
}