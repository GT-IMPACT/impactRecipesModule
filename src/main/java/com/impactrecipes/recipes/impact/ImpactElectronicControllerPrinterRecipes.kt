package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactElectronicControllerPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.GumMetal,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricPistonIV.get(amount = 4),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.GumMetal,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Titaniolum,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Titaniolum,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.HSSG,
                    count = 16,
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
            output = ImpactItems.MachinePBE.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Zamak,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricPistonIV.get(amount = 4),
                GregTechItems.RobotArmIV.get(amount = 4),
                GregTechItems.EmitterIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Zamak,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Duraluminium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Duraluminium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.HSSG,
                    count = 16,
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
            output = ImpactItems.MachineLaserEngraver.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel690,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 8,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricPistonIV.get(amount = 4),
                GregTechItems.RobotArmIV.get(amount = 4),
                GregTechItems.EmitterIV.get(amount = 4),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Inconel690,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Nitinol,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Nitinol,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.HSSG,
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
            output = ImpactItems.MachineAssembler.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricMotorIV.get(amount = 4),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Inconel792,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.TiBetaC,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.TiBetaC,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.HSSG,
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
            output = ImpactItems.MachineCentrifuge.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HastelloyC276,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricPistonIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HastelloyC276,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Zamak,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Zamak,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.HSSG,
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
            output = ImpactItems.MachineElectrolyzer.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )
    }
}
