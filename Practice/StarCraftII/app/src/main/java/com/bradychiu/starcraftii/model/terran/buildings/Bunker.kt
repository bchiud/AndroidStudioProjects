package com.bradychiu.starcraftii.model.terran.buildings

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Building

class Bunker() : Building() {
    override val nameResourceId = R.string.terran_building_bunker
    override val iconResourceId = R.drawable.terran_building_bunker
    override val raceResourceId = R.string.race_terran
}