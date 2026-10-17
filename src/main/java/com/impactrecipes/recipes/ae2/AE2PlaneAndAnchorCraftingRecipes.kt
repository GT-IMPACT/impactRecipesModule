package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.ToolDictNames
import gregtech.api.util.GT_ModHandler

internal class AE2PlaneAndAnchorCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MEAnnihilationPlane.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DDD",
                "PAP",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'D',
                AE2Items.FluixDust.get(),
                'A',
                AE2Items.AnnihilationCore.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MEFormationPlane.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DDD",
                "PAP",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'D',
                AE2Items.FluixDust.get(),
                'A',
                AE2Items.FormationCore.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.METoggleBus.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "CLC",
                " P ",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'C',
                AE2Items.ItemItemMultiPart16.get(),
                'L',
                VanillaItems.Lever.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.METoggleBus.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.MEInvertedToggleBus.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.MEInvertedToggleBus.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.METoggleBus.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 2),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 2),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 3),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Bronze),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 2),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Tin),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 4),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 4),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 2),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 2),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Nickel),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 2),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Silver),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 3),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Brass),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CableAnchor.get(amount = 3),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                OrePrefixes.ingot.get(Materials.Invar),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MatterCannon.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPA",
                "BE ",
                "P  ",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'B',
                AE2Items.Item64kMEStorageComponent.get(),
                'A',
                AE2Items.FormationCore.get(),
                'E',
                AE2Items.DenseEnergyCell.get(),
            ),
        )
    }
}
