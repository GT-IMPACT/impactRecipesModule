package com.impactrecipes.recipes;

import com.impact.mods.GregTech.GT_ItemList;
import gregtech.api.GregTech_API;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.common.items.ItemDebug;
import net.minecraft.item.ItemStack;

/**
 * Runnable во всех классах обязателен!
 */
public class Gregtech implements Runnable {

    @Override
    public void run() {
        handRecipe();
        assemblerRecipe();
    }

    //Рецепты ручные
    public void handRecipe() {
        //TODO | удалишь, это для проверки работы метода регистрации класса
        ItemStack is = new ItemStack(ItemDebug.getInstance(), 1);
        final Object[] mk3_recipe = {
                "CCC", "   ", "CCC",
                'C', is
        };
        GT_ModHandler.addCraftingRecipe(is, mk3_recipe);
    }

    //Рецепты в Ассемблере
    public void assemblerRecipe() {

    }
}
