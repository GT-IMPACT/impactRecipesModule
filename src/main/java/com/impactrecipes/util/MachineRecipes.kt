package com.impactrecipes.util

import com.impact.impact
import gregtech.api.enums.GT_Values.RA
import net.minecraft.item.ItemStack
import net.minecraftforge.fluids.FluidStack

/** Do not let GT register a cheaper recipe by silently dropping null ingredients. */
public object MachineRecipes {

    @JvmStatic
    public fun assembler(
        inputs: Array<out ItemStack?>,
        fluid: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ): Unit {
        val id = "assembler: ${CraftingRecipes.describe(output = output)}"
        val isValid = CraftingRecipes.valid(
            id = id,
            output = output,
            ingredients = inputs,
        )
        if (!isValid) {
            return
        }

        RecipeDiagnostics.attempt(
            id = id,
            rejectedReason = "GregTech rejected the assembler recipe. Check inputs, fluid, time and EU/t.",
        ) {
            RA.addAssemblerRecipe(
                inputs,
                fluid,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun meSystemProvider(
        inputs: Array<out ItemStack?>,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
        particles: Int,
    ): Unit {
        val id = "ME System Provider: ${CraftingRecipes.describe(output = output)}"
        val isValid = CraftingRecipes.valid(
            id = id,
            output = output,
            ingredients = inputs,
        )
        if (!isValid) {
            return
        }

        RecipeDiagnostics.attempt(
            id = id,
            rejectedReason = "IMPACT rejected the ME System Provider recipe. Check inputs, time, EU/t and particles.",
        ) {
            impact.I_RA.addMESPRecipes(
                inputs,
                output,
                ticks,
                eu,
                particles,
            )
        }
    }
}
