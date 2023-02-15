package com.android.abiturientsgu.data.auth.remote

import com.android.abiturientsgu.domain.models.User


class AuthRemoteDataSourceImpl() : AuthRemoteDataSource {

    override val user: User?=null
    override suspend fun createNewUser(login: String, password: User.Password): Result<String> {
        TODO("Not yet implemented")
    }

    override suspend fun logIn(login: String, password: User.Password): Result<String> {
        TODO("Not yet implemented")
    }

    override suspend fun logOut() {
        TODO("Not yet implemented")
    }
}


