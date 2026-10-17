package com.impactrecipes.recipes.ic2

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class IC2Registrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("IC2")
        }

    public override fun register() {
        IC2RecipeRemovals().register()
        IC2CompactGeneratorRemovals().register()
        IC2ReactorComponentCraftingRecipes().register()
        IC2ElectricToolCraftingRecipes().register()
        IC2ChargepadCraftingRecipes().register()
        IC2ScaffoldAndRotorCraftingRecipes().register()
        IC2EnergyStorageCraftingRecipes().register()
        IC2UtilityCraftingRecipes().register()
        IC2AutomationCraftingRecipes().register()
        IC2HazmatCraftingRecipes().register()
        IC2MaterialAndToolCraftingRecipes().register()
        IC2CompactRotorRecipes().register()
        IC2CompactWindRecipes().register()
        IC2CompactWaterRecipes().register()
        IC2CompactKineticRecipes().register()
        IC2NuclearFuelCentrifugeRecipes().register()
        IC2NaquadahFuelCentrifugeRecipes().register()
        IC2ThoriumFuelCentrifugeRecipes().register()
        IC2QuantumArmorPrinterRecipes().register()
        IC2DustPackagingRecipes().register()
        IC2ComponentPressRecipes().register()
        IC2CanisterFillingRecipes().register()
        IC2ComponentExtrusionRecipes().register()
        IC2QuantumArmorAssemblyRecipes().register()
        IC2NanoArmorAssemblyRecipes().register()
        IC2ReactorComponentAssemblyRecipes().register()
        IC2FuelAndScaffoldAssemblyRecipes().register()
        IC2UtilityAssemblyRecipes().register()
        IC2LightingAndVentAssemblyRecipes().register()
        IC2ReactorDisassemblyRecipes().register()
        IC2CompactWindDisassemblyRecipes().register()
        IC2CompactWaterDisassemblyRecipes().register()
        IC2CompactKineticDisassemblyRecipes().register()
        IC2DensePlateBendingRecipes().register()
        IC2CoalBallMixingRecipes().register()
        IC2UraniumSmeltingRecipes().register()
    }
}
