package com.impactrecipes.recipes.ae2

import com.impactrecipes.core.Reference
import com.impactrecipes.recipes.AEMinimal
import com.impactrecipes.loader.IOreRecipeRegistry
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class AE2Registrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.AE2)
        }

    public override fun register() {
        AE2ExtraCellsRemovals().register()
        AE2AddonRemovals().register()
        AE2DeviceRemovals().register()
        AE2NetworkAndCellRemovals().register()
        AE2CraftingAndSlabRemovals().register()
        AE2ToolAndAdvancedStorageRemovals().register()
        AE2FluidNetworkAndCellRemovals().register()
        AE2FluidComponentRemovals().register()
        AE2HousingCraftingRecipes().register()
        AE2DeviceCraftingRecipes().register()
        AE2TerminalCraftingRecipes().register()
        AE2CardCraftingRecipes().register()
        AE2PlaneAndAnchorCraftingRecipes().register()
        AE2ToolAndSlabCraftingRecipes().register()
        AE2CoreAndPatternCraftingRecipes().register()
        AE2FluidAndTunnelCraftingRecipes().register()
        AE2FluidComponentCraftingRecipes().register()
        AE2QuartzSmeltingRecipes().register()
        AE2CableAssemblyRecipes().register()
        AE2BasicStorageComponentAssemblyRecipes().register()
        AE2SpatialComponentAssemblyRecipes().register()
        AE2BasicCellAssemblyRecipes().register()
        AE2CraftingUnitAssemblyRecipes().register()
        AE2CraftingStorageAssemblyRecipes().register()
        AE2CoreAssemblyRecipes().register()
        AE2AdvancedStorageComponentAssemblyRecipes().register()
        AE2BasicFluidComponentAssemblyRecipes().register()
        AE2AdvancedFluidComponentAssemblyRecipes().register()
        AE2AdvancedCellAssemblyRecipes().register()
        AE2FluidCellAssemblyRecipes().register()
        AE2MultiFluidCellAssemblyRecipes().register()
        AE2AddonComponentAssemblyRecipes().register()
        AE2TerminalAssemblyRecipes().register()
        AE2CrystalAutoclaveRecipes().register()
        AE2TntCentrifugeRecipes().register()
        AE2CableBathRecipes().register()
        AE2CrystalReactorRecipes().register()
        AE2QuartzCompressionRecipes().register()
        AE2BlockCuttingRecipes().register()
        AE2MachinePrinterRecipes().register()
        AE2QuartzCrushingRecipes().register()
        AE2CableWireAssemblyRecipes().register()
        AE2CraftingUnitUnboxingRecipes().register()
        AE2SeedMixingRecipes().register()
        AE2CrystalLatheRecipes().register()
        AE2BlockCastingRecipes().register()
        AE2FluidMachineProviderRecipes().register()
        AE2NetworkMachineProviderRecipes().register()
        AE2SpatialAndInterfaceProviderRecipes().register()
        AE2ExportBusProviderRecipes().register()
        AE2ImportBusProviderRecipes().register()
        AE2StorageBusProviderRecipes().register()
        AE2TunnelAndWirelessProviderRecipes().register()
        AE2FluidExportBusProviderRecipes().register()
        AE2FluidImportBusProviderRecipes().register()
        AE2FluidStorageBusProviderRecipes().register()
        AEMinimal.run()
    }

    public override fun registerOreRecipes(oreRecipes: IOreRecipeRegistry) {
        oreRecipes.register(AE2LensRecipes())
    }
}
