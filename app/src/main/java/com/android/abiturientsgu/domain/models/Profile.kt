package com.android.abiturientsgu.domain.models

import com.google.gson.annotations.SerializedName

data class Profile(
    val login:String,
    val lastname:String?,
    val name:String?,
    val patronymic: String?,
    val school:String?,
    val classs:String?,
    val tel:String?,
    val themes:List<String>?
)