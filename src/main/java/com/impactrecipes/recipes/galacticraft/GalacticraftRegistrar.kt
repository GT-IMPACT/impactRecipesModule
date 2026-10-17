package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class GalacticraftRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("GalacticraftCore")
        }

    public override fun register() {
        GalacticraftRecipeRemovals().register()
        GalacticraftOxygenTankCraftingRecipes().register()
        GalacticraftOxygenMachineCraftingRecipes().register()
        GalacticraftStructureCraftingRecipes().register()
        GalacticraftLifeSupportCraftingRecipes().register()
        GalacticraftRocketComponentCraftingRecipes().register()
        GalacticraftExplorationCraftingRecipes().register()
        GalacticraftUtilityCraftingRecipes().register()
        GalacticraftCrushingRecipes().register()
        GalacticraftRocketPrinterRecipes().register()
        GalacticraftTankFillingRecipes().register()
        GalacticraftExtrusionRecipes().register()
        GalacticraftExtractionRecipes().register()
        GalacticraftCanisterRecipes().register()
        GalacticraftRecyclingRecipes().register()
        GalacticraftRocketComponentAssemblyRecipes().register()
        GalacticraftRocketCargoAssemblyRecipes().register()
        GalacticraftLifeSupportAssemblyRecipes().register()
        GalacticraftThermalPaddingAssemblyRecipes().register()
        GalacticraftLightingAssemblyRecipes().register()
        GalacticraftCuttingRecipes().register()
    }
}
