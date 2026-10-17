package com.impactrecipes.recipes.impact

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactProcessingMachinePrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                ImpactItems.Pyrolyse.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HSLA,
                    count = 2,
                ),
                GregTechItems.ElectricPumpEV.get(amount = 2),
                GregTechItems.ElectricPistonEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeNonuple,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Kanthal,
                    count = 6,
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
            output = ImpactItems.AdvPyrolyse.get(),
            fluidInputs = null,
            ticks = 60 * 20,
            eu = 1920,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.NaquadahAlloy,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.TungstenSteel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.GumMetal,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Desh,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.TungstenCarbide,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Talonite,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSS,
                    count = 32,
                ),
            ),
            output = ImpactItems.NaqChamberPart.get(),
            fluidInputs = null,
            ticks = 30 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.NaqChamberPart.get(amount = 3),
                ImpactItems.LSFCCeramicPlate.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Californium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.NiobiumTitanium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Trinium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Iridium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.NaquadahAlloy,
                    count = 32,
                ),
            ),
            output = ImpactItems.TachyonTube.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.CycloneCasing.get(),
                GregTechItems.ElectricMotorLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.MaragingSteel250,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.MaragingSteel300,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Inconel792,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.TiBetaC,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Inconel690,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSS,
                    count = 16,
                ),
            ),
            output = ImpactItems.InsideBlock1.get(),
            fluidInputs = null,
            ticks = 60 * 20,
            eu = 30720,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.MachineIVPrinter.get(),
                AE2Items.MEProcessingPatternTerminal.get(),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Inconel690,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.TungstenSteel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.HastelloyC276,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            output = ImpactItems.MachineAdvDDDPrinter.get(),
            fluidInputs = null,
            ticks = 50 * 20,
            eu = 1920,
        )
    }
}
