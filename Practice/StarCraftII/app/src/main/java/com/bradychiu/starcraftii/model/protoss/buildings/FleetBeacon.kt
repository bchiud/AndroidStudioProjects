package com.bradychiu.starcraftii.model.protoss.buildings

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Building

class FleetBeacon() : Building() {
    override val nameResourceId = R.string.protoss_building_fleet_beacon
    override val iconResourceId = R.drawable.protoss_building_fleet_beacon
    override val raceResourceId = R.string.race_protoss
}