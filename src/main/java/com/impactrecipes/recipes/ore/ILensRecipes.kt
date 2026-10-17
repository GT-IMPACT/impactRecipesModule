package com.impactrecipes.recipes.ore

import com.impactrecipes.loader.IOreRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

public interface ILensRecipes : IOreRecipes {

    public override val prefix: OrePrefixes
        get() {
            return OrePrefixes.crafting
        }

    public override fun registerOre(
        prefix: OrePrefixes,
        material: Materials,
        oreDictName: String,
        modName: String,
        stack: ItemStack,
    ) {
        if (prefix != this.prefix) {
            return
        }

        val lens = CraftingLens.fromOreDictName(oreDictName) ?: return
        when (lens) {
            CraftingLens.Red -> {
                red(stack)
            }
            CraftingLens.Green -> {
                green(stack)
            }
            CraftingLens.White -> {
                white(stack)
            }
            CraftingLens.Yellow -> {
                yellow(stack)
            }
            CraftingLens.Blue -> {
                blue(stack)
            }
            CraftingLens.Purple -> {
                purple(stack)
            }
        }
    }

    public fun red(stack: ItemStack) {}

    public fun green(stack: ItemStack) {}

    public fun white(stack: ItemStack) {}

    public fun yellow(stack: ItemStack) {}

    public fun blue(stack: ItemStack) {}

    public fun purple(stack: ItemStack) {}
}
