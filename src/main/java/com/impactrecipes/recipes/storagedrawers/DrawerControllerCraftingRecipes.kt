package com.impactrecipes.recipes.storagedrawers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ProjectRedIntegrationItems
import com.impactrecipes.items.StorageDrawersItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class DrawerControllerCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.ControllerSlave.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "ODO",
                "PAP",
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'A',
                OrePrefixes.plate.get(Materials.Diamond),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'O',
                ProjectRedIntegrationItems.ProjectredIntegrationGate26.get(),
                'D',
                "drawerBasic",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.CompactingDrawers.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "ODO",
                "PAP",
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'A',
                OrePrefixes.plate.get(Materials.Diamond),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'O',
                GregTechItems.ElectricPistonMV.get(),
                'D',
                "drawerBasic",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.Controller.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "ODR",
                "PAP",
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'A',
                OrePrefixes.plate.get(Materials.Diamond),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'O',
                GregTechItems.ConveyorModuleMV.get(),
                'R',
                GregTechItems.RobotArmMV.get(),
                'D',
                "drawerBasic",
            ),
        )
    }
}
