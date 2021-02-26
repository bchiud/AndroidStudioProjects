package com.bradychiu.starcraftii.model.protoss.units

import com.bradychiu.starcraftii.R
import com.bradychiu.starcraftii.model.Unit

class Oracle() : Unit() {
    override val nameResourceId = R.string.protoss_unit_oracle
    override val iconResourceId = R.drawable.protoss_unit_oracle
    override val raceResourceId = R.string.race_zerg
}