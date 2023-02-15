package com.android.abiturientsgu.data.auth.remote

import com.android.abiturientsgu.domain.models.User


interface AuthRemoteDataSource {

    val user: User?

    suspend fun createNewUser(
        login: String,
        password: User.Password,
    ): Result<String>

    suspend fun logIn(
        login: String,
        password: User.Password,
    ): Result<String>

    suspend fun logOut()
}
