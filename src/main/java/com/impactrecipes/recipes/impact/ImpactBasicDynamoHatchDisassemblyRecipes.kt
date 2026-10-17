package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactBasicDynamoHatchDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = GregTechItems.HatchDynamoULV.get(),
            outputs = arrayOf(
                GregTechItems.HullULV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Lead,
                    count = 1,
                ),
                GregTechItems.CircuitPartsVacuumTube.get(),
                GregTechItems.ULVCoil.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Lead,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 6,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchDynamoLV.get(),
            outputs = arrayOf(
                GregTechItems.HullLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Tin,
                    count = 1,
                ),
                IC2Items.ElectronicCircuit.get(),
                GregTechItems.LVCoil.get(amount = 2),
                GregTechItems.ElectricPumpLV.get(),
            ),
            ticks = 2000,
            eu = 30,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchDynamoMV.get(),
            outputs = arrayOf(
                GregTechItems.HullMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Copper,
                    count = 1,
                ),
                GregTechItems.CircuitGood.get(),
                GregTechItems.MVCoil.get(amount = 2),
                GregTechItems.ElectricPumpMV.get(),
            ),
            ticks = 2000,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchDynamoHV.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Gold,
                    count = 1,
                ),
                GregTechItems.CircuitChipLPIC.get(amount = 2),
                GregTechItems.HVCoil.get(amount = 2),
                GregTechItems.ElectricPumpHV.get(),
            ),
            ticks = 2000,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchDynamoEV.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GregTechItems.CircuitChipPIC.get(amount = 2),
                GregTechItems.EVCoil.get(amount = 2),
                GregTechItems.ElectricPumpEV.get(),
            ),
            ticks = 2000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchDynamoIV.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Vanadiumtriindinid,
                    count = 1,
                ),
                GregTechItems.CircuitChipHPIC.get(amount = 2),
                GregTechItems.IVCoil.get(amount = 2),
                GregTechItems.ElectricPumpIV.get(),
            ),
            ticks = 2000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchDynamoLuV.get(),
            outputs = arrayOf(
                GregTechItems.HullLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid,
                    count = 2,
                ),
                GregTechItems.CircuitChipUHPIC.get(amount = 2),
                GregTechItems.CircuitMaster.get(amount = 2),
                GregTechItems.LuVCoil.get(amount = 2),
                GregTechItems.ElectricPumpLuV.get(),
            ),
            ticks = 4000,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchDynamoZPM.get(),
            outputs = arrayOf(
                GregTechItems.HullZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Tetranaquadahdiindiumhexaplatiumosminid,
                    count = 2,
                ),
                GregTechItems.CircuitChipNPIC.get(amount = 2),
                GregTechItems.CircuitQuantummainframe.get(amount = 2),
                GregTechItems.ZPMCoil.get(amount = 2),
                GregTechItems.ElectricPumpZPM.get(),
            ),
            ticks = 6000,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchDynamoUV.get(),
            outputs = arrayOf(
                GregTechItems.HullUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.ElectrumFlux,
                    count = 2,
                ),
                GregTechItems.CircuitChipPPIC.get(amount = 2),
                GregTechItems.CircuitCrystalmainframe.get(amount = 2),
                GregTechItems.UVCoil.get(amount = 2),
                GregTechItems.ElectricPumpUV.get(),
            ),
            ticks = 8000,
            eu = 500000,
        )
    }
}
