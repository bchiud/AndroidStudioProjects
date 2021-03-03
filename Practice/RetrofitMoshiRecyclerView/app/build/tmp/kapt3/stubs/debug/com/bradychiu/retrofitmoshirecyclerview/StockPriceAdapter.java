package com.bradychiu.retrofitmoshirecyclerview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0017J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/bradychiu/retrofitmoshirecyclerview/StockPriceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bradychiu/retrofitmoshirecyclerview/StockPriceAdapter$StockPriceViewHolder;", "()V", "value", "", "Lcom/bradychiu/retrofitmoshirecyclerview/domain/model/StockPrice;", "stockPrices", "getStockPrices", "()Ljava/util/List;", "setStockPrices", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "StockPriceViewHolder", "app_debug"})
public final class StockPriceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bradychiu.retrofitmoshirecyclerview.StockPriceAdapter.StockPriceViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice> stockPrices;
    @org.jetbrains.annotations.NotNull()
    public static final com.bradychiu.retrofitmoshirecyclerview.StockPriceAdapter.DiffCallback DiffCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice> getStockPrices() {
        return null;
    }
    
    public final void setStockPrices(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bradychiu.retrofitmoshirecyclerview.StockPriceAdapter.StockPriceViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.bradychiu.retrofitmoshirecyclerview.StockPriceAdapter.StockPriceViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public StockPriceAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/bradychiu/retrofitmoshirecyclerview/StockPriceAdapter$StockPriceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "tvDate", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTvDate", "()Landroid/widget/TextView;", "tvPrice", "getTvPrice", "bind", "", "item", "Lcom/bradychiu/retrofitmoshirecyclerview/domain/model/StockPrice;", "app_debug"})
    public static final class StockPriceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvDate = null;
        private final android.widget.TextView tvPrice = null;
        
        public final android.widget.TextView getTvDate() {
            return null;
        }
        
        public final android.widget.TextView getTvPrice() {
            return null;
        }
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice item) {
        }
        
        public StockPriceViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/bradychiu/retrofitmoshirecyclerview/StockPriceAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/bradychiu/retrofitmoshirecyclerview/domain/model/StockPrice;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice oldItem, @org.jetbrains.annotations.NotNull()
        com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice oldItem, @org.jetbrains.annotations.NotNull()
        com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}