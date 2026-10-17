package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2BlockCuttingRecipes {

    internal fun register() {
        MachineRecipes.cutter(
            input = AE2Items.SkyStone.get(),
            output = AE2Items.SkyStoneSlab.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = AE2Items.SkyStoneBlock.get(),
            output = AE2Items.SkyStoneBlockSlab.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = AE2Items.SkyStoneBrick.get(),
            output = AE2Items.SkyStoneBrickSlab.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = AE2Items.SkyStoneSmallBrick.get(),
            output = AE2Items.SkyStoneSmallBrickSlab.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = AE2Items.FluixBlock.get(),
            output = AE2Items.FluixSlab.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = AE2Items.ChiseledCertusQuartzBlock.get(),
            output = AE2Items.ChiseledCertusQuartzSlab.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = AE2Items.CertusQuartzPillar.get(),
            output = AE2Items.CertusQuartzPillarSlab.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = AE2Items.CertusQuartzBlock.get(),
            output = AE2Items.CertusQuartzSlab.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = VanillaItems.StoneSlab7.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.NetherQuartz,
                count = 2,
            ),
            secondaryOutput = GT_Values.NI,
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = AE2Items.CertusQuartzSlab.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.CertusQuartz,
                count = 2,
            ),
            secondaryOutput = GT_Values.NI,
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Iron,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Copper,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Bronze,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 6),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Tin,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Steel,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 8),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Aluminium,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 8),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Lead,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Nickel,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Silver,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Brass,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 6),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Invar,
                count = 1,
            ),
            output = AE2Items.CableAnchor.get(amount = 6),
            secondaryOutput = GT_Values.NI,
            ticks = 80,
            eu = 8,
        )
    }
}
