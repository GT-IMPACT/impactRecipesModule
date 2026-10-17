package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechCasingRecipes {

    internal fun register() {
        // --- Air Filter
        MachineRecipes.assembler(
            input = Materials.StainlessSteel.item(OrePrefixes.wireFine).get(amount = 16),
            secondaryInput = Materials.Titanium.item(OrePrefixes.stick).get(amount = 4),
            output = GregTechItems.AdsorptionFilterCasing.get(),
            ticks = 200,
            eu = 480,
        )

        // --- Assembling Line Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Steel.item(OrePrefixes.plate).get(amount = 4),
                GregTechItems.RobotArmIV.get(amount = 2),
                Materials.TungstenSteel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingGearboxTungstenSteel.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Processor Machine Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.StainlessSteel.item(OrePrefixes.itemCasing).get(amount = 4),
                Materials.Elite.item(OrePrefixes.circuit).get(amount = 4),
                GregTechItems.CasingSolidSteel.get(),
                IntegratedCircuit(1).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingProcessor.get(),
            ticks = 50,
            eu = 12,
        )

        // --- Assembler Machine Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Data.item(OrePrefixes.circuit).get(amount = 6),
                Materials.Elite.item(OrePrefixes.circuit).get(),
                GregTechItems.ElectricMotorIV.get(),
                Materials.TungstenSteel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingAssembler.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Pump Machine Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.StainlessSteel.item(OrePrefixes.itemCasing).get(amount = 4),
                Materials.Advanced.item(OrePrefixes.circuit).get(amount = 2),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                GregTechItems.CasingSolidSteel.get(),
                IntegratedCircuit(2).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingPump.get(),
            ticks = 50,
            eu = 12,
        )

        // --- Bronze Pipe Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Bronze.item(OrePrefixes.plate).get(amount = 4),
                Materials.Bronze.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.Bronze.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingPipeBronze.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Steel Pipe Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Steel.item(OrePrefixes.plate).get(amount = 4),
                Materials.Steel.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.Steel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingPipeSteel.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Titanium Pipe Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Titanium.item(OrePrefixes.plate).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingPipeTitanium.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- TungstenSteel Pipe Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.TungstenSteel.item(OrePrefixes.plate).get(amount = 4),
                Materials.TungstenSteel.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.TungstenSteel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingPipeTungstenSteel.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- PTFE Pipe Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Polytetrafluoroethylene.item(OrePrefixes.plate).get(amount = 4),
                Materials.Polytetrafluoroethylene.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.Polytetrafluoroethylene.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingPipePolytetrafluoroethylene.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Motor Machine Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.StainlessSteel.item(OrePrefixes.itemCasing).get(amount = 4),
                Materials.Advanced.item(OrePrefixes.circuit).get(amount = 2),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                GregTechItems.CasingSolidSteel.get(),
                IntegratedCircuit(1).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingMotor.get(),
            ticks = 50,
            eu = 12,
        )

        // --- Grate Machine Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                VanillaItems.IronBars.get(amount = 6),
                Materials.Steel.item(OrePrefixes.rotor).get(),
                GregTechItems.ElectricMotorMV.get(),
                Materials.Steel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(4).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingGrate.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                ImpactItems.SteelBars.get(amount = 6),
                Materials.BlackSteel.item(OrePrefixes.rotor).get(),
                GregTechItems.ElectricMotorHV.get(),
                Materials.VanadiumSteel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(4).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingGrate.get(amount = 6),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                ImpactItems.SteelBars.get(amount = 6),
                Materials.HSLA.item(OrePrefixes.rotor).get(),
                GregTechItems.ElectricMotorEV.get(),
                Materials.Titanium.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(4).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingGrate.get(amount = 24),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                EnderIOItems.BlockDarkIronBars.get(amount = 6),
                Materials.HastelloyC276.item(OrePrefixes.rotor).get(),
                GregTechItems.ElectricMotorIV.get(),
                Materials.MaragingSteel250.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(4).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingGrate.get(amount = 64),
            ticks = 50,
            eu = 12,
        )

        // --- Filter Machine Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                VanillaItems.IronBars.get(amount = 3),
                GregTechItems.ComponentFilter.get(amount = 3),
                Materials.Steel.item(OrePrefixes.rotor).get(),
                GregTechItems.ElectricMotorMV.get(),
                Materials.Steel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(5).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingVent.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                ImpactItems.SteelBars.get(amount = 3),
                GregTechItems.ComponentFilter.get(amount = 2),
                Materials.BlackSteel.item(OrePrefixes.rotor).get(),
                Materials.StainlessSteel.item(OrePrefixes.stick).get(),
                GregTechItems.ElectricMotorHV.get(),
                Materials.VanadiumSteel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(5).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingVent.get(amount = 6),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                ImpactItems.SteelBars.get(amount = 2),
                GregTechItems.ComponentFilter.get(),
                Materials.HSLA.item(OrePrefixes.rotor).get(),
                Materials.Titanium.item(OrePrefixes.stickLong).get(),
                Materials.Titanium.item(OrePrefixes.ring).get(),
                Materials.Titanium.item(OrePrefixes.gearGtSmall).get(),
                GregTechItems.ElectricMotorEV.get(),
                Materials.Titanium.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(5).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingVent.get(amount = 24),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                EnderIOItems.BlockDarkIronBars.get(amount = 2),
                GregTechItems.ComponentFilter.get(),
                Materials.HastelloyC276.item(OrePrefixes.rotor).get(),
                Materials.TungstenSteel.item(OrePrefixes.stickLong).get(),
                Materials.TungstenSteel.item(OrePrefixes.ring).get(),
                Materials.TungstenSteel.item(OrePrefixes.gearGtSmall).get(),
                GregTechItems.ElectricMotorIV.get(),
                Materials.MaragingSteel250.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(5).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingVent.get(amount = 64),
            ticks = 50,
            eu = 12,
        )

        // --- Bronze Firebox Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Bronze.item(OrePrefixes.plate).get(amount = 4),
                Materials.Bronze.item(OrePrefixes.stick).get(amount = 4),
                Materials.Bronze.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(10).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingFireboxBronze.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Steel Firebox Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Steel.item(OrePrefixes.plate).get(amount = 4),
                Materials.Steel.item(OrePrefixes.stick).get(amount = 4),
                Materials.Steel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(10).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingFireboxSteel.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Titanium Firebox Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Titanium.item(OrePrefixes.plate).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.stick).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(10).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingFireboxTitanium.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- TungstenSteel Firebox Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.TungstenSteel.item(OrePrefixes.plate).get(amount = 4),
                Materials.TungstenSteel.item(OrePrefixes.stick).get(amount = 4),
                Materials.TungstenSteel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(10).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingFireboxTungstenSteel.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Engine Intake Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Titanium.item(OrePrefixes.rotor).get(amount = 4),
                Materials.Titanium.item(OrePrefixes.pipeMedium).get(amount = 2),
                GregTechItems.CasingStableTitanium.get(),
                IntegratedCircuit(1).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingEngineIntake.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Bronze Gear Box Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Bronze.item(OrePrefixes.plate).get(amount = 4),
                Materials.Bronze.item(OrePrefixes.gearGt).get(amount = 2),
                Materials.Bronze.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(2).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingGearboxBronze.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Steel Gear Box Casing
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Steel.item(OrePrefixes.plate).get(amount = 4),
                Materials.Steel.item(OrePrefixes.gearGt).get(amount = 2),
                Materials.Steel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(2).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingGearboxSteel.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Air Filter
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Steel.item(OrePrefixes.plate).get(amount = 4),
                ImpactItems.SteelBars.get(),
                Materials.Steel.item(OrePrefixes.frameGt).get(),
                IntegratedCircuit(10).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CasingAirFilterVent.get(amount = 2),
            ticks = 50,
            eu = 12,
        )

        // --- Covers
        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.plate).get(amount = 2),
                VanillaItems.IronBars.get(amount = 2),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CoverDrain.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Iron.item(OrePrefixes.plate).get(amount = 2),
                VanillaItems.IronBars.get(amount = 2),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CoverDrain.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.WroughtIron.item(OrePrefixes.plate).get(amount = 2),
                VanillaItems.IronBars.get(amount = 2),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CoverDrain.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.plate).get(),
                VanillaItems.CraftingTable.get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CoverCrafting.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Iron.item(OrePrefixes.plate).get(),
                VanillaItems.CraftingTable.get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CoverCrafting.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.WroughtIron.item(OrePrefixes.plate).get(),
                VanillaItems.CraftingTable.get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.CoverCrafting.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.plate).get(),
                Materials.Plastic.item(OrePrefixes.dust).get(amount = 2),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.UpgradeMuffler.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.plate).get(),
                Materials.Wood.item(OrePrefixes.dust).get(amount = 2),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.UpgradeMuffler.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Iron.item(OrePrefixes.plate).get(),
                Materials.Plastic.item(OrePrefixes.dust).get(amount = 2),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.UpgradeMuffler.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Iron.item(OrePrefixes.plate).get(),
                Materials.Wood.item(OrePrefixes.dust).get(amount = 2),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.UpgradeMuffler.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.WroughtIron.item(OrePrefixes.plate).get(),
                Materials.Plastic.item(OrePrefixes.dust).get(amount = 2),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.UpgradeMuffler.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.WroughtIron.item(OrePrefixes.plate).get(),
                Materials.Wood.item(OrePrefixes.dust).get(amount = 2),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.UpgradeMuffler.get(),
            ticks = 800,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.plate).get(),
                Materials.Iridium.item(OrePrefixes.plate).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.UpgradeLock.get(),
            ticks = 6400,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Iron.item(OrePrefixes.plate).get(),
                Materials.Iridium.item(OrePrefixes.plate).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.UpgradeLock.get(),
            ticks = 6400,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf<ItemStack?>(
                Materials.WroughtIron.item(OrePrefixes.plate).get(),
                Materials.Iridium.item(OrePrefixes.plate).get(),
                IntegratedCircuit(3).get(amount = 0),
            ),
            fluid = null,
            output = GregTechItems.UpgradeLock.get(),
            ticks = 6400,
            eu = 12,
        )
    }
}
