package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.TecTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class TecTechMultiblockRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.WetTransformerZPMLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorLuV,
                    count = 16,
                ),
                GregTechItems.CircuitChipUHPIC.get(amount = 2),
            ),
            fluid = Materials.TungstenSteel.getMolten(576),
            output = TecTechItems.MachineMultiTransformer.get(),
            ticks = 400,
            eu = 30720,
        )
    }
}
