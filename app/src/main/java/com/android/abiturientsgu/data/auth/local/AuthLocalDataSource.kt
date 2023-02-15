package com.android.abiturientsgu.data.auth.local

import com.android.abiturientsgu.domain.models.User
import kotlinx.coroutines.flow.Flow

interface AuthLocalDataSource {

    var currentUser: User?

    fun observeCurrentUser(): Flow<User?>
}

fun AuthLocalDataSource.logOut() {
    this.currentUser = null
}