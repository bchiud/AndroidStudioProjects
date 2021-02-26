package com.bradychiu.starcraftii.model.protoss.units

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Unit

class Immortal() : Unit() {
    override val nameResourceId = R.string.protoss_unit_immortal
    override val iconResourceId = R.drawable.protoss_unit_immortal
    override val raceResourceId = R.string.race_zerg
}