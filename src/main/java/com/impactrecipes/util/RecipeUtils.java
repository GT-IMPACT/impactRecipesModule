package com.impactrecipes.util;

import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.GregTech_API;
import gregtech.api.enums.GT_Values;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static cpw.mods.fml.common.Loader.*;
import static gregtech.api.util.GT_ModHandler.*;

/**
 * Как ни странно, класс для каких-либо утилит
 */
public class RecipeUtils {

    /**
     * @param isMod - проверка загрузки мода
     * @param loader - класс с рецептами
     */
    public static void registerRecipeClass(String isMod, Runnable loader) {
        if (isModLoaded(isMod)) { loader.run(); }
    }

    /**
     * @param oredict - ордикт
     * @param amount - количество
     * @return ItemStack
     */
    public static ItemStack ordictItemStack(String oredict, int amount) {
        return GregTech_API.getStackofAmountFromOreDict(oredict, amount);
    }

    /**
     * @param oredict - ордикт
     * @return ItemStack
     * По умолчанию выдает количество = 1
     */
    public static ItemStack ordictItemStack(String oredict) {
        return GregTech_API.getStackofAmountFromOreDict(oredict, 1);
    }

    /**
     * @param modid - ID / название мода
     * @param nameItem - наименование предмета
     * @param amount - количество
     * @param meta - метадата предмета
     * @return ItemStack
     */
    public static ItemStack getItemStack(String modid, String nameItem, int amount, int meta) {
        return new ItemStack(GameRegistry.findItem(modid, nameItem), amount, meta);
    }

    /**
     * @param modid - ID / название мода
     * @param nameItem - наименование предмета
     * @param amount - количество
     * @return ItemStack
     */
    public static ItemStack getItemStack(String modid, String nameItem, int amount) {
       return getItemStack(modid, nameItem, amount, 0);
    }

    /**
     * @param modid - ID / название мода
     * @param nameItem - наименование предмета
     * @return ItemStack
     */
    public static ItemStack getItemStack(String modid, String nameItem) {
        return getItemStack(modid, nameItem, 1);
    }

    /**
     * @param modid - ID / название мода
     * @param nameItem - наименование предмета
     * @param amount - количество
     * @return ItemStack
     */
    public static ItemStack getChargeItemStack(String modid, String nameItem, int amount) {
        return getModItem(modid, nameItem, amount, GT_Values.W);
    }

    /**
     * @param modid - ID / название мода
     * @param nameItem - наименование предмета
     * @return ItemStack
     */
    public static ItemStack getChargeItemStack(String modid, String nameItem) {
        return getModItem(modid, nameItem, 1, GT_Values.W);
    }

    /**
     * @param is - ItemStack Output Recipe
     */
    public static void removeRecipeByOutput(ItemStack is) {
        removeRecipeByOutput(is, false);
    }

    /**
     * @param is - ItemStack Output Recipe
     * @param checkStack - boolean for check amount items
     */
    public static void removeRecipeByOutput(ItemStack is, boolean checkStack) {
        Iterator<IRecipe> removerRecipes = CraftingManager.getInstance().getRecipeList().iterator();
        while (removerRecipes.hasNext()) {
            ItemStack itemStack = removerRecipes.next().getRecipeOutput();
            if (checkStack) {
                if (itemStack != null && itemStack.getItem() == is.getItem() && itemStack.stackSize == is.stackSize) {
                    removerRecipes.remove();
                }
            } else {
                if (itemStack != null && itemStack.getItem() == is.getItem()) {
                    removerRecipes.remove();
                }
            }
        }
    }
}
