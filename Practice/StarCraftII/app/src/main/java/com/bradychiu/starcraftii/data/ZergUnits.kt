package com.bradychiu.starcraftii.data

import com.bradychiu.starcraftii.model.Unit
import com.bradychiu.starcraftii.model.zerg.units.*

class ZergUnits {
    fun load(): List<Unit> {
        return listOf(
            Larva(),
            Drone(),
            Zergling(),
            Baneling(),
            Roach(),
            Ravager(),
            Hydralisk(),
            Lurker(),
            Viper(),
            Mutalisk(),
            Corruptor(),
            SwarmHost(),
            Locust(),
            Infestor(),
            Ultralisk(),
            BroodLord(),
            Broodling(),
            Overlord(),
            Overseer(),
            Queen(),
            Changeling()
        )
    }
}