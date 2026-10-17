package com.impactrecipes.loader;

import com.impactrecipes.recipes.*;
import com.impactrecipes.recipes.ae2.AE2Registrar;
import com.impactrecipes.recipes.architecturecraft.ArchitectureCraftRegistrar;
import com.impactrecipes.recipes.backpack.BackpackRegistrar;
import com.impactrecipes.recipes.bibliocraft.BiblioCraftRegistrar;
import com.impactrecipes.recipes.chickenchunks.ChickenChunksRegistrar;
import com.impactrecipes.recipes.chestup.ChestUpRegistrar;
import com.impactrecipes.recipes.chisel.ChiselRegistrar;
import com.impactrecipes.recipes.catwalks.CatwalksRegistrar;
import com.impactrecipes.recipes.carpentersblocks.CarpentersBlocksRegistrar;
import com.impactrecipes.recipes.gregtech.GregTechRegistrar;
import com.impactrecipes.recipes.gendustry.GendustryRegistrar;
import com.impactrecipes.recipes.impact.ImpactRegistrar;
import com.impactrecipes.recipes.opencomputers.OpenComputersRegistrar;
import com.impactrecipes.recipes.projectred.ProjectRedRegistrar;
import com.impactrecipes.recipes.stargate.StargateRegistrar;
import com.impactrecipes.recipes.stevesfactorymanager.StevesFactoryManagerRegistrar;
import com.impactrecipes.recipes.undergroundbiomes.UndergroundBiomesRegistrar;
import com.impactrecipes.recipes.ztones.ZtonesRegistrar;
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
        RecipeRegistrars.register(new StevesFactoryManagerRegistrar());
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
        RecipeRegistrars.register(new GendustryRegistrar());
        RecipeRegistrars.register(new ZtonesRegistrar());
        new Forestry().run();
        RecipeRegistrars.register(new ChestUpRegistrar());
        new LogisticPipes().run();
        new MalisisDoors().run();
        RecipeRegistrars.register(new BackpackRegistrar());
        RecipeRegistrars.register(new BiblioCraftRegistrar());
        RecipeRegistrars.register(new ChickenChunksRegistrar());
        RecipeRegistrars.register(new ArchitectureCraftRegistrar());
        RecipeRegistrars.register(new CarpentersBlocksRegistrar());
        RecipeRegistrars.register(new NuclearControlRegistrar());
        if (Loader.isModLoaded("EnderIO")) new Ender_IO().run();
        RecipeRegistrars.register(new CatwalksRegistrar());
        RecipeRegistrars.register(new UndergroundBiomesRegistrar());
        RecipeRegistrars.register(new ChiselRegistrar());


        registerRecipeClass(Vanilla.class);
        registerRecipeClass(AE.class);
        registerRecipeClass(BuildCraft.class);
        registerRecipeClass(Jabba.class);
        registerRecipeClass(OpenComputers.class);
        registerRecipeClass(RailCraft.class);
        registerRecipeClass(StorageDrawers.class);
        registerRecipeClass(TecTech.class);
        registerRecipeClass(ProjectRed.class);
        registerRecipeClass(ImpactCore.class);
        registerRecipeClass(GalaxySpace.class);
        registerRecipeClass(GalactiCraft.class);
        registerRecipeClass(IC2.class);
        registerRecipeClass(ExtraUtilities.class);
        registerRecipeClass(GraviSuite.class);
        registerRecipeClass(Forestry.class);
        registerRecipeClass(LogisticPipes.class);
        registerRecipeClass(MalisisDoors.class);
        registerRecipeClass(Ender_IO.class);
    
        recipesInit();
    }
}
