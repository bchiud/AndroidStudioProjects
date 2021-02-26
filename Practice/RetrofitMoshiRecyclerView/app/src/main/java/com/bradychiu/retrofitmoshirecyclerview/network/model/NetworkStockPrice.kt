package com.bradychiu.stonks.network.model.DailyAdjusted

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NetworkStockPrice(
    @Json(name = "1. open") val open: Double,
    @Json(name = "2. high") val high: Double,
    @Json(name = "3. low") val low: Double,
    @Json(name = "4. close") val close: Double,
    @Json(name = "5. adjusted close") val adjustedClose: Double,
    @Json(name = "6. volume") val volume: Long,
    @Json(name = "7. dividend amount") val dividendAmount: Double,
    @Json(name = "8. split coefficient") val splitCoefficient: Double,
)
