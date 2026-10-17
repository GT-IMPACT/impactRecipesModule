package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes

internal class GalaxySpaceRocketCargoRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemTier4Rocket.get(),
            secondaryInput = ChestUpItems.AluminiumChest.get(),
            output = GalaxySpaceItems.ItemTier4Rocket3.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemTier5Rocket.get(),
            secondaryInput = ChestUpItems.AluminiumChest.get(),
            output = GalaxySpaceItems.ItemTier5Rocket3.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemTier6Rocket.get(),
            secondaryInput = ChestUpItems.AluminiumChest.get(),
            output = GalaxySpaceItems.ItemTier6Rocket3.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemTier7Rocket.get(),
            secondaryInput = ChestUpItems.AluminiumChest.get(),
            output = GalaxySpaceItems.ItemTier7Rocket3.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemTier8Rocket.get(),
            secondaryInput = ChestUpItems.AluminiumChest.get(),
            output = GalaxySpaceItems.ItemTier8Rocket3.get(),
            ticks = 200,
            eu = 60,
        )
    }
}
