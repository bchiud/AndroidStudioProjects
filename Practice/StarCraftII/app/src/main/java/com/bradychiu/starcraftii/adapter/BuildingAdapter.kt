package com.bradychiu.starcraftii.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bradychiu.starcraftii.databinding.ItemBuildingBinding
import com.bradychiu.starcraftii.model.Building

class BuildingAdapter(val context: Context, private val buildings: List<Building>) : RecyclerView.Adapter<BuildingAdapter.ItemBuildingViewHolder>() {

    lateinit var binding: ItemBuildingBinding

    class ItemBuildingViewHolder(private val binding: ItemBuildingBinding) : RecyclerView.ViewHolder(binding.getRoot()) {
        val iconView: ImageView = binding.itemBuildingIcon
        val nameView: TextView = binding.itemBuildingName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemBuildingViewHolder {
        binding = ItemBuildingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemBuildingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemBuildingViewHolder, position: Int) {
        val building = buildings[position]
        holder.nameView.text = context.resources.getString(building.nameResourceId).toString()
        holder.iconView.setImageResource(building.iconResourceId)
    }

    override fun getItemCount(): Int {
        return buildings.size
    }

}