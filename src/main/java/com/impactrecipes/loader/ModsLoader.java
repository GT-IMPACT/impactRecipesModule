package com.impactrecipes.loader;

import com.impactrecipes.recipes.*;
import gregtech.api.GregTech_API;

import static com.impactrecipes.util.RecipeUtils.registerRecipeClass;
import static com.impactrecipes.core.Reference.*;
import static cpw.mods.fml.common.Loader.isModLoaded;

/**
 * Класс для регистрации всех классов с рецептами
 */
public class ModsLoader {

    public static void loader() {
        ChiselGroup.run();

        registerRecipeClass(new RemoveRecipes());

        registerRecipeClass(new Vanilla());
        GregTech_API.sAfterGTPostload.add(() -> new Vanilla().run());

        if (isModLoaded(GREGTECH)) {
            registerRecipeClass(new Gregtech());
            GregTech_API.sAfterGTPostload.add(() -> new Gregtech().run());
        }

        if (isModLoaded(AE2)) {
            registerRecipeClass(new AE());
            GregTech_API.sAfterGTPostload.add(() -> new AE().run());
        }

        if (isModLoaded(BUILDCRAFT)) {
            registerRecipeClass(new BuildCraft());
            GregTech_API.sAfterGTPostload.add(() -> new BuildCraft().run());
        }

        if (isModLoaded(ENDERIO)) {
            registerRecipeClass(new EnderIO());
            GregTech_API.sAfterGTPostload.add(EnderIO::new);
        }

        if (isModLoaded(JABBA)) {
            registerRecipeClass(new Jabba());
            GregTech_API.sAfterGTPostload.add(() -> new Jabba().run());
        }

        if (isModLoaded(OC)) {
            registerRecipeClass(new OpenComputers());
            GregTech_API.sAfterGTPostload.add(() -> new OpenComputers().run());
        }

        if (isModLoaded(RAILCRAFT)) {
            registerRecipeClass(new RailCraft());
            GregTech_API.sAfterGTPostload.add(() -> new RailCraft().run());
        }

        if (isModLoaded(SFM)) {
            registerRecipeClass(new StevesFactoryManager());
            GregTech_API.sAfterGTPostload.add(() -> new StevesFactoryManager().run());
        }

        if (isModLoaded(SD)) {
            registerRecipeClass(new StorageDrawers());
            GregTech_API.sAfterGTPostload.add(() -> new StorageDrawers().run());
        }

        if (isModLoaded(TICO)) {
            registerRecipeClass(new TConstruct());
            GregTech_API.sAfterGTPostload.add(() -> new TConstruct().run());
        }

        if (isModLoaded(TECTECH)) {
            registerRecipeClass(new TecTech());
            GregTech_API.sAfterGTPostload.add(() -> new TecTech().run());
        }

        if (isModLoaded(PROJECTRED)) {
            registerRecipeClass(new ProjectRed());
            GregTech_API.sAfterGTPostload.add(() -> new ProjectRed().run());
        }

        if (isModLoaded(OPENBLOCKS)) {
            registerRecipeClass(new OpenBlocks());
            GregTech_API.sAfterGTPostload.add(() -> new OpenBlocks().run());
        }

        if (isModLoaded(PL)) {
            registerRecipeClass(new PracticalLogistics());
            GregTech_API.sAfterGTPostload.add(() -> new PracticalLogistics().run());
        }

        if (isModLoaded(IMPACT)) {
            registerRecipeClass(new ImpactCore());
            GregTech_API.sAfterGTPostload.add(() -> new ImpactCore().run());
        }

        if (isModLoaded(GALAXYSPACE)) {
            registerRecipeClass(new GalaxySpace());
            GregTech_API.sAfterGTPostload.add(() -> new GalaxySpace().run());
        }

        if (isModLoaded(GALACTICRAFT)) {
            registerRecipeClass(new GalactiCraft());
            GregTech_API.sAfterGTPostload.add(() -> new GalactiCraft().run());
        }

        if (isModLoaded(IC2)) {
            registerRecipeClass(new IC2());
            GregTech_API.sAfterGTPostload.add(() -> new IC2().run());
        }

        if (isModLoaded(EU)) {
            registerRecipeClass(new ExtraUtilities());
            GregTech_API.sAfterGTPostload.add(() -> new ExtraUtilities().run());
        }

        if (isModLoaded(GRAVISUITE)) {
            registerRecipeClass(new GraviSuite());
            GregTech_API.sAfterGTPostload.add(() -> new GraviSuite().run());
        }

        if (isModLoaded(SG)) {
            registerRecipeClass(new StarGate());
            GregTech_API.sAfterGTPostload.add(() -> new StarGate().run());
        }

        if (isModLoaded(GENDUSTRY)) {
            registerRecipeClass(new Gendustry());
            GregTech_API.sAfterGTPostload.add(() -> new Gendustry().run());
        }

        if (isModLoaded(ZTONES)) {
            registerRecipeClass(new Ztones());
            GregTech_API.sAfterGTPostload.add(() -> new Ztones().run());
        }

        if (isModLoaded(FORESTRY)) {
            registerRecipeClass(new Forestry());
            GregTech_API.sAfterGTPostload.add(() -> new Forestry().run());
        }

        if (isModLoaded(CHESTUP)) {
            registerRecipeClass(new ChestUp());
            GregTech_API.sAfterGTPostload.add(() -> new ChestUp().run());
        }

        if (isModLoaded(LP)) {
            registerRecipeClass(new LogisticPipes());
            GregTech_API.sAfterGTPostload.add(() -> new LogisticPipes().run());
        }

        if (isModLoaded(MDOORS)) {
            registerRecipeClass(new MalisisDoors());
            GregTech_API.sAfterGTPostload.add(() -> new MalisisDoors().run());
        }

        if (isModLoaded(BACKPACK)) {
            registerRecipeClass(new Backpack());
            GregTech_API.sAfterGTPostload.add(() -> new Backpack().run());
        }

        if (isModLoaded(BIBLIO)) {
            registerRecipeClass(new BiblioCraft());
            GregTech_API.sAfterGTPostload.add(() -> new BiblioCraft().run());
        }

        if (isModLoaded(CHICKENS)) {
            registerRecipeClass(new ChickenChunks());
            GregTech_API.sAfterGTPostload.add(() -> new ChickenChunks().run());
        }

        if (isModLoaded(ARCHITEC)) {
            registerRecipeClass(new ArchitectureCraft());
            GregTech_API.sAfterGTPostload.add(() -> new ArchitectureCraft().run());
        }

        if (isModLoaded(CARPENTERS)) {
            registerRecipeClass(new CarpentersBlocks());
            GregTech_API.sAfterGTPostload.add(() -> new CarpentersBlocks().run());
        }

        if (isModLoaded(NUCLEARCONTROL)) {
            registerRecipeClass(new NuclearControl());
            GregTech_API.sAfterGTPostload.add(() -> new NuclearControl().run());
        }
    }
}
