package com.bradychiu.retrofitmoshirecyclerview;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nJ\b\u0010\u0014\u001a\u00020\u0012H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/bradychiu/retrofitmoshirecyclerview/ViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_dailyAdjusted", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bradychiu/retrofitmoshirecyclerview/domain/model/DailyAdjusted;", "_stockPrices", "", "Lcom/bradychiu/retrofitmoshirecyclerview/domain/model/StockPrice;", "_symbol", "", "stockPrices", "Landroidx/lifecycle/LiveData;", "getStockPrices", "()Landroidx/lifecycle/LiveData;", "symbol", "getSymbol", "getStockData", "", "querySymbol", "updateUIProperties", "Companion", "app_debug"})
public final class ViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.bradychiu.retrofitmoshirecyclerview.domain.model.DailyAdjusted> _dailyAdjusted = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _symbol = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice>> _stockPrices = null;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.bradychiu.retrofitmoshirecyclerview.ViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSymbol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice>> getStockPrices() {
        return null;
    }
    
    public final void getStockData(@org.jetbrains.annotations.NotNull()
    java.lang.String querySymbol) {
    }
    
    private final void updateUIProperties() {
    }
    
    public ViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/bradychiu/retrofitmoshirecyclerview/ViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}