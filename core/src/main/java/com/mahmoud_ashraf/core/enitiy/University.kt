package com.mahmoud_ashraf.core.enitiy

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */

@Parcelize
data class University(
  val alphaTwoCode: String?,
  val name: String?,
  val country: String?,
  val webPage: String?,
  val stateProvince: String?
) : Parcelable