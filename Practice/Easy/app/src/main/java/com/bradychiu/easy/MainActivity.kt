package com.bradychiu.easy

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.bradychiu.easy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // setup viewmodel
    private val viewModel: CountViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setup binding
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        // setup jetpack navigation
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        // setup navigation drawer
        setupWithNavController(binding.navView, navController)
        drawerLayout = binding.drawerLayout
        setupActionBarWithNavController(this, navController, drawerLayout)

        // observe clicks to update click count
        viewModel.clicks.observe(this, Observer {
            newClicks -> binding.tvCount.text = newClicks.toString()
        })

    }

    override fun onSupportNavigateUp(): Boolean {
        // return NavigationUI.navigateUp instead of returning navController.navigateUp
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}