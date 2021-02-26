package com.bradychiu.starcraftii.data

import com.bradychiu.starcraftii.model.Building
import com.bradychiu.starcraftii.model.zerg.buildings.*

class ZergBuildings {
    fun load(): List<Building> {
        return listOf(
            Hatchery(),
            Lair(),
            Hive(),
            Extractor(),
            SpawningPool(),
            EvolutionChamber(),
            RoachWarren(),
            BanelingNest(),
            SpineCrawler(),
            SporeCrawler(),
            HydraliskDen(),
            InfestationPit(),
            LurkerDen(),
            Spire(),
            GreaterSpire(),
            NydusNetwork(),
            NydusWorm(),
            UltraliskCavern(),
            CreepTumor()
        )
    }
}