package com.bradychiu.stonks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.bradychiu.stonks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        // navController = this.findNavController(R.id.nav_host_fragment)
        // setupWithNavController(binding.navView, navController)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
`
        // val tv = this.findViewById<TextView>(R.id.tv_home)
        // AlphaVantageApi.retrofitService.getDailyAdjusted("IBM").enqueue(
        //         object: Callback<DailyAdjusted> {
        //             override fun onResponse(call: Call<DailyAdjusted>, response: Response<DailyAdjusted>) {
        //                tv.text = response.body().toString()
        //             }
        //
        //             override fun onFailure(call: Call<DailyAdjusted>, t: Throwable) {
        //                 tv.text = "Failure: " + t.message
        //             }
        //         })

    }
}