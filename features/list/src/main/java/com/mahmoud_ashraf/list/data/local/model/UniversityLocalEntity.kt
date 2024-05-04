package com.mahmoud_ashraf.list.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalDataSourcesKeys.ALPHA_2_CODES
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalDataSourcesKeys.COUNTRY
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalDataSourcesKeys.NAME
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalDataSourcesKeys.STATE
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalDataSourcesKeys.UNIVERSITIES_TABLE
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalDataSourcesKeys.WEB_PAGE


/**
 * Created by Mahmoud Ashraf on 04,May,2024
 */
@Entity(tableName = UNIVERSITIES_TABLE)
data class UniversityLocalEntity(
  @ColumnInfo(ALPHA_2_CODES) val alphaTwoCode: String,
  @ColumnInfo(NAME) val name: String,
  @ColumnInfo(COUNTRY) val country: String,
  @ColumnInfo(WEB_PAGE) val webPage: String,
  @ColumnInfo(STATE) val stateProvince: String,
  @PrimaryKey(autoGenerate = true) val id: Int? = null,
)