package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactReactorComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricMotorEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lead,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = Materials.Polytetrafluoroethylene.getMolten(576),
            output = ImpactItems.NuclearHatchRod.get(),
            ticks = 480,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricMotorEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lead,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = Materials.Polybenzimidazole.getMolten(72),
            output = ImpactItems.NuclearHatchRod.get(),
            ticks = 480,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                IC2Items.ReinforcedGlass.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.Empty180SpCell.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.Empty180SpCell.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TungstenSteel,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.Empty360SpCell.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.Empty180SpCell.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TungstenSteel,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.Empty540SpCell.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.Empty180SpCell.get(),
                ImpactItems.Empty360SpCell.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TungstenSteel,
                    count = 7,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.Empty540SpCell.get(),
            ticks = 100,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.Empty540SpCell.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TungstenSteel,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.ElectrumFlux,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.Empty1080SpCell.get(),
            ticks = 200,
            eu = 1020,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Steel,
                count = 3,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(3),
            output = ImpactItems.SteelBars.get(amount = 4),
            ticks = 400,
            eu = 48,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Steel,
                count = 1,
            ),
            secondaryInput = ImpactItems.SteelBars.get(amount = 6),
            output = ImpactItems.CasingFarm.get(),
            ticks = 50,
            eu = 16,
        )
    }
}
