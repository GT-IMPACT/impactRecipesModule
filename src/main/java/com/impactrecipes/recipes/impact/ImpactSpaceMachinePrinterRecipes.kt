package com.impactrecipes.recipes.impact

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactSpaceMachinePrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.HullHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                GregTechItems.ToolDataStick.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.BlueSteel,
                    count = 8,
                ),
            ),
            output = ImpactItems.CommunicationTower.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 480,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.HullHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                AE2Items.CraftingCoProcessingUnit.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.VanadiumSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.BlueSteel,
                    count = 8,
                ),
            ),
            output = ImpactItems.SpaceSatellite.get(),
            fluidInputs = null,
            ticks = 50 * 20,
            eu = 480,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.HullEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HSLA,
                    count = 4,
                ),
                EnderIOItems.TravelAnchor.get(amount = 2),
                GregTechItems.ConveyorModuleEV.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Titanium,
                    count = 32,
                ),
            ),
            output = ImpactItems.SpaceElevator.get(),
            fluidInputs = null,
            ticks = 60 * 20,
            eu = 1920,
        )
    }
}
