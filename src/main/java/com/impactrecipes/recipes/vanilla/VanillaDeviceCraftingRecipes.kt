package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.ToolDictNames
import gregtech.api.util.GT_ModHandler

internal class VanillaDeviceCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.CraftingTable.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WW",
                "WW",
                'W',
                "logWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Chest.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WWW",
                "W W",
                "WWW",
                'W',
                "plankWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.TrappedChest.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " T ",
                "SCS",
                " d ",
                'C',
                VanillaItems.Chest.get(),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'T',
                VanillaItems.TripwireHook.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Dispenser.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CRC",
                "SMS",
                "GWG",
                'C',
                "cobblestone",
                'S',
                OrePrefixes.spring.get(Materials.Iron),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Iron),
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'M',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Dropper.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CRC",
                "SMS",
                "GWG",
                'C',
                "cobblestone",
                'S',
                OrePrefixes.springSmall.get(Materials.Iron),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Iron),
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'M',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StickyPiston.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "r",
                "S",
                "P",
                'S',
                "slimeball",
                'P',
                VanillaItems.Piston.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StickyPiston.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "r",
                "S",
                "P",
                'S',
                IC2Items.Resin.get(),
                'P',
                VanillaItems.Piston.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Noteblock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "BGB",
                "PWP",
                'P',
                "plankWood",
                'B',
                VanillaItems.IronBars.get(),
                'G',
                OrePrefixes.gearGt.get(Materials.Wood),
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Jukebox.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LBL",
                "NRN",
                "LGL",
                'L',
                "plankWood",
                'N',
                VanillaItems.Noteblock.get(),
                'G',
                OrePrefixes.gearGt.get(Materials.Iron),
                'B',
                OrePrefixes.bolt.get(Materials.Diamond),
                'R',
                "record",
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = VanillaItems.LitPumpkin.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                VanillaItems.Pumpkin.get(),
                VanillaItems.Torch.get(),
                ToolDictNames.craftingToolKnife,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Trapdoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SSS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                VanillaItems.WoodenSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Trapdoor.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                VanillaItems.WoodenSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Trapdoor.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                VanillaItems.WoodenSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StonePressurePlate.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ShS",
                "BPB",
                "SdS",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.spring.get(Materials.Iron),
                'B',
                VanillaItems.StoneSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.WoodenPressurePlate.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ShS",
                "BPB",
                "SdS",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.spring.get(Materials.Iron),
                'B',
                "slabWood",
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = VanillaItems.GlassPane.get(amount = 2),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolSaw,
                VanillaItems.Glass.get(),
            ),
        )
    }
}
