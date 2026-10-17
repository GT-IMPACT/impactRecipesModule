package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ProjectRedIntegrationItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class EnderIOUtilityCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.Crafter.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "POP",
                "IMI",
                "PCP",
                'P',
                OrePrefixes.itemCasing.get(Materials.Steel),
                'C',
                EnderIOItems.BasicCapacitor.get(),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                EnderIOItems.MachinePart.get(),
                'O',
                GregTechItems.CoverCrafting.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.WirelessCharger.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "POP",
                "IMI",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'C',
                EnderIOItems.BasicCapacitor2.get(),
                'I',
                OrePrefixes.circuit.get(Materials.Advanced),
                'M',
                EnderIOItems.MachinePart.get(),
                'O',
                GregTechItems.FieldGeneratorMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.TravelStaff16.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "dCE",
                "SIC",
                "ISw",
                'I',
                OrePrefixes.stick.get(Materials.DarkSteel),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'S',
                OrePrefixes.screw.get(Materials.VibrantAlloy),
                'E',
                GregTechItems.SensorHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.DarkSteelPressurePlate.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "ShS",
                "PIP",
                "SdS",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.DarkSteel),
                'I',
                OrePrefixes.spring.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.BlockDarkIronBars.get(amount = 3),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " h ",
                "SSS",
                "SSS",
                'S',
                OrePrefixes.stick.get(Materials.DarkSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.FarmStation.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "RPR",
                "IMI",
                "GCG",
                'P',
                OrePrefixes.plateDense.get(Materials.PulsatingIron),
                'G',
                OrePrefixes.gearGt.get(Materials.ElectricalSteel),
                'C',
                EnderIOItems.BasicCapacitor2.get(),
                'I',
                OrePrefixes.circuit.get(Materials.Advanced),
                'M',
                EnderIOItems.MachinePart.get(),
                'R',
                GregTechItems.RobotArmHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.ConduitProbe.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "CMC",
                "ERE",
                'S',
                OrePrefixes.plate.get(Materials.Silicon),
                'E',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'I',
                EnderIOItems.PowerConduit.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                ProjectRedIntegrationItems.ProjectredIntegrationGate26.get(),
                'R',
                EnderIOItems.RedstoneConduit2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.Buffer.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "ISI",
                "SCS",
                "ISI",
                'S',
                OrePrefixes.plate.get(Materials.Steel),
                'I',
                OrePrefixes.plate.get(Materials.Iron),
                'C',
                VanillaItems.Chest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.Magnet16.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "ECC",
                "wST",
                "ECC",
                'E',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'C',
                OrePrefixes.plate.get(Materials.ConductiveIron),
                'S',
                OrePrefixes.screw.get(Materials.SteelMagnetic),
                'T',
                GregTechItems.EmitterLV.get(),
            ),
        )
    }
}
