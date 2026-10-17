package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenBlocksItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class EnderIOMachineCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.BlockInventoryPanel.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PGP",
                "COR",
                "PIP",
                'O',
                GregTechItems.CoverCrafting.get(),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'G',
                VanillaItems.GlassPane.get(),
                'C',
                GregTechItems.ConveyorModuleLV.get(),
                'R',
                GregTechItems.RobotArmLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.FunctionUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SES",
                "PDP",
                "hGd",
                'P',
                OrePrefixes.plate.get(Materials.Silicon),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'G',
                OrePrefixes.gearGt.get(Materials.Steel),
                'E',
                OrePrefixes.gearGtSmall.get(Materials.Steel),
                'D',
                OrePrefixes.gem.get(Materials.Diamond),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.YetaWench.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IhI",
                "IGI",
                " I ",
                'I',
                OrePrefixes.ingot.get(Materials.Steel),
                'G',
                OrePrefixes.gearGt.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.TravelPlatform.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PGP",
                "COC",
                "PFP",
                'O',
                EnderIOItems.MachinePart.get(),
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'G',
                OpenBlocksItems.Elevator.get(),
                'F',
                GregTechItems.FieldGeneratorLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.VacuumChest.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PGP",
                "COC",
                "PFP",
                'O',
                EnderIOItems.MachinePart.get(),
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'G',
                ChestUpItems.TitaniumChest.get(),
                'F',
                GregTechItems.FieldGeneratorHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.Painter.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PRP",
                "CMC",
                "LRL",
                'R',
                OrePrefixes.rotor.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'L',
                GregTechItems.ElectricMotorLV.get(),
                'M',
                EnderIOItems.MachinePart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.MachinePart.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PBP",
                "BCB",
                "PBP",
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'C',
                EnderIOItems.BasicCapacitor.get(),
                'B',
                VanillaItems.IronBars.get(),
            ),
        )
    }
}
