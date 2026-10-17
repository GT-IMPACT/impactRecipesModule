package com.impactrecipes.recipes.projectred

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IOreRecipeRegistry
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ProjectRedRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.PROJECTRED)
        }

    public override fun register() {
        ProjectRedRecipeRemovals().register()
        ProjectRedWirelessCraftingRecipes().register()
        ProjectRedDeviceCraftingRecipes().register()
        ProjectRedInsulatedWireRecipes().register()
        ProjectRedWiremillRecipes().register()
        ProjectRedChipPressRecipes().register()
        ProjectRedDustMixingRecipes().register()
        ProjectRedSiliconSmeltingRecipes().register()
        ProjectRedPlateAssemblyRecipes().register()
        ProjectRedLampAssemblyRecipes().register()
        ProjectRedWirelessAssemblyRecipes().register()
        ProjectRedCircuitAssemblyRecipes().register()
        ProjectRedDyeBathRecipes().register()
        ProjectRedPearlReactorRecipes().register()
    }

    public override fun registerOreRecipes(oreRecipes: IOreRecipeRegistry) {
        oreRecipes.register(ProjectRedLensRecipes())
    }
}
