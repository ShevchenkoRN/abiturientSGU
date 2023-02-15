package com.android.abiturientsgu.data.profile


import com.android.abiturientsgu.data.profile.locale.ProfileLocalDataSource
import com.android.abiturientsgu.data.profile.remote.ProfileRemoteDataSource
import com.android.abiturientsgu.domain.models.Profile
import com.android.abiturientsgu.domain.repository.ProfileRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ProfileRepoImpl(
    private val remoteDataSource: ProfileRemoteDataSource,
    private val localDataSource: ProfileLocalDataSource
) : ProfileRepo {

    override suspend fun fetchProfile(login: String): Flow<Profile> {
        CoroutineScope(Dispatchers.IO).launch {
            getProfileFromApiAndStore(login)
        }
        return observeProfileFromDB(login)
    }

    private suspend fun getProfileFromApiAndStore(login: String) {
        val profile = remoteDataSource.getProfile(login)
        if (profile.isSuccess) {
            if(profile.getOrNull() !=null){
                withContext(Dispatchers.IO) {
                    localDataSource.insertProfileInfo(profile.getOrNull()!!.toProfileEntity())                }
            }
        }
    }
    //загружаем из базы
    private fun observeProfileFromDB(login: String): Flow<Profile> {
        return localDataSource.getProfileInfo(login).map { it.toProfile() }
    }

}
