package com.bradychiu.starcraftii.model.protoss.buildings

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Building

class ShieldBattery() : Building() {
    override val nameResourceId = R.string.protoss_building_shield_battery
    override val iconResourceId = R.drawable.protoss_building_shield_battery
    override val raceResourceId = R.string.race_protoss
}