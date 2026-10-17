package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.ToolDictNames
import gregtech.api.util.GT_ModHandler

internal class IC2UtilityCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = IC2Items.RubberTrampoline.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Barrel.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "PhP",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Wood),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = IC2Items.CoffeePowder.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolMortar,
                OrePrefixes.crop.get(Materials.Coffee),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.BoatElectric.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PhP",
                "PPP",
                "RMR",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'R',
                OrePrefixes.rotor.get(Materials.Tin),
                'M',
                GregTechItems.ElectricMotorLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.BoatRubber.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PHP",
                "PsP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'H',
                ToolDictNames.craftingToolSoftHammer,
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = IC2Items.BoatRubber.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                IC2Items.BoatRubberBroken.get(),
                OrePrefixes.plate.get(Materials.Rubber),
                OrePrefixes.plate.get(Materials.Rubber),
                ToolDictNames.craftingToolHardHammer,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.ReinforcedDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'P',
                OrePrefixes.plateAlloy.get(Materials.Advanced),
                'S',
                OrePrefixes.screw.get(Materials.Lead),
                'R',
                OrePrefixes.ring.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Painter.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WWW",
                " S ",
                " S ",
                'W',
                "blockWool",
                'S',
                OrePrefixes.stick.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.PersonalSafe.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "dHh",
                "SCS",
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'H',
                ChestUpItems.SteelChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.ConstructionFoamSprayer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IdS",
                "sIF",
                "SBC",
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'I',
                OrePrefixes.pipeSmall.get(Materials.Steel),
                'B',
                VanillaItems.StoneButton.get(),
                'F',
                IC2Items.FluidCell.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.CfPack,
                meta = 26,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ChC",
                "TST",
                "CdC",
                'C',
                OrePrefixes.itemCasing.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'T',
                AE2FCItems.CertusQuartzTank.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Obscurator.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "CDC",
                "IBI",
                'I',
                OrePrefixes.itemCasing.get(Materials.Iron),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'C',
                OrePrefixes.cableGt01.get(Materials.Gold),
                'B',
                OrePrefixes.battery.get(Materials.Advanced),
                'D',
                ImpactItems.LargeScreen.get(),
            ),
        )
    }
}
