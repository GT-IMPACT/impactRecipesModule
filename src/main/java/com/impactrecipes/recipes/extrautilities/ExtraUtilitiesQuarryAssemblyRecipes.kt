package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ExtraUtilitiesQuarryAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingGearboxTungstenSteel2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Talonite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Stellite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Talonite,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Stellite,
                    count = 32,
                ),
            ),
            fluid = null,
            output = ExtraUtilitiesItems.QuarryUpgrade.get(),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.QuarryUpgrade.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.toolHeadDrill,
                material = Materials.Titanium,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.HoleUpgrade.get(),
            ticks = 800,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.QuarryUpgrade.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.toolHeadDrill,
                material = Materials.Enderium,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.SilkUpgrade.get(),
            ticks = 800,
            eu = 30720,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.QuarryUpgrade.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.toolHeadDrill,
                material = Materials.Iridium,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.Fortune1Upgrade.get(),
            ticks = 800,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.Fortune1Upgrade.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.toolHeadDrill,
                material = Materials.Trinium,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.Fortune2Upgrade.get(),
            ticks = 1000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.Fortune2Upgrade.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.toolHeadDrill,
                material = Materials.Tritanium,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.Fortune3Upgrade.get(),
            ticks = 1200,
            eu = 122880,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.QuarryUpgrade.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.gear,
                material = Materials.HSSG,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.Speed1Upgrade.get(),
            ticks = 800,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.Speed1Upgrade.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.gear,
                material = Materials.HSSE,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.Speed2Upgrade.get(),
            ticks = 1000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.Speed2Upgrade.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.gear,
                material = Materials.HSSS,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.Speed3Upgrade.get(),
            ticks = 1200,
            eu = 122880,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.QuarryUpgrade.get(),
            secondaryInput = GregTechItems.ElectricPumpIV.get(),
            fluidInput = null,
            output = ExtraUtilitiesItems.PumpUpgrade.get(),
            ticks = 1000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.PumpIV.get(),
                ExtraUtilitiesItems.QuarryUpgrade.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Talonite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.GumMetal,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Inconel690,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.BT6,
                    count = 32,
                ),
            ),
            fluid = null,
            output = ExtraUtilitiesItems.ThermionicPump.get(),
            ticks = 1000,
            eu = 7680,
        )
    }
}
