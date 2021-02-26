package com.bradychiu.stonks.network.model.DailyAdjusted

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Metadata(
    @Json(name = "1. Information") val information: String,
    @Json(name = "2. Symbol") val symbol: String,
    @Json(name = "3. Last Refreshed") val lastRefreshed: String,
    @Json(name = "4. Output Size") val outputSize: String,
    @Json(name = "5. Time Zone") val timeZone: String,
) {

}