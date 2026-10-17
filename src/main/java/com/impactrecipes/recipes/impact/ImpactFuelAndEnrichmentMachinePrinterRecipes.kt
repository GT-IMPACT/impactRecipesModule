package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactFuelAndEnrichmentMachinePrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.HullHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.HSLA,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.StainlessSteel,
                    count = 6,
                ),
            ),
            output = ImpactItems.SOFCLow.get(),
            fluidInputs = null,
            ticks = 15 * 20,
            eu = 480,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.HullEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                GregTechItems.ElectricPumpEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Zamak,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Titanium,
                    count = 6,
                ),
            ),
            output = ImpactItems.SOFCMedium.get(),
            fluidInputs = null,
            ticks = 20 * 20,
            eu = 1920,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                GregTechItems.ElectricPumpIV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.HSSS,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.TungstenSteel,
                    count = 6,
                ),
            ),
            output = ImpactItems.SOFCHuge.get(),
            fluidInputs = null,
            ticks = 30 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.MaragingSteel250,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                GregTechItems.ElectricPumpLuV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Talonite,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.Polytetrafluoroethylene,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Tungsten,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Grisium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            output = ImpactItems.AdvCrackUnit.get(),
            fluidInputs = null,
            ticks = 80 * 20,
            eu = 30720,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.MachineFlotationUnit.get(),
                GregTechItems.ElectricPumpIV.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.Inconel690,
                    count = 8,
                ),
                GregTechItems.CasingCoilNichrome.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.HastelloyC276,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Inconel792,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel250,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 32,
                ),
            ),
            output = ImpactItems.MiningEnrichHV.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )
    }
}
