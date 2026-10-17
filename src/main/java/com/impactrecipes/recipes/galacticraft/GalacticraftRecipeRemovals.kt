package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.util.GT_ModHandler
import gregtech.api.util.GT_ModHandler.removeFurnaceSmelting

internal class GalacticraftRecipeRemovals {

    internal fun register() {
        GT_ModHandler.removeFurnaceSmelting(GalacticraftMarsItems.TileAsteroidsBlock4.get())

        GT_ModHandler.removeFurnaceSmelting(GalacticraftMarsItems.ThermalCloth.get())

        GT_ModHandler.removeFurnaceSmelting(GalacticraftMarsItems.TileMars2.get())

        GT_ModHandler.removeFurnaceSmelting(GalacticraftMarsItems.ItemNull.get())

        GT_ModHandler.removeFurnaceSmelting(BackpackItems.BoundLeather.get())

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileArclamp.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileOxygenPipe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemOxygenMask.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelPole.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileGlowstoneTorch.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemOilCanisterPartial1001.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileHydrogenPipe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemThermalPadding.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemThermalPadding1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemThermalPadding2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemThermalPadding3.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemOxygenTankLightFull1800.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemOxygenTankMedFull3600.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemOxygenTankHeavyFull5400.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemMethaneCanisterPartial1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileLandingPad.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileLandingPad1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSensorGlasses.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileOxygenCollector.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileOxygenCompressor.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileOxygenCompressor4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileMachine28.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileDistributor.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileSealer.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileOxygenDetector.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileRefinery.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileFuelLoader.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileCargo.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileCargo4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileRocketWorkbench.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileGcBlockCore3.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileGcBlockCore4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileGcBlockCore9.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileGcBlockCore10.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileGcBlockCore11.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileGcBlockCore12.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileAirLockFrame.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileAirLockFrame1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileSolar.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileSolar4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBasicItem12.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBasicItem.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBasicItem1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileMachine.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileMachine12.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileMachine2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileMachine24.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileMachineTiered.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileMachineTiered4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileMachineTiered8.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileMachineTiered12.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileSpinThruster.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileViewScreen.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileTelemetry.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemOxygenGear.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemCanister.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemCanister1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemAirFan.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemAirVent.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemOxygenConcentrator.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemEngine.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemEngine1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemNoseCone.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemOilExtractor.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBuggymat.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBuggymat1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBuggymat2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemStandardWrench.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBasicItem15.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBasicItem16.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBasicItem17.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBasicItem18.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBasicItem19.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemTitaniumPickaxe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemTitaniumAxe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemTitaniumHoe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemTitaniumShovel.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemTitaniumSword.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemTitaniumHelmet.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemTitaniumChestplate.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemTitaniumLeggings.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemTitaniumBoots.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelPickaxe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelAxe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelHoe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelShovel.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelSword.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelHelmet.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelChestplate.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelLeggings.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemSteelBoots.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileMars8.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemNull1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileMarsMachineT24.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileMarsMachineT28.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileWalkway.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileWalkwayWire.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileWalkwayOxygenPipe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemAtmosphericValve.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemItemBasicAsteroids2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemItemBasicAsteroids1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemHeavyNoseCone.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemItemBasicAsteroids8.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileBeamReflector.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileBeamReceiver.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileTelepadShort.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileMarsMachine.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileMarsMachine4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.TileMarsMachine8.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemGrapple.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemCarbonFragments.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemDeshPick.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemDeshAxe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemDeshHoe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemDeshSpade.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemDeshSword.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemRocketFins.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemItemBasicAsteroids2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemCanvas.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemParachute.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemDeshHelmet.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemDeshChestplate.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemDeshLeggings.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemDeshBoots.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftMarsItems.ItemOrionDrive.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileEnclosed2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileEnclosed3.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileEnclosed4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileEnclosed5.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileEnclosed6.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileAluminumWire.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.TileAluminumWire1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = GalacticraftCoreItems.ItemBattery,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.SlabGCHalf.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.SlabGCHalf1.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.SlabGCHalf2.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.SlabGCHalf3.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.SlabGCHalf4.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.SlabGCHalf5.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = GalacticraftCoreItems.ItemBasicItem20.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
