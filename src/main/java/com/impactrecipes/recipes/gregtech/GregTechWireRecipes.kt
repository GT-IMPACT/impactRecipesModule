package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechWireRecipes {

    internal fun register() {
        MachineRecipes.wireAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.SuperconductorIV.item(OrePrefixes.wireGt02).get(amount = 64),
                Materials.NiobiumTitanium.item(OrePrefixes.foil).get(amount = 64),
            ),
            fluidInput = Materials.Trinium.getMolten(5760L),
            output = GregTechItems.CasingCoilSuperconductor.get(),
            ticks = 3000,
            eu = 7680,
            cleanroom = true,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.SuperconductorLuV.item(OrePrefixes.wireGt02).get(amount = 32),
                Materials.NiobiumTitanium.item(OrePrefixes.foil).get(amount = 32),
            ),
            fluidInput = Materials.Trinium.getMolten(4320L),
            output = GregTechItems.CasingCoilSuperconductor.get(),
            ticks = 2000,
            eu = 30720,
            cleanroom = true,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.SuperconductorZPM.item(OrePrefixes.wireGt02).get(amount = 16),
                Materials.NiobiumTitanium.item(OrePrefixes.foil).get(amount = 16),
            ),
            fluidInput = Materials.Trinium.getMolten(2880L),
            output = GregTechItems.CasingCoilSuperconductor.get(),
            ticks = 1500,
            eu = 122880,
            cleanroom = true,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.SuperconductorUV.item(OrePrefixes.wireGt02).get(amount = 8),
                Materials.NiobiumTitanium.item(OrePrefixes.foil).get(amount = 8),
            ),
            fluidInput = Materials.Trinium.getMolten(1440L),
            output = GregTechItems.CasingCoilSuperconductor.get(),
            ticks = 750,
            eu = 500000,
            cleanroom = true,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Superconductor.item(OrePrefixes.wireGt01).get(amount = 8),
                Materials.NiobiumTitanium.item(OrePrefixes.foil).get(amount = 4),
            ),
            fluidInput = Materials.Trinium.getMolten(720L),
            output = GregTechItems.CasingCoilSuperconductor.get(),
            ticks = 375,
            eu = 2000000,
            cleanroom = true,
        )
    }
}
