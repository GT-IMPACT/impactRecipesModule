package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactWireAssemblyRecipes {

    internal fun register() {
        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HSLA,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Steel,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Vanadium,
                    count = 64,
                ),
            ),
            fluidInput = null,
            output = ImpactItems.SpaceElevatorStructure.get(),
            ticks = 80 * 20,
            eu = 1024,
            cleanroom = false,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Tin,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Rubber.getMolten(1440),
            output = ImpactItems.LDPFELV.get(amount = 32),
            ticks = 600,
            eu = 24,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Tin,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(1080),
            output = ImpactItems.LDPFELV.get(amount = 32),
            ticks = 600,
            eu = 24,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Tin,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Silicone.getMolten(720),
            output = ImpactItems.LDPFELV.get(amount = 32),
            ticks = 600,
            eu = 24,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Birmabright,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Copper,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Birmabright,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Rubber.getMolten(1440),
            output = ImpactItems.LDPFEMV.get(amount = 32),
            ticks = 600,
            eu = 96,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Birmabright,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Copper,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Birmabright,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(1080),
            output = ImpactItems.LDPFEMV.get(amount = 32),
            ticks = 600,
            eu = 96,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Birmabright,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Copper,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Birmabright,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Silicone.getMolten(720),
            output = ImpactItems.LDPFEMV.get(amount = 32),
            ticks = 600,
            eu = 96,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Gold,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Rubber.getMolten(1440),
            output = ImpactItems.LDPFEHV.get(amount = 32),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Gold,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(1080),
            output = ImpactItems.LDPFEHV.get(amount = 32),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Gold,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Silicone.getMolten(720),
            output = ImpactItems.LDPFEHV.get(amount = 32),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.BT6,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.BT6,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Rubber.getMolten(1440),
            output = ImpactItems.LDPFEEV.get(amount = 32),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.BT6,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.BT6,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(1080),
            output = ImpactItems.LDPFEEV.get(amount = 32),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.BT6,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.BT6,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Silicone.getMolten(720),
            output = ImpactItems.LDPFEEV.get(amount = 32),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Platinum,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PolyphenyleneSulfide,
                    count = 10,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.Silicone.getMolten(720),
            output = ImpactItems.LDPFEIV.get(amount = 32),
            ticks = 600,
            eu = 7680,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Platinum,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.PolyvinylChloride,
                    count = 10,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PolyphenyleneSulfide,
                    count = 20,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(1440),
            output = ImpactItems.LDPFEIV.get(amount = 32),
            ticks = 600,
            eu = 7680,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt16,
                    material = Materials.Platinum,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Polydimethylsiloxane,
                    count = 10,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PolyphenyleneSulfide,
                    count = 20,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluidInput = Materials.StyreneButadieneRubber.getMolten(1440),
            output = ImpactItems.LDPFEIV.get(amount = 32),
            ticks = 600,
            eu = 7680,
        )
    }
}
