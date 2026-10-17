package com.impactrecipes.recipes.gendustry

import com.impactrecipes.items.GendustryItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GendustryComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = ImpactItems.IndustryFrame.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.circuit,
                material = Materials.Elite,
                count = 1,
            ),
            fluidInput = Materials.Mutagen.getFluid(100),
            output = GendustryItems.UpgradeFrame.get(),
            ticks = 400,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = ImpactItems.GeneticCircuit.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.circuit,
                material = Materials.Elite,
                count = 1,
            ),
            fluidInput = Materials.Mutagen.getFluid(500),
            output = GendustryItems.GeneticsProcessor.get(),
            ticks = 400,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = ImpactItems.EnvironmentalCircuit.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.circuit,
                material = Materials.Elite,
                count = 1,
            ),
            fluidInput = Materials.Bacteria.getFluid(500),
            output = GendustryItems.EnvProcessor.get(),
            ticks = 400,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Diamond,
                    count = 2,
                ),
                VanillaItems.GlassBottle.get(amount = 4),
            ),
            fluidInput = null,
            output = GendustryItems.Labware.get(),
            ticks = 200,
            eu = 1920,
            cleanroom = true,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.HSSG,
                count = 1,
            ),
            secondaryInput = IC2Items.EjectorUpgrade.get(),
            output = GendustryItems.EjectCover.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.HSSG,
                count = 1,
            ),
            secondaryInput = IC2Items.PullingUpgrade.get(),
            output = GendustryItems.ImportCover.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.HSSG,
                count = 1,
            ),
            secondaryInput = IC2Items.RedstoneInverterUpgrade.get(),
            output = GendustryItems.ErrorSensorCover.get(),
            ticks = 200,
            eu = 7680,
        )
    }
}
