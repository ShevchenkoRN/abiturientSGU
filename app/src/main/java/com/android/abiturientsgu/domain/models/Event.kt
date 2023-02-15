package com.android.abiturientsgu.domain.models


data class Event(
    val id:Int,
    val eventName:String,
    val date:String,
    val themes:List<String>,
    val place:String,
    val annotation: String,
    val status:String,
    val record:Boolean,
    val review:Boolean

)