package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.ComputeryItems
import com.impactrecipes.items.ComputronicsItems
import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.NuclearControlItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.dragon.computery.cart.render.ModRenderType

internal class RailcraftCartCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartWork.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hWw",
                " C ",
                " d ",
                'W',
                VanillaItems.CraftingTable.get(),
                'C',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartTank.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hWw",
                " C ",
                " d ",
                'W',
                AE2FCItems.CertusQuartzTank.get(),
                'C',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartCargo.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hWw",
                "PCP",
                " d ",
                'W',
                VanillaItems.Chest.get(),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartTrackRelayer.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hWw",
                "OTR",
                "MCD",
                'W',
                NuclearControlItems.WhiteLamp.get(),
                'T',
                OrePrefixes.circuit.get(Materials.Basic),
                'D',
                OrePrefixes.toolHeadDrill.get(Materials.Steel),
                'O',
                GregTechItems.ConveyorModuleLV.get(),
                'R',
                GregTechItems.RobotArmLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'C',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartUndercutter.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hWw",
                "PTR",
                "MCO",
                'W',
                NuclearControlItems.WhiteLamp.get(),
                'T',
                OrePrefixes.circuit.get(Materials.Basic),
                'O',
                GregTechItems.ConveyorModuleLV.get(),
                'P',
                GregTechItems.ElectricPistonLV.get(),
                'R',
                GregTechItems.RobotArmLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'C',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartTrackLayer.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hWw",
                "PTP",
                "MCR",
                'W',
                NuclearControlItems.WhiteLamp.get(),
                'T',
                OrePrefixes.circuit.get(Materials.Basic),
                'P',
                GregTechItems.ElectricPistonLV.get(),
                'R',
                GregTechItems.RobotArmLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'C',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartTrackRemover.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hWw",
                "PTP",
                "MCR",
                'W',
                NuclearControlItems.WhiteLamp.get(),
                'T',
                OrePrefixes.circuit.get(Materials.Basic),
                'P',
                RailcraftItems.Crowbar.get(),
                'R',
                GregTechItems.RobotArmLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'C',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartTrackRemover.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hWw",
                "PTP",
                "MCR",
                'W',
                NuclearControlItems.WhiteLamp.get(),
                'T',
                OrePrefixes.circuit.get(Materials.Basic),
                'P',
                RailcraftItems.Crowbar.get(),
                'R',
                GregTechItems.RobotArmLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'C',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartRedstoneFlux.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PdP",
                "OTO",
                "SCS",
                'O',
                EnderIOItems.BasicCapacitorBank.get(),
                'T',
                OrePrefixes.circuit.get(Materials.Basic),
                'P',
                OrePrefixes.plate.get(Materials.Lead),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'C',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartLocoSteamSolid.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " wX",
                "TPT",
                "WZW",
                'T',
                GregTechItems.CasingSolidSteel.get(),
                'Z',
                VanillaItems.ChestMinecart.get(),
                'P',
                VanillaItems.Piston.get(),
                'X',
                GregTechItems.MachineSteelBoiler.get(),
                'W',
                GregTechItems.ComponentMinecartWheelsSteel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartLocoElectric.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LFB",
                "MCM",
                "WTW",
                'L',
                ComputronicsItems.ColorfulLamp.get(),
                'F',
                RailcraftItems.MachineEpsilonElectricFeeder.get(),
                'B',
                GregTechItems.CasingSolidSteel.get(),
                'M',
                GregTechItems.ElectricMotorMV.get(),
                'C',
                GregTechItems.MVCoil.get(),
                'W',
                GregTechItems.ComponentMinecartWheelsSteel.get(),
                'T',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModRenderType.DIESEL.getItemWithRenderer(
                "railcraft:default",
                ComputeryItems.DieselLocomotiveCart.get(),
            ),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LFB",
                "MCM",
                "WTW",
                'L',
                ComputronicsItems.ColorfulLamp.get(),
                'F',
                GregTechItems.GeneratorDieselMV.get(),
                'B',
                GregTechItems.CasingSolidSteel.get(),
                'M',
                GregTechItems.ElectricMotorMV.get(),
                'C',
                GregTechItems.MVCoil.get(),
                'W',
                ComputeryItems.MetaItem.get(),
                'T',
                ComputeryItems.MetaItem1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ComputeryItems.MetaItem.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " h ",
                "RSR",
                " w ",
                'R',
                OrePrefixes.ring.get(Materials.BlueSteel),
                'S',
                OrePrefixes.stick.get(Materials.BlueSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ComputeryItems.MetaItem1.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " h ",
                "PwP",
                "WPW",
                'P',
                OrePrefixes.plate.get(Materials.BlueSteel),
                'W',
                ComputeryItems.MetaItem.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CartBore.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "FPF",
                "BCB",
                "hTw",
                'C',
                VanillaItems.Minecart.get(),
                'T',
                VanillaItems.ChestMinecart.get(),
                'P',
                VanillaItems.Piston.get(),
                'F',
                GregTechItems.HullSteel.get(),
                'B',
                GregTechItems.MachineSteelBoiler.get(),
            ),
        )
    }
}
