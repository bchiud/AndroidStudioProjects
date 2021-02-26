package com.bradychiu.stonks.stocklist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bradychiu.stonks.network.model.DailyAdjusted.DailyAdjusted

class StockListViewModel : ViewModel() {

    private val _stockList = MutableLiveData<List<StockListItem>>()
    val stockList: LiveData<List<StockListItem>>
        get() = _stockList

    private val _dailyAdjusted = MutableLiveData<DailyAdjusted>()
    val dailyAdjusted: LiveData<DailyAdjusted>
        get() = _dailyAdjusted

    init {
        refreshStockListFromDatabase()
    }

    fun getStockDailyAdjusted() {

    }

    fun refreshStockListFromDatabase() {
        if (_stockList.value.isNullOrEmpty()) {
            _stockList.value = listOf<StockListItem>(
                StockListItem("AMC", 1.00),
                StockListItem("GME", 2.00),
                StockListItem("Uber", 3.00)
            )
        }
    }
}