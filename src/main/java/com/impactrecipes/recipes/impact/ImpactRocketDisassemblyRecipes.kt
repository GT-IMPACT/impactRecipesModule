package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes

internal class ImpactRocketDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = GalacticraftCoreItems.ItemSpaceship3.get(),
            outputs = arrayOf(
                ChestUpItems.AluminiumChest.get(),
                GalacticraftCoreItems.ItemSpaceship.get(),
            ),
            ticks = 2000,
            eu = 64,
        )

        MachineRecipes.disassembler(
            input = GalacticraftMarsItems.ItemSpaceshipTier23.get(),
            outputs = arrayOf(
                ChestUpItems.AluminiumChest.get(),
                GalacticraftMarsItems.ItemSpaceshipTier2.get(),
            ),
            ticks = 2000,
            eu = 64,
        )

        MachineRecipes.disassembler(
            input = GalacticraftMarsItems.ItemItemTier3Rocket3.get(),
            outputs = arrayOf(
                ChestUpItems.AluminiumChest.get(),
                GalacticraftMarsItems.ItemItemTier3Rocket.get(),
            ),
            ticks = 2000,
            eu = 64,
        )

        MachineRecipes.disassembler(
            input = GalaxySpaceItems.ItemTier4Rocket3.get(),
            outputs = arrayOf(
                ChestUpItems.AluminiumChest.get(),
                GalaxySpaceItems.ItemTier4Rocket.get(),
            ),
            ticks = 2000,
            eu = 64,
        )

        MachineRecipes.disassembler(
            input = GalaxySpaceItems.ItemTier5Rocket3.get(),
            outputs = arrayOf(
                ChestUpItems.AluminiumChest.get(),
                GalaxySpaceItems.ItemTier5Rocket.get(),
            ),
            ticks = 2000,
            eu = 64,
        )

        MachineRecipes.disassembler(
            input = GalaxySpaceItems.ItemTier6Rocket3.get(),
            outputs = arrayOf(
                ChestUpItems.AluminiumChest.get(),
                GalaxySpaceItems.ItemTier6Rocket.get(),
            ),
            ticks = 2000,
            eu = 64,
        )

        MachineRecipes.disassembler(
            input = GalaxySpaceItems.ItemTier7Rocket3.get(),
            outputs = arrayOf(
                ChestUpItems.AluminiumChest.get(),
                GalaxySpaceItems.ItemTier7Rocket.get(),
            ),
            ticks = 2000,
            eu = 64,
        )

        MachineRecipes.disassembler(
            input = GalaxySpaceItems.ItemTier8Rocket3.get(),
            outputs = arrayOf(
                ChestUpItems.AluminiumChest.get(),
                GalaxySpaceItems.ItemTier8Rocket.get(),
            ),
            ticks = 2000,
            eu = 64,
        )
    }
}
