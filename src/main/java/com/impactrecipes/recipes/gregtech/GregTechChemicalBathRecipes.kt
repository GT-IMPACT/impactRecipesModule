package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.GregTech_API
import gregtech.api.enums.Dyes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechChemicalBathRecipes {

    internal fun register() {
        //spacebox0
        MachineRecipes.chemicalBath(
            input = Materials.Stone.item(OrePrefixes.dust).get(amount = 64),
            fluid = Materials.Glue.getFluid(1000),
            output = ImpactItems.PackEarth.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 8,
        )

        //spacebox1
        MachineRecipes.chemicalBath(
            input = Materials.Moon.item(OrePrefixes.dust).get(amount = 64),
            fluid = Materials.Plastic.getMolten(144L),
            output = ImpactItems.PackMoon.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 20,
        )

        //spacebox2
        MachineRecipes.chemicalBath(
            input = Materials.Mars.item(OrePrefixes.dust).get(amount = 64),
            fluid = Materials.PolyvinylChloride.getMolten(144L),
            output = ImpactItems.PackMars.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 50,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustPhobos",
                64,
            ),
            fluid = Materials.PolyvinylChloride.getMolten(144L),
            output = ImpactItems.PackPhobos.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 50,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustDeimos",
                64,
            ),
            fluid = Materials.PolyvinylChloride.getMolten(144L),
            output = ImpactItems.PackDeimos.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 50,
        )

        //spacebox3
        MachineRecipes.chemicalBath(
            input = Materials.Asteroid.item(OrePrefixes.dust).get(amount = 64),
            fluid = Materials.Polystyrene.getMolten(144L),
            output = ImpactItems.PackAsteroids.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 125,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustCeres",
                64,
            ),
            fluid = Materials.Polystyrene.getMolten(144L),
            output = ImpactItems.PackCeres.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 125,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustEuropa",
                64,
            ),
            fluid = Materials.Polystyrene.getMolten(144L),
            output = ImpactItems.PackEuropa.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 125,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustGanymed",
                64,
            ),
            fluid = Materials.Polystyrene.getMolten(144L),
            output = ImpactItems.PackGanymed.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 125,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustCallisto",
                64,
            ),
            fluid = Materials.Polystyrene.getMolten(144L),
            output = ImpactItems.PackCallisto.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 125,
        )

        //spacebox4
        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustVenus",
                64,
            ),
            fluid = Materials.Polytetrafluoroethylene.getMolten(144L),
            output = ImpactItems.PackVenus.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 312,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustMercuryP",
                64,
            ),
            fluid = Materials.Polytetrafluoroethylene.getMolten(144L),
            output = ImpactItems.PackMercury.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 312,
        )

        //spacebox5
        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustEnceladus",
                64,
            ),
            fluid = Materials.PolyphenyleneSulfide.getMolten(144L),
            output = ImpactItems.PackIapetus.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 780,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustTitan",
                64,
            ),
            fluid = Materials.PolyphenyleneSulfide.getMolten(144L),
            output = ImpactItems.PackTitan.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 780,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustOberon",
                64,
            ),
            fluid = Materials.PolyphenyleneSulfide.getMolten(144L),
            output = ImpactItems.PackOberon.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 780,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustMiranda",
                64,
            ),
            fluid = Materials.PolyphenyleneSulfide.getMolten(144L),
            output = ImpactItems.PackEris.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 780,
        )

        //spacebox6
        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustTriton",
                64,
            ),
            fluid = Materials.Polybenzimidazole.getMolten(144L),
            output = ImpactItems.PackTriton.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 1950,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustProteus",
                64,
            ),
            fluid = Materials.Polybenzimidazole.getMolten(144L),
            output = ImpactItems.PackProteus.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 1950,
        )

        //spacebox7
        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustPluto",
                64,
            ),
            fluid = Materials.Polybenzimidazole.getMolten(288L),
            output = ImpactItems.PackPluto.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 4875,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustMakeMake",
                64,
            ),
            fluid = Materials.Polybenzimidazole.getMolten(288L),
            output = ImpactItems.PackMakeMake.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 4875,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustHaumea",
                64,
            ),
            fluid = Materials.Polybenzimidazole.getMolten(288L),
            output = ImpactItems.PackHaumea.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 4875,
        )

        //spacebox8
        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustCentauriA",
                64,
            ),
            fluid = Materials.RadoxPolymer.getMolten(144L),
            output = ImpactItems.PackCentauriA.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 12188,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustVegaB",
                64,
            ),
            fluid = Materials.RadoxPolymer.getMolten(144L),
            output = ImpactItems.PackVegaB.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 12188,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustBarnardaE",
                64,
            ),
            fluid = Materials.RadoxPolymer.getMolten(144L),
            output = ImpactItems.PackBarnardaE.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 12188,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustBarnardaF",
                64,
            ),
            fluid = Materials.RadoxPolymer.getMolten(144L),
            output = ImpactItems.PackBarnardaF.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 12188,
        )

        MachineRecipes.chemicalBath(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustTCetiE",
                64,
            ),
            fluid = Materials.RadoxPolymer.getMolten(144L),
            output = ImpactItems.PackTCetiE.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 200,
            eu = 12188,
        )

        MachineRecipes.chemicalBath(
            input = Materials.Mithril.item(OrePrefixes.gem).get(amount = 2),
            fluid = Materials.SulfuricAcid.getFluid(1000),
            output = Materials.CertusQuartz.item(OrePrefixes.gem).get(),
            secondaryOutput = Materials.Mytryl.item(OrePrefixes.dust).get(),
            output3 = Materials.SluiceSand.item(OrePrefixes.dust).get(),
            chances = intArrayOf(
                10000,
                8000,
                7500,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.chemicalBath(
            input = Materials.Forcicium.item(OrePrefixes.gem).get(amount = 2),
            fluid = Materials.SulfuricAcid.getFluid(1000),
            output = Materials.MysteriousCrystal.item(OrePrefixes.gem).get(),
            secondaryOutput = Materials.Lutetium.item(OrePrefixes.dust).get(),
            output3 = Materials.Trinium.item(OrePrefixes.dust).get(),
            chances = intArrayOf(
                10000,
                8000,
                7500,
            ),
            ticks = 600,
            eu = 30720,
        )

        MachineRecipes.chemicalBath(
            input = Materials.DeepIron.item(OrePrefixes.dust).get(amount = 4),
            fluid = Materials.SodiumPersulfate.getFluid(1000),
            output = Materials.Iron.item(OrePrefixes.dust).get(amount = 2),
            secondaryOutput = Materials.Trinium.item(OrePrefixes.dust).get(),
            output3 = Materials.Indium.item(OrePrefixes.dust).get(),
            chances = intArrayOf(
                10000,
                10000,
                10000,
            ),
            ticks = 600,
            eu = 7680,
        )

        for (i in 0 until 16) {
            for (j in 0 until Dyes.VALUES[i].getSizeOfFluidList()) {
                if ((i != 15)) {
                    MachineRecipes.chemicalBath(
                        input = VanillaItems.Wool.get(),
                        fluid = Dyes.VALUES[i].getFluidDye(
                            j,
                            72L,
                        ),
                        output = ModItemVariant(
                            item = VanillaItems.Wool,
                            meta = (15 - i),
                        ).get(),
                        secondaryOutput = GT_Values.NI,
                        output3 = GT_Values.NI,
                        chances = null,
                        ticks = 64,
                        eu = 2,
                    )
                }

                MachineRecipes.chemicalBath(
                    input = VanillaItems.Glass.get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        18L,
                    ),
                    output = ModItemVariant(
                        item = VanillaItems.StainedGlass,
                        meta = (15 - i),
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 64,
                    eu = 2,
                )

                MachineRecipes.chemicalBath(
                    input = VanillaItems.HardenedClay.get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        18L,
                    ),
                    output = ModItemVariant(
                        item = VanillaItems.StainedHardenedClay,
                        meta = (15 - i),
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 64,
                    eu = 2,
                )
            }
        }

        // --- Chlorine cleaning of pistons
        MachineRecipes.chemicalBath(
            input = VanillaItems.StickyPiston.get(),
            fluid = Materials.Chlorine.getGas(10L),
            output = VanillaItems.Piston.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = null,
            ticks = 30,
            eu = 30,
        )

        // --- Leather
        MachineRecipes.chemicalBath(
            input = VanillaItems.String.get(amount = 4),
            fluid = Materials.PolyvinylChloride.getMolten(36L),
            output = VanillaItems.Leather.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = intArrayOf(10000),
            ticks = 100,
            eu = 30,
        )
    }
}
