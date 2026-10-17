package com.impactrecipes.recipes.enderio

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class EnderIORegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("EnderIO")
        }

    public override fun register() {
        EnderIORecipeRemovals().register()
        EnderIOMachineCraftingRecipes().register()
        EnderIOCapacitorBankCraftingRecipes().register()
        EnderIOUtilityCraftingRecipes().register()
        EnderIOLightingAndUpgradeCraftingRecipes().register()
        EnderIOQuartzSmeltingRecipes().register()
        EnderIOConduitAssemblyRecipes().register()
        EnderIOFilterAssemblyRecipes().register()
        EnderIOCapacitorAssemblyRecipes().register()
        EnderIOConduitUpgradeAssemblyRecipes().register()
        EnderIOLightingAssemblyRecipes().register()
        EnderIOQuartzBathRecipes().register()
        EnderIOConduitBinderCastingRecipes().register()
        EnderIOTeleportPrinterRecipes().register()
    }
}
