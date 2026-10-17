package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes

internal class IC2NanoArmorAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = ImpactItems.CarbonPartHelmetNightVision.get(),
            secondaryInput = ImpactItems.NanoCrystal.get(),
            output = ModItemVariant(
                item = IC2Items.NanoHelmet,
                meta = 27,
            ).get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = ImpactItems.CarbonPartChestplate.get(),
            secondaryInput = ImpactItems.NanoCrystal.get(),
            output = ModItemVariant(
                item = IC2Items.NanoChestplate,
                meta = 27,
            ).get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = ImpactItems.CarbonPartLeggings.get(),
            secondaryInput = ImpactItems.NanoCrystal.get(),
            output = ModItemVariant(
                item = IC2Items.NanoLeggings,
                meta = 27,
            ).get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = ImpactItems.CarbonPartBoots.get(),
            secondaryInput = ImpactItems.NanoCrystal.get(),
            output = ModItemVariant(
                item = IC2Items.NanoBoots,
                meta = 27,
            ).get(),
            ticks = 400,
            eu = 120,
        )
    }
}
