package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ComputeryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.SubTag
import gregtech.api.util.GT_Utility

internal class RailcraftControlCircuitRecipes {

    internal fun register() {
        for (tMat in Materials.values()) {
            if (tMat.mStandardMoltenFluid != null && tMat.contains(SubTag.SOLDERING_MATERIAL) && !(GregTech_API.mUseOnlyGoodSolderingMaterials && !(tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD)))) {
                val tMultiplier = if (tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD)) {
                    1
                } else {
                    if (tMat.contains(SubTag.SOLDERING_MATERIAL_BAD)) {
                        4
                    } else {
                        2
                    }
                }

                MachineRecipes.circuitAssembler(
                    inputs = arrayOf(
                        GregTechItems.CircuitBoardPhenolicGood.get(),
                        RecipeItems.ore(
                            prefix = OrePrefixes.plate,
                            material = Materials.RedAlloy,
                            count = 1,
                        ),
                        GregTechItems.CircuitPartsResistor.get(amount = 2),
                        RecipeItems.ore(
                            prefix = OrePrefixes.wireFine,
                            material = Materials.Tin,
                            count = 2,
                        ),
                    ),
                    fluidInput = tMat.getMolten(144L * tMultiplier / 2L),
                    output = ComputeryItems.MetaItem3.get(),
                    ticks = 200,
                    eu = 12,
                )

                MachineRecipes.circuitAssembler(
                    inputs = arrayOf(
                        GregTechItems.CircuitBoardPhenolicGood.get(),
                        RecipeItems.ore(
                            prefix = OrePrefixes.plate,
                            material = Materials.RedAlloy,
                            count = 1,
                        ),
                        GregTechItems.CircuitPartsResistorSMD.get(amount = 2),
                        RecipeItems.ore(
                            prefix = OrePrefixes.wireFine,
                            material = Materials.Tin,
                            count = 2,
                        ),
                    ),
                    fluidInput = tMat.getMolten(144L * tMultiplier / 2L),
                    output = ComputeryItems.MetaItem3.get(),
                    ticks = 200,
                    eu = 12,
                )

                MachineRecipes.circuitAssembler(
                    inputs = arrayOf(
                        OpenComputersItems.DataCardTier1.get(),
                        GregTechItems.SensorLV.get(),
                        OpenComputersItems.NetworkCard.get(amount = 2),
                        RecipeItems.ore(
                            prefix = OrePrefixes.bolt,
                            material = Materials.Electrum,
                            count = 8,
                        ),
                        GT_Utility.getIntegratedCircuit(1),
                    ),
                    fluidInput = tMat.getMolten(144L * tMultiplier / 2L),
                    output = ComputeryItems.OcComponents.get(),
                    ticks = 300,
                    eu = 120,
                )
            }
        }
    }
}
