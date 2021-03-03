// Code generated by moshi-kotlin-codegen. Do not edit.
package com.bradychiu.stonks.network.model.DailyAdjusted

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION", "RedundantExplicitType",
    "LocalVariableName")
class NetworkDailyAdjustedJsonAdapter(
  moshi: Moshi
) : JsonAdapter<NetworkDailyAdjusted>() {
  private val options: JsonReader.Options = JsonReader.Options.of("Meta Data",
      "Time Series (Daily)")

  private val networkMetadataAdapter: JsonAdapter<NetworkMetadata> =
      moshi.adapter(NetworkMetadata::class.java, emptySet(), "metaData")

  private val mapOfStringNetworkStockPriceAdapter: JsonAdapter<Map<String, NetworkStockPrice>> =
      moshi.adapter(Types.newParameterizedType(Map::class.java, String::class.java,
      NetworkStockPrice::class.java), emptySet(), "timeSeries")

  override fun toString(): String = buildString(42) {
      append("GeneratedJsonAdapter(").append("NetworkDailyAdjusted").append(')') }

  override fun fromJson(reader: JsonReader): NetworkDailyAdjusted {
    var metaData: NetworkMetadata? = null
    var timeSeries: Map<String, NetworkStockPrice>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> metaData = networkMetadataAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("metaData", "Meta Data", reader)
        1 -> timeSeries = mapOfStringNetworkStockPriceAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("timeSeries", "Time Series (Daily)", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return NetworkDailyAdjusted(
        metaData = metaData ?: throw Util.missingProperty("metaData", "Meta Data", reader),
        timeSeries = timeSeries ?: throw Util.missingProperty("timeSeries", "Time Series (Daily)",
            reader)
    )
  }

  override fun toJson(writer: JsonWriter, value: NetworkDailyAdjusted?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("Meta Data")
    networkMetadataAdapter.toJson(writer, value.metaData)
    writer.name("Time Series (Daily)")
    mapOfStringNetworkStockPriceAdapter.toJson(writer, value.timeSeries)
    writer.endObject()
  }
}