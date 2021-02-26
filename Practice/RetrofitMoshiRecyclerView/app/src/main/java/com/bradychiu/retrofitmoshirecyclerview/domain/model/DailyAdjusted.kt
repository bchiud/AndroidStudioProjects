package com.bradychiu.retrofitmoshirecyclerview.domain.model

data class DailyAdjusted(
    val symbol: String,
    val stockPrices: List<StockPrice>
) {

    override fun toString(): String {
        return "asdf"
    }
}