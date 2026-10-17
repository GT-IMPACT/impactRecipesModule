package com.impactrecipes.recipes.bibliocraft

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class BiblioCraftRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("BiblioCraft")
        }

    public override fun register() {
        BiblioCraftRecipeRemovals().register()
        BiblioCraftWorkshopRecipes().register()
        BiblioCraftPanelerRecipes().register()
        BiblioCraftUtilityRecipes().register()
        BiblioCraftFurnitureRecipes().register()
        BiblioCraftToolRecipes().register()
        BiblioCraftFrameRecipes().register()
    }
}
