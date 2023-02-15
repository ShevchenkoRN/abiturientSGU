package com.android.abiturientsgu.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.*
import com.android.abiturientsgu.data.events.EventsRepoImpl
import com.android.abiturientsgu.data.profile.ProfileRepoImpl
import com.android.abiturientsgu.domain.models.Event
import com.android.abiturientsgu.domain.repository.EventsRepo

import kotlinx.coroutines.launch

class EventsViewModel(private var repository: EventsRepo) : ViewModel() {
    init {
        Log.d("OLOLO","EventsViewModel created")
    }

  //  private var _eventResult = MutableLiveData<List<Event>>()
    var eventResult : LiveData<List<Event>> = liveData{}


    init{
        getEvents()
    }

    private fun getEvents() {
        viewModelScope.launch {
            eventResult  =  repository.getEvents().asLiveData()

        }
    }
}
