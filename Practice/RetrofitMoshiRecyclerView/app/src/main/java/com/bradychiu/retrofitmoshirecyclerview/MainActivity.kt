package com.bradychiu.retrofitmoshirecyclerview

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bradychiu.retrofitmoshirecyclerview.databinding.ActivityMainBinding
import com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice
import java.time.LocalDate

class MainActivity : AppCompatActivity() {

    private val viewModel: ViewModel by lazy {
        ViewModelProvider(this).get(ViewModel::class.java)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main)
        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        // binding.rvMain.adapter = StockPriceAdapter(listOf<StockPrice>(
        //         StockPrice(
        //                 date = LocalDate.parse("2020-01-01"),
        //                 open = 20.00,
        //                 high = 20.00,
        //                 low = 20.00,
        //                 close = 20.00,
        //                 adjustedClose = 20.00,
        //                 volume = 20,
        //                 dividendAmount = 0.0,
        //                 splitCoefficient = 0.0
        //                 ),
        //         StockPrice(
        //                 date = LocalDate.parse("2020-02-01"),
        //                 open = 21.00,
        //                 high = 21.00,
        //                 low = 21.00,
        //                 close = 21.00,
        //                 adjustedClose = 21.00,
        //                 volume = 21,
        //                 dividendAmount = 0.0,
        //                 splitCoefficient = 0.0
        //         ),
        //         StockPrice(
        //                 date = LocalDate.parse("2020-03-01"),
        //                 open = 22.00,
        //                 high = 22.00,
        //                 low = 22.00,
        //                 close = 22.00,
        //                 adjustedClose = 22.00,
        //                 volume = 22,
        //                 dividendAmount = 0.0,
        //                 splitCoefficient = 0.0
        //         )
        // ))

        val adapter = StockPriceAdapter()
        binding.rvMain.adapter = adapter
        viewModel.stockPrices.observe(this, Observer {
            it?.let {
                adapter.stockPrices = it
            }
        })

    }
}