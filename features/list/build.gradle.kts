plugins {
  alias(libs.plugins.androidLibrary)
  alias(libs.plugins.jetbrains.kotlin.android)
  alias(libs.plugins.kapt)
  alias(libs.plugins.kotlin.parcelize)
}

android {
  namespace = "com.mahmoud_ashraf.list"
  compileSdk = 34

  defaultConfig {
    minSdk = 24
    targetSdk = 34

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
  buildFeatures {
    viewBinding = true
  }
}

dependencies {
  implementation(project(":core"))
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.appcompat)
  implementation(libs.material)
  implementation(libs.retrofit)
  implementation(libs.retrofit.gson.converter)
  implementation(libs.viewmodel.ktx)
  implementation(libs.androidx.fragment.ktx)
  // dagger
  implementation (libs.dagger)
  implementation (libs.dagger.android.support)
  kapt (libs.dagger.compiler)
  kapt (libs.dagger.android.processor)
  implementation (libs.androidx.room.runtime)
  kapt (libs.androidx.room.compiler)

  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)
}