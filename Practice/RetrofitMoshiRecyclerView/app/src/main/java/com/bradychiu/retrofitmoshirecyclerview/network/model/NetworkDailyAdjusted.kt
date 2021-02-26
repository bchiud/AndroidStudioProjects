package com.bradychiu.stonks.network.model.DailyAdjusted

import android.os.Build
import androidx.annotation.RequiresApi
import com.bradychiu.retrofitmoshirecyclerview.domain.model.DailyAdjusted
import com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.time.LocalDate
import java.time.format.DateTimeFormatter


@JsonClass(generateAdapter = true)
data class NetworkDailyAdjusted(
    @Json(name = "Meta Data") val metaData: NetworkMetadata,
    @Json(name = "Time Series (Daily)") val timeSeries: Map<String, NetworkStockPrice>,
)

@RequiresApi(Build.VERSION_CODES.O)
fun NetworkDailyAdjusted.asDomainModel(): DailyAdjusted {
    return DailyAdjusted(
        symbol = metaData.symbol,
        stockPrices = timeSeries.map {
            StockPrice(
                date = LocalDate.parse(it.key, DateTimeFormatter.ISO_DATE),
                open = it.value.open,
                high = it.value.high,
                low = it.value.low,
                close = it.value.close,
                adjustedClose = it.value.adjustedClose,
                volume = it.value.volume,
                dividendAmount = it.value.dividendAmount,
                splitCoefficient = it.value.splitCoefficient
            )
        }
    )
}