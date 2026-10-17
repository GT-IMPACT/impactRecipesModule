package com.impactrecipes.recipes.nuclearcontrol

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.NuclearControlItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class NuclearControlPanelRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                IC2Items.MachineCasing.get(),
                VanillaItems.LimeStainedGlassPane.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Iron,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                GregTechItems.CoverScreen.get(amount = 2),
            ),
            fluid = null,
            output = NuclearControlItems.IndustrialInformationPanel.get(),
            ticks = 50,
            eu = 12,
        )
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                VanillaItems.LimeStainedGlassPane.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Wood,
                    count = 5,
                ),
            ),
            fluid = null,
            output = NuclearControlItems.InformationPanelExtender.get(),
            ticks = 50,
            eu = 12,
        )
        MachineRecipes.assembler(
            inputs = arrayOf(
                NuclearControlItems.IndustrialInformationPanel.get(),
                NuclearControlItems.RangeUpgrade.get(),
                NuclearControlItems.ColorUpgrade.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                IC2Items.CarbonPlate.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = NuclearControlItems.AdvancedInformationPanel.get(),
            ticks = 50,
            eu = 12,
        )
        MachineRecipes.assembler(
            inputs = arrayOf(
                NuclearControlItems.InformationPanelExtender.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                NuclearControlItems.ColorUpgrade.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                IC2Items.CarbonPlate.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = NuclearControlItems.AdvancedPanelExtender.get(),
            ticks = 50,
            eu = 12,
        )
    }
}
