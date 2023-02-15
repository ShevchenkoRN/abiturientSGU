package com.android.abiturientsgu.data.specialty.remote

import com.google.gson.annotations.SerializedName

data class SpecialtyDto(
    val id:Int,
    @SerializedName("spec")
    val specialty:String,

    val code:String,

    @SerializedName("form_educ")
    val form:String,

    @SerializedName("years_educ")
    val years:String,

    @SerializedName("descr")
    val description:String,

    @SerializedName("discs")
    val subjects :String,

    val exams:String,

    val spheres:String,

    @SerializedName("proffs")
    val professions:String,

)