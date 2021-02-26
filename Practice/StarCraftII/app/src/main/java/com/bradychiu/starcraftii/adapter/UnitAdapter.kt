package com.bradychiu.starcraftii.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bradychiu.starcraftii.databinding.ItemUnitBinding
import com.bradychiu.starcraftii.model.Unit

class UnitAdapter(val context: Context, private val units: List<Unit>) : RecyclerView.Adapter<UnitAdapter.ItemUnitViewHolder>() {

    private lateinit var binding: ItemUnitBinding

    class ItemUnitViewHolder(private var binding: ItemUnitBinding) : RecyclerView.ViewHolder(binding.getRoot()) {
        val iconView: ImageView = binding.itemUnitIcon
        val nameView: TextView = binding.itemUnitName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemUnitViewHolder {
        binding = ItemUnitBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemUnitViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemUnitViewHolder, position: Int) {
        val unit = units[position]
        holder.nameView.text = context.resources.getString(unit.nameResourceId).toString()
        holder.iconView.setImageResource(unit.iconResourceId)
    }

    override fun getItemCount(): Int {
        return units.size
    }

}