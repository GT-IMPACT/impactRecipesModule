package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.util.GT_Utility

internal class MalisisWoodDoorAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.Planks4.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.ItemDoorAcacia.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks4.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Copper.getMolten(16),
            output = MalisisDoorsItems.ItemDoorAcacia.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks2.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.ItemDoorBirch.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks2.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Copper.getMolten(16),
            output = MalisisDoorsItems.ItemDoorBirch.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks5.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.ItemDoorDarkOak.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks5.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Copper.getMolten(16),
            output = MalisisDoorsItems.ItemDoorDarkOak.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks3.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.ItemDoorJungle.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks3.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Copper.getMolten(16),
            output = MalisisDoorsItems.ItemDoorJungle.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks1.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.ItemDoorSpruce.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks1.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Copper.getMolten(16),
            output = MalisisDoorsItems.ItemDoorSpruce.get(),
            ticks = 400,
            eu = 4,
        )
    }
}
