package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactMaterialImplosionRecipes {

    internal fun register() {
        MachineRecipes.implosionCompressor(
            input = ImpactItems.RawSDHCAlloy.get(),
            secondaryInput = 5,
            output = GalaxySpaceItems.ItemCompressedPlates4.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.StainlessSteel,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.block,
                material = Materials.Coal,
                count = 1,
            ),
            secondaryInput = 1,
            output = GalaxySpaceItems.ItemCompressedCoal.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.compressed,
                material = Materials.Aluminium,
                count = 2,
            ),
            secondaryInput = 1,
            output = ImpactItems.AluminiumDualCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.compressed,
                material = Materials.Bronze,
                count = 2,
            ),
            secondaryInput = 1,
            output = ImpactItems.BronzeDualCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.CallistoIcePlate.get(amount = 3),
            secondaryInput = 1,
            output = ImpactItems.CallistoIceCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.LedoxColdPlate.get(amount = 3),
            secondaryInput = 1,
            output = ImpactItems.LedoxCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.MysteriousCrystalColdPlate.get(amount = 3),
            secondaryInput = 1,
            output = ImpactItems.MysteriousCrystalCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = IC2Items.IridiumPlate.get(amount = 3),
            secondaryInput = 2,
            output = ImpactItems.IridiumAlloyCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = GalacticraftMarsItems.ItemNull5.get(amount = 2),
            secondaryInput = 1,
            output = ImpactItems.DeshDualCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.IceCompressedPlate.get(amount = 2),
            secondaryInput = 1,
            output = ImpactItems.IceDualCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.IridiumAlloyCompressedPlate.get(amount = 2),
            secondaryInput = 2,
            output = ImpactItems.IridiumAlloyDualCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.compressed,
                material = Materials.MeteoricIron,
                count = 2,
            ),
            secondaryInput = 1,
            output = ImpactItems.MeteoricIronDualCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.MysteriousCrystalCompressedPlate.get(amount = 2),
            secondaryInput = 1,
            output = ImpactItems.MysteriousCrystalDualCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.QuantiumCompressedPlate.get(amount = 2),
            secondaryInput = 1,
            output = ImpactItems.QuantiumDualCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.compressed,
                material = Materials.Titanium,
                count = 2,
            ),
            secondaryInput = 1,
            output = ImpactItems.TitaniumDualCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = GregTechItems.IngotHeavy1.get(),
            secondaryInput = 8,
            output = GalacticraftCoreItems.ItemHeavyPlating.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.StainlessSteel,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                5000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = GregTechItems.IngotHeavy2.get(),
            secondaryInput = 8,
            output = GalacticraftMarsItems.ItemNull3.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Titanium,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                5000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = GregTechItems.IngotHeavy3.get(),
            secondaryInput = 8,
            output = GalacticraftMarsItems.ItemItemBasicAsteroids.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.TungstenSteel,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                5000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.HeavyDutyAlloyIngotT4.get(),
            secondaryInput = 8,
            output = ImpactItems.HeavyDutyPlateTier4.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Chrome,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                5000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.HeavyDutyAlloyIngotT5.get(),
            secondaryInput = 8,
            output = ImpactItems.HeavyDutyPlateTier5.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iridium,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                5000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.HeavyDutyAlloyIngotT6.get(),
            secondaryInput = 8,
            output = ImpactItems.HeavyDutyPlateTier6.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Osmium,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                5000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.HeavyDutyAlloyIngotT7.get(),
            secondaryInput = 8,
            output = ImpactItems.HeavyDutyPlateTier7.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Neutronium,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                5000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.HeavyDutyAlloyIngotT8.get(),
            secondaryInput = 8,
            output = ImpactItems.HeavyDutyPlateTier8.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Phoenixite,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                5000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateTriple,
                material = Materials.Lead,
                count = 1,
            ),
            secondaryInput = 1,
            output = ImpactItems.LeadCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateTriple,
                material = Materials.Nickel,
                count = 1,
            ),
            secondaryInput = 1,
            output = GalaxySpaceItems.CompressedNickel.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateTriple,
                material = Materials.Oriharukon,
                count = 1,
            ),
            secondaryInput = 1,
            output = ImpactItems.OriharukonCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateTriple,
                material = Materials.Platinum,
                count = 1,
            ),
            secondaryInput = 1,
            output = ImpactItems.PlatinumCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateTriple,
                material = Materials.Adamantium,
                count = 1,
            ),
            secondaryInput = 1,
            output = ImpactItems.AdamantiumCompressedPlate.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateTriple,
                material = Materials.Cobalt,
                count = 1,
            ),
            secondaryInput = 1,
            output = GalaxySpaceItems.ItemCompressedPlates.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ash,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1000,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = GregTechItems.IngotIridiumAlloy.get(),
            secondaryInput = 8,
            output = RecipeItems.ore(
                prefix = OrePrefixes.plateAlloy,
                material = Materials.Iridium,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Titanium,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1500,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.FlawedFluixCrystal.get(amount = 3),
            secondaryInput = 8,
            output = ImpactItems.FlawlessFluixCrystal.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DarkAshes,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1500,
            ),
        )

        MachineRecipes.implosionCompressor(
            input = ImpactItems.FlawlessFluixCrystal.get(amount = 9),
            secondaryInput = 8,
            output = ImpactItems.MatrixTransducer.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DarkAshes,
                count = 1,
            ),
            chances = intArrayOf(
                10000,
                1500,
            ),
        )
    }
}
