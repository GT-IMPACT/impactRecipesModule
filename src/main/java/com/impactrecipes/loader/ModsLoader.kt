package com.impactrecipes.loader

import com.impactrecipes.recipes.ae2.AE2Registrar
import com.impactrecipes.recipes.architecturecraft.ArchitectureCraftRegistrar
import com.impactrecipes.recipes.backpack.BackpackRegistrar
import com.impactrecipes.recipes.bibliocraft.BiblioCraftRegistrar
import com.impactrecipes.recipes.buildcraft.BuildCraftRegistrar
import com.impactrecipes.recipes.carpentersblocks.CarpentersBlocksRegistrar
import com.impactrecipes.recipes.catwalks.CatwalksRegistrar
import com.impactrecipes.recipes.chestup.ChestUpRegistrar
import com.impactrecipes.recipes.chickenchunks.ChickenChunksRegistrar
import com.impactrecipes.recipes.chisel.ChiselCarvingRegistrar
import com.impactrecipes.recipes.chisel.ChiselRegistrar
import com.impactrecipes.recipes.enderio.EnderIORegistrar
import com.impactrecipes.recipes.extrautilities.ExtraUtilitiesRegistrar
import com.impactrecipes.recipes.forestry.ForestryRegistrar
import com.impactrecipes.recipes.galacticraft.GalacticraftRegistrar
import com.impactrecipes.recipes.galaxyspace.GalaxySpaceRegistrar
import com.impactrecipes.recipes.gendustry.GendustryRegistrar
import com.impactrecipes.recipes.gravisuite.GraviSuiteRegistrar
import com.impactrecipes.recipes.gregtech.GregTechRegistrar
import com.impactrecipes.recipes.ic2.IC2Registrar
import com.impactrecipes.recipes.impact.ImpactRegistrar
import com.impactrecipes.recipes.jabba.JabbaRegistrar
import com.impactrecipes.recipes.logisticspipes.LogisticsPipesRegistrar
import com.impactrecipes.recipes.malisisdoors.MalisisDoorsRegistrar
import com.impactrecipes.recipes.nuclearcontrol.NuclearControlRegistrar
import com.impactrecipes.recipes.openblocks.OpenBlocksRegistrar
import com.impactrecipes.recipes.opencomputers.OpenComputersRegistrar
import com.impactrecipes.recipes.projectred.ProjectRedRegistrar
import com.impactrecipes.recipes.railcraft.RailcraftRegistrar
import com.impactrecipes.recipes.stargate.StargateRegistrar
import com.impactrecipes.recipes.stevesfactorymanager.StevesFactoryManagerRegistrar
import com.impactrecipes.recipes.storagedrawers.StorageDrawersRegistrar
import com.impactrecipes.recipes.tectech.TecTechRegistrar
import com.impactrecipes.recipes.undergroundbiomes.UndergroundBiomesRegistrar
import com.impactrecipes.recipes.vanilla.VanillaRegistrar
import com.impactrecipes.recipes.ztones.ZtonesRegistrar

public object ModsLoader {

    @JvmStatic
    public fun loader() {
        RecipeRegistrars.register(
            ChiselCarvingRegistrar(),
            VanillaRegistrar(),
            GregTechRegistrar(),
            AE2Registrar(),
            BuildCraftRegistrar(),
            JabbaRegistrar(),
            OpenComputersRegistrar(),
            RailcraftRegistrar(),
            StevesFactoryManagerRegistrar(),
            StorageDrawersRegistrar(),
            TecTechRegistrar(),
            ProjectRedRegistrar(),
            OpenBlocksRegistrar(),
            ImpactRegistrar(),
            GalaxySpaceRegistrar(),
            GalacticraftRegistrar(),
            IC2Registrar(),
            ExtraUtilitiesRegistrar(),
            GraviSuiteRegistrar(),
            StargateRegistrar(),
            GendustryRegistrar(),
            ZtonesRegistrar(),
            ForestryRegistrar(),
            ChestUpRegistrar(),
            LogisticsPipesRegistrar(),
            MalisisDoorsRegistrar(),
            BackpackRegistrar(),
            BiblioCraftRegistrar(),
            ChickenChunksRegistrar(),
            ArchitectureCraftRegistrar(),
            CarpentersBlocksRegistrar(),
            NuclearControlRegistrar(),
            EnderIORegistrar(),
            CatwalksRegistrar(),
            UndergroundBiomesRegistrar(),
            ChiselRegistrar(),
        )
    }
}
