package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class OpenComputersDeviceCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Geolyzer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "SHS",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'C',
                OpenComputersItems.MicrochipTier1.get(),
                'A',
                OpenComputersItems.Analyzer.get(),
                'H',
                GregTechItems.HullMV.get(),
                'S',
                GregTechItems.SensorMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.HologramProjectorTier1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CLC",
                "PEP",
                "BHB",
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
                'C',
                OpenComputersItems.MicrochipTier1.get(),
                'H',
                GregTechItems.HullMV.get(),
                'E',
                GregTechItems.EmitterMV.get(),
                'L',
                OrePrefixes.lens.get(Materials.Glass),
                'B',
                OrePrefixes.circuit.get(Materials.Good),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.HologramProjectorTier2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RGB",
                "CEC",
                "OHO",
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'H',
                GregTechItems.CasingHV.get(),
                'E',
                GregTechItems.EmitterHV.get(),
                'R',
                "craftingLensRed",
                'G',
                "craftingLensGreen",
                'B',
                "craftingLensBlue",
                'O',
                OrePrefixes.circuit.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.MotionSensor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PMP",
                "SHE",
                "BUB",
                'U',
                OpenComputersItems.CentralProcessingUnitCPUTier2.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'E',
                GregTechItems.EmitterMV.get(),
                'S',
                GregTechItems.SensorMV.get(),
                'M',
                GregTechItems.CoverScreen.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Good),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.NetSplitter.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WPW",
                " H ",
                "CWw",
                'W',
                OpenComputersItems.Cable.get(),
                'H',
                GregTechItems.CasingLV.get(),
                'P',
                GregTechItems.ElectricPistonLV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Item3DPrinter.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " Ow",
                "RHE",
                "BCB",
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'H',
                GregTechItems.CasingHV.get(),
                'R',
                GregTechItems.RobotArmHV.get(),
                'O',
                GregTechItems.ConveyorModuleHV.get(),
                'E',
                GregTechItems.EmitterHV.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.PowerConverter.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PWP",
                "CTC",
                "PWP",
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'T',
                GregTechItems.TransformerHVMV.get(),
                'W',
                OpenComputersItems.Cable.get(),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.PowerDistributor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "WHB",
                "CPw",
                'C',
                OpenComputersItems.MicrochipTier1.get(),
                'W',
                OpenComputersItems.Cable.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'B',
                GregTechItems.MVCoil.get(),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Raid.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PUP",
                "MDM",
                "WCw",
                'M',
                OpenComputersItems.MemoryTier1.get(),
                'U',
                OpenComputersItems.CentralProcessingUnitCPUTier3.get(),
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'W',
                OpenComputersItems.Cable.get(),
                'D',
                OpenComputersItems.DiskDrive.get(),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.RedstoneIO.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PDP",
                "RHR",
                "PCP",
                'D',
                OpenComputersItems.RedstoneCardTier1.get(),
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'H',
                GregTechItems.CasingHV.get(),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Relay.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PNP",
                "WHW",
                "PCP",
                'N',
                OpenComputersItems.NetworkCard.get(),
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'W',
                OpenComputersItems.Cable.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Transposer.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "IHT",
                "PUP",
                'I',
                OpenComputersItems.InventoryControllerUpgrade.get(),
                'T',
                OpenComputersItems.TankControllerUpgrade.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'C',
                GregTechItems.ConveyorModuleMV.get(),
                'U',
                GregTechItems.ElectricPumpMV.get(),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenComputersItems.Waypoint.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IEI",
                "CHC",
                "BwB",
                'I',
                OpenComputersItems.Interweb.get(),
                'C',
                OpenComputersItems.MicrochipTier1.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'E',
                GregTechItems.EmitterMV.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Good),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.ToolNoteBook.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BMB",
                "ACE",
                "POP",
                'M',
                GregTechItems.CoverScreen.get(),
                'A',
                GregTechItems.BatteryREMVLithium.get(),
                'C',
                OpenComputersItems.CentralProcessingUnitCPUTier1.get(),
                'E',
                OpenComputersItems.MemoryTier1.get(),
                'O',
                OpenComputersItems.Keyboard.get(),
                'B',
                OrePrefixes.bolt.get(Materials.Aluminium),
                'P',
                OrePrefixes.itemCasing.get(Materials.Aluminium),
            ),
        )
    }
}
