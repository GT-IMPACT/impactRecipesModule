package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.ComputeryItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftCartAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.Minecart.get(),
            secondaryInput = IC2Items.BatBox.get(),
            output = RailcraftItems.CartEnergyBatbox.get(),
            ticks = 100,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Minecart.get(),
            secondaryInput = IC2Items.CesuUnit.get(),
            output = RailcraftItems.CartEnergyCesu.get(),
            ticks = 100,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Minecart.get(),
            secondaryInput = IC2Items.MfeUnit.get(),
            output = RailcraftItems.CartEnergyMfe.get(),
            ticks = 100,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Minecart.get(),
            secondaryInput = VanillaItems.CraftingTable.get(),
            output = RailcraftItems.CartWork.get(),
            ticks = 100,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Minecart.get(),
            secondaryInput = AE2FCItems.CertusQuartzTank.get(),
            output = RailcraftItems.CartTank.get(),
            ticks = 100,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.BlueSteel,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.ring,
                material = Materials.BlueSteel,
                count = 2,
            ),
            output = ComputeryItems.MetaItem.get(),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.BlueSteel,
                count = 3,
            ),
            secondaryInput = ComputeryItems.MetaItem.get(amount = 2),
            output = ComputeryItems.MetaItem1.get(),
            ticks = 300,
            eu = 2,
        )
    }
}
