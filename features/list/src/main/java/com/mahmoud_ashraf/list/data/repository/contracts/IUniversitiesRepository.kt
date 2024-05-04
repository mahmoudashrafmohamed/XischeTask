package com.mahmoud_ashraf.list.data.repository.contracts

import com.mahmoud_ashraf.core.enitiy.University
import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
interface IUniversitiesRepository {
  suspend fun getUniversities(): List<University>
}