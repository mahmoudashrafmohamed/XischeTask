package com.mahmoud_ashraf.list.data.repository.contracts

import com.mahmoud_ashraf.core.data.GetUniversitiesResponseItem

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
interface IUniversitiesRepository {
  suspend fun getUniversities(): List<GetUniversitiesResponseItem>
}