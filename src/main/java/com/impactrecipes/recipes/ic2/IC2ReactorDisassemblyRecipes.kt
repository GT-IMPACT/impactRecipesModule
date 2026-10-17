package com.impactrecipes.recipes.ic2

import com.impact.common.item.Core_List_Items.NeutronReflectorSmallParts
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2ReactorDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = IC2Items.ReactorChamber.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lead,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 250,
        )

        MachineRecipes.disassembler(
            input = IC2Items.NuclearReactor.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                GregTechItems.RobotArmIV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Titanium,
                    count = 4,
                ),
                GregTechItems.CircuitData.get(amount = 4),
                IC2Items.ReactorChamber.get(amount = 4),
                ImpactItems.NeutronReflectorSmallParts.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lead,
                    count = 12,
                ),
            ),
            ticks = 400 * 20,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = IC2Items.KineticGenerator.get(),
            outputs = arrayOf(
                GregTechItems.HatchDynamoHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Titanium,
                    count = 2,
                ),
                GregTechItems.CircuitData.get(amount = 2),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                GregTechItems.CasingMotor.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 6,
                ),
            ),
            ticks = 100 * 20,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = IC2Items.WindKineticGenerator.get(),
            outputs = arrayOf(
                GregTechItems.CasingGearboxSteel.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Titanium,
                    count = 2,
                ),
                GregTechItems.CircuitData.get(amount = 2),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                IC2Items.Steelshaft.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 6,
                ),
            ),
            ticks = 100 * 20,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = IC2Items.WaterKineticGenerator.get(),
            outputs = arrayOf(
                GregTechItems.CasingGearboxSteel.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Titanium,
                    count = 2,
                ),
                GregTechItems.CircuitData.get(amount = 2),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                IC2Items.Steelshaft.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 6,
                ),
            ),
            ticks = 100 * 20,
            eu = 480,
        )
    }
}
