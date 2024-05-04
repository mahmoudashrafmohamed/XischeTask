package com.mahmoud_ashraf.list.data.mappers

import com.mahmoud_ashraf.core.enitiy.University
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalEntity
import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */

fun List<GetUniversitiesResponseItem>.remoteToDomainEntity(): List<University> {
  return map {
    University(
      alphaTwoCode = it.alphaTwoCode,
      name = it.name,
      country = it.country,
      webPage = it.webPages?.firstOrNull(),
      stateProvince = it.stateProvince
    )
  }
}

fun List<UniversityLocalEntity>.localToDomainEntity(): List<University> {
  return map {
    University(
      alphaTwoCode = it.alphaTwoCode,
      name = it.name,
      country = it.country,
      webPage = it.webPage,
      stateProvince = it.stateProvince
    )
  }
}