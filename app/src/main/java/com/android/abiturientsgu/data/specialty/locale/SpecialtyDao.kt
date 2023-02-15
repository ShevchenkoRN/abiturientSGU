package com.android.abiturientsgu.data.specialty.locale

import androidx.room.*
import com.android.abiturientsgu.data.events.locale.EventEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface SpecialtyDao {
    @Query("SELECT * FROM ${SpecialtyEntity.TABLE_NAME} WHERE ${SpecialtyEntity.ID}=:id LIMIT 1 ")
      fun getSpecialtyById(id: Int): Flow<SpecialtyEntity>

    @Query(" SELECT *  FROM ${SpecialtyEntity.TABLE_NAME}")
    fun getAllSpecialties(): Flow<List<SpecialtyEntity>>


    @Transaction
    @Insert(onConflict = OnConflictStrategy.IGNORE)
      fun insertAll(searchedMovies: List<SpecialtyEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
      fun insert(movie: SpecialtyEntity)

    @Transaction
    @Query("DELETE FROM ${SpecialtyEntity.TABLE_NAME}")
      fun deleteAll():Int
}