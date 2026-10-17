package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class MalisisDeviceCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.PlayerSensor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BRB",
                "hPs",
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'B',
                VanillaItems.StoneButton.get(),
                'P',
                VanillaItems.HeavyWeightedPressurePlate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.VanishingBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SIS",
                "IPI",
                "sId",
                'S',
                OrePrefixes.screw.get(Materials.RedAlloy),
                'I',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                OrePrefixes.plate.get(Materials.EnderPearl),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.VanishingBlock1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SIS",
                "IPI",
                "sId",
                'S',
                OrePrefixes.screw.get(Materials.RedAlloy),
                'I',
                OrePrefixes.stick.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.EnderPearl),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.VanishingBlock2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SIS",
                "IPI",
                "sId",
                'S',
                OrePrefixes.screw.get(Materials.RedAlloy),
                'I',
                OrePrefixes.stick.get(Materials.Gold),
                'P',
                OrePrefixes.plate.get(Materials.EnderPearl),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.VanishingBlock3.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SIS",
                "IPI",
                "sId",
                'S',
                OrePrefixes.screw.get(Materials.RedAlloy),
                'I',
                OrePrefixes.stick.get(Materials.Diamond),
                'P',
                OrePrefixes.plate.get(Materials.EnderPearl),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.BlockMixer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CMC",
                "SOS",
                "GPG",
                'S',
                OrePrefixes.springSmall.get(Materials.Iron),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Iron),
                'O',
                GregTechItems.CasingSolidSteel.get(),
                'C',
                GregTechItems.ConveyorModuleLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'P',
                VanillaItems.StickyPiston.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.DoorFactory.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CMC",
                "SOS",
                "GPG",
                'S',
                OrePrefixes.springSmall.get(Materials.Steel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Steel),
                'O',
                GregTechItems.CasingSolidSteel.get(),
                'C',
                GregTechItems.ConveyorModuleLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'P',
                VanillaItems.StickyPiston.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.RustyHatch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "hHw",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'H',
                MalisisDoorsItems.ItemRustyHandle.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.GarageDoor.get(amount = 5),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "RPR",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemRustyHandle.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SRS",
                "RwR",
                "SRS",
                'S',
                OrePrefixes.stick.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.RustyLadder.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RRR",
                "SwS",
                "RRR",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.stick.get(Materials.Iron),
            ),
        )
    }
}
