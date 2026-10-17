package com.impactrecipes.recipes.ztones

import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.ZtonesItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_OreDictUnificator
import gregtech.api.util.GT_Utility
import net.minecraft.item.ItemStack
import net.minecraftforge.oredict.OreDictionary

internal class ZtonesBaseAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.StoneSlab.get(amount = 8),
            secondaryInput = VanillaItems.Stone.get(),
            output = ZtonesItems.StoneTile.get(amount = 8),
            ticks = 160,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.StoneSlab.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Iron,
                count = 1,
            ),
            output = ZtonesItems.StoneTile.get(amount = 16),
            ticks = 140,
            eu = 6,
        )

        MachineRecipes.assembler(
            input = VanillaItems.StoneSlab.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Steel,
                count = 1,
            ),
            output = ZtonesItems.StoneTile.get(amount = 32),
            ticks = 120,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = VanillaItems.StoneSlab.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Aluminium,
                count = 1,
            ),
            output = ZtonesItems.StoneTile.get(amount = 64),
            ticks = 100,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Sand.get(amount = 4),
            secondaryInput = VanillaItems.Dirt.get(amount = 4),
            fluidInput = Materials.SeedOil.getFluid(5),
            output = ZtonesItems.CleanDirt.get(amount = 8),
            ticks = 160,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.StonePressurePlate.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = Materials.Blaze.getMolten(8),
            output = ZtonesItems.Booster.get(),
            ticks = 100,
            eu = 30,
        )

        registerAurora()
    }

    private fun registerAurora() {
        val registeredDyes = ArrayList<ItemStack>()
        // Register wildcard entries first so they also cover their concrete metadata variants.
        val dyes = OreDictionary.getOres("dye").sortedBy {
            it.itemDamage != OreDictionary.WILDCARD_VALUE
        }
        for (dye in dyes) {
            val alreadyRegistered = registeredDyes.any {
                GT_Utility.areUnificationsEqual(
                    dye,
                    it,
                    true,
                ) || GT_Utility.areUnificationsEqual(
                    GT_OreDictUnificator.get(
                        false,
                        dye,
                    ),
                    it,
                    true,
                )
            }
            if (alreadyRegistered) {
                continue
            }

            MachineRecipes.assembler(
                input = VanillaItems.Glass.get(amount = 4),
                secondaryInput = dye,
                output = ZtonesItems.Aurora.get(amount = 8),
                ticks = 160,
                eu = 4,
            )
            registeredDyes.add(dye)
        }
    }
}
