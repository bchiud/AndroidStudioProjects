package com.bradychiu.starcraftii.model.terran.units

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Unit

class Viking() : Unit() {
    override val nameResourceId = R.string.terran_unit_viking
    override val iconResourceId = R.drawable.terran_unit_viking
    override val raceResourceId = R.string.race_terran
}