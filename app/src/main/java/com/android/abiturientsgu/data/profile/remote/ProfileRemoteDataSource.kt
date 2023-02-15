package com.android.abiturientsgu.data.profile.remote

import com.android.abiturientsgu.data.core.network.RetrofitServices
import com.android.abiturientsgu.data.profile.toProfile
import com.android.abiturientsgu.domain.models.Profile

interface ProfileRemoteDataSource {
    suspend fun getProfile(login: String): Result<Profile>
}

class ProfileRemoteDataSourceImpl(private val rService: RetrofitServices) :
    ProfileRemoteDataSource {

    override suspend fun getProfile(login: String): Result<Profile> =
        try {
            Result.success(rService.GetProfileInfo(login).toProfile())
        } catch (e: Exception) {
            Result.failure(e)
        }

}