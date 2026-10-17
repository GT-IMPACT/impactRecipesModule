package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class AE2CableWireAssemblyRecipes {

    internal fun register() {
        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart16.get(),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Silicone.getMolten(72),
            output = AE2Items.MECoveredCableFluix.get(),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart16.get(),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(108),
            output = AE2Items.MECoveredCableFluix.get(),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart16.get(),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Rubber.getMolten(144),
            output = AE2Items.MECoveredCableFluix.get(),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart16.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Polydimethylsiloxane,
                    count = 1,
                ),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(144),
            output = AE2Items.MECoveredCableFluix.get(amount = 4),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart16.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.PolyvinylChloride,
                    count = 1,
                ),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(144),
            output = AE2Items.MECoveredCableFluix.get(amount = 4),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart16.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Polydimethylsiloxane,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Silicone.getMolten(144),
            output = AE2Items.MECoveredCableFluix.get(amount = 4),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart16.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.PolyvinylChloride,
                    count = 1,
                ),
            ),
            fluidInput = Materials.Silicone.getMolten(144),
            output = AE2Items.MECoveredCableFluix.get(amount = 4),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.MESmartCableFluix.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Vanadium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.EnergeticAlloy,
                    count = 2,
                ),
            ),
            fluidInput = null,
            output = AE2Items.ItemItemMultiPart76.get(),
            ticks = 200,
            eu = 480,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicon,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Electrum,
                    count = 1,
                ),
                AE2Items.MECoveredCableFluix.get(),
            ),
            fluidInput = null,
            output = AE2Items.MESmartCableFluix.get(),
            ticks = 100,
            eu = 120,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart76.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PolyphenyleneSulfide,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Silicone.getMolten(144),
            output = AE2Items.MEDenseCoveredCableFluix.get(),
            ticks = 100,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart76.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.PolyvinylChloride,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PolyphenyleneSulfide,
                    count = 4,
                ),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(144),
            output = AE2Items.MEDenseCoveredCableFluix.get(amount = 2),
            ticks = 200,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart76.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.PolyvinylChloride,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PolyphenyleneSulfide,
                    count = 4,
                ),
            ),
            fluidInput = Materials.Silicone.getMolten(144),
            output = AE2Items.MEDenseCoveredCableFluix.get(amount = 2),
            ticks = 200,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart76.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Polydimethylsiloxane,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PolyphenyleneSulfide,
                    count = 4,
                ),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(144),
            output = AE2Items.MEDenseCoveredCableFluix.get(amount = 2),
            ticks = 200,
            eu = 8,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                AE2Items.ItemItemMultiPart76.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Polydimethylsiloxane,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PolyphenyleneSulfide,
                    count = 4,
                ),
            ),
            fluidInput = Materials.Silicone.getMolten(144),
            output = AE2Items.MEDenseCoveredCableFluix.get(amount = 2),
            ticks = 200,
            eu = 8,
            cleanroom = false,
        )
    }
}
