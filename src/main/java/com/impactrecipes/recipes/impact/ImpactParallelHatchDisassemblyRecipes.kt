package com.impactrecipes.recipes.impact

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes

internal class ImpactParallelHatchDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.ParallelHatchIN4.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                AE2Items.Item4kCraftingStorage.get(),
                GregTechItems.SensorIV.get(),
                GregTechItems.CircuitElite.get(amount = 4),
            ),
            ticks = 6000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ParallelHatchOUT4.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                AE2Items.Item4kCraftingStorage.get(),
                GregTechItems.EmitterIV.get(),
                GregTechItems.CircuitElite.get(amount = 4),
            ),
            ticks = 6000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ParallelHatchIN16.get(),
            outputs = arrayOf(
                GregTechItems.HullLuV.get(),
                AE2Items.Item16kCraftingStorage.get(),
                GregTechItems.SensorLuV.get(),
                GregTechItems.CircuitMaster.get(amount = 4),
            ),
            ticks = 8000,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ParallelHatchOUT16.get(),
            outputs = arrayOf(
                GregTechItems.HullLuV.get(),
                AE2Items.Item16kCraftingStorage.get(),
                GregTechItems.EmitterLuV.get(),
                GregTechItems.CircuitMaster.get(amount = 4),
            ),
            ticks = 8000,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ParallelHatchIN64.get(),
            outputs = arrayOf(
                GregTechItems.HullZPM.get(),
                AE2Items.Item64kCraftingStorage.get(),
                GregTechItems.SensorZPM.get(),
                GregTechItems.CircuitQuantummainframe.get(amount = 4),
            ),
            ticks = 10000,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ParallelHatchOUT64.get(),
            outputs = arrayOf(
                GregTechItems.HullZPM.get(),
                AE2Items.Item64kCraftingStorage.get(),
                GregTechItems.EmitterZPM.get(),
                GregTechItems.CircuitQuantummainframe.get(amount = 4),
            ),
            ticks = 10000,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ParallelHatchIN256.get(),
            outputs = arrayOf(
                GregTechItems.HullUV.get(),
                AE2Items.Item256kCraftingStorage.get(),
                GregTechItems.SensorUV.get(),
                GregTechItems.CircuitCrystalmainframe.get(amount = 4),
            ),
            ticks = 12000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ParallelHatchOUT256.get(),
            outputs = arrayOf(
                GregTechItems.HullUV.get(),
                AE2Items.Item256kCraftingStorage.get(),
                GregTechItems.EmitterUV.get(),
                GregTechItems.CircuitCrystalmainframe.get(amount = 4),
            ),
            ticks = 12000,
            eu = 500000,
        )
    }
}
