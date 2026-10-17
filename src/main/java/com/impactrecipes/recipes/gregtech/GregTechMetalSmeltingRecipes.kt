package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechMetalSmeltingRecipes {

    internal fun register() {
        MachineRecipes.blastFurnace(
            input = Materials.Iron.item(OrePrefixes.ingot).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Steel.item(OrePrefixes.ingot).get(),
            secondaryOutput = null,
            ticks = 500,
            eu = 120,
            temperature = 1000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.WroughtIron.item(OrePrefixes.ingot).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Steel.item(OrePrefixes.ingot).get(),
            secondaryOutput = null,
            ticks = 100,
            eu = 120,
            temperature = 1000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Copper.item(OrePrefixes.ingot).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.AnnealedCopper.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 500,
            eu = 120,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Ruby.item(OrePrefixes.dust).get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Aluminium.item(OrePrefixes.nugget).get(amount = 3),
            secondaryOutput = null,
            ticks = 400,
            eu = 100,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Ruby.item(OrePrefixes.gem).get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Aluminium.item(OrePrefixes.nugget).get(amount = 3),
            secondaryOutput = null,
            ticks = 320,
            eu = 100,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.GreenSapphire.item(OrePrefixes.dust).get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Aluminium.item(OrePrefixes.nugget).get(amount = 3),
            secondaryOutput = null,
            ticks = 400,
            eu = 100,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.GreenSapphire.item(OrePrefixes.gem).get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Aluminium.item(OrePrefixes.nugget).get(amount = 3),
            secondaryOutput = null,
            ticks = 320,
            eu = 100,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Sapphire.item(OrePrefixes.dust).get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Aluminium.item(OrePrefixes.nugget).get(amount = 3),
            secondaryOutput = GT_Values.NI,
            ticks = 400,
            eu = 100,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Sapphire.item(OrePrefixes.gem).get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Aluminium.item(OrePrefixes.nugget).get(amount = 3),
            secondaryOutput = GT_Values.NI,
            ticks = 320,
            eu = 100,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Ilmenite.item(OrePrefixes.dust).get(amount = 2),
            secondaryInput = Materials.Carbon.item(OrePrefixes.dust).get(amount = 2),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.WroughtIron.item(OrePrefixes.ingot).get(),
            secondaryOutput = Materials.Rutile.item(OrePrefixes.dust).get(),
            ticks = 800,
            eu = 480,
            temperature = 1700,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Magnesium.item(OrePrefixes.dust).get(amount = 2),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Titaniumtetrachloride.getFluid(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Titanium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = Materials.Magnesiumchloride.item(OrePrefixes.dust).get(amount = 2),
            ticks = 800,
            eu = 480,
            temperature = 2140,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Copper.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.AnnealedCopper.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 200,
            eu = 120,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.FerriteMixture.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(2000),
            fluidOutput = GT_Values.NF,
            output = Materials.NickelZincFerrite.item(OrePrefixes.ingot).get(),
            secondaryOutput = null,
            ticks = 400,
            eu = 120,
            temperature = Materials.NickelZincFerrite.mBlastFurnaceTemp.toInt(),
        )

        MachineRecipes.blastFurnace(
            input = ImpactItems.RawNeutroniumDust.get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Neutronium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 500000,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = ImpactItems.RawNeutroniumDust.get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.Neutronium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 200,
            eu = 500000,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Adamantium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Adamantium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 500000,
            temperature = 10800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Adamantium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Adamantium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2500,
            eu = 500000,
            temperature = 10800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Adamantium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.Adamantium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 200,
            eu = 500000,
            temperature = 10800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.ElectrumFlux.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.ElectrumFlux.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 122880,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.ElectrumFlux.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.ElectrumFlux.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 250,
            eu = 122880,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.HSSG.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.HSSG.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 800,
            eu = 1920,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.HSSG.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.HSSG.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1300,
            eu = 1920,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.HSSE.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.HSSE.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 900,
            eu = 1920,
            temperature = 5400,
        )

        MachineRecipes.blastFurnace(
            input = Materials.HSSE.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.HSSE.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1400,
            eu = 1920,
            temperature = 5400,
        )

        MachineRecipes.blastFurnace(
            input = Materials.HSSS.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.HSSS.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 1920,
            temperature = 5400,
        )

        MachineRecipes.blastFurnace(
            input = Materials.HSSS.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.HSSS.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 1920,
            temperature = 5400,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Naquadah.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Naquadah.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 500,
            eu = 7680,
            temperature = 5000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Naquadah.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(10).get(amount = 0),
            fluidInput = Materials.Radon.getGas(4000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Naquadah.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 7680,
            temperature = 5000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.NaquadahAlloy.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.NaquadahAlloy.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 400,
            eu = 122880,
            temperature = 7200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.NaquadahAlloy.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(10).get(amount = 0),
            fluidInput = Materials.Radon.getGas(4000L),
            fluidOutput = GT_Values.NF,
            output = Materials.NaquadahAlloy.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1600,
            eu = 122880,
            temperature = 7200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.NaquadahAlloy.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.NaquadahAlloy.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 40,
            eu = 122880,
            temperature = 7200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.NaquadahEnriched.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.NaquadahEnriched.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 500,
            eu = 7680,
            temperature = 7000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.NaquadahEnriched.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(10).get(amount = 0),
            fluidInput = Materials.Radon.getGas(4000L),
            fluidOutput = GT_Values.NF,
            output = Materials.NaquadahEnriched.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 7680,
            temperature = 7000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Naquadria.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Naquadria.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 500,
            eu = 122880,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Naquadria.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(10).get(amount = 0),
            fluidInput = Materials.Radon.getGas(4000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Naquadria.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 122880,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Naquadria.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.Naquadria.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 122880,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Osmiridium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000),
            fluidOutput = GT_Values.NF,
            output = Materials.Osmiridium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 500,
            eu = 30720,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.TungstenSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.TungstenSteel.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1300,
            eu = 480,
            temperature = 3000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.TungstenSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.TungstenSteel.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 800,
            eu = 480,
            temperature = 3000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Desh.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Desh.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 480,
            temperature = 3000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Desh.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Desh.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 800,
            eu = 480,
            temperature = 3000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.TungstenCarbide.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.TungstenCarbide.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 480,
            temperature = 2460,
        )

        MachineRecipes.blastFurnace(
            input = Materials.TungstenCarbide.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.TungstenCarbide.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 480,
            temperature = 2460,
        )

        MachineRecipes.blastFurnace(
            input = Materials.StainlessSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.StainlessSteel.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 800,
            eu = 480,
            temperature = 1700,
        )

        MachineRecipes.blastFurnace(
            input = Materials.StainlessSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.StainlessSteel.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 400,
            eu = 480,
            temperature = 1700,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Aluminium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Aluminium.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 400,
            eu = 120,
            temperature = 1700,
        )

        MachineRecipes.blastFurnace(
            input = Materials.MeteoricSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.MeteoricSteel.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 480,
            temperature = 2460,
        )

        MachineRecipes.blastFurnace(
            input = Materials.MeteoricSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.MeteoricSteel.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 480,
            temperature = 2460,
        )

        MachineRecipes.blastFurnace(
            input = Materials.NiobiumTitanium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.NiobiumTitanium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 480,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.NiobiumTitanium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.NiobiumTitanium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 480,
            temperature = 4500,
        )
    }
}
