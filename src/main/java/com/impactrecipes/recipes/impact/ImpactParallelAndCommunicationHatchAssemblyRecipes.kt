package com.impactrecipes.recipes.impact

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactParallelAndCommunicationHatchAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.slab,
                    material = Materials.Wood,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Wood,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.SawCase.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ULVConveyorModule.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.SawMillConveyor.get(amount = 5),
            ticks = 60,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullHV.get(),
                GregTechItems.FieldGeneratorHV.get(amount = 2),
                GregTechItems.EmitterHV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.BlueSteel,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.CommunicationHatchTransmitter.get(),
            ticks = 40 * 20,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullHV.get(),
                GregTechItems.FieldGeneratorHV.get(amount = 2),
                GregTechItems.SensorHV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.BlueSteel,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.CommunicationHatchReceiver.get(),
            ticks = 40 * 20,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                AE2Items.Item4kCraftingStorage.get(),
                GregTechItems.SensorIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.ParallelHatchIN4.get(),
            ticks = 600,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                AE2Items.Item4kCraftingStorage.get(),
                GregTechItems.EmitterIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.ParallelHatchOUT4.get(),
            ticks = 600,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                AE2Items.Item16kCraftingStorage.get(),
                GregTechItems.SensorLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.ParallelHatchIN16.get(),
            ticks = 800,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                AE2Items.Item16kCraftingStorage.get(),
                GregTechItems.EmitterLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.ParallelHatchOUT16.get(),
            ticks = 800,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                AE2Items.Item64kCraftingStorage.get(),
                GregTechItems.SensorZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.ParallelHatchIN64.get(),
            ticks = 1000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                AE2Items.Item64kCraftingStorage.get(),
                GregTechItems.EmitterZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.ParallelHatchOUT64.get(),
            ticks = 1000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                AE2Items.Item256kCraftingStorage.get(),
                GregTechItems.SensorUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.ParallelHatchIN256.get(),
            ticks = 1200,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                AE2Items.Item256kCraftingStorage.get(),
                GregTechItems.EmitterUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.ParallelHatchOUT256.get(),
            ticks = 1200,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ComputerCasing.get(),
                GregTechItems.HatchInputBusIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                GregTechItems.CircuitPartsGlassFiber.get(amount = 16),
            ),
            fluid = Materials.TungstenSteel.getMolten(1296),
            output = ImpactItems.ParallelHatchRack.get(),
            ticks = 400,
            eu = 7680,
        )
    }
}
