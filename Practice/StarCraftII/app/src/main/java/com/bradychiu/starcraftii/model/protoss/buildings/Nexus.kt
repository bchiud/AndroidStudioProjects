package com.bradychiu.starcraftii.model.protoss.buildings

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Building

class Nexus() : Building() {
    override val nameResourceId = R.string.protoss_building_nexus
    override val iconResourceId = R.drawable.protoss_building_nexus
    override val raceResourceId = R.string.race_protoss
}