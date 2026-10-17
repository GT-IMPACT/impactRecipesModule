package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import cpw.mods.fml.common.Loader
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry

internal class IC2ScriptMachineRecipes {

    internal fun register() {
        MachineRecipes.arcFurnace(
            input = IC2Items.Fluidbottler.get(),
            fluidInput = Materials.Oxygen.getGas(8208),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Steel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.AnnealedCopper,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Bronze,
                    count = 9,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Tin,
                    count = 31,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 2280,
            eu = 96,
        )

        if (Loader.isModLoaded("Forestry")) {
            MachineRecipes.arcFurnace(
                input = ForestryItems.RainTank.get(),
                fluidInput = Materials.Oxygen.getGas(1872),
                outputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.ingot,
                        material = Materials.WroughtIron,
                        count = 13,
                    ),
                ),
                chances = intArrayOf(10000),
                ticks = 520,
                eu = 96,
            )
        }

        MachineRecipes.ic2Compressor(
            input = IC2Items.Uran238.get(amount = 9),
            output = IC2Items.UraniumBlock.get(),
        )

        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.RawRubber,
                count = 1,
            ),
            secondaryInput = null,
            input3 = null,
            input4 = null,
            fluidInput = Materials.Concrete.getMolten(576),
            fluidOutput = FluidRegistry.getFluidStack(
                "ic2constructionfoam",
                8000,
            ),
            output = null,
            ticks = 20,
            eu = 16,
        )
    }
}
