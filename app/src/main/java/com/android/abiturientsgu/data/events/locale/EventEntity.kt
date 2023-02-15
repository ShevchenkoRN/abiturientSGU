package com.android.abiturientsgu.data.events.locale

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.android.abiturientsgu.data.events.locale.EventEntity.Companion.TABLE_NAME


@Entity(tableName = TABLE_NAME)
data class EventEntity(
    @PrimaryKey
    @ColumnInfo(name = EVENT_ID)
    val id:Int,

    @ColumnInfo(name = EVENT_NAME)
    val eventName:String,

    @ColumnInfo(name = DATE)
    val date:String,

    @ColumnInfo(name = THEMES)
    val themes:String,

    @ColumnInfo(name = PLACE)
    val place:String,

    @ColumnInfo(name = ANNOTATION)
    val annotation: String,

    @ColumnInfo(name = STATUS)
    val status:String,

    @ColumnInfo(name = RECORD)
    val record:Boolean,

    @ColumnInfo(name = REVIEW)
    val review:Boolean
){
    companion object {
        const val TABLE_NAME = "events"
        const val EVENT_ID = "event_id"
        const val EVENT_NAME = "eventName"
        const val DATE = "date"
        const val THEMES = "themes"
        const val PLACE = "place"
        const val ANNOTATION = "annotation"
        const val STATUS = "status"
        const val RECORD = "record"
        const val REVIEW = "review"

    }
}

