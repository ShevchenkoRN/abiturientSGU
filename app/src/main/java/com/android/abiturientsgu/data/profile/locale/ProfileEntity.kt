package com.android.abiturientsgu.data.profile.locale

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.android.abiturientsgu.data.profile.locale.ProfileEntity.Companion.TABLE_NAME


@Entity(tableName = TABLE_NAME)
data class ProfileEntity(
    @PrimaryKey
    @ColumnInfo(name = LOGIN)
    val login:String,

    @ColumnInfo(name = LASTNAME)
    val lastname:String,

    @ColumnInfo(name = NAME)
    val name:String,

    @ColumnInfo(name = PATRONYMIC)
    val patronymic:String,

    @ColumnInfo(name = SCHOOL)
    val school:String,

    @ColumnInfo(name = CLASSS)
    val classs: String,

    @ColumnInfo(name = TEL)
    val tel:String,

    @ColumnInfo(name = THEMES)
    val themes:String,

) {
    companion object {
        const val TABLE_NAME = "profile"
        const val LOGIN = "login"
        const val LASTNAME = "lastname"
        const val NAME = "name"
        const val PATRONYMIC = "patronymic"
        const val SCHOOL = "school"
        const val CLASSS = "class"
        const val TEL = "tel"
        const val THEMES = "themes"


    }
}


