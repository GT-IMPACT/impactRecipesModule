package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials

internal class RailcraftTieBathRecipes {

    internal fun register() {
        MachineRecipes.chemicalBath(
            input = ModItemVariant(
                item = VanillaItems.WoodenSlab,
                meta = GT_Values.W.toInt(),
            ).get(),
            fluid = Materials.Creosote.getFluid(10),
            output = RailcraftItems.TieWood.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(
                10000,
            ),
            ticks = 160,
            eu = 5,
        )

        MachineRecipes.chemicalBath(
            input = RailcraftItems.Rebar.get(),
            fluid = Materials.Concrete.getMolten(72),
            output = ImpactItems.ConcreteTie.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(
                10000,
            ),
            ticks = 160,
            eu = 5,
        )
    }
}
