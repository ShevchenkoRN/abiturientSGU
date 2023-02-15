package com.android.abiturientsgu.data.events.remote

import com.google.gson.annotations.SerializedName

data class EventDto(
    val id:Int,

    @SerializedName("event_name")
    val eventName:String,

    @SerializedName("datee")
    val date:String,

    val themes:String,
    val place:String,
    val annotation: String,
    val status:String,
    val record:Boolean,
    val review:Boolean
)