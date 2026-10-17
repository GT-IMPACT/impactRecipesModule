package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ForestryBackpackRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.ApiaristBag.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'B',
                BackpackItems.SmallBackpack.get(),
                'C',
                ForestryItems.ApicultureChest.get(),
                'W',
                "blockWool",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.LepidopteristBag.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'B',
                BackpackItems.SmallBackpack.get(),
                'C',
                ForestryItems.Lepidopterology.get(),
                'W',
                "blockWool",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.MinerBag.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'B',
                BackpackItems.SmallBackpack.get(),
                'C',
                OrePrefixes.plate.get(Materials.Iron),
                'W',
                "blockWool",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.DiggerBag.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'B',
                BackpackItems.SmallBackpack.get(),
                'C',
                "stone",
                'W',
                "blockWool",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.ForesterBag.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'B',
                BackpackItems.SmallBackpack.get(),
                'C',
                "logWood",
                'W',
                "blockWool",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.HunterBag.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'B',
                BackpackItems.SmallBackpack.get(),
                'C',
                VanillaItems.Feather.get(),
                'W',
                "blockWool",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.BuilderBag.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'B',
                BackpackItems.SmallBackpack.get(),
                'C',
                VanillaItems.Fence.get(),
                'W',
                "blockWool",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.MinerBagT2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'B',
                ForestryItems.MinerBag.get(),
                'C',
                BackpackItems.MediumBackpack.get(),
                'W',
                BackpackItems.TannedLeather.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.DiggerBagT2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'B',
                ForestryItems.DiggerBag.get(),
                'C',
                BackpackItems.MediumBackpack.get(),
                'W',
                BackpackItems.TannedLeather.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.ForesterBagT2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'B',
                ForestryItems.ForesterBag.get(),
                'C',
                BackpackItems.MediumBackpack.get(),
                'W',
                BackpackItems.TannedLeather.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.HunterBagT2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'B',
                ForestryItems.HunterBag.get(),
                'C',
                BackpackItems.MediumBackpack.get(),
                'W',
                BackpackItems.TannedLeather.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.BuilderBagT2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WRW",
                "WBW",
                "WCW",
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'B',
                ForestryItems.BuilderBag.get(),
                'C',
                BackpackItems.MediumBackpack.get(),
                'W',
                BackpackItems.TannedLeather.get(),
            ),
        )
    }
}
