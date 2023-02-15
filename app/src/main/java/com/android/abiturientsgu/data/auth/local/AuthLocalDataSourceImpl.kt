package com.android.abiturientsgu.data.auth.local


import com.android.abiturientsgu.domain.models.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow


class AuthLocalDataSourceImpl()   : AuthLocalDataSource {

    private val userFlow: MutableStateFlow<User?> = MutableStateFlow(null)

    override var currentUser: User?
        get() = userFlow.value
        set(newValue) {
            userFlow.value = newValue
        }

    override fun observeCurrentUser(): Flow<User?> = userFlow
}
