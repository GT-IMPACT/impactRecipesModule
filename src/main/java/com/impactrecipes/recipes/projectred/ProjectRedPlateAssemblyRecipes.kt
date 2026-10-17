package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.items.ProjectRedTransmissionItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ProjectRedPlateAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = ProjectRedItems.ProjectredCorePart.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = Materials.Redstone.getMolten(144),
            output = ProjectRedItems.ProjectredCorePart1.get(),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = ProjectRedItems.ProjectredCorePart.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.wireGt01,
                material = Materials.RedAlloy,
                count = 1,
            ),
            output = ProjectRedItems.ProjectredCorePart2.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = ProjectRedItems.ProjectredCorePart.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Redstone,
                count = 1,
            ),
            output = ProjectRedItems.ProjectredCorePart4.get(),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = ProjectRedItems.ProjectredCorePart.get(),
            secondaryInput = VanillaItems.RedstoneTorch.get(),
            output = ProjectRedItems.Silicon.get(),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = ProjectRedItems.Silicon.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.lens,
                material = Materials.Ruby,
                count = 1,
            ),
            output = ProjectRedItems.RedSilicon.get(),
            ticks = 500,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = ProjectRedItems.ProjectredCorePart2.get(amount = 4),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Plastic,
                count = 4,
            ),
            output = ProjectRedItems.ProjectredCorePart9.get(),
            ticks = 300,
            eu = 60,
        )

        for (i in 17 until 34) {
            MachineRecipes.assembler(
                input = ProjectRedItems.ProjectredCorePart.get(),
                secondaryInput = ModItemVariant(
                    item = ProjectRedTransmissionItems.RedAlloyWire,
                    meta = i,
                ).get(),
                output = ProjectRedItems.ProjectredCorePart3.get(),
                ticks = 400,
                eu = 30,
            )
        }
    }
}
