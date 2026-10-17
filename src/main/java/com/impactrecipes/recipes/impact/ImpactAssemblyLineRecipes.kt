package com.impactrecipes.recipes.impact

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class ImpactAssemblyLineRecipes {

    internal fun register() {
        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = ImpactItems.NaqChamberPart.get(),
            researchTicks = 144000,
            inputs = arrayOf<Any?>(
                ImpactItems.NqCasing.get(),
                ImpactItems.NaqChamberPart.get(amount = 6),
                GregTechItems.ElectricPumpLuV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Europium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Plutonium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Lead,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NaquadahAlloy,
                    count = 10,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Desh,
                    count = 16,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.Trinium.getMolten(1296),
                Materials.Osmium.getMolten(1296),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    2000,
                ),
                Materials.Argon.getGas(1000),
            ),
            output = ImpactItems.InsideMachineBlock.get(),
            ticks = 120 * 20,
            eu = 10000,
        )

        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = ImpactItems.TachyonTube.get(),
            researchTicks = 156000,
            inputs = arrayOf<Any?>(
                ImpactItems.TachyonTube.get(amount = 6),
                GregTechItems.ElectricPistonLuV.get(amount = 8),
                GregTechItems.EmitterLuV.get(amount = 8),
                GregTechItems.SensorLuV.get(amount = 8),
                ImpactItems.HugeChargedGlassLense.get(amount = 10),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Master),
                    16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.NaquadahAlloy,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.NaquadahAlloy,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.Diamond,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.Diamond,
                    count = 16,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.Duranium.getMolten(1296),
                Materials.Osmiridium.getMolten(1296),
                Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.getMolten(1296),
                Materials.NiobiumTitanium.getMolten(1296),
            ),
            output = ImpactItems.NaquadahTether.get(),
            ticks = 160 * 20,
            eu = 14576,
        )

        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = RecipeItems.ore(
                prefix = OrePrefixes.pipeHuge,
                material = Materials.Inconel792,
                count = 1,
            ),
            researchTicks = 156000,
            inputs = arrayOf<Any?>(
                GregTechItems.HullLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 4,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Master),
                    4,
                ),
                ImpactItems.LargeScreen.get(),
                GregTechItems.ElectricMotorLuV.get(amount = 4),
                GregTechItems.ElectricPumpLuV.get(amount = 4),
                GregTechItems.ConveyorModuleLuV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Inconel792,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSS,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.TiBetaC,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.TiBetaC,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.HSSS,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1152),
                Materials.Lubricant.getFluid(1000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    1000,
                ),
                Materials.Osmiridium.getMolten(1152),
            ),
            output = ImpactItems.HeavyMetalCyclone.get(),
            ticks = 160 * 20,
            eu = 30720,
        )

        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = RecipeItems.ore(
                prefix = OrePrefixes.pipeHuge,
                material = Materials.MaragingSteel300,
                count = 1,
            ),
            researchTicks = 172000,
            inputs = arrayOf<Any?>(
                ImpactItems.NaquadahChamberCasing.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
                GregTechItems.ElectricPumpLuV.get(amount = 4),
                GregTechItems.FieldGeneratorLuV.get(amount = 4),
                GregTechItems.SensorLuV.get(amount = 4),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Master),
                    4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorLuV,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.Ruby,
                    count = 8,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1152),
                Materials.Lubricant.getFluid(1000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    1000,
                ),
                Materials.Trinium.getMolten(1152),
            ),
            output = ImpactItems.NaquadahLiquidMulti.get(),
            ticks = 240 * 20,
            eu = 26780,
        )

        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = RecipeItems.ore(
                prefix = OrePrefixes.pipeHuge,
                material = Materials.Inconel690,
                count = 1,
            ),
            researchTicks = 256000,
            inputs = arrayOf<Any?>(
                ImpactItems.TetherCore.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Inconel690,
                    count = 6,
                ),
                GregTechItems.ElectricPumpZPM.get(amount = 6),
                GregTechItems.FieldGeneratorZPM.get(amount = 8),
                GregTechItems.SensorZPM.get(amount = 8),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Ultimate),
                    8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorZPM,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.Sapphire,
                    count = 16,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2304),
                Materials.Lubricant.getFluid(2000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    2000,
                ),
                Materials.Oriharukon.getMolten(2304),
            ),
            output = ImpactItems.NaquadahLiquidEnriched.get(),
            ticks = 320 * 20,
            eu = 118236,
        )

        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = AE2Items.Controller.get(),
            researchTicks = 172000,
            inputs = arrayOf<Any?>(
                AE2Items.Controller.get(),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Elite),
                    4,
                ),
                GregTechItems.ToolDataOrb.get(),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorIV,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Duraluminium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2304),
                Materials.Lubricant.getFluid(2000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    2000,
                ),
                Materials.Hydrogen.getGas(2000),
            ),
            output = ImpactItems.ParallelComputer.get(),
            ticks = 100 * 20,
            eu = 30720,
        )
    }
}
