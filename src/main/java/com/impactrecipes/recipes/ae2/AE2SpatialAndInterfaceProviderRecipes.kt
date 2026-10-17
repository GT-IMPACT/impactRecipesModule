package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2SpatialAndInterfaceProviderRecipes {

    internal fun register() {
        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.EnergyCell.get(),
                AE2Items.EngineeringProcessor.get(amount = 4),
                AE2Items.ItemItemMultiPart76.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Platinum,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Vanadium,
                    count = 8,
                ),
            ),
            output = AE2Items.MEQuantumRing.get(),
            ticks = 20 * 20,
            eu = 7680,
            particles = 2000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.FieldGeneratorEV.get(),
                AE2Items.FluixCrystal.get(amount = 4),
                AE2Items.FluixPearl.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
                AE2Items.QuartzGlass.get(amount = 12),
            ),
            output = AE2Items.QuantumLinkChamber.get(),
            ticks = 40 * 20,
            eu = 7680,
            particles = 8000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.MEQuantumRing.get(),
                AE2Items.FluixDust.get(amount = 4),
                AE2Items.FluixCrystal.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Platinum,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.NiobiumTitanium,
                    count = 8,
                ),
                AE2Items.ItemItemMultiPart16.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Palladium,
                    count = 16,
                ),
            ),
            output = AE2Items.SpatialPylon.get(amount = 2),
            ticks = 30 * 20,
            eu = 7680,
            particles = 500,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.IOPort.get(),
                AE2Items.EngineeringProcessor.get(amount = 4),
                AE2Items.SpatialPylon.get(amount = 4),
                AE2Items.QuantumLinkChamber.get(amount = 4),
                AE2Items.FluixCrystal.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.NiobiumTitanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Platinum,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Vanadium,
                    count = 16,
                ),
            ),
            output = AE2Items.SpatialIOPort.get(),
            ticks = 40 * 20,
            eu = 7680,
            particles = 1000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.RobotArmLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 1,
                ),
                AE2Items.FormationCore.get(),
                AE2Items.AnnihilationCore.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Steel,
                    count = 4,
                ),
            ),
            output = AE2Items.InterfaceBlock.get(),
            ticks = 100,
            eu = 120,
            particles = 50,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.RobotArmMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 2,
                ),
                AE2Items.FormationCore.get(amount = 2),
                AE2Items.AnnihilationCore.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlueSteel,
                    count = 4,
                ),
            ),
            output = AE2Items.InterfaceBlock.get(amount = 2),
            ticks = 200,
            eu = 480,
            particles = 100,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.RobotArmHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 3,
                ),
                AE2Items.FormationCore.get(amount = 3),
                AE2Items.AnnihilationCore.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HSLA,
                    count = 4,
                ),
            ),
            output = AE2Items.InterfaceBlock.get(amount = 4),
            ticks = 300,
            eu = 1920,
            particles = 200,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.RobotArmEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 4,
                ),
                AE2Items.FormationCore.get(amount = 4),
                AE2Items.AnnihilationCore.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HSSG,
                    count = 4,
                ),
            ),
            output = AE2Items.InterfaceBlock.get(amount = 8),
            ticks = 400,
            eu = 7680,
            particles = 400,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.RobotArmIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 5,
                ),
                AE2Items.FormationCore.get(amount = 5),
                AE2Items.AnnihilationCore.get(amount = 5),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HastelloyC276,
                    count = 4,
                ),
            ),
            output = AE2Items.InterfaceBlock.get(amount = 12),
            ticks = 500,
            eu = 30720,
            particles = 600,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.RobotArmLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 6,
                ),
                AE2Items.FormationCore.get(amount = 6),
                AE2Items.AnnihilationCore.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HastelloyN,
                    count = 4,
                ),
            ),
            output = AE2Items.InterfaceBlock.get(amount = 16),
            ticks = 600,
            eu = 122880,
            particles = 800,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.RobotArmZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 7,
                ),
                AE2Items.FormationCore.get(amount = 7),
                AE2Items.AnnihilationCore.get(amount = 7),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Lafium,
                    count = 4,
                ),
            ),
            output = AE2Items.InterfaceBlock.get(amount = 24),
            ticks = 700,
            eu = 500000,
            particles = 1200,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.RobotArmUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 8,
                ),
                AE2Items.FormationCore.get(amount = 8),
                AE2Items.AnnihilationCore.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.CinobiteA243,
                    count = 4,
                ),
            ),
            output = AE2Items.InterfaceBlock.get(amount = 32),
            ticks = 800,
            eu = 2000000,
            particles = 1600,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.BlankPattern.get(),
                AE2Items.MEPatternTerminal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                AE2Items.EngineeringProcessor.get(amount = 4),
            ),
            output = AE2Items.MEProcessingPatternTerminal.get(),
            ticks = 400,
            eu = 1920,
            particles = 400,
        )
    }
}
