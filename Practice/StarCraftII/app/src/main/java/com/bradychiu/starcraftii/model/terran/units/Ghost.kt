package com.bradychiu.starcraftii.model.terran.units

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Unit

class Ghost() : Unit() {
    override val nameResourceId = R.string.terran_unit_ghost
    override val iconResourceId = R.drawable.terran_unit_ghost
    override val raceResourceId = R.string.race_terran
}