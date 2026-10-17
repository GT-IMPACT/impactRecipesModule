package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class GalacticraftRocketComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                GregTechItems.SensorHV.get(),
                GalacticraftCoreItems.ItemHeavyPlating.get(amount = 3),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = Materials.StainlessSteel.getMolten(36),
            output = GalacticraftCoreItems.ItemNoseCone.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalacticraftCoreItems.ItemNoseCone.get(),
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(),
                GalacticraftMarsItems.ItemNull5.get(amount = 3),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = Materials.Titanium.getMolten(36),
            output = GalacticraftMarsItems.ItemHeavyNoseCone.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalaxySpaceItems.ItemCompressedPlates4.get(),
                GalacticraftCoreItems.ItemBasicItem9.get(amount = 2),
                GalacticraftCoreItems.ItemHeavyPlating.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.StainlessSteel.getMolten(36),
            output = GalacticraftCoreItems.ItemRocketFins.get(),
            ticks = 50,
            eu = 18,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalacticraftMarsItems.ItemNull3.get(amount = 3),
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.TungstenSteel.getMolten(36),
            output = GalacticraftMarsItems.ItemItemBasicAsteroids2.get(),
            ticks = 50,
            eu = 18,
        )
    }
}
