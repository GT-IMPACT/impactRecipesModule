package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class MalisisDeviceAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Wood,
                count = 4,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Glass,
                count = 1,
            ),
            fluidInput = Materials.Redstone.getMolten(288),
            output = MalisisDoorsItems.VanishingBlock.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Iron,
                count = 4,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Glass,
                count = 1,
            ),
            fluidInput = Materials.Redstone.getMolten(288),
            output = MalisisDoorsItems.VanishingBlock1.get(),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Gold,
                count = 4,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Glass,
                count = 1,
            ),
            fluidInput = Materials.Redstone.getMolten(288),
            output = MalisisDoorsItems.VanishingBlock2.get(),
            ticks = 500,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Diamond,
                count = 4,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Glass,
                count = 1,
            ),
            fluidInput = Materials.Redstone.getMolten(288),
            output = MalisisDoorsItems.VanishingBlock3.get(),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            secondaryInput = MalisisDoorsItems.ItemRustyHandle.get(),
            output = MalisisDoorsItems.RustyHatch.get(),
            ticks = 200,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.ring,
                material = Materials.Steel,
                count = 1,
            ),
            output = MalisisDoorsItems.GarageDoor.get(amount = 3),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Plastic,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.ring,
                material = Materials.Steel,
                count = 1,
            ),
            output = MalisisDoorsItems.GarageDoor.get(amount = 4),
            ticks = 160,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Plastic,
                count = 3,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.ring,
                material = Materials.Aluminium,
                count = 2,
            ),
            output = MalisisDoorsItems.GarageDoor.get(amount = 6),
            ticks = 170,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Plastic,
                count = 3,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.ring,
                material = Materials.StainlessSteel,
                count = 2,
            ),
            output = MalisisDoorsItems.GarageDoor.get(amount = 8),
            ticks = 180,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Iron,
                count = 3,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = MalisisDoorsItems.RustyLadder.get(amount = 2),
            ticks = 60,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Steel,
                count = 3,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = MalisisDoorsItems.RustyLadder.get(amount = 4),
            ticks = 70,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Aluminium,
                count = 3,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = MalisisDoorsItems.RustyLadder.get(amount = 8),
            ticks = 80,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.StainlessSteel,
                count = 3,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = MalisisDoorsItems.RustyLadder.get(amount = 16),
            ticks = 90,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.block,
                material = Materials.NetherQuartz,
                count = 4,
            ),
            secondaryInput = VanillaItems.Door.get(),
            output = MalisisDoorsItems.CarriageDoor.get(),
            ticks = 200,
            eu = 30,
        )
    }
}
