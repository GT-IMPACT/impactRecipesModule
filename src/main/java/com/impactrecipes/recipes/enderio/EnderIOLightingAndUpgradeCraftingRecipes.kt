package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.GregsLightingItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ProjectRedIlluminationItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class EnderIOLightingAndUpgradeCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.ElectricLight.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "QQQ",
                "PDP",
                "PCP",
                'Q',
                EnderIOItems.FusedQuartz.get(),
                'P',
                OrePrefixes.plate.get(Materials.Silicon),
                'D',
                GregsLightingItems.GlowstoneBulb.get(),
                'C',
                EnderIOItems.PowerConduit.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.ElectricLight2.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "QQQ",
                "PDP",
                "PCP",
                'Q',
                EnderIOItems.FusedQuartz.get(),
                'P',
                OrePrefixes.plate.get(Materials.Silicon),
                'D',
                ProjectRedIlluminationItems.ProjectredIlluminationLamp.get(),
                'C',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.ExtractSpeedUpgrade.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "POP",
                "GIG",
                "PWP",
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'O',
                OrePrefixes.plate.get(Materials.Iron),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Iron),
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'I',
                VanillaItems.Piston.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.ExtractSpeedUpgrade.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "POP",
                "GIG",
                "PWP",
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'O',
                OrePrefixes.plate.get(Materials.WroughtIron),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.WroughtIron),
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'I',
                ImpactItems.ULVPiston.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.ExtractSpeedUpgrade.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "POP",
                "GIG",
                "PWP",
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'O',
                OrePrefixes.plate.get(Materials.Steel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Steel),
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'I',
                GregTechItems.ElectricPistonLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.ExtractSpeedUpgrade.get(amount = 8),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "POP",
                "GIG",
                "PWP",
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'O',
                OrePrefixes.plate.get(Materials.Aluminium),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Aluminium),
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'I',
                GregTechItems.ElectricPistonMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.ExtractSpeedUpgrade.get(amount = 16),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "POP",
                "GIG",
                "PWP",
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'O',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.StainlessSteel),
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'I',
                GregTechItems.ElectricPistonHV.get(),
            ),
        )
    }
}
