package com.bradychiu.stonks.stocklist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bradychiu.stonks.databinding.StockListItemBinding

// app:listData="@{viewModel.stockList}"

class StockListAdapter(private val stockList: List<StockListItem>) :
    RecyclerView.Adapter<StockListAdapter.StockListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockListViewHolder {
        return StockListViewHolder(
            StockListItemBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )
    }

    override fun onBindViewHolder(holder: StockListViewHolder, position: Int) {
        val stockListItem: StockListItem = stockList[position]
        holder.bind(stockListItem)
    }

    // companion object DiffCallback : DiffUtil.ItemCallback<StockListItem>() {
    //     override fun areItemsTheSame(oldItem: StockListItem, newItem: StockListItem): Boolean {
    //         return oldItem == newItem
    //     }
    //
    //     override fun areContentsTheSame(oldItem: StockListItem, newItem: StockListItem): Boolean {
    //         return oldItem.symbol == newItem.symbol
    //                 && oldItem.price == newItem.price
    //     }
    // }

    class StockListViewHolder(private var binding: StockListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(stockListItem: StockListItem) {
            binding.stockListItem = stockListItem
            binding.executePendingBindings()
        }
    }

    override fun getItemCount(): Int {
        return stockList.size
    }
}

