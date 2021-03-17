package com.impactrecipes.recipes;

import com.impact.common.item.Core_Items2;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class GalactiCraft implements Runnable {

    final Core_Items2 CoreItems2 = Core_Items2.getInstance();

    @Override
    public void run() {
        pulverizer();
        printer3d();
        fluidCanner();
        extruder();
        extractor();
        canner();
        arcFurnace();
        assembler();
        cuttingSaw();
    }

    private void pulverizer() {
        GT_Values.RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalacticraftCore", "tile.fallenMeteor", 1L),
                        new ItemStack[]{
                                GT_ModHandler.getModItem("GalacticraftCore", "item.meteoricIronRaw", 2L)},
                        new int[]{10000}, 300, 2);
    }

    private void printer3d() {
        GT_Values.RA.addPrimitiveLineRecipe(new ItemStack[]{
                CoreItems2.getRecipe(0, 0),
                GT_ModHandler.getModItem("GalacticraftCore", "item.noseCone", 1L, 0),
                GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 3L, 4),
                GT_ModHandler.getModItem("GalacticraftCore", "item.heavyPlating", 8L, 0),
                GT_ModHandler.getModItem("GalacticraftCore", "item.rocketFins", 4L, 0),
                GT_ModHandler.getModItem("GalaxySpace", "item.Modules", 1L, 3),
                GT_ModHandler.getModItem("GalacticraftCore", "item.engine", 1L, 0)
        }, GT_ModHandler.getModItem("GalacticraftCore", "item.spaceship", 1L, 0), null, 100 * 20, 480);

        GT_Values.RA.addPrimitiveLineRecipe(new ItemStack[]{
                        CoreItems2.getRecipe(1, 0),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.noseCone", 1L, 0),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.heavyPlating", 3L, 0),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.null", 10L, 3),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.rocketFins", 4L, 0),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.engine", 2L, 1),
                        GT_ModHandler.getModItem("GalaxySpace", "item.Modules", 1L, 3),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.engine", 2L, 0)
                }, GT_ModHandler.getModItem("GalacticraftMars", "item.spaceshipTier2", 1L, 0), null, 120 * 20,
                1920);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        CoreItems2.getRecipe(2, 0),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.heavyNoseCone", 1L, 0),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.null", 4L, 3),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 12L, 0),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 4L, 2),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.engine", 4L, 1),
                        CoreItems2.getRecipe(133, 2),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L, 1)
                }, GT_ModHandler.getModItem("GalacticraftMars", "item.itemTier3Rocket", 1L, 0), null, 140 * 20,
                7680);
    }

    private void fluidCanner() {
        GT_Values.RA.addFluidCannerRecipe(
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankLightFull", 1L, 1800),
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankLightFull", 1L, 0),
                Materials.Oxygen.getGas(1800L), GT_Values.NF);
        GT_Values.RA.addFluidCannerRecipe(
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankMedFull", 1L, 3600),
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankMedFull", 1L, 0),
                Materials.Oxygen.getGas(3600L), GT_Values.NF);
        GT_Values.RA.addFluidCannerRecipe(
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankHeavyFull", 1L, 5400),
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankHeavyFull", 1L, 0),
                Materials.Oxygen.getGas(5400L), GT_Values.NF);
        GT_Values.RA.addFluidCannerRecipe(
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankt4", 1L, 7200),
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankt4", 1L, 0),
                Materials.Oxygen.getGas(7200L), GT_Values.NF);
        GT_Values.RA.addFluidCannerRecipe(
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankt5", 1L, 9000),
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankt5", 1L, 0),
                Materials.Oxygen.getGas(9000L), GT_Values.NF);
        GT_Values.RA.addFluidCannerRecipe(
                GT_ModHandler.getModItem("GalacticraftCore", "item.fuelCanisterPartial", 1L, 1001),
                GT_ModHandler.getModItem("GalacticraftCore", "item.fuelCanisterPartial", 1L, 1),
                new FluidStack(ItemList.sRocketFuel, 1000), GT_Values.NF);
    }

    private void extruder() {
        GT_Values.RA.addExtruderRecipe(GT_ModHandler.getModItem("IC2", "blockAlloyGlass", 1L, 0),
                ItemList.Shape_Extruder_Pipe_Small.get(0L),
                GT_ModHandler.getModItem("GalacticraftCore", "tile.oxygenPipe", 2L, 0), 200, 120);
        GT_Values.RA
                .addExtruderRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 2L, 7),
                        ItemList.Shape_Extruder_Cell.get(0L),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.canister", 1L, 0), 600, 30);
        GT_Values.RA
                .addExtruderRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 2L, 6),
                        ItemList.Shape_Extruder_Cell.get(0L),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.canister", 1L, 1), 600, 30);
        GT_Values.RA
                .addExtruderRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 2L, 9),
                        ItemList.Shape_Extruder_Bolt.get(0L),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.steelPole", 1L, 0), 600, 30);

    }

    private void extractor() {
        GT_Values.RA
                .addExtractorRecipe(GT_ModHandler.getModItem("GalacticraftMars", "item.thermalPadding", 1L),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 5L, 7), 300, 2);
        GT_Values.RA.addExtractorRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.thermalPadding", 1L, 1),
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 8L, 7), 300, 2);
        GT_Values.RA.addExtractorRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.thermalPadding", 1L, 2),
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 7L, 7), 300, 2);
        GT_Values.RA.addExtractorRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.thermalPadding", 1L, 3),
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 4L, 7), 300, 2);

    }

    private void canner() {
        GT_Values.RA
                .addCannerRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.canister", 1L, 0),
                        GT_ModHandler.getModItem("minecraft", "apple", 6L, 0),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 1L, 15), null, 800, 1);
        GT_Values.RA
                .addCannerRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.canister", 1L, 0),
                        GT_ModHandler.getModItem("minecraft", "carrot", 8L, 0),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 1L, 16), null, 800, 1);
        GT_Values.RA
                .addCannerRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.canister", 1L, 0),
                        GT_ModHandler.getModItem("minecraft", "melon", 8L, 0),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 1L, 17), null, 800, 1);
        GT_Values.RA
                .addCannerRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.canister", 1L, 0),
                        GT_ModHandler.getModItem("minecraft", "potato", 16L, 0),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 1L, 18), null, 800, 1);

    }

    private void arcFurnace() {
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.spaceship", 1L, 0),
                        new ItemStack[]{ItemList.Ingot_Heavy1.get(21), CoreItems2.getRecipe(97, 3),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Steel, 12)}, null, 1200, 384);
        GT_Values.RA.addArcFurnaceRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.spaceshipTier2", 1L, 0),
                new ItemStack[]{ItemList.Ingot_Heavy2.get(32), ItemList.Ingot_Heavy1.get(26),
                        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Steel, 18)}, null, 1400, 1536);
        GT_Values.RA.addArcFurnaceRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemTier3Rocket", 1L, 0),
                new ItemStack[]{ItemList.Ingot_Heavy3.get(25), ItemList.Ingot_Heavy2.get(36),
                        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Titanium, 12)}, null, 1600, 6144);
        // --- Canister
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankLightFull", 1L, GT_Values.W),
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Aluminium, 21),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Steel, 9)}, null, 600, 64);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankMedFull", 1L, GT_Values.W),
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.MeteoricIron, 21),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Aluminium, 9)}, null, 600, 120);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankHeavyFull", 1L, GT_Values.W),
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Desh, 21),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.StainlessSteel, 9)}, null, 700, 256);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankt4", 1L, GT_Values.W),
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Naquadah, 21),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Titanium, 9)}, null, 800, 480);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenTankt5", 1L, GT_Values.W),
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Trinium, 21),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.TungstenSteel, 9)}, null, 900, 1024);

    }

    private void assembler() {
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("GalacticraftCore", "item.spaceship", 1L),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2),
                        GT_ModHandler.getModItem("GalacticraftCore", "item.spaceship", 1L, 3), 200, 64);
        // ---  T2 Rocket + chest
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("GalacticraftMars", "item.spaceshipTier2", 1L),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.spaceshipTier2", 1L, 3), 200, 64);
        // ---  T3 Rocket + chest
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemTier3Rocket", 1L),
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2),
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemTier3Rocket", 1L, 3), 200, 64);

        // --- Oxygen Mask
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("IC2", "itemArmorHazmatHelmet", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.ReinforcedGlass, 16),
                Materials.Rubber.getMolten(144),
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenMask", 1L), 400, 120);
        // --- Thermal Cloth
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Aluminium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Polycaprolactam, 1),
                        Materials.Polytetrafluoroethylene.getMolten(576),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L, 7), 100,
                        1920);
        // --- Glowstone Torch
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "redstone_torch", 1L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glowstone, 1),
                GT_ModHandler.getModItem("GalacticraftCore", "tile.glowstoneTorch", 1L), 200, 16);
        // --- Canister
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 8L, 9),
                        GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Steel, 4),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("GalacticraftCore", "item.oilCanisterPartial", 1L, 1001), 200, 64);
        // --- Canister T2
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 8L, 6),
                        GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Titanium, 4),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("GalacticraftMars", "item.LOX2", 1L, 8001), 300, 256);
        // --- Canister T3
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.TungstenSteel, 8),
                        GT_OreDictUnificator.get(OrePrefixes.ring, Materials.TungstenSteel, 4),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("GalacticraftMars", "item.LOX3", 1L, 32001), 400, 1024);
        // --- Hydrogen Pipe
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("GalacticraftCore", "tile.oxygenPipe", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Copper, 4),
                        GT_ModHandler.getModItem("GalacticraftMars", "tile.hydrogenPipe", 1L), 400, 16);
        // --- Thermal Padding Helm
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 5L, 7),
                GT_Utility.getIntegratedCircuit(5),
                GT_ModHandler.getModItem("GalacticraftMars", "item.thermalPadding", 1L), 750, 1024);
        // --- Thermal Padding Chestpiece
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 8L, 7),
                GT_Utility.getIntegratedCircuit(8),
                GT_ModHandler.getModItem("GalacticraftMars", "item.thermalPadding", 1L, 1), 1200, 1024);
        // --- Thermal Padding Leggings
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 7L, 7),
                GT_Utility.getIntegratedCircuit(7),
                GT_ModHandler.getModItem("GalacticraftMars", "item.thermalPadding", 1L, 2), 1050, 1024);
        // --- Thermal Padding Boots
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 4L, 7),
                GT_Utility.getIntegratedCircuit(4),
                GT_ModHandler.getModItem("GalacticraftMars", "item.thermalPadding", 1L, 3), 600, 1024);


    }

    private void cuttingSaw() {
        // --- Slabs
        GT_Values.RA
                .addCutterRecipe(GT_ModHandler.getModItem("GalacticraftCore", "tile.gcBlockCore", 1L, 4),
                        GT_ModHandler.getModItem("GalacticraftCore", "slabGCHalf", 2L, 0), GT_Values.NI, 50, 8);
        GT_Values.RA
                .addCutterRecipe(GT_ModHandler.getModItem("GalacticraftCore", "tile.gcBlockCore", 1L, 3),
                        GT_ModHandler.getModItem("GalacticraftCore", "slabGCHalf", 2L, 1), GT_Values.NI, 50, 8);
        GT_Values.RA
                .addCutterRecipe(GT_ModHandler.getModItem("GalacticraftCore", "tile.moonBlock", 1L, 4),
                        GT_ModHandler.getModItem("GalacticraftCore", "slabGCHalf", 2L, 2), GT_Values.NI, 50, 8);
        GT_Values.RA
                .addCutterRecipe(GT_ModHandler.getModItem("GalacticraftCore", "tile.moonBlock", 1L, 14),
                        GT_ModHandler.getModItem("GalacticraftCore", "slabGCHalf", 2L, 3), GT_Values.NI, 50, 8);
        GT_Values.RA.addCutterRecipe(GT_ModHandler.getModItem("GalacticraftMars", "tile.mars", 1L, 4),
                GT_ModHandler.getModItem("GalacticraftCore", "slabGCHalf", 2L, 4), GT_Values.NI, 50, 8);
        GT_Values.RA.addCutterRecipe(GT_ModHandler.getModItem("GalacticraftMars", "tile.mars", 1L, 7),
                GT_ModHandler.getModItem("GalacticraftCore", "slabGCHalf", 2L, 5), GT_Values.NI, 50, 8);

    }

}
