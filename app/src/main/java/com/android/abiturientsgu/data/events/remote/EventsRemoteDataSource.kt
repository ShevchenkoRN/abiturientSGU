package com.android.abiturientsgu.data.events.remote

import com.android.abiturientsgu.data.core.network.RetrofitServices
import com.android.abiturientsgu.data.events.toEvent

import com.android.abiturientsgu.domain.models.Event

interface EventsRemoteDataSource {
    suspend  fun getAllEvents():Result<List<Event>>
}

class EventsRemoteDataSourceImpl(private val rService: RetrofitServices):EventsRemoteDataSource{
    override suspend fun getAllEvents(): Result<List<Event>> =
        try {
            Result.success(rService.GetEvents().map { it.toEvent() })
        } catch (e: Exception) {
            Result.failure(e)
        }

}