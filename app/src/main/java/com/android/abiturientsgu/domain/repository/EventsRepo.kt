package com.android.abiturientsgu.domain.repository

import com.android.abiturientsgu.domain.models.Event
import com.android.abiturientsgu.domain.models.Profile
import kotlinx.coroutines.flow.Flow

interface EventsRepo {
    fun getEvents(): Flow<List<Event>>

   /* suspend fun createRecordEvent(login: String,eventId: Int):Result<String>
    suspend fun cancelRecordEvent(login: String,eventId: Int):Result<String>
    suspend fun fetchEvents():Result<List<Event>>
    suspend fun fetchEventsByDate(date: String):Result<List<Event>>
    suspend fun fetchEventsByThemes(login:String,themes:String,offset:String):Result<List<Event>>
    suspend fun postReview(login: String,eventId: Int,text:String):Result<String>*/




}