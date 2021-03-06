package com.bradychiu.starcraftii.model.terran.buildings

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Building

class PlanetaryFortress() : Building() {
    override val nameResourceId = R.string.terran_building_planetary_fortress
    override val iconResourceId = R.drawable.terran_building_planetary_fortress
    override val raceResourceId = R.string.race_terran
}