package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Dyes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials

internal class AE2CableBathRecipes {

    internal fun register() {
        for (i in 0 until 16) {
            for (j in 0 until Dyes.VALUES[i].getSizeOfFluidList()) {
                MachineRecipes.chemicalBath(
                    input = AE2Items.ItemItemMultiPart16.get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        36,
                    ),
                    output = ModItemVariant(
                        item = AE2Items.MEGlassCableWhite,
                        meta = 15 - i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 20,
                    eu = 2,
                )

                MachineRecipes.chemicalBath(
                    input = AE2Items.MECoveredCableFluix.get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        36,
                    ),
                    output = ModItemVariant(
                        item = AE2Items.MEGlassCableWhite,
                        meta = 35 - i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 20,
                    eu = 2,
                )

                MachineRecipes.chemicalBath(
                    input = AE2Items.MESmartCableFluix.get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        36,
                    ),
                    output = ModItemVariant(
                        item = AE2Items.MEGlassCableWhite,
                        meta = 55 - i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 20,
                    eu = 2,
                )

                MachineRecipes.chemicalBath(
                    input = AE2Items.ItemItemMultiPart76.get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        36,
                    ),
                    output = ModItemVariant(
                        item = AE2Items.MEGlassCableWhite,
                        meta = 75 - i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 20,
                    eu = 2,
                )

                MachineRecipes.chemicalBath(
                    input = AE2Items.MatterBall.get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        36,
                    ),
                    output = ModItemVariant(
                        item = AE2Items.PaintBallWhite,
                        meta = 15 - i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 20,
                    eu = 2,
                )

                MachineRecipes.chemicalBath(
                    input = AE2Items.MEDenseCoveredCableFluix.get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        36,
                    ),
                    output = ModItemVariant(
                        item = AE2Items.MEGlassCableWhite,
                        meta = 535 - i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 20,
                    eu = 2,
                )
            }

            MachineRecipes.chemicalBath(
                input = ModItemVariant(
                    item = AE2Items.MEGlassCableWhite,
                    meta = 15 - i,
                ).get(),
                fluid = Materials.Chlorine.getGas(50),
                output = AE2Items.ItemItemMultiPart16.get(),
                secondaryOutput = GT_Values.NI,
                output3 = GT_Values.NI,
                chances = null,
                ticks = 20,
                eu = 2,
            )

            MachineRecipes.chemicalBath(
                input = ModItemVariant(
                    item = AE2Items.MEGlassCableWhite,
                    meta = 35 - i,
                ).get(),
                fluid = Materials.Chlorine.getGas(50),
                output = AE2Items.MECoveredCableFluix.get(),
                secondaryOutput = GT_Values.NI,
                output3 = GT_Values.NI,
                chances = null,
                ticks = 20,
                eu = 2,
            )

            MachineRecipes.chemicalBath(
                input = ModItemVariant(
                    item = AE2Items.MEGlassCableWhite,
                    meta = 55 - i,
                ).get(),
                fluid = Materials.Chlorine.getGas(50),
                output = AE2Items.MESmartCableFluix.get(),
                secondaryOutput = GT_Values.NI,
                output3 = GT_Values.NI,
                chances = null,
                ticks = 20,
                eu = 2,
            )

            MachineRecipes.chemicalBath(
                input = ModItemVariant(
                    item = AE2Items.MEGlassCableWhite,
                    meta = 75 - i,
                ).get(),
                fluid = Materials.Chlorine.getGas(50),
                output = AE2Items.ItemItemMultiPart76.get(),
                secondaryOutput = GT_Values.NI,
                output3 = GT_Values.NI,
                chances = null,
                ticks = 20,
                eu = 2,
            )

            MachineRecipes.chemicalBath(
                input = ModItemVariant(
                    item = AE2Items.PaintBallWhite,
                    meta = 15 - i,
                ).get(),
                fluid = Materials.Chlorine.getGas(50),
                output = AE2Items.MatterBall.get(),
                secondaryOutput = GT_Values.NI,
                output3 = GT_Values.NI,
                chances = null,
                ticks = 20,
                eu = 2,
            )

            MachineRecipes.chemicalBath(
                input = ModItemVariant(
                    item = AE2Items.MEGlassCableWhite,
                    meta = 535 - i,
                ).get(),
                fluid = Materials.Chlorine.getGas(50),
                output = AE2Items.MEDenseCoveredCableFluix.get(),
                secondaryOutput = GT_Values.NI,
                output3 = GT_Values.NI,
                chances = null,
                ticks = 20,
                eu = 2,
            )
        }
    }
}
