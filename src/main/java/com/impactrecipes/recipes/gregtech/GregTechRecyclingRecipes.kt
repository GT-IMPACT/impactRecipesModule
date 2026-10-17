package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechRecyclingRecipes {

    internal fun arcFurnace() {
        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingBronzePlatedBricks.get(),
            outputs = arrayOf<ItemStack?>(
                Materials.Bronze.item(OrePrefixes.ingot).get(amount = 4),
                Materials.Stone.item(OrePrefixes.dust).get(),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )
    }

    internal fun centrifuging() {
        MachineRecipes.centrifuge(
            input = GregTechItems.AdsorptionFilterDirty.get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Pollution.getFluid(100),
            output = GregTechItems.AdsorptionFilterCasing.get(),
            secondaryOutput = Materials.Coal.item(OrePrefixes.dust).get(amount = 8),
            output3 = Materials.DarkAsh.item(OrePrefixes.dust).get(amount = 8),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                9900,
                10000,
                10000,
            ),
            ticks = 800,
            eu = 480,
        )

        // --- Greywacke Dust
        MachineRecipes.centrifuge(
            input = Materials.Greywacke.item(OrePrefixes.dust).get(amount = 8),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.SiliconDioxide.item(OrePrefixes.dust).get(amount = 4),
            secondaryOutput = Materials.CertusQuartz.item(OrePrefixes.dust).get(),
            output3 = Materials.Quartzite.item(OrePrefixes.dust).get(),
            output4 = Materials.GarnetRed.item(OrePrefixes.dust).get(),
            output5 = Materials.GarnetYellow.item(OrePrefixes.dust).get(),
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 400,
            eu = 8,
        )
    }
}
