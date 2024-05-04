package com.mahmoud_ashraf.xischetask

import com.mahmoud_ashraf.xischetask.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
class AppController : DaggerApplication() {

  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    return DaggerAppComponent.builder()
      .application(this)
      .build()
      .apply {
        inject(this@AppController)
      }

  }


}

