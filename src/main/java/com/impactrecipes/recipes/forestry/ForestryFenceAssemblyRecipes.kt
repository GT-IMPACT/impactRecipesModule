package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.NaturaItems
import com.impactrecipes.util.MachineRecipes
import cpw.mods.fml.common.Loader
import gregtech.api.enums.Materials

internal class ForestryFenceAssemblyRecipes {

    internal fun register() {
        if (Loader.isModLoaded("Natura")) {
            MachineRecipes.assembler(
                inputs = arrayOf(
                    NaturaItems.NaturaFence.get(),
                    GregTechItems.PlankOak.get(),
                ),
                fluidInput = Materials.Redstone.getMolten(72),
                output = ImpactItems.PistonPlate.get(),
                ticks = 100,
                eu = 30,
                cleanroom = false,
            )
        }

        MachineRecipes.assembler(
            inputs = arrayOf(
                ForestryItems.Fences.get(),
                GregTechItems.PlankOak.get(),
            ),
            fluidInput = Materials.Redstone.getMolten(72),
            output = ImpactItems.PistonPlate.get(),
            ticks = 100,
            eu = 30,
            cleanroom = false,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ForestryItems.FencesFireproof.get(),
                GregTechItems.PlankOak.get(),
            ),
            fluidInput = Materials.Redstone.getMolten(72),
            output = ImpactItems.PistonPlate.get(),
            ticks = 100,
            eu = 30,
            cleanroom = false,
        )
    }
}
