package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactUtilityControllerPrinterRecipes {

    internal fun register() {
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
                    count = 4,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                GregTechItems.ElectricPistonIV.get(amount = 4),
                GregTechItems.RobotArmIV.get(amount = 4),
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
                    material = Materials.Inconel690,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Inconel690,
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
            output = ImpactItems.MachineWire.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.MaragingSteel250,
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
                    material = Materials.MaragingSteel250,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Inconel792,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Inconel792,
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
            output = ImpactItems.MachineSupply.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nitinol,
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
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Nitinol,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.HastelloyC276,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.HastelloyC276,
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
            output = ImpactItems.MachineUtility.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Talonite,
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
                    material = Materials.Talonite,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Grisium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Grisium,
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
            output = ImpactItems.MachineBrewmenter.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nitinol,
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
                    material = Materials.Nitinol,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Inconel690,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Inconel690,
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
            output = ImpactItems.MachineSiftarator.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 7680,
        )
    }
}
