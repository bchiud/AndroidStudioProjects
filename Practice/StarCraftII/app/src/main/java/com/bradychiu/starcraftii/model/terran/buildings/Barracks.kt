package com.bradychiu.starcraftii.model.terran.buildings

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Building

class Barracks() : Building() {
    override val nameResourceId = R.string.terran_building_barracks
    override val iconResourceId = R.drawable.terran_building_barracks
    override val raceResourceId = R.string.race_terran
}