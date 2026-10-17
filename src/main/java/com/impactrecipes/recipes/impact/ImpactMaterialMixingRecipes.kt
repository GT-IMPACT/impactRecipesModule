package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactMaterialMixingRecipes {

    internal fun register() {
        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Nickel,
                count = 32,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Molybdenum,
                count = 8,
            ),
            input3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Chrome,
                count = 7,
            ),
            input4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Cobalt,
                count = 1,
            ),
            input5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tungsten,
                count = 1,
            ),
            input6 = GT_Utility.getIntegratedCircuit(6),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.HastelloyC276,
                count = 49,
            ),
            ticks = 150 * 20,
            eu = 1920,
        )

        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Copper,
                count = 6,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tin,
                count = 2,
            ),
            input3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lead,
                count = 1,
            ),
            input4 = GT_Values.NI,
            input5 = GT_Values.NI,
            input6 = GT_Utility.getIntegratedCircuit(3),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Potin,
                count = 9,
            ),
            ticks = 20 * 20,
            eu = 8,
        )

        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iron,
                count = 5,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Invar,
                count = 5,
            ),
            input3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Silicon,
                count = 4,
            ),
            input4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Sulfur,
                count = 1,
            ),
            input5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Carbon,
                count = 1,
            ),
            input6 = GT_Utility.getIntegratedCircuit(3),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.EglinSteel,
                count = 16,
            ),
            ticks = 30 * 20,
            eu = 16,
        )

        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Neutronium,
                count = 1,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            input3 = GT_Values.NI,
            input4 = GT_Values.NI,
            fluidInput = Materials.Helium.getPlasma(125),
            fluidOutput = GT_Values.NF,
            output = ImpactItems.RawNeutroniumDust.get(),
            ticks = 200,
            eu = 122880,
        )

        MachineRecipes.mixer(
            input = ImpactItems.TCetiESeaweedExtract.get(amount = 64),
            secondaryInput = Materials.DeepIron.getDust(64),
            input3 = Materials.EuropiumoxideMagnetic.getDust(21),
            input4 = Materials.ChromiumTrioxide.getDust(64),
            input5 = RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.GarnetRed,
                count = 54,
            ),
            input6 = RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.Opal,
                count = 47,
            ),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = ImpactItems.StargateCrystalDust.get(),
            ticks = 3600,
            eu = 262144,
        )

        MachineRecipes.mixer(
            input = ImpactItems.BarnardaCBiomass.get(amount = 64),
            secondaryInput = Materials.DeepIron.getDust(64),
            input3 = Materials.EuropiumoxideMagnetic.getDust(21),
            input4 = Materials.ChromiumTrioxide.getDust(64),
            input5 = RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.GarnetRed,
                count = 54,
            ),
            input6 = RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.Opal,
                count = 47,
            ),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = ImpactItems.StargateCrystalDust.get(),
            ticks = 3600,
            eu = 262144,
        )

        MachineRecipes.mixer(
            input = ImpactItems.TCetiESeaweedExtract.get(amount = 16),
            secondaryInput = Materials.MysteriousCrystal.getDust(8),
            input3 = Materials.Oriharukon.getDust(8),
            input4 = Materials.BlackPlutonium.getDust(1),
            input5 = GT_Utility.getIntegratedCircuit(1),
            input6 = GT_Values.NI,
            fluidInput = Materials.Mutagen.getFluid(8000),
            fluidOutput = Materials.BioMediumRaw.getFluid(4000),
            output = Materials.Diamond.getDust(1),
            ticks = 200,
            eu = 122880,
        )

        MachineRecipes.mixer(
            input = ImpactItems.BarnardaCBiomass.get(amount = 16),
            secondaryInput = Materials.MysteriousCrystal.getDust(8),
            input3 = Materials.Oriharukon.getDust(8),
            input4 = Materials.BlackPlutonium.getDust(1),
            input5 = GT_Utility.getIntegratedCircuit(1),
            input6 = GT_Values.NI,
            fluidInput = Materials.Mutagen.getFluid(8000),
            fluidOutput = Materials.BioMediumRaw.getFluid(16000),
            output = Materials.Diamond.getDust(2),
            ticks = 200,
            eu = 122880,
        )

        MachineRecipes.mixer(
            input = ImpactItems.TCetiESeaweedExtract.get(amount = 64),
            secondaryInput = Materials.MysteriousCrystal.getDust(32),
            input3 = Materials.Oriharukon.getDust(32),
            input4 = Materials.InfinityCatalyst.getDust(1),
            input5 = GT_Utility.getIntegratedCircuit(2),
            input6 = GT_Values.NI,
            fluidInput = Materials.Mutagen.getFluid(32000),
            fluidOutput = Materials.BioMediumRaw.getFluid(32000),
            output = Materials.Diamond.getDust(2),
            ticks = 400,
            eu = 122880,
        )

        MachineRecipes.mixer(
            input = ImpactItems.BarnardaCBiomass.get(amount = 64),
            secondaryInput = Materials.MysteriousCrystal.getDust(32),
            input3 = Materials.Oriharukon.getDust(32),
            input4 = Materials.InfinityCatalyst.getDust(1),
            input5 = GT_Utility.getIntegratedCircuit(2),
            input6 = GT_Values.NI,
            fluidInput = Materials.Mutagen.getFluid(32000),
            fluidOutput = Materials.BioMediumRaw.getFluid(64000),
            output = Materials.Diamond.getDust(2),
            ticks = 400,
            eu = 122880,
        )

        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Stone,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Gypsum,
                count = 1,
            ),
            input3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Calcite,
                count = 1,
            ),
            input4 = GT_Utility.getIntegratedCircuit(1),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = ImpactItems.ConcreteDust.get(amount = 4),
            ticks = 200,
            eu = 8,
        )

        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Stone,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Gypsum,
                count = 1,
            ),
            input3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Marble,
                count = 1,
            ),
            input4 = GT_Utility.getIntegratedCircuit(1),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = ImpactItems.ConcreteDust.get(amount = 4),
            ticks = 200,
            eu = 8,
        )

        MachineRecipes.mixer(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustZirconium",
                1,
            ),
            secondaryInput = ImpactItems.DioxideYttrium.get(),
            input3 = null,
            input4 = null,
            input5 = null,
            input6 = GT_Utility.getIntegratedCircuit(2),
            fluidInput = null,
            fluidOutput = null,
            output = ImpactItems.YSZdust.get(amount = 2),
            ticks = 400,
            eu = 96,
        )

        MachineRecipes.mixer(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustCerium",
                9,
            ),
            secondaryInput = GregTech_API.getStackofAmountFromOreDict(
                "dustGadolinium",
                1,
            ),
            input3 = null,
            input4 = null,
            input5 = null,
            input6 = GT_Utility.getIntegratedCircuit(2),
            fluidInput = null,
            fluidOutput = null,
            output = ImpactItems.GDCdust.get(amount = 10),
            ticks = 400,
            eu = 96,
        )

        MachineRecipes.mixer(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustLanthanum",
                15,
            ),
            secondaryInput = GregTech_API.getStackofAmountFromOreDict(
                "dustStrontium",
                13,
            ),
            input3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iron,
                count = 8,
            ),
            input4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Cobalt,
                count = 2,
            ),
            input5 = null,
            input6 = GT_Utility.getIntegratedCircuit(2),
            fluidInput = null,
            fluidOutput = null,
            output = ImpactItems.LSCFdust.get(amount = 38),
            ticks = 400,
            eu = 96,
        )

        MachineRecipes.mixer(
            input = VanillaItems.Dirt.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(4),
            input3 = null,
            input4 = null,
            input5 = null,
            input6 = null,
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = null,
            output = ImpactItems.MudBall.get(amount = 4),
            ticks = 50,
            eu = 7,
        )
    }
}
