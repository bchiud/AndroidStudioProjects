package com.bradychiu.retrofitmoshirecyclerview

import android.icu.text.NumberFormat
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice

class StockPriceAdapter(private val stockPrices: List<StockPrice>) : RecyclerView.Adapter<StockPriceAdapter.StockPriceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockPriceViewHolder {
        return StockPriceViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item, parent, false))
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: StockPriceViewHolder, position: Int) {
        val stockPrice = stockPrices[position]

        holder.tvDate.text = stockPrice.date.toString()
        holder.tvPrice.text = NumberFormat.getCurrencyInstance().format(stockPrice.adjustedClose)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class StockPriceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvDate = itemView.findViewById<TextView>(R.id.tv_date)
        val tvPrice = itemView.findViewById<TextView>(R.id.tv_price)
    }

    companion object DiffCallback: DiffUtil.ItemCallback<StockPrice>() {
        override fun areItemsTheSame(oldItem: StockPrice, newItem: StockPrice): Boolean {
            return oldItem.date == newItem.date
        }

        override fun areContentsTheSame(oldItem: StockPrice, newItem: StockPrice): Boolean {
            return oldItem.adjustedClose == newItem.adjustedClose
        }

    }
}