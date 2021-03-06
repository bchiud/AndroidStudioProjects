package com.bradychiu.retrofitmoshirecyclerview

import android.icu.text.NumberFormat
import android.os.Build
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<StockPrice>?) {
    val adapter = recyclerView.adapter as StockPriceAdapter
    adapter.submitList(data)
}

@BindingAdapter("stockPriceDateFormatted")
fun TextView.setStockPriceDateFormatted(item: StockPrice) {
    item?.let {
        text = item.date.toString()
    }
}

@RequiresApi(Build.VERSION_CODES.N)
@BindingAdapter("stockPricePriceFormatted")
fun TextView.setStockPriceFormatted(item: StockPrice) {
    item?.let {
        text = NumberFormat.getCurrencyInstance().format(item.adjustedClose)
    }
}

