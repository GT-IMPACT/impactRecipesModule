package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.BuildCraftCoreItems
import com.impactrecipes.items.BuildCraftFactoryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BuildCraftDeviceCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = BuildCraftCoreItems.EngineBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "SIS",
                "GHG",
                'P',
                OrePrefixes.plank.get(Materials.Wood),
                'S',
                OrePrefixes.spring.get(Materials.Iron),
                'G',
                OrePrefixes.gearGt.get(Materials.Iron),
                'I',
                VanillaItems.Piston.get(),
                'H',
                GregTechItems.HullBronze.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftFactoryItems.AutoWorkbenchBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PHP",
                "GCG",
                "PMP",
                'P',
                OrePrefixes.itemCasing.get(Materials.Iron),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Iron),
                'M',
                ImpactItems.ULVMotor.get(),
                'C',
                VanillaItems.CraftingTable.get(),
                'H',
                VanillaItems.Chest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftFactoryItems.FloodGateBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PUP",
                "GCG",
                "PGP",
                'P',
                OrePrefixes.itemCasing.get(Materials.Steel),
                'G',
                ImpactItems.SteelBars.get(),
                'U',
                GregTechItems.ElectricPumpLV.get(),
                'C',
                AE2FCItems.CertusQuartzTank.get(),
            ),
        )
    }
}
