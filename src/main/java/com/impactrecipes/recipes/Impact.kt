package com.impactrecipes.recipes

import com.impact.common.item.DrillHeads
import com.impact.mods.gregtech.GT_ItemList
import com.impactrecipes.util.get
import com.impactrecipes.util.toEuPercent
import gregtech.api.enums.GT_Values.RA
import gregtech.api.enums.ItemList
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler
import gregtech.api.util.GT_Utility
import net.minecraft.item.ItemStack

object Impact {

    fun run() {
        minerDrills()
        prospectors()
    }

    private fun minerDrills() {
        val circuit3 = GT_Utility.getIntegratedCircuit(3)

        val materials = arrayOf(
            Materials.Iron, Materials.Steel, Materials.StainlessSteel, Materials.Titanium,
            Materials.TungstenSteel, Materials.Inconel690, Materials.Iridium, Materials.Neutronium,
        )

        materials.forEachIndexed { index, material ->
            val drill = DrillHeads.create(ItemStack(DrillHeads.getInstance(), 1, index))
            val prefixPlate = (if (material == Materials.Steel || material == Materials.Iron) OrePrefixes.plateDouble else OrePrefixes.plateDense)
            RA.addAssemblerRecipe(
                arrayOf(
                    material.get(prefixPlate, 3),
                    material.get(OrePrefixes.frameGt),
                    circuit3,
                ),
                null, drill, 20 * 10, 25.toEuPercent(index + 1)
            )
        }
    }

    private fun prospectors() {
        GT_ModHandler.addCraftingRecipe(
            GT_ItemList.HandProspectorEV.get(1),
            GT_ModHandler.RecipeBits.DISMANTLEABLE or GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS or GT_ModHandler.RecipeBits.BUFFERED,
            arrayOf<Any?>(
                "EHR", "CSC", "PBP",
                'S', ItemList.Cover_Screen,
                'R', ItemList.Sensor_EV,
                'H', ItemList.Field_Generator_EV,
                'E', ItemList.Emitter_EV,
                'C', OrePrefixes.circuit.get(Materials.Data),
                'P', OrePrefixes.plate.get(Materials.BT6),
                'B', ItemList.BatteryHull_EV_Full.get(1L)
            )
        )

        GT_ModHandler.addCraftingRecipe(
            GT_ItemList.HandProspectorIV.get(1),
            GT_ModHandler.RecipeBits.DISMANTLEABLE or GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS or GT_ModHandler.RecipeBits.BUFFERED,
            arrayOf<Any?>(
                "EHR", "CSC", "PBP",
                'S', ItemList.Cover_Screen,
                'R', ItemList.Sensor_IV,
                'H', ItemList.Field_Generator_IV,
                'E', ItemList.Emitter_IV,
                'C', OrePrefixes.circuit.get(Materials.Elite),
                'P', OrePrefixes.plate.get(Materials.HastelloyC276),
                'B', ItemList.BatteryHull_IV_Full.get(1L)
            )
        )

        GT_ModHandler.addCraftingRecipe(
            GT_ItemList.HandProspectorLuV.get(1),
            GT_ModHandler.RecipeBits.DISMANTLEABLE or GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS or GT_ModHandler.RecipeBits.BUFFERED,
            arrayOf<Any?>(
                "EHR", "CSC", "PBP",
                'S', ItemList.Cover_Screen,
                'R', ItemList.Sensor_LuV,
                'H', ItemList.Field_Generator_LuV,
                'E', ItemList.Emitter_LuV,
                'C', OrePrefixes.circuit.get(Materials.Master),
                'P', OrePrefixes.plate.get(Materials.HastelloyN),
                'B', ItemList.BatteryHull_LuV_Full.get(1L)
            )
        )

        GT_ModHandler.addCraftingRecipe(
            GT_ItemList.HandProspectorZPM.get(1),
            GT_ModHandler.RecipeBits.DISMANTLEABLE or GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS or GT_ModHandler.RecipeBits.BUFFERED,
            arrayOf<Any?>(
                "EHR", "CSC", "PBP",
                'S', ItemList.Cover_Screen,
                'R', ItemList.Sensor_ZPM,
                'H', ItemList.Field_Generator_ZPM,
                'E', ItemList.Emitter_ZPM,
                'C', OrePrefixes.circuit.get(Materials.Ultimate),
                'P', OrePrefixes.plate.get(Materials.Lafium),
                'B', ItemList.BatteryHull_ZPM_Full.get(1L)
            )
        )
    }
}
