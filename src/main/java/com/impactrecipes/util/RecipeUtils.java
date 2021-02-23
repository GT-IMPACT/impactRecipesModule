package com.impactrecipes.util;

import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.GregTech_API;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static cpw.mods.fml.common.Loader.isModLoaded;

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
}
