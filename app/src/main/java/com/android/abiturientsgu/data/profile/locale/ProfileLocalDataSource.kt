package com.android.abiturientsgu.data.profile.locale

import android.util.Log
import kotlinx.coroutines.flow.Flow

interface ProfileLocalDataSource {

    fun getProfileInfo(login:String): Flow <ProfileEntity>
    suspend fun insertProfileInfo(profile:ProfileEntity)

}

class ProfileLocalDataSourceImpl(private val profileDao: ProfileDao ):ProfileLocalDataSource{

    override fun getProfileInfo(login:String): Flow<ProfileEntity> = profileDao.getByLogin(login)

    override suspend fun insertProfileInfo(profile:ProfileEntity){
        Log.d("OLOLO", "insertProfileInfo")
        profileDao.insert(profile)
    }



}