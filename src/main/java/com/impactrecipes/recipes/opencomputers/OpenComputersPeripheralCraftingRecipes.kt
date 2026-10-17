package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.ComputronicsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.OpenGlassesItems
import com.impactrecipes.items.OpenPeripheralItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class OpenComputersPeripheralCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = OpenGlassesItems.GlassesTerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "MGW",
                "SUS",
                'W',
                OpenComputersItems.WirelessNetworkCardTier1.get(),
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'U',
                OpenComputersItems.CentralProcessingUnitCPUTier2.get(),
                'M',
                OpenComputersItems.MemoryTier25.get(),
                'G',
                OpenComputersItems.Geolyzer.get(),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenGlassesItems.ARGlasses.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GSG",
                "RWR",
                "NdN",
                'G',
                OpenComputersItems.GraphicsCardTier2.get(),
                'W',
                OpenComputersItems.WirelessNetworkCardTier1.get(),
                'N',
                OpenComputersItems.ScreenTier2.get(),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'R',
                OrePrefixes.ring.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = OpenPeripheralItems.TerminalGlassesBridge.get(),
            flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
            ingredients = arrayOf<Any?>(
                OpenGlassesItems.GlassesTerminal.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = OpenPeripheralItems.TerminalGlasses.get(),
            flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
            ingredients = arrayOf<Any?>(
                OpenGlassesItems.ARGlasses.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenPeripheralItems.Sensor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " S ",
                " M ",
                "CHw",
                'C',
                OpenComputersItems.CentralProcessingUnitCPUTier2.get(),
                'S',
                GregTechItems.SensorMV.get(),
                'M',
                GregTechItems.ElectricMotorMV.get(),
                'H',
                GregTechItems.CasingMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenPeripheralItems.PIM.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "CHw",
                'C',
                OpenComputersItems.RedstoneCardTier1.get(),
                'R',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = OpenPeripheralItems.ItemSelector.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "CHw",
                'C',
                OpenComputersItems.RedstoneCardTier1.get(),
                'R',
                GregTechItems.CoverItemDetector.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
            ),
        )

        MachineRecipes.chemicalReactor(
            input = Materials.Acetone.getCells(1),
            secondaryInput = Materials.Sugar.getDust(1),
            fluidInput = Materials.SulfuricAcid.getFluid(1000),
            fluidOutput = null,
            output = OpenComputersItems.Grog.get(),
            secondaryOutput = GregTechItems.CellEmpty.get(),
            ticks = 800,
            eu = 480,
        )

        MachineRecipes.chemicalReactor(
            input = Materials.SulfuricAcid.getCells(1),
            secondaryInput = Materials.Sugar.getDust(1),
            fluidInput = Materials.Acetone.getFluid(1000),
            fluidOutput = null,
            output = OpenComputersItems.Grog.get(),
            secondaryOutput = GregTechItems.CellEmpty.get(),
            ticks = 800,
            eu = 480,
        )

        CraftingRecipes.shapedWithFlags(
            output = ComputronicsItems.CipherBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SRS",
                "WHW",
                "CPC",
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'R',
                GregTechItems.RobotArmMV.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'P',
                OrePrefixes.plate.get(Materials.Silicon),
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'W',
                OrePrefixes.cableGt01.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ComputronicsItems.SpeechBox.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "PHP",
                "WRW",
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'R',
                ComputronicsItems.Speaker.get(),
                'H',
                GregTechItems.CasingMV.get(),
                'P',
                OrePrefixes.plate.get(Materials.Silicon),
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'W',
                OrePrefixes.wireGt02.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ComputronicsItems.IronNoteBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "BNB",
                "PPP",
                'N',
                VanillaItems.Noteblock.get(),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'B',
                ImpactItems.SteelBars.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ComputronicsItems.Radar.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CSC",
                "BEB",
                "WHW",
                'C',
                OpenComputersItems.MicrochipTier2.get(),
                'B',
                OrePrefixes.circuit.get(Materials.Advanced),
                'H',
                GregTechItems.CasingHV.get(),
                'S',
                GregTechItems.SensorHV.get(),
                'E',
                GregTechItems.EmitterHV.get(),
                'W',
                OrePrefixes.cableGt02.get(Materials.Gold),
            ),
        )
    }
}
