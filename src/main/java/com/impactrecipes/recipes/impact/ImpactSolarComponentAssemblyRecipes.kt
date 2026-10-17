package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactSolarComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ReinforcedAluminiumIronPlate.get(),
                VanillaItems.Glowstone.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.Iron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.RedAlloy,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(144),
            output = ImpactItems.IrradiantReinforcedAluminiumPlate.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ReinforcedTitaniumIronPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.gem,
                    material = Materials.Diamond,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.MeteoricIron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lapis,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(288),
            output = ImpactItems.IrradiantReinforcedTitaniumPlate.get(),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ReinforcedTungstenIronPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.Ruby,
                    count = 1,
                ),
                GalacticraftMarsItems.ItemNull5.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Uranium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(576),
            output = ImpactItems.IrradiantReinforcedTungstenPlate.get(),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ReinforcedTungstenSteelIronPlate.get(),
                ImpactItems.Sunnarium.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.Naquadah,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Plutonium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(1152),
            output = ImpactItems.IrradiantReinforcedTungstenSteelPlate.get(),
            ticks = 600,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ReinforcedChromeIronPlate.get(),
                ImpactItems.SunnariumAlloy.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.Draconium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Europium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(2304),
            output = ImpactItems.IrradiantReinforcedChromePlate.get(),
            ticks = 600,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ReinforcedIridiumIronPlate.get(),
                ImpactItems.EnrichedSunnariumAlloy.get(),
                ImpactItems.MysteriousCrystalCompressedPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Americium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(4608),
            output = ImpactItems.IrradiantReinforcedIridiumPlate.get(),
            ticks = 600,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ReinforcedNaquadriaIronPlate.get(),
                ImpactItems.EnrichedNaquadriaSunnariumAlloy.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.Quantium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Neutronium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(9216),
            output = ImpactItems.IrradiantReinforcedNaquadriaPlate.get(),
            ticks = 600,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ReinforcedNeutroniumIronPlate.get(),
                ImpactItems.EnrichedNeutroniumSunnariumAlloy.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.BlackPlutonium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Phoenixite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(18432),
            output = ImpactItems.IrradiantReinforcedNeutroniumPlate.get(),
            ticks = 600,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Sunnarium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateAlloy,
                    material = Materials.Iridium,
                    count = 8,
                ),
            ),
            fluid = null,
            output = ImpactItems.SunnariumAlloy.get(),
            ticks = 800,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Uranium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Glowstone,
                    count = 4,
                ),
            ),
            fluid = null,
            output = ImpactItems.IrradiantUranium.get(),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.Sunnarium.get(),
                ImpactItems.IrradiantUranium.get(amount = 8),
            ),
            fluid = null,
            output = ImpactItems.EnrichedSunnarium.get(),
            ticks = 1200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.SunnariumAlloy.get(),
                ImpactItems.EnrichedSunnarium.get(amount = 8),
            ),
            fluid = null,
            output = ImpactItems.EnrichedSunnariumAlloy.get(),
            ticks = 1600,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.EnrichedSunnariumAlloy.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Naquadria,
                    count = 8,
                ),
            ),
            fluid = null,
            output = ImpactItems.EnrichedNaquadriaSunnariumAlloy.get(),
            ticks = 1800,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.EnrichedNaquadriaSunnariumAlloy.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Neutronium,
                    count = 8,
                ),
            ),
            fluid = Materials.ElectrumFlux.getMolten(1152),
            output = ImpactItems.EnrichedNeutroniumSunnariumAlloy.get(),
            ticks = 2000,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverSolarPanel.get(amount = 8),
            secondaryInput = GT_Utility.getIntegratedCircuit(8),
            output = GregTechItems.CoverSolarPanel8V.get(),
            ticks = 100,
            eu = 6,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverSolarPanel8V.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = GregTechItems.CoverSolarPanelLV.get(),
            ticks = 120,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverSolarPanelLV.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = GregTechItems.CoverSolarPanelMV.get(),
            ticks = 140,
            eu = 24,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverSolarPanelMV.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = GregTechItems.CoverSolarPanelHV.get(),
            ticks = 160,
            eu = 48,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverSolarPanelHV.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = GregTechItems.CoverSolarPanelEV.get(),
            ticks = 180,
            eu = 96,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverSolarPanelEV.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = GregTechItems.CoverSolarPanelIV.get(),
            ticks = 200,
            eu = 192,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverSolarPanelIV.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = GregTechItems.CoverSolarPanelLuV.get(),
            ticks = 220,
            eu = 384,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverSolarPanelLuV.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = GregTechItems.CoverSolarPanelZPM.get(),
            ticks = 240,
            eu = 768,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverSolarPanelZPM.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            output = GregTechItems.CoverSolarPanelUV.get(),
            ticks = 260,
            eu = 1536,
        )
    }
}
