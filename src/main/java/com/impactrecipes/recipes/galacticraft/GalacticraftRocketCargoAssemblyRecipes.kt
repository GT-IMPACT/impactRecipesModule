package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.util.MachineRecipes

internal class GalacticraftRocketCargoAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = GalacticraftCoreItems.ItemSpaceship.get(),
            secondaryInput = ChestUpItems.AluminiumChest.get(),
            output = GalacticraftCoreItems.ItemSpaceship3.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = GalacticraftMarsItems.ItemSpaceshipTier2.get(),
            secondaryInput = ChestUpItems.AluminiumChest.get(),
            output = GalacticraftMarsItems.ItemSpaceshipTier23.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = GalacticraftMarsItems.ItemItemTier3Rocket.get(),
            secondaryInput = ChestUpItems.AluminiumChest.get(),
            output = GalacticraftMarsItems.ItemItemTier3Rocket3.get(),
            ticks = 200,
            eu = 60,
        )
    }
}
