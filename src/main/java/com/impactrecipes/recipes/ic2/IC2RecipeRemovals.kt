package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values

internal class IC2RecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.Generator,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.NanoHelmet,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.NanoChestplate,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.NanoLeggings,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.NanoBoots,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.QuantumHelmet,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.QuantumChestplate,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.QuantumLeggings,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.QuantumBoots,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ChargingREBattery,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ChargingAdvBattery,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ChargingEnergyCrystal,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.LapotronChargingCrystal,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorReflectorThick,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReactorPlating.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.HeatCapacityReactorPlating.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReactorPlatingExplosive.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorVent,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorVentCore,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorVentGold,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReactorVentSpread.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.AdvancedHeatVent,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorHeatSwitch,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorHeatSwitchCore,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorHeatSwitchSpread,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.AdvancedHeatExchanger,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorCoolantSimple,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorCoolantTriple,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorCoolantSix,
                meta = 1,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ElectricTreetap,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ElectricHoe,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.SmallPowerUnit.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.ChargepadbatBox,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.MOXFuel.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.UranFuel.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReactorUraniumSimple.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReactorMOXSimple.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.BronzePickaxe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.BronzeAxe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.BronzeShovel.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.BronzeHoe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.BronzeSword.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Scaffold.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.IronScaffold.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.WindKineticGenerator,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.SolidHeatGenerator,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.MachineCasing,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.Teleporter,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.Steamgenerator,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.PersonalSafe,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.BatBox,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.Coil,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.WeedingTrowel.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.HazmatHelmet.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.HazmatChestplate.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.HazmatLeggings.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.HazmatBoots.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Windmeter.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Obscurator.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.CfPack.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ConstructionFoamSprayer.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Painter.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReinforcedDoor.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.BoatRubber.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Barrel.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ScrapBox.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.CarbonMesh.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.PlantBall.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.FluidCell.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Wrench.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReactorChamber.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Nuke.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Toolbox.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.FluidEjectorUpgrade.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReactorFluidPort.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReactorAccessHatch.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ReactorRedstonePort.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Reactorvessel.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.ConstructionFoamPowder.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.StickyDynamite.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.MugEmpty.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Treetap.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.RedstoneInverterUpgrade.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = IC2Items.Crop,
                meta = 5,
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.Uran235.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = IC2Items.SmallUran235.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
