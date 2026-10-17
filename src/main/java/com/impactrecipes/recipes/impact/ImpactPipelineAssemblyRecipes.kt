package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactPipelineAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.Steel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Steel,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Tin.getMolten(144),
            output = ImpactItems.LongDistancePipelineFluid.get(amount = 2),
            ticks = 300,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.Tin,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Steel,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Tin.getMolten(144),
            output = ImpactItems.LongDistancePipelineItem.get(amount = 2),
            ticks = 300,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Steel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 9,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluid = Materials.Tin.getMolten(144),
            output = ImpactItems.LongDistancePipelineFluidPipe.get(amount = 64),
            ticks = 600,
            eu = 24,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Tin,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 9,
                ),
                GT_Utility.getIntegratedCircuit(24),
            ),
            fluid = Materials.Tin.getMolten(144),
            output = ImpactItems.LongDistancePipelineItemPipe.get(amount = 64),
            ticks = 600,
            eu = 24,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLV.get(),
                GregTechItems.LVCoil.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Tin,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.LDPELV.get(amount = 2),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullMV.get(),
                GregTechItems.MVCoil.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Birmabright,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Copper,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.LDPEMV.get(amount = 2),
            ticks = 150,
            eu = 64,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullHV.get(),
                GregTechItems.HVCoil.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Gold,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.LDPEHV.get(amount = 2),
            ticks = 150,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.EVCoil.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.BT6,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Aluminium,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.LDPEEV.get(amount = 2),
            ticks = 150,
            eu = 1024,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                GregTechItems.IVCoil.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Platinum,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.LDPEIV.get(amount = 2),
            ticks = 150,
            eu = 4096,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.BlockMagneticCoil.get(),
                IC2Items.ReinforcedGlass.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Trinium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.TungstenSteel,
                    count = 20,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.TungstenSteel,
                    count = 20,
                ),
                GregTechItems.FieldGeneratorIV.get(),
            ),
            fluid = null,
            output = ImpactItems.InsideBlock5.get(),
            ticks = 400,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.GlassPane.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Cobalt,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicon,
                    count = 8,
                ),
            ),
            fluid = null,
            output = ImpactItems.LargeScreen.get(),
            ticks = 200,
            eu = 8,
        )
    }
}
