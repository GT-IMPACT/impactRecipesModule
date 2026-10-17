package com.impactrecipes.recipes.storagedrawers

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.StorageDrawersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class DrawerWoodAssemblyRecipes {

    internal fun register() {
        for (i in 0 until 6) {
            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = StorageDrawersItems.Trim,
                        meta = i,
                    ).get(),
                    VanillaItems.Chest.get(),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.FullDrawer,
                    meta = i,
                ).get(),
                ticks = 100,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = StorageDrawersItems.Trim,
                        meta = i,
                    ).get(),
                    VanillaItems.Chest.get(amount = 2),
                    GT_Utility.getIntegratedCircuit(2),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.FullDoubleDrawer,
                    meta = i,
                ).get(amount = 2),
                ticks = 100,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = StorageDrawersItems.Trim,
                        meta = i,
                    ).get(),
                    VanillaItems.Chest.get(amount = 4),
                    GT_Utility.getIntegratedCircuit(4),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.FullQuadDrawer,
                    meta = i,
                ).get(amount = 4),
                ticks = 100,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = StorageDrawersItems.Trim,
                        meta = i,
                    ).get(),
                    VanillaItems.Chest.get(amount = 2),
                    GT_Utility.getIntegratedCircuit(3),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.HalfDoubleDrawer,
                    meta = i,
                ).get(amount = 2),
                ticks = 100,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = StorageDrawersItems.Trim,
                        meta = i,
                    ).get(),
                    VanillaItems.Chest.get(amount = 4),
                    GT_Utility.getIntegratedCircuit(6),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.HalfQuadDrawer,
                    meta = i,
                ).get(amount = 4),
                ticks = 100,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Wood,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.Trim,
                    meta = i,
                ).get(),
                ticks = 100,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Iron,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(amount = 2),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.Trim,
                    meta = i,
                ).get(amount = 2),
                ticks = 100,
                eu = 10,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Bronze,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(amount = 2),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.Trim,
                    meta = i,
                ).get(amount = 2),
                ticks = 100,
                eu = 10,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Steel,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(amount = 4),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.Trim,
                    meta = i,
                ).get(amount = 4),
                ticks = 100,
                eu = 12,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.Aluminium,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(amount = 8),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.Trim,
                    meta = i,
                ).get(amount = 8),
                ticks = 100,
                eu = 16,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    RecipeItems.ore(
                        prefix = OrePrefixes.frameGt,
                        material = Materials.StainlessSteel,
                        count = 1,
                    ),
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(amount = 16),
                    GT_Utility.getIntegratedCircuit(1),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = StorageDrawersItems.Trim,
                    meta = i,
                ).get(amount = 16),
                ticks = 100,
                eu = 24,
            )
        }
    }
}
