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
import com.impactrecipes.recipes.forestry.ForestryRegistrar;
import com.impactrecipes.recipes.gravisuite.GraviSuiteRegistrar;
import com.impactrecipes.recipes.galaxyspace.GalaxySpaceRegistrar;
import com.impactrecipes.recipes.galacticraft.GalacticraftRegistrar;
import com.impactrecipes.recipes.tectech.TecTechRegistrar;
import com.impactrecipes.recipes.vanilla.VanillaRegistrar;
import com.impactrecipes.recipes.malisisdoors.MalisisDoorsRegistrar;
import com.impactrecipes.recipes.logisticspipes.LogisticsPipesRegistrar;
import com.impactrecipes.recipes.buildcraft.BuildCraftRegistrar;
import com.impactrecipes.recipes.enderio.EnderIORegistrar;
import com.impactrecipes.recipes.extrautilities.ExtraUtilitiesRegistrar;
import com.impactrecipes.recipes.jabba.JabbaRegistrar;
import com.impactrecipes.recipes.storagedrawers.StorageDrawersRegistrar;
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

        RecipeRegistrars.register(new VanillaRegistrar());
        RecipeRegistrars.register(new GregTechRegistrar());
        RecipeRegistrars.register(new AE2Registrar());
        new AE().run();
        RecipeRegistrars.register(new BuildCraftRegistrar());
        RecipeRegistrars.register(new JabbaRegistrar());
        RecipeRegistrars.register(new OpenComputersRegistrar());
        if (Loader.isModLoaded("OpenComputers")) new OpenComputers().run();
        if (Loader.isModLoaded("Railcraft")) new RailCraft().run();
        RecipeRegistrars.register(new StevesFactoryManagerRegistrar());
        RecipeRegistrars.register(new StorageDrawersRegistrar());
        RecipeRegistrars.register(new TecTechRegistrar());
        RecipeRegistrars.register(new ProjectRedRegistrar());
        RecipeRegistrars.register(new OpenBlocksRegistrar());
        RecipeRegistrars.register(new ImpactRegistrar());
        new ImpactCore().run();
        RecipeRegistrars.register(new GalaxySpaceRegistrar());
        RecipeRegistrars.register(new GalacticraftRegistrar());
        new IC2().run();
        RecipeRegistrars.register(new ExtraUtilitiesRegistrar());
        RecipeRegistrars.register(new GraviSuiteRegistrar());
        RecipeRegistrars.register(new StargateRegistrar());
        RecipeRegistrars.register(new GendustryRegistrar());
        RecipeRegistrars.register(new ZtonesRegistrar());
        RecipeRegistrars.register(new ForestryRegistrar());
        RecipeRegistrars.register(new ChestUpRegistrar());
        RecipeRegistrars.register(new LogisticsPipesRegistrar());
        RecipeRegistrars.register(new MalisisDoorsRegistrar());
        RecipeRegistrars.register(new BackpackRegistrar());
        RecipeRegistrars.register(new BiblioCraftRegistrar());
        RecipeRegistrars.register(new ChickenChunksRegistrar());
        RecipeRegistrars.register(new ArchitectureCraftRegistrar());
        RecipeRegistrars.register(new CarpentersBlocksRegistrar());
        RecipeRegistrars.register(new NuclearControlRegistrar());
        RecipeRegistrars.register(new EnderIORegistrar());
        RecipeRegistrars.register(new CatwalksRegistrar());
        RecipeRegistrars.register(new UndergroundBiomesRegistrar());
        RecipeRegistrars.register(new ChiselRegistrar());


        registerRecipeClass(AE.class);
        registerRecipeClass(OpenComputers.class);
        registerRecipeClass(RailCraft.class);
        registerRecipeClass(ImpactCore.class);
        registerRecipeClass(IC2.class);
    
        recipesInit();
    }
}
