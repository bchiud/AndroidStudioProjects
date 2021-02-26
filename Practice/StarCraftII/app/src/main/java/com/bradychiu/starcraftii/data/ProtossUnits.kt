package com.bradychiu.starcraftii.data

import com.bradychiu.starcraftii.model.Unit
import com.bradychiu.starcraftii.model.protoss.units.*

class ProtossUnits {
    fun load(): List<Unit> {
        return listOf(
            Probe(),
            Zealot(),
            Adept(),
            Sentry(),
            Stalker(),
            DarkTemplar(),
            HighTemplar(),
            Archon(),
            Observer(),
            WarpPrism(),
            Immortal(),
            Colossus(),
            Disruptor(),
            Phoenix(),
            VoidRay(),
            Oracle(),
            Tempest(),
            Carrier(),
            Mothership()
        )
    }
}