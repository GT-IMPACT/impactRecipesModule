package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.CompactKineticGeneratorsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2CompactKineticDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = CompactKineticGeneratorsItems.BlockCkg8.get(),
            outputs = arrayOf(
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
                GregTechItems.CircuitElite.get(amount = 2),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                IC2Items.KineticGenerator.get(),
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
            input = CompactKineticGeneratorsItems.BlockCkg9.get(),
            outputs = arrayOf(
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
                GregTechItems.CircuitMaster.get(amount = 2),
                GregTechItems.ElectricMotorIV.get(amount = 2),
                CompactKineticGeneratorsItems.BlockCkg8.get(),
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
            input = CompactKineticGeneratorsItems.BlockCkg10.get(),
            outputs = arrayOf(
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
                GregTechItems.CircuitQuantummainframe.get(amount = 2),
                GregTechItems.ElectricMotorLuV.get(amount = 2),
                CompactKineticGeneratorsItems.BlockCkg9.get(),
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
            input = CompactKineticGeneratorsItems.BlockCkg11.get(),
            outputs = arrayOf(
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
                GregTechItems.CircuitCrystalmainframe.get(amount = 2),
                GregTechItems.ElectricMotorZPM.get(amount = 2),
                CompactKineticGeneratorsItems.BlockCkg10.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.CinobiteA243,
                    count = 12,
                ),
            ),
            ticks = 500 * 20,
            eu = 65500,
        )

        MachineRecipes.disassembler(
            input = CompactKineticGeneratorsItems.IridiumRotor.get(),
            outputs = arrayOf(
                IC2Items.Steelshaft.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Lafium,
                    count = 2,
                ),
                CompactKineticGeneratorsItems.IridiumBlade.get(amount = 4),
            ),
            ticks = 200 * 20,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = CompactKineticGeneratorsItems.IridiumBlade.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Lafium,
                    count = 1,
                ),
                IC2Items.IridiumPlate.get(amount = 8),
            ),
            ticks = 200 * 20,
            eu = 1920,
        )
    }
}
