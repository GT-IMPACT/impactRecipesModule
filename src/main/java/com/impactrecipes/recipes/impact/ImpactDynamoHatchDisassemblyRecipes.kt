package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactDynamoHatchDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti2EV.get(),
            outputs = arrayOf(
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
            ticks = 500,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti2IV.get(),
            outputs = arrayOf(
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
            ticks = 500,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti4IV.get(),
            outputs = arrayOf(
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
            ticks = 1000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti2LuV.get(),
            outputs = arrayOf(
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
            ticks = 500,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti4LuV.get(),
            outputs = arrayOf(
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
            ticks = 1000,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti16LuV.get(),
            outputs = arrayOf(
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
            ticks = 2000,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti2ZPM.get(),
            outputs = arrayOf(
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
            ticks = 500,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti4ZPM.get(),
            outputs = arrayOf(
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
            ticks = 1000,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti16ZPM.get(),
            outputs = arrayOf(
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
            ticks = 2000,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti64ZPM.get(),
            outputs = arrayOf(
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
            ticks = 4000,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti2UV.get(),
            outputs = arrayOf(
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
            ticks = 500,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti4ZPM.get(),
            outputs = arrayOf(
                GregTechItems.TransformerUVZPM.get(),
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
            ticks = 1000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti16UV.get(),
            outputs = arrayOf(
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
            ticks = 2000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti64UV.get(),
            outputs = arrayOf(
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
            ticks = 4000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti2UHV.get(),
            outputs = arrayOf(
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
            ticks = 500,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti4UHV.get(),
            outputs = arrayOf(
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
            ticks = 1000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti16UHV.get(),
            outputs = arrayOf(
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
            ticks = 2000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti64UHV.get(),
            outputs = arrayOf(
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
            ticks = 4000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti2UEV.get(),
            outputs = arrayOf(
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
            ticks = 500,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti4UEV.get(),
            outputs = arrayOf(
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
            ticks = 1000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti16UEV.get(),
            outputs = arrayOf(
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
            ticks = 2000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.DynamoMulti64UEV.get(),
            outputs = arrayOf(
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
            ticks = 4000,
            eu = 500000,
        )
    }
}
