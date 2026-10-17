package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersMediaAndCaseCraftingRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.StoneButton.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = GT_Values.NF,
            output = OpenComputersItems.ButtonGroup.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.ButtonGroup.get(amount = 24),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = OpenComputersItems.Keyboard.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingMV.get(),
                GregTechItems.CircuitBoardPhenolicGood.get(),
                OpenComputersItems.MicrochipTier2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenComputersItems.MicrocontrollerCaseTier1.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingHV.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenComputersItems.MicrocontrollerCaseTier2.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.MicrocontrollerCaseTier1.get(),
                OpenComputersItems.ComponentBusTier2.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorHV.get(amount = 4),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenComputersItems.DroneCaseTier1.get(),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.MicrocontrollerCaseTier2.get(),
                OpenComputersItems.ComponentBusTier3.get(),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Titanium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorEV.get(amount = 4),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenComputersItems.DroneCaseTier2.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Iron,
                    count = 1,
                ),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Gold,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = GT_Values.NF,
            output = OpenComputersItems.CardBase.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Item19.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Plastic,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = OpenComputersItems.FloppyDisk.get(),
            ticks = 200,
            eu = 60,
        )
    }
}
