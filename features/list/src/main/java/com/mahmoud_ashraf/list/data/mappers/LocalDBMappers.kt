package com.mahmoud_ashraf.list.data.mappers

import com.mahmoud_ashraf.list.data.local.model.UniversityLocalEntity
import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
fun  List<GetUniversitiesResponseItem>.toLocalEntity(): List<UniversityLocalEntity> {
  return map {
    UniversityLocalEntity(
      alphaTwoCode = it.alphaTwoCode.orEmpty(),
      name = it.name.orEmpty(),
      country = it.country.orEmpty() ,
      stateProvince = it.stateProvince.orEmpty(),
       webPage = it.webPages?.firstOrNull().orEmpty()
    )
  }
}