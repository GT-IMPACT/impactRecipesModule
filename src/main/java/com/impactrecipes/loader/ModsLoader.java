package com.impactrecipes.loader;

import com.impactrecipes.recipes.*;

import static com.impactrecipes.util.RecipeUtils.registerRecipeClass;
import static com.impactrecipes.core.Reference.*;

/**
 * Класс для регистрации всех классов с рецептами
 */
public class ModsLoader {

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
        registerRecipeClass(IMPACT, new ImpactCore());
        registerRecipeClass(GALAXYSPACE, new GalaxySpace());
        registerRecipeClass(GALACTICRAFT, new GalactiCraft());
        registerRecipeClass(IC2, new IC2());
        registerRecipeClass(EU, new ExtraUtilities());
        registerRecipeClass(GRAVISUITE, new GraviSuite());
        registerRecipeClass(SG, new StarGate());
        registerRecipeClass(GENDUSTRY, new Gendustry());
        registerRecipeClass(ZTONES, new Ztones());
        registerRecipeClass(FORESTRY, new Forestry());
        registerRecipeClass(CHESTUP, new ChestUp());
        registerRecipeClass(LP, new LogisticPipes());
        registerRecipeClass(MDOORS, new MalisisDoors());
        registerRecipeClass(BACKPACK, new Backpack());
        registerRecipeClass(BIBLIO, new BiblioCraft());
        registerRecipeClass(CHICKENS, new ChickenChunks());
        new NEED_TODO().run();
    }
}
