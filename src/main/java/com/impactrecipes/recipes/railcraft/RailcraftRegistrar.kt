package com.impactrecipes.recipes.railcraft

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class RailcraftRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("Railcraft")
        }

    public override fun register() {
        RailcraftTrackRemovals().register()
        RailcraftDetectorRemovals().register()
        RailcraftMachineAndSignalRemovals().register()
        RailcraftCartAndToolRemovals().register()
        RailcraftComponentRemovals().register()
        RailcraftFrameCraftingRecipes().register()
        RailcraftControlTrackCraftingRecipes().register()
        RailcraftWoodTrackCraftingRecipes().register()
        RailcraftReinforcedTrackCraftingRecipes().register()
        RailcraftElectricTrackCraftingRecipes().register()
        RailcraftHighSpeedTrackCraftingRecipes().register()
        RailcraftUtilityTrackCraftingRecipes().register()
        RailcraftDetectorCraftingRecipes().register()
        RailcraftLoaderCraftingRecipes().register()
        RailcraftSignalCraftingRecipes().register()
        RailcraftCartCraftingRecipes().register()
        RailcraftToolAndStationCraftingRecipes().register()
        RailcraftRailComponentCraftingRecipes().register()
        RailcraftAdvancedRailAlloyCraftingRecipes().register()
        RailcraftElectricRailAlloyCraftingRecipes().register()
        RailcraftReinforcedRailAlloyCraftingRecipes().register()
        RailcraftHighSpeedRailAlloyCraftingRecipes().register()
        RailcraftDigitalSignalCraftingRecipes().register()
        RailcraftRailbedCraftingRecipes().register()
        RailcraftCartAssemblyRecipes().register()
        RailcraftRailbedAssemblyRecipes().register()
        RailcraftSignalToolAssemblyRecipes().register()
        RailcraftRailComponentAssemblyRecipes().register()
        RailcraftRailBendingRecipes().register()
        RailcraftTieBathRecipes().register()
        RailcraftControlCircuitRecipes().register()
        RailcraftRailExtrusionRecipes().register()
        RailcraftWoodTrackAssemblyRecipes().register()
        RailcraftReinforcedTrackAssemblyRecipes().register()
        RailcraftElectricTrackAssemblyRecipes().register()
        RailcraftHighSpeedTrackAssemblyRecipes().register()
        RailcraftStandardTrackAssemblyRecipes().register()
        RailcraftBoardingControlTrackAssemblyRecipes().register()
        RailcraftLocomotiveControlTrackAssemblyRecipes().register()
        RailcraftRoutingControlTrackAssemblyRecipes().register()
        RailcraftUtilityTrackAssemblyRecipes().register()
        RailcraftDetectorAndNfcTrackAssemblyRecipes().register()
    }
}
