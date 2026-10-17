package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.ToolDictNames
import gregtech.api.util.GT_ModHandler

internal class ImpactRodCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.CobblestoneRod.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "f ",
                " S",
                'S',
                VanillaItems.Cobblestone.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.SandstoneRod.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "f ",
                " S",
                'S',
                VanillaItems.Sandstone.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ReinforcedAluminiumIronPlate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "ACA",
                "PAP",
                'C',
                ImpactItems.AluminiumIronPlate.get(),
                'A',
                OrePrefixes.plateAlloy.get(Materials.Carbon),
                'P',
                OrePrefixes.plateAlloy.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ReinforcedTitaniumIronPlate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "ACA",
                "PAP",
                'C',
                ImpactItems.TitaniumIronPlate.get(),
                'A',
                OrePrefixes.plate.get(Materials.Silicon),
                'P',
                OrePrefixes.plateAlloy.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ReinforcedTungstenIronPlate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "ACA",
                "PAP",
                'C',
                ImpactItems.TungstenIronPlate.get(),
                'A',
                OrePrefixes.plate.get(Materials.Tungsten),
                'P',
                OrePrefixes.plateAlloy.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ReinforcedTungstenSteelIronPlate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "ACA",
                "PAP",
                'C',
                ImpactItems.TungstenSteelIronPlate.get(),
                'A',
                OrePrefixes.plate.get(Materials.TungstenSteel),
                'P',
                OrePrefixes.plateAlloy.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ReinforcedChromeIronPlate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "ACA",
                "PAP",
                'C',
                ImpactItems.ChromeIronPlate.get(),
                'A',
                OrePrefixes.plate.get(Materials.Diamond),
                'P',
                OrePrefixes.plateAlloy.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ReinforcedIridiumIronPlate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "ACA",
                "PAP",
                'C',
                ImpactItems.IridiumIronPlate.get(),
                'A',
                OrePrefixes.plateAlloy.get(Materials.Iridium),
                'P',
                OrePrefixes.plateAlloy.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ReinforcedNaquadriaIronPlate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "ACA",
                "PAP",
                'C',
                ImpactItems.NaquadriaIronPlate.get(),
                'A',
                OrePrefixes.plate.get(Materials.MysteriousCrystal),
                'P',
                OrePrefixes.plateAlloy.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ReinforcedNeutroniumIronPlate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "ACA",
                "PAP",
                'C',
                ImpactItems.NeutroniumIronPlate.get(),
                'A',
                OrePrefixes.plate.get(Materials.BlackPlutonium),
                'P',
                OrePrefixes.plateAlloy.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyNoseConeTier4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dNh",
                "SPS",
                "PAP",
                'N',
                GalacticraftMarsItems.ItemHeavyNoseCone.get(),
                'S',
                OrePrefixes.screw.get(Materials.Osmiridium),
                'P',
                ImpactItems.IceCompressedPlate.get(),
                'A',
                ImpactItems.HeavyDutyPlateTier4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyNoseConeTier5.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dNh",
                "SPS",
                "PAP",
                'N',
                ImpactItems.HeavyDutyNoseConeTier4.get(),
                'S',
                OrePrefixes.screw.get(Materials.Duranium),
                'P',
                OrePrefixes.plateTriple.get(Materials.NaquadahAlloy),
                'A',
                ImpactItems.HeavyDutyPlateTier5.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyNoseConeTier6.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dNh",
                "SPS",
                "PAP",
                'N',
                ImpactItems.HeavyDutyNoseConeTier5.get(),
                'S',
                OrePrefixes.screw.get(Materials.Tritanium),
                'P',
                ImpactItems.MysteriousCrystalCompressedPlate.get(),
                'A',
                ImpactItems.HeavyDutyPlateTier6.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyNoseConeTier7.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dNh",
                "SPS",
                "PAP",
                'N',
                ImpactItems.HeavyDutyNoseConeTier6.get(),
                'S',
                OrePrefixes.screw.get(Materials.Infuscolium),
                'P',
                ImpactItems.QuantiumCompressedPlate.get(),
                'A',
                ImpactItems.HeavyDutyPlateTier7.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyNoseConeTier8.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dNh",
                "SPS",
                "PAP",
                'N',
                ImpactItems.HeavyDutyNoseConeTier7.get(),
                'S',
                OrePrefixes.screw.get(Materials.Phoenixite),
                'P',
                ImpactItems.BlackPlutoniumCompressedPlate.get(),
                'A',
                ImpactItems.HeavyDutyPlateTier8.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketEngineTier4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PIP",
                "PSP",
                "BEB",
                'I',
                OrePrefixes.pipeTiny.get(Materials.NiobiumTitanium),
                'S',
                GregTechItems.ElectricPistonLuV.get(),
                'B',
                ImpactItems.Tier4Booster.get(),
                'P',
                ImpactItems.HeavyDutyPlateTier4.get(),
                'E',
                GalacticraftMarsItems.ItemItemBasicAsteroids1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketEngineTier5.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PIP",
                "PSP",
                "BEB",
                'I',
                OrePrefixes.pipeTiny.get(Materials.Enderium),
                'S',
                GregTechItems.ElectricPistonZPM.get(),
                'B',
                ImpactItems.Tier5Booster.get(),
                'P',
                ImpactItems.HeavyDutyPlateTier5.get(),
                'E',
                ImpactItems.HeavyDutyRocketEngineTier4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketEngineTier6.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PIP",
                "PSP",
                "BEB",
                'I',
                OrePrefixes.pipeTiny.get(Materials.Naquadah),
                'S',
                GregTechItems.ElectricPistonUV.get(),
                'B',
                ImpactItems.Tier6Booster.get(),
                'P',
                ImpactItems.HeavyDutyPlateTier6.get(),
                'E',
                ImpactItems.HeavyDutyRocketEngineTier5.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketEngineTier7.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PIP",
                "PSP",
                "BEB",
                'I',
                OrePrefixes.pipeTiny.get(Materials.Infuscolium),
                'S',
                GregTechItems.ElectricPistonUHV.get(),
                'B',
                ImpactItems.Tier7Booster.get(),
                'P',
                ImpactItems.HeavyDutyPlateTier7.get(),
                'E',
                ImpactItems.HeavyDutyRocketEngineTier6.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketEngineTier8.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PIP",
                "PSP",
                "BEB",
                'I',
                OrePrefixes.pipeTiny.get(Materials.Neutronium),
                'S',
                GregTechItems.ElectricPistonUEV.get(),
                'B',
                ImpactItems.Tier8Booster.get(),
                'P',
                ImpactItems.HeavyDutyPlateTier8.get(),
                'E',
                ImpactItems.HeavyDutyRocketEngineTier7.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketFinsTier4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "fPh",
                "APA",
                "ACA",
                'P',
                ImpactItems.HeavyDutyPlateTier4.get(),
                'C',
                ImpactItems.IridiumAlloyDualCompressedPlate.get(),
                'A',
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketFinsTier5.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "fPh",
                "APA",
                "ACA",
                'P',
                ImpactItems.HeavyDutyPlateTier5.get(),
                'C',
                ImpactItems.IceDualCompressedPlate.get(),
                'A',
                ImpactItems.HeavyDutyPlateTier4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketFinsTier6.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "fPh",
                "APA",
                "ACA",
                'P',
                ImpactItems.HeavyDutyPlateTier6.get(),
                'C',
                ImpactItems.MysteriousCrystalDualCompressedPlate.get(),
                'A',
                ImpactItems.HeavyDutyPlateTier5.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketFinsTier7.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "fPh",
                "APA",
                "ACA",
                'P',
                ImpactItems.HeavyDutyPlateTier7.get(),
                'C',
                ImpactItems.QuantiumDualCompressedPlate.get(),
                'A',
                ImpactItems.HeavyDutyPlateTier6.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HeavyDutyRocketFinsTier8.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "fPh",
                "APA",
                "ACA",
                'P',
                ImpactItems.HeavyDutyPlateTier8.get(),
                'C',
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Adamantium,
                    count = 1,
                ),
                'A',
                ImpactItems.HeavyDutyPlateTier7.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Tier4Booster.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "ABA",
                "ACA",
                'P',
                OrePrefixes.plate.get(Materials.HastelloyN),
                'A',
                ImpactItems.HeavyDutyPlateTier4.get(),
                'C',
                ImpactItems.MytrylCompressedPlate.get(),
                'B',
                GalacticraftCoreItems.ItemEngine1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Tier5Booster.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "ABA",
                "ACA",
                'P',
                OrePrefixes.plate.get(Materials.Europium),
                'A',
                ImpactItems.HeavyDutyPlateTier5.get(),
                'C',
                ImpactItems.LeadNickelCompressedPlate.get(),
                'B',
                ImpactItems.Tier4Booster.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Tier6Booster.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "ABA",
                "ACA",
                'P',
                OrePrefixes.plate.get(Materials.Americium),
                'A',
                ImpactItems.HeavyDutyPlateTier6.get(),
                'C',
                ImpactItems.MeitneriumCompressedPlate.get(),
                'B',
                ImpactItems.Tier5Booster.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Tier7Booster.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "ABA",
                "ACA",
                'P',
                OrePrefixes.plate.get(Materials.Neutronium),
                'A',
                ImpactItems.HeavyDutyPlateTier7.get(),
                'C',
                ImpactItems.QuantiumCompressedPlate.get(),
                'B',
                ImpactItems.Tier6Booster.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Tier8Booster.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "ABA",
                "ACA",
                'P',
                OrePrefixes.plate.get(Materials.Phoenixite),
                'A',
                ImpactItems.HeavyDutyPlateTier8.get(),
                'C',
                ImpactItems.BlackPlutoniumCompressedPlate.get(),
                'B',
                ImpactItems.Tier7Booster.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.MediumFuelCanister.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "PCA",
                "ShS",
                'S',
                OrePrefixes.screw.get(Materials.HastelloyC276),
                'P',
                ImpactItems.TitaniumDualCompressedPlate.get(),
                'A',
                ImpactItems.DeshDualCompressedPlate.get(),
                'C',
                GalaxySpaceItems.ItemModules3.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.LargeFuelCanister.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "PCA",
                "ShS",
                'S',
                OrePrefixes.screw.get(Materials.Lafium),
                'P',
                ImpactItems.IceDualCompressedPlate.get(),
                'A',
                ImpactItems.IridiumAlloyDualCompressedPlate.get(),
                'C',
                ImpactItems.MediumFuelCanister.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ExtraLargeFuelCanister.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "PCA",
                "ShS",
                'S',
                OrePrefixes.screw.get(Materials.Neutronium),
                'P',
                ImpactItems.MysteriousCrystalDualCompressedPlate.get(),
                'A',
                ImpactItems.QuantiumDualCompressedPlate.get(),
                'C',
                ImpactItems.LargeFuelCanister.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.IndustryFrame.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "SBS",
                "SSS",
                'P',
                OrePrefixes.plate.get(Materials.Iridium),
                'S',
                OrePrefixes.stick.get(Materials.Osmium),
                'B',
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Europium,
                    count = 1,
                ),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = ImpactItems.WoodBrickForm.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ImpactItems.BlankPattern.get(),
                ToolDictNames.craftingToolKnife,
            ),
        )
    }
}
