package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class ImpactComponentCuttingRecipes {

    internal fun register() {
        MachineRecipes.cutter(
            input = ImpactItems.YSZCeramic.get(),
            output = ImpactItems.YSZCeramicPlate.get(amount = 4),
            secondaryOutput = null,
            ticks = 20 * 40,
            eu = 480,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = ImpactItems.GDCCeramic.get(),
            output = ImpactItems.GDCCeramicPlate.get(amount = 4),
            secondaryOutput = null,
            ticks = 20 * 40,
            eu = 1920,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = ImpactItems.LSFCCeramic.get(),
            output = ImpactItems.LSFCCeramicPlate.get(amount = 4),
            secondaryOutput = null,
            ticks = 20 * 40,
            eu = 7680,
            cleanroom = true,
        )

        for (i in 0 until 16) {
            MachineRecipes.cutter(
                input = ModItemVariant(
                    item = VanillaItems.Wool,
                    meta = i,
                ).get(),
                output = ModItemVariant(
                    item = VanillaItems.Carpet,
                    meta = i,
                ).get(amount = 2),
                secondaryOutput = GT_Values.NI,
                ticks = 50,
                eu = 8,
            )
        }
    }
}
