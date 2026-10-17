package com.impactrecipes.recipes.gendustry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.GendustryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GendustryToolCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.IndustrialGrafter100.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PdI",
                "GAS",
                "MBP",
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'A',
                OrePrefixes.stickLong.get(Materials.StainlessSteel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.StainlessSteel),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'B',
                GregTechItems.BatteryRELVLithium.get(),
                'I',
                ForestryItems.Grafter.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.IndustrialScoop100.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PdI",
                "GAS",
                "MBP",
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'A',
                OrePrefixes.stickLong.get(Materials.StainlessSteel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.StainlessSteel),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'M',
                GregTechItems.ElectricMotorLV.get(),
                'B',
                GregTechItems.BatteryRELVLithium.get(),
                'I',
                VanillaItems.Wool.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ClimateModule.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SIS",
                "GBG",
                "PMP",
                'S',
                OrePrefixes.plate.get(Materials.HSSG),
                'G',
                OrePrefixes.stick.get(Materials.Palladium),
                'P',
                ImpactItems.IridiumAlloyItemCasing.get(),
                'M',
                GregTechItems.ElectricMotorLuV.get(),
                'B',
                OrePrefixes.rotor.get(Materials.Osmium),
                'I',
                GregTechItems.LuVCoil.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.MutagenTank.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "CIC",
                "SdS",
                'S',
                OrePrefixes.screw.get(Materials.HSSS),
                'P',
                OrePrefixes.plate.get(Materials.HSSG),
                'C',
                ImpactItems.IridiumAlloyItemCasing.get(),
                'I',
                GregTechItems.LargeFluidCellTungstenSteel.get(),
            ),
        )
    }
}
