package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactOreProcessingControllerPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nitinol60,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 8,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricPistonIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Nitinol60,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Kovar,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Kovar,
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
            output = ImpactItems.MachineArcFurnace.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.TiBetaC,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 8,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricPistonIV.get(amount = 4),
                GregTechItems.ElectricPumpIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.TiBetaC,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Talonite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Talonite,
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
            output = ImpactItems.MachineExtradifier.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titaniolum,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 8,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricMotorIV.get(amount = 4),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Titaniolum,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.MaragingSteel250,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.MaragingSteel250,
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
            output = ImpactItems.MachineMixer.get(),
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
                    count = 8,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricPistonIV.get(amount = 4),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
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
                    material = Materials.Mangalloy,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Mangalloy,
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
            output = ImpactItems.MachineMacerator.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 8,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricMotorIV.get(amount = 4),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel300,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Stellite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Stellite,
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
            output = ImpactItems.MachineCutting.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )
    }
}
