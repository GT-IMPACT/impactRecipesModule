package com.impactrecipes.recipes.ztones

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.ZtonesItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ZtonesTileAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 24),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Obsidian,
                count = 1,
            ),
            output = ZtonesItems.Korp.get(amount = 24),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl4.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zech.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 24),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Iron,
                count = 1,
            ),
            output = ZtonesItems.Tank.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 16),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.gem,
                material = Materials.Emerald,
                count = 1,
            ),
            output = ZtonesItems.Sync.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl10.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zkul.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 24),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Rubber,
                count = 1,
            ),
            output = ZtonesItems.Mint.get(amount = 24),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 16),
            secondaryInput = VanillaItems.Netherrack.get(),
            output = ZtonesItems.Lair.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 24),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Brass,
                count = 1,
            ),
            output = ZtonesItems.Sols.get(amount = 24),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 16),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Redstone,
                count = 1,
            ),
            output = ZtonesItems.Reds.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 24),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Steel,
                count = 1,
            ),
            output = ZtonesItems.Ztyl.get(amount = 24),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl8.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Iszm.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 16),
            secondaryInput = VanillaItems.Sandstone.get(),
            output = ZtonesItems.Roen.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 24),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Carbon,
                count = 1,
            ),
            output = ZtonesItems.Vect.get(amount = 24),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 16),
            secondaryInput = VanillaItems.Ice.get(),
            output = ZtonesItems.Lave.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl11.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zest.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl15.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zyth.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 16),
            secondaryInput = VanillaItems.Wool.get(),
            output = ZtonesItems.Bitt.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Glass.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Glaxx.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Agon.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl3.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zone.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl14.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zoea.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 24),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Gold,
                count = 1,
            ),
            output = ZtonesItems.Jelt.get(amount = 24),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl13.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zeta.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 24),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Wood,
                count = 1,
            ),
            output = ZtonesItems.Reed.get(amount = 24),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = VanillaItems.HardenedClay.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Cray.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl9.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Fort.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 24),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Cobalt,
                count = 1,
            ),
            output = ZtonesItems.Vena.get(amount = 24),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 16),
            secondaryInput = ChiselItems.Concrete.get(),
            output = ZtonesItems.Kryp.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl7.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zion.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl6.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zome.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl12.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zane.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.StoneTile.get(amount = 16),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.gem,
                material = Materials.Lapis,
                count = 1,
            ),
            output = ZtonesItems.Azur.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ZtonesItems.Ztyl5.get(amount = 16),
            secondaryInput = ZtonesItems.Aurora.get(),
            output = ZtonesItems.Zorg.get(amount = 16),
            ticks = 100,
            eu = 8,
        )
    }
}
