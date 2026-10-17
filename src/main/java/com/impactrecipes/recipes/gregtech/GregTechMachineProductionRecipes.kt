package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechMachineProductionRecipes {

    internal fun register() {
        //Steam Turbine
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullHV.get(),
                Materials.Advanced.item(OrePrefixes.circuit).get(amount = 2),
                Materials.Steel.item(OrePrefixes.pipeLarge).get(amount = 2),
                Materials.Steel.item(OrePrefixes.gearGt).get(amount = 4),
                Materials.Steel.item(OrePrefixes.ring).get(amount = 4),
                Materials.Steel.item(OrePrefixes.plateDouble).get(amount = 12),
            ),
            output = GregTechItems.LargeSteamTurbine.get(),
            fluidInputs = null,
            ticks = (20 * 20),
            eu = 120,
        )

        //Gas Turbine
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 2),
                Materials.StainlessSteel.item(OrePrefixes.pipeLarge).get(amount = 2),
                Materials.StainlessSteel.item(OrePrefixes.gearGt).get(amount = 4),
                Materials.StainlessSteel.item(OrePrefixes.ring).get(amount = 4),
                Materials.StainlessSteel.item(OrePrefixes.plateDouble).get(amount = 12),
            ),
            output = GregTechItems.LargeGasTurbine.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 480,
        )

        //HP Turbine
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.gearGt).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.ring).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.pipeLarge).get(amount = 4),
                Materials.HSLA.item(OrePrefixes.stickLong).get(amount = 6),
                Materials.Titanium.item(OrePrefixes.plateDouble).get(amount = 12),
            ),
            output = GregTechItems.LargeHPSteamTurbine.get(),
            fluidInputs = null,
            ticks = (60 * 20),
            eu = 1920,
        )

        //Plasma Turbine
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullUV.get(),
                GregTechItems.CasingCoilSuperconductor.get(amount = 4),
                GregTechItems.ElectricPumpUV.get(amount = 4),
                Materials.NaquadahAlloy.item(OrePrefixes.gearGt).get(amount = 4),
                Materials.Superconductor.item(OrePrefixes.circuit).get(amount = 8),
                Materials.Draconium.item(OrePrefixes.frameGt).get(amount = 8),
                Materials.Naquadah.item(OrePrefixes.pipeHuge).get(amount = 8),
                Materials.NaquadahAlloy.item(OrePrefixes.stickLong).get(amount = 8),
                Materials.Oriharukon.item(OrePrefixes.ring).get(amount = 8),
                Materials.NaquadahAlloy.item(OrePrefixes.round).get(amount = 16),
                Materials.Americium.item(OrePrefixes.plateDouble).get(amount = 16),
                Materials.Pikyonium64B.item(OrePrefixes.plateTriple).get(amount = 16),
            ),
            output = GregTechItems.LargePlasmaTurbine.get(),
            fluidInputs = null,
            ticks = (100 * 20),
            eu = 500000,
        )

        //Heat Exchanger
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                GregTechItems.CasingFireboxTitanium.get(),
                GregTechItems.ElectricPumpEV.get(amount = 2),
                Materials.Titanium.item(OrePrefixes.frameGt).get(amount = 2),
                Materials.Titanium.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.ring).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.plateDouble).get(amount = 8),
            ),
            output = GregTechItems.MachineMultiHeatExchanger.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 480,
        )

        //OilDrill2
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullHV.get(),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                Materials.Advanced.item(OrePrefixes.circuit).get(amount = 2),
                Materials.Titanium.item(OrePrefixes.gearGt).get(amount = 2),
                Materials.Titanium.item(OrePrefixes.frameGt).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.plateDouble).get(amount = 10),
            ),
            output = GregTechItems.OilDrill2.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 480,
        )

        //OilDrill3
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                GregTechItems.ElectricPumpEV.get(amount = 2),
                Materials.TungstenSteel.item(OrePrefixes.gearGt).get(amount = 4),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 8),
                Materials.TungstenSteel.item(OrePrefixes.frameGt).get(amount = 12),
                Materials.TungstenSteel.item(OrePrefixes.plateDouble).get(amount = 16),
            ),
            output = GregTechItems.OilDrill3.get(),
            fluidInputs = null,
            ticks = (60 * 20),
            eu = 1920,
        )

        //Oil Cracker
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullHV.get(),
                Materials.Advanced.item(OrePrefixes.circuit).get(amount = 4),
                GregTechItems.CasingCoilCupronickel.get(amount = 4),
                GregTechItems.ElectricPumpHV.get(amount = 4),
                Materials.StainlessSteel.item(OrePrefixes.plate).get(amount = 8),
            ),
            output = GregTechItems.OilCracker.get(),
            fluidInputs = null,
            ticks = (20 * 20),
            eu = 120,
        )

        //Assembly Line
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.MachineIVAssembler.get(),
                Materials.Elite.item(OrePrefixes.circuit).get(amount = 4),
                GregTechItems.CasingGearboxTungstenSteel.get(amount = 4),
                Materials.Inconel792.item(OrePrefixes.frameGt).get(amount = 4),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                GregTechItems.RobotArmIV.get(amount = 4),
                Materials.Inconel792.item(OrePrefixes.stickLong).get(amount = 8),
                Materials.TungstenSteel.item(OrePrefixes.plate).get(amount = 16),
                Materials.HSSE.item(OrePrefixes.bolt).get(amount = 16),
                Materials.HSSE.item(OrePrefixes.screw).get(amount = 16),
            ),
            output = GregTechItems.MachineMultiAssemblyline.get(),
            fluidInputs = null,
            ticks = (120 * 20),
            eu = 7680,
        )

        //DieselGen1
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 2),
                Materials.Titanium.item(OrePrefixes.gearGt).get(amount = 2),
                GregTechItems.ElectricPistonEV.get(amount = 2),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                Materials.Titanium.item(OrePrefixes.frameGt).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.plate).get(amount = 8),
            ),
            output = GregTechItems.MachineMultiDieselEngine.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 1920,
        )

        //DieselGen2
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullIV.get(),
                Materials.Elite.item(OrePrefixes.circuit).get(amount = 2),
                Materials.TungstenSteel.item(OrePrefixes.gearGt).get(amount = 2),
                GregTechItems.ElectricPistonIV.get(amount = 2),
                GregTechItems.ElectricMotorIV.get(amount = 2),
                Materials.TungstenSteel.item(OrePrefixes.frameGt).get(amount = 4),
                Materials.TungstenSteel.item(OrePrefixes.plate).get(amount = 8),
            ),
            output = GregTechItems.MachineMultiDieselEngine2.get(),
            fluidInputs = null,
            ticks = (80 * 20),
            eu = 7680,
        )

        //LCR
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullHV.get(),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                Materials.Advanced.item(OrePrefixes.circuit).get(amount = 2),
                Materials.StainlessSteel.item(OrePrefixes.rotor).get(amount = 2),
                Materials.Polytetrafluoroethylene.item(OrePrefixes.pipeLarge).get(amount = 2),
                Materials.StainlessSteel.item(OrePrefixes.itemCasing).get(amount = 4),
                Materials.StainlessSteel.item(OrePrefixes.plate).get(amount = 6),
            ),
            output = GregTechItems.MachineMultiLargeChemicalReactor.get(),
            fluidInputs = null,
            ticks = (20 * 20),
            eu = 120,
        )

        //Implosion Compressor
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullHV.get(),
                GregTechItems.ElectricPistonHV.get(amount = 2),
                Materials.Steel.item(OrePrefixes.frameGt).get(amount = 2),
                Materials.Advanced.item(OrePrefixes.circuit).get(amount = 4),
                Materials.Steel.item(OrePrefixes.plateDense).get(amount = 8),
                GregTechItems.CasingExplosionHazard.get(),
            ),
            output = GregTechItems.MachineMultiImplosionCompressor.get(),
            fluidInputs = null,
            ticks = (30 * 20),
            eu = 480,
        )

        //Vacuum Freezer
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullHV.get(),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 4),
                Materials.Aluminium.item(OrePrefixes.plateDense).get(amount = 8),
                GregTechItems.CasingFrostHazard.get(),
            ),
            output = GregTechItems.MachineMultiVacuumFreezer.get(),
            fluidInputs = null,
            ticks = (30 * 20),
            eu = 480,
        )

        //Titanium
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                GregTechItems.CasingFireboxTitanium.get(),
                Materials.Titanium.item(OrePrefixes.pipeLarge).get(amount = 3),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.plateDouble).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.stickLong).get(amount = 12),
            ),
            output = GregTechItems.MachineMultiLargeBoilerTitanium.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 480,
        )

        //TungstenSteel
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullIV.get(),
                GregTechItems.CasingFireboxTungstenSteel.get(),
                Materials.TungstenSteel.item(OrePrefixes.pipeLarge).get(amount = 3),
                Materials.Elite.item(OrePrefixes.circuit).get(amount = 4),
                Materials.TungstenSteel.item(OrePrefixes.plateDouble).get(amount = 4),
                Materials.TungstenSteel.item(OrePrefixes.stickLong).get(amount = 12),
            ),
            output = GregTechItems.MachineMultiLargeBoilerTungstenSteel.get(),
            fluidInputs = null,
            ticks = (60 * 20),
            eu = 1920,
        )

        //Distillation_Tower
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricPumpEV.get(amount = 4),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 4),
                Materials.StainlessSteel.item(OrePrefixes.pipeMedium).get(amount = 8),
                Materials.StainlessSteel.item(OrePrefixes.plateDouble).get(amount = 12),
            ),
            output = GregTechItems.DistillationTower.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 480,
        )

        //Centrifuge
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.MachineEVCentrifuge.get(),
                GregTechItems.ElectricMotorEV.get(amount = 4),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.gearGt).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.plate).get(amount = 8),
            ),
            output = GregTechItems.MachineMultiblockCentrifuge.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 480,
        )

        //Electrolyzer
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.MachineEVElectrolyzer.get(),
                Materials.Aluminium.item(OrePrefixes.wireGt04).get(amount = 4),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 4),
                Materials.Tungsten.item(OrePrefixes.stickLong).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.plate).get(amount = 8),
            ),
            output = GregTechItems.MachineMultiblockElectrolyzer.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 480,
        )

        //Flotation Unit
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricPumpEV.get(amount = 4),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 6),
                Materials.Titanium.item(OrePrefixes.pipeMedium).get(amount = 8),
                Materials.Titanium.item(OrePrefixes.plateDouble).get(amount = 12),
            ),
            output = GregTechItems.MachineFlotationUnit.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 480,
        )
    }
}
