package com.bradychiu.stonks.network.model.DailyAdjusted

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DailyAdjusted(
        @Json(name = "Meta Data") val metaData: Metadata,
        @Json(name = "Time Series (Daily)") val timeSeries: Map<String, StockPrice>,
)
