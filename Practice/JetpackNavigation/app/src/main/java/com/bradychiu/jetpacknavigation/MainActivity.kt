package com.bradychiu.jetpacknavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.bradychiu.jetpacknavigation.databinding.ActivityMainBinding

const val CONTENT_REPEAT_AMOUNT = 30

class MainActivity : AppCompatActivity() {

    /**
     * binding:
     * https://developer.android.com/topic/libraries/view-binding
     * 1) binding = ActivityMainBinding.inflate(layoutInflater)
     * 2) setContentView(binding.root)
     *
     * jetpack navigation:
     * https://developer.android.com/guide/navigation/navigation-getting-started
     * 1) nav_graph.xml navigation res; spec args
     * 2) nav_host FragmentContainerView
     * 3) nav_controller
     * 4) enable back button
     */

    companion object {
        const val NAV_SOURCE: String = "nav_source"
    }

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // binding 1) + 2)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // jetpack navigation 3)
       val navHostFragment =
           supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
       navController = navHostFragment.navController
       setupActionBarWithNavController(navController)
    }

   // jetpack navigation 4)
   override fun onSupportNavigateUp(): Boolean {
       return navController.navigateUp() || super.onSupportNavigateUp()
   }
}