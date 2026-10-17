package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactPowerAndChemicalMachinePrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.RobotArmEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Titanium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                IC2Items.ReactorPlatingExplosive.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lead,
                    count = 8,
                ),
            ),
            output = ImpactItems.NuclearReactorI.get(),
            fluidInputs = null,
            ticks = 30 * 20,
            eu = 1920,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                GregTechItems.RobotArmIV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 6,
                ),
                IC2Items.ReactorPlatingExplosive.get(amount = 8),
                ImpactItems.NeutronReflectorSmallParts.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lead,
                    count = 10,
                ),
            ),
            output = ImpactItems.NuclearReactorII.get(),
            fluidInputs = null,
            ticks = 50 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                GregTechItems.RobotArmLuV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Titanium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 8,
                ),
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
            output = ImpactItems.NuclearReactorIII.get(),
            fluidInputs = null,
            ticks = 80 * 20,
            eu = 30720,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                GregTechItems.ElectricPumpIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.TiBetaC,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titaniolum,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.Inconel690,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Inconel792,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Desh,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.round,
                    material = Materials.HSSG,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Inconel792,
                    count = 16,
                ),
            ),
            output = ImpactItems.HugeSteamTurbine.get(),
            fluidInputs = null,
            ticks = 60 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Talonite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 8,
                ),
                GregTechItems.ElectricPumpLuV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Talonite,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.Polytetrafluoroethylene,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Inconel792,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Grisium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            output = ImpactItems.MachineChemicalReactor.get(),
            fluidInputs = null,
            ticks = 80 * 20,
            eu = 30720,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.MaragingSteel250,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 8,
                ),
                GregTechItems.ElectricPumpLuV.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.TiBetaC,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.NiobiumTitanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Tungsten,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            output = ImpactItems.MachineDistTower.get(),
            fluidInputs = null,
            ticks = 80 * 20,
            eu = 30720,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Kovar,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 8,
                ),
                GregTechItems.ElectricPistonLuV.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Zamak,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HSSG,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Titaniolum,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Titaniolum,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            output = ImpactItems.MachineElectricImplosion.get(),
            fluidInputs = null,
            ticks = 80 * 20,
            eu = 30720,
        )
    }
}
