package com.mahmoud_ashraf.list.data.remote.services

import com.mahmoud_ashraf.list.data.remote.constants.RemoteConstants.COUNTRY_KEY
import com.mahmoud_ashraf.list.data.remote.constants.RemoteConstants.SEARCH_ENDPOINT_PATH
import com.mahmoud_ashraf.list.data.remote.constants.RemoteConstants.UAE
import com.mahmoud_ashraf.list.data.remote.model.GetUniversitiesResponseItem
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
interface UniversityService {
  @GET(SEARCH_ENDPOINT_PATH)
  suspend fun getUniversities(@Query(COUNTRY_KEY) country: String = UAE): List<GetUniversitiesResponseItem>
}