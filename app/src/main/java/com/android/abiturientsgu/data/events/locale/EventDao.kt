package com.android.abiturientsgu.data.events.locale

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface EventDao {
   /* @Query("""
        SELECT *
        FROM ${EventEntity.TABLE_NAME}
        WHERE ${EventEntity.EVENT_ID}=:id
        LIMIT
        """)
    suspend fun getByLogin(id: Int): EventEntity
*/

   @Query("SELECT * FROM ${EventEntity.TABLE_NAME}")
    fun getAll(): Flow<List<EventEntity>>

    @Transaction
    @Insert(onConflict = OnConflictStrategy.IGNORE)
      fun insertAll(events: List<EventEntity>)

   @Insert(onConflict = OnConflictStrategy.REPLACE)
      fun insert(event: EventEntity)

    @Transaction
    @Query("DELETE FROM ${EventEntity.TABLE_NAME}")
      fun deleteAll():Int
}