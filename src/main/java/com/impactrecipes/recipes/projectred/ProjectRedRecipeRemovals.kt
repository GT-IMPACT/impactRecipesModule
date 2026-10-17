package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.ProjectRedFabricationItems
import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.items.ProjectRedTransmissionItems
import com.impactrecipes.items.WirelessRedstoneAddonsItems
import com.impactrecipes.items.WirelessRedstoneCoreItems
import com.impactrecipes.items.WirelessRedstoneLogicItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.util.GT_ModHandler

internal class ProjectRedRecipeRemovals {

    internal fun register() {
        GT_ModHandler.removeFurnaceSmelting(ProjectRedItems.ProjectredCorePart42.get())

        GT_ModHandler.removeFurnaceSmelting(ProjectRedItems.ProjectredCorePart43.get())

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ProjectRedFabricationItems.ProjectredFabricationIcchip.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ProjectRedFabricationItems.ProjectredIntegrationIcblock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ProjectRedFabricationItems.ProjectredIntegrationIcblock1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ProjectRedItems.ProjectredCoreScrewdriver.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ProjectRedItems.ProjectredCorePart42.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ProjectRedItems.ProjectredCorePart43.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ProjectRedItems.ProjectredCoreWiredebugger.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        for (i in 0 until 16) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ProjectRedItems.ProjectredCorePart,
                    meta = 19 + i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )

            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ProjectRedTransmissionItems.RedAlloyWire,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        for (i in 1 until 10) {
            CraftingRecipes.removeCraftingRecipesByOutput(
                output = ModItemVariant(
                    item = ProjectRedItems.ProjectredCorePart,
                    meta = i,
                ).get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = false,
            )
        }

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneCoreItems.ObsidianStick.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneCoreItems.StoneBowl.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneCoreItems.RetherPearl.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneCoreItems.WirelessTransceiver.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneCoreItems.BlazeTransceiver.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneCoreItems.RecieverDish.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneCoreItems.BlazeRecieverDish.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneLogicItems.WirelessLogic.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneLogicItems.WirelessLogic1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneLogicItems.WirelessLogic2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneAddonsItems.Triangulator.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneAddonsItems.Remote.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneAddonsItems.Sniffer.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneAddonsItems.Map.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneAddonsItems.Tracker.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneAddonsItems.Rep.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = WirelessRedstoneAddonsItems.Psniffer.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )
    }
}
