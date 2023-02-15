package com.android.abiturientsgu.data.profile.locale

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface ProfileDao {
    @Query(" SELECT *  FROM ${ProfileEntity.TABLE_NAME} WHERE ${ProfileEntity.LOGIN}=:login  LIMIT 1")
      fun getByLogin(login: String): Flow<ProfileEntity>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
      fun insert(profile: ProfileEntity)

    @Transaction
    @Query("DELETE FROM ${ProfileEntity.TABLE_NAME}")
      fun deleteAll()
}