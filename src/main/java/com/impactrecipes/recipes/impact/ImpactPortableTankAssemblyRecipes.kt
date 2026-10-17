package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactPortableTankAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lead,
                    count = 8,
                ),
                GregTechItems.LargeFluidCellSteel.get(),
                ModItemVariant(
                    item = GregTechItems.CircuitIntegrated,
                    meta = 2,
                ).get(amount = 0),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.PortableTankULV.get(),
            ticks = 100,
            eu = 6,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 8,
                ),
                GregTechItems.LargeFluidCellAluminium.get(),
                ModItemVariant(
                    item = GregTechItems.CircuitIntegrated,
                    meta = 2,
                ).get(amount = 0),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.PortableTankLV.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Aluminium,
                    count = 8,
                ),
                GregTechItems.LargeFluidCellStainlessSteel.get(),
                ModItemVariant(
                    item = GregTechItems.CircuitIntegrated,
                    meta = 2,
                ).get(amount = 0),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.PortableTankMV.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSLA,
                    count = 8,
                ),
                GregTechItems.LargeFluidCellTitanium.get(),
                ModItemVariant(
                    item = GregTechItems.CircuitIntegrated,
                    meta = 2,
                ).get(amount = 0),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.PortableTankHV.get(),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSSG,
                    count = 8,
                ),
                GregTechItems.LargeFluidCellTungstenSteel.get(),
                ModItemVariant(
                    item = GregTechItems.CircuitIntegrated,
                    meta = 2,
                ).get(amount = 0),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.PortableTankEV.get(),
            ticks = 500,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 8,
                ),
                GregTechItems.LargeFluidCellChrome.get(),
                ModItemVariant(
                    item = GregTechItems.CircuitIntegrated,
                    meta = 2,
                ).get(amount = 0),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.PortableTankIV.get(),
            ticks = 600,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyN,
                    count = 8,
                ),
                GregTechItems.LargeFluidCellIridium.get(),
                ModItemVariant(
                    item = GregTechItems.CircuitIntegrated,
                    meta = 2,
                ).get(amount = 0),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.PortableTankLuV.get(),
            ticks = 700,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lafium,
                    count = 8,
                ),
                GregTechItems.LargeFluidCellOsmium.get(),
                ModItemVariant(
                    item = GregTechItems.CircuitIntegrated,
                    meta = 2,
                ).get(amount = 0),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.PortableTankZPM.get(),
            ticks = 800,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CinobiteA243,
                    count = 8,
                ),
                GregTechItems.LargeFluidCellNeutronium.get(),
                ModItemVariant(
                    item = GregTechItems.CircuitIntegrated,
                    meta = 2,
                ).get(amount = 0),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.PortableTankUV.get(),
            ticks = 900,
            eu = 500000,
        )
    }
}
