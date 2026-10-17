package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactPowerMachineDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.NuclearReactorI.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.RobotArmEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Titanium,
                    count = 2,
                ),
                GregTechItems.CircuitData.get(amount = 4),
                IC2Items.ReactorPlatingExplosive.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lead,
                    count = 8,
                ),
            ),
            ticks = 300 * 20,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.NuclearReactorII.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                GregTechItems.RobotArmIV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Titanium,
                    count = 4,
                ),
                GregTechItems.CircuitElite.get(amount = 6),
                IC2Items.ReactorPlatingExplosive.get(amount = 8),
                ImpactItems.NeutronReflectorSmallParts.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lead,
                    count = 10,
                ),
            ),
            ticks = 500 * 20,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.NuclearReactorIII.get(),
            outputs = arrayOf(
                GregTechItems.HullLuV.get(),
                GregTechItems.RobotArmLuV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Titanium,
                    count = 8,
                ),
                GregTechItems.CircuitMaster.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.TungstenSteel,
                    count = 8,
                ),
                ImpactItems.NeutronReflectorParts.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lead,
                    count = 12,
                ),
            ),
            ticks = 800 * 20,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.LargeSteamTurbine.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                IC2Items.ElectronicCircuit.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Steel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Steel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Steel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Steel,
                    count = 12,
                ),
            ),
            ticks = 200 * 20,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.LargeGasTurbine.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.CircuitData.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.StainlessSteel,
                    count = 12,
                ),
            ),
            ticks = 400 * 20,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.LargeHPSteamTurbine.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.CircuitData.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSLA,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Titanium,
                    count = 12,
                ),
            ),
            ticks = 600 * 20,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.MachineMultiHeatExchanger.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.CasingFireboxTitanium.get(),
                GregTechItems.ElectricPumpEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titanium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Titanium,
                    count = 8,
                ),
            ),
            ticks = 400 * 20,
            eu = 480,
        )
    }
}
