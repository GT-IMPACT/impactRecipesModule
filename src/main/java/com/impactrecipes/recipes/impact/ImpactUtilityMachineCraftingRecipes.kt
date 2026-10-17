package com.impactrecipes.recipes.impact

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactApiItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.TecTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OreDictNames
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.ToolDictNames
import gregtech.api.util.GT_ModHandler

internal class ImpactUtilityMachineCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.DryingRackBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "CsC",
                'S',
                "slabWood",
                'C',
                OrePrefixes.bolt.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.BlankPattern.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PP",
                "PP",
                'P',
                VanillaItems.Paper.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.BlankPattern.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DDD",
                "DOD",
                "DDD",
                'O',
                VanillaItems.WaterBucket.get(),
                'D',
                OrePrefixes.dust.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = ImpactApiItems.MultiblockStructureHologramProjector.get(),
            flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
            ingredients = arrayOf<Any?>(
                TecTechItems.ItemEmConstructable.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactApiItems.MultiblockStructureHologramProjector.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RY",
                "YR",
                'R',
                "dyeRed",
                'Y',
                "dyeYellow",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.MatrixParticlesReflector.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PFP",
                "FBF",
                "PFP",
                'P',
                "plateDoubleSilver",
                'F',
                "foilAluminium",
                'B',
                "frameGtHSLA",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.TheMillWoodPlanks.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PFP",
                "FBF",
                "PFP",
                'P',
                "plankWood",
                'F',
                "boltWood",
                'B',
                ToolDictNames.craftingToolSoftHammer,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.TheMill.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PLP",
                "CGC",
                "PBP",
                'P',
                ImpactItems.TheMillWoodPlanks.get(),
                'L',
                BackpackItems.TannedLeather.get(),
                'C',
                "cobblestone",
                'G',
                "gearGtWood",
                'B',
                ToolDictNames.craftingToolSoftHammer,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Windmill.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SLS",
                "LGL",
                "SLS",
                'L',
                BackpackItems.TannedLeather.get(),
                'S',
                "stickWood",
                'G',
                "gearGtWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.VolumetricConfigurator.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "hHw",
                " G ",
                'C',
                "craftingChest",
                'G',
                "gearGtSmallSteel",
                'H',
                GregTechItems.HullLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.PrimitiveMiner.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SBS",
                "PFP",
                "hGd",
                'B',
                IC2Items.CopperBoiler.get(),
                'F',
                OreDictNames.craftingFurnace,
                'S',
                "screwIron",
                'G',
                "gearGtSmallIron",
                'P',
                "plateIron",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.MinerDrillHatch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCd",
                "GFG",
                "hRS",
                'S',
                "screwIron",
                'C',
                "craftingChest",
                'G',
                "gearGtSmallIron",
                'F',
                "frameGtIron",
                'R',
                "ringIron",
            ),
        )
    }
}
