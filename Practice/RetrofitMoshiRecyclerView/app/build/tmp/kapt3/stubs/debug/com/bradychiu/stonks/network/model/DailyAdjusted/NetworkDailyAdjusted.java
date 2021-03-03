package com.bradychiu.stonks.network.model.DailyAdjusted;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/bradychiu/stonks/network/model/DailyAdjusted/NetworkDailyAdjusted;", "", "metaData", "Lcom/bradychiu/stonks/network/model/DailyAdjusted/NetworkMetadata;", "timeSeries", "", "", "Lcom/bradychiu/stonks/network/model/DailyAdjusted/NetworkStockPrice;", "(Lcom/bradychiu/stonks/network/model/DailyAdjusted/NetworkMetadata;Ljava/util/Map;)V", "getMetaData", "()Lcom/bradychiu/stonks/network/model/DailyAdjusted/NetworkMetadata;", "getTimeSeries", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class NetworkDailyAdjusted {
    @org.jetbrains.annotations.NotNull()
    private final com.bradychiu.stonks.network.model.DailyAdjusted.NetworkMetadata metaData = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.bradychiu.stonks.network.model.DailyAdjusted.NetworkStockPrice> timeSeries = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bradychiu.stonks.network.model.DailyAdjusted.NetworkMetadata getMetaData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.bradychiu.stonks.network.model.DailyAdjusted.NetworkStockPrice> getTimeSeries() {
        return null;
    }
    
    public NetworkDailyAdjusted(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Meta Data")
    com.bradychiu.stonks.network.model.DailyAdjusted.NetworkMetadata metaData, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Time Series (Daily)")
    java.util.Map<java.lang.String, com.bradychiu.stonks.network.model.DailyAdjusted.NetworkStockPrice> timeSeries) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bradychiu.stonks.network.model.DailyAdjusted.NetworkMetadata component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.bradychiu.stonks.network.model.DailyAdjusted.NetworkStockPrice> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bradychiu.stonks.network.model.DailyAdjusted.NetworkDailyAdjusted copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Meta Data")
    com.bradychiu.stonks.network.model.DailyAdjusted.NetworkMetadata metaData, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Time Series (Daily)")
    java.util.Map<java.lang.String, com.bradychiu.stonks.network.model.DailyAdjusted.NetworkStockPrice> timeSeries) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}