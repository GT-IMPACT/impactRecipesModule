package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class IC2ElectricToolCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.ElectricWrench,
                meta = 26,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dRD",
                "RPB",
                "ECS",
                'R',
                OrePrefixes.stick.get(Materials.Steel),
                'D',
                OrePrefixes.toolHeadWrench.get(Materials.Steel),
                'P',
                GregTechItems.ElectricMotorLV.get(),
                'B',
                OrePrefixes.battery.get(Materials.Basic),
                'E',
                IC2Items.SmallPowerUnit.get(),
                'C',
                OrePrefixes.cableGt01.get(Materials.Tin),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.ElectricTreetap,
                meta = 26,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dRD",
                "RPB",
                "ECS",
                'R',
                OrePrefixes.stickLong.get(Materials.Steel),
                'D',
                OrePrefixes.toolHeadDrill.get(Materials.Steel),
                'P',
                GregTechItems.ElectricPumpLV.get(),
                'B',
                OrePrefixes.battery.get(Materials.Basic),
                'E',
                IC2Items.SmallPowerUnit.get(),
                'C',
                OrePrefixes.cableGt01.get(Materials.Tin),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.ElectricHoe,
                meta = 26,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dPH",
                "PGB",
                "ECS",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'H',
                OrePrefixes.toolHeadHoe.get(Materials.Steel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Steel),
                'B',
                OrePrefixes.battery.get(Materials.Basic),
                'E',
                IC2Items.SmallPowerUnit.get(),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.cableGt01.get(Materials.Tin),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.SmallPowerUnit.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WPW",
                "PdP",
                "CMC",
                'W',
                OrePrefixes.cableGt01.get(Materials.Copper),
                'P',
                OrePrefixes.itemCasing.get(Materials.Steel),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
            ),
        )
    }
}
