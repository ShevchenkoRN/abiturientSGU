package com.android.abiturientsgu.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.abiturientsgu.R
import com.android.abiturientsgu.presentation.viewmodels.EventsViewModel
import com.android.abiturientsgu.presentation.viewmodels.SpecialtiesViewModel
import kotlinx.android.synthetic.main.fragment_events.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class SpecialtyFragment : Fragment() {
    private val viewModel by viewModel<SpecialtiesViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specialty, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.specialtyResult.observe(viewLifecycleOwner){
            var s = ""
            it?.forEach { spec->
                s+=spec.specialty +"\n"
            }
            textView.text = s

            if(it.isNullOrEmpty()){
                textView.text = "Нет данных"
            }
        }
    }


}