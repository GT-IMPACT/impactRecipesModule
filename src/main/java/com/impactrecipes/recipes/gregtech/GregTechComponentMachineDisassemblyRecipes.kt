package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.GT_Mod
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechComponentMachineDisassemblyRecipes {

    internal fun register() {
        if (!GT_Mod.gregtechproxy.mComponentAssembler) {
            return
        }

        MachineRecipes.disassembler(
            input = ImpactItems.MachineLVComponentAssembler.get(),
            outputs = arrayOf(
                ImpactItems.ULVPiston.get(amount = 2),
                ImpactItems.ULVRobotArm.get(amount = 2),
                GregTechItems.HullLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.MachineMVComponentAssembler.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPistonLV.get(amount = 2),
                GregTechItems.RobotArmLV.get(amount = 2),
                GregTechItems.HullMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.MachineHVComponentAssembler.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPistonMV.get(amount = 2),
                GregTechItems.RobotArmMV.get(amount = 2),
                GregTechItems.HullHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Gold,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.MachineEVComponentAssembler.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPistonHV.get(amount = 2),
                GregTechItems.RobotArmHV.get(amount = 2),
                GregTechItems.HullEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.MachineIVComponentAssembler.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPistonEV.get(amount = 2),
                GregTechItems.RobotArmEV.get(amount = 2),
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }
}
