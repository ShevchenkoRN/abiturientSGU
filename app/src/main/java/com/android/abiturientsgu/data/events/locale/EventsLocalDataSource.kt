package com.android.abiturientsgu.data.events.locale

import kotlinx.coroutines.flow.Flow

interface EventsLocalDataSource {
  //  suspend fun getByLogin(id: Int): EventEntity?
    fun getAll(): Flow<List<EventEntity>>
    suspend fun insertAll(events: List<EventEntity>)
    suspend fun deleteAll()
    // suspend fun insert(event: EventEntity)

}

class EventsLocalDataSourceImpl(private val eventDao: EventDao):EventsLocalDataSource{


    override fun getAll(): Flow<List<EventEntity>> = eventDao.getAll()

    override suspend fun insertAll(events: List<EventEntity>) {
        eventDao.insertAll(events)
    }

    override suspend fun deleteAll() {
       eventDao.deleteAll()
    }



}