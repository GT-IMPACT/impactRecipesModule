package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.OreDictionaryRecipes

internal object IC2OreDictionaryChanges {

    private var registered = false

    internal fun register() {
        if (registered) {
            return
        }
        registered = true

        OreDictionaryRecipes.remove(
            name = "dustTinyLapis",
            item = IC2Items.SmallLapisDust.get(),
        )
        OreDictionaryRecipes.remove(
            name = "dustLapis",
            item = IC2Items.LapisDust.get(),
        )
        OreDictionaryRecipes.remove(
            name = "plateLapis",
            item = IC2Items.LapisPlate.get(),
        )
        OreDictionaryRecipes.remove(
            name = "plateDenseLapis",
            item = IC2Items.Denseplatelapi.get(),
        )
        OreDictionaryRecipes.remove(
            name = "blockObsidian",
            item = VanillaItems.Obsidian.get(),
        )
        OreDictionaryRecipes.remove(
            name = "dustObsidian",
            item = IC2Items.ObsidianDust.get(),
        )
    }
}
