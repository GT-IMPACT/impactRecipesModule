package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.util.GT_Utility

internal class ExtraUtilitiesStoneAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.Sand.get(),
            secondaryInput = VanillaItems.Glass.get(),
            fluidInput = null,
            output = ExtraUtilitiesItems.SandyGlass.get(amount = 2),
            ticks = 40,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Stone.get(amount = 4),
            secondaryInput = VanillaItems.Stonebrick.get(amount = 5),
            fluidInput = null,
            output = ExtraUtilitiesItems.EdgedStoneBricks.get(amount = 9),
            ticks = 180,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.EdgedStoneBricks.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(4),
            fluidInput = null,
            output = ExtraUtilitiesItems.BorderStone.get(),
            ticks = 20,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.BorderStone.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(4),
            fluidInput = null,
            output = ExtraUtilitiesItems.BorderStoneAlternate.get(),
            ticks = 20,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Gravel.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(2),
            fluidInput = null,
            output = ExtraUtilitiesItems.GravelBricks.get(),
            ticks = 20,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Stone.get(),
            secondaryInput = VanillaItems.Ice.get(amount = 4),
            fluidInput = null,
            output = ExtraUtilitiesItems.FrostedStone.get(amount = 4),
            ticks = 80,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.GravelBricks.get(amount = 5),
            secondaryInput = VanillaItems.StoneSlab5.get(amount = 5),
            fluidInput = null,
            output = ExtraUtilitiesItems.GravelRoad.get(amount = 5),
            ticks = 100,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Sandstone.get(),
            secondaryInput = VanillaItems.EndStone1.get(),
            fluidInput = null,
            output = ExtraUtilitiesItems.EnderSandAlloy.get(amount = 2),
            ticks = 40,
            eu = 4,
        )
    }
}
