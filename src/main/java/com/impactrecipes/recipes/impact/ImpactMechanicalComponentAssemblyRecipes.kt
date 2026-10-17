package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_OreDictUnificator
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class ImpactMechanicalComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.cobblestone,
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Iron,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(72),
            output = ImpactItems.UtilBlock1.get(),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.cobblestone,
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Bronze,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(72),
            output = ImpactItems.UtilBlock1.get(),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.cobblestone,
                    2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Steel,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(144),
            output = ImpactItems.UtilBlock1.get(amount = 2),
            ticks = 100,
            eu = 16,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.cobblestone,
                    4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Aluminium,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(216),
            output = ImpactItems.UtilBlock1.get(amount = 4),
            ticks = 200,
            eu = 30,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.cobblestone,
                    8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(288),
            output = ImpactItems.UtilBlock1.get(amount = 8),
            ticks = 300,
            eu = 30,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.cobblestone,
                    16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Titanium,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(576),
            output = ImpactItems.UtilBlock1.get(amount = 16),
            ticks = 400,
            eu = 30,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Fence.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.slab,
                    material = Materials.Wood,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(72),
            output = ImpactItems.PistonPlate.get(),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Iron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.slab,
                    material = Materials.Wood,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(72),
            output = ImpactItems.PistonPlate.get(),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Bronze,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.slab,
                    material = Materials.Wood,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(72),
            output = ImpactItems.PistonPlate.get(),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.slab,
                    material = Materials.Wood,
                    count = 2,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(144),
            output = ImpactItems.PistonPlate.get(amount = 2),
            ticks = 100,
            eu = 16,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.slab,
                    material = Materials.Wood,
                    count = 4,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(216),
            output = ImpactItems.PistonPlate.get(amount = 4),
            ticks = 200,
            eu = 30,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.slab,
                    material = Materials.Wood,
                    count = 8,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(288),
            output = ImpactItems.PistonPlate.get(amount = 8),
            ticks = 300,
            eu = 30,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Titanium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.slab,
                    material = Materials.Wood,
                    count = 16,
                ),
            ),
            fluidInput = Materials.Redstone.getMolten(576),
            output = ImpactItems.PistonPlate.get(amount = 16),
            ticks = 400,
            eu = 30,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            input = ImpactItems.PistonPlate.get(),
            secondaryInput = ImpactItems.UtilBlock1.get(),
            fluidInput = null,
            output = VanillaItems.Piston.get(),
            ticks = 40,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.CallistoIceCompressedPlate.get(),
                ImpactItems.LedoxCompressedPlate.get(),
            ),
            fluid = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                2000,
            ),
            output = ImpactItems.IceCompressedPlate.get(),
            ticks = 1000,
            eu = 480,
        )
    }
}
