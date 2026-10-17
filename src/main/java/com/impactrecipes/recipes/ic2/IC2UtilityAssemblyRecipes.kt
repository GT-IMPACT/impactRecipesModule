package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class IC2UtilityAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.SteelMagnetic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Copper,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = IC2Items.Coil.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = IC2Items.BoatRubberBroken.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Rubber,
                count = 1,
            ),
            output = IC2Items.BoatRubber.get(),
            ticks = 20,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Steel,
                count = 2,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(5),
            fluidInput = Materials.Rubber.getMolten(144),
            output = IC2Items.WeedingTrowel.get(),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverScreen.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.circuit,
                material = Materials.Good,
                count = 1,
            ),
            fluidInput = Materials.Redstone.getMolten(576),
            output = ModItemVariant(
                item = IC2Items.Cropnalyzer,
                meta = 1,
            ).get(),
            ticks = 1200,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = IC2Items.AdvancedAlloy.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Lead.getMolten(16),
            output = IC2Items.ReinforcedDoor.get(),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.circuit,
                material = Materials.Basic,
                count = 1,
            ),
            secondaryInput = GregTechItems.ElectricPistonLV.get(),
            fluidInput = Materials.Copper.getMolten(144),
            output = IC2Items.EjectorUpgrade.get(),
            ticks = 1200,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = IC2Items.EjectorUpgrade.get(),
            secondaryInput = GregTechItems.ElectricPumpLV.get(),
            fluidInput = Materials.Copper.getMolten(144),
            output = IC2Items.FluidEjectorUpgrade.get(),
            ticks = 1200,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.circuit,
                material = Materials.Basic,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.RedAlloy,
                count = 1,
            ),
            fluidInput = Materials.Copper.getMolten(144),
            output = IC2Items.RedstoneInverterUpgrade.get(),
            ticks = 1200,
            eu = 12,
        )
    }
}
