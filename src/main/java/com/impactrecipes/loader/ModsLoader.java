package com.impactrecipes.loader;

import com.impactrecipes.recipes.*;

import static com.impactrecipes.util.RecipeUtils.registerRecipeClass;
import static com.impactrecipes.core.Reference.*;

/**
 * Класс для регистрации всех классов с рецептами
 */
public class ModsLoader {
    public static void loader() {
        //GregTech
        registerRecipeClass(GREGTECH, new Gregtech());
        registerRecipeClass(AE2, new AE());
        registerRecipeClass(BUILDCRAFT, new BuildCraft());
        registerRecipeClass(ENDERIO, new EnderIO());
        registerRecipeClass(JABBA, new Jabba());
        registerRecipeClass(OC, new OpenComputers());
        registerRecipeClass(RAILCRAFT, new RailCraft());
        registerRecipeClass(SFM, new StevesFactoryManager());
        registerRecipeClass(SD, new StorageDrawers());
        registerRecipeClass(TICO, new TConstruct());
        registerRecipeClass(TECTECH, new TecTech());
    }
}
