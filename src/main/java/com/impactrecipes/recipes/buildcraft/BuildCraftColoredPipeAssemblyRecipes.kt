package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.items.BuildCraftTransportItems
import com.impactrecipes.items.ForgeMicroblockItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class BuildCraftColoredPipeAssemblyRecipes {

    internal fun register() {
        for (i in 0 until 16) {
            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.stickLong,
                        material = Materials.Wood,
                        count = 2,
                    ),
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemswood,
                    meta = i + 1,
                ).get(amount = 4),
                ticks = 100,
                eu = 16,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ImpactItems.CobblestoneRod.get(amount = 4),
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemscobblestone,
                    meta = i + 1,
                ).get(amount = 4),
                ticks = 100,
                eu = 16,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ForgeMicroblockItems.StoneRod1.get(amount = 4),
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsstone,
                    meta = i + 1,
                ).get(amount = 4),
                ticks = 100,
                eu = 16,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.stick,
                        material = Materials.NetherQuartz,
                        count = 4,
                    ),
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsquartz,
                    meta = i + 1,
                ).get(amount = 4),
                ticks = 100,
                eu = 16,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ImpactItems.SandstoneRod.get(amount = 4),
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemssandstone,
                    meta = i + 1,
                ).get(amount = 4),
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
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsiron,
                    meta = i + 1,
                ).get(amount = 4),
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
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsgold,
                    meta = i + 1,
                ).get(amount = 4),
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
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.circuit,
                        material = Materials.Basic,
                        count = 1,
                    ),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsdiamond,
                    meta = i + 1,
                ).get(amount = 8),
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
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.circuit,
                        material = Materials.Good,
                        count = 1,
                    ),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsemerald,
                    meta = i + 1,
                ).get(amount = 8),
                ticks = 200,
                eu = 64,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemscobblestone,
                        meta = i + 1,
                    ).get(),
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
}
