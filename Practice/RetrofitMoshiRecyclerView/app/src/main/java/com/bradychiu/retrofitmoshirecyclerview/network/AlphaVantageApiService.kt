package com.bradychiu.retrofitmoshirecyclerview.network

import com.bradychiu.retrofitmoshirecyclerview.BuildConfig
import com.bradychiu.stonks.network.model.DailyAdjusted.NetworkDailyAdjusted
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://www.alphavantage.co/"
private const val DAILY_ADJUSTED = "TIME_SERIES_DAILY_ADJUSTED"

private const val PARAM_API_KEY = "apikey"
private const val PARAM_FUNCTION = "function"
private const val PARAM_SYMBOL = "symbol"

private val okHttpClient = OkHttpClient.Builder().addInterceptor { chain ->
    val original = chain.request()

    val url = original.url().newBuilder()
        .addQueryParameter(PARAM_API_KEY, BuildConfig.API_KEY)
        .build()

    val request = original.newBuilder().url(url).build()
    chain.proceed(request)
}.build()

private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .client(okHttpClient)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

interface AlphaVantageApiService {
    @GET("query?${PARAM_FUNCTION}=${DAILY_ADJUSTED}")
    suspend fun getNetworkDailyAdjusted(
        @Query(PARAM_SYMBOL) ticker: String
    ): NetworkDailyAdjusted
}

object AlphaVantageApi {
    val retrofitService: AlphaVantageApiService by lazy {
        retrofit.create(AlphaVantageApiService::class.java)
    }
}