package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.CompactKineticGeneratorsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2CompactWindDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = CompactKineticGeneratorsItems.BlockCkg.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Tungsten,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Desh,
                    count = 2,
                ),
                GregTechItems.CircuitElite.get(amount = 2),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                IC2Items.WindKineticGenerator.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.TungstenSteel,
                    count = 6,
                ),
            ),
            ticks = 200 * 20,
            eu = 1020,
        )

        MachineRecipes.disassembler(
            input = CompactKineticGeneratorsItems.BlockCkg1.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.HSSG,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Trinium,
                    count = 2,
                ),
                GregTechItems.CircuitMaster.get(amount = 2),
                GregTechItems.ElectricMotorIV.get(amount = 2),
                CompactKineticGeneratorsItems.BlockCkg.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HastelloyN,
                    count = 8,
                ),
            ),
            ticks = 300 * 20,
            eu = 4100,
        )

        MachineRecipes.disassembler(
            input = CompactKineticGeneratorsItems.BlockCkg2.get(),
            outputs = arrayOf(
                GregTechItems.HullLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt08,
                    material = Materials.VanadiumGallium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Draconium,
                    count = 2,
                ),
                GregTechItems.CircuitQuantummainframe.get(amount = 2),
                GregTechItems.ElectricMotorLuV.get(amount = 2),
                CompactKineticGeneratorsItems.BlockCkg1.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Lafium,
                    count = 10,
                ),
            ),
            ticks = 400 * 20,
            eu = 16500,
        )

        MachineRecipes.disassembler(
            input = CompactKineticGeneratorsItems.BlockCkg3.get(),
            outputs = arrayOf(
                GregTechItems.HullZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt12,
                    material = Materials.Duranium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Oriharukon,
                    count = 2,
                ),
                GregTechItems.CircuitCrystalmainframe.get(amount = 2),
                GregTechItems.ElectricMotorZPM.get(amount = 2),
                CompactKineticGeneratorsItems.BlockCkg2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.CinobiteA243,
                    count = 12,
                ),
            ),
            ticks = 500 * 20,
            eu = 65500,
        )
    }
}
