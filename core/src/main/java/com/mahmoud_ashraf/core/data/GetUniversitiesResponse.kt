package com.mahmoud_ashraf.core.data
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
@Parcelize
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
) : Parcelable