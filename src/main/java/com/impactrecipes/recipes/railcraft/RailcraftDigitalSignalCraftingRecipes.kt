package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ComputronicsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftDigitalSignalCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ComputronicsItems.DigitalSignalControllerBox.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PSP",
                "PBP",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'S',
                GregTechItems.SensorLV.get(),
                'B',
                RailcraftItems.SignalBoxController.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ComputronicsItems.DigitalSignalReceiverBox.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PSP",
                "PBP",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'S',
                GregTechItems.SensorLV.get(),
                'B',
                RailcraftItems.SignalBoxReceiver.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ComputronicsItems.DigitalLocomotiveRelay.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SCE",
                "AHM",
                "hCw",
                'M',
                RailcraftItems.ElectricMeter.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'A',
                OrePrefixes.cableGt01.get(Materials.Tin),
                'S',
                GregTechItems.SensorLV.get(),
                'E',
                GregTechItems.EmitterLV.get(),
                'H',
                GregTechItems.HullLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.RailAssemblerCasing.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PhP",
                "GBG",
                "PwP",
                'P',
                OrePrefixes.plate.get(Materials.WroughtIron),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.WroughtIron),
                'B',
                OrePrefixes.frameGt.get(Materials.WroughtIron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.RailAssembler.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "RwR",
                "CAC",
                "GOG",
                'R',
                GregTechItems.RobotArmLV.get(),
                'O',
                GregTechItems.ConveyorModuleLV.get(),
                'A',
                ImpactItems.RailAssemblerCasing.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'G',
                OrePrefixes.gearGt.get(Materials.WroughtIron),
            ),
        )
    }
}
