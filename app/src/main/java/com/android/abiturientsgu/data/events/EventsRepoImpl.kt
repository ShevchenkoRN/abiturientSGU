package com.android.abiturientsgu.data.events


import com.android.abiturientsgu.data.events.locale.EventsLocalDataSource
import com.android.abiturientsgu.data.events.remote.EventsRemoteDataSource
import com.android.abiturientsgu.domain.models.Event
import com.android.abiturientsgu.domain.repository.EventsRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class EventsRepoImpl(
    private val remoteDataSource: EventsRemoteDataSource,
    private val localDataSource: EventsLocalDataSource
) : EventsRepo {
    override fun getEvents(): Flow<List<Event>> {

        CoroutineScope(Dispatchers.IO).launch {
            getEventsFromApiAndStore()
        }
        return  observeEventsFromDB()
    }

    private suspend fun getEventsFromApiAndStore() {
        val events = remoteDataSource.getAllEvents()
        if (events.isSuccess) {
            if(events.getOrNull() !=null){
                localDataSource.deleteAll()
                localDataSource.insertAll(events.getOrNull()!!.map{ it.toEventEntity() })
            }
        }
    }

    //загружаем из базы
    private fun observeEventsFromDB(): Flow<List<Event>> {
        return localDataSource.getAll().map { it.map { it1->it1.toEvent() } }
    }


    //////
    /* override suspend fun createRecordEvent(login: String, eventId: Int): Result<String> =
         try {
             Result.success(rService.PostRecord(login, eventId))
         } catch (e: Exception) {
             Result.failure(e)
         }

     override suspend fun cancelRecordEvent(login: String, eventId: Int): Result<String> =
         try {
             Result.success(rService.CancelRecord(login, eventId))
         } catch (e: Exception) {
             Result.failure(e)
         }

     override suspend fun fetchEvents(): Result<List<Event>> =
         try {
             Result.success(rService.GetEvents().map { it.toEvent() })
         } catch (e: Exception) {
             Result.failure(e)
         }

     override suspend fun fetchEventsByDate(date: String): Result<List<Event>> =
         try {
             Result.success(rService.GetEventsByDate(date).map { it.toEvent() })
         } catch (e: Exception) {
             Result.failure(e)
         }

     override suspend fun fetchEventsByThemes(
         login: String,
         themes: String,
         offset: String
     ): Result<List<Event>> =
         try {
             Result.success(rService.GetEventsByThemes(login, themes, offset).map { it.toEvent() })
         } catch (e: Exception) {
             Result.failure(e)
         }

     override suspend fun postReview(login: String, eventId: Int, text: String): Result<String> =
         try {
             Result.success(rService.PostReview(login, eventId, text))
         } catch (e: Exception) {
             Result.failure(e)
         }*/
}
