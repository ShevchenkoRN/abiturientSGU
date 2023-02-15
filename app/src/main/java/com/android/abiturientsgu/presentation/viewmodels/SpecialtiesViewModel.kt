package com.android.abiturientsgu.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.*
import com.android.abiturientsgu.data.events.EventsRepoImpl
import com.android.abiturientsgu.data.profile.ProfileRepoImpl
import com.android.abiturientsgu.domain.models.Event
import com.android.abiturientsgu.domain.models.Specialty
import com.android.abiturientsgu.domain.repository.EventsRepo
import com.android.abiturientsgu.domain.repository.SpecialtiesRepo

import kotlinx.coroutines.launch

class SpecialtiesViewModel(private var repository: SpecialtiesRepo) : ViewModel() {
    init {
        Log.d("OLOLO","SpecialtiesViewModel created")
    }

    var specialtyResult : LiveData<List<Specialty>> = liveData{}


    init{
        getSpecialties()
    }

    private fun getSpecialties() {
        viewModelScope.launch {
            specialtyResult  =  repository.fetchSpecialties().asLiveData()


        }
    }
}
