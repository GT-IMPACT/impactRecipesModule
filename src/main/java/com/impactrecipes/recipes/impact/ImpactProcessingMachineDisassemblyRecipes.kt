package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactProcessingMachineDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = GregTechItems.OilDrill2.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                IC2Items.AdvancedCircuit.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Titanium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Titanium,
                    count = 10,
                ),
            ),
            ticks = 400 * 20,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.OilDrill3.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                GregTechItems.ElectricPumpEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GregTechItems.CircuitData.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.TungstenSteel,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.TungstenSteel,
                    count = 16,
                ),
            ),
            ticks = 600 * 20,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.OilCracker.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                IC2Items.ElectronicCircuit.get(amount = 4),
                GregTechItems.CasingCoilCupronickel.get(amount = 4),
                GregTechItems.ElectricPumpHV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 8,
                ),
            ),
            ticks = 200 * 20,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiDieselEngine.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.CircuitData.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Titanium,
                    count = 2,
                ),
                GregTechItems.ElectricPistonEV.get(amount = 2),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 8,
                ),
            ),
            ticks = 400 * 20,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiDieselEngine2.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                GregTechItems.CircuitElite.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
                GregTechItems.ElectricPistonIV.get(amount = 2),
                GregTechItems.ElectricMotorIV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TungstenSteel,
                    count = 8,
                ),
            ),
            ticks = 800 * 20,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiLargeChemicalReactor.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                IC2Items.ElectronicCircuit.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Polytetrafluoroethylene,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 6,
                ),
            ),
            ticks = 200 * 20,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiImplosionCompressor.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                GregTechItems.ElectricPistonHV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 2,
                ),
                IC2Items.ElectronicCircuit.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Steel,
                    count = 8,
                ),
                GregTechItems.CasingExplosionHazard.get(),
            ),
            ticks = 300 * 20,
            eu = 250,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiVacuumFreezer.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                GregTechItems.CircuitData.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Aluminium,
                    count = 8,
                ),
                GregTechItems.CasingFrostHazard.get(),
            ),
            ticks = 300 * 20,
            eu = 250,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiLargeBoilerTitanium.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.CasingFireboxTitanium.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Titanium,
                    count = 3,
                ),
                GregTechItems.CircuitData.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Titanium,
                    count = 12,
                ),
            ),
            ticks = 400 * 20,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiLargeBoilerTungstenSteel.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                GregTechItems.CasingFireboxTungstenSteel.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.TungstenSteel,
                    count = 3,
                ),
                GregTechItems.CircuitElite.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.TungstenSteel,
                    count = 12,
                ),
            ),
            ticks = 600 * 20,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.DistillationTower.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricPumpEV.get(amount = 4),
                GregTechItems.CircuitData.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.StainlessSteel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.StainlessSteel,
                    count = 12,
                ),
            ),
            ticks = 400 * 20,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiblockCentrifuge.get(),
            outputs = arrayOf(
                GregTechItems.MachineEVCentrifuge.get(),
                GregTechItems.ElectricMotorEV.get(amount = 4),
                GregTechItems.CircuitData.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 8,
                ),
            ),
            ticks = 400 * 20,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiblockElectrolyzer.get(),
            outputs = arrayOf(
                GregTechItems.MachineEVElectrolyzer.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                GregTechItems.CircuitData.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Tungsten,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 8,
                ),
            ),
            ticks = 400 * 20,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineFlotationUnit.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricPumpEV.get(amount = 4),
                GregTechItems.CircuitData.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Titanium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Titanium,
                    count = 12,
                ),
            ),
            ticks = 400 * 20,
            eu = 480,
        )
    }
}
