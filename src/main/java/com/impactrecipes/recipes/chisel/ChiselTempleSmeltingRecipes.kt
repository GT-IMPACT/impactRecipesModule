package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ChiselTempleSmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lazurite,
                count = 1,
            ),
            output = ChiselItems.Templeblock.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lapis,
                count = 1,
            ),
            output = ChiselItems.Templeblock.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Sodalite,
                count = 1,
            ),
            output = ChiselItems.Templeblock.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lazurite,
                count = 1,
            ),
            output = ChiselItems.Templeblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lapis,
                count = 1,
            ),
            output = ChiselItems.Templeblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Sodalite,
                count = 1,
            ),
            output = ChiselItems.Templeblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Cobalt,
                count = 1,
            ),
            output = ChiselItems.Templeblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Cobalt,
                count = 1,
            ),
            output = ChiselItems.Templeblock.get(amount = 64),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Obsidian,
                count = 1,
            ),
            output = ChiselItems.Voidstone.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Obsidian,
                count = 1,
            ),
            output = ChiselItems.Voidstone.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.BlackBronze,
                count = 1,
            ),
            output = ChiselItems.Voidstone.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.BlackBronze,
                count = 1,
            ),
            output = ChiselItems.Voidstone.get(amount = 64),
            ticks = 100,
            eu = 8,
        )
    }
}
