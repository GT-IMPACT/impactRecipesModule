package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ProjectRedIlluminationItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility
import net.minecraftforge.oredict.OreDictionary

internal class RailcraftRailComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.StoneSlab.get(amount = 3),
            secondaryInput = RailcraftItems.Rebar.get(),
            output = RailcraftItems.TieStone.get(),
            ticks = 128,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = VanillaItems.StoneSlab7.get(amount = 3),
            secondaryInput = RailcraftItems.Rebar.get(),
            output = RailcraftItems.TieStone.get(),
            ticks = 128,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = RailcraftItems.TieWood.get(amount = 3),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Iron,
                count = 3,
            ),
            output = RailcraftItems.RailWood.get(amount = 12),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = RailcraftItems.TieWood.get(amount = 3),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.WroughtIron,
                count = 3,
            ),
            output = RailcraftItems.RailWood.get(amount = 12),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OreDictionary.getOres("paneGlass").get(1),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Iron,
                    count = 1,
                ),
                ProjectRedIlluminationItems.InvertedGreenLamp.get(),
                ProjectRedIlluminationItems.InvertedYellowLamp.get(),
                ProjectRedIlluminationItems.InvertedRedLamp.get(),
                GT_Utility.getIntegratedCircuit(16),
            ),
            fluid = null,
            output = RailcraftItems.SignalLamp.get(amount = 16),
            ticks = 200,
            eu = 30,
        )
    }
}
