package com.impactrecipes.recipes.gregtech

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class GregTechRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.GREGTECH)
        }

    public override fun register() {
        GregTechRecipeRemovals().register()
        GregTechComponentCraftingRecipes().register()
        GregTechStorageCraftingRecipes().register()
        GregTechUtilityCraftingRecipes().register()
        GregTechCasingRecipes().register()
        GregTechWireRecipes().register()
        GregTechCoolingRecipes().register()
        GregTechGemRecipes().sifting()
        GregTechFusionCasingRecipes().register()
        GregTechMachineProductionRecipes().register()
        GregTechSolarPanelRecipes().register()
        GregTechChemicalRecipes().mixing()
        GregTechFusionRecipes().register()
        GregTechCoolingRecipes().solidification()
        GregTechCastingRecipes().register()
        GregTechFluidCellRecipes().filling()
        GregTechChemicalRecipes().electrolysis()
        GregTechMetalSmeltingRecipes().register()
        GregTechSuperconductorSmeltingRecipes().register()
        GregTechExoticAlloySmeltingRecipes().register()
        GregTechSiliconSmeltingRecipes().register()
        GregTechAdvancedMetalSmeltingRecipes().register()
        GregTechComponentAssemblerRecipes().register()
        GregTechChemicalRecipes().brewing()
        GregTechRecyclingRecipes().arcFurnace()
        GregTechComponentAssemblyRecipes().register()
        GregTechMachineAssemblyRecipes().register()
        GregTechStorageUpgradeRecipes().register()
        GregTechAlloySmeltingRecipes().register()
        GregTechCuttingRecipes().register()
        GregTechChemicalBathRecipes().register()
        GregTechConventionalCircuitRecipes().register()
        GregTechAdvancedCircuitRecipes().register()
        GregTechCircuitBoardRecipes().register()
        GregTechMotorAssemblyRecipes().register()
        GregTechRecyclingRecipes().centrifuging()
        GregTechFluidCellRecipes().canning()
        GregTechOilRecipes().register()
        GregTechFusionRecipes().tinyWormhole()
        GregTechGemRecipes().implosion()
        GregTechOilRecipes().tarExtraction()
        GregTechChemicalRecipes().bacterialCulture()
    }
}
