package com.mahmoud_ashraf.xischetask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mahmoud_ashraf.core.androidExtensions.fragmentContainerId
import com.mahmoud_ashraf.core.androidExtensions.replaceFragment
import com.mahmoud_ashraf.core.navigator.Fragments
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    fragmentContainerId = R.id.fl_app_screens
    (this@MainActivity as AppCompatActivity).replaceFragment(Fragments.UniversitiesListFragment)
  }
}