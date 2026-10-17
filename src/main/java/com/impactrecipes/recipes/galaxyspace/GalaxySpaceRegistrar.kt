package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class GalaxySpaceRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("GalaxySpace")
        }

    public override fun register() {
        GalaxySpaceRecipeRemovals().register()
        GalaxySpaceCobaltArmorRecipes().register()
        GalaxySpaceEquipmentCraftingRecipes().register()
        GalaxySpaceCeresCrushingRecipes().register()
        GalaxySpaceEuropaCrushingRecipes().register()
        GalaxySpaceJovianMoonCrushingRecipes().register()
        GalaxySpaceIoCrushingRecipes().register()
        GalaxySpaceInnerPlanetCrushingRecipes().register()
        GalaxySpaceSaturnMoonCrushingRecipes().register()
        GalaxySpaceOuterMoonCrushingRecipes().register()
        GalaxySpacePlutoCrushingRecipes().register()
        GalaxySpaceResourceCrushingRecipes().register()
        GalaxySpaceCanisterFillingRecipes().register()
        GalaxySpaceCentrifugeRecipes().register()
        GalaxySpaceRocketRecyclingRecipes().register()
        GalaxySpaceCanisterRecyclingRecipes().register()
        GalaxySpaceRocketCargoRecipes().register()
        GalaxySpaceThermalPaddingRecipes().register()
        GalaxySpaceComponentAssemblyRecipes().register()
        GalaxySpaceCrystalGrowthRecipes().register()
        GalaxySpaceGlowstoneCompressionRecipes().register()
        GalaxySpaceStemCellRecipes().register()
        GalaxySpaceRocketAssemblyLineRecipes().register()
    }
}
