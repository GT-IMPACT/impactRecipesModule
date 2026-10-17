package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactOpticalComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HastelloyN,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Chrome,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyN,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Chrome,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.HastelloyN,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 4,
                ),
            ),
            fluid = null,
            output = GregTechItems.CasingLuV.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Lafium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Iridium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lafium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Iridium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Lafium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 8,
                ),
            ),
            fluid = null,
            output = GregTechItems.CasingZPM.get(),
            ticks = 400,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.CinobiteA243,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Osmium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CinobiteA243,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Osmium,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.CinobiteA243,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 12,
                ),
            ),
            fluid = null,
            output = GregTechItems.CasingUV.get(),
            ticks = 600,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Pikyonium64B,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Neutronium,
                    count = 10,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Pikyonium64B,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Neutronium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Pikyonium64B,
                    count = 8,
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
            fluid = null,
            output = GregTechItems.CasingMAX.get(),
            ticks = 800,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Quantum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Phoenixite,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Quantum,
                    count = 20,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Phoenixite,
                    count = 20,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Quantum,
                    count = 10,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 24,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 24,
                ),
            ),
            fluid = null,
            output = GregTechItems.CasingUEV.get(),
            ticks = 1000,
            eu = 2000000,
        )
    }
}
