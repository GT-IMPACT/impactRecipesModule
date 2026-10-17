package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ExtraUtilitiesGlassSmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Obsidian,
                count = 4,
            ),
            output = ExtraUtilitiesItems.ObsidainGlass.get(),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.alloySmelter(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Gold,
                count = 1,
            ),
            output = ExtraUtilitiesItems.GoldenEdgeGlass.get(),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.alloySmelter(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = VanillaItems.Gunpowder.get(),
            output = ExtraUtilitiesItems.CarvedGlass.get(),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.alloySmelter(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = GregTechItems.GtMetaitem0117811.get(),
            output = ExtraUtilitiesItems.DecorativeBlock27.get(),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.alloySmelter(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = VanillaItems.Dye9.get(),
            output = ExtraUtilitiesItems.HeartGlass.get(),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Sand.get(),
            secondaryInput = VanillaItems.Glass.get(),
            output = ExtraUtilitiesItems.ThickenedGlass.get(amount = 2),
            ticks = 200,
            eu = 6,
        )
    }
}
