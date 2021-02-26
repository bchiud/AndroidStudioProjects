package com.bradychiu.starcraftii.data

import com.bradychiu.starcraftii.model.Building
import com.bradychiu.starcraftii.model.protoss.buildings.*

class ProtossBuildings {
    fun load(): List<Building> {
        return listOf(
            Nexus(),
            Assimilator(),
            Pylon(),
            Gateway(),
            Forge(),
            CyberneticsCore(),
            PhotonCannon(),
            ShieldBattery(),
            TwilightCouncil(),
            Stargate(),
            RoboticsFacility(),
            TemplarArchives(),
            FleetBeacon(),
            RoboticsBay(),
            DarkShrine()
        )
    }
}