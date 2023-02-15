package com.android.abiturientsgu.data.profile.remote

import com.google.gson.annotations.SerializedName

data class ProfileDto(

    val login:String,

    val pass:String,

    @SerializedName("fam")
    val lastname:String,

    @SerializedName("im")
    val name:String,

    @SerializedName("otch")
    val patronymic: String,

    val school:String,

    val classs:String,

    val tel:String,

    val themes:String
)