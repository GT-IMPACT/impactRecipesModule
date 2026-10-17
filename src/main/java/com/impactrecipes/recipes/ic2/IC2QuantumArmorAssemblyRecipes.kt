package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GraviSuiteItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import cpw.mods.fml.common.Loader
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2QuantumArmorAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = ModItemVariant(
                item = IC2Items.NanoBoots,
                meta = GT_Values.W.toInt(),
            ).get(),
            secondaryInput = ImpactItems.IridiumAlloyItemCasing.get(amount = 4),
            output = ImpactItems.QuantumPartBoots.get(),
            ticks = 1200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = if (Loader.isModLoaded("GraviSuite")) {
                ModItemVariant(
                    item = GraviSuiteItems.AdvNanoChestPlate,
                    meta = GT_Values.W.toInt(),
                ).get()
            } else {
                ModItemVariant(
                    item = IC2Items.NanoChestplate,
                    meta = GT_Values.W.toInt(),
                ).get()
            },
            secondaryInput = ImpactItems.IridiumAlloyItemCasing.get(amount = 8),
            output = ImpactItems.QuantumPartChestplate.get(),
            ticks = 1200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = ModItemVariant(
                item = IC2Items.NanoHelmet,
                meta = GT_Values.W.toInt(),
            ).get(),
            secondaryInput = ImpactItems.IridiumAlloyItemCasing.get(amount = 5),
            output = ImpactItems.QuantumPartHelmetEmpty.get(),
            ticks = 1200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = ImpactItems.QuantumPartHelmetEmpty.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.lens,
                material = Materials.ReinforcedGlass,
                count = 8,
            ),
            output = ImpactItems.QuantumPartHelmet.get(),
            ticks = 1200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = ModItemVariant(
                item = IC2Items.NanoLeggings,
                meta = GT_Values.W.toInt(),
            ).get(),
            secondaryInput = ImpactItems.IridiumAlloyItemCasing.get(amount = 7),
            output = ImpactItems.QuantumPartLeggings.get(),
            ticks = 1200,
            eu = 1920,
        )
    }
}
