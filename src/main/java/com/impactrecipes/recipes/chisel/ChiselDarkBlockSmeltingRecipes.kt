package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ChiselDarkBlockSmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = VanillaItems.GlowstoneDust.get(),
            output = ChiselItems.AntiBlock15.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = VanillaItems.GlowstoneDust.get(),
            output = ChiselItems.AntiBlock15.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = VanillaItems.Redstone.get(),
            output = ChiselItems.Futura.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = VanillaItems.Redstone.get(),
            output = ChiselItems.Futura.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.RedAlloy,
                count = 1,
            ),
            output = ChiselItems.Futura.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.RedAlloy,
                count = 1,
            ),
            output = ChiselItems.Futura.get(amount = 64),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Coal,
                count = 1,
            ),
            output = ChiselItems.Grimstone.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Coal,
                count = 1,
            ),
            output = ChiselItems.Grimstone.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Charcoal,
                count = 1,
            ),
            output = ChiselItems.Grimstone.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Charcoal,
                count = 1,
            ),
            output = ChiselItems.Grimstone.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            output = ChiselItems.Grimstone.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            output = ChiselItems.Grimstone.get(amount = 64),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DarkAsh,
                count = 1,
            ),
            output = ChiselItems.Grimstone.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DarkAsh,
                count = 1,
            ),
            output = ChiselItems.Grimstone.get(amount = 64),
            ticks = 100,
            eu = 8,
        )
    }
}
