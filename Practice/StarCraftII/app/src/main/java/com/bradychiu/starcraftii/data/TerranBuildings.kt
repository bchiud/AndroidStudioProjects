package com.bradychiu.starcraftii.data

import com.bradychiu.starcraftii.model.Building
import com.bradychiu.starcraftii.model.terran.buildings.*

class TerranBuildings {
    fun load(): List<Building> {
        return listOf(
            CommandCenter(),
            OrbitalCommand(),
            PlanetaryFortress(),
            SupplyDepot(),
            Refinery(),
            Barracks(),
            EngineeringBay(),
            Bunker(),
            MissileTurret(),
            SensorTower(),
            GhostAcademy(),
            Factory(),
            Armory(),
            Starport(),
            FusionCore()
        )
    }
}