package com.impactrecipes.recipes.nuclearcontrol

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class NuclearControlRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.NUCLEARCONTROL)
        }

    public override fun register() {
        NuclearControlSensorRecipes().register()
        NuclearControlPanelRecipes().register()
    }
}
