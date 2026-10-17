package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactSpaceComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.Steel,
                    count = 1,
                ),
                ImpactItems.BronzeDualCompressedPlate.get(),
                ImpactItems.AluminiumDualCompressedPlate.get(),
            ),
            fluid = Materials.StainlessSteel.getMolten(72),
            output = ImpactItems.RawSDHCAlloy.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.Bronze,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.compressed,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 8,
                ),
            ),
            fluid = Materials.StainlessSteel.getMolten(288),
            output = GregTechItems.IngotHeavy1.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalacticraftCoreItems.ItemHeavyPlating.get(),
                GalaxySpaceItems.ItemCompressedPlates4.get(),
                ImpactItems.MeteoricIronDualCompressedPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            fluid = Materials.Titanium.getMolten(288),
            output = GregTechItems.IngotHeavy2.get(),
            ticks = 300,
            eu = 1024,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalacticraftMarsItems.ItemNull3.get(),
                ImpactItems.DeshDualCompressedPlate.get(),
                ImpactItems.TitaniumDualCompressedPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Inconel690,
                    count = 8,
                ),
            ),
            fluid = Materials.TungstenSteel.getMolten(288),
            output = GregTechItems.IngotHeavy3.get(),
            ticks = 400,
            eu = 4096,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(),
                ImpactItems.NaquadahCompressedPlate.get(),
                ImpactItems.IridiumAlloyDualCompressedPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HastelloyN,
                    count = 8,
                ),
            ),
            fluid = Materials.Chrome.getMolten(288),
            output = ImpactItems.HeavyDutyAlloyIngotT4.get(),
            ticks = 500,
            eu = 16384,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.HeavyDutyPlateTier4.get(),
                ImpactItems.MytrylCompressedPlate.get(),
                ImpactItems.IceDualCompressedPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Lafium,
                    count = 10,
                ),
            ),
            fluid = Materials.Iridium.getMolten(288),
            output = ImpactItems.HeavyDutyAlloyIngotT5.get(),
            ticks = 600,
            eu = 65536,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.HeavyDutyPlateTier5.get(),
                ImpactItems.LeadOriharukonCompressedPlate.get(),
                ImpactItems.MysteriousCrystalDualCompressedPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CinobiteA243,
                    count = 12,
                ),
            ),
            fluid = Materials.Osmium.getMolten(288),
            output = ImpactItems.HeavyDutyAlloyIngotT6.get(),
            ticks = 700,
            eu = 262144,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.HeavyDutyPlateTier6.get(),
                ImpactItems.LeadMeitneriumCompressedPlate.get(),
                ImpactItems.QuantiumDualCompressedPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Pikyonium64B,
                    count = 14,
                ),
            ),
            fluid = Materials.Neutronium.getMolten(288),
            output = ImpactItems.HeavyDutyAlloyIngotT7.get(),
            ticks = 800,
            eu = 1048576,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.HeavyDutyPlateTier7.get(),
                ImpactItems.BlackPlutoniumCompressedPlate.get(),
                ImpactItems.AdamantiumCompressedPlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Quantum,
                    count = 16,
                ),
            ),
            fluid = Materials.Phoenixite.getMolten(288),
            output = ImpactItems.HeavyDutyAlloyIngotT8.get(),
            ticks = 900,
            eu = 4194304,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Molybdenum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Iridium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateAlloy,
                    material = Materials.Advanced,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Diamond,
                    count = 2,
                ),
            ),
            fluid = Materials.Titanium.getMolten(144),
            output = GregTechItems.IngotIridiumAlloy.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalaxySpaceItems.CompressedNickel.get(),
                ImpactItems.LeadCompressedPlate.get(),
                ImpactItems.PlatinumCompressedPlate.get(),
            ),
            fluid = Materials.Duranium.getMolten(288),
            output = ImpactItems.LeadNickelCompressedPlate.get(),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.LeadNickelCompressedPlate.get(),
                ImpactItems.OriharukonCompressedPlate.get(),
                ImpactItems.PalladiumCompressedPlate.get(),
            ),
            fluid = Materials.Tritanium.getMolten(288),
            output = ImpactItems.LeadOriharukonCompressedPlate.get(),
            ticks = 1200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.LeadOriharukonCompressedPlate.get(),
                ImpactItems.MeitneriumCompressedPlate.get(),
                ImpactItems.OsmiumCompressedPlate.get(),
            ),
            fluid = Materials.Infuscolium.getMolten(288),
            output = ImpactItems.LeadMeitneriumCompressedPlate.get(),
            ticks = 1400,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.PackEarth.get(amount = 64),
            ),
            fluid = Materials.HSLA.getMolten(288),
            output = ImpactItems.Spacebox1.get(),
            ticks = 1200,
            eu = 64,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.PackMoon.get(amount = 64),
            ),
            fluid = Materials.BT6.getMolten(288),
            output = ImpactItems.Spacebox2.get(),
            ticks = 1200,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.PackMars.get(amount = 64),
                ImpactItems.PackDeimos.get(amount = 64),
                ImpactItems.PackPhobos.get(amount = 64),
            ),
            fluid = Materials.HastelloyC276.getMolten(288),
            output = ImpactItems.Spacebox3.get(),
            ticks = 1200,
            eu = 1024,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.PackAsteroids.get(amount = 64),
                ImpactItems.PackCeres.get(amount = 64),
                ImpactItems.PackEuropa.get(amount = 64),
                ImpactItems.PackGanymed.get(amount = 64),
            ),
            fluid = Materials.HastelloyN.getMolten(288),
            output = ImpactItems.Spacebox4.get(),
            ticks = 1200,
            eu = 4096,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.PackMercury.get(amount = 64),
                ImpactItems.PackVenus.get(amount = 64),
            ),
            fluid = Materials.Lafium.getMolten(288),
            output = ImpactItems.Spacebox5.get(),
            ticks = 1200,
            eu = 16384,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.PackIapetus.get(amount = 64),
                ImpactItems.PackTitan.get(amount = 64),
                ImpactItems.PackEris.get(amount = 64),
                ImpactItems.PackOberon.get(amount = 64),
            ),
            fluid = Materials.CinobiteA243.getMolten(288),
            output = ImpactItems.Spacebox6.get(),
            ticks = 1200,
            eu = 65536,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.PackProteus.get(amount = 64),
                ImpactItems.PackTriton.get(amount = 64),
            ),
            fluid = Materials.Pikyonium64B.getMolten(288),
            output = ImpactItems.Spacebox7.get(),
            ticks = 1200,
            eu = 262144,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.PackPluto.get(amount = 64),
                ImpactItems.PackHaumea.get(amount = 64),
                ImpactItems.PackMakeMake.get(amount = 64),
            ),
            fluid = Materials.Quantum.getMolten(288),
            output = ImpactItems.Spacebox8.get(),
            ticks = 1200,
            eu = 1048576,
        )
    }
}
