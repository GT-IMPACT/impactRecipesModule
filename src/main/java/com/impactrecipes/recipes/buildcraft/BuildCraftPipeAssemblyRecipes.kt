package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.items.BuildCraftTransportItems
import com.impactrecipes.items.ForgeMicroblockItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class BuildCraftPipeAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Wood,
                    count = 2,
                ),
                VanillaItems.GlassPane.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemswood.get(amount = 4),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.CobblestoneRod.get(amount = 4),
                VanillaItems.GlassPane.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemscobblestone.get(amount = 4),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ForgeMicroblockItems.StoneRod.get(amount = 4),
                VanillaItems.GlassPane.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsstone.get(amount = 4),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.NetherQuartz,
                    count = 2,
                ),
                VanillaItems.GlassPane.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsquartz.get(amount = 4),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.SandstoneRod.get(amount = 4),
                VanillaItems.GlassPane.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemssandstone.get(amount = 4),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Iron,
                    count = 2,
                ),
                VanillaItems.GlassPane.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsiron.get(amount = 4),
            ticks = 100,
            eu = 24,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Gold,
                    count = 2,
                ),
                VanillaItems.GlassPane.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsgold.get(amount = 4),
            ticks = 100,
            eu = 48,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Diamond,
                    count = 4,
                ),
                VanillaItems.GlassPane.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsdiamond.get(amount = 8),
            ticks = 200,
            eu = 64,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Emerald,
                    count = 4,
                ),
                VanillaItems.GlassPane.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsemerald.get(amount = 8),
            ticks = 200,
            eu = 64,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                BuildCraftTransportItems.ItemBuildcraftPipePipeitemscobblestone.get(),
                VanillaItems.Cobblestone.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = BuildCraftTransportItems.ItemBuildcraftPipePipestructurecobblestone.get(),
            ticks = 25,
            eu = 16,
        )
    }
}
