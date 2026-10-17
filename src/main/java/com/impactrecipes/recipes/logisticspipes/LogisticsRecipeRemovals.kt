package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values

internal class LogisticsRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.LogisticsSolidBlock15.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.LogisticsSolidBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.LogisticsSolidBlock1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.LogisticsSolidBlock2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.LogisticsSolidBlock3.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.LogisticsSolidBlock4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.LogisticsSolidBlock5.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.LogisticsSolidBlock11.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.LogisticsSolidBlock12.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsBasicTransport.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsBasicLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeFluidBasic.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeBlockRequestTable.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        for (i in 0 until 17) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = LogisticsPipesItems.ItemRemoteOrdererItem,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = LogisticsPipesItems.ItemItemModule,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = LogisticsPipesItems.ItemItemUpgrade,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeController.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsRequestLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsProviderLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsCraftingLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsSatelliteLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsSupplierLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk3.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk5.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsCraftingLogisticsMk2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsRequestLogisticsMk2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsRemoteOrdererLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsProviderLogisticsMk2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsApiaristAnalyser.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsApiaristSink.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsInvSysConnector.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsSystemEntranceLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsSystemDestinationLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsCraftingLogisticsMk3.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsFirewall.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeItemsFluidSupplier.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeFluidBasic.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeFluidInsertion.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeFluidProvider.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeFluidRequestLogistics.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeFluidExtractor.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeFluidSatellite.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemPipeFluidSupplierMk2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemItemPipeSignCreator.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = LogisticsPipesItems.ItemItemDisk.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
