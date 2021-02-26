package com.bradychiu.retrofitmoshirecyclerview.domain.model

import java.time.LocalDate

data class StockPrice(
    val date: LocalDate,
    val open: Double,
    val high: Double,
    val low: Double,
    val close: Double,
    val adjustedClose: Double,
    val volume: Long,
    val dividendAmount: Double,
    val splitCoefficient: Double,
)
