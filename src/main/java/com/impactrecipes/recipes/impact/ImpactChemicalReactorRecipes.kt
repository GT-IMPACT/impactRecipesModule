package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.StargateItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import com.impactrecipes.util.asNonConsumable
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactChemicalReactorRecipes {

    internal fun register() {
        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                GregTechItems.CircuitChipRPico.get(),
                Materials.MysteriousCrystal.getDust(2),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.InfinityCatalyst,
                    count = 1,
                )?.asNonConsumable(),
                ImpactItems.TCetiESeaweedExtract.get(),
            ),
            fluidInputs = arrayOf(
                Materials.Neutronium.getMolten(100),
            ),
            fluidOutputs = arrayOf(
                GT_Values.NF,
            ),
            outputs = arrayOf(
                GregTechItems.CircuitChipPico.get(),
            ),
            ticks = 3000,
            eu = 500000,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                GregTechItems.CircuitChipRPico.get(),
                Materials.MysteriousCrystal.getDust(2),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.InfinityCatalyst,
                    count = 1,
                )?.asNonConsumable(),
                ImpactItems.BarnardaCBiomass.get(),
            ),
            fluidInputs = arrayOf(
                Materials.Neutronium.getMolten(100),
            ),
            fluidOutputs = arrayOf(
                GT_Values.NF,
            ),
            outputs = arrayOf(
                GregTechItems.CircuitChipPico.get(),
            ),
            ticks = 3000,
            eu = 500000,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                ImpactItems.TCetiESeaweedExtract.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInputs = arrayOf(
                Materials.Radon.getGas(1000),
            ),
            fluidOutputs = arrayOf(
                Materials.OilHeavy.getFluid(500),
                Materials.Ethanol.getFluid(300),
                Materials.EnrichedBacterialSludge.getFluid(200),
            ),
            outputs = arrayOf(
                Materials.AlienOrganic.getDust(1),
            ),
            ticks = 500,
            eu = 500000,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                ImpactItems.BarnardaCBiomass.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInputs = arrayOf(
                Materials.Radon.getGas(1000),
            ),
            fluidOutputs = arrayOf(
                Materials.OilMedium.getFluid(500),
                Materials.Methanol.getFluid(350),
                Materials.EnrichedBacterialSludge.getFluid(150),
            ),
            outputs = arrayOf(
                Materials.AlienOrganic.getDust(1),
            ),
            ticks = 500,
            eu = 500000,
        )

        MachineRecipes.chemicalReactor(
            input = Materials.Yttrium.getDust(2),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Oxygen.getGas(3000),
            fluidOutput = null,
            output = ImpactItems.DioxideYttrium.get(),
            secondaryOutput = null,
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluidInputs = arrayOf(
                Materials.Nitrogen.getGas(1000),
                Materials.Oxygen.getGas(2000),
            ),
            fluidOutputs = arrayOf(
                Materials.NitrogenDioxide.getGas(3000),
            ),
            outputs = null,
            ticks = 8 * 20,
            eu = 30,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                StargateItems.CoreCrystal.get(),
                GregTechItems.Gravistar.get(amount = 16),
                Materials.CosmicNeutronium.getDust(32),
                Materials.Adamantium.getDust(64),
            ),
            fluidInputs = arrayOf(
                Materials.InfinityCatalyst.getMolten(5760),
            ),
            fluidOutputs = arrayOf(
                GT_Values.NF,
            ),
            outputs = arrayOf(
                ImpactItems.InfinityCatalyst.get(),
            ),
            ticks = 3000,
            eu = 8000000,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                ImpactItems.InfinityCatalyst.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Adamantium,
                    count = 1,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.Neutronium.getPlasma(144),
            ),
            fluidOutputs = arrayOf(
                Materials.Neutronium.getMolten(144),
            ),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingotHot,
                    material = Materials.Infinity,
                    count = 1,
                ),
            ),
            ticks = 4000,
            eu = 8000000,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                ImpactItems.Zircon.get(),
            ),
            fluidInputs = arrayOf(
                Materials.Chlorine.getGas(2000),
            ),
            fluidOutputs = arrayOf(
                Materials.Oxygen.getGas(1000),
            ),
            outputs = arrayOf(
                Materials.SiliconDioxide.getDust(1),
                ImpactItems.ZirconiumChloride.get(),
            ),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.chemicalReactor(
            input = ImpactItems.ZirconiumChloride.get(),
            secondaryInput = Materials.Magnesium.getDust(2),
            fluidInput = null,
            fluidOutput = null,
            output = Materials.Zirconium.getDust(1),
            secondaryOutput = Materials.Magnesiumchloride.getDust(2),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                null,
            ),
            fluidInputs = arrayOf(
                Materials.SiliconTetrachloride.getFluid(1000),
                Materials.Water.getFluid(2000),
            ),
            fluidOutputs = arrayOf(
                Materials.HydrochloricAcid.getFluid(2000),
            ),
            outputs = arrayOf(
                Materials.SiliconDioxide.getDust(1),
            ),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                null,
            ),
            fluidInputs = arrayOf(
                Materials.SulfuricAcid.getFluid(1000),
                Materials.Ammonia.getGas(2000),
            ),
            fluidOutputs = arrayOf(
                Materials.AmmoniumSulfate.getFluid(3000),
            ),
            outputs = arrayOf(
                null,
            ),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.multiblockChemicalReactor(
            inputs = arrayOf(
                null,
            ),
            fluidInputs = arrayOf(
                Materials.AmmoniumSulfate.getFluid(1000),
                Materials.SulfuricAcid.getFluid(1000),
            ),
            fluidOutputs = arrayOf(
                Materials.AmmoniumPersulfate.getFluid(1000),
                Materials.Hydrogen.getGas(1000),
            ),
            outputs = arrayOf(
                null,
            ),
            ticks = 200,
            eu = 480,
        )
    }
}
