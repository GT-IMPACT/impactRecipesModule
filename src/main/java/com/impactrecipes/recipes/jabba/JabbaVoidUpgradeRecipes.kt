package com.impactrecipes.recipes.jabba

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.JabbaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class JabbaVoidUpgradeRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                JabbaItems.StorageUpgrade.get(),
                ExtraUtilitiesItems.TrashCan.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
            ),
            fluid = Materials.Redstone.getMolten(144),
            output = JabbaItems.VoidUpgrade.get(),
            ticks = 400,
            eu = 30,
        )
    }
}
