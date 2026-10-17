package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechMachineAssemblyRecipes {

    internal fun register() {
        //Empty Shape Plate
        MachineRecipes.assembler(
            input = Materials.Steel.item(OrePrefixes.plate).get(amount = 4),
            secondaryInput = IntegratedCircuit(4).get(amount = 0),
            fluidInput = GT_Values.NF,
            output = GregTechItems.ShapeEmpty.get(),
            ticks = (2 * 20),
            eu = 8,
        )

        //OilDrill1
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullMV.get(),
                GregTechItems.ElectricMotorMV.get(amount = 2),
                GregTechItems.ElectricPumpMV.get(amount = 2),
                Materials.Good.item(OrePrefixes.circuit).get(amount = 2),
                Materials.Steel.item(OrePrefixes.gearGt).get(amount = 2),
                Materials.Steel.item(OrePrefixes.frameGt).get(amount = 4),
                Materials.Steel.item(OrePrefixes.plateDouble).get(amount = 8),
            ),
            fluid = GT_Values.NF,
            output = GregTechItems.OilDrill1.get(),
            ticks = (20 * 20),
            eu = 120,
        )

        //Maintenance Hatch
        MachineRecipes.assembler(
            input = GregTechItems.CasingLV.get(),
            secondaryInput = GregTechItems.DuctTape.get(amount = 4),
            fluidInput = GT_Values.NF,
            output = GregTechItems.HatchMaintenance.get(),
            ticks = (40 * 20),
            eu = 30,
        )

        //Quadruple Input Hatch
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                GregTechItems.LargeFluidCellTitanium.get(),
                Materials.Titanium.item(OrePrefixes.pipeQuadruple).get(),
                IntegratedCircuit(4).get(amount = 0),
            ),
            fluid = Materials.Polytetrafluoroethylene.getMolten(576L),
            output = ImpactItems.QuadrupleInputHatch.get(),
            ticks = 480,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                GregTechItems.LargeFluidCellTitanium.get(),
                Materials.Titanium.item(OrePrefixes.pipeQuadruple).get(),
                IntegratedCircuit(4).get(amount = 0),
            ),
            fluid = Materials.Polybenzimidazole.getMolten(72L),
            output = ImpactItems.QuadrupleInputHatch.get(),
            ticks = 480,
            eu = 1920,
        )

        //Nonuple Input Hatch
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullIV.get(),
                GregTechItems.LargeFluidCellTungstenSteel.get(),
                Materials.TungstenSteel.item(OrePrefixes.pipeNonuple).get(),
                IntegratedCircuit(9).get(amount = 0),
            ),
            fluid = Materials.Polytetrafluoroethylene.getMolten(1152L),
            output = ImpactItems.NonupleInputHatch.get(),
            ticks = 480,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullIV.get(),
                GregTechItems.LargeFluidCellTungstenSteel.get(),
                Materials.TungstenSteel.item(OrePrefixes.pipeNonuple).get(),
                IntegratedCircuit(9).get(amount = 0),
            ),
            fluid = Materials.Polybenzimidazole.getMolten(144L),
            output = ImpactItems.NonupleInputHatch.get(),
            ticks = 480,
            eu = 7680,
        )

        //ME Output Bus
        MachineRecipes.assembler(
            input = AE2Items.InterfaceBlock.get(),
            secondaryInput = GregTechItems.HatchOutputBusHV.get(),
            output = GregTechItems.HatchOutputBusME.get(),
            ticks = 200,
            eu = 480,
        )

        //ME Output Hatch
        MachineRecipes.assembler(
            input = AE2FCItems.DualInterface.get(),
            secondaryInput = GregTechItems.HatchOutputHV.get(),
            output = GregTechItems.HatchOutputME.get(),
            ticks = 200,
            eu = 480,
        )

        //Radiation Proof Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Lead.item(OrePrefixes.plateDense).get(amount = 6),
                Materials.TungstenCarbide.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(1).get(amount = 0),
            ),
            fluid = Materials.Concrete.getMolten(576L),
            output = GregTechItems.CasingRadiationProof.get(amount = 2),
            ticks = 600,
            eu = 120,
        )
    }
}
