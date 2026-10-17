package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class IC2EnergyStorageCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = IC2Items.BatBox.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CPC",
                "BMB",
                "PBP",
                'C',
                OrePrefixes.cableGt01.get(Materials.Tin),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'B',
                OrePrefixes.battery.get(Materials.Basic),
                'M',
                GregTechItems.BatteryBuffer2by2LV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.CesuUnit.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CPC",
                "BMB",
                "PBP",
                'C',
                OrePrefixes.cableGt01.get(Materials.Copper),
                'P',
                OrePrefixes.plate.get(Materials.Bronze),
                'B',
                OrePrefixes.battery.get(Materials.Advanced),
                'M',
                GregTechItems.BatteryBuffer2by2MV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.MfeUnit.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CPC",
                "BMB",
                "PBP",
                'C',
                OrePrefixes.cableGt01.get(Materials.Gold),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'B',
                GregTechItems.BatteryREHVLithium.get(),
                'M',
                GregTechItems.BatteryBuffer2by2HV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.MfsUnit.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CPC",
                "BMB",
                "PAP",
                'C',
                OrePrefixes.cableGt01.get(Materials.Aluminium),
                'P',
                OrePrefixes.plate.get(Materials.Titanium),
                'B',
                GregTechItems.LapotronCrystal.get(),
                'M',
                GregTechItems.BatteryBuffer2by2EV.get(),
                'A',
                OrePrefixes.circuit.get(Materials.Data),
            ),
        )
    }
}
