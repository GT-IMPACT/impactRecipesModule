package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2ImportBusProviderRecipes {

    internal fun register() {
        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Steel,
                    count = 4,
                ),
                AE2Items.AnnihilationCore.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 2,
                ),
            ),
            output = AE2Items.MEImportBus.get(),
            ticks = 200,
            eu = 120,
            particles = 50,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlueSteel,
                    count = 4,
                ),
                AE2Items.AnnihilationCore.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 4,
                ),
            ),
            output = AE2Items.MEImportBus.get(amount = 2),
            ticks = 300,
            eu = 480,
            particles = 100,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HSLA,
                    count = 4,
                ),
                AE2Items.AnnihilationCore.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 6,
                ),
            ),
            output = AE2Items.MEImportBus.get(amount = 4),
            ticks = 400,
            eu = 1920,
            particles = 200,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HSSG,
                    count = 4,
                ),
                AE2Items.AnnihilationCore.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 8,
                ),
            ),
            output = AE2Items.MEImportBus.get(amount = 8),
            ticks = 500,
            eu = 7680,
            particles = 400,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HastelloyC276,
                    count = 4,
                ),
                AE2Items.AnnihilationCore.get(amount = 10),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 12,
                ),
            ),
            output = AE2Items.MEImportBus.get(amount = 12),
            ticks = 600,
            eu = 30720,
            particles = 600,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HastelloyN,
                    count = 4,
                ),
                AE2Items.AnnihilationCore.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 16,
                ),
            ),
            output = AE2Items.MEImportBus.get(amount = 16),
            ticks = 700,
            eu = 122880,
            particles = 800,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Lafium,
                    count = 4,
                ),
                AE2Items.AnnihilationCore.get(amount = 14),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 20,
                ),
            ),
            output = AE2Items.MEImportBus.get(amount = 24),
            ticks = 800,
            eu = 500000,
            particles = 1200,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.CinobiteA243,
                    count = 4,
                ),
                AE2Items.AnnihilationCore.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 24,
                ),
            ),
            output = AE2Items.MEImportBus.get(amount = 32),
            ticks = 900,
            eu = 2000000,
            particles = 1600,
        )
    }
}
