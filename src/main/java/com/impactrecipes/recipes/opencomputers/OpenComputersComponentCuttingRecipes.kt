package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class OpenComputersComponentCuttingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        MachineRecipes.cutter(
            input = ImpactItems.CUBoard.get(),
            output = OpenComputersItems.ControlUnitCU.get(amount = 16),
            secondaryOutput = null,
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.cutter(
            input = ImpactItems.ALUBoard.get(),
            output = OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 16),
            secondaryOutput = null,
            ticks = 400,
            eu = 12,
        )

        CraftingRecipes.shapelessWithFlags(
            output = OpenComputersItems.Cable.get(),
            flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
            ingredients = arrayOf<Any?>(
                OrePrefixes.cableGt02.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Scrench.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PhP",
                " C ",
                " S ",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'S',
                OrePrefixes.stick.get(Materials.Steel),
                'C',
                OpenComputersItems.MicrochipTier2.get(),
            ),
        )
    }
}
