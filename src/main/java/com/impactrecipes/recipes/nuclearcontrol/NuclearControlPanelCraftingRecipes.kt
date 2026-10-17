package com.impactrecipes.recipes.nuclearcontrol

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.NuclearControlItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class NuclearControlPanelCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shaped(
            output = NuclearControlItems.IndustrialInformationPanel.get(),
            recipe = arrayOf(
                "ABA",
                "CDC",
                "EFE",
                'A',
                GregTechItems.CoverScreen.get(),
                'B',
                VanillaItems.LimeStainedGlassPane.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'D',
                IC2Items.MachineCasing.get(),
                'E',
                OrePrefixes.plate.get(Materials.Iron),
                'F',
                OrePrefixes.cableGt01.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.InformationPanelExtender.get(),
            recipe = arrayOf(
                "ABA",
                "CCC",
                "CDC",
                'A',
                "paneGlassLime",
                'B',
                GregTechItems.CoverScreen.get(),
                'C',
                OrePrefixes.plate.get(Materials.Wood),
                'D',
                OrePrefixes.cableGt01.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.AdvancedInformationPanel.get(),
            recipe = arrayOf(
                "ABC",
                "DED",
                "FGH",
                'A',
                NuclearControlItems.RangeUpgrade.get(),
                'B',
                NuclearControlItems.IndustrialInformationPanel.get(),
                'C',
                NuclearControlItems.ColorUpgrade.get(),
                'D',
                "plateAlloyCarbon",
                'E',
                OrePrefixes.circuit.get(Materials.Good),
                'F',
                "craftingToolWrench",
                'G',
                "craftingToolHardHammer",
                'H',
                "craftingToolScrewdriver",
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.AdvancedPanelExtender.get(),
            recipe = arrayOf(
                "ABC",
                "DED",
                "FGH",
                'A',
                OrePrefixes.circuit.get(Materials.Basic),
                'B',
                NuclearControlItems.InformationPanelExtender.get(),
                'C',
                NuclearControlItems.ColorUpgrade.get(),
                'D',
                "plateAlloyCarbon",
                'E',
                OrePrefixes.plate.get(Materials.Steel),
                'F',
                "craftingToolWrench",
                'G',
                "craftingToolHardHammer",
                'H',
                "craftingToolScrewdriver",
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.PortableInformationPanel.get(),
            recipe = arrayOf(
                "A  ",
                "BCB",
                "DEE",
                'A',
                OrePrefixes.cableGt01.get(Materials.Tin),
                'B',
                IC2Items.FrequencyTransmitter.get(),
                'C',
                NuclearControlItems.InformationPanelExtender.get(),
                'D',
                NuclearControlItems.RangeUpgrade.get(),
                'E',
                "plateAlloyCarbon",
            ),
        )
    }
}
