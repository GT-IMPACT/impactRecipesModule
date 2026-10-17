package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactDynamoHatchAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchDynamoEV.get(),
                GregTechItems.EVCoil.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorEV,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.BT6,
                    count = 2,
                ),
            ),
            fluid = Materials.Silver.getMolten(144),
            output = ImpactItems.DynamoMulti2EV.get(),
            ticks = 50,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchDynamoIV.get(),
                GregTechItems.IVCoil.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorIV,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Nitinol,
                    count = 2,
                ),
            ),
            fluid = Materials.Silver.getMolten(288),
            output = ImpactItems.DynamoMulti2IV.get(),
            ticks = 50,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerLuVIV.get(),
                ImpactItems.DynamoMulti2IV.get(),
                GregTechItems.CircuitChipHPIC.get(amount = 4),
                GregTechItems.IVCoil.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorIV,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Nitinol,
                    count = 2,
                ),
            ),
            fluid = Materials.Electrum.getMolten(288),
            output = ImpactItems.DynamoMulti4IV.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchDynamoLuV.get(),
                GregTechItems.LuVCoil.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorLuV,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.HastelloyN,
                    count = 2,
                ),
            ),
            fluid = Materials.Silver.getMolten(576),
            output = ImpactItems.DynamoMulti2LuV.get(),
            ticks = 50,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerZPMLuV.get(),
                ImpactItems.DynamoMulti2LuV.get(),
                GregTechItems.CircuitChipUHPIC.get(amount = 4),
                GregTechItems.LuVCoil.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorLuV,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.HastelloyN,
                    count = 2,
                ),
            ),
            fluid = Materials.Electrum.getMolten(576),
            output = ImpactItems.DynamoMulti4LuV.get(),
            ticks = 200,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerHAZPMLuV.get(),
                ImpactItems.DynamoMulti4LuV.get(),
                GregTechItems.CircuitChipUHPIC.get(amount = 8),
                GregTechItems.LuVCoil.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.SuperconductorLuV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.HastelloyN,
                    count = 4,
                ),
            ),
            fluid = Materials.Tungsten.getMolten(576),
            output = ImpactItems.DynamoMulti16LuV.get(),
            ticks = 800,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchDynamoZPM.get(),
                GregTechItems.ZPMCoil.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorZPM,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lafium,
                    count = 2,
                ),
            ),
            fluid = Materials.Silver.getMolten(1152),
            output = ImpactItems.DynamoMulti2ZPM.get(),
            ticks = 50,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerUVZPM.get(),
                ImpactItems.DynamoMulti2ZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 1,
                ),
                GregTechItems.CircuitChipNPIC.get(amount = 4),
                GregTechItems.ZPMCoil.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorZPM,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Lafium,
                    count = 2,
                ),
            ),
            fluid = Materials.Electrum.getMolten(1152),
            output = ImpactItems.DynamoMulti4ZPM.get(),
            ticks = 200,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerHAUVZPM.get(),
                ImpactItems.DynamoMulti4ZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 2,
                ),
                GregTechItems.CircuitChipNPIC.get(amount = 8),
                GregTechItems.ZPMCoil.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.SuperconductorZPM,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Lafium,
                    count = 4,
                ),
            ),
            fluid = Materials.Tungsten.getMolten(1152),
            output = ImpactItems.DynamoMulti16ZPM.get(),
            ticks = 800,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.WetTransformerUVZPM.get(),
                ImpactItems.DynamoMulti16ZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 4,
                ),
                GregTechItems.CircuitChipNPIC.get(amount = 16),
                GregTechItems.ZPMCoil.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.SuperconductorZPM,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Lafium,
                    count = 8,
                ),
            ),
            fluid = Materials.NiobiumTitanium.getMolten(1152),
            output = ImpactItems.DynamoMulti64ZPM.get(),
            ticks = 3200,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchDynamoUV.get(),
                GregTechItems.UVCoil.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorUV,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.CinobiteA243,
                    count = 2,
                ),
            ),
            fluid = Materials.Silver.getMolten(2304),
            output = ImpactItems.DynamoMulti2UV.get(),
            ticks = 50,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerMAXUV.get(),
                ImpactItems.DynamoMulti2UV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 1,
                ),
                GregTechItems.CircuitChipPPIC.get(amount = 4),
                GregTechItems.UVCoil.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorUV,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.CinobiteA243,
                    count = 2,
                ),
            ),
            fluid = Materials.Electrum.getMolten(2304),
            output = ImpactItems.DynamoMulti4UV.get(),
            ticks = 200,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerHAUHVUV.get(),
                ImpactItems.DynamoMulti4UV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 2,
                ),
                GregTechItems.CircuitChipPPIC.get(amount = 8),
                GregTechItems.UVCoil.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.SuperconductorUV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.CinobiteA243,
                    count = 4,
                ),
            ),
            fluid = Materials.Tungsten.getMolten(2304),
            output = ImpactItems.DynamoMulti16UV.get(),
            ticks = 800,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.WetTransformerUHVUV.get(),
                ImpactItems.DynamoMulti16UV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 4,
                ),
                GregTechItems.CircuitChipPPIC.get(amount = 16),
                GregTechItems.UVCoil.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.SuperconductorUV,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.CinobiteA243,
                    count = 8,
                ),
            ),
            fluid = Materials.NiobiumTitanium.getMolten(2304),
            output = ImpactItems.DynamoMulti64UV.get(),
            ticks = 3200,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchDynamoMAX.get(),
                GregTechItems.UHVCoil.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Pikyonium64B,
                    count = 2,
                ),
            ),
            fluid = Materials.Silver.getMolten(4608),
            output = ImpactItems.DynamoMulti2UHV.get(),
            ticks = 50,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerUEVUHV.get(),
                ImpactItems.DynamoMulti2UHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 1,
                ),
                GregTechItems.CircuitChipQPIC.get(amount = 4),
                GregTechItems.UHVCoil.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Superconductor,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Pikyonium64B,
                    count = 2,
                ),
            ),
            fluid = Materials.Electrum.getMolten(4608),
            output = ImpactItems.DynamoMulti4UHV.get(),
            ticks = 200,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerHAUEVUHV.get(),
                ImpactItems.DynamoMulti4UHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 2,
                ),
                GregTechItems.CircuitChipQPIC.get(amount = 8),
                GregTechItems.UHVCoil.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Superconductor,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Pikyonium64B,
                    count = 4,
                ),
            ),
            fluid = Materials.Tungsten.getMolten(4608),
            output = ImpactItems.DynamoMulti16UHV.get(),
            ticks = 800,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.WetTransformerUEVUHV.get(),
                ImpactItems.DynamoMulti16UHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 4,
                ),
                GregTechItems.CircuitChipQPIC.get(amount = 16),
                GregTechItems.UHVCoil.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Superconductor,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Pikyonium64B,
                    count = 8,
                ),
            ),
            fluid = Materials.NiobiumTitanium.getMolten(4608),
            output = ImpactItems.DynamoMulti64UHV.get(),
            ticks = 3200,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchDynamoUEV.get(),
                GregTechItems.UEVCoil.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorUEV,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Quantum,
                    count = 2,
                ),
            ),
            fluid = Materials.Silver.getMolten(9216),
            output = ImpactItems.DynamoMulti2UEV.get(),
            ticks = 50,
            eu = 8000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerUIVUEV.get(),
                ImpactItems.DynamoMulti2UEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 1,
                ),
                GregTechItems.CircuitChipFPIC.get(amount = 4),
                GregTechItems.UEVCoil.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorUEV,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Quantum,
                    count = 2,
                ),
            ),
            fluid = Materials.Electrum.getMolten(9216),
            output = ImpactItems.DynamoMulti4UEV.get(),
            ticks = 200,
            eu = 8000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.TransformerHAUIVUEV.get(),
                ImpactItems.DynamoMulti4UEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 2,
                ),
                GregTechItems.CircuitChipFPIC.get(amount = 8),
                GregTechItems.UEVCoil.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.SuperconductorUEV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Quantum,
                    count = 4,
                ),
            ),
            fluid = Materials.Tungsten.getMolten(9216),
            output = ImpactItems.DynamoMulti16UEV.get(),
            ticks = 800,
            eu = 8000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.WetTransformerUIVUEV.get(),
                ImpactItems.DynamoMulti16UEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 4,
                ),
                GregTechItems.CircuitChipFPIC.get(amount = 16),
                GregTechItems.UEVCoil.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.SuperconductorUEV,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Quantum,
                    count = 8,
                ),
            ),
            fluid = Materials.NiobiumTitanium.getMolten(9216),
            output = ImpactItems.DynamoMulti64UEV.get(),
            ticks = 3200,
            eu = 8000000,
        )
    }
}
