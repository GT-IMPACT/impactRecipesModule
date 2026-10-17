package com.impactrecipes.recipes.gendustry

import com.impactrecipes.items.GendustryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GendustryMachineCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.Imprinter.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PGP",
                "BCB",
                "GMG",
                'G',
                OrePrefixes.gearGt.get(Materials.Osmium),
                'C',
                GregTechItems.HullLuV.get(),
                'B',
                GendustryItems.BeeReceptacle.get(),
                'P',
                GendustryItems.GeneticsProcessor.get(),
                'M',
                GendustryItems.PowerModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.Sampler.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PBP",
                "ICI",
                "GMG",
                'G',
                OrePrefixes.gearGt.get(Materials.Osmium),
                'C',
                GregTechItems.HullLuV.get(),
                'B',
                GendustryItems.BeeReceptacle.get(),
                'P',
                GendustryItems.GeneticsProcessor.get(),
                'M',
                GendustryItems.PowerModule.get(),
                'I',
                ImpactItems.EngravedDiamondCrystalChip.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.Liquifier.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GIG",
                "PCP",
                "GMG",
                'G',
                OrePrefixes.gearGt.get(Materials.Osmium),
                'C',
                GregTechItems.HullLuV.get(),
                'M',
                GendustryItems.PowerModule.get(),
                'I',
                GregTechItems.ConveyorModuleLuV.get(),
                'P',
                GregTechItems.ElectricPistonLuV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.Extractor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IBI",
                "PCP",
                "GMG",
                'G',
                OrePrefixes.gearGt.get(Materials.Osmium),
                'C',
                GregTechItems.HullLuV.get(),
                'B',
                GendustryItems.BeeReceptacle.get(),
                'P',
                GendustryItems.GeneticsProcessor.get(),
                'M',
                GendustryItems.PowerModule.get(),
                'I',
                GregTechItems.ElectricPistonLuV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.Transposer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IGI",
                "PCP",
                "GMG",
                'G',
                OrePrefixes.gearGt.get(Materials.Osmium),
                'C',
                GregTechItems.HullLuV.get(),
                'P',
                GendustryItems.GeneticsProcessor.get(),
                'M',
                GendustryItems.PowerModule.get(),
                'I',
                GregTechItems.RobotArmLuV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.Replicator.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IPI",
                "MCM",
                "GPG",
                'G',
                OrePrefixes.gearGt.get(Materials.Osmium),
                'C',
                GregTechItems.HullLuV.get(),
                'P',
                GendustryItems.GeneticsProcessor.get(),
                'M',
                GendustryItems.PowerModule.get(),
                'I',
                GregTechItems.RobotArmLuV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.BeeReceptacle.get(),
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
                ImpactItems.IndustryFrame.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.PowerModule.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WPW",
                "CIC",
                "GMG",
                'W',
                OrePrefixes.wireGt02.get(Materials.VanadiumGallium),
                'P',
                OrePrefixes.plate.get(Materials.HSSG),
                'C',
                ImpactItems.IridiumAlloyItemCasing.get(),
                'I',
                OrePrefixes.circuit.get(Materials.Master),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'M',
                GregTechItems.ElectricMotorLuV.get(),
            ),
        )
    }
}
