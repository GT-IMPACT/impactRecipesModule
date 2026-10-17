package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactIndustrialMachinePrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.MachineMultiBlastFurnace.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HSLA,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Kanthal,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Titanium,
                    count = 16,
                ),
            ),
            output = ImpactItems.MachineBlastSmelter.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 1920,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.MachineMultiVacuumFreezer.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.BlueSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Aluminium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Titanium,
                    count = 16,
                ),
            ),
            output = ImpactItems.MachineFreezSolidifier.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 1920,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Lafium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Iridium,
                    count = 8,
                ),
                GregTechItems.ElectricPumpZPM.get(amount = 4),
                GregTechItems.RobotArmZPM.get(amount = 4),
                GregTechItems.ReactorCoolantLe3.get(),
                GregTechItems.ReactorCoolantLe3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Enderium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Osmiridium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 64,
                ),
            ),
            output = ImpactItems.AdvVacuumFreezer.get(),
            fluidInputs = null,
            ticks = 200 * 20,
            eu = 122880,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Lafium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Iridium,
                    count = 8,
                ),
                GregTechItems.ConveyorModuleZPM.get(amount = 4),
                GregTechItems.RobotArmZPM.get(amount = 4),
                GregTechItems.CasingCoilSuperconductor.get(amount = 8),
                GregTechItems.CasingCoilNaquadahAlloy.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Naquadah,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Osmiridium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 64,
                ),
            ),
            output = ImpactItems.MachineEIF.get(),
            fluidInputs = null,
            ticks = 200 * 20,
            eu = 122880,
        )
    }
}
