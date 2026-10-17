package com.impactrecipes.recipes.chisel

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ChiselRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("chisel")
        }

    public override fun register() {
        ChiselRecipeRemovals().register()
        ChiselToolCraftingRecipes().register()
        ChiselBlockCraftingRecipes().register()
        ChiselDarkBlockSmeltingRecipes().register()
        ChiselLaboratorySmeltingRecipes().register()
        ChiselTempleSmeltingRecipes().register()
        ChiselCarpetAssemblyRecipes().register()
        ChiselIndustrialAssemblyRecipes().register()
        ChiselPlatingAssemblyRecipes().register()
        ChiselPaperAssemblyRecipes().register()
        ChiselTechnicalAssemblyRecipes().register()
        ChiselCuttingRecipes().register()
        ChiselCastingRecipes().register()
    }
}
