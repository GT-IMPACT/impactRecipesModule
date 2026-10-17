package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.AE2StuffItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2TunnelAndWirelessProviderRecipes {

    internal fun register() {
        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.EmitterEV.get(),
                GregTechItems.SensorEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HSSG,
                    count = 8,
                ),
                AE2Items.AnnihilationCore.get(),
                AE2Items.FormationCore.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 2,
                ),
            ),
            output = AE2Items.P2PTunnelME.get(amount = 2),
            ticks = 500,
            eu = 7680,
            particles = 400,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.EmitterIV.get(),
                GregTechItems.SensorIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HastelloyC276,
                    count = 8,
                ),
                AE2Items.AnnihilationCore.get(amount = 2),
                AE2Items.FormationCore.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 6,
                ),
            ),
            output = AE2Items.P2PTunnelME.get(amount = 6),
            ticks = 600,
            eu = 30720,
            particles = 1200,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.EmitterLuV.get(),
                GregTechItems.SensorLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HastelloyN,
                    count = 8,
                ),
                AE2Items.AnnihilationCore.get(amount = 3),
                AE2Items.FormationCore.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 12,
                ),
            ),
            output = AE2Items.P2PTunnelME.get(amount = 18),
            ticks = 700,
            eu = 122880,
            particles = 3600,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.EmitterZPM.get(),
                GregTechItems.SensorZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Lafium,
                    count = 8,
                ),
                AE2Items.AnnihilationCore.get(amount = 4),
                AE2Items.FormationCore.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 20,
                ),
            ),
            output = AE2Items.P2PTunnelME.get(amount = 32),
            ticks = 800,
            eu = 500000,
            particles = 7200,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.EmitterUV.get(),
                GregTechItems.SensorUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.CinobiteA243,
                    count = 8,
                ),
                AE2Items.AnnihilationCore.get(amount = 5),
                AE2Items.FormationCore.get(amount = 5),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 32,
                ),
            ),
            output = AE2Items.P2PTunnelME.get(amount = 64),
            ticks = 900,
            eu = 2000000,
            particles = 14400,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Vanadium,
                    count = 1,
                ),
                AE2Items.MESmartCableFluix.get(),
                AE2Items.MEWirelessAccessPoint.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.VanadiumSteel,
                    count = 4,
                ),
            ),
            output = AE2StuffItems.WirelessConnector.get(),
            ticks = 40 * 20,
            eu = 480,
            particles = 1000,
        )
    }
}
