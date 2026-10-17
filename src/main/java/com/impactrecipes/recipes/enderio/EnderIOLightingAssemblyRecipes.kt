package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GregsLightingItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class EnderIOLightingAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.DarkSteel,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.spring,
                material = Materials.Steel,
                count = 1,
            ),
            output = EnderIOItems.DarkSteelPressurePlate.get(),
            ticks = 200,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.DarkSteel,
                count = 3,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(3),
            output = EnderIOItems.BlockDarkIronBars.get(amount = 4),
            ticks = 400,
            eu = 48,
        )

        MachineRecipes.assembler(
            input = EnderIOItems.ElectricLight.get(),
            secondaryInput = VanillaItems.RedstoneTorch.get(),
            output = EnderIOItems.ElectricLight1.get(),
            ticks = 40,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = EnderIOItems.ElectricLight2.get(),
            secondaryInput = VanillaItems.RedstoneTorch.get(),
            output = EnderIOItems.ElectricLight3.get(),
            ticks = 40,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                EnderIOItems.ElectricLight.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Aluminium,
                    count = 4,
                ),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight4.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                EnderIOItems.ElectricLight.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Electrum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HSLA,
                    count = 4,
                ),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight4.get(amount = 16),
            ticks = 150,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                EnderIOItems.ElectricLight.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Platinum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight4.get(amount = 64),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = EnderIOItems.ElectricLight4.get(),
            secondaryInput = VanillaItems.RedstoneTorch.get(),
            output = EnderIOItems.ElectricLight5.get(),
            ticks = 40,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                EnderIOItems.ElectricLight1.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Aluminium,
                    count = 4,
                ),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight5.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                EnderIOItems.ElectricLight1.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Electrum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.HSLA,
                    count = 4,
                ),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight5.get(amount = 16),
            ticks = 150,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                EnderIOItems.ElectricLight1.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Platinum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight5.get(amount = 64),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.ElectricalSteel,
                    count = 1,
                ),
                GalacticraftCoreItems.TileArclamp.get(),
                EnderIOItems.FusedQuartz.get(amount = 4),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight2.get(amount = 16),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Desh,
                    count = 1,
                ),
                GalacticraftCoreItems.TileArclamp.get(),
                EnderIOItems.FusedQuartz.get(amount = 16),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight2.get(amount = 64),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.ElectricalSteel,
                    count = 1,
                ),
                GregsLightingItems.Ic2ElectricFloodlight.get(),
                EnderIOItems.FusedQuartz.get(amount = 4),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight.get(amount = 16),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Desh,
                    count = 1,
                ),
                GregsLightingItems.Ic2ElectricFloodlight.get(),
                EnderIOItems.FusedQuartz.get(amount = 16),
            ),
            fluid = null,
            output = EnderIOItems.ElectricLight.get(amount = 64),
            ticks = 300,
            eu = 250,
        )
    }
}
