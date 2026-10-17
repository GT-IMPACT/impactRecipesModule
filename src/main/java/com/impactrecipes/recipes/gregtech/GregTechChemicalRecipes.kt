package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class GregTechChemicalRecipes {

    internal fun mixing() {
        MachineRecipes.mixer(
            input = ImpactItems.CallistoIceDust.get(),
            secondaryInput = ImpactItems.EuropaIceDust.get(),
            input3 = Materials.Ledox.item(OrePrefixes.dust).get(),
            input4 = GT_Values.NI,
            fluidInput = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                3000,
            ),
            fluidOutput = Materials.SuperCoolant.getFluid(3000),
            output = Materials.Ice.item(OrePrefixes.dust).get(amount = 3),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.mixer(
            input = Materials.Sodium.item(OrePrefixes.dust).get(amount = 2),
            secondaryInput = Materials.Potassium.item(OrePrefixes.dust).get(amount = 3),
            input3 = IntegratedCircuit(2).get(amount = 0),
            input4 = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.SodiumPotassium.getFluid(1000),
            output = GT_Values.NI,
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.mixer(
            input = Materials.Clay.item(OrePrefixes.dust).get(amount = 3),
            secondaryInput = ImpactItems.ConcreteDust.get(),
            input3 = IntegratedCircuit(1).get(amount = 0),
            input4 = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Fireclay.item(OrePrefixes.dust).get(amount = 4),
            ticks = 200,
            eu = 8,
        )

        MachineRecipes.mixer(
            input = Materials.Stone.item(OrePrefixes.dust).get(amount = 2),
            secondaryInput = Materials.Gypsum.item(OrePrefixes.dust).get(),
            input3 = Materials.Calcite.item(OrePrefixes.dust).get(),
            input4 = IntegratedCircuit(2).get(amount = 0),
            fluidInput = Materials.Water.getFluid(1000L),
            fluidOutput = Materials.Concrete.getMolten(1152L),
            output = GT_Values.NI,
            ticks = 40,
            eu = 12,
        )

        MachineRecipes.mixer(
            input = Materials.Stone.item(OrePrefixes.dust).get(amount = 2),
            secondaryInput = Materials.Gypsum.item(OrePrefixes.dust).get(),
            input3 = Materials.Marble.item(OrePrefixes.dust).get(),
            input4 = IntegratedCircuit(2).get(amount = 0),
            fluidInput = Materials.Water.getFluid(1000L),
            fluidOutput = Materials.Concrete.getMolten(1152L),
            output = GT_Values.NI,
            ticks = 40,
            eu = 12,
        )

        MachineRecipes.mixer(
            input = ImpactItems.ConcreteDust.get(amount = 4),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            input3 = GT_Values.NI,
            input4 = GT_Values.NI,
            fluidInput = Materials.Water.getFluid(1000L),
            fluidOutput = Materials.Concrete.getMolten(1152L),
            output = GT_Values.NI,
            ticks = 40,
            eu = 12,
        )

        MachineRecipes.mixer(
            input = Materials.Naquadah.item(OrePrefixes.dust).get(amount = 2),
            secondaryInput = Materials.Osmiridium.item(OrePrefixes.dust).get(),
            input3 = Materials.Trinium.item(OrePrefixes.dust).get(),
            input4 = GT_Values.NI,
            input5 = GT_Values.NI,
            input6 = IntegratedCircuit(2).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.NaquadahAlloy.item(OrePrefixes.dust).get(amount = 4),
            ticks = (((400L * OrePrefixes.dust.mMaterialAmount) / 3628800L)).toInt(),
            eu = 8000,
        )

        MachineRecipes.mixer(
            input = Materials.NitricAcid.item(OrePrefixes.cell).get(),
            secondaryInput = GT_Values.NI,
            input3 = GT_Values.NI,
            input4 = GT_Values.NI,
            fluidInput = Materials.SulfuricAcid.getFluid(1000L),
            fluidOutput = Materials.NitrationMixture.getFluid(2000),
            output = Materials.Empty.item(OrePrefixes.cell).get(),
            ticks = (24 * 20),
            eu = 2,
        )

        // --- Dark Ash
        MachineRecipes.mixer(
            input = Materials.Carbon.item(OrePrefixes.dust).get(),
            secondaryInput = Materials.Ash.item(OrePrefixes.dust).get(),
            input3 = IntegratedCircuit(1).get(amount = 0),
            input4 = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.DarkAsh.item(OrePrefixes.dust).get(amount = 2),
            ticks = 200,
            eu = 7,
        )
    }

    internal fun electrolysis() {
        MachineRecipes.electrolyzer(
            input = Materials.Naqlatigon.item(OrePrefixes.dust).get(amount = 56),
            secondaryInput = null,
            fluidInput = null,
            fluidOutput = Materials.Radon.getGas(4000),
            output = Materials.Naquadria.item(OrePrefixes.dust).get(),
            secondaryOutput = Materials.NaquadahEnriched.item(OrePrefixes.dust).get(amount = 3),
            output3 = Materials.Naquadah.item(OrePrefixes.dust).get(amount = 13),
            output4 = Materials.Platinum.item(OrePrefixes.dust).get(amount = 16),
            output5 = Materials.Titanium.item(OrePrefixes.dust).get(amount = 19),
            output6 = null,
            chances = null,
            ticks = 1000,
            eu = 30720,
        )

        MachineRecipes.electrolyzer(
            input = Materials.Osmirinigon.item(OrePrefixes.dust).get(amount = 53),
            secondaryInput = null,
            fluidInput = null,
            fluidOutput = Materials.Argon.getGas(8000),
            output = Materials.Osmium.item(OrePrefixes.dust).get(amount = 2),
            secondaryOutput = Materials.Iridium.item(OrePrefixes.dust).get(amount = 2),
            output3 = Materials.Niobium.item(OrePrefixes.dust).get(amount = 7),
            output4 = Materials.Nickel.item(OrePrefixes.dust).get(amount = 13),
            output5 = Materials.Aluminium.item(OrePrefixes.dust).get(amount = 17),
            output6 = null,
            chances = null,
            ticks = 600,
            eu = 1020,
        )

        MachineRecipes.electrolyzer(
            input = Materials.Mithril.item(OrePrefixes.dust).get(amount = 5),
            secondaryInput = null,
            fluidInput = null,
            fluidOutput = null,
            output = Materials.CertusQuartz.item(OrePrefixes.dust).get(amount = 2),
            secondaryOutput = Materials.Platinum.item(OrePrefixes.dust).get(amount = 2),
            output3 = Materials.MeteoricIron.item(OrePrefixes.dust).get(),
            output4 = null,
            output5 = null,
            output6 = null,
            chances = null,
            ticks = 600,
            eu = 480,
        )
    }

    internal fun brewing() {
        MachineRecipes.brewing(
            ingredient = ImpactItems.BarnardaCBiochaff.get(),
            fluidInput = Materials.GrowthMediumRaw.getFluid(2000),
            fluidOutput = Materials.Bacteria.getFluid(2000),
            ticks = 600,
            eu = 1920,
            hidden = false,
        )

        MachineRecipes.brewing(
            ingredient = Materials.AlienOrganic.item(OrePrefixes.dust).get(),
            fluidInput = Materials.Bacteria.getFluid(1000),
            fluidOutput = Materials.AlienBiomass.getFluid(1000),
            ticks = 200,
            eu = 122880,
            hidden = false,
        )
    }

    internal fun bacterialCulture() {
        MachineRecipes.chemicalReactor(
            input = GregTechItems.CircuitChipBiocell.get(amount = 32),
            secondaryInput = ImpactItems.BarnardaCBiomass.get(),
            fluidInput = Materials.EnrichedBacterialSludge.getFluid(10000L),
            fluidOutput = Materials.BacterialSludge.getFluid(10000L),
            output = GregTechItems.CircuitChipBarnardacell.get(amount = 32),
            secondaryOutput = GT_Values.NI,
            ticks = 1600,
            eu = 2000000,
        )
    }
}
