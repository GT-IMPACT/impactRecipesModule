package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.ProjectRedIlluminationItems
import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ProjectRedLampAssemblyRecipes {

    internal fun register() {
        for (i in 0 until 16) {
            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Iron,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = ProjectRedItems.ProjectredCorePart,
                        meta = 19 + i,
                    ).get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.dust,
                        material = Materials.Redstone,
                        count = 1,
                    ),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluidInput = Materials.Glass.getMolten(216),
                output = ModItemVariant(
                    item = ProjectRedIlluminationItems.ProjectredIlluminationLamp,
                    meta = i,
                ).get(amount = 4),
                ticks = 100,
                eu = 4,
                cleanroom = false,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Iron,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = ProjectRedItems.ProjectredCorePart,
                        meta = 19 + i,
                    ).get(amount = 2),
                    VanillaItems.RedstoneTorch.get(),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluidInput = Materials.Glass.getMolten(216),
                output = ModItemVariant(
                    item = ProjectRedIlluminationItems.ProjectredIlluminationLamp,
                    meta = 16 + i,
                ).get(amount = 4),
                ticks = 100,
                eu = 4,
                cleanroom = false,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Steel,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = ProjectRedItems.ProjectredCorePart,
                        meta = 19 + i,
                    ).get(amount = 4),
                    RecipeItems.ore(
                        prefix = OrePrefixes.dust,
                        material = Materials.Redstone,
                        count = 2,
                    ),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluidInput = Materials.Glass.getMolten(432),
                output = ModItemVariant(
                    item = ProjectRedIlluminationItems.ProjectredIlluminationLamp,
                    meta = i,
                ).get(amount = 8),
                ticks = 120,
                eu = 6,
                cleanroom = false,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Steel,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = ProjectRedItems.ProjectredCorePart,
                        meta = 19 + i,
                    ).get(amount = 4),
                    VanillaItems.RedstoneTorch.get(amount = 2),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluidInput = Materials.Glass.getMolten(432),
                output = ModItemVariant(
                    item = ProjectRedIlluminationItems.ProjectredIlluminationLamp,
                    meta = 16 + i,
                ).get(amount = 8),
                ticks = 120,
                eu = 6,
                cleanroom = false,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Aluminium,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = ProjectRedItems.ProjectredCorePart,
                        meta = 19 + i,
                    ).get(amount = 6),
                    RecipeItems.ore(
                        prefix = OrePrefixes.dust,
                        material = Materials.Redstone,
                        count = 3,
                    ),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluidInput = Materials.Glass.getMolten(648),
                output = ModItemVariant(
                    item = ProjectRedIlluminationItems.ProjectredIlluminationLamp,
                    meta = i,
                ).get(amount = 16),
                ticks = 140,
                eu = 8,
                cleanroom = false,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Aluminium,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = ProjectRedItems.ProjectredCorePart,
                        meta = 19 + i,
                    ).get(amount = 6),
                    VanillaItems.RedstoneTorch.get(amount = 3),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluidInput = Materials.Glass.getMolten(648),
                output = ModItemVariant(
                    item = ProjectRedIlluminationItems.ProjectredIlluminationLamp,
                    meta = 16 + i,
                ).get(amount = 16),
                ticks = 140,
                eu = 8,
                cleanroom = false,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.StainlessSteel,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = ProjectRedItems.ProjectredCorePart,
                        meta = 19 + i,
                    ).get(amount = 8),
                    RecipeItems.ore(
                        prefix = OrePrefixes.dust,
                        material = Materials.Redstone,
                        count = 4,
                    ),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluidInput = Materials.Glass.getMolten(864),
                output = ModItemVariant(
                    item = ProjectRedIlluminationItems.ProjectredIlluminationLamp,
                    meta = i,
                ).get(amount = 32),
                ticks = 160,
                eu = 10,
                cleanroom = false,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.StainlessSteel,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = ProjectRedItems.ProjectredCorePart,
                        meta = 19 + i,
                    ).get(amount = 8),
                    VanillaItems.RedstoneTorch.get(amount = 4),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluidInput = Materials.Glass.getMolten(864),
                output = ModItemVariant(
                    item = ProjectRedIlluminationItems.ProjectredIlluminationLamp,
                    meta = 16 + i,
                ).get(amount = 32),
                ticks = 160,
                eu = 10,
                cleanroom = false,
            )
        }
    }
}
