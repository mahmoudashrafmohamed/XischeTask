package com.mahmoud_ashraf.list.data.remote.model
import com.google.gson.annotations.SerializedName


/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */

data class GetUniversitiesResponseItem(
    @SerializedName("alpha_two_code")
    val alphaTwoCode: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("domains")
    val domains: List<String>?,
    @SerializedName("web_pages")
    val webPages: List<String>?,
    @SerializedName("state-province")
    val stateProvince: String?
)