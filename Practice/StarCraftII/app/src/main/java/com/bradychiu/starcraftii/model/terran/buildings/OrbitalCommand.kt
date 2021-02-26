package com.bradychiu.starcraftii.model.terran.buildings

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Building

class OrbitalCommand() : Building() {
    override val nameResourceId = R.string.terran_building_orbital_command
    override val iconResourceId = R.drawable.terran_building_orbital_command
    override val raceResourceId = R.string.race_terran
}