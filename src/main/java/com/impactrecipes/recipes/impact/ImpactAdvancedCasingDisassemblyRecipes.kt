package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactAdvancedCasingDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.DDDPrinterCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.VanadiumSteel,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 4,
                ),
            ),
            ticks = 500,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.NqCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.GumMetal,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuadruple,
                    material = Materials.Naquadah,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Desh,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.TungstenSteel,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.TungstenSteel,
                    count = 6,
                ),
                IC2Items.AdvancedCircuit.get(amount = 2),
            ),
            ticks = 1000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.CycloneCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Inconel792,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel300,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlackSteel,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSS,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.HugeCasingTurbine.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Titaniolum,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TiBetaC,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.LSCC.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Iridium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.NiobiumTitanium,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Palladium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HastelloyC276,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            ticks = 6000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SpaceSatelliteCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSLA,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 4,
                ),
            ),
            ticks = 500,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.TowerCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Ultimet,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 4,
                ),
            ),
            ticks = 500,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ComputerCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Zamak,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel300,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Cobalt,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Copper,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.InsideBlock2.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 4,
                ),
            ),
            ticks = 500,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SpaceElevatorCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.HSLA,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Vanadium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.BlueSteel,
                    count = 4,
                ),
            ),
            ticks = 500,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.NuclearHatchRod.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricMotorEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Lead,
                    count = 4,
                ),
            ),
            ticks = 480,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SpaceElevatorCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Zirconium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.BlueSteel,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 4,
                ),
            ),
            ticks = 500,
            eu = 120,
        )
    }
}
