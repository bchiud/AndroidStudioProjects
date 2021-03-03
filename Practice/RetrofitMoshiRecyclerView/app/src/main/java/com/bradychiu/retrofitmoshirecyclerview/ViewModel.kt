package com.bradychiu.retrofitmoshirecyclerview

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bradychiu.retrofitmoshirecyclerview.domain.model.DailyAdjusted
import com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice
import com.bradychiu.retrofitmoshirecyclerview.network.AlphaVantageApi
import com.bradychiu.stonks.network.model.DailyAdjusted.asDomainModel
import kotlinx.coroutines.launch

@RequiresApi(Build.VERSION_CODES.O)
class ViewModel : ViewModel() {

    companion object {
        private val TAG = com.bradychiu.retrofitmoshirecyclerview.ViewModel::class.simpleName
    }

    private val _dailyAdjusted = MutableLiveData<DailyAdjusted>()

    private val _symbol = MutableLiveData<String>()
    val symbol: LiveData<String>
        get() = _symbol

    private val _stockPrices = MutableLiveData<List<StockPrice>>()
    val stockPrices: LiveData<List<StockPrice>>
        get() = _stockPrices

    init {
        getStockData("UBER")
    }

    fun getStockData(querySymbol: String) {
        viewModelScope.launch {
            try {
                _dailyAdjusted.value =
                        AlphaVantageApi.retrofitService.getNetworkDailyAdjusted(querySymbol)
                                .asDomainModel()
                Log.i(
                        TAG, "Success: $${_dailyAdjusted.value!!.symbol} retrieved " +
                        "with ${_dailyAdjusted.value!!.stockPrices.size} days"
                )
                updateUIProperties()
            } catch (e: Exception) {
                Log.e(TAG, "Failure: ${e.message}")
            }
        }
    }


    private fun updateUIProperties() {
        _symbol.value = _dailyAdjusted.value!!.symbol
        _stockPrices.value = _dailyAdjusted.value!!.stockPrices.sortedByDescending {
            it.date
        }
    }
}