package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.ExtraCellsItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes

internal class AE2ExtraCellsRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.PartBase.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.PartBase1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.PartBase2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        for (i in 0 until 18) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ExtraCellsItems.StorageComponent,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        for (i in 0 until 7) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ExtraCellsItems.StorageGas,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        for (i in 0 until 3) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ExtraCellsItems.StorageCasing,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        for (i in 0 until 7) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ExtraCellsItems.StorageFluid,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        for (i in 0 until 5) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ExtraCellsItems.StoragePhysical,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.Certustank.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.PatternFluid.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.PatternBase.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        for (i in 0 until 10) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ExtraCellsItems.PartBase,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        for (i in 0 until 4) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ExtraCellsItems.Craftingstorage,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.TerminalFluidWireless.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.Ecbaseblock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.Ecbaseblock1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.StorageFluidPortable.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ExtraCellsItems.Vibrantchamberfluid.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
