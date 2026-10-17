package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechGemRecipes {

    internal fun sifting() {
        // --- Zircon
        MachineRecipes.sifter(
            input = Materials.Cassiterite.item(OrePrefixes.crushedPurified).get(),
            outputs = arrayOf<ItemStack?>(
                Materials.Cassiterite.item(OrePrefixes.dust).get(),
                Materials.Cassiterite.item(OrePrefixes.dust).get(),
                Materials.Cassiterite.item(OrePrefixes.dust).get(),
                ImpactItems.Zircon.get(),
                ImpactItems.Zircon.get(),
                ImpactItems.Zircon.get(),
            ),
            chances = intArrayOf(
                6000,
                3000,
                1000,
                5000,
                3000,
                1000,
            ),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.sifter(
            input = Materials.RareEarth.item(OrePrefixes.dust).get(),
            outputs = arrayOf<ItemStack?>(
                Materials.Neodymium.item(OrePrefixes.dust).get(),
                Materials.Yttrium.item(OrePrefixes.dust).get(),
                Materials.Lanthanum.item(OrePrefixes.dust).get(),
                Materials.Cerium.item(OrePrefixes.dust).get(),
                Materials.Cadmium.item(OrePrefixes.dust).get(),
                Materials.Caesium.item(OrePrefixes.dust).get(),
                Materials.Strontium.item(OrePrefixes.dust).get(),
                Materials.Samarium.item(OrePrefixes.dust).get(),
                Materials.Gadolinium.item(OrePrefixes.dust).get(),
            ),
            chances = intArrayOf(
                600,
                600,
                600,
                600,
                600,
                600,
                400,
                200,
                100,
            ),
            ticks = 160,
            eu = 480,
        )
    }

    internal fun implosion() {
        // --- Amethyst
        MachineRecipes.implosionCompressor(
            input = Materials.Amethyst.item(OrePrefixes.dust).get(amount = 4),
            secondaryInput = 24,
            output = Materials.Amethyst.item(OrePrefixes.gem).get(amount = 3),
            secondaryOutput = Materials.DarkAshes.item(OrePrefixes.dust).get(amount = 2),
            chances = intArrayOf(
                10000,
                10000,
            ),
        )
    }
}
