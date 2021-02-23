package com.impactrecipes.loader;

import com.impactrecipes.recipes.Gregtech;

import static com.impactrecipes.util.RecipeUtils.registerRecipeClass;
import static com.impactrecipes.core.Reference.*;

/**
 * Класс для регистрации всех классов с рецептами
 */
public class ModsLoader {
    public static void loader() {
        //GregTech
        registerRecipeClass(GREGTECH, new Gregtech());

        //Mod Name

    }
}
