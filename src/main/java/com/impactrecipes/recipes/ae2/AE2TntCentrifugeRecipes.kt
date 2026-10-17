package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class AE2TntCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.centrifuge(
            input = IC2Items.IndustrialTnt.get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = AE2Items.TinyTNT.get(),
            secondaryOutput = AE2Items.TinyTNT.get(),
            output3 = GT_Values.NI,
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                10000,
            ),
            ticks = 100,
            eu = 16,
        )
    }
}
