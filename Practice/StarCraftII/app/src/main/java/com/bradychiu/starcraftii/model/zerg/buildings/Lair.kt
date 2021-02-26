package com.bradychiu.starcraftii.model.zerg.buildings

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Building

class Lair() : Building() {
    override val nameResourceId = R.string.zerg_building_lair
    override val iconResourceId = R.drawable.zerg_building_lair
    override val raceResourceId = R.string.race_zerg

}