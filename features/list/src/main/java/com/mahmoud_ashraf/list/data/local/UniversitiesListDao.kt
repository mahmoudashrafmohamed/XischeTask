package com.mahmoud_ashraf.list.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mahmoud_ashraf.list.data.local.model.UniversityLocalEntity

@Dao
interface UniversitiesListDao {
  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insert(universities: List<UniversityLocalEntity>)

  @Query("DELETE FROM universities")
  fun clearAll()

  @Query("SELECT * FROM universities")
  fun getUniversities(): List<UniversityLocalEntity>
}