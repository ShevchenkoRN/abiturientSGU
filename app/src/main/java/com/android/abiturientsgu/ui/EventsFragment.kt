package com.android.abiturientsgu.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.android.abiturientsgu.R
import com.android.abiturientsgu.data.events.EventsRepoImpl
import com.android.abiturientsgu.presentation.viewmodels.EventsViewModel
import kotlinx.android.synthetic.main.fragment_events.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class EventsFragment : Fragment() {

    private val viewModel by viewModel<EventsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_events, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.eventResult.observe(viewLifecycleOwner){
            var s = ""
            it?.forEach { event->
                s+=event.eventName+"\n"
            }
            textView.text = s

            if(it.isNullOrEmpty()){
                textView.text = "Нет данных"
            }

        }

    }

}