package com.android.abiturientsgu.data.auth

import kotlinx.coroutines.flow.Flow
import com.android.abiturientsgu.data.auth.local.AuthLocalDataSource
import com.android.abiturientsgu.data.auth.local.logOut
import com.android.abiturientsgu.data.auth.remote.AuthRemoteDataSource
import com.android.abiturientsgu.data.auth.remote.RegisterError
import com.android.abiturientsgu.domain.models.User


class AuthRepositoryImpl  (
    private val localDataSource: AuthLocalDataSource,
    private val remoteDataSource: AuthRemoteDataSource,
) : AuthRepository {

 /*   init {
        localDataSource.currentUser = remoteDataSource.user
    }

    override val currentUser: User?
        get() = localDataSource.currentUser

    override fun observeCurrentUser(): Flow<User?> =
        localDataSource.observeCurrentUser()

    override suspend fun auth(email: User.Email, password: User.Password): VoidResult<LogInError> =
        when (val registerResult = createNewUser(email, password)) {
            is Result.Success -> registerResult
            is Result.Error -> handleRegisterError(registerResult, email, password)
        }

    override suspend fun logOut() {
        remoteDataSource.logOut()
        localDataSource.logOut()
    }

    private suspend fun createNewUser(
        email: User.Email,
        password: User.Password,
    ): VoidResult<RegisterError> =
        remoteDataSource.createNewUser(email, password)
            .mapSuccess { userId -> saveSuccessAuthResult(userId, email) }

    private suspend fun handleRegisterError(
        registerResult: Result.Error<RegisterError>,
        email: User.Email,
        password: User.Password,
    ): VoidResult<LogInError> = when (registerResult.result) {
        RegisterError.USER_WITH_SUCH_CREDENTIALS_EXISTS -> logIn(email, password)
        RegisterError.UNKNOWN -> Result.Error(LogInError.Unknown)
    }

    private suspend fun logIn(
        email: User.Email,
        password: User.Password,
    ): VoidResult<LogInError> =
        remoteDataSource.logIn(email, password)
            .mapSuccess { userId -> saveSuccessAuthResult(userId, email) }

    private fun saveSuccessAuthResult(
        userId: User.Id,
        email: User.Email,
    ) {
        localDataSource.currentUser = User(userId, email)
    }*/
}
