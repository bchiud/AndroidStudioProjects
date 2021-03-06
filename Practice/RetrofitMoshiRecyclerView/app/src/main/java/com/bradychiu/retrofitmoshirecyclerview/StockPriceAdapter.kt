package com.bradychiu.retrofitmoshirecyclerview

import android.icu.text.NumberFormat
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bradychiu.retrofitmoshirecyclerview.databinding.ItemBinding
import com.bradychiu.retrofitmoshirecyclerview.domain.model.StockPrice

class StockPriceAdapter() :
    ListAdapter<StockPrice, StockPriceAdapter.StockPriceViewHolder>(StockPriceDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockPriceViewHolder {
        return StockPriceViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: StockPriceViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class StockPriceViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: StockPrice) {
            binding.stockPrice = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): StockPriceViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemBinding.inflate(layoutInflater, parent, false)
                return StockPriceViewHolder(binding)
            }
        }
    }

    companion object StockPriceDiffCallback : DiffUtil.ItemCallback<StockPrice>() {
        override fun areItemsTheSame(oldItem: StockPrice, newItem: StockPrice): Boolean {
            return oldItem.date == newItem.date
        }

        override fun areContentsTheSame(oldItem: StockPrice, newItem: StockPrice): Boolean {
            return oldItem.adjustedClose == newItem.adjustedClose
        }

    }
}