package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactEnergyHatchDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.EnergyMulti4IV.get(),
            outputs = arrayOf(
                GregTechItems.TransformerLuVIV.get(),
                GregTechItems.HatchEnergyIV.get(),
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
            input = ImpactItems.EnergyMulti4LuV.get(),
            outputs = arrayOf(
                GregTechItems.TransformerZPMLuV.get(),
                GregTechItems.HatchEnergyLuV.get(),
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
            input = ImpactItems.EnergyMulti16LuV.get(),
            outputs = arrayOf(
                GregTechItems.TransformerHAZPMLuV.get(),
                ImpactItems.EnergyMulti4LuV.get(),
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
            input = ImpactItems.EnergyMulti4ZPM.get(),
            outputs = arrayOf(
                GregTechItems.TransformerUVZPM.get(),
                GregTechItems.HatchEnergyZPM.get(),
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
            input = ImpactItems.EnergyMulti16ZPM.get(),
            outputs = arrayOf(
                GregTechItems.TransformerHAUVZPM.get(),
                ImpactItems.EnergyMulti4ZPM.get(),
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
            input = ImpactItems.EnergyMulti64ZPM.get(),
            outputs = arrayOf(
                GregTechItems.WetTransformerUVZPM.get(),
                ImpactItems.EnergyMulti16ZPM.get(),
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
            input = ImpactItems.EnergyMulti4UV.get(),
            outputs = arrayOf(
                GregTechItems.TransformerMAXUV.get(),
                GregTechItems.HatchEnergyUV.get(),
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
            input = ImpactItems.EnergyMulti16UV.get(),
            outputs = arrayOf(
                GregTechItems.TransformerHAUHVUV.get(),
                ImpactItems.EnergyMulti4UV.get(),
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
            input = ImpactItems.EnergyMulti64UV.get(),
            outputs = arrayOf(
                GregTechItems.WetTransformerUHVUV.get(),
                ImpactItems.EnergyMulti16UV.get(),
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
            input = ImpactItems.EnergyMulti4UHV.get(),
            outputs = arrayOf(
                GregTechItems.TransformerUEVUHV.get(),
                GregTechItems.HatchEnergyMAX.get(),
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
            input = ImpactItems.EnergyMulti16UHV.get(),
            outputs = arrayOf(
                GregTechItems.TransformerHAUEVUHV.get(),
                ImpactItems.EnergyMulti4UHV.get(),
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
            input = ImpactItems.EnergyMulti64UHV.get(),
            outputs = arrayOf(
                GregTechItems.WetTransformerUEVUHV.get(),
                ImpactItems.EnergyMulti16UHV.get(),
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
            input = ImpactItems.EnergyMulti4UEV.get(),
            outputs = arrayOf(
                GregTechItems.TransformerUIVUEV.get(),
                GregTechItems.HatchEnergyUEV.get(),
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
            input = ImpactItems.EnergyMulti16UEV.get(),
            outputs = arrayOf(
                GregTechItems.TransformerHAUIVUEV.get(),
                ImpactItems.EnergyMulti4UEV.get(),
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
            input = ImpactItems.EnergyMulti64UEV.get(),
            outputs = arrayOf(
                GregTechItems.WetTransformerUIVUEV.get(),
                ImpactItems.EnergyMulti16UEV.get(),
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
