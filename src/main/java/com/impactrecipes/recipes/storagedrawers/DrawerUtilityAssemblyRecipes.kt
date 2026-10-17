package com.impactrecipes.recipes.storagedrawers

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.StorageDrawersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class DrawerUtilityAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = StorageDrawersItems.UpgradeTemplate.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.gem,
                material = Materials.Diamond,
                count = 1,
            ),
            output = StorageDrawersItems.ConcealmentKey.get(),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = StorageDrawersItems.UpgradeTemplate.get(),
            secondaryInput = VanillaItems.NameTag.get(),
            output = StorageDrawersItems.PersonalKey.get(),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Paper.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = Materials.Glue.getFluid(144),
            output = StorageDrawersItems.PackingTape.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StorageDrawersItems.UpgradeTemplate.get(),
                ExtraUtilitiesItems.TrashCan.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
            ),
            fluid = Materials.Redstone.getMolten(144),
            output = StorageDrawersItems.VoidUpgrade.get(),
            ticks = 400,
            eu = 30,
        )
    }
}
