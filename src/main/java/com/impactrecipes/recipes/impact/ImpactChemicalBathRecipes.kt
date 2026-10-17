package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import com.impactrecipes.util.asNonConsumable
import gregtech.api.enums.Dyes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class ImpactChemicalBathRecipes {

    internal fun register() {
        MachineRecipes.chemicalBath(
            input = ImpactItems.UtilityBlock.get(),
            fluid = FluidStack(
                FluidRegistry.getFluid("dye.chemical.dyewhite"),
                18,
            ),
            output = ImpactItems.UtilBlock2.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(
                10000,
            ),
            ticks = 64,
            eu = 2,
        )

        MachineRecipes.chemicalBath(
            input = ImpactItems.UtilityBlock.get(),
            fluid = FluidStack(
                FluidRegistry.getFluid("dye.watermixed.dyewhite"),
                18,
            ),
            output = ImpactItems.UtilBlock2.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(
                10000,
            ),
            ticks = 64,
            eu = 2,
        )

        MachineRecipes.chemicalBath(
            input = RecipeItems.ore(
                prefix = OrePrefixes.lens,
                material = Materials.ReinforcedGlass,
                count = 1,
            ),
            fluid = Materials.Chlorine.getGas(100),
            output = ImpactItems.RefinedReinforcedGlassLense.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = null,
            ticks = 600,
            eu = 16,
        )

        MachineRecipes.chemicalBath(
            input = ImpactItems.RefinedReinforcedGlassLense.get(),
            fluid = Materials.Radon.getGas(250),
            output = ImpactItems.ChargedGlassLense.get(),
            secondaryOutput = null,
            output3 = null,
            chances = null,
            ticks = 384,
            eu = 480,
        )

        MachineRecipes.chemicalBath(
            input = ImpactItems.HugeRefinedReinforcedGlassLense.get(),
            fluid = Materials.Radon.getGas(1250),
            output = ImpactItems.HugeChargedGlassLense.get(),
            secondaryOutput = null,
            output3 = null,
            chances = null,
            ticks = 384,
            eu = 1920,
        )

        MachineRecipes.laserEngraver(
            input = ImpactItems.RefinedReinforcedGlassLense.get(amount = 3),
            lens = RecipeItems.ore(
                prefix = OrePrefixes.lens,
                material = Materials.Diamond,
                count = 1,
            )?.asNonConsumable(),
            output = ImpactItems.HugeRefinedReinforcedGlassLense.get(),
            ticks = 2400,
            eu = 2000,
            cleanroom = false,
        )

        for (i in 1 until 16) {
            if (i != 0) {
                MachineRecipes.chemicalBath(
                    input = ModItemVariant(
                        item = ImpactItems.IndustrialGlass0,
                        meta = i,
                    ).get(),
                    fluid = Materials.Chlorine.getGas(50),
                    output = ImpactItems.IndustrialGlass0.get(amount = 0),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 200,
                    eu = 2,
                )
            }
        }

        for (i in 0 until 16) {
            for (j in 0 until Dyes.VALUES[i].getSizeOfFluidList()) {
                if (i != 15) {
                    MachineRecipes.chemicalBath(
                        input = ImpactItems.IndustrialGlass0.get(),
                        fluid = Dyes.VALUES[i].getFluidDye(
                            j,
                            18,
                        ),
                        output = ModItemVariant(
                            item = ImpactItems.IndustrialGlass0,
                            meta = 15 - i,
                        ).get(),
                        secondaryOutput = GT_Values.NI,
                        output3 = GT_Values.NI,
                        chances = null,
                        ticks = 200,
                        eu = 2,
                    )
                }
            }
        }

        MachineRecipes.chemicalBath(
            input = ImpactItems.RefinedReinforcedGlassLense.get(),
            fluid = Materials.PulsatingIron.getMolten(72),
            output = VanillaItems.EnderPearl.get(),
            secondaryOutput = null,
            output3 = null,
            chances = null,
            ticks = 1000,
            eu = 30,
        )

        MachineRecipes.chemicalBath(
            input = ImpactItems.RTRMFoil.get(),
            fluid = Materials.AmmoniumPersulfate.getFluid(200),
            output = ImpactItems.PGFoil.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Copper,
                count = 1,
            ),
            output3 = null,
            chances = null,
            ticks = 300,
            eu = 120,
        )
    }
}
