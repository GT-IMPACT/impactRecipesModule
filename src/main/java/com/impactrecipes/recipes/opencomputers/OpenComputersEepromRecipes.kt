package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersEepromRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier1.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Gold,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.EEPROM.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier1.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Gold,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.EEPROM.get(),
            ticks = 200,
            eu = 120,
        )

        OpenComputersBootMediaRecipes.luaBios()
    }
}
