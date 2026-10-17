package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.CompactKineticGeneratorsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2CompactKineticRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.HatchDynamoEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Tungsten,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Desh,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                IC2Items.KineticGenerator.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.TungstenSteel,
                    count = 6,
                ),
            ),
            output = CompactKineticGeneratorsItems.BlockCkg8.get(),
            fluidInputs = null,
            ticks = 20 * 20,
            eu = 1020,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HatchDynamoIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.HSSG,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Trinium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                GregTechItems.ElectricMotorIV.get(amount = 2),
                CompactKineticGeneratorsItems.BlockCkg8.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HastelloyN,
                    count = 8,
                ),
            ),
            output = CompactKineticGeneratorsItems.BlockCkg9.get(),
            fluidInputs = null,
            ticks = 30 * 20,
            eu = 4100,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HatchDynamoLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt08,
                    material = Materials.VanadiumGallium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Draconium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 2,
                ),
                GregTechItems.ElectricMotorLuV.get(amount = 2),
                CompactKineticGeneratorsItems.BlockCkg9.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Lafium,
                    count = 10,
                ),
            ),
            output = CompactKineticGeneratorsItems.BlockCkg10.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 16500,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HatchDynamoZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt12,
                    material = Materials.Duranium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Oriharukon,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 2,
                ),
                GregTechItems.ElectricMotorZPM.get(amount = 2),
                CompactKineticGeneratorsItems.BlockCkg10.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.CinobiteA243,
                    count = 12,
                ),
            ),
            output = CompactKineticGeneratorsItems.BlockCkg11.get(),
            fluidInputs = null,
            ticks = 50 * 20,
            eu = 65500,
        )
    }
}
