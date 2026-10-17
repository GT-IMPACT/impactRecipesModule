package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.items.BuildCraftBuildersItems
import com.impactrecipes.items.BuildCraftCoreItems
import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BuildCraftBuilderCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = BuildCraftBuildersItems.FillerBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PMP",
                "CHC",
                "GIG",
                'P',
                GregTechItems.ElectricPistonMV.get(),
                'M',
                BuildCraftCoreItems.MarkerBlock.get(),
                'C',
                GregTechItems.ConveyorModuleMV.get(),
                'H',
                GregTechItems.HullMV.get(),
                'G',
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Gold,
                    count = 1,
                ),
                'I',
                ChestUpItems.SteelChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftBuildersItems.BuilderBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PMP",
                "CHC",
                "GIG",
                'P',
                GregTechItems.RobotArmMV.get(),
                'M',
                BuildCraftCoreItems.MarkerBlock.get(),
                'C',
                GregTechItems.ConveyorModuleMV.get(),
                'H',
                GregTechItems.HullMV.get(),
                'G',
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Birmabright,
                    count = 1,
                ),
                'I',
                ChestUpItems.SteelChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftBuildersItems.ArchitectBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PMP",
                "CHC",
                "GIG",
                'P',
                GregTechItems.RobotArmMV.get(),
                'M',
                BuildCraftCoreItems.MarkerBlock.get(),
                'C',
                GregTechItems.ConveyorModuleMV.get(),
                'H',
                GregTechItems.HullMV.get(),
                'G',
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Birmabright,
                    count = 1,
                ),
                'I',
                GregTechItems.CoverScreen.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftBuildersItems.LibraryBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PGP",
                "CHC",
                "PIP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'H',
                GregTechItems.HullMV.get(),
                'G',
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Birmabright,
                    count = 1,
                ),
                'I',
                GregTechItems.CoverScreen.get(),
            ),
        )
    }
}
