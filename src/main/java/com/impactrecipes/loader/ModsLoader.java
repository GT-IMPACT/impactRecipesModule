package com.impactrecipes.loader;

import com.impactrecipes.recipes.*;
import com.impactrecipes.recipes.ae2.AE2Registrar;
import com.impactrecipes.recipes.architecturecraft.ArchitectureCraftRegistrar;
import com.impactrecipes.recipes.chickenchunks.ChickenChunksRegistrar;
import com.impactrecipes.recipes.gregtech.GregTechRegistrar;
import com.impactrecipes.recipes.impact.ImpactRegistrar;
import com.impactrecipes.recipes.opencomputers.OpenComputersRegistrar;
import com.impactrecipes.recipes.projectred.ProjectRedRegistrar;
import com.impactrecipes.recipes.stargate.StargateRegistrar;
import com.impactrecipes.recipes.nuclearcontrol.NuclearControlRegistrar;
import com.impactrecipes.recipes.openblocks.OpenBlocksRegistrar;

import static com.impactrecipes.RecipeKotlinKt.recipesInit;
import static com.impactrecipes.util.RecipeUtils.registerRecipeClass;

import cpw.mods.fml.common.Loader;

/**
 * Класс для регистрации всех классов с рецептами
 */
public class ModsLoader {

    public static void loader() {
        if (Loader.isModLoaded("chisel")) ChiselGroup.run();

        new Vanilla().run();
        RecipeRegistrars.register(new GregTechRegistrar());
        RecipeRegistrars.register(new AE2Registrar());
        new AE().run();
        new BuildCraft().run();
        if (Loader.isModLoaded("JABBA")) new Jabba().run();
        RecipeRegistrars.register(new OpenComputersRegistrar());
        if (Loader.isModLoaded("OpenComputers")) new OpenComputers().run();
        if (Loader.isModLoaded("Railcraft")) new RailCraft().run();
        if (Loader.isModLoaded("StevesFactoryManager")) new StevesFactoryManager().run();
        if (Loader.isModLoaded("StorageDrawers")) new StorageDrawers().run();
        if (Loader.isModLoaded("tectech")) new TecTech().run();
        RecipeRegistrars.register(new ProjectRedRegistrar());
        new ProjectRed().run();
        RecipeRegistrars.register(new OpenBlocksRegistrar());
        RecipeRegistrars.register(new ImpactRegistrar());
        new ImpactCore().run();
        new GalaxySpace().run();
        new GalactiCraft().run();
        new IC2().run();
        new ExtraUtilities().run();
        new GraviSuite().run();
        RecipeRegistrars.register(new StargateRegistrar());
        new StarGate().run();
        new Gendustry().run();
        new Ztones().run();
        new Forestry().run();
        new ChestUp().run();
        new LogisticPipes().run();
        new MalisisDoors().run();
        new Backpack().run();
        new BiblioCraft().run();
        RecipeRegistrars.register(new ChickenChunksRegistrar());
        RecipeRegistrars.register(new ArchitectureCraftRegistrar());
        new CarpentersBlocks().run();
        RecipeRegistrars.register(new NuclearControlRegistrar());
        if (Loader.isModLoaded("EnderIO")) new Ender_IO().run();
        new CatWalks().run();
        new UBC().run();
        new ChiselRecipes().run();


        registerRecipeClass(Vanilla.class);
        registerRecipeClass(AE.class);
        registerRecipeClass(BuildCraft.class);
        registerRecipeClass(Jabba.class);
        registerRecipeClass(OpenComputers.class);
        registerRecipeClass(RailCraft.class);
        registerRecipeClass(StevesFactoryManager.class);
        registerRecipeClass(StorageDrawers.class);
        registerRecipeClass(TecTech.class);
        registerRecipeClass(ProjectRed.class);
        registerRecipeClass(ImpactCore.class);
        registerRecipeClass(GalaxySpace.class);
        registerRecipeClass(GalactiCraft.class);
        registerRecipeClass(IC2.class);
        registerRecipeClass(ExtraUtilities.class);
        registerRecipeClass(GraviSuite.class);
        registerRecipeClass(StarGate.class);
        registerRecipeClass(Gendustry.class);
        registerRecipeClass(Ztones.class);
        registerRecipeClass(Forestry.class);
        registerRecipeClass(ChestUp.class);
        registerRecipeClass(LogisticPipes.class);
        registerRecipeClass(MalisisDoors.class);
        registerRecipeClass(Backpack.class);
        registerRecipeClass(BiblioCraft.class);
        registerRecipeClass(CarpentersBlocks.class);
        registerRecipeClass(Ender_IO.class);
        registerRecipeClass(CatWalks.class);
        registerRecipeClass(UBC.class);
        registerRecipeClass(ChiselRecipes.class);
    
        recipesInit();
    }
}
