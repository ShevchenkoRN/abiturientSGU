package com.android.abiturientsgu.domain.repository

import com.android.abiturientsgu.domain.models.Profile
import kotlinx.coroutines.flow.Flow

interface ProfileRepo {
   // suspend fun registerNewUser(profile: Profile,pass: String):Result<String>
 //    suspend fun login(login:String, pass:String):Result<String>


    suspend fun fetchProfile(login:String): Flow<Profile>

  /*  suspend fun updateProfile(profile: Profile):Result<String>
    suspend fun updatePass(login:String,oldPass:String,newPass:String):Result<String>
    suspend fun  updateInterests(login:String,themes:String):Result<String>*/



}