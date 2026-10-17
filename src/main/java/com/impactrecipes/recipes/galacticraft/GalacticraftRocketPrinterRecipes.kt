package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes

internal class GalacticraftRocketPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                ImpactItems.SchematicsTier1.get(amount = 0),
                GalacticraftCoreItems.ItemNoseCone.get(),
                GalaxySpaceItems.ItemCompressedPlates4.get(amount = 3),
                GalacticraftCoreItems.ItemHeavyPlating.get(amount = 8),
                GalacticraftCoreItems.ItemRocketFins.get(amount = 4),
                GalaxySpaceItems.ItemModules3.get(),
                GalacticraftCoreItems.ItemEngine.get(),
            ),
            output = GalacticraftCoreItems.ItemSpaceship.get(),
            fluidInputs = null,
            ticks = 100 * 20,
            eu = 480,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                ImpactItems.SchematicsTier2.get(amount = 0),
                GalacticraftCoreItems.ItemNoseCone.get(),
                GalacticraftCoreItems.ItemHeavyPlating.get(amount = 3),
                GalacticraftMarsItems.ItemNull3.get(amount = 10),
                GalacticraftCoreItems.ItemRocketFins.get(amount = 4),
                GalacticraftCoreItems.ItemEngine1.get(amount = 2),
                GalaxySpaceItems.ItemModules3.get(),
                GalacticraftCoreItems.ItemEngine.get(amount = 2),
            ),
            output = GalacticraftMarsItems.ItemSpaceshipTier2.get(),
            fluidInputs = null,
            ticks = 120 * 20,
            eu = 1920,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.SchematicsTier3.get(amount = 0),
                GalacticraftMarsItems.ItemHeavyNoseCone.get(),
                GalacticraftMarsItems.ItemNull3.get(amount = 4),
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(amount = 12),
                GalacticraftMarsItems.ItemItemBasicAsteroids2.get(amount = 4),
                GalacticraftCoreItems.ItemEngine1.get(amount = 4),
                ImpactItems.MediumFuelCanister.get(amount = 2),
                GalacticraftMarsItems.ItemItemBasicAsteroids1.get(),
            ),
            output = GalacticraftMarsItems.ItemItemTier3Rocket.get(),
            fluidInputs = null,
            ticks = 140 * 20,
            eu = 7680,
        )
    }
}
