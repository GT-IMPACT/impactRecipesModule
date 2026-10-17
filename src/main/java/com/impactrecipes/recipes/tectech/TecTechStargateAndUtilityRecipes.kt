package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.StargateItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class TecTechStargateAndUtilityRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLine(
            researchItem = RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.CosmicNeutronium,
                count = 1,
            ),
            researchComputation = 96000,
            computationPerSecond = 256,
            researchEu = 2000000,
            researchAmperage = 8,
            inputs = arrayOf(
                GregTechItems.SensorUV.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.Adamantium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.Osmiridium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.Neutronium.getMolten(9216),
                Materials.Tritanium.getMolten(9216),
                Materials.Tetranaquadahdiindiumhexaplatiumosminid.getMolten(9216),
                Materials.Silver.getPlasma(9216),
            ),
            output = ImpactItems.StargateShieldingFoil.get(),
            ticks = 1200,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = ImpactItems.StargateShieldingFoil.get(),
            researchComputation = 96000,
            computationPerSecond = 256,
            researchEu = 2000000,
            researchAmperage = 8,
            inputs = arrayOf<Any?>(
                GregTechItems.ElectricPistonUV.get(amount = 4),
                GregTechItems.ElectricMotorUV.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.Adamantium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.DraconiumAwakened,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.DraconiumAwakened,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.Ruby,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.GarnetRed,
                    count = 16,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Nano),
                    1,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.Neutronium.getMolten(9216),
                Materials.Tritanium.getMolten(9216),
                Materials.Tetranaquadahdiindiumhexaplatiumosminid.getMolten(9216),
                Materials.Silver.getPlasma(9216),
            ),
            output = ImpactItems.StargateChevron.get(),
            ticks = 1200,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Neutronium,
                count = 1,
            ),
            researchComputation = 96000,
            computationPerSecond = 256,
            researchEu = 2000000,
            researchAmperage = 8,
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Adamantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.NaquadahAlloy,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.CosmicNeutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Osmiridium,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.Neutronium.getMolten(9216),
                Materials.Tritanium.getMolten(9216),
                Materials.Concrete.getMolten(9216),
            ),
            output = ImpactItems.StargateFramePart.get(),
            ticks = 1200,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = RecipeItems.ore(
                prefix = OrePrefixes.pipeHuge,
                material = Materials.Naquadah,
                count = 1,
            ),
            researchComputation = 24000,
            computationPerSecond = 64,
            researchEu = 500000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                ImpactItems.NaquadahLiquidEnriched.get(),
                GregTechItems.CasingFusionCoil.get(amount = 8),
                GregTechItems.ElectricPumpUV.get(amount = 12),
                GregTechItems.FieldGeneratorUV.get(amount = 16),
                GregTechItems.SensorUV.get(amount = 16),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Superconductor),
                    32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.SuperconductorUV,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.MysteriousCrystal,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(4608),
                Materials.Lubricant.getFluid(4000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    4000,
                ),
                Materials.Quantium.getMolten(4608),
            ),
            output = ImpactItems.NaquadahMulti.get(),
            ticks = 320 * 20,
            eu = 500000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = StargateItems.Controller.get(),
            researchComputation = 512000,
            computationPerSecond = 2048,
            researchEu = 30000000,
            researchAmperage = 256,
            inputs = arrayOf<Any?>(
                GregTechItems.HullUEV.get(),
                StargateItems.Base.get(),
                StargateItems.Ring.get(amount = 8),
                StargateItems.Chevron.get(amount = 4),
                StargateItems.IC2PowerUnit.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.SuperconductorUEV,
                    count = 16,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Quantum),
                    8,
                ),
                GregTechItems.SensorUEV.get(amount = 16),
                GregTechItems.EmitterUEV.get(amount = 16),
                GregTechItems.FieldGeneratorUEV.get(amount = 4),
                GregTechItems.CircuitChipFPIC.get(amount = 64),
                GregTechItems.CircuitChipFPIC.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.BlackPlutonium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.BlackPlutonium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.BlackPlutonium,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.Infinity.getMolten(2304),
                Materials.PerroxPolymer.getMolten(9216),
                Materials.Phoenixite.getMolten(9216),
                Materials.Americium.getPlasma(9216),
            ),
            output = GregTechItems.Teleporter.get(),
            ticks = 300 * 20,
            eu = 512000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.HatchAutoMaintenance.get(),
            researchComputation = 24000,
            computationPerSecond = 64,
            researchEu = 500000,
            researchAmperage = 6,
            inputs = arrayOf<Any?>(
                GregTechItems.HatchAutoMaintenance.get(),
                GregTechItems.RobotArmUV.get(),
                GregTechItems.ElectricPumpUV.get(),
                GregTechItems.ConveyorModuleUV.get(),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Superconductor),
                    4,
                ),
                GregTechItems.EnergyLapotronicOrb2.get(),
                GregTechItems.DuctTape.get(amount = 64),
                GregTechItems.DuctTape.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Americium,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.Lubricant.getFluid(256000),
                Materials.SolderingAlloy.getMolten(1296),
            ),
            output = ImpactItems.Maintenance.get(),
            ticks = 6000,
            eu = 500000,
        )
    }
}
