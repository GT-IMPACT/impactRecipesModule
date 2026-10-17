package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Dyes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials

internal class LogisticsModuleBathRecipes {

    internal fun register() {
        for (i in 0 until 16) {
            for (j in 0 until Dyes.VALUES[i].getSizeOfFluidList()) {
                MachineRecipes.chemicalBath(
                    input = LogisticsPipesItems.ItemRemoteOrdererItem.get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        36,
                    ),
                    output = ModItemVariant(
                        item = LogisticsPipesItems.ItemRemoteOrdererItem,
                        meta = 1 + i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 20,
                    eu = 2,
                )
            }

            MachineRecipes.chemicalBath(
                input = ModItemVariant(
                    item = LogisticsPipesItems.ItemRemoteOrdererItem,
                    meta = 1 + i,
                ).get(),
                fluid = Materials.Chlorine.getGas(50),
                output = LogisticsPipesItems.ItemRemoteOrdererItem.get(),
                secondaryOutput = GT_Values.NI,
                output3 = GT_Values.NI,
                chances = null,
                ticks = 20,
                eu = 2,
            )
        }
    }
}
