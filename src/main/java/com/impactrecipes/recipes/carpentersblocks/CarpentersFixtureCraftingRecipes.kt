package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class CarpentersFixtureCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Safe.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SBS",
                "BIB",
                "SdS",
                'B',
                CarpentersBlocksItems.CollapsibleBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'I',
                IC2Items.PersonalSafe.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.DaylightSensor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "BMB",
                "BRB",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'M',
                VanillaItems.DaylightDetector.get(),
                'R',
                OrePrefixes.dust.get(Materials.Redstone),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Bed.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "MMM",
                "BBB",
                "BrB",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'M',
                VanillaItems.Carpet.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Torch.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "TBT",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'T',
                VanillaItems.Torch.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.GarageDoor.get(amount = 5),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BRB",
                "RBR",
                "BRB",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Ladder.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                VanillaItems.Ladder.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Barrier.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                VanillaItems.Fence.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.PressurePlate.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SrS",
                "BRB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'R',
                OrePrefixes.spring.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.FlowerPot.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BMB",
                " B ",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'M',
                VanillaItems.FlowerPot.get(),
            ),
        )
    }
}
