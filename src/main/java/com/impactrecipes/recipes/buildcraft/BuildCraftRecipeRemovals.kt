package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.items.BuildCraftBuildersItems
import com.impactrecipes.items.BuildCraftCoreItems
import com.impactrecipes.items.BuildCraftFactoryItems
import com.impactrecipes.items.BuildCraftRoboticsItems
import com.impactrecipes.items.BuildCraftSiliconItems
import com.impactrecipes.items.BuildCraftTransportItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values

internal class BuildCraftRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftBuildersItems.FillerBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftBuildersItems.BuilderBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftBuildersItems.ArchitectBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftBuildersItems.LibraryBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.MarkerBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftBuildersItems.ConstructionMarkerBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.PathMarkerBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftBuildersItems.BlueprintItem.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftBuildersItems.TemplateItem.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftBuildersItems.MachineBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.EngineBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.EngineBlock1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.EngineBlock2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.WoodenGearItem.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.StoneGearItem.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.IronGearItem.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.GoldGearItem.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftCoreItems.DiamondGearItem.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftFactoryItems.MiningWellBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftFactoryItems.AutoWorkbenchBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftFactoryItems.TankBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftFactoryItems.PumpBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftFactoryItems.FloodGateBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftFactoryItems.RefineryBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftFactoryItems.BlockHopper.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftRoboticsItems.ZonePlan.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftRoboticsItems.Requester.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftSiliconItems.LaserBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftSiliconItems.LaserTableBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftSiliconItems.LaserTableBlock1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftSiliconItems.LaserTableBlock2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftSiliconItems.LaserTableBlock3.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftSiliconItems.LaserTableBlock4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftSiliconItems.LaserTableBlock5.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftSiliconItems.PackagerBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftTransportItems.FilteredBufferBlock.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftRoboticsItems.ZonePlan.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftRoboticsItems.Requester.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftTransportItems.PipeWaterproof.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemswood,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsemerald,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemscobblestone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsstone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsquartz,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsiron,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsgold,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsdiamond,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsobsidian,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemslapis,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsdaizuli,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemssandstone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsvoid,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsemzuli,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsstripes,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsclay,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidswood,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidscobblestone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsstone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsquartz,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsiron,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsgold,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsemerald,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsdiamond,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidssandstone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsvoid,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsclay,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipepowerwood,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipepowercobblestone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipepowerstone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipepowerquartz,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipepoweriron,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipepowergold,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipepowerdiamond,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipepoweremerald,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipepowersandstone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BuildCraftTransportItems.ItemBuildcraftPipePipestructurecobblestone,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BuildCraftTransportItems.PipePlug.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
