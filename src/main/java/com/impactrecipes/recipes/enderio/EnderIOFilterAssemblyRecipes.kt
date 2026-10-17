package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class EnderIOFilterAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = GregTechItems.ConveyorModuleLV.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Steel,
                count = 1,
            ),
            output = EnderIOItems.BasicFilterUpgrade.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = GregTechItems.ConveyorModuleMV.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.ElectricalSteel,
                count = 1,
            ),
            output = EnderIOItems.BasicFilterUpgrade1.get(),
            ticks = 100,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = GregTechItems.ConveyorModuleHV.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.DarkSteel,
                count = 1,
            ),
            output = EnderIOItems.BigFilterUpgrade.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.assembler(
            input = GregTechItems.ConveyorModuleEV.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.HSLA,
                count = 1,
            ),
            output = EnderIOItems.BigFilterUpgrade1.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.assembler(
            input = EnderIOItems.BasicFilterUpgrade.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.DarkSteel,
                count = 1,
            ),
            output = EnderIOItems.ModItemFilter.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = EnderIOItems.ConduitProbe.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.ElectricalSteel,
                count = 1,
            ),
            output = EnderIOItems.PowerItemFilter.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = OpenComputersItems.Cable.get(),
            secondaryInput = EnderIOItems.Material1.get(),
            output = EnderIOItems.OCConduit.get(),
            ticks = 120,
            eu = 16,
        )
    }
}
