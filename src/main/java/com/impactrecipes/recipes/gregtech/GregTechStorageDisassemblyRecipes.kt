package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechStorageDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = GregTechItems.SuperTankULV.get(),
            outputs = arrayOf(
                ImpactItems.ULVPump.get(),
                GregTechItems.CasingTank0.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Bronze,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperTankLV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpLV.get(),
                GregTechItems.CasingTank1.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Bronze,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperTankMV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpMV.get(),
                GregTechItems.CasingTank2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperTankHV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpHV.get(),
                GregTechItems.CasingTank3.get(),
                GregTechItems.FieldGeneratorLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperTankEV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpEV.get(),
                GregTechItems.CasingTank4.get(),
                GregTechItems.FieldGeneratorMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperTankIV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpIV.get(),
                GregTechItems.CasingTank5.get(),
                GregTechItems.FieldGeneratorHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumTankLV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpIV.get(),
                GregTechItems.CasingTank6.get(),
                GregTechItems.FieldGeneratorEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumTankMV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpIV.get(),
                GregTechItems.CasingTank7.get(),
                GregTechItems.FieldGeneratorIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSSG,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumTankHV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpLuV.get(),
                GregTechItems.CasingTank8.get(),
                GregTechItems.FieldGeneratorLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSSS,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumTankEV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpZPM.get(),
                GregTechItems.CasingTank9.get(),
                GregTechItems.FieldGeneratorZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Europium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumTankIV.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpUV.get(),
                GregTechItems.CasingTank10.get(),
                GregTechItems.FieldGeneratorUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Americium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperChestLV.get(),
            outputs = arrayOf(
                GregTechItems.HullLV.get(),
                GregTechItems.ConveyorModuleMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Brass,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperChestMV.get(),
            outputs = arrayOf(
                GregTechItems.HullMV.get(),
                GregTechItems.ConveyorModuleHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperChestHV.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                GregTechItems.ConveyorModuleHV.get(),
                GregTechItems.FieldGeneratorLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuintuple,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperChestEV.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ConveyorModuleEV.get(),
                GregTechItems.FieldGeneratorMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuintuple,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.SuperChestIV.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                GregTechItems.ConveyorModuleEV.get(),
                GregTechItems.FieldGeneratorHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuadruple,
                    material = Materials.Titanium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumChestLV.get(),
            outputs = arrayOf(
                GregTechItems.HullLuV.get(),
                GregTechItems.ConveyorModuleIV.get(),
                GregTechItems.FieldGeneratorEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuadruple,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumChestMV.get(),
            outputs = arrayOf(
                GregTechItems.HullZPM.get(),
                GregTechItems.ConveyorModuleIV.get(),
                GregTechItems.FieldGeneratorIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.HSSG,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumChestHV.get(),
            outputs = arrayOf(
                GregTechItems.HullUV.get(),
                GregTechItems.ConveyorModuleLuV.get(),
                GregTechItems.FieldGeneratorLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.HSSS,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumChestEV.get(),
            outputs = arrayOf(
                GregTechItems.HullMAX.get(),
                GregTechItems.ConveyorModuleZPM.get(),
                GregTechItems.FieldGeneratorZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Europium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.QuantumChestIV.get(),
            outputs = arrayOf(
                GregTechItems.HullUEV.get(),
                GregTechItems.ConveyorModuleUV.get(),
                GregTechItems.FieldGeneratorUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Americium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }
}
