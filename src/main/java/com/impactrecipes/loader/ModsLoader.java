package com.impactrecipes.loader;

import com.impactrecipes.recipes.*;
import gregtech.api.commands.RecipesReload;

import static com.impactrecipes.util.RecipeUtils.registerRecipeClass;
import static com.impactrecipes.core.Reference.*;

/**
 * Класс для регистрации всех классов с рецептами
 */
public class ModsLoader {

    static {
        RecipesReload.classMap.put("Gregtech", Gregtech.class);
        RecipesReload.classMap.put("AE", AE.class);
        RecipesReload.classMap.put("BuildCraft", BuildCraft.class);
        RecipesReload.classMap.put("EnderIO", EnderIO.class);
        RecipesReload.classMap.put("Jabba", Jabba.class);
        RecipesReload.classMap.put("OpenComputers", OpenComputers.class);
        RecipesReload.classMap.put("RailCraft", RailCraft.class);
        RecipesReload.classMap.put("StevesFactoryManager", StevesFactoryManager.class);
        RecipesReload.classMap.put("StorageDrawers", StorageDrawers.class);
        RecipesReload.classMap.put("TConstruct", TConstruct.class);
        RecipesReload.classMap.put("TecTech", TecTech.class);
        RecipesReload.classMap.put("ProjectRed", ProjectRed.class);
        RecipesReload.classMap.put("OpenBlocks", OpenBlocks.class);
        RecipesReload.classMap.put("PracticalLogistics", PracticalLogistics.class);
    }

    public static void loader() {
        ChiselGroup.run();
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
        registerRecipeClass(PROJECTRED, new ProjectRed());
        registerRecipeClass(OPENBLOCKS, new OpenBlocks());
        registerRecipeClass(PL, new PracticalLogistics());

    }
}
