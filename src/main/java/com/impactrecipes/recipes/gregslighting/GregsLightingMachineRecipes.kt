package com.impactrecipes.recipes.gregslighting

import com.impactrecipes.items.GregsLightingItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregsLightingMachineRecipes {

    internal fun register() {
        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Bone,
                count = 1,
            ),
            secondaryInput = VanillaItems.Coal1.get(),
            input3 = null,
            input4 = null,
            fluidInput = null,
            fluidOutput = null,
            output = GregsLightingItems.BonemealAndCharcoal.get(),
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Bone,
                count = 1,
            ),
            secondaryInput = VanillaItems.Coal.get(),
            input3 = null,
            input4 = null,
            fluidInput = null,
            fluidOutput = null,
            output = GregsLightingItems.BonemealAndCharcoal.get(),
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CircuitPartsGlassTube.get(),
            secondaryInput = GregsLightingItems.Ic2FilamentAssembly.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(36),
            output = GregsLightingItems.GlowstoneBulb.get(),
            ticks = 160,
            eu = 16,
        )

        MachineRecipes.alloySmelter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Gold,
                count = 1,
            ),
            secondaryInput = VanillaItems.Glowstone.get(amount = 8),
            output = GregsLightingItems.GlowingIngot.get(),
            ticks = 400,
            eu = 48,
        )
    }
}
