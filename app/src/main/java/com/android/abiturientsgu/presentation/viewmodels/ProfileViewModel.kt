package com.android.abiturientsgu.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.android.abiturientsgu.domain.models.Profile
import com.android.abiturientsgu.domain.repository.ProfileRepo
import kotlinx.coroutines.launch

class ProfileViewModel(private var repository: ProfileRepo) : ViewModel() {
    init {
        Log.d("OLOLO","ProfileViewModel created")
    }
    var profileResult = liveData<Profile> {}

    fun getProfile(login:String) {
        viewModelScope.launch {
            profileResult = repository.fetchProfile(login).asLiveData()
        }
    }
}
