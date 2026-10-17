package com.impactrecipes.recipes.bibliocraft

import com.impactrecipes.items.BiblioCraftItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values

internal class BiblioCraftRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.PrintingPress.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Chase.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.TypesettingMachine.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.FrameGtdChest.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.PaintPressBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Lantern.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.IronLantern.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Lamp.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.IronLamp.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.ArmorStand.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Bell.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Stuffs.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Stuffs2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.FramingSaw.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.FramingSheet.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.FramingBoard.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.MapTool.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.WayPointCompass.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Glasses.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Glasses2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.PlumbLine.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.HandDrill.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Drill.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Tape.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.TapeMeasure.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.Clipboard.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.SlottedBook.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BiblioCraftItems.AtlasBook.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BiblioCraftItems.Clock,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )
    }
}
