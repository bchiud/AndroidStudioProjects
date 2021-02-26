package com.bradychiu.stonks.timeseries

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TimeSeriesViewModelFactory(
    private val symbol: String
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TimeSeriesViewModel::class.java)) {
            return TimeSeriesViewModel(symbol) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}