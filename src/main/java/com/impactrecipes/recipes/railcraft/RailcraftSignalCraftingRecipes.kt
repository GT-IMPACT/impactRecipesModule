package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ProjectRedIntegrationItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftSignalCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalSwitchLever.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SRT",
                "LPS",
                "AAA",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'R',
                OrePrefixes.stick.get(Materials.RedAlloy),
                'T',
                OrePrefixes.stick.get(Materials.Tin),
                'L',
                VanillaItems.Lever.get(),
                'P',
                VanillaItems.StickyPiston.get(),
                'A',
                OrePrefixes.plate.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalSwitchMotor.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SRT",
                "LPC",
                "AAA",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'R',
                OrePrefixes.stick.get(Materials.RedAlloy),
                'T',
                OrePrefixes.stick.get(Materials.Tin),
                'L',
                GregTechItems.ElectricMotorLV.get(),
                'P',
                GregTechItems.ElectricPistonLV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'A',
                OrePrefixes.plate.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalBlockSignal.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCP",
                "dSW",
                'S',
                OrePrefixes.stick.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'L',
                RailcraftItems.SignalLamp.get(),
                'W',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalDistantSignal.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCP",
                "WSd",
                'S',
                OrePrefixes.stick.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'L',
                RailcraftItems.SignalLamp.get(),
                'W',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalDualHeadBlockSignal.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCW",
                "PPP",
                "LCd",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'L',
                RailcraftItems.SignalLamp.get(),
                'W',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalDualHeadDistantSignal.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCd",
                "PPP",
                "LCW",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'L',
                RailcraftItems.SignalLamp.get(),
                'W',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalBoxBlockRelay.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "  d",
                "PCP",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalBoxController.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " d ",
                "PCP",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalBoxReceiver.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "d  ",
                "PCP",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalBoxAnalogController.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "  d",
                "PCP",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'R',
                ProjectRedIntegrationItems.ProjectredIntegrationGate26.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalBoxCapacitor.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " d ",
                "PCP",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'R',
                ProjectRedIntegrationItems.Repeater.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalBoxSequencer.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "d  ",
                "PCP",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'R',
                ProjectRedIntegrationItems.ProjectredIntegrationGate26.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalBoxInterlock.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PRP",
                "PCP",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
            ),
        )
    }
}
