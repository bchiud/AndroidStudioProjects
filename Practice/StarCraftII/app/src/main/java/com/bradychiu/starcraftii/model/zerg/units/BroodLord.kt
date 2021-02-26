package com.bradychiu.starcraftii.model.zerg.units

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Unit

class BroodLord(): Unit() {
    override val nameResourceId = R.string.zerg_unit_brood_lord
    override val iconResourceId = R.drawable.zerg_unit_brood_lord
    override val raceResourceId = R.string.race_zerg
}