package com.bradychiu.starcraftii.model.zerg.units

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Unit

class Zergling(): Unit() {
    override val nameResourceId = R.string.zerg_unit_zergling
    override val iconResourceId = R.drawable.zerg_unit_zergling
    override val raceResourceId = R.string.race_zerg
}