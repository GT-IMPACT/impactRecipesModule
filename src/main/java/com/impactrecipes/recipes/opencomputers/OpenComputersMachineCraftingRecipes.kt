package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class OpenComputersMachineCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.ComputerCaseTier1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "VHV",
                "SBS",
                'H',
                GregTechItems.HullMV.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Good),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorVent,
                    meta = 1,
                ).get(),
                'C',
                OpenComputersItems.MicrochipTier1.get(),
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.ComputerCaseTier2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "VHV",
                "SBS",
                'H',
                GregTechItems.HullHV.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Advanced),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorVentGold,
                    meta = 1,
                ).get(),
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.CaseTier3.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "VHV",
                "SBS",
                'H',
                GregTechItems.HullEV.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Data),
                'V',
                ModItemVariant(
                    item = IC2Items.AdvancedHeatVent,
                    meta = 1,
                ).get(),
                'C',
                OpenComputersItems.MicrochipTier3.get(),
                'S',
                OrePrefixes.screw.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Item19.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "D",
                "P",
                "B",
                'D',
                OrePrefixes.dust.get(Materials.NeodymiumMagnetic),
                'P',
                OrePrefixes.plate.get(Materials.Silicon),
                'B',
                OrePrefixes.bolt.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Rack.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PWP",
                "VHV",
                "RBD",
                'P',
                OrePrefixes.itemCasing.get(Materials.StainlessSteel),
                'V',
                ModItemVariant(
                    item = IC2Items.AdvancedHeatVent,
                    meta = 1,
                ).get(),
                'H',
                GregTechItems.CasingHV.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Advanced),
                'W',
                OpenComputersItems.WirelessNetworkCardTier2.get(),
                'R',
                OpenComputersItems.Relay.get(),
                'D',
                OpenComputersItems.PowerDistributor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Adapter.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "WHW",
                "PBP",
                'P',
                OrePrefixes.itemCasing.get(Materials.Birmabright),
                'C',
                OpenComputersItems.MicrochipTier1.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Good),
                'W',
                OpenComputersItems.Cable.get(amount = 2),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.ElectronicsAssembler.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PMP",
                "RHR",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'M',
                GregTechItems.CoverScreen.get(),
                'R',
                GregTechItems.RobotArmMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Disassembler.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "UMA",
                "PHR",
                "LCL",
                'L',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'A',
                OpenComputersItems.Analyzer.get(),
                'U',
                OpenComputersItems.ControlUnitCU.get(),
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'H',
                GregTechItems.CasingHV.get(),
                'M',
                GregTechItems.CoverScreen.get(),
                'R',
                GregTechItems.RobotArmHV.get(),
                'P',
                GregTechItems.ElectricPistonHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Capacitor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PBP",
                "WHW",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.Invar),
                'W',
                OpenComputersItems.Cable.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'H',
                GregTechItems.BatteryBuffer1by1MV.get(),
                'B',
                GregTechItems.BatteryREMVLithium.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Charger.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "AHA",
                "PBP",
                'P',
                OrePrefixes.plate.get(Materials.Invar),
                'C',
                OpenComputersItems.MicrochipTier1.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Good),
                'H',
                GregTechItems.HullMV.get(),
                'A',
                OpenComputersItems.Capacitor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.DiskDrive.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "HSL",
                "PMP",
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
                'C',
                OpenComputersItems.MicrochipTier1.get(),
                'S',
                OrePrefixes.stick.get(Materials.IronMagnetic),
                'L',
                OrePrefixes.lens.get(Materials.Glass),
                'H',
                GregTechItems.HullMV.get(),
                'M',
                GregTechItems.ElectricMotorMV.get(),
            ),
        )
    }
}
