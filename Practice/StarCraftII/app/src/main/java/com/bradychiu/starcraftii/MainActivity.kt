package com.bradychiu.starcraftii

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bradychiu.starcraftii.adapter.UnitAdapter
import com.bradychiu.starcraftii.data.ProtossUnits
import com.bradychiu.starcraftii.data.TerranUnits
import com.bradychiu.starcraftii.data.ZergUnits
import com.bradychiu.starcraftii.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val units = TerranUnits().load() + ZergUnits().load() + ProtossUnits().load()
        // val buildings = TerranBuildings().load() + ZergBuildings().load() + ProtossBuildings().load()
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = UnitAdapter(this, units)
        recyclerView.setHasFixedSize(true)
    }
}