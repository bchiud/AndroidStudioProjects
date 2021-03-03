-if class com.bradychiu.stonks.network.model.DailyAdjusted.NetworkStockPrice
-keepnames class com.bradychiu.stonks.network.model.DailyAdjusted.NetworkStockPrice
-if class com.bradychiu.stonks.network.model.DailyAdjusted.NetworkStockPrice
-keep class com.bradychiu.stonks.network.model.DailyAdjusted.NetworkStockPriceJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
