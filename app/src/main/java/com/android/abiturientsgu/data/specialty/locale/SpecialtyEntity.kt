package com.android.abiturientsgu.data.specialty.locale

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.android.abiturientsgu.data.profile.locale.ProfileEntity
import com.android.abiturientsgu.data.profile.locale.ProfileEntity.Companion.LASTNAME

@Entity(tableName = SpecialtyEntity.TABLE_NAME)
data class SpecialtyEntity(
    @PrimaryKey
    @ColumnInfo(name = ID)
    val id:Int,

    @ColumnInfo(name = SPECIALTY)
    val specialty:String,

    @ColumnInfo(name = CODE)
    val code:String,

    @ColumnInfo(name = FORM)
    val form:String,

    @ColumnInfo(name = YEARS)
    val years:String,

    @ColumnInfo(name = DESCRIPTION)
    val description: String,

    @ColumnInfo(name = SUBJECTS)
    val subjects:String,

    @ColumnInfo(name = EXAMS)
    val exams:String,

    @ColumnInfo(name = SPHERES)
    val spheres:String,

    @ColumnInfo(name = PROFESSIONS)
    val professions:String,
) {
    companion object {
        const val TABLE_NAME = "specialty"
        const val ID = "id"
        const val SPECIALTY = "specialty"
        const val CODE = "code"
        const val FORM = "form"
        const val YEARS = "years"
        const val DESCRIPTION = "description"
        const val SUBJECTS = "subjects"
        const val EXAMS = "exams"
        const val SPHERES = "spheres"
        const val PROFESSIONS = "professions"

    }
}