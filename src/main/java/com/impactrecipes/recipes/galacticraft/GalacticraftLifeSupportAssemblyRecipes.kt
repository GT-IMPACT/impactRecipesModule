package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class GalacticraftLifeSupportAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = IC2Items.HazmatHelmet.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.ReinforcedGlass,
                count = 16,
            ),
            fluidInput = Materials.Rubber.getMolten(144),
            output = GalacticraftCoreItems.ItemOxygenMask.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.Aluminium,
                count = 4,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Polycaprolactam,
                count = 1,
            ),
            fluidInput = Materials.Polytetrafluoroethylene.getMolten(576),
            output = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(),
            ticks = 100,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = VanillaItems.RedstoneTorch.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glowstone,
                count = 1,
            ),
            output = GalacticraftCoreItems.TileGlowstoneTorch.get(),
            ticks = 200,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalacticraftCoreItems.ItemBasicItem9.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Steel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = GalacticraftCoreItems.ItemOilCanisterPartial1001.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalacticraftMarsItems.ItemItemBasicAsteroids6.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Titanium,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = GalacticraftMarsItems.ItemLOX28001.get(),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.TungstenSteel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = GalacticraftMarsItems.ItemLOX332001.get(),
            ticks = 400,
            eu = 1024,
        )

        MachineRecipes.assembler(
            input = GalacticraftCoreItems.TileOxygenPipe.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.ring,
                material = Materials.Copper,
                count = 4,
            ),
            output = GalacticraftMarsItems.TileHydrogenPipe.get(),
            ticks = 400,
            eu = 16,
        )
    }
}
