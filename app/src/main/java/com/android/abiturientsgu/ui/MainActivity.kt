package com.android.abiturientsgu.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.android.abiturientsgu.R
import com.android.abiturientsgu.presentation.viewmodels.ProfileViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val viewModel by viewModel<ProfileViewModel>()

        runApp()
       /* viewModel.getProfile()
        viewModel.liveData.observe(this){

            runApp()
        }*/

    }

    private fun runApp(){
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, com.android.abiturientsgu.R.id.nav_host_fragment)
        val bottomNavigationView = findViewById<BottomNavigationView>(com.android.abiturientsgu.R.id.bottom_nav)
        setupWithNavController(bottomNavigationView, navController)

        /*val bottomNavigationView =
            findViewById<View>(R.id.bottom_navigation) as BottomNavigationView

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_favorites -> {}
                R.id.action_schedules -> {}
                R.id.action_music -> {}
            }
            false
        }*/

        /*  val appBarConfiguration = AppBarConfiguration(
              setOf(
                  R.id.petFragment, R.id.tasksFragment, R.id.settingsFragment
              )
          )*/
        // setupWithNavController(navController, appBarConfiguration)

    }

    override fun onSupportNavigateUp(): Boolean {

        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}