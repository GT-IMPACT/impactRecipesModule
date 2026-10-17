package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Dyes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ImpactPipelineAndChestCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.UtilBlock2.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "CDC",
                "CCC",
                'C',
                ImpactItems.UtilityBlock.get(),
                'D',
                Dyes.dyeWhite,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.LongDistancePipelineFluid.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GPG",
                "IwI",
                "GPG",
                'G',
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Steel,
                    count = 1,
                ),
                'P',
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                'I',
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.Steel,
                    count = 1,
                ),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.LongDistancePipelineItem.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GPG",
                "IwI",
                "GPG",
                'G',
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Steel,
                    count = 1,
                ),
                'P',
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                'I',
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.Tin,
                    count = 1,
                ),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.LongDistancePipelineFluidPipe.get(amount = 32),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "IwI",
                "PPP",
                'P',
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                'I',
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Steel,
                    count = 1,
                ),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.LongDistancePipelineItemPipe.get(amount = 32),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "IwI",
                "PPP",
                'P',
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                'I',
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Tin,
                    count = 1,
                ),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.RegulateDigitalChest.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "COY",
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'O',
                GregTechItems.SuperChestLV.get(),
                'Y',
                GregTechItems.ConveyorModuleHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.RegulateOneStackChest.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "EHR",
                " C ",
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'E',
                VanillaItems.Chest.get(),
                'R',
                GregTechItems.RobotArmLV.get(),
                'H',
                GregTechItems.HullLV.get(),
            ),
        )
    }
}
