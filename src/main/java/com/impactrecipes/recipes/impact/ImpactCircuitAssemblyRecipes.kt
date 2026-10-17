package com.impactrecipes.recipes.impact

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactCircuitAssemblyRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                GalacticraftCoreItems.ItemHeavyPlating.get(),
                ImpactItems.Spacebox1.get(),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = ImpactItems.SchematicsTier1.get(),
            ticks = 1000,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                GalacticraftMarsItems.ItemNull3.get(),
                ImpactItems.Spacebox2.get(),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288),
            output = ImpactItems.SchematicsTier2.get(),
            ticks = 1600,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(),
                ImpactItems.Spacebox3.get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = ImpactItems.SchematicsTier3.get(),
            ticks = 2200,
            eu = 1920,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 1,
                ),
                ImpactItems.HeavyDutyPlateTier4.get(),
                ImpactItems.Spacebox4.get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(1152),
            output = ImpactItems.SchematicsTier4.get(),
            ticks = 2800,
            eu = 4096,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 1,
                ),
                ImpactItems.HeavyDutyPlateTier5.get(),
                ImpactItems.Spacebox5.get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(2304),
            output = ImpactItems.SchematicsTier5.get(),
            ticks = 3400,
            eu = 16384,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 1,
                ),
                ImpactItems.HeavyDutyPlateTier6.get(),
                ImpactItems.Spacebox6.get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(4608),
            output = ImpactItems.SchematicsTier6.get(),
            ticks = 4000,
            eu = 65536,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 1,
                ),
                ImpactItems.HeavyDutyPlateTier7.get(),
                ImpactItems.Spacebox7.get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(9216),
            output = ImpactItems.SchematicsTier7.get(),
            ticks = 4600,
            eu = 262144,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 1,
                ),
                ImpactItems.HeavyDutyPlateTier8.get(),
                ImpactItems.Spacebox8.get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(18432),
            output = ImpactItems.SchematicsTier8.get(),
            ticks = 5200,
            eu = 1048576,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                VanillaItems.OakSapling.get(amount = 64),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.OakScheme.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                VanillaItems.SpruceSapling.get(amount = 64),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.SpruceScheme.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                VanillaItems.BirchSapling.get(amount = 64),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.BirchScheme.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                VanillaItems.JungleSapling.get(amount = 64),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.JungleScheme.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                VanillaItems.AcaciaSapling.get(amount = 64),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.AcaciaScheme.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                VanillaItems.DarkOakSapling.get(amount = 64),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.DarkOakScheme.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                IC2Items.RubberSapling.get(amount = 64),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.RubberScheme.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.DraconiumAwakened,
                    count = 4,
                ),
                VanillaItems.JungleSapling.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.AlienOrganic,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Phoenixite,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CosmicNeutronium,
                    count = 64,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = ImpactItems.BarnardaCScheme.get(),
            ticks = 1000,
            eu = 8000000,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titanium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 8),
                GregTechItems.CircuitChipRam.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.AnnealedCopper,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288),
            output = ImpactItems.Processorx1.get(),
            ticks = 400,
            eu = 400,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titanium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 2),
                GregTechItems.CircuitChipRam.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.AnnealedCopper,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288),
            output = ImpactItems.Processorx1.get(),
            ticks = 200,
            eu = 400,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.TungstenSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 4),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 16),
                GregTechItems.CircuitChipRam.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Electrum,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = ImpactItems.Processorx4.get(),
            ticks = 600,
            eu = 1600,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.TungstenSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 4),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Electrum,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = ImpactItems.Processorx4.get(),
            ticks = 300,
            eu = 1600,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Chrome,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 32),
                GregTechItems.CircuitChipNAND.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Aluminium,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(1152),
            output = ImpactItems.Processorx16.get(),
            ticks = 800,
            eu = 3500,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Chrome,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 8),
                GregTechItems.CircuitChipNAND.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Aluminium,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(1152),
            output = ImpactItems.Processorx16.get(),
            ticks = 400,
            eu = 3500,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Iridium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 12),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 16),
                GregTechItems.CircuitChipNAND.get(amount = 20),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Graphene,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(2304),
            output = ImpactItems.Processorx64.get(),
            ticks = 800,
            eu = 16500,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Osmium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 16),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 24),
                GregTechItems.CircuitChipNOR.get(amount = 24),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.NiobiumTitanium,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(4608),
            output = ImpactItems.Processorx256.get(),
            ticks = 1600,
            eu = 70000,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Neutronium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 20),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 32),
                GregTechItems.CircuitChipNOR.get(amount = 28),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Enderium,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(9216),
            output = ImpactItems.Processorx1024.get(),
            ticks = 3200,
            eu = 230000,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Phoenixite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(amount = 24),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 48),
                GregTechItems.CircuitChipNOR.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.NaquadahAlloy,
                    count = 16,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(18432),
            output = ImpactItems.Processorx4096.get(),
            ticks = 6400,
            eu = 1250000,
            cleanroom = true,
        )
    }
}
