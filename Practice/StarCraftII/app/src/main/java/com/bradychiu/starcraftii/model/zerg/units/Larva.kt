package com.bradychiu.starcraftii.model.zerg.units

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Unit

class Larva(): Unit() {
    override val nameResourceId = R.string.zerg_unit_larva
    override val iconResourceId = R.drawable.zerg_unit_larva
    override val raceResourceId = R.string.race_zerg
}