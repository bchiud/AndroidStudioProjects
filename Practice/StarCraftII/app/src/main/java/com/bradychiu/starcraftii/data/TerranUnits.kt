package com.bradychiu.starcraftii.data

import com.bradychiu.starcraftii.model.Unit
import com.bradychiu.starcraftii.model.terran.units.*

class TerranUnits {
    fun load(): List<Unit> {
        return listOf(
                SCV(),
                Mule(),
                Marine(),
                Reaper(),
                Marauder(),
                Ghost(),
                Hellion(),
                WidowMine(),
                Cyclone(),
                SiegeTank(),
                Hellbat(),
                Thor(),
                Viking(),
                Medivac(),
                Liberator(),
                Raven(),
                Banshee(),
                Battlecruiser()
        )
    }
}