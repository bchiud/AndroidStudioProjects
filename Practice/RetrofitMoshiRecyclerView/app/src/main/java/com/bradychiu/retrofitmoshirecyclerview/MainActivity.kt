package com.bradychiu.retrofitmoshirecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.bradychiu.retrofitmoshirecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: ViewModel by lazy {
        ViewModelProvider(this).get(ViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main)
        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        binding.rvMain.adapter = StockPriceAdapter()
    }
}