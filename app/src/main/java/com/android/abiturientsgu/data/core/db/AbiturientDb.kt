package com.android.abiturientsgu.data.core.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.abiturientsgu.data.events.locale.EventDao
import com.android.abiturientsgu.data.events.locale.EventEntity
import com.android.abiturientsgu.data.profile.locale.ProfileDao
import com.android.abiturientsgu.data.profile.locale.ProfileEntity
import com.android.abiturientsgu.data.specialty.locale.SpecialtyDao
import com.android.abiturientsgu.data.specialty.locale.SpecialtyEntity


@Database(
    version = 1, entities = [
        EventEntity::class,
        ProfileEntity::class,
        SpecialtyEntity::class,
    ]
)
abstract class AbiturienDb:RoomDatabase() {
    abstract fun eventDao(): EventDao
    abstract fun profileDao(): ProfileDao
    abstract fun specialtyDao(): SpecialtyDao




}