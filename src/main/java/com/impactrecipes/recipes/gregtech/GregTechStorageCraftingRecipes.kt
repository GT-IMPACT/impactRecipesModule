package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechStorageCraftingRecipes {

    internal fun register() {
        //=== Super / Quant tanks ===//
        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperTankULV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                ImpactItems.ULVPump.get(),
                'M',
                GregTechItems.CasingTank0.get(),
                'G',
                OrePrefixes.pipeMedium.get(Materials.Bronze),
                'D',
                OrePrefixes.circuit.get(Materials.Primitive),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperTankLV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpLV.get(),
                'M',
                GregTechItems.CasingTank1.get(),
                'G',
                OrePrefixes.pipeLarge.get(Materials.Bronze),
                'D',
                OrePrefixes.circuit.get(Materials.Basic),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperTankMV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpMV.get(),
                'M',
                GregTechItems.CasingTank2.get(),
                'G',
                OrePrefixes.pipeLarge.get(Materials.Steel),
                'D',
                OrePrefixes.circuit.get(Materials.Good),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperTankHV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpHV.get(),
                'M',
                GregTechItems.CasingTank3.get(),
                'G',
                GregTechItems.FieldGeneratorLV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Advanced),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperTankEV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpEV.get(),
                'M',
                GregTechItems.CasingTank4.get(),
                'G',
                GregTechItems.FieldGeneratorMV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Data),
                'P',
                OrePrefixes.plate.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperTankIV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpIV.get(),
                'M',
                GregTechItems.CasingTank5.get(),
                'G',
                GregTechItems.FieldGeneratorHV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Elite),
                'P',
                OrePrefixes.plate.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumTankLV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpIV.get(),
                'M',
                GregTechItems.CasingTank6.get(),
                'G',
                GregTechItems.FieldGeneratorEV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Master),
                'P',
                OrePrefixes.plate.get(Materials.TungstenSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumTankMV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpIV.get(),
                'M',
                GregTechItems.CasingTank7.get(),
                'G',
                GregTechItems.FieldGeneratorIV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Ultimate),
                'P',
                OrePrefixes.plate.get(Materials.HSSG),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumTankHV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpLuV.get(),
                'M',
                GregTechItems.CasingTank8.get(),
                'G',
                GregTechItems.FieldGeneratorLuV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Superconductor),
                'P',
                OrePrefixes.plate.get(Materials.HSSS),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumTankEV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpZPM.get(),
                'M',
                GregTechItems.CasingTank9.get(),
                'G',
                GregTechItems.FieldGeneratorZPM.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Infinite),
                'P',
                OrePrefixes.plate.get(Materials.Europium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumTankIV.get(),
            flags = GregTechRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "DGD",
                "PMP",
                "DUD",
                'U',
                GregTechItems.ElectricPumpUV.get(),
                'M',
                GregTechItems.CasingTank10.get(),
                'G',
                GregTechItems.FieldGeneratorUV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Bio),
                'P',
                OrePrefixes.plate.get(Materials.Americium),
            ),
        )

        //=== Super / Quant tanks casing ===//
        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank0.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.WroughtIron),
                'I',
                OrePrefixes.pipeLarge.get(Materials.Bronze),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank1.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'I',
                OrePrefixes.pipeLarge.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank2.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
                'I',
                OrePrefixes.pipeLarge.get(Materials.Plastic),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank3.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'I',
                OrePrefixes.pipeLarge.get(Materials.Polytetrafluoroethylene),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank4.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Titanium),
                'I',
                OrePrefixes.pipeLarge.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank5.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.TungstenSteel),
                'I',
                OrePrefixes.pipeLarge.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank6.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Chrome),
                'I',
                OrePrefixes.pipeLarge.get(Materials.TungstenSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank7.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Iridium),
                'I',
                OrePrefixes.pipeLarge.get(Materials.NiobiumTitanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank8.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Osmium),
                'I',
                OrePrefixes.pipeLarge.get(Materials.Enderium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank9.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Tritanium),
                'I',
                OrePrefixes.pipeLarge.get(Materials.Naquadah),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingTank10.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PPP",
                "PIP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Neutronium),
                'I',
                OrePrefixes.pipeLarge.get(Materials.NetherStar),
            ),
        )

        //=== Super / Quant chests ===//
        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperChestLV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullLV.get(),
                'M',
                GregTechItems.ConveyorModuleMV.get(),
                'G',
                OrePrefixes.pipeLarge.get(Materials.Brass),
                'D',
                OrePrefixes.circuit.get(Materials.Basic),
                'P',
                OrePrefixes.plateDense.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperChestMV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullMV.get(),
                'M',
                GregTechItems.ConveyorModuleHV.get(),
                'G',
                OrePrefixes.pipeLarge.get(Materials.Aluminium),
                'D',
                OrePrefixes.circuit.get(Materials.Good),
                'P',
                OrePrefixes.plateDense.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperChestHV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullHV.get(),
                'M',
                GregTechItems.ConveyorModuleHV.get(),
                'G',
                GregTechItems.FieldGeneratorLV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Advanced),
                'P',
                OrePrefixes.plateQuintuple.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperChestEV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullEV.get(),
                'M',
                GregTechItems.ConveyorModuleEV.get(),
                'G',
                GregTechItems.FieldGeneratorMV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Data),
                'P',
                OrePrefixes.plateQuintuple.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.SuperChestIV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullIV.get(),
                'M',
                GregTechItems.ConveyorModuleEV.get(),
                'G',
                GregTechItems.FieldGeneratorHV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Elite),
                'P',
                OrePrefixes.plateQuadruple.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumChestLV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullLuV.get(),
                'M',
                GregTechItems.ConveyorModuleIV.get(),
                'G',
                GregTechItems.FieldGeneratorEV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Master),
                'P',
                OrePrefixes.plateQuadruple.get(Materials.TungstenSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumChestMV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullZPM.get(),
                'M',
                GregTechItems.ConveyorModuleIV.get(),
                'G',
                GregTechItems.FieldGeneratorIV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Ultimate),
                'P',
                OrePrefixes.plateTriple.get(Materials.HSSG),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumChestHV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullUV.get(),
                'M',
                GregTechItems.ConveyorModuleLuV.get(),
                'G',
                GregTechItems.FieldGeneratorLuV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Superconductor),
                'P',
                OrePrefixes.plateTriple.get(Materials.HSSS),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumChestEV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullMAX.get(),
                'M',
                GregTechItems.ConveyorModuleZPM.get(),
                'G',
                GregTechItems.FieldGeneratorZPM.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Infinite),
                'P',
                OrePrefixes.plateDouble.get(Materials.Europium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.QuantumChestIV.get(),
            flags = GregTechRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "DMD",
                "PCP",
                "DGD",
                'C',
                GregTechItems.HullUEV.get(),
                'M',
                GregTechItems.ConveyorModuleUV.get(),
                'G',
                GregTechItems.FieldGeneratorUV.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Bio),
                'P',
                OrePrefixes.plate.get(Materials.Americium),
            ),
        )
    }
}
