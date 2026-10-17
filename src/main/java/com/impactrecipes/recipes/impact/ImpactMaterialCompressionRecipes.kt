package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactMaterialCompressionRecipes {

    internal fun register() {
        MachineRecipes.compressor(
            input = ImpactItems.CokeOvenBrick.get(amount = 4),
            output = GregTechItems.CasingCokeOvenBrick.get(),
            ticks = 200,
            eu = 8,
        )

        MachineRecipes.compressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.gem,
                material = Materials.CokeCoal,
                count = 9,
            ),
            output = ImpactItems.CoalStorageBlock.get(),
            ticks = 200,
            eu = 8,
        )

        MachineRecipes.compressor(
            input = ImpactItems.ClearGlassDust.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glass,
                count = 1,
            ),
            ticks = 200,
            eu = 2,
        )

        MachineRecipes.compressor(
            input = ImpactItems.SunnariumPiece.get(amount = 9),
            output = ImpactItems.Sunnarium.get(),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.compressor(
            input = GalaxySpaceItems.Barnardacleaves.get(amount = 16),
            output = ImpactItems.BarnardaCBall.get(),
            ticks = 200,
            eu = 8,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalStorageBlock.get(amount = 9),
            output = ImpactItems.CoalBlock1.get(),
            ticks = 100,
            eu = 20,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalBlock1.get(amount = 9),
            output = ImpactItems.CoalBlock2.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalBlock2.get(amount = 9),
            output = ImpactItems.CoalBlock3.get(),
            ticks = 100,
            eu = 480,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalBlock3.get(amount = 9),
            output = ImpactItems.CoalBlock4.get(),
            ticks = 100,
            eu = 1920,
        )

        MachineRecipes.compressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.block,
                material = Materials.Charcoal,
                count = 9,
            ),
            output = ImpactItems.CoalBlock5.get(),
            ticks = 120,
            eu = 20,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalBlock5.get(amount = 9),
            output = ImpactItems.CoalBlock6.get(),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalBlock6.get(amount = 9),
            output = ImpactItems.CoalBlock7.get(),
            ticks = 120,
            eu = 480,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalBlock7.get(amount = 9),
            output = ImpactItems.CoalBlock8.get(),
            ticks = 120,
            eu = 1920,
        )

        MachineRecipes.compressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.block,
                material = Materials.Coal,
                count = 9,
            ),
            output = ImpactItems.CoalBlock9.get(),
            ticks = 110,
            eu = 20,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalBlock9.get(amount = 9),
            output = ImpactItems.CoalBlock10.get(),
            ticks = 110,
            eu = 120,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalBlock10.get(amount = 9),
            output = ImpactItems.CoalBlock11.get(),
            ticks = 110,
            eu = 480,
        )

        MachineRecipes.compressor(
            input = ImpactItems.CoalBlock11.get(amount = 9),
            output = ImpactItems.CoalBlock12.get(),
            ticks = 110,
            eu = 1920,
        )

        MachineRecipes.compressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Naquadah,
                count = 4,
            ),
            output = ImpactItems.Naquadah.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.compressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.NaquadahEnriched,
                count = 4,
            ),
            output = ImpactItems.NaquadahE.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.compressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Thorium,
                count = 1,
            ),
            output = ImpactItems.ThoriumNuclearPart.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.compressor(
            input = ImpactItems.PetcokeDust.get(amount = 9),
            output = ImpactItems.PetCokeGem.get(),
            ticks = 300,
            eu = 2,
        )
    }
}
