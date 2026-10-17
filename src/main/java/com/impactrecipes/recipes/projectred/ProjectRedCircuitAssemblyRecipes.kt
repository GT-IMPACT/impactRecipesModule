package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ProjectRedFabricationItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ProjectRedCircuitAssemblyRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardCoated.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Copper,
                    count = 6,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ProjectRedFabricationItems.ProjectredFabricationIcchip.get(),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPhenolic.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Gold,
                    count = 6,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ProjectRedFabricationItems.ProjectredFabricationIcchip.get(amount = 2),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlastic.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 6,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ProjectRedFabricationItems.ProjectredFabricationIcchip.get(amount = 4),
            ticks = 200,
            eu = 48,
        )
    }
}
