package com.impactrecipes.recipes;

import com.github.technus.tectech.thing.CustomItemList;
import com.impact.common.item.Core_Items;
import com.impact.common.item.Core_Items2;
import com.impact.common.item.WoodBrickFormTool;
import com.impact.loader.ItemRegistery;
import com.impact.mods.gregtech.GT_ItemList;
import com.impact.util.Utilits;
import gregtech.GT_Mod;
import gregtech.api.GregTech_API;
import gregtech.api.enums.*;
import gregtech.api.interfaces.IOreRecipeRegistrator;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;

import static com.impact.common.item.Core_List_Items.*;
import static com.impact.loader.ItemRegistery.*;
import static com.impact.mods.gregtech.GT_ItemList.Casing_Farm;
import static com.impact.util.Utilits.*;
import static gregtech.api.enums.GT_Values.RA;
import static gregtech.api.util.GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES;

public class ImpactCore implements Runnable {

    private static final long bits = GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.BUFFERED;
    private static final long bits2 = GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.BUFFERED | DELETE_ALL_OTHER_RECIPES;
    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE/* | GT_ModHandler.RecipeBits.REVERSIBLE*/;
    private final static long bitsd = GT_ModHandler.RecipeBits.DISMANTLEABLE | bits;

    public static final Core_Items CoreItems = Core_Items.getInstance();
    public static final Core_Items2 CoreItems2 = Core_Items2.getInstance();
    final WoodBrickFormTool WoodForm = WoodBrickFormTool.getInstance(); //вуд форма

    @Override
    public void run() {
        hand();
        furnace();
        unboxing();
        pulverizer();
        printer3d();
        mixer();
        lathe();
        implosionCompressor();
        formingPress();
        fluidExtractor();
        woodFarm();
        extruder();
        extractor();
        ebf();
        centrifuge();
        alloySmelter();
        assembler();
        cutting();
        compressor();
        chemical();
        bath();
        ciruit();
        assemblyLine();
        wireassembler();
        disassembler();
    }

    private void hand() {

        final Object[] mk1_recipe = {
                "CCC", "PHP", "FBL",
                'C', OrePrefixes.circuit.get(Materials.Data),
                'P', ItemList.Electric_Pump_HV.get(1L),
                'H', ItemList.Hull_HV.get(1L),
                'F', GT_OreDictUnificator.get(OrePrefixes.pipeSmall, Materials.Titanium, 1),
                'B', GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.Gold, 1),
                'L', GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Titanium, 1)};
        GT_ModHandler.addCraftingRecipe(GT_ItemList.SOFC_Low.get(1), mk1_recipe);

        final Object[] mk2_recipe = {
                "CCC", "PHP", "FBL",
                'C', OrePrefixes.circuit.get(Materials.Elite),
                'P', ItemList.Electric_Pump_EV.get(1L),
                'H', ItemList.Hull_EV.get(1L),
                'F', GT_OreDictUnificator.get(OrePrefixes.pipeSmall, Materials.TungstenSteel, 1),
                'B', GregTech_API.getStackofAmountFromOreDict("wireGt04SuperconductorEV", 1),
                'L', GT_OreDictUnificator.get(OrePrefixes.pipeMedium, Materials.TungstenSteel, 1)};
        GT_ModHandler.addCraftingRecipe(GT_ItemList.SOFC_Medium.get(1), mk2_recipe);

        final Object[] mk3_recipe = {
                "CCC", "PHP", "FBL",
                'C', OrePrefixes.circuit.get(Materials.Master),
                'P', ItemList.Electric_Pump_IV.get(1L),
                'H', ItemList.Hull_IV.get(1L),
                'F', GT_OreDictUnificator.get(OrePrefixes.pipeSmall, Materials.Ultimate, 1),
                'B', GregTech_API.getStackofAmountFromOreDict("wireGt04SuperconductorIV", 1),
                'L', GT_OreDictUnificator.get(OrePrefixes.pipeMedium, Materials.Ultimate, 1)};
        GT_ModHandler.addCraftingRecipe(GT_ItemList.SOFC_Huge.get(1), mk3_recipe);

        final Object[] tfft_recipe = {
                "HFH", "PVP", "CFC",
                'H', OrePrefixes.pipeMedium.get(Materials.Titanium),
                'F', ItemList.Field_Generator_MV.get(1L),
                'P', ItemList.Electric_Pump_HV.get(1L),
                'V', ItemList.Hull_HV.get(1L),
                'C', OrePrefixes.circuit.get(Materials.Data)};
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Multi_Tank.get(1), tfft_recipe);
        //SingleTank
        final Object[] singletank_recipe = {
                "HFH", "PVP", "CFC",
                'H', OrePrefixes.pipeMedium.get(Materials.StainlessSteel),
                'F', ItemList.Field_Generator_LV.get(1L),
                'P', ItemList.Electric_Pump_MV.get(1L),
                'V', ItemList.Hull_MV.get(1L),
                'C', OrePrefixes.circuit.get(Materials.Data)};
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Single_Tank.get(1), singletank_recipe);

        final Object[] tank_hatch = {
                "PRP", "UFU", "PRP",
                'P', GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.Titanium, 1),
                'R', ItemList.Hatch_Output_EV.get(1L),
                'U', ItemList.Hatch_Input_EV.get(1L),
                'F', ItemList.Electric_Pump_HV.get(1L)};
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Tank_Hatch.get(1), tank_hatch);

        GT_ModHandler.addCraftingRecipe(GT_ItemList.ULVConveyorModule.get(1L), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"PPP", "MWM", "PPP", 'P', GT_ModHandler.getModItem("minecraft", "leather", 1L, 0), 'M', GT_ItemList.ULVMotor, 'W', OrePrefixes.cableGt01.get(Materials.Lead)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.ULVConveyorModule.get(1L), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"PPP", "MWM", "PPP", 'P', OrePrefixes.plate.get(Materials.Rubber), 'M', GT_ItemList.ULVMotor, 'W', OrePrefixes.cableGt01.get(Materials.Lead)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.ULVPump.get(1L), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SXO", "dPw", "OMS", 'M', GT_ItemList.ULVMotor, 'O', OrePrefixes.ring.get(Materials.Paper), 'X', OrePrefixes.rotor.get(Materials.Lead), 'S', OrePrefixes.screw.get(Materials.Lead), 'P', OrePrefixes.pipeMedium.get(Materials.Copper)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.ULVPump.get(1L), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SXO", "dPw", "OMS", 'M', GT_ItemList.ULVMotor, 'O', OrePrefixes.ring.get(Materials.Rubber), 'X', OrePrefixes.rotor.get(Materials.Lead), 'S', OrePrefixes.screw.get(Materials.Lead), 'P', OrePrefixes.pipeMedium.get(Materials.Copper)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.ULVPump.get(1L), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"SXO", "dPw", "OMS", 'M', GT_ItemList.ULVMotor, 'O', OrePrefixes.ring.get(Materials.StyreneButadieneRubber), 'X', OrePrefixes.rotor.get(Materials.Lead), 'S', OrePrefixes.screw.get(Materials.Lead), 'P', OrePrefixes.pipeMedium.get(Materials.Copper)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.ULVMotor.get(1L), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"CWR", "WIW", "RWC", 'I', OrePrefixes.bolt.get(Materials.IronMagnetic), 'R', OrePrefixes.stick.get(Materials.Iron), 'W', OrePrefixes.wireFine.get(Materials.Tin), 'C', OrePrefixes.cableGt01.get(Materials.Lead)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.ULVRobotArm.get(1L), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"CCC", "MSM", "PES", 'S', OrePrefixes.stick.get(Materials.WroughtIron), 'M', GT_ItemList.ULVMotor, 'P', GT_ItemList.ULVPiston, 'E', OrePrefixes.circuit.get(Materials.Primitive), 'C', OrePrefixes.cableGt01.get(Materials.Lead)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.ULVPiston.get(1L), GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"CPP", "dSS", "CMG", 'P', OrePrefixes.plate.get(Materials.WroughtIron), 'S', OrePrefixes.stick.get(Materials.WroughtIron), 'G', OrePrefixes.gearGtSmall.get(Materials.WroughtIron), 'M', GT_ItemList.ULVMotor, 'C', OrePrefixes.screw.get(Materials.WroughtIron)});


        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Semi_Turbine_ULV.get(1L), bitsd, new Object[]{"GCG", "EME", "PWP", 'M', ItemList.Hull_ULV, 'P', GT_ItemList.ULVPiston, 'E', GT_ItemList.ULVMotor, 'C', OrePrefixes.circuit.get(Materials.Primitive), 'W', OrePrefixes.cableGt01.get(Materials.Lead), 'G', OrePrefixes.gearGt.get(Materials.WroughtIron)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Steam_Turbine_ULV.get(1L), bitsd, new Object[]{"PCP", "RHR", "EWE", 'H', ItemList.Hull_ULV, 'E', GT_ItemList.ULVMotor, 'R', OrePrefixes.rotor.get(Materials.Lead), 'C', OrePrefixes.circuit.get(Materials.Primitive), 'W', OrePrefixes.cableGt01.get(Materials.Lead), 'P', OrePrefixes.pipeSmall.get(Materials.Lead)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Diesel_ULV.get(1L), bitsd, new Object[]{"PCP", "EME", "GWG", 'M', ItemList.Hull_ULV, 'P', GT_ItemList.ULVPiston, 'E', GT_ItemList.ULVMotor, 'C', OrePrefixes.circuit.get(Materials.Primitive), 'W', OrePrefixes.cableGt01.get(Materials.Lead), 'G', OrePrefixes.gearGt.get(Materials.WroughtIron)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Gas_Turbine_ULV.get(1L), bitsd, new Object[]{"CRC", "RHR", "EWE", 'H', ItemList.Hull_ULV, 'E', GT_ItemList.ULVMotor, 'R', OrePrefixes.rotor.get(Materials.Lead), 'C', OrePrefixes.circuit.get(Materials.Primitive), 'W', OrePrefixes.cableGt01.get(Materials.Lead)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Machine_ULV_Assembler.get(1L), bitsd, new Object[]{"RCR", "OMO", "WCW", 'M', ItemList.Hull_ULV, 'R', GT_ItemList.ULVRobotArm, 'O', GT_ItemList.ULVConveyorModule, 'C', OrePrefixes.circuit.get(Materials.Primitive), 'W', OrePrefixes.cableGt01.get(Materials.Lead)});
        GT_ModHandler.addCraftingRecipe(ItemList.Casing_CokeOvenBrick.get(1L), bits, new Object[]{"BB", "BB", 'B', CoreItems2.getRecipe(CokeOvenBrick.getMetaID(), 1)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Hatch_Output_Prim.get(1L), bitsd, new Object[]{"BBB", "B B", "BEB", 'B', CoreItems2.getRecipe(CokeOvenBrick.getMetaID(), 1), 'E', new ItemStack(Items.bucket, 1, 0)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Bus_Input_Prim.get(1L), bitsd, new Object[]{"BEB", "B B", "BBB", 'B', CoreItems2.getRecipe(CokeOvenBrick.getMetaID(), 1), 'E', new ItemStack(Blocks.hopper, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Bus_Output_Prim.get(1L), bitsd, new Object[]{"BBB", "B B", "BEB", 'B', CoreItems2.getRecipe(CokeOvenBrick.getMetaID(), 1), 'E', new ItemStack(Blocks.hopper, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Machine_CokeOven.get(1L), bitsd, new Object[]{"BBB", "BFB", "BBB", 'B', CoreItems2.getRecipe(CokeOvenBrick.getMetaID(), 1), 'F', OreDictNames.craftingFurnace});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Semi_Turbine_LV.get(1L), bitsd, new Object[]{"GCG", "EME", "PWP", 'M', ItemList.Hull_LV, 'P', ItemList.Electric_Piston_LV, 'E', ItemList.Electric_Motor_LV, 'C', OrePrefixes.circuit.get(Materials.Basic), 'W', OrePrefixes.cableGt01.get(Materials.Tin), 'G', OrePrefixes.gearGt.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Semi_Turbine_MV.get(1L), bitsd, new Object[]{"GCG", "EME", "PWP", 'M', ItemList.Hull_MV, 'P', ItemList.Electric_Piston_MV, 'E', ItemList.Electric_Motor_MV, 'C', OrePrefixes.circuit.get(Materials.Good), 'W', OrePrefixes.cableGt01.get(Materials.Copper), 'G', OrePrefixes.gearGt.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Semi_Turbine_HV.get(1L), bitsd, new Object[]{"GCG", "EME", "PWP", 'M', ItemList.Hull_HV, 'P', ItemList.Electric_Piston_HV, 'E', ItemList.Electric_Motor_HV, 'C', OrePrefixes.circuit.get(Materials.Advanced), 'W', OrePrefixes.cableGt01.get(Materials.Gold), 'G', OrePrefixes.gearGt.get(Materials.StainlessSteel)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Machine_Multi_Farm.get(1L), bitsd, new Object[]{"ROR", "CHC", "PWP", 'H', ItemList.Hull_MV, 'W', OrePrefixes.cableGt02.get(Materials.Copper), 'C', OrePrefixes.circuit.get(Materials.Good), 'P', ItemList.Electric_Pump_MV, 'R', ItemList.Robot_Arm_MV, 'O', OreDictNames.craftingDiamondBlade});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Semi_Turbine_EV.get(1L), bitsd, new Object[]{"GCG", "EME", "PWP", 'M', ItemList.Hull_EV, 'P', ItemList.Electric_Piston_EV, 'E', ItemList.Electric_Motor_EV, 'C', OrePrefixes.circuit.get(Materials.Data), 'W', OrePrefixes.cableGt01.get(Materials.Aluminium), 'G', OrePrefixes.gearGt.get(Materials.Titanium)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Steam_Turbine_EV.get(1L), bitsd, new Object[]{"PCP", "RHR", "EWE", 'H', ItemList.Hull_EV, 'E', ItemList.Electric_Motor_EV, 'R', OrePrefixes.rotor.get(Materials.StainlessSteel), 'C', OrePrefixes.circuit.get(Materials.Data), 'W', OrePrefixes.cableGt01.get(Materials.Aluminium), 'P', OrePrefixes.pipeLarge.get(Materials.Titanium)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Generator_Diesel_EV.get(1L), bitsd, new Object[]{"PCP", "EME", "GWG", 'M', ItemList.Hull_EV, 'P', ItemList.Electric_Piston_EV, 'E', ItemList.Electric_Motor_EV, 'C', OrePrefixes.circuit.get(Materials.Data), 'W', OrePrefixes.cableGt01.get(Materials.Aluminium), 'G', OrePrefixes.gearGt.get(Materials.Titanium)});

        //Portable Tank
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Portable_Tank_ULV.get(1L), bitsd, new Object[]{"SPS", "PTP", "hPC", 'T', ItemList.Large_Fluid_Cell_Steel.get(1L), 'P', OrePrefixes.plateDouble.get(Materials.Lead), 'S', OrePrefixes.screw.get(Materials.WroughtIron), 'C', ToolDictNames.craftingToolScrewdriver});

        //Potin Alloy
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Potin, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Copper), OrePrefixes.dust.get(Materials.Copper), OrePrefixes.dust.get(Materials.Copper), OrePrefixes.dust.get(Materials.Copper), OrePrefixes.dust.get(Materials.Copper), OrePrefixes.dust.get(Materials.Copper), OrePrefixes.dust.get(Materials.Tin), OrePrefixes.dust.get(Materials.Tin), OrePrefixes.dust.get(Materials.Lead)});

        //Wooden Brick Form
        GT_ModHandler.addShapelessCraftingRecipe(WoodForm.getRecipe(1), tBitMask, new Object[]{ToolDictNames.craftingToolKnife, GT_ModHandler.getModItem("TConstruct", "blankPattern", 1L, 0)});

        //Bricks
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(UnfiredClayBrick.getMetaID(), 8), tBitMask, new Object[]{"CCC", "CFC", "CCC", 'C', new ItemStack(Items.clay_ball, 1, 0), 'F', WoodForm.get()});
        GT_ModHandler.addShapelessCraftingRecipe(CoreItems2.getRecipe(UnfiredClayBrick.getMetaID(), 1), tBitMask, new Object[]{new ItemStack(Items.clay_ball, 1, 0), WoodForm.get()});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(UnfiredSearedBrick.getMetaID(), 8), tBitMask, new Object[]{"GGG", "GFG", "GGG", 'G', GT_ModHandler.getModItem("TConstruct", "CraftedSoil", 1L, 1), 'F', WoodForm.get()});
        GT_ModHandler.addShapelessCraftingRecipe(CoreItems2.getRecipe(UnfiredSearedBrick.getMetaID(), 1), tBitMask, new Object[]{GT_ModHandler.getModItem("TConstruct", "CraftedSoil", 1L, 1), WoodForm.get()});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(UnfiredCokeOvenBrick.getMetaID(), 3), tBitMask, new Object[]{"CCC", "SFS", "SSS", 'C', new ItemStack(Items.clay_ball, 1, 0), 'S', new ItemStack(Blocks.sand, 1, 0), 'F', WoodForm.get()});
        GT_ModHandler.addShapelessCraftingRecipe(CoreItems2.getRecipe(UnfiredCokeOvenBrick.getMetaID(), 1), tBitMask, new Object[]{new ItemStack(Items.clay_ball, 1, 0), new ItemStack(Blocks.sand, 1, 0), OrePrefixes.block.get(Materials.Sand), WoodForm.get()});

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(SteelBars.getMetaID(), 3), tBitMask, new Object[]{" h ", "SSS", "SSS", 'S', OrePrefixes.stick.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Casing_Farm.get(1L), tBitMask, new Object[]{"ThT", "TFT", "TwT", 'T', CoreItems2.getRecipe(SteelBars.getMetaID(), 1), 'F', OrePrefixes.frameGt.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 4), tBitMask, new Object[]{" D", "  ", 'D', GT_ModHandler.getModItem("IC2", "itemFertilizer", 1L, 0)});
        GT_ModHandler.addCraftingRecipe(CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 9), tBitMask, new Object[]{"D ", "  ", 'D', GT_ModHandler.getModItem("IC2", "itemFertilizer", 1L, 0)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "itemFertilizer", 1L, 0), tBitMask, new Object[]{"DD", "DD", 'D', CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 4)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "itemFertilizer", 1L, 0), tBitMask, new Object[]{"DDD", "DDD", "DDD", 'D', CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 9)});

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(UnfiredClayBrick.getMetaID(), 8), tBitMask, new Object[]{"CCC", "CFC", "CCC", ('C'), new ItemStack(Items.clay_ball, 1, 0), ('F'), new ItemStack(WoodBrickFormTool.WoodBrickFormTool, 1, OreDictionary.WILDCARD_VALUE)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(UnfiredSearedBrick.getMetaID(), 8), tBitMask, new Object[]{"CCC", "CFC", "CCC", ('C'), GT_ModHandler.getModItem("TConstruct", "CraftedSoil", 1L, 1), ('F'), new ItemStack(WoodBrickFormTool.WoodBrickFormTool, 1, OreDictionary.WILDCARD_VALUE)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(UnfiredCokeOvenBrick.getMetaID(), 3), tBitMask, new Object[]{"CCC", "SFS", "SSS", ('S'), GT_ModHandler.getModItem("minecraft", "sand", 1L, 0), ('C'), new ItemStack(Items.clay_ball, 1, 0), ('F'), new ItemStack(WoodBrickFormTool.WoodBrickFormTool, 1, OreDictionary.WILDCARD_VALUE)});
        GT_ModHandler.addCraftingRecipe(ItemList.CompressedFireclay.get(8), tBitMask, new Object[]{"CCC", "TFT", "CCC", 'C', OrePrefixes.dust.get(Materials.Clay), 'T', CoreItems.getRecipe(ConcreteDust.getMetaID(), 1), ('F'), new ItemStack(WoodBrickFormTool.WoodBrickFormTool, 1, OreDictionary.WILDCARD_VALUE)});

        GT_ModHandler.addShapelessCraftingRecipe(CoreItems.getRecipe(37, 4), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Stone), OrePrefixes.dust.get(Materials.Stone), OrePrefixes.dust.get(Materials.Gypsum), OrePrefixes.dust.get(Materials.Calcite)});
        GT_ModHandler.addShapelessCraftingRecipe(CoreItems.getRecipe(37, 4), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Stone), OrePrefixes.dust.get(Materials.Stone), OrePrefixes.dust.get(Materials.Gypsum), OrePrefixes.dust.get(Materials.Marble)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Fireclay, 4L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Clay), OrePrefixes.dust.get(Materials.Clay), OrePrefixes.dust.get(Materials.Clay), CoreItems.getRecipe(37, 1)});

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(98, 1), tBitMask, new Object[]{"PRP", "ICI", "PMP", 'P', CoreItems2.getRecipe(84, 1), 'R', OrePrefixes.rotor.get(Materials.Iridium), 'M', ItemList.Electric_Motor_ZPM, 'I', ItemList.Neutron_Reflector, 'C', ItemList.Reactor_Coolant_Le_3});

        //IC2 Batteries
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.EnergyCrystal.get(1), tBitMask, new Object[]{OrePrefixes.battery.get(Materials.Elite)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.LapotronCrystal.get(1), tBitMask, new Object[]{OrePrefixes.battery.get(Materials.Master)});

        //Rods
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(177,1), tBitMask, new Object[]{"f ", " S", 'S', new ItemStack(Blocks.cobblestone)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(178,1), tBitMask, new Object[]{"f ", " S", 'S', new ItemStack(Blocks.sandstone)});

        /**====START SOLAR COVER====*/
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(109, 1), tBitMask, new Object[]{"PAP", "ACA", "PAP", 'C', CoreItems2.getRecipe(101, 1), 'A', OrePrefixes.plateAlloy.get(Materials.Carbon), 'P', OrePrefixes.plateAlloy.get(Materials.Advanced)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(110, 1), tBitMask, new Object[]{"PAP", "ACA", "PAP", 'C', CoreItems2.getRecipe(102, 1), 'A', OrePrefixes.plate.get(Materials.Silicon), 'P', OrePrefixes.plateAlloy.get(Materials.Advanced)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(111, 1), tBitMask, new Object[]{"PAP", "ACA", "PAP", 'C', CoreItems2.getRecipe(103, 1), 'A', OrePrefixes.plate.get(Materials.Tungsten), 'P', OrePrefixes.plateAlloy.get(Materials.Advanced)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(112, 1), tBitMask, new Object[]{"PAP", "ACA", "PAP", 'C', CoreItems2.getRecipe(104, 1), 'A', OrePrefixes.plate.get(Materials.TungstenSteel), 'P', OrePrefixes.plateAlloy.get(Materials.Advanced)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(113, 1), tBitMask, new Object[]{"PAP", "ACA", "PAP", 'C', CoreItems2.getRecipe(105, 1), 'A', OrePrefixes.plate.get(Materials.Diamond), 'P', OrePrefixes.plateAlloy.get(Materials.Advanced)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(114, 1), tBitMask, new Object[]{"PAP", "ACA", "PAP", 'C', CoreItems2.getRecipe(106, 1), 'A', OrePrefixes.plateAlloy.get(Materials.Iridium), 'P', OrePrefixes.plateAlloy.get(Materials.Advanced)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(115, 1), tBitMask, new Object[]{"PAP", "ACA", "PAP", 'C', CoreItems2.getRecipe(107, 1), 'A', OrePrefixes.plate.get(Materials.MysteriousCrystal), 'P', OrePrefixes.plateAlloy.get(Materials.Advanced)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(116, 1), tBitMask, new Object[]{"PAP", "ACA", "PAP", 'C', CoreItems2.getRecipe(108, 1), 'A', OrePrefixes.plate.get(Materials.BlackPlutonium), 'P', OrePrefixes.plateAlloy.get(Materials.Advanced)});

        /*====END SOLAR COVER====*/
        /**====START SPACE ADDITION====*/
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(97, 1), tBitMask, new Object[]{"SdS", "BTA", "ShS", 'T', GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 1L, 9), 'S', OrePrefixes.screw.get(Materials.StainlessSteel), 'B', GT_ModHandler.getModItem("GalaxySpace", "item.CompressedDualBronze", 1L, 0), 'A', GT_ModHandler.getModItem("GalaxySpace", "item.CompressedDualAluminium", 1L, 0)});

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyNoseConeTier4.getMetaID(), 1), tBitMask, new Object[]{"dNh", "SPS", "PAP", 'N', GT_ModHandler.getModItem("GalacticraftMars", "item.heavyNoseCone", 1L), 'S', OrePrefixes.screw.get(Materials.Osmiridium), 'P', CoreItems2.getRecipe(80, 1), 'A', CoreItems2.getRecipe(11, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyNoseConeTier5.getMetaID(), 1), tBitMask, new Object[]{"dNh", "SPS", "PAP", 'N', CoreItems2.getRecipe(HeavyDutyNoseConeTier4.getMetaID(), 1), 'S', OrePrefixes.screw.get(Materials.Duranium), 'P', OrePrefixes.plateTriple.get(Materials.NaquadahAlloy), 'A', CoreItems2.getRecipe(12, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyNoseConeTier6.getMetaID(), 1), tBitMask, new Object[]{"dNh", "SPS", "PAP", 'N', CoreItems2.getRecipe(HeavyDutyNoseConeTier5.getMetaID(), 1), 'S', OrePrefixes.screw.get(Materials.Tritanium), 'P', CoreItems2.getRecipe(83, 1), 'A', CoreItems2.getRecipe(13, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyNoseConeTier7.getMetaID(), 1), tBitMask, new Object[]{"dNh", "SPS", "PAP", 'N', CoreItems2.getRecipe(HeavyDutyNoseConeTier6.getMetaID(), 1), 'S', OrePrefixes.screw.get(Materials.Neutronium), 'P', CoreItems2.getRecipe(85, 1), 'A', CoreItems2.getRecipe(14, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyNoseConeTier8.getMetaID(), 1), tBitMask, new Object[]{"dNh", "SPS", "PAP", 'N', CoreItems2.getRecipe(HeavyDutyNoseConeTier7.getMetaID(), 1), 'S', OrePrefixes.screw.get(Materials.Phoenixite), 'P', CoreItems2.getRecipe(77, 1), 'A', CoreItems2.getRecipe(15, 1)});

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketEngineTier4.getMetaID(), 1), tBitMask, new Object[]{"PIP", "PSP", "BEB", 'I', OrePrefixes.pipeTiny.get(Materials.NiobiumTitanium), 'S', ItemList.Electric_Piston_LuV, 'B', CoreItems2.getRecipe(36, 1), 'P', CoreItems2.getRecipe(11, 1), 'E', GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketEngineTier5.getMetaID(), 1), tBitMask, new Object[]{"PIP", "PSP", "BEB", 'I', OrePrefixes.pipeTiny.get(Materials.Enderium), 'S', ItemList.Electric_Piston_ZPM, 'B', CoreItems2.getRecipe(37, 1), 'P', CoreItems2.getRecipe(12, 1), 'E', CoreItems2.getRecipe(26, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketEngineTier6.getMetaID(), 1), tBitMask, new Object[]{"PIP", "PSP", "BEB", 'I', OrePrefixes.pipeTiny.get(Materials.Naquadah), 'S', ItemList.Electric_Piston_UV, 'B', CoreItems2.getRecipe(38, 1), 'P', CoreItems2.getRecipe(13, 1), 'E', CoreItems2.getRecipe(27, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketEngineTier7.getMetaID(), 1), tBitMask, new Object[]{"PIP", "PSP", "BEB", 'I', OrePrefixes.pipeTiny.get(Materials.Duranium), 'S', ItemList.Electric_Piston_UHV, 'B', CoreItems2.getRecipe(39, 1), 'P', CoreItems2.getRecipe(14, 1), 'E', CoreItems2.getRecipe(28, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketEngineTier8.getMetaID(), 1), tBitMask, new Object[]{"PIP", "PSP", "BEB", 'I', OrePrefixes.pipeTiny.get(Materials.Neutronium), 'S', ItemList.Electric_Piston_UEV, 'B', CoreItems2.getRecipe(40, 1), 'P', CoreItems2.getRecipe(15, 1), 'E', CoreItems2.getRecipe(29, 1)});

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketFinsTier4.getMetaID(), 1), tBitMask, new Object[]{"fPh", "APA", "ACA", 'P', CoreItems2.getRecipe(11, 1), 'C', CoreItems2.getRecipe(92, 1), 'A', GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketFinsTier5.getMetaID(), 1), tBitMask, new Object[]{"fPh", "APA", "ACA", 'P', CoreItems2.getRecipe(12, 1), 'C', CoreItems2.getRecipe(91, 1), 'A', CoreItems2.getRecipe(11, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketFinsTier6.getMetaID(), 1), tBitMask, new Object[]{"fPh", "APA", "ACA", 'P', CoreItems2.getRecipe(13, 1), 'C', CoreItems2.getRecipe(94, 1), 'A', CoreItems2.getRecipe(12, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketFinsTier7.getMetaID(), 1), tBitMask, new Object[]{"fPh", "APA", "ACA", 'P', CoreItems2.getRecipe(14, 1), 'C', CoreItems2.getRecipe(95, 1), 'A', CoreItems2.getRecipe(13, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(HeavyDutyRocketFinsTier8.getMetaID(), 1), tBitMask, new Object[]{"fPh", "APA", "ACA", 'P', CoreItems2.getRecipe(15, 1), 'C', GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Adamantium, 1), 'A', CoreItems2.getRecipe(14, 1)});

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(Tier4Booster.getMetaID(), 1), tBitMask, new Object[]{"PPP", "ABA", "ACA", 'P', OrePrefixes.plate.get(Materials.HastelloyN), 'A', CoreItems2.getRecipe(11, 1), 'C', CoreItems2.getRecipe(86, 1), 'B', GT_ModHandler.getModItem("GalacticraftCore", "item.engine", 1L, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(Tier5Booster.getMetaID(), 1), tBitMask, new Object[]{"PPP", "ABA", "ACA", 'P', OrePrefixes.plate.get(Materials.Europium), 'A', CoreItems2.getRecipe(12, 1), 'C', CoreItems2.getRecipe(88, 1), 'B', CoreItems2.getRecipe(36, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(Tier6Booster.getMetaID(), 1), tBitMask, new Object[]{"PPP", "ABA", "ACA", 'P', OrePrefixes.plate.get(Materials.Americium), 'A', CoreItems2.getRecipe(13, 1), 'C', CoreItems2.getRecipe(79, 1), 'B', CoreItems2.getRecipe(37, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(Tier7Booster.getMetaID(), 1), tBitMask, new Object[]{"PPP", "ABA", "ACA", 'P', OrePrefixes.plate.get(Materials.Neutronium), 'A', CoreItems2.getRecipe(14, 1), 'C', CoreItems2.getRecipe(85, 1), 'B', CoreItems2.getRecipe(38, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(Tier8Booster.getMetaID(), 1), tBitMask, new Object[]{"PPP", "ABA", "ACA", 'P', OrePrefixes.plate.get(Materials.Phoenixite), 'A', CoreItems2.getRecipe(15, 1), 'C', CoreItems2.getRecipe(77, 1), 'B', CoreItems2.getRecipe(39, 1)});

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(MediumFuelCanister.getMetaID(), 1), tBitMask, new Object[]{"SdS", "PCA", "ShS", 'S', OrePrefixes.screw.get(Materials.HastelloyC276), 'P', CoreItems2.getRecipe(96, 1), 'A', CoreItems2.getRecipe(90, 1), 'C', GT_ModHandler.getModItem("GalaxySpace", "item.Modules", 1L, 3)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(LargeFuelCanister.getMetaID(), 1), tBitMask, new Object[]{"SdS", "PCA", "ShS", 'S', OrePrefixes.screw.get(Materials.Lafium), 'P', CoreItems2.getRecipe(91, 1), 'A', CoreItems2.getRecipe(92, 1), 'C', CoreItems2.getRecipe(133, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(ExtraLargeFuelCanister.getMetaID(), 1), tBitMask, new Object[]{"SdS", "PCA", "ShS", 'S', OrePrefixes.screw.get(Materials.Neutronium), 'P', CoreItems2.getRecipe(94, 1), 'A', CoreItems2.getRecipe(95, 1), 'C', CoreItems2.getRecipe(134, 1)});

        /*====END SPACE ADDITION====*/

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(NeutronReflectorSmallParts.getMetaID(), 1), tBitMask, new Object[]{"PPP", "PwP", 'P', GT_ModHandler.getModItem("IC2", "reactorReflector", 1L, 1)});
        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(NeutronReflectorParts.getMetaID(), 1), tBitMask, new Object[]{"PPP", "PwP", "PPP", 'P', GT_ModHandler.getModItem("IC2", "reactorReflectorThick", 1L, 1)});

        GT_ModHandler.addCraftingRecipe(CoreItems2.getRecipe(IndustryFrame.getMetaID(), 1), tBitMask, new Object[]{"PPP", "SBS", "SSS", 'P', OrePrefixes.plate.get(Materials.Iridium), 'S', OrePrefixes.stick.get(Materials.Osmium), 'B', GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Europium, 1)});

        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(WoodBrickFormTool.WoodBrickFormTool, 1), tBitMask, new Object[]{GT_ModHandler.getModItem("TConstruct", "blankPattern", 1L), ToolDictNames.craftingToolKnife});

        //Sawmill
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("impact", "impact_sawmill_block", 5L), tBitMask, new Object[]{"SCS", "BLB", "BdB", 'S', OrePrefixes.screw.get(Materials.WroughtIron), 'B', OrePrefixes.frameGt.get(Materials.Wood), 'L', OrePrefixes.slab.get(Materials.Wood), 'C', GT_ItemList.ULVConveyorModule});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.SawCase.get(2L), tBitMask, new Object[]{"SrS", "SBS", "SsS", 'S', OrePrefixes.slab.get(Materials.Wood), 'B', OrePrefixes.frameGt.get(Materials.Wood)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.SawMill.get(1L), bitsd, new Object[]{"SBd", "MCM", "LWL", 'S', OrePrefixes.screw.get(Materials.WroughtIron), 'B', OrePrefixes.toolHeadBuzzSaw.get(Materials.Iron), 'L', OrePrefixes.circuit.get(Materials.Primitive), 'W', OrePrefixes.wireGt01.get(Materials.Lead), 'M', GT_ItemList.ULVMotor, 'C', GT_ItemList.SawCase});

        //Pyrolyse Oven
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Pyrolyse.get(1L), bitsd, new Object[]{"PQW", "CHC", "ICW", 'Q', OrePrefixes.pipeNonuple.get(Materials.Bronze), 'C', OrePrefixes.circuit.get(Materials.Basic), 'W', OrePrefixes.wireGt08.get(Materials.Cupronickel), 'P', ItemList.Electric_Pump_LV, 'I', ItemList.Electric_Piston_LV, 'H', ItemList.Hull_LV});

        //WaterPump
        GT_ModHandler.addCraftingRecipe(GT_ItemList.PrimitiveWaterPumpCase.get(1L), tBitMask, new Object[]{"SWS", "dCr", 'S', OrePrefixes.screw.get(Materials.Iron), 'W', OrePrefixes.plank.get(Materials.Wood), 'C', OrePrefixes.slab.get(Materials.Cobblestone)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.BasicWaterPump.get(1L), bitsd, new Object[]{"RPS", "OWd", "CHC", 'O', OrePrefixes.rotor.get(Materials.Iron), 'S', OrePrefixes.screw.get(Materials.Iron), 'R', OrePrefixes.ring.get(Materials.Iron), 'P', OrePrefixes.pipeMedium.get(Materials.Wood), 'H', GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Wood, 1), 'W', OrePrefixes.plank.get(Materials.Wood), 'C', OrePrefixes.slab.get(Materials.Cobblestone)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Hatch_Output_Pump.get(1L), bitsd, new Object[]{"SRd", "WHW", "CRC", 'S', OrePrefixes.screw.get(Materials.Iron), 'R', OrePrefixes.ring.get(Materials.Iron), 'H', GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Wood, 1), 'W', OrePrefixes.plank.get(Materials.Wood), 'C', OrePrefixes.slab.get(Materials.Cobblestone)});
        //WaterDrill
        GT_ModHandler.addCraftingRecipe(GT_ItemList.WaterDrill.get(1L), bitsd, new Object[]{"BDB", "GPG", "CHC", 'B', GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Steel, 1), 'D', GT_OreDictUnificator.get(OrePrefixes.toolHeadDrill, Materials.Steel, 1), 'G', GT_OreDictUnificator.get(OrePrefixes.gearGt, Materials.Steel, 1), 'P', OrePrefixes.pipeHuge.get(Materials.Steel), 'C', OrePrefixes.circuit.get(Materials.Good), 'H', ItemList.Hull_MV});

        //Diodes 2A
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_2A_ULV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.WroughtIron), 'W', OrePrefixes.cableGt02.get(Materials.Lead), 'S', OrePrefixes.wireFine.get(Materials.Lead), 'C', ItemList.Casing_ULV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_2A_LV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.Steel), 'W', OrePrefixes.cableGt02.get(Materials.Tin), 'S', OrePrefixes.wireFine.get(Materials.Tin), 'C', ItemList.Casing_LV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_2A_MV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.Birmabright), 'W', OrePrefixes.cableGt02.get(Materials.Copper), 'S', OrePrefixes.wireFine.get(Materials.Copper), 'C', ItemList.Casing_MV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_2A_HV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.StainlessSteel), 'W', OrePrefixes.cableGt02.get(Materials.Electrum), 'S', OrePrefixes.wireFine.get(Materials.Electrum), 'C', ItemList.Casing_HV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_2A_EV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.BT6), 'W', OrePrefixes.cableGt02.get(Materials.Aluminium), 'S', OrePrefixes.wireFine.get(Materials.Aluminium), 'C', ItemList.Casing_EV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_2A_IV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.HastelloyC276), 'W', OrePrefixes.cableGt02.get(Materials.TungstenSteel), 'S', OrePrefixes.wireFine.get(Materials.TungstenSteel), 'C', ItemList.Casing_IV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_2A_LuV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.HastelloyN), 'W', OrePrefixes.cableGt02.get(Materials.YttriumBariumCuprate), 'S', OrePrefixes.wireFine.get(Materials.YttriumBariumCuprate), 'C', ItemList.Casing_LuV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_2A_ZPM.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.Lafium), 'W', OrePrefixes.cableGt02.get(Materials.Naquadah), 'S', OrePrefixes.wireFine.get(Materials.Naquadah), 'C', ItemList.Casing_ZPM});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_2A_UV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.CinobiteA243), 'W', OrePrefixes.cableGt02.get(Materials.ElectrumFlux), 'S', OrePrefixes.wireFine.get(Materials.ElectrumFlux), 'C', ItemList.Casing_UV});

        //Diodes 4A
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_4A_ULV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.WroughtIron), 'W', OrePrefixes.cableGt04.get(Materials.Lead), 'S', OrePrefixes.springSmall.get(Materials.Lead), 'C', ItemList.Casing_ULV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_4A_LV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.Steel), 'W', OrePrefixes.cableGt04.get(Materials.Tin), 'S', OrePrefixes.springSmall.get(Materials.Tin), 'C', ItemList.Casing_LV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_4A_MV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.Birmabright), 'W', OrePrefixes.cableGt04.get(Materials.Copper), 'S', OrePrefixes.springSmall.get(Materials.Copper), 'C', ItemList.Casing_MV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_4A_HV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.StainlessSteel), 'W', OrePrefixes.cableGt04.get(Materials.Electrum), 'S', OrePrefixes.springSmall.get(Materials.Electrum), 'C', ItemList.Casing_HV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_4A_EV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.BT6), 'W', OrePrefixes.cableGt04.get(Materials.Aluminium), 'S', OrePrefixes.springSmall.get(Materials.Aluminium), 'C', ItemList.Casing_EV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_4A_IV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.HastelloyC276), 'W', OrePrefixes.cableGt04.get(Materials.TungstenSteel), 'S', OrePrefixes.springSmall.get(Materials.TungstenSteel), 'C', ItemList.Casing_IV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_4A_LuV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.HastelloyN), 'W', OrePrefixes.cableGt04.get(Materials.YttriumBariumCuprate), 'S', OrePrefixes.springSmall.get(Materials.YttriumBariumCuprate), 'C', ItemList.Casing_LuV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_4A_ZPM.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.Lafium), 'W', OrePrefixes.cableGt04.get(Materials.Naquadah), 'S', OrePrefixes.springSmall.get(Materials.Naquadah), 'C', ItemList.Casing_ZPM});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_4A_UV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.CinobiteA243), 'W', OrePrefixes.cableGt04.get(Materials.ElectrumFlux), 'S', OrePrefixes.springSmall.get(Materials.ElectrumFlux), 'C', ItemList.Casing_UV});

        //Diodes 16A
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_16A_ULV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.WroughtIron), 'W', OrePrefixes.cableGt16.get(Materials.Lead), 'S', OrePrefixes.spring.get(Materials.Lead), 'C', ItemList.Casing_ULV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_16A_LV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.Steel), 'W', OrePrefixes.cableGt16.get(Materials.Tin), 'S', OrePrefixes.spring.get(Materials.Tin), 'C', ItemList.Casing_LV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_16A_MV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.Birmabright), 'W', OrePrefixes.cableGt16.get(Materials.Copper), 'S', OrePrefixes.spring.get(Materials.Copper), 'C', ItemList.Casing_MV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_16A_HV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.StainlessSteel), 'W', OrePrefixes.cableGt16.get(Materials.Electrum), 'S', OrePrefixes.spring.get(Materials.Electrum), 'C', ItemList.Casing_HV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_16A_EV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.BT6), 'W', OrePrefixes.cableGt16.get(Materials.Aluminium), 'S', OrePrefixes.spring.get(Materials.Aluminium), 'C', ItemList.Casing_EV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_16A_IV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.HastelloyC276), 'W', OrePrefixes.cableGt16.get(Materials.TungstenSteel), 'S', OrePrefixes.spring.get(Materials.TungstenSteel), 'C', ItemList.Casing_IV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_16A_LuV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.HastelloyN), 'W', OrePrefixes.cableGt16.get(Materials.YttriumBariumCuprate), 'S', OrePrefixes.spring.get(Materials.YttriumBariumCuprate), 'C', ItemList.Casing_LuV});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_16A_ZPM.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.Lafium), 'W', OrePrefixes.cableGt16.get(Materials.Naquadah), 'S', OrePrefixes.spring.get(Materials.Naquadah), 'C', ItemList.Casing_ZPM});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Diode_16A_UV.get(1L), 0, new Object[]{"PSP", "WCW", 'P', OrePrefixes.plate.get(Materials.CinobiteA243), 'W', OrePrefixes.cableGt16.get(Materials.ElectrumFlux), 'S', OrePrefixes.spring.get(Materials.ElectrumFlux), 'C', ItemList.Casing_UV});

        //White Concrete
        GT_ModHandler.addCraftingRecipe(Blockstack(UtilBlock, 8, 2), tBitMask, new Object[]{"CCC", "CDC", "CCC", 'C', Blockstack(UtilBlock, 1, 0), 'D', Dyes.dyeWhite});

        // --- Long Distance Pipeline
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Long_Distance_Pipeline_Fluid.get(1L),tBitMask, new Object[]{"GPG", "IwI", "GPG", 'G', GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Steel, 1L), 'P', GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 1L), 'I', GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.Steel, 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Long_Distance_Pipeline_Item.get(1L), tBitMask, new Object[]{"GPG", "IwI", "GPG",'G' ,GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Steel, 1L), 'P', GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 1L), 'I', GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.Tin, 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Long_Distance_Pipeline_Fluid_Pipe.get(32L), tBitMask, new Object[]{"PPP", "IwI", "PPP", 'P',GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 1L), 'I', GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Steel, 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ItemList.Long_Distance_Pipeline_Item_Pipe.get(32L), tBitMask, new Object[]{"PPP", "IwI", "PPP", 'P',GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 1L), 'I', GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Tin, 1L)});
    }

    private void furnace() {
        GT_ModHandler.addSmeltingRecipe(CoreItems2.getRecipe(UnfiredClayBrick.getMetaID(), 1), new ItemStack(Items.brick, 1, 0));
        GT_ModHandler.addSmeltingRecipe(CoreItems2.getRecipe(UnfiredSearedBrick.getMetaID(), 1), GT_ModHandler.getModItem("TConstruct", "materials", 1L, 2));
        GT_ModHandler.addSmeltingRecipe(CoreItems2.getRecipe(UnfiredCokeOvenBrick.getMetaID(), 1), CoreItems2.getRecipe(CokeOvenBrick.getMetaID(), 1));

    }

    private void unboxing() {
        RA.addUnboxingRecipe(GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 0),
                ItemList.Cover_SolarPanel_8V.get(1L), GT_ItemList.ULVRobotArm.get(1L), 800, 1);
        RA.addUnboxingRecipe(GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 1),
                ItemList.Cover_SolarPanel_LV.get(1L), ItemList.Robot_Arm_LV.get(1L), 1000, 2);
        RA.addUnboxingRecipe(GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 2),
                ItemList.Cover_SolarPanel_MV.get(1L), ItemList.Robot_Arm_MV.get(1L), 1200, 4);
        RA.addUnboxingRecipe(GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 3),
                ItemList.Cover_SolarPanel_HV.get(1L), ItemList.Robot_Arm_HV.get(1L), 1400, 16);
        RA.addUnboxingRecipe(GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 4),
                ItemList.Cover_SolarPanel_EV.get(1L), ItemList.Robot_Arm_EV.get(1L), 1600, 64);
        RA.addUnboxingRecipe(GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 5),
                ItemList.Cover_SolarPanel_IV.get(1L), ItemList.Robot_Arm_IV.get(1L), 1800, 256);
        RA.addUnboxingRecipe(GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 6),
                ItemList.Cover_SolarPanel_LuV.get(1L), ItemList.Robot_Arm_LuV.get(1L), 2000, 1024);
        RA.addUnboxingRecipe(GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 7),
                ItemList.Cover_SolarPanel_ZPM.get(1L), ItemList.Robot_Arm_ZPM.get(1L), 2200, 4096);
        RA.addUnboxingRecipe(GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 8),
                ItemList.Cover_SolarPanel_UV.get(1L), ItemList.Robot_Arm_UV.get(1L), 2400, 7680);

        RA.addUnboxingRecipe(
                GT_ModHandler.getModItem("impact", "impact_lapotronicenergyunit_block", 1, 1),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_LapotronicOrb.get(1L), 1600, 64);
        RA.addUnboxingRecipe(
                GT_ModHandler.getModItem("impact", "impact_lapotronicenergyunit_block", 1, 6),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.EnergyCrystal_IV.get(1L), 1600, 64);
        RA.addUnboxingRecipe(
                GT_ModHandler.getModItem("impact", "impact_lapotronicenergyunit_block", 1, 2),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_LapotronicOrb2.get(1L), 1800, 256);
        RA.addUnboxingRecipe(
                GT_ModHandler.getModItem("impact", "impact_lapotronicenergyunit_block", 1, 3),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_Module.get(1L), 2000, 1024);
        RA.addUnboxingRecipe(
                GT_ModHandler.getModItem("impact", "impact_lapotronicenergyunit_block", 1, 4),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_Cluster.get(1L), 2200, 4096);
        RA.addUnboxingRecipe(
                GT_ModHandler.getModItem("impact", "impact_lapotronicenergyunit_block", 1, 5),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.ZPM2.get(1L), 2400, 7680);
    }

    private void pulverizer() {
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "phobosblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustPhobos", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BandedIron, 1)},
                new int[]{10000, 5000}, 400, 64);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "phobosblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustPhobos", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BandedIron, 1)},
                new int[]{10000, 5000}, 400, 64);
        //GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "phobosblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustPhobos", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BandedIron, 1)}, new int[]{10000, 5000}, 400, 64);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "deimosblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustDeimos", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Magnesite, 1)},
                new int[]{10000, 5000}, 400, 64);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "deimosblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustDeimos", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Magnesite, 1)},
                new int[]{10000, 5000}, 400, 64);

        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "oberonblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustOberon", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1)},
                new int[]{10000, 2000, 1000, 850}, 400, 480);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "oberonblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustOberon", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1)},
                new int[]{10000, 2000, 1000, 850}, 400, 480);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "oberonblocks", 1L, 2),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustOberon", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1)},
                new int[]{10000, 2000, 1000, 850}, 400, 480);

        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "proteusblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustProteus", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Copper, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uraninite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)},
                new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "proteusblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustProteus", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Copper, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uraninite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)},
                new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "proteusblocks", 1L, 2),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustProteus", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Copper, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uraninite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)},
                new int[]{10000, 5000, 2500, 1000}, 400, 1024);

        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "makemakeblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMakeMake", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetRed, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetYellow, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)},
                new int[]{10000, 2500, 2500, 1000}, 400, 1920);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "makemakeblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMakeMake", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetRed, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetYellow, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)},
                new int[]{10000, 2500, 2500, 1000}, 400, 1920);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("Impact|GalacticModule", "haumeablocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustHaumea", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)},
                new int[]{10000, 5000, 2500, 850}, 400, 1920);

        RA
                .addPulveriserRecipe(GregTech_API.getStackofAmountFromOreDict("ingotCokeOvenBrick", 1),
                        new ItemStack[]{CoreItems.getRecipe(31, 1)}, new int[]{10000}, 300, 2);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("TConstruct", "materials", 1L, 2),
                new ItemStack[]{CoreItems.getRecipe(32, 1)}, new int[]{10000}, 300, 2);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("TConstruct", "GlassBlock", 1L, 0),
                new ItemStack[]{CoreItems.getRecipe(33, 1)}, new int[]{10000}, 300, 2);
        RA.addPulveriserRecipe(ItemList.Casing_BronzePlatedBricks.get(1),
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Bronze, 4L),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 1L)},
                new int[]{10000, 10000}, 300, 2);
    }

    private void printer3d() {
//Controllers
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.GumMetal, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 4),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L), ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.GumMetal, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Titaniolum, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Titaniolum, 16),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_PBE.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L), GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Zamak, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 4),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L), ItemList.Robot_Arm_IV.get(4L),
                ItemList.Emitter_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Zamak, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Duraluminium, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Duraluminium, 16),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_LaserEngraver.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel690, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L), ItemList.Robot_Arm_IV.get(4L),
                ItemList.Emitter_IV.get(4L), ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Inconel690, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Nitinol, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Nitinol, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Assembler.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 4),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Motor_IV.get(4L), ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Inconel792, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.TiBetaC, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.TiBetaC, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Centrifuge.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HastelloyC276, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 4),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HastelloyC276, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Zamak, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Zamak, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Electrolyzer.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Titaniolum, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 4),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Conveyor_Module_IV.get(4L), ItemList.Electric_Piston_IV.get(4L),
                ItemList.Robot_Arm_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Titaniolum, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Inconel690, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Inconel690, 16),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Wire.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.MaragingSteel250, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 4),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Motor_IV.get(4L), ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.MaragingSteel250, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Inconel792, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Inconel792, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Supply.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Nitinol, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L), ItemList.Electric_Pump_IV.get(4L),
                ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Nitinol, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.HastelloyC276, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HastelloyC276, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Utility.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Talonite, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L), ItemList.Electric_Pump_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Talonite, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Grisium, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Grisium, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Brewmenter.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Nitinol, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L), ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Nitinol, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Inconel690, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Inconel690, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Siftarator.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Nitinol60, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Nitinol60, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Kovar, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Kovar, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_ArcFurnace.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.TiBetaC, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L), ItemList.Electric_Pump_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.TiBetaC, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Talonite, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Talonite, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Extradifier.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Titaniolum, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Motor_IV.get(4L), ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Titaniolum, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.MaragingSteel250, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.MaragingSteel250, 16),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Mixer.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HastelloyC276, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Piston_IV.get(4L), ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HastelloyC276, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Mangalloy, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Mangalloy, 16),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Macerator.get(1L), null, 40 * 20, 7680);

        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.MaragingSteel300, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                ItemList.Electric_Motor_IV.get(4L), ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.MaragingSteel300, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Stellite, 4),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Stellite, 16),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSG, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_Cutting.get(1L), null, 40 * 20, 7680);

        //UpgradeCasingT1
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L),
                GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1, 3),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.GumMetal, 4),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Nitinol, 16),
                ItemList.Electric_Motor_IV.get(4L), ItemList.Electric_Piston_IV.get(4L),
                ItemList.Conveyor_Module_IV.get(4L), ItemList.Robot_Arm_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Graphene, 16),
                GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.TungstenSteel, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16)
        }, GT_ItemList.UpgradeCasingT1.get(1L), null, 80 * 20, 7680);

        RA.addPrimitiveLineRecipe(new ItemStack[]{
                GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiPart", 1L, 500),
                ItemList.Cover_ItemDetector.get(8L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Nitinol, 8),
                ItemList.Robot_Arm_IV.get(8L), GT_ItemList.DDDPrinterCasing3x3.get(9),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 16),
                GT_OreDictUnificator.get(OrePrefixes.gearGt, Materials.TungstenSteel, 16),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.GumMetal, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 64)
        }, GT_ItemList.DDDPrinterCasing4x4.get(16L), null, 200 * 20, 1920);

        //Machine_BlastSmelter
        RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Machine_Multi_BlastFurnace.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HSLA, 2),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 4),
                GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Kanthal, 4),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HSLA, 6),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Titanium, 16)
        }, GT_ItemList.Machine_BlastSmelter.get(1L), null, 40 * 20, 1920);

        //Machine_FreezSolidifier
        RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Machine_Multi_VacuumFreezer.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.BlueSteel, 2),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 4),
                GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.StainlessSteel, 4),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Aluminium, 6),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Titanium, 16)
        }, GT_ItemList.Machine_FreezSolidifier.get(1L), null, 40 * 20, 1920);

        //AdvancedFreezer
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_ZPM.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Lafium, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 6),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Iridium, 8),
                ItemList.Electric_Pump_ZPM.get(4L), ItemList.Robot_Arm_ZPM.get(4L),
                ItemList.Reactor_Coolant_Le_3.get(1L), ItemList.Reactor_Coolant_Le_3.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.pipeMedium, Materials.Enderium, 8),
                GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.Osmiridium, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 64)
        }, GT_ItemList.AdvVacuumFreezer.get(1L), null, 200 * 20, 122880);

        //AdvancedEBF
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_ZPM.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Lafium, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 6),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Iridium, 8),
                ItemList.Conveyor_Module_ZPM.get(4L), ItemList.Robot_Arm_ZPM.get(4L),
                ItemList.Casing_Coil_Superconductor.get(8L), ItemList.Casing_Coil_NaquadahAlloy.get(16L),
                GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Naquadah, 16),
                GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.Osmiridium, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 64)
        }, GT_ItemList.Machine_EIF.get(1L), null, 200 * 20, 122880);

        //LapatronicSupercapacitor
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L), ItemList.Battery_TurboCharger_4by4_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.HastelloyC276, 6),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 8),
                ItemList.Circuit_Chip_HPIC.get(16L),
                GT_OreDictUnificator.get(OrePrefixes.spring, Materials.Platinum, 16),
                ItemList.Reactor_Coolant_He_6.get(1L), ItemList.Reactor_Coolant_He_6.get(1L),
                ItemList.Electric_Pump_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.pipeSmall, Materials.Inconel690, 8),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Kovar, 16),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.TungstenSteel, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSG, 64)
        }, GT_ItemList.LapPowerStation.get(1L), null, 200 * 20, 4096);

        //LapotronicCapacitorIV
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_LapotronicOrb.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Platinum, 8),
                ItemList.Circuit_Chip_PIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.TungstenSteel, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HastelloyC276, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSG, 64)
        }, new ItemStack(lscLapotronicEnergyUnit, 1, 1), null, 100 * 20, 7680);

        //Energium Orb Capacitor
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.EnergyCrystal_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Platinum, 8),
                ItemList.Circuit_Chip_PIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.TungstenSteel, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HastelloyC276, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSG, 64)
        }, new ItemStack(lscLapotronicEnergyUnit, 1, 6), null, 100 * 20, 7680);

        //LapotronicCapacitorLuV
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_LapotronicOrb2.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NiobiumTitanium, 8),
                ItemList.Circuit_Chip_HPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.YttriumBariumCuprate, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HastelloyN, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 64)
        }, new ItemStack(lscLapotronicEnergyUnit, 1, 2), null, 120 * 20, 30720);

        //LapotronicCapacitorZPM
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_Module.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Osmiridium, 8),
                ItemList.Circuit_Chip_UHPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Naquadah, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Lafium, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSS, 64)
        }, new ItemStack(lscLapotronicEnergyUnit, 1, 3), null, 140 * 20, 122880);

        //LapotronicCapacitorUV
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_Cluster.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NaquadahAlloy, 8),
                ItemList.Circuit_Chip_NPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Duranium, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.CinobiteA243, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Tritanium, 64)
        }, new ItemStack(lscLapotronicEnergyUnit, 1, 4), null, 160 * 20, 500000);

        //LapotronicCapacitorUHV
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.ZPM2.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Americium, 8),
                ItemList.Circuit_Chip_PPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Europium, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Pikyonium64B, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Neutronium, 64)
        }, new ItemStack(lscLapotronicEnergyUnit, 1, 5), null, 180 * 20, 2000000);

        //Mysterious Crystal Orb Capacitor
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.MysteriousCrystalOrb.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Americium, 8),
                ItemList.Circuit_Chip_PPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Europium, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Pikyonium64B, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Neutronium, 64)
        }, new ItemStack(lscLapotronicEnergyUnit, 1, 7), null, 180 * 20, 2000000);

        //Mysterious Crystal Module Capacitor
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.MysteriousCrystalModule.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Americium, 8),
                ItemList.Circuit_Chip_QPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Draconium, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Quantum, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Phoenixite, 64)
        }, new ItemStack(lscLapotronicEnergyUnit, 1, 8), null, 200 * 20, 8000000);

        //AdvancedPyrolyseOven
        RA.addPrimitiveLineRecipe(new ItemStack[]{
                GT_ItemList.Pyrolyse.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HSLA, 2),
                ItemList.Electric_Pump_EV.get(2L),
                ItemList.Electric_Piston_EV.get(2L),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 4),
                GT_OreDictUnificator.get(OrePrefixes.pipeNonuple, Materials.StainlessSteel, 4),
                GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Kanthal, 6),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HSLA, 6),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Titanium, 16)
        }, GT_ItemList.AdvPyrolyse.get(1L), null, 60 * 20, 1920);

        //Naquadah Chamber Part
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.NaquadahAlloy, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.TungstenSteel, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.GumMetal, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.Desh, 8),
                GT_OreDictUnificator.get(OrePrefixes.ring, Materials.TungstenCarbide, 16),
                GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Talonite, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSS, 32)
        }, CoreItems2.getRecipe(163, 1), null, 30 * 20, 7680);

        //Tachyon Tube
        RA.addBasicLineRecipe(new ItemStack[]{
                CoreItems2.getRecipe(163, 3), CoreItems2.getRecipe(161, 4),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Naquadria, 32),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NiobiumTitanium, 32),
                GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Trinium, 32),
                GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Iridium, 32),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.NaquadahAlloy, 32)
        }, CoreItems2.getRecipe(162, 1), null, 40 * 20, 7680);

        //Cyclone Chamber Casing
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_ItemList.CycloneCasing.get(1), ItemList.Electric_Motor_LuV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.MaragingSteel250, 2),
                GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.MaragingSteel300, 2),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 4),
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Inconel792, 4),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.TiBetaC, 6),
                GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Inconel690, 12),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSS, 16)
        }, new ItemStack(InsideBlock, 1, 1), null, 60 * 20, 30720);

        //3DPrinter 4x4
        RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Machine_IV_Printer.get(1L),
                GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiPart", 1L, 500),
                ItemList.Conveyor_Module_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Inconel690, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 6),
                GT_OreDictUnificator.get(OrePrefixes.gearGt, Materials.TungstenSteel, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HastelloyC276, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_AdvDDDPrinter.get(1L), null, 50 * 20, 1920);

        //Communication Tower
        RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Hull_HV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 4),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.StainlessSteel, 4),
                ItemList.Tool_DataStick.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HSLA, 4),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedSteel, 8),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.BlueSteel, 8)
        }, GT_ItemList.Communication_Tower.get(1L), null, 40 * 20, 480);
        //Space Satelitte
        RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Hull_HV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 4),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.StainlessSteel, 4),
                GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingUnit", 4L, 1),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.VanadiumSteel, 4),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedSteel, 8),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.BlueSteel, 8)
        }, GT_ItemList.Space_Satellite.get(1L), null, 50 * 20, 480);

        //Space Elevator
        RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Hull_EV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 4),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HSLA, 4),
                GT_ModHandler.getModItem("EnderIO", "blockTravelAnchor", 2L, 0),
                ItemList.Conveyor_Module_EV.get(8L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Vanadium, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSLA, 32),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Titanium, 32)
        }, GT_ItemList.Space_Elevator.get(1L), null, 60 * 20, 1920);

        //Nuclear Reactor I
        RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Hull_EV.get(1L), ItemList.Robot_Arm_EV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Titanium, 2),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 4),
                GT_ModHandler.getModItem("IC2", "reactorPlatingExplosive", 8), GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 8)
        }, GT_ItemList.Nuclear_Reactor_I.get(1), null, 30 * 20, 1920);

        //Nuclear Reactor II
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L), ItemList.Robot_Arm_IV.get(2L),
                GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Titanium, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 6),
                GT_ModHandler.getModItem("IC2", "reactorPlatingExplosive", 8), CoreItems2.getRecipe(141, 8),
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 10)
        }, GT_ItemList.Nuclear_Reactor_II.get(1), null, 50 * 20, 7680);

        //Nuclear Reactor III
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_LuV.get(1L), ItemList.Robot_Arm_LuV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Titanium, 8),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 8),
                GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.TungstenSteel, 8),
                CoreItems2.getRecipe(142, 8), GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 12)
        }, GT_ItemList.Nuclear_Reactor_III.get(1), null, 80 * 20, 30720);

        //Huge Steam Turbine
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L), ItemList.Electric_Pump_IV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.gearGt, Materials.TiBetaC, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 6),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Titaniolum, 8),
                GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.Inconel690, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.Inconel792, 8),
                GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Desh, 8),
                GT_OreDictUnificator.get(OrePrefixes.round, Materials.HSSG, 16),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Inconel792, 16)
        }, GT_ItemList.Huge_Steam_Turbine.get(1L), null, 60 * 20, 7680);

        //MultiChemicalReactor
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_LuV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Talonite, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 8),
                ItemList.Electric_Pump_LuV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Talonite, 8),
                GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.Polytetrafluoroethylene, 4),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Inconel792, 4),
                GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Grisium, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_ChemicalReactor.get(1L), null, 80 * 20, 30720);

        //MultiDistillationTower
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_LuV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.MaragingSteel250, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 8),
                ItemList.Electric_Pump_LuV.get(8L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.TiBetaC, 8),
                GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.NiobiumTitanium, 4),
                GT_OreDictUnificator.get(OrePrefixes.spring, Materials.Tungsten, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_DistTower.get(1L), null, 80 * 20, 30720);

        //ElectricImplosionCompressor
        RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_LuV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Kovar, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 8),
                ItemList.Electric_Piston_LuV.get(8L),
                GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Zamak, 8),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSG, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGt, Materials.Titaniolum, 8),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Titaniolum, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 16),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
        }, GT_ItemList.Machine_ElectricImplosion.get(1L), null, 80 * 20, 30720);

    }

    private void mixer() {
        //HastelloyC276
        RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Nickel, 32L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Molybdenum, 8L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Chrome, 7L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cobalt, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tungsten, 1L),
                GT_Utility.getIntegratedCircuit(6), GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HastelloyC276, 49L), 150 * 20, 1920);
        //Potin
        RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Copper, 6L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tin, 2L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lead, 1L), GT_Values.NI, GT_Values.NI,
                GT_Utility.getIntegratedCircuit(3), GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Potin, 9L), 20 * 20, 8);
        //EglinSteel
        RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Iron, 5L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Invar, 5L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 4L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sulfur, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Carbon, 1L),
                GT_Utility.getIntegratedCircuit(3), GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EglinSteel, 16L), 30 * 20, 16);

        RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Neutronium, 1L),
                        GT_Utility.getIntegratedCircuit(1), GT_Values.NI, GT_Values.NI,
                        Materials.Helium.getPlasma(125), GT_Values.NF, CoreItems.getRecipe(34, 1), 200,
                        122880);

        RA.addMixerRecipe(CoreItems.getRecipe(28, 64), Materials.DeepIron.getDust(64),
                Materials.EuropiumoxideMagnetic.getDust(21), Materials.ChromiumTrioxide.getDust(64),
                GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.GarnetRed, 54L),
                GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.Opal, 47L), GT_Values.NF,
                GT_Values.NF, CoreItems.getRecipe(36, 1), 3600, 262144);
        RA.addMixerRecipe(CoreItems.getRecipe(35, 64), Materials.DeepIron.getDust(64),
                Materials.EuropiumoxideMagnetic.getDust(21), Materials.ChromiumTrioxide.getDust(64),
                GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.GarnetRed, 54L),
                GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.Opal, 47L), GT_Values.NF,
                GT_Values.NF, CoreItems.getRecipe(36, 1), 3600, 262144);

        RA.addMixerRecipe(CoreItems.getRecipe(28, 8), Materials.MysteriousCrystal.getDust(2),
                Materials.Oriharukon.getDust(2), Materials.BlackPlutonium.getDustTiny(1),
                GT_Utility.getIntegratedCircuit(1), GT_Values.NI, Materials.Mutagen.getFluid(2000),
                Materials.BioMediumRaw.getFluid(1000), Materials.Diamond.getDustSmall(2), 200, 122880);
        RA.addMixerRecipe(CoreItems.getRecipe(35, 8), Materials.MysteriousCrystal.getDust(2),
                Materials.Oriharukon.getDust(2), Materials.BlackPlutonium.getDustTiny(1),
                GT_Utility.getIntegratedCircuit(1), GT_Values.NI, Materials.Mutagen.getFluid(2000),
                Materials.BioMediumRaw.getFluid(1000), Materials.Diamond.getDustSmall(2), 200, 122880);
        RA.addMixerRecipe(CoreItems.getRecipe(28, 32), Materials.MysteriousCrystal.getDust(8),
                Materials.Oriharukon.getDust(8), Materials.InfinityCatalyst.getDustTiny(1),
                GT_Utility.getIntegratedCircuit(2), GT_Values.NI, Materials.Mutagen.getFluid(8000),
                Materials.BioMediumRaw.getFluid(8000), Materials.Diamond.getDustTiny(2), 400, 122880);
        RA.addMixerRecipe(CoreItems.getRecipe(35, 32), Materials.MysteriousCrystal.getDust(8),
                Materials.Oriharukon.getDust(8), Materials.InfinityCatalyst.getDustTiny(1),
                GT_Utility.getIntegratedCircuit(2), GT_Values.NI, Materials.Mutagen.getFluid(8000),
                Materials.BioMediumRaw.getFluid(8000), Materials.Diamond.getDustTiny(2), 400, 122880);

        RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 2L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gypsum, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Calcite, 1L),
                GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, CoreItems.getRecipe(37, 4),
                200, 8);
        RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 2L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gypsum, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Marble, 1L),
                GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, CoreItems.getRecipe(37, 4),
                200, 8);

        RA.addMixerRecipe(GregTech_API.getStackofAmountFromOreDict("dustZirconium", 1),
                Itemstack(Core_Items.getInstance(), 1, 40), null, null, null,
                GT_Utility.getIntegratedCircuit(2), null, null, Itemstack(Core_Items.getInstance(), 2, 42),
                400, 96);
        RA.addMixerRecipe(GregTech_API.getStackofAmountFromOreDict("dustCerium", 9),
                GregTech_API.getStackofAmountFromOreDict("dustGadolinium", 1), null, null, null,
                GT_Utility.getIntegratedCircuit(2), null, null, Itemstack(Core_Items.getInstance(), 10, 43),
                400, 96);
        RA.addMixerRecipe(GregTech_API.getStackofAmountFromOreDict("dustLanthanum", 15),
                GregTech_API.getStackofAmountFromOreDict("dustStrontium", 13),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Iron, 8),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cobalt, 2), null,
                GT_Utility.getIntegratedCircuit(2), null, null, Itemstack(Core_Items.getInstance(), 38, 44),
                400, 96);
    }

    private void lathe() {
        RA.addLatheRecipe(new ItemStack(Blocks.cobblestone), CoreItems2.getRecipe(177, 2), null, 100,
                16);
        RA.addLatheRecipe(new ItemStack(Blocks.sandstone), CoreItems2.getRecipe(178, 2), null, 100,
                16);
    }

    private void implosionCompressor() {
        RA.addImplosionRecipe(CoreItems2.getRecipe(97, 1), 5,
                GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 4),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.StainlessSteel, 1L));
        RA.addImplosionRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Coal, 1L), 1,
                GT_ModHandler.getModItem("GalaxySpace", "item.CompressedCoal", 1L, 0),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Aluminium, 2L), 1,
                CoreItems2.getRecipe(176, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Bronze, 2L),
                1, CoreItems2.getRecipe(175, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));

        RA.addImplosionRecipe(CoreItems2.getRecipe(74, 3), 1, CoreItems2.getRecipe(78, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(75, 3), 1, CoreItems2.getRecipe(82, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(76, 3), 1, CoreItems2.getRecipe(83, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(GT_ModHandler.getModItem("IC2", "itemPartIridium", 3L), 2,
                CoreItems2.getRecipe(81, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
        RA.addImplosionRecipe(GT_ModHandler.getModItem("GalacticraftMars", "item.null", 2L, 5), 1,
                CoreItems2.getRecipe(90, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(80, 2), 1, CoreItems2.getRecipe(91, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(81, 2), 2, CoreItems2.getRecipe(92, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
        RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.MeteoricIron, 2L), 1,
                CoreItems2.getRecipe(93, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(83, 2), 1, CoreItems2.getRecipe(94, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(85, 2), 1, CoreItems2.getRecipe(95, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Titanium, 2L), 1,
                CoreItems2.getRecipe(96, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(ItemList.Ingot_Heavy1.get(1L), 8,
                GT_ModHandler.getModItem("GalacticraftCore", "item.heavyPlating", 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.StainlessSteel, 2L));
        RA.addImplosionRecipe(ItemList.Ingot_Heavy2.get(1L), 8,
                GT_ModHandler.getModItem("GalacticraftMars", "item.null", 1L, 3),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 2L));
        RA.addImplosionRecipe(ItemList.Ingot_Heavy3.get(1L), 8,
                GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.TungstenSteel, 2L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(16, 1), 8, CoreItems2.getRecipe(11, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chrome, 2L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(17, 1), 8, CoreItems2.getRecipe(12, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 2L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(18, 1), 8, CoreItems2.getRecipe(13, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 2L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(19, 1), 8, CoreItems2.getRecipe(14, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neutronium, 2L));
        RA.addImplosionRecipe(CoreItems2.getRecipe(20, 1), 8, CoreItems2.getRecipe(15, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Phoenixite, 2L));
        RA.addImplosionRecipe(GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 1L),
                1, CoreItems2.getRecipe(171, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Nickel, 1L),
                1, GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 2),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Oriharukon, 1L), 1,
                CoreItems2.getRecipe(173, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Platinum, 1L), 1,
                CoreItems2.getRecipe(172, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Adamantium, 1L), 1,
                CoreItems2.getRecipe(174, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        RA.addImplosionRecipe(GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Cobalt, 1L),
                1, GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 0),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));

        RA.addImplosionRecipe(ItemList.Ingot_IridiumAlloy.get(1L), 8,
                GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Iridium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 1L));
    }

    private void formingPress() {
//Spatial Chip
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(ItemList.Circuit_Parts_Crystal_Chip_Master.get(1L)),
                GT_ItemList.RedstonePulsatingChipset.get(1L), GT_ItemList.PulsatingSpatialCoreChip.get(1L),
                300, 7680);
        //Fluid Chips
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(ItemList.Circuit_Parts_Crystal_Chip_Master.get(1L)),
                GT_ItemList.RedstoneGoldChipset.get(1L), GT_ItemList.GoldFluidCoreChip.get(1L), 300, 1024);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(ItemList.Circuit_Parts_Crystal_Chip_Master.get(1L)),
                GT_ItemList.RedstoneDiamondChipset.get(1L), GT_ItemList.DiamondFluidCoreChip.get(1L), 300,
                1920);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(ItemList.Circuit_Parts_Crystal_Chip_Master.get(1L)),
                GT_ItemList.RedstoneEmeraldChipset.get(1L),
                GT_ItemList.EmeraldAdvancedFluidCoreChip.get(1L), 300, 4096);
        //Item Chips
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(GT_ItemList.EngravedGoldChip.get(1L)),
                        GT_ItemList.RedstoneGoldChipset.get(1L), GT_ItemList.GoldCoreChip.get(1L), 300, 480);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(GT_ItemList.EngravedDiamondCrystalChip.get(1L)),
                GT_ItemList.RedstoneDiamondChipset.get(1L), GT_ItemList.DiamondCoreChip.get(1L), 300, 1920);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(GT_ItemList.EngravedEnergyChip.get(1L)),
                        GT_ItemList.RedstoneEmeraldChipset.get(1L), GT_ItemList.EmeraldAdvancedCoreChip.get(1L),
                        300, 4096);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(GT_ItemList.EngravedQuantumChip.get(1L)),
                        GT_ItemList.RedstoneEmeraldChipset.get(1L),
                        GT_ItemList.EmeraldHighAdvancedCoreChip.get(1L), 300, 7680);
        //Gendustry Chips
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(ItemList.Circuit_Parts_Crystal_Chip_Elite.get(1L)),
                GT_ItemList.RedstonePulsatingChipset.get(1L), GT_ItemList.GeneticCircuit.get(1L), 300,
                7680);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(ItemList.Circuit_Parts_Crystal_Chip_Elite.get(1L)),
                GT_ItemList.RedstoneDiamondChipset.get(1L), GT_ItemList.EnvironmentalCircuit.get(1L), 300,
                7680);
        //Redstone Chips
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.EnderPearl, 1L),
                GT_ItemList.RedstoneRedChipset.get(1L), GT_ItemList.RedstonePulsatingChipset.get(2L), 200,
                120);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.NetherQuartz, 1L),
                GT_ItemList.RedstoneRedChipset.get(1L), GT_ItemList.RedstoneQuartzChipset.get(1L), 300,
                120);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 1L),
                        GT_ItemList.RedstoneRedChipset.get(1L), GT_ItemList.RedstoneIronChipset.get(1L), 100,
                        120);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Gold, 1L),
                        GT_ItemList.RedstoneRedChipset.get(1L), GT_ItemList.RedstoneGoldChipset.get(1L), 200,
                        120);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Diamond, 1L),
                        GT_ItemList.RedstoneRedChipset.get(1L), GT_ItemList.RedstoneDiamondChipset.get(1L), 100,
                        480);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Emerald, 1L),
                        GT_ItemList.RedstoneRedChipset.get(1L), GT_ItemList.RedstoneEmeraldChipset.get(1L), 150,
                        480);

        GT_Values.RA
                .addFormingPressRecipe(CoreItems.getRecipe(2, 4), ItemList.Shape_Extruder_Ingot.get(0L),
                        CoreItems2.getRecipe(70, 1), 200, 120);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.MysteriousCrystal, 4L),
                ItemList.Shape_Extruder_Ingot.get(0L), CoreItems2.getRecipe(73, 1), 300, 480);

        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Aluminium, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                        CoreItems2.getRecipe(101, 1), 600, 120);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Titanium, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                        CoreItems2.getRecipe(102, 1), 600, 480);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Tungsten, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                        CoreItems2.getRecipe(103, 1), 600, 1920);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 2L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                CoreItems2.getRecipe(104, 1), 600, 7680);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Chrome, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                        CoreItems2.getRecipe(105, 1), 600, 30720);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iridium, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                        CoreItems2.getRecipe(106, 1), 600, 122880);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Naquadria, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                        CoreItems2.getRecipe(107, 1), 600, 500000);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 2L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                CoreItems2.getRecipe(108, 1), 600, 2000000);

        // --- Leather
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Rubber, 4L),
                        ItemList.Shape_Mold_Plate.get(0), new ItemStack(Items.leather, 1), 800, 16);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.StyreneButadieneRubber, 4L),
                ItemList.Shape_Mold_Plate.get(0), new ItemStack(Items.leather, 1), 800, 16);
        GT_Values.RA
                .addFormingPressRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Silicone, 4L),
                        ItemList.Shape_Mold_Plate.get(0), new ItemStack(Items.leather, 1), 800, 16);

    }

    private void fluidExtractor() {
        RA.addFluidExtractionRecipe(CoreItems.getRecipe(33, 1), null, Materials.Glass.getMolten(144),
                10000, 50, 30);
    }

    private void woodFarm() {
//Oak
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(OakScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 20L, 0),
                        GT_ModHandler.getModItem("minecraft", "log", 4L, 0),
                        GT_ModHandler.getModItem("minecraft", "sapling", 3L, 0),
                        GT_ModHandler.getModItem("minecraft", "sapling", 1L, 0),
                        GT_ModHandler.getModItem("minecraft", "apple", 2L, 0)},
                new int[]{10000, 5000, 9000, 5000, 10000}, 100, 120);
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(OakScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 20L, 0),
                        GT_ModHandler.getModItem("minecraft", "log", 4L, 0),
                        GT_ModHandler.getModItem("minecraft", "sapling", 4L, 0),
                        GT_ModHandler.getModItem("minecraft", "sapling", 2L, 0),
                        GT_ModHandler.getModItem("minecraft", "apple", 3L, 0),
                        GT_ModHandler.getModItem("minecraft", "leaves", 32L, 0)},
                new int[]{10000, 5000, 9500, 7500, 10000, 10000}, 300, 120);
        //Spruce
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(SpruceScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 30L, 1),
                        GT_ModHandler.getModItem("minecraft", "log", 5L, 1),
                        GT_ModHandler.getModItem("minecraft", "sapling", 4L, 1),
                        GT_ModHandler.getModItem("minecraft", "sapling", 1L, 1),
                        GT_ModHandler.getModItem("minecraft", "brown_mushroom", 1L, 0)},
                new int[]{10000, 6000, 9000, 2000, 500}, 160, 120);
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(SpruceScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 30L, 1),
                        GT_ModHandler.getModItem("minecraft", "log", 5L, 1),
                        GT_ModHandler.getModItem("minecraft", "sapling", 5L, 1),
                        GT_ModHandler.getModItem("minecraft", "sapling", 2L, 1),
                        GT_ModHandler.getModItem("minecraft", "brown_mushroom", 1L, 0),
                        GT_ModHandler.getModItem("minecraft", "leaves", 48L, 1)},
                new int[]{10000, 6000, 9500, 3000, 750, 10000}, 480, 120);
        //Birch
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(BirchScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 15L, 2),
                        GT_ModHandler.getModItem("minecraft", "log", 2L, 2),
                        GT_ModHandler.getModItem("minecraft", "sapling", 2L, 2),
                        GT_ModHandler.getModItem("minecraft", "sapling", 1L, 2),
                        GT_ModHandler.getModItem("minecraft", "sugar", 1L, 0)},
                new int[]{10000, 5000, 9000, 5000, 500}, 80, 120);
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(BirchScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 15L, 2),
                        GT_ModHandler.getModItem("minecraft", "log", 2L, 2),
                        GT_ModHandler.getModItem("minecraft", "sapling", 3L, 2),
                        GT_ModHandler.getModItem("minecraft", "sapling", 2L, 2),
                        GT_ModHandler.getModItem("minecraft", "sugar", 2L, 0),
                        GT_ModHandler.getModItem("minecraft", "leaves", 40L, 2)},
                new int[]{10000, 5000, 9500, 6000, 500, 10000}, 240, 120);
        //Jungle
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(JungleScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 25L, 3),
                        GT_ModHandler.getModItem("minecraft", "log", 3L, 3),
                        GT_ModHandler.getModItem("minecraft", "sapling", 3L, 3),
                        GT_ModHandler.getModItem("minecraft", "sapling", 2L, 3),
                        GT_ModHandler.getModItem("minecraft", "dye", 3L, 3)},
                new int[]{10000, 4000, 9000, 6000, 2000}, 120, 120);
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(JungleScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 25L, 3),
                        GT_ModHandler.getModItem("minecraft", "log", 3L, 3),
                        GT_ModHandler.getModItem("minecraft", "sapling", 5L, 3),
                        GT_ModHandler.getModItem("minecraft", "dye", 3L, 3),
                        GT_ModHandler.getModItem("minecraft", "vine", 5L, 0),
                        GT_ModHandler.getModItem("minecraft", "leaves", 24L, 3)},
                new int[]{10000, 4000, 9500, 2000, 10000, 10000}, 360, 120);
        //Acacia
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(AcaciaScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log2", 15L, 0),
                        GT_ModHandler.getModItem("minecraft", "log2", 4L, 0),
                        GT_ModHandler.getModItem("minecraft", "sapling", 2L, 4),
                        GT_ModHandler.getModItem("minecraft", "sapling", 1L, 4),
                        GT_ModHandler.getModItem("minecraft", "deadbush", 1L, 0)},
                new int[]{10000, 5000, 9000, 3000, 3000}, 140, 120);
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(AcaciaScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log2", 15L, 0),
                        GT_ModHandler.getModItem("minecraft", "log2", 4L, 0),
                        GT_ModHandler.getModItem("minecraft", "sapling", 3L, 4),
                        GT_ModHandler.getModItem("minecraft", "sapling", 2L, 4),
                        GT_ModHandler.getModItem("minecraft", "deadbush", 2L, 0),
                        GT_ModHandler.getModItem("minecraft", "leaves2", 36L, 0)},
                new int[]{10000, 5000, 9500, 4000, 4000, 10000}, 420, 120);
        //DarkOak
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(DarkOakScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log2", 20L, 1),
                        GT_ModHandler.getModItem("minecraft", "log2", 4L, 1),
                        GT_ModHandler.getModItem("minecraft", "sapling", 3L, 5),
                        GT_ModHandler.getModItem("minecraft", "sapling", 1L, 5),
                        GT_ModHandler.getModItem("minecraft", "apple", 2L, 0)},
                new int[]{10000, 5000, 9000, 5000, 10000}, 120, 120);
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(DarkOakScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log2", 20L, 1),
                        GT_ModHandler.getModItem("minecraft", "log2", 4L, 1),
                        GT_ModHandler.getModItem("minecraft", "sapling", 4L, 5),
                        GT_ModHandler.getModItem("minecraft", "sapling", 2L, 5),
                        GT_ModHandler.getModItem("minecraft", "apple", 3L, 0),
                        GT_ModHandler.getModItem("minecraft", "leaves2", 48L, 1)},
                new int[]{10000, 5000, 9500, 6000, 10000, 10000}, 360, 120);
        //Rubber
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(RubberScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("IC2", "blockRubWood", 10L, 0),
                        GT_ModHandler.getModItem("IC2", "blockRubWood", 2L, 0),
                        GT_ModHandler.getModItem("IC2", "blockRubSapling", 2L, 0),
                        GT_ModHandler.getModItem("IC2", "blockRubSapling", 1L, 0),
                        GT_ModHandler.getModItem("IC2", "itemHarz", 3L, 0)},
                new int[]{10000, 4000, 9000, 4000, 10000}, 170, 120);
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(RubberScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("IC2", "blockRubWood", 10L, 0),
                        GT_ModHandler.getModItem("IC2", "blockRubWood", 2L, 0),
                        GT_ModHandler.getModItem("IC2", "blockRubSapling", 3L, 0),
                        GT_ModHandler.getModItem("IC2", "blockRubSapling", 2L, 0),
                        GT_ModHandler.getModItem("IC2", "itemHarz", 3L, 0),
                        GT_ModHandler.getModItem("IC2", "blockRubLeaves", 32L, 0)},
                new int[]{10000, 4000, 9500, 5000, 10000, 10000}, 510, 120);
        //Barnarda
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(BarnardaCScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 25L),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 3L),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaCsapling", 3L),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaCsapling", 2L),
                        GT_ModHandler.getModItem("GalaxySpace", "BarnardaCStrawberry", 3L)},
                new int[]{10000, 4000, 10000, 6000, 2000}, 200, 120);
        GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(BarnardaCScheme.getMetaID(), 0),
                CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
                Materials.Water.getFluid(1000L), GT_Values.NF,
                new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 25L),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 3L),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaCsapling", 5L),
                        GT_ModHandler.getModItem("GalaxySpace", "BarnardaCStrawberry", 3L),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelion3", 5L),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaCleaves", 24L)},
                new int[]{10000, 4000, 10000, 2000, 10000, 10000}, 400, 120);
    }

    private void extruder() {
        RA.addExtruderRecipe(CoreItems2.getRecipe(69, 1), ItemList.Shape_Extruder_Plate.get(0L),
                CoreItems2.getRecipe(74, 1), 200, 120);
        RA.addExtruderRecipe(CoreItems2.getRecipe(71, 1), ItemList.Shape_Extruder_Plate.get(0L),
                CoreItems2.getRecipe(75, 1), 200, 120);
        RA.addExtruderRecipe(CoreItems2.getRecipe(72, 1), ItemList.Shape_Extruder_Plate.get(0L),
                CoreItems2.getRecipe(76, 1), 300, 480);
    }

    private void extractor() {
        RA.addExtractorRecipe(CoreItems2.getRecipe(151, 64), CoreItems.getRecipe(35, 1), 400, 262144);
        RA.addExtractorRecipe(ItemList.Casing_CokeOvenBrick.get(1L), CoreItems2.getRecipe(65, 4), 300, 2);
    }

    private void ebf() {
        RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HastelloyC276, 1L),
                GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HastelloyC276, 1L), null,
                60 * 20, 1920, 3601);
        RA.addBlastRecipe(Itemstack(Core_Items.getInstance(), 16, 42),
                GT_Utility.getIntegratedCircuit(1), null, null, Itemstack(Core_Items.getInstance(), 1, 45),
                null, 20 * 300, 480, 3200);
        RA.addBlastRecipe(Itemstack(Core_Items.getInstance(), 16, 43),
                GT_Utility.getIntegratedCircuit(1), null, null, Itemstack(Core_Items.getInstance(), 1, 46),
                null, 20 * 300, 1920, 4200);
        RA.addBlastRecipe(Itemstack(Core_Items.getInstance(), 16, 44),
                GT_Utility.getIntegratedCircuit(1), null, null, Itemstack(Core_Items.getInstance(), 1, 47),
                null, 20 * 300, 7680, 4200);
    }

    private void centrifuge() {
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustPhobos", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BandedIron, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Bauxite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Molybdenite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Desh, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Plutonium, 1L),
                new int[]{5000, 2500, 1000, 750, 500, 150}, 600, 60);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustDeimos", 1),
                GT_Values.NI, GT_Values.NF, Materials.SulfuricAcid.getFluid(50L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Magnesite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Pitchblende, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Cooperite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neodymium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Tungstate, 1L),
                new int[]{5000, 3000, 1000, 750, 650, 350}, 600, 60);
        GT_Values.RA
                .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustCeres", 1), GT_Values.NI,
                        GT_Values.NF, GT_Values.NF,
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MeteoricIron, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Beryllium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Platinum, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Titanium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Tungsten, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
                        new int[]{5000, 2500, 1000, 750, 500, 150}, 800, 120);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustIceEuropa", 1),
                GT_Values.NI, GT_Values.NF, Materials.Oxygen.getGas(50L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ledox, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lazurite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Mithril, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Barium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
                new int[]{5000, 2500, 1250, 750, 500, 150}, 800, 120);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustEuropa", 1),
                GT_Values.NI, GT_Values.NF, Materials.Nitrogen.getGas(100L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.SiliconDioxide, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iron, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ledox, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Sodalite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Barium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium, 1L),
                new int[]{5000, 3000, 1000, 750, 500, 300}, 800, 120);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustGanymed", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chromite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Galena, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Diamond, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Palladium, 1L),
                new int[]{5000, 3000, 1000, 750, 600, 250}, 800, 120);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustCallisto", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GregTech_API.getStackofAmountFromOreDict("dustIceCallisto", 1),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Galena, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Topaz, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlueTopaz, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Lithium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Tungsten, 1L),
                new int[]{1500, 3000, 1000, 900, 750, 250}, 800, 120);
        GT_Values.RA
                .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustIo", 1), GT_Values.NI,
                        GT_Values.NF, Materials.SulfuricGas.getGas(100L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ruby, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gold, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Iridium, 1L),
                        new int[]{5000, 3000, 1000, 750, 500, 250}, 1000, 256);
        GT_Values.RA
                .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustVenus", 1), GT_Values.NI,
                        GT_Values.NF, Materials.CarbonDioxide.getGas(500L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Carbon, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Scheelite, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Amethyst, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.GarnetRed, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Mytryl, 1L),
                        new int[]{10000, 3000, 1000, 750, 500, 250}, 1000, 256);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustMercuryP", 1),
                GT_Values.NI, GT_Values.NF, Materials.Helium_3.getGas(50L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Vanadium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungstate, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Titanium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ruby, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Diamond, 1L),
                new int[]{5000, 3000, 1000, 750, 500, 250}, 1000, 256);
        GT_Values.RA
                .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustIceEnceladus", 1),
                        GT_Values.NI, GT_Values.NF, Materials.Oxygen.getGas(150L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MysteriousCrystal, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chrome, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ledox, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
                        new int[]{5000, 3000, 1000, 750, 400, 200}, 1200, 480);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustEnceladus", 1),
                GT_Values.NI, GT_Values.NF, Materials.Nitrogen.getGas(150L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chrome, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Opal, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
                new int[]{5000, 3000, 1000, 750, 400, 100}, 1200, 480);
        GT_Values.RA
                .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustTitan", 1), GT_Values.NI,
                        GT_Values.NF, Materials.Methane.getGas(100L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nickel, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Emerald, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gallium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
                        new int[]{5000, 2500, 1000, 900, 500, 200}, 1200, 480);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustOberon", 1),
                GT_Values.NI, GT_Values.NF, Materials.Argon.getGas(50L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium235, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Plutonium241, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
                new int[]{4000, 2000, 800, 300, 150, 150}, 1200, 480);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustMiranda", 1),
                GT_Values.NI, GT_Values.NF, Materials.Argon.getGas(50L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tin, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Desh, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Chrome, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Osmium, 1L),
                new int[]{4000, 2000, 1000, 750, 500, 350}, 1200, 480);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustTriton", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Niobium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Yttrium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gallium, 1L),
                new int[]{5000, 3000, 1000, 750, 500, 350}, 1400, 1024);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustProteus", 1),
                GT_Values.NI, GT_Values.NF, Materials.Radon.getGas(10L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Copper, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uraninite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Diamond, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Plutonium, 1L),
                new int[]{5000, 2500, 1000, 750, 500, 350}, 1400, 1024);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ledox, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
                new int[]{5000, 2500, 1250, 750, 500, 400}, 1600, 1920);
        GT_Values.RA
                .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustPluto", 1), GT_Values.NI,
                        GT_Values.NF, GT_Values.NF,
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.GarnetRed, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.GarnetYellow, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
                        new int[]{5000, 2500, 850, 500, 500, 300}, 1600, 1920);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustMakeMake", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetRed, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetYellow, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gallium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Yttrium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Niobium, 1L),
                new int[]{2500, 2500, 1000, 750, 500, 350}, 1600, 1920);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustHaumea", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Lanthanum, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Caesium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Cerium, 1L),
                new int[]{5000, 2500, 850, 750, 500, 450}, 1600, 1920);
        GT_Values.RA
                .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustSurfaceCentauriA", 1),
                        GT_Values.NI, GT_Values.NF, Materials.Mercury.getFluid(100L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Iridium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.InfinityCatalyst, 1L),
                        new int[]{5000, 3000, 1000, 1000, 100, 50}, 1800, 4096);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustCentauriA", 1),
                GT_Values.NI, GT_Values.NF, Materials.Mercury.getFluid(200L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neutronium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.InfinityCatalyst, 1L),
                new int[]{5000, 2000, 500, 2500, 150, 80}, 1800, 4096);
        GT_Values.RA
                .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustVegaB", 1), GT_Values.NI,
                        GT_Values.NF, GT_Values.NF,
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium235, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium241, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Europium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadria, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DraconiumAwakened, 1L),
                        new int[]{5000, 3000, 1500, 800, 500, 50}, 1800, 4096);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustBarnardaE", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
                new int[]{2500, 2000, 1500, 750, 250, 250}, 1800, 4096);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustBarnardaF", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
                new int[]{2500, 2000, 1500, 750, 250, 250}, 1800, 4096);
        GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustTCetiE", 1),
                GT_Values.NI, GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Apatite, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Draconium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.InfinityCatalyst, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
                new int[]{5000, 2500, 1000, 750, 150, 50}, 1800, 4096);
        GT_Values.RA
                .addCentrifugeRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrotine, 8L),
                        GT_Values.NI, GT_Values.NF, GT_Values.NF,
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrum, 1L), GT_Values.NI,
                        GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 10000}, 400, 480);
        GT_Values.RA.addCentrifugeRecipe(
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BlackPlutonium, 1L), GT_Values.NI,
                GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.CosmicNeutronium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.CosmicNeutronium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.CosmicNeutronium, 1L),
                GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{1000, 500, 100}, 200, 500000);

        GT_Values.RA
                .addCentrifugeRecipe(CoreItems.getRecipe(31, 1), GT_Values.NI, GT_Values.NF, GT_Values.NF,
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Clay, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.SiliconDioxide, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Brick, 1L), GT_Values.NI,
                        GT_Values.NI, GT_Values.NI, new int[]{10000, 9000, 7500}, 400, 30);
        GT_Values.RA
                .addCentrifugeRecipe(CoreItems.getRecipe(32, 1), GT_Values.NI, GT_Values.NF, GT_Values.NF,
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Brick, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Stone, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.SiliconDioxide, 1L),
                        GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 7500, 6000}, 400, 30);

        GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCgrass", 1L),
                GT_Values.NI, GT_Values.NF, GT_Values.NF, CoreItems2.getRecipe(151, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
                GT_ModHandler.getModItem("minecraft", "sand", 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI,
                new int[]{5000, 1000, 5000}, 400, 8);
        GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCdirt", 1L),
                GT_Values.NI, GT_Values.NF, GT_Values.NF, CoreItems2.getRecipe(151, 1),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
                GT_ModHandler.getModItem("minecraft", "sand", 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI,
                new int[]{2500, 1000, 5000}, 400, 8);
        GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 1L),
                GT_Values.NI, GT_Values.NF, Materials.Radon.getGas(60L), CoreItems2.getRecipe(151, 1),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Carbon, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Wood, 1L), GT_Values.NI, GT_Values.NI,
                GT_Values.NI, new int[]{3750, 2500, 2500}, 400, 8);
        GT_Values.RA
                .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelion3", 64L),
                        GT_Values.NI, GT_Values.NF, Materials.Biomass.getGas(1000L),
                        GT_ModHandler.getModItem("IC2", "itemFuelPlantBall", 64L),
                        CoreItems2.getRecipe(151, 16),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 4L), GT_Values.NI,
                        GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 8);
        GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCreed", 64L),
                GT_Values.NI, GT_Values.NF, Materials.Biomass.getGas(1000L),
                GT_ModHandler.getModItem("IC2", "itemFuelPlantBall", 64L), CoreItems2.getRecipe(151, 16),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 4L), GT_Values.NI,
                GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 8);
        GT_Values.RA
                .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelions", 64L),
                        GT_Values.NI, GT_Values.NF, Materials.Biomass.getGas(1000L),
                        GT_ModHandler.getModItem("IC2", "itemFuelPlantBall", 64L),
                        CoreItems2.getRecipe(151, 16),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 4L), GT_Values.NI,
                        GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 8);
        GT_Values.RA
                .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelions", 64L, 1),
                        GT_Values.NI, GT_Values.NF, Materials.Biomass.getGas(1000L),
                        GT_ModHandler.getModItem("IC2", "itemFuelPlantBall", 64L),
                        CoreItems2.getRecipe(151, 16),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 4L), GT_Values.NI,
                        GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 8);

        GT_Values.RA.addCentrifugeRecipe(
                GT_OreDictUnificator.get(OrePrefixes.dust.get(Materials.Orichalcum), 4L), GT_Values.NI,
                GT_Values.NF, GT_Values.NF,
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Trinium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Trinium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Trinium, 1L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Oriharukon, 1L), GT_Values.NI,
                GT_Values.NI, new int[]{10000, 10000, 10000, 10000}, 300, 122880);
        GT_Values.RA
                .addCentrifugeRecipe(GT_OreDictUnificator.get(OrePrefixes.dust.get(Materials.Mytryl), 6L),
                        GT_Values.NI, GT_Values.NF, GT_Values.NF,
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lead, 3L),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Platinum, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Draconium, 1L), GT_Values.NI,
                        GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 5000}, 400, 1920);
    }

    private void alloySmelter() {
        GT_Values.RA.addAlloySmelterRecipe(new ItemStack(Items.clay_ball, 3, 0),
                new ItemStack(Blocks.sand, 5, 0), CoreItems2.getRecipe(CokeOvenBrick.getMetaID(), 3), 130,
                3);
        GT_Values.RA.addAlloySmelterRecipe(new ItemStack(Items.clay_ball, 1, 0),
                ItemList.Shape_Mold_Ingot.get(0), GT_ModHandler.getModItem("minecraft", "brick", 1L, 0),
                130, 3);
        GT_Values.RA
                .addAlloySmelterRecipe(new ItemStack(Items.clay_ball, 3), new ItemStack(Blocks.sand, 5),
                        CoreItems2.getRecipe(65, 3), 390, 3);
        GT_Values.RA.addAlloySmelterRecipe(GT_ModHandler.getModItem("IC2", "itemPartIridium", 2L),
                ItemList.Shape_Mold_Casing.get(0), CoreItems2.getRecipe(52, 3), 1200, 256);
        GT_Values.RA.addAlloySmelterRecipe(new ItemStack(Items.clay_ball, 1, 0),
                ItemList.Shape_Mold_Ingot.get(0), new ItemStack(Items.brick, 1, 0), 130, 3);
        GT_Values.RA.addAlloySmelterRecipe(CoreItems.getRecipe(33, 1), ItemList.Shape_Mold_Ball.get(0),
                ItemList.Circuit_Parts_Glass_Tube.get(1), 120, 16);
    }

    private void assembler() {
        final ItemStack[] yszUnit = {
                GT_Utility.getIntegratedCircuit(6),
                GregTech_API.getStackofAmountFromOreDict("plateYSZ", 6),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.StainlessSteel, 1),
                GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.StainlessSteel, 1),
                ItemList.Electric_Motor_EV.get(1L)};
        GT_Values.RA.addAssemblerRecipe(
                yszUnit,
                Materials.Hydrogen.getGas(4000),
                Blockstack(CeramicBlock, 1, 0),
                20*60, 480);

        //GDC Unit
        final ItemStack[] gdcUnit = {
                GT_Utility.getIntegratedCircuit(6),
                GregTech_API.getStackofAmountFromOreDict("plateGDC", 6),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Titanium,1),
                GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Titanium,1),
                ItemList.Electric_Motor_IV.get(1L)};
        GT_Values.RA.addAssemblerRecipe(
                gdcUnit,
                Materials.Hydrogen.getGas(8000),
                Blockstack(CeramicBlock, 1, 1),
                20*60, 1920);
        //LSCF Unit
        final ItemStack[] lscfUnit = {
                GT_Utility.getIntegratedCircuit(6),
                GregTech_API.getStackofAmountFromOreDict("plateLSCF", 6),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.TungstenSteel, 1),
                GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.TungstenSteel, 1),
                ItemList.Electric_Motor_LuV.get(1L)};
        GT_Values.RA.addAssemblerRecipe(
                lscfUnit, Materials.Hydrogen.getGas(16000),
                Blockstack(CeramicBlock, 1, 2),
                20*60, 7680);

        //Field Tier 1
        final ItemStack[] tfftstoragefield1 = {
                GT_Utility.getIntegratedCircuit(6),
                ItemList.Electric_Pump_MV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.StainlessSteel, 4)};
        GT_Values.RA.addAssemblerRecipe(
                tfftstoragefield1, FluidRegistry.getFluidStack("molten.polytetrafluoroethylene", 36),
                Blockstack(FluidTankBlock, 1, 0),
                200, 480);
        //Field Tier 2
        final ItemStack[] tfftstoragefield2 = {
                GT_Utility.getIntegratedCircuit(6),
                ItemList.Field_Generator_LV.get(1L),
                ItemList.Electric_Pump_HV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Titanium, 4)};
        GT_Values.RA.addAssemblerRecipe(
                tfftstoragefield2, FluidRegistry.getFluidStack("molten.polytetrafluoroethylene", 144),
                Blockstack(FluidTankBlock, 1, 1),
                200, 1920);
        //Field Tier 3
        final ItemStack[] tfftstoragefield3 = {
                GT_Utility.getIntegratedCircuit(6),
                ItemList.Field_Generator_MV.get(1L),
                ItemList.Electric_Pump_EV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 4)};
        GT_Values.RA.addAssemblerRecipe(
                tfftstoragefield3, FluidRegistry.getFluidStack("molten.epoxid", 144),
                Blockstack(FluidTankBlock, 1, 2),
                200, 7680);
        //Field Tier 4
        final ItemStack[] tfftstoragefield4 = {
                GT_Utility.getIntegratedCircuit(6),
                ItemList.Field_Generator_HV.get(1L),
                ItemList.Electric_Pump_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Chrome, 4)};
        GT_Values.RA.addAssemblerRecipe(
                tfftstoragefield4, FluidRegistry.getFluidStack("molten.epoxid", 144),
                Blockstack(FluidTankBlock, 1, 3),
                200, 30720);
        //Field Tier 5
        final ItemStack[] tfftstoragefield5 = {
                GT_Utility.getIntegratedCircuit(6),
                ItemList.Field_Generator_EV.get(1L),
                ItemList.Electric_Pump_LuV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iridium, 4)};
        GT_Values.RA.addAssemblerRecipe(
                tfftstoragefield5,  FluidRegistry.getFluidStack("molten.epoxid", 144),
                Blockstack(FluidTankBlock, 1, 4),
                200, 122880);

        //Field Tier 6
        final ItemStack[] tfftstoragefield6 = {
                GT_Utility.getIntegratedCircuit(6),
                ItemList.Field_Generator_IV.get(1L),
                ItemList.Electric_Pump_ZPM.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 4)};
        GT_Values.RA.addAssemblerRecipe(
                tfftstoragefield6, FluidRegistry.getFluidStack("molten.epoxid", 144),
                Blockstack(FluidTankBlock, 1, 5),
                200, 491520);
        //Field Tier 7
        final ItemStack[] tfftstoragefield7 = {
                GT_Utility.getIntegratedCircuit(6),
                ItemList.Field_Generator_LuV.get(1L),
                ItemList.Electric_Pump_UV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Tritanium, 4)};
        GT_Values.RA.addAssemblerRecipe(
                tfftstoragefield7, FluidRegistry.getFluidStack("molten.epoxid", 144),
                Blockstack(FluidTankBlock, 1, 6),
                200, 1966080);
        //Field Tier 8
        final ItemStack[] tfftstoragefield8 = {
                GT_Utility.getIntegratedCircuit(6),
                ItemList.Field_Generator_ZPM.get(1L),
                ItemList.Electric_Pump_UHV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 4)};
        GT_Values.RA.addAssemblerRecipe(
                tfftstoragefield8, FluidRegistry.getFluidStack("molten.epoxid", 144),
                Blockstack(FluidTankBlock, 1, 7),
                200, 7864320);

        //Casings
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.GumMetal, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Titaniolum, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.PBECasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Zamak, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Duraluminium, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.EngraverCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel690, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Nitinol, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.AssemblerCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TiBetaC, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.CentrifugeCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HastelloyC276, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Zamak, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.ElectrolyzerCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Titaniolum, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Inconel690, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.WireFactoryCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.MaragingSteel250, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Inconel792, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.SupplyProductionCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Nitinol, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HastelloyC276, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.UtilityMachineCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Talonite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Grisium, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.BrewmenterCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Nitinol, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Inconel690, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.ElectromagneticCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Nitinol60, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Kovar, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.ArcCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.TiBetaC, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Talonite, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.ExtradificationCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Titaniolum, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.MaragingSteel250, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.MixingCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HastelloyC276, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Mangalloy, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.MacerationCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.MaragingSteel300, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Stellite, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.CuttingCasing.get(2), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Machine_HV_Printer.get(1L), ItemList.Cover_Crafting.get(1L),
                        ItemList.Conveyor_Module_HV.get(2L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 4),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.BlackSteel, 8),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.StainlessSteel, 16)},
                Materials.SolderingAlloy.getMolten(288L), GT_ItemList.Machine_DDDPrinter.get(1), 200, 480);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.StainlessSteel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.VanadiumSteel, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedSteel, 8)}, null,
                GT_ItemList.DDDPrinterCasing.get(2), 100, 120);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiPart", 1L, 340),
                        ItemList.Cover_ItemDetector.get(4L),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.VanadiumSteel, 4),
                        ItemList.Robot_Arm_HV.get(4L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 8),
                        GT_OreDictUnificator.get(OrePrefixes.gearGt, Materials.BlackSteel, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.StainlessSteel, 24),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.BlueSteel, 32)}, null,
                GT_ItemList.DDDPrinterCasing3x3.get(9), 800, 120);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.GumMetal, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Naquadah, 1),
                        GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Desh, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.TungstenSteel, 12),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.TungstenSteel, 12),
                        ItemList.Field_Generator_MV.get(1L)}, null, GT_ItemList.NqCasing.get(2), 200, 7680);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.MaragingSteel300, 6),
                        GT_OreDictUnificator.get(OrePrefixes.foil, Materials.BlackSteel, 12),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSS, 16)},
                Materials.HSSG.getMolten(288L), GT_ItemList.CycloneCasing.get(2), 200, 7680);

        // --- Turbine Casing
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Titaniolum, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TiBetaC, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)},
                Materials.HSSE.getMolten(288L), GT_ItemList.Huge_Casing_Turbine.get(2), 200, 1920);

        //SolarPanel
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Cover_SolarPanel_8V.get(1L), GT_ItemList.ULVRobotArm.get(1L),
                        ItemList.Large_Fluid_Cell_Steel.get(1L), ItemList.Sensor_LV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 2),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Silicon, 6),
                        ItemList.Battery_Buffer_2by2_ULV.get(1L)}, Materials.SolderingAlloy.getMolten(144),
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 0), 100, 30);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Cover_SolarPanel_LV.get(1L), ItemList.Robot_Arm_LV.get(1L),
                        ItemList.Large_Fluid_Cell_Aluminium.get(1L), ItemList.Sensor_MV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Silicon, 6),
                        ItemList.Battery_Buffer_2by2_LV.get(1L)}, Materials.SolderingAlloy.getMolten(288),
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 1), 200, 120);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Cover_SolarPanel_MV.get(1L), ItemList.Robot_Arm_MV.get(1L),
                        ItemList.Large_Fluid_Cell_StainlessSteel.get(1L), ItemList.Sensor_HV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 6),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Silicon, 6),
                        ItemList.Battery_Buffer_2by2_MV.get(1L)}, Materials.SolderingAlloy.getMolten(576),
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 2), 300, 480);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Cover_SolarPanel_HV.get(1L), ItemList.Robot_Arm_HV.get(1L),
                        ItemList.Large_Fluid_Cell_Titanium.get(1L), ItemList.Sensor_EV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.GalliumArsenide, 8),
                        ItemList.Battery_Buffer_2by2_HV.get(1L)}, Materials.SolderingAlloy.getMolten(1152),
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 3), 400, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Cover_SolarPanel_EV.get(1L), ItemList.Robot_Arm_EV.get(1L),
                        ItemList.Large_Fluid_Cell_TungstenSteel.get(1L), ItemList.Sensor_IV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 10),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.GalliumArsenide, 8),
                        ItemList.Battery_Buffer_2by2_EV.get(1L)}, Materials.SolderingAlloy.getMolten(2304),
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 4), 500, 7680);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Cover_SolarPanel_IV.get(1L), ItemList.Robot_Arm_IV.get(1L),
                        ItemList.Large_Fluid_Cell_Chrome.get(1L), ItemList.Sensor_LuV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 12),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.GalliumArsenide, 8),
                        ItemList.Battery_Buffer_2by2_IV.get(1L)}, Materials.SolderingAlloy.getMolten(4608),
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 5), 600, 30720);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Cover_SolarPanel_LuV.get(1L), ItemList.Robot_Arm_LuV.get(1L),
                        ItemList.Large_Fluid_Cell_Iridium.get(1L), ItemList.Sensor_ZPM.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 14),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Sunnarium, 10),
                        ItemList.Battery_Buffer_2by2_LuV.get(1L)}, Materials.SolderingAlloy.getMolten(9216),
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 6), 700, 122880);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Cover_SolarPanel_ZPM.get(1L), ItemList.Robot_Arm_ZPM.get(1L),
                        ItemList.Large_Fluid_Cell_Osmium.get(1L), ItemList.Sensor_UV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Superconductor, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Sunnarium, 10),
                        ItemList.Battery_Buffer_2by2_ZPM.get(1L)}, Materials.SolderingAlloy.getMolten(18432),
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 7), 800, 500000);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Cover_SolarPanel_UV.get(1L), ItemList.Robot_Arm_UV.get(1L),
                        ItemList.Large_Fluid_Cell_Neutronium.get(1L), ItemList.Sensor_UHV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Infinite, 18),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Sunnarium, 10),
                        ItemList.Battery_Buffer_2by2_UV.get(1L)}, Materials.SolderingAlloy.getMolten(36864),
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 8), 900, 2000000);

        //Portable Tank
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Lead, 8),
                        ItemList.Large_Fluid_Cell_Steel.get(1L),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 2L)}, GT_Values.NF,
                GT_ItemList.Portable_Tank_ULV.get(1L), 100, 6);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 8),
                        ItemList.Large_Fluid_Cell_Aluminium.get(1L),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 2L)}, GT_Values.NF,
                GT_ItemList.Portable_Tank_LV.get(1L), 200, 30);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Aluminium, 8),
                        ItemList.Large_Fluid_Cell_StainlessSteel.get(1L),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 2L)}, GT_Values.NF,
                GT_ItemList.Portable_Tank_MV.get(1L), 300, 120);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HSLA, 8),
                        ItemList.Large_Fluid_Cell_Titanium.get(1L),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 2L)}, GT_Values.NF,
                GT_ItemList.Portable_Tank_HV.get(1L), 400, 480);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HSSG, 8),
                        ItemList.Large_Fluid_Cell_TungstenSteel.get(1L),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 2L)}, GT_Values.NF,
                GT_ItemList.Portable_Tank_EV.get(1L), 500, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HastelloyC276, 8),
                        ItemList.Large_Fluid_Cell_Chrome.get(1L),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 2L)}, GT_Values.NF,
                GT_ItemList.Portable_Tank_IV.get(1L), 600, 7680);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HastelloyN, 8),
                        ItemList.Large_Fluid_Cell_Iridium.get(1L),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 2L)}, GT_Values.NF,
                GT_ItemList.Portable_Tank_LuV.get(1L), 700, 30720);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Lafium, 8),
                        ItemList.Large_Fluid_Cell_Osmium.get(1L),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 2L)}, GT_Values.NF,
                GT_ItemList.Portable_Tank_ZPM.get(1L), 800, 122880);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.CinobiteA243, 8),
                        ItemList.Large_Fluid_Cell_Neutronium.get(1L),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 2L)}, GT_Values.NF,
                GT_ItemList.Portable_Tank_UV.get(1L), 900, 500000);

        //Hand Pump
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ItemList.ULVPump.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.pipeMedium, Materials.Copper, 1),
                        ItemList.Cell_Empty.get(1L), GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Iron, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Iron, 1),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 1L)}, GT_Values.NF,
                simpleMetaStack(ItemRegistery.GTPump, 1000, 1), 100, 6);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Electric_Pump_LV.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.pipeMedium, Materials.Bronze, 1),
                        ItemList.Large_Fluid_Cell_Steel.get(1L), ItemList.Battery_RE_LV_Lithium.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.Tin, 1),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 1L)}, GT_Values.NF,
                simpleMetaStack(ItemRegistery.GTPump, 1001, 1), 120, 20);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Electric_Pump_MV.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.pipeMedium, Materials.Steel, 1),
                        ItemList.Large_Fluid_Cell_Aluminium.get(1L), ItemList.Battery_RE_MV_Lithium.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.Copper, 1),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 1L)}, GT_Values.NF,
                simpleMetaStack(ItemRegistery.GTPump, 1002, 1), 140, 48);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Electric_Pump_HV.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.pipeMedium, Materials.StainlessSteel, 1),
                        ItemList.Large_Fluid_Cell_StainlessSteel.get(1L), ItemList.Battery_RE_HV_Lithium.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.Electrum, 1),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 1L)}, GT_Values.NF,
                simpleMetaStack(ItemRegistery.GTPump, 1003, 1), 160, 96);

        //Sawmill
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.slab, Materials.Wood, 6L),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Wood, 1L),
                        GT_Utility.getIntegratedCircuit(2)}, null, GT_ItemList.SawCase.get(2L), 50, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ItemList.ULVConveyorModule.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("impact", "impact_sawmill_block", 5L), 60, 30);
        //Communication Transmitter Hatch
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                ItemList.Hull_HV.get(1L),
                ItemList.Field_Generator_HV.get(2L), ItemList.Sensor_HV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HSLA, 4),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.StainlessSteel, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 4),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedSteel, 8),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.BlueSteel, 8)
        }, null, GT_ItemList.Communication_Hatch_Transmitter.get(1L), 40 * 20, 480);
        //Communication Receiver Hatch
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                ItemList.Hull_HV.get(1L),
                ItemList.Field_Generator_HV.get(2L), ItemList.Emitter_HV.get(4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HSLA, 4),
                GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.StainlessSteel, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 4),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedSteel, 8),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.BlueSteel, 8)
        }, null, GT_ItemList.Communication_Hatch_Receiver.get(1L), 40 * 20, 480);
        //Parallel Hatch 4P IN
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_IV.get(1), GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 1),
                        ItemList.Sensor_IV.get(1), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ItemList.Parallel_Hatch_IN4.get(1), 600, 7680);
        //Parallel Hatch 4P OUT
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_IV.get(1), GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 1),
                        ItemList.Emitter_IV.get(1), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ItemList.Parallel_Hatch_OUT4.get(1), 600, 7680);
        //Parallel Hatch 16P IN
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_LuV.get(1), GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 2),
                        ItemList.Sensor_LuV.get(1), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ItemList.Parallel_Hatch_IN16.get(1), 800, 30720);
        //Parallel Hatch 16P OUT
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_LuV.get(1), GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 2),
                        ItemList.Emitter_LuV.get(1), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ItemList.Parallel_Hatch_OUT16.get(1), 800, 30720);
        //Parallel Hatch 64P IN
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_ZPM.get(1), GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 3),
                        ItemList.Sensor_ZPM.get(1), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ItemList.Parallel_Hatch_IN64.get(1), 1000, 122880);
        //Parallel Hatch 64P OUT
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_ZPM.get(1), GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 3),
                        ItemList.Emitter_ZPM.get(1), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ItemList.Parallel_Hatch_OUT64.get(1), 1000, 122880);
        //Parallel Hatch 256P IN
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_UV.get(1), GT_ModHandler.getModItem("extracells", "craftingstorage", 1L),
                        ItemList.Sensor_UV.get(1), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Superconductor, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ItemList.Parallel_Hatch_IN256.get(1), 1200, 500000);
        //Parallel Hatch 256P OUT
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_UV.get(1), GT_ModHandler.getModItem("extracells", "craftingstorage", 1L),
                        ItemList.Emitter_UV.get(1), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Superconductor, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ItemList.Parallel_Hatch_OUT256.get(1), 1200, 500000);

        // --- Packager Input Bus
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_IV.get(1), ItemList.Super_Chest_IV.get(1), ItemList.Conveyor_Module_IV.get(2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 2L), GT_Utility.getIntegratedCircuit(4)},
                Materials.Polytetrafluoroethylene.getMolten(1152L),
                GT_ItemList.Boxinator_Hatch_Input.get(1), 480, 7680);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_IV.get(1), ItemList.Super_Chest_IV.get(1), ItemList.Conveyor_Module_IV.get(2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 2L), GT_Utility.getIntegratedCircuit(4)},
                Materials.Polybenzimidazole.getMolten(144L),
                GT_ItemList.Boxinator_Hatch_Input.get(1), 480, 7680);

        // --- Computer Rack
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ItemList.Computer_Casing.get(1L), ItemList.Hatch_Input_Bus_IV.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 2L), ItemList.Circuit_Parts_GlassFiber.get(16)},
                Materials.TungstenSteel.getMolten(1296L),
                GT_ItemList.Parallel_Hatch_Rack.get(1), 400, 7680);

        // --- Nuclear Rod Hatch
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_EV.get(1), ItemList.Electric_Motor_EV.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 4L), GT_Utility.getIntegratedCircuit(4)},
                Materials.Polytetrafluoroethylene.getMolten(576L),
                GT_ItemList.Nuclear_Hatch_Rod.get(1), 480, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Hull_EV.get(1), ItemList.Electric_Motor_EV.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 4L), GT_Utility.getIntegratedCircuit(4)},
                Materials.Polybenzimidazole.getMolten(72L),
                GT_ItemList.Nuclear_Hatch_Rod.get(1), 480, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("IC2", "blockAlloyGlass", 1L, 0),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, GT_Values.NF, CoreItems2.getRecipe(54, 1), 100,
                120);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(54, 2),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 3L),
                GT_Utility.getIntegratedCircuit(2)}, GT_Values.NF, CoreItems2.getRecipe(55, 1), 200, 256);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(54, 3),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 6L),
                GT_Utility.getIntegratedCircuit(3)}, GT_Values.NF, CoreItems2.getRecipe(56, 1), 300, 480);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(54, 1), CoreItems2.getRecipe(55, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 7L),
                        GT_Utility.getIntegratedCircuit(1)}, GT_Values.NF, CoreItems2.getRecipe(56, 1), 100,
                480);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(56, 2),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 6L),
                GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.ElectrumFlux, 1L),
                GT_Utility.getIntegratedCircuit(2)}, GT_Values.NF, CoreItems2.getRecipe(57, 1), 200, 1024);

        //Bars
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Steel, 3L),
                        GT_Utility.getIntegratedCircuit(3), CoreItems2.getRecipe(51, 4), 400, 48);

        //Casings
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Steel, 1L),
                        CoreItems2.getRecipe(SteelBars.getMetaID(), 6), Casing_Farm.get(1L), 50, 16);

        //Piston
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.cobblestone, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Iron, 1L)},
                Materials.Redstone.getMolten(72L), Blockstack(UtilBlock, 1, 1), 100, 8, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.cobblestone, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Bronze, 1L)},
                Materials.Redstone.getMolten(72L), Blockstack(UtilBlock, 1, 1), 100, 8, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.cobblestone, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Steel, 1L)},
                Materials.Redstone.getMolten(144L), Blockstack(UtilBlock, 2, 1), 100, 16, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.cobblestone, 4L),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Aluminium, 1L)},
                Materials.Redstone.getMolten(216L), Blockstack(UtilBlock, 4, 1), 200, 30, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.cobblestone, 8L),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.StainlessSteel, 1L)},
                Materials.Redstone.getMolten(288L), Blockstack(UtilBlock, 8, 1), 300, 30, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.cobblestone, 16L),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Titanium, 1L)},
                Materials.Redstone.getMolten(576L), Blockstack(UtilBlock, 16, 1), 400, 30, false);

        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{new ItemStack(Blocks.fence),
                        GT_OreDictUnificator.get(OrePrefixes.slab, Materials.Wood, 1)},
                Materials.Redstone.getMolten(72L), CoreItems2.getRecipe(53, 1), 100, 8, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Iron, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.slab, Materials.Wood, 1)},
                Materials.Redstone.getMolten(72L), CoreItems2.getRecipe(53, 1), 100, 8, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Bronze, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.slab, Materials.Wood, 1)},
                Materials.Redstone.getMolten(72L), CoreItems2.getRecipe(53, 1), 100, 8, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Steel, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.slab, Materials.Wood, 2)},
                Materials.Redstone.getMolten(144L), CoreItems2.getRecipe(53, 2), 100, 16, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Aluminium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.slab, Materials.Wood, 4)},
                Materials.Redstone.getMolten(216L), CoreItems2.getRecipe(53, 4), 200, 30, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.stick, Materials.StainlessSteel, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.slab, Materials.Wood, 8)},
                Materials.Redstone.getMolten(288L), CoreItems2.getRecipe(53, 8), 300, 30, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Titanium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.slab, Materials.Wood, 16)},
                Materials.Redstone.getMolten(576L), CoreItems2.getRecipe(53, 16), 400, 30, false);

        GT_Values.RA.addAssemblerRecipe(CoreItems2.getRecipe(53, 1), Blockstack(UtilBlock, 1, 1), null,
                Blockstack(Blocks.piston, 1), 40, 8);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(78, 1), CoreItems2.getRecipe(82, 1)},
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 2000), CoreItems2.getRecipe(80, 1),
                1000, 480);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.gem, Materials.Diamond, 1),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 2)}, null,
                CoreItems2.getRecipe(99, 1), 100, 30);

//Solar parts
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(109, 1),
                        GT_ModHandler.getModItem("minecraft", "glowstone", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Iron, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.RedAlloy, 2),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.RedAlloy, 4)},
                Materials.SolderingAlloy.getMolten(144), CoreItems2.getRecipe(117, 1), 600, 120);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(110, 1),
                        GT_OreDictUnificator.get(OrePrefixes.gem, Materials.Diamond, 1),
                        GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.MeteoricIron, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Lapis, 2),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.RedAlloy, 4)},
                Materials.SolderingAlloy.getMolten(288), CoreItems2.getRecipe(118, 1), 600, 480);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(111, 1),
                        GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.Ruby, 1),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.null", 1L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Uranium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.RedAlloy, 4)},
                Materials.SolderingAlloy.getMolten(576), CoreItems2.getRecipe(119, 1), 600, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(112, 1), CoreItems2.getRecipe(126, 1),
                        GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Naquadah, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Plutonium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.RedAlloy, 4)},
                Materials.SolderingAlloy.getMolten(1152), CoreItems2.getRecipe(120, 1), 600, 7680);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(113, 1), CoreItems2.getRecipe(127, 1),
                        GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Draconium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Europium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.RedAlloy, 4)},
                Materials.SolderingAlloy.getMolten(2304), CoreItems2.getRecipe(121, 1), 600, 30720);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(114, 1), CoreItems2.getRecipe(130, 1),
                        CoreItems2.getRecipe(83, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Americium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.RedAlloy, 4)},
                Materials.SolderingAlloy.getMolten(4608), CoreItems2.getRecipe(122, 1), 600, 122880);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(115, 1), CoreItems2.getRecipe(131, 1),
                        GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Quantium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.RedAlloy, 4)},
                Materials.SolderingAlloy.getMolten(9216), CoreItems2.getRecipe(123, 1), 600, 500000);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(116, 1), CoreItems2.getRecipe(132, 1),
                        GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.BlackPlutonium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Phoenixite, 2),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.RedAlloy, 4)},
                Materials.SolderingAlloy.getMolten(18432), CoreItems2.getRecipe(124, 1), 600, 2000000);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Sunnarium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Iridium, 8)}, null,
                CoreItems2.getRecipe(127, 1), 800, 30720);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Uranium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glowstone, 4)}, null,
                CoreItems2.getRecipe(128, 1), 600, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(126, 1), CoreItems2.getRecipe(128, 8)}, null,
                CoreItems2.getRecipe(129, 1), 1200, 7680);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(127, 1), CoreItems2.getRecipe(129, 8)}, null,
                CoreItems2.getRecipe(130, 1), 1600, 122880);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(130, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Naquadria, 8)}, null,
                CoreItems2.getRecipe(131, 1), 1800, 500000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(131, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Neutronium, 8)},
                Materials.ElectrumFlux.getMolten(1152), CoreItems2.getRecipe(132, 1), 2000, 2000000);

        GT_Values.RA
                .addAssemblerRecipe(ItemList.Cover_SolarPanel.get(8L), GT_Utility.getIntegratedCircuit(8),
                        ItemList.Cover_SolarPanel_8V.get(1L), 100, 6);
        GT_Values.RA.addAssemblerRecipe(ItemList.Cover_SolarPanel_8V.get(6L),
                GT_Utility.getIntegratedCircuit(6), ItemList.Cover_SolarPanel_LV.get(1L), 120, 12);
        GT_Values.RA.addAssemblerRecipe(ItemList.Cover_SolarPanel_LV.get(6L),
                GT_Utility.getIntegratedCircuit(6), ItemList.Cover_SolarPanel_MV.get(1L), 140, 24);
        GT_Values.RA.addAssemblerRecipe(ItemList.Cover_SolarPanel_MV.get(6L),
                GT_Utility.getIntegratedCircuit(6), ItemList.Cover_SolarPanel_HV.get(1L), 160, 48);
        GT_Values.RA.addAssemblerRecipe(ItemList.Cover_SolarPanel_HV.get(6L),
                GT_Utility.getIntegratedCircuit(6), ItemList.Cover_SolarPanel_EV.get(1L), 180, 96);
        GT_Values.RA.addAssemblerRecipe(ItemList.Cover_SolarPanel_EV.get(6L),
                GT_Utility.getIntegratedCircuit(6), ItemList.Cover_SolarPanel_IV.get(1L), 200, 192);
        GT_Values.RA.addAssemblerRecipe(ItemList.Cover_SolarPanel_IV.get(6L),
                GT_Utility.getIntegratedCircuit(6), ItemList.Cover_SolarPanel_LuV.get(1L), 220, 384);
        GT_Values.RA.addAssemblerRecipe(ItemList.Cover_SolarPanel_LuV.get(6L),
                GT_Utility.getIntegratedCircuit(6), ItemList.Cover_SolarPanel_ZPM.get(1L), 240, 768);
        GT_Values.RA.addAssemblerRecipe(ItemList.Cover_SolarPanel_ZPM.get(6L),
                GT_Utility.getIntegratedCircuit(6), ItemList.Cover_SolarPanel_UV.get(1L), 260, 1536);
//Space parts
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Steel, 1),
                        CoreItems2.getRecipe(175, 1), CoreItems2.getRecipe(176, 1)},
                Materials.StainlessSteel.getMolten(72), CoreItems2.getRecipe(97, 1), 200, 256);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Bronze, 1),
                        GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Aluminium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Steel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSLA, 8)},
                Materials.StainlessSteel.getMolten(288), ItemList.Ingot_Heavy1.get(1L), 200, 256);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("GalacticraftCore", "item.heavyPlating", 1L),
                        GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 4),
                        CoreItems2.getRecipe(93, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 8)},
                Materials.Titanium.getMolten(288), ItemList.Ingot_Heavy2.get(1L), 300, 1024);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("GalacticraftMars", "item.null", 1L, 3),
                        CoreItems2.getRecipe(90, 1), CoreItems2.getRecipe(96, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Inconel690, 8)},
                Materials.TungstenSteel.getMolten(288), ItemList.Ingot_Heavy3.get(1L), 400, 4096);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L),
                        CoreItems2.getRecipe(84, 1), CoreItems2.getRecipe(92, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HastelloyN, 8)},
                Materials.Chrome.getMolten(288), CoreItems2.getRecipe(16, 1), 500, 16384);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(11, 1), CoreItems2.getRecipe(86, 1),
                        CoreItems2.getRecipe(91, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Lafium, 10)},
                Materials.Iridium.getMolten(288), CoreItems2.getRecipe(17, 1), 600, 65536);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(12, 1), CoreItems2.getRecipe(89, 1),
                        CoreItems2.getRecipe(94, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.CinobiteA243, 12)},
                Materials.Osmium.getMolten(288), CoreItems2.getRecipe(18, 1), 700, 262144);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(13, 1), CoreItems2.getRecipe(79, 1),
                        CoreItems2.getRecipe(95, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Pikyonium64B, 14)},
                Materials.Neutronium.getMolten(288), CoreItems2.getRecipe(19, 1), 800, 1048576);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(14, 1), CoreItems2.getRecipe(77, 1),
                        CoreItems2.getRecipe(174, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Quantum, 16)},
                Materials.Phoenixite.getMolten(288), CoreItems2.getRecipe(20, 1), 900, 4194304);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Molybdenum, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Iridium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Advanced, 4),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Diamond, 2)},
                Materials.Titanium.getMolten(144), ItemList.Ingot_IridiumAlloy.get(1L), 200, 256);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 2),
                        CoreItems2.getRecipe(171, 1), CoreItems2.getRecipe(172, 1)},
                Materials.Duranium.getMolten(288L), CoreItems2.getRecipe(88, 1), 600, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(88, 1), CoreItems2.getRecipe(173, 1),
                        CoreItems2.getRecipe(87, 1)}, Materials.Tritanium.getMolten(288L),
                CoreItems2.getRecipe(89, 1), 1200, 7680);

        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ItemList.packEarth.get(64L)},
                Materials.HSLA.getMolten(288), GT_ItemList.spacebox1.get(1L), 1200, 64);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ItemList.packMoon.get(64L)},
                Materials.BT6.getMolten(288), GT_ItemList.spacebox2.get(1L), 1200, 256);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ItemList.packMars.get(64L), GT_ItemList.packDeimos.get(64L),
                        GT_ItemList.packPhobos.get(64L)}, Materials.HastelloyC276.getMolten(288),
                GT_ItemList.spacebox3.get(1L), 1200, 1024);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ItemList.packAsteroids.get(64L), GT_ItemList.packCeres.get(64L),
                        GT_ItemList.packEuropa.get(64L), GT_ItemList.packGanymed.get(64L)},
                Materials.HastelloyN.getMolten(288), GT_ItemList.spacebox4.get(1L), 1200, 4096);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ItemList.packIo.get(64L), GT_ItemList.packMercury.get(64L),
                        GT_ItemList.packVenus.get(64L)}, Materials.Lafium.getMolten(288),
                GT_ItemList.spacebox5.get(1L), 1200, 16384);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ItemList.packIapetus.get(64L), GT_ItemList.packTitan.get(64L),
                        GT_ItemList.packEris.get(64L), GT_ItemList.packOberon.get(64L)},
                Materials.CinobiteA243.getMolten(288), GT_ItemList.spacebox6.get(1L), 1200, 65536);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ItemList.packProteus.get(64L), GT_ItemList.packTriton.get(64L)},
                Materials.Pikyonium64B.getMolten(288), GT_ItemList.spacebox7.get(1L), 1200, 262144);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ItemList.packPluto.get(64L), GT_ItemList.packHaumea.get(64L),
                        GT_ItemList.packMakeMake.get(64L)}, Materials.Quantum.getMolten(288),
                GT_ItemList.spacebox8.get(1L), 1200, 1048576);
//Casings
        //LuV
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HastelloyN, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Chrome, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HastelloyN, 6),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Chrome, 4),
                        GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.HastelloyN, 4),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 4),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 4)}, null,
                ItemList.Casing_LuV.get(1L), 200, 7680);

        //ZPM
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Lafium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Iridium, 6),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Lafium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Iridium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.Lafium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 8),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 8)}, null,
                ItemList.Casing_ZPM.get(1L), 400, 30720);

        //UV
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.CinobiteA243, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Osmium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.CinobiteA243, 12),
                        GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.Osmium, 12),
                        GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.CinobiteA243, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 12),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 12)}, null,
                ItemList.Casing_UV.get(1L), 600, 122880);

        //UHV
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Pikyonium64B, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Neutronium, 10),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Pikyonium64B, 16),
                        GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.Neutronium, 16),
                        GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.Pikyonium64B, 8),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)}, null,
                ItemList.Casing_MAX.get(1L), 800, 500000);

        //UEV
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Quantum, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Phoenixite, 12),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Quantum, 20),
                        GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.Phoenixite, 20),
                        GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.Quantum, 10),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 24),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 24)}, null,
                ItemList.Casing_UEV.get(1L), 1000, 2000000);

        //Lapotron Casing
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Iridium, 6),
                        GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NiobiumTitanium, 12),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Palladium, 16),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HastelloyC276, 16),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)}, null,
                GT_ItemList.LSCC.get(1L), 600, 7680);

        //Space Satellite Casing
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.StainlessSteel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HSLA, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedSteel, 8)}, null,
                GT_ItemList.Space_Satellite_Casing.get(2L), 100, 120);

        //Tower Casing
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.StainlessSteel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Ultimet, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedSteel, 8)}, null,
                GT_ItemList.Tower_Casing.get(2L), 100, 120);

        //Computer Casing
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Zamak, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.MaragingSteel300, 6),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 1),
                        GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Cobalt, 16),
                        GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 16),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16)}, Materials.HSSE.getMolten(288),
                GT_ItemList.Computer_Casing.get(2L), 200, 1920);

        //Vent Casing
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.StainlessSteel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.MaragingSteel300, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedSteel, 8)}, null,
                new ItemStack(InsideBlock, 2, 2), 100, 120);

        //Space Elevator Casing
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HSLA, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Vanadium, 6),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.BlueSteel, 8)}, null,
                GT_ItemList.SpaceElevatorCasing.get(2L), 100, 120);

        GT_Values.RA
                .addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(QuantumPartHelmet.getMetaID(), 1),
                                CoreItems2.getRecipe(QuantumCrystal.getMetaID(), 1),
                                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 2),
                                GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.TungstenSteel, 4),
                                ItemList.Energy_LapotronicOrb.get(1L),
                                ItemList.Sensor_IV.get(1L),
                                ItemList.Field_Generator_EV.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.TungstenSteel, 4),
                                GT_Utility.getIntegratedCircuit(10)},
                        Materials.Titanium.getMolten(1728L),
                        GT_ModHandler.getIC2Item("quantumHelmet", 1L, 26), 1500, 7680);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(QuantumPartChestplate.getMetaID(), 1),
                        CoreItems2.getRecipe(QuantumCrystal.getMetaID(), 1),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 2),
                        GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.TungstenSteel, 6),
                        ItemList.Energy_LapotronicOrb.get(1L),
                        ItemList.Field_Generator_EV.get(3L),
                        ItemList.Electric_Motor_IV.get(2L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.TungstenSteel, 4),
                        GT_Utility.getIntegratedCircuit(11)},
                Materials.Titanium.getMolten(2880L),
                GT_ModHandler.getIC2Item("quantumBodyarmor", 1L, 26), 1500, 7680);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(QuantumPartLeggings.getMetaID(), 1),
                        CoreItems2.getRecipe(QuantumCrystal.getMetaID(), 1),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 2),
                        GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.TungstenSteel, 6),
                        ItemList.Energy_LapotronicOrb.get(1L),
                        ItemList.Field_Generator_EV.get(2L),
                        ItemList.Electric_Motor_IV.get(4L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.TungstenSteel, 4),
                        GT_Utility.getIntegratedCircuit(12)},
                Materials.Titanium.getMolten(2304L),
                GT_ModHandler.getIC2Item("quantumLeggings", 1L, 26), 1500, 7680);

        GT_Values.RA
                .addAssemblerRecipe(new ItemStack[]{CoreItems2.getRecipe(QuantumPartBoots.getMetaID(), 1),
                                CoreItems2.getRecipe(QuantumCrystal.getMetaID(), 1),
                                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 2),
                                GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.TungstenSteel, 4),
                                ItemList.Energy_LapotronicOrb.get(1L),
                                ItemList.Field_Generator_EV.get(1L),
                                ItemList.Electric_Piston_IV.get(2L),
                                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.TungstenSteel, 4),
                                GT_Utility.getIntegratedCircuit(12)},
                        Materials.Titanium.getMolten(1440L),
                        GT_ModHandler.getIC2Item("quantumBoots", 1L, 26), 1500, 7680);
        /*====END QUANTUM SUITE====*/

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.block, Materials.Glass, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Tin, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, GT_Values.NF, CoreItems2.getRecipe(143, 1), 100,
                30);
        GT_Values.RA
                .addAssemblerRecipe(CoreItems2.getRecipe(143, 3), GT_Utility.getIntegratedCircuit(3),
                        CoreItems2.getRecipe(144, 1), 300, 60);
        GT_Values.RA
                .addAssemblerRecipe(CoreItems2.getRecipe(144, 2), GT_Utility.getIntegratedCircuit(2),
                        CoreItems2.getRecipe(145, 1), 600, 90);

        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Carbon, 5),
                        GT_Utility.getIntegratedCircuit(5), CoreItems2.getRecipe(136, 1), 500, 120);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Carbon, 8),
                        GT_Utility.getIntegratedCircuit(8), CoreItems2.getRecipe(138, 1), 800, 120);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Carbon, 7),
                        GT_Utility.getIntegratedCircuit(7), CoreItems2.getRecipe(139, 1), 700, 120);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Carbon, 4),
                        GT_Utility.getIntegratedCircuit(4), CoreItems2.getRecipe(140, 1), 400, 120);
        GT_Values.RA.addAssemblerRecipe(CoreItems2.getRecipe(136, 1),
                GT_ModHandler.getModItem("IC2", "itemNightvisionGoggles", 1L, GT_Values.W),
                CoreItems2.getRecipe(137, 1), 600, 256);

        //region vanila
        // --- Oak Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L),
                GT_Utility.getIntegratedCircuit(6), Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "wooden_door", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L),
                GT_Utility.getIntegratedCircuit(6), Materials.Copper.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "wooden_door", 1L), 400, 4);
        // --- Iron Door
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 6L),
                GT_Utility.getIntegratedCircuit(6), Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "iron_door", 1L), 400, 8);
        // --- Traped Door Oak
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("minecraft", "trapdoor", 2L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(2)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "trapdoor", 4L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "trapdoor", 6L), 600, 4);
        // --- Fence Gate Oak
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                GT_ModHandler.getModItem("minecraft", "fence_gate", 1L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "fence_gate", 2L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "fence_gate", 4L), 300, 8);
        // --- Wooden Pressure Plate
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.slab, Materials.Wood, 2L),
                GT_OreDictUnificator.get(OrePrefixes.spring, Materials.Iron, 1L),
                GT_ModHandler.getModItem("minecraft", "wooden_pressure_plate", 2L), 100, 8);
        // --- Pressure Plate
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "stone_slab", 2L),
                GT_OreDictUnificator.get(OrePrefixes.spring, Materials.Iron, 1L),
                GT_ModHandler.getModItem("minecraft", "stone_pressure_plate", 2L), 100, 8);
        // --- Ladder
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 3L),
                        GT_Utility.getIntegratedCircuit(5)}, null,
                GT_ModHandler.getModItem("minecraft", "ladder", 2L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 3L),
                        GT_Utility.getIntegratedCircuit(6)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "ladder", 4L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 3L),
                        GT_Utility.getIntegratedCircuit(7)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "ladder", 6L), 400, 4);
        // --- Fence
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plank, Materials.Wood, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("minecraft", "fence", 1L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plank, Materials.Wood, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(11)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "fence", 2L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plank, Materials.Wood, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(11)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("minecraft", "fence", 4L), 300, 8);
        // --- Carpet
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < Dyes.VALUES[i].getSizeOfFluidList(); j++) {
                GT_Values.RA.addAssemblerRecipe(new ItemStack(Items.string, 3),
                        ItemList.Circuit_Integrated.getWithDamage(0L, 3L),
                        Dyes.VALUES[i].getFluidDye(j, 24L), new ItemStack(Blocks.carpet, 2, 15 - i), 128, 5);
            }
        }

        // --- Long Distance Pipeline
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.Steel, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 6L),
                        GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Steel, 2L),
                        GT_Utility.getIntegratedCircuit(2)}, Materials.Tin.getMolten(144L),
                GT_ItemList.Long_Distance_Pipeline_Fluid.get(2L), 300, 16);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.Tin, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 6L),
                        GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Steel, 2L),
                        GT_Utility.getIntegratedCircuit(2)}, Materials.Tin.getMolten(144L),
                GT_ItemList.Long_Distance_Pipeline_Item.get(2L), 300, 16);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Steel, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 9L),
                        GT_Utility.getIntegratedCircuit(24)}, Materials.Tin.getMolten(144L),
                GT_ItemList.Long_Distance_Pipeline_Fluid_Pipe.get(64L), 600, 24);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Tin, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 9L),
                        GT_Utility.getIntegratedCircuit(24)}, Materials.Tin.getMolten(144L),
                GT_ItemList.Long_Distance_Pipeline_Item_Pipe.get(64L), 600, 24);

        // --- Electromagnetic Chamber
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{ItemList.Block_Magnetic_Coil.get(1),
                        GT_ModHandler.getModItem("IC2", "blockAlloyGlass", 1L, 0),
                        GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Trinium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.TungstenSteel, 20),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.TungstenSteel, 20),
                        ItemList.Field_Generator_IV.get(1L)}, null, new ItemStack(InsideBlock, 1, 5), 400, 122880);
    }

    private void cutting() {
        GT_Values.RA.addCutterRecipe(Itemstack(Core_Items.getInstance(), 1, 45),
                Itemstack(Core_Items2.getInstance(), 4, 159), null, 20 * 40, 480, true);
        GT_Values.RA.addCutterRecipe(Itemstack(Core_Items.getInstance(), 1, 46),
                Itemstack(Core_Items2.getInstance(), 4, 160), null, 20 * 40, 1920, true);
        GT_Values.RA.addCutterRecipe(Itemstack(Core_Items.getInstance(), 1, 47),
                Itemstack(Core_Items2.getInstance(), 4, 161), null, 20 * 40, 7680, true);
        // --- Carpet
        for (int i = 0; i < 16; i++) {
            GT_Values.RA
                    .addCutterRecipe(new ItemStack(Blocks.wool, 1, i), new ItemStack(Blocks.carpet, 2, i),
                            GT_Values.NI, 50, 8);
        }
    }

    private void compressor() {
        GT_Values.RA.addCompressorRecipe(CoreItems2.getRecipe(CokeOvenBrick.getMetaID(), 4),
                ItemList.Casing_CokeOvenBrick.get(1L), 200, 8);
        GT_Values.RA
                .addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.gem, Materials.CokeCoal, 9L),
                        Blockstack(CoalBlock, 1, 0), 200, 8);
        GT_Values.RA.addCompressorRecipe(CoreItems.getRecipe(33, 1),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glass, 1L), 200, 2);
        GT_Values.RA
                .addCompressorRecipe(CoreItems2.getRecipe(125, 9), CoreItems2.getRecipe(126, 1), 400, 1920);
        GT_Values.RA
                .addCompressorRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCsapling", 8L),
                        CoreItems2.getRecipe(151, 1), 200, 8);

        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 0), Blockstack(CoalBlock, 1, 1), 100, 20);
        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 1), Blockstack(CoalBlock, 1, 2), 100, 120);
        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 2), Blockstack(CoalBlock, 1, 3), 100, 480);
        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 3), Blockstack(CoalBlock, 1, 4), 100, 1920);

        GT_Values.RA
                .addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Charcoal, 9L),
                        Blockstack(CoalBlock, 1, 5), 120, 20);
        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 5), Blockstack(CoalBlock, 1, 6), 120, 120);
        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 6), Blockstack(CoalBlock, 1, 7), 120, 480);
        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 7), Blockstack(CoalBlock, 1, 8), 120, 1920);

        GT_Values.RA
                .addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Coal, 9L),
                        Blockstack(CoalBlock, 1, 9), 110, 20);
        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 9), Blockstack(CoalBlock, 1, 10), 110, 120);
        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 10), Blockstack(CoalBlock, 1, 11), 110, 480);
        GT_Values.RA
                .addCompressorRecipe(Blockstack(CoalBlock, 9, 11), Blockstack(CoalBlock, 1, 12), 110, 1920);

    }

    private void chemical() {
        GT_Values.RA.addMultiblockChemicalRecipe(
                new ItemStack[]{ItemList.Circuit_Chip_RPico.get(1L), Materials.MysteriousCrystal.getDust(2),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.InfinityCatalyst, 1L)
                                .copy().splitStack(0), CoreItems.getRecipe(TCetiESeaweedExtract.getMetaID(), 1)},
                new FluidStack[]{Materials.Neutronium.getMolten(100L)}, new FluidStack[]{GT_Values.NF},
                new ItemStack[]{ItemList.Circuit_Chip_Pico.get(1L)}, 3000, 500000);
        GT_Values.RA.addMultiblockChemicalRecipe(
                new ItemStack[]{ItemList.Circuit_Chip_RPico.get(1L), Materials.MysteriousCrystal.getDust(2),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.InfinityCatalyst, 1L)
                                .copy().splitStack(0), CoreItems.getRecipe(35, 1)},
                new FluidStack[]{Materials.Neutronium.getMolten(100L)}, new FluidStack[]{GT_Values.NF},
                new ItemStack[]{ItemList.Circuit_Chip_Pico.get(1L)}, 3000, 500000);

        GT_Values.RA.addMultiblockChemicalRecipe(
                new ItemStack[]{CoreItems.getRecipe(TCetiESeaweedExtract.getMetaID(), 1),
                        GT_Utility.getIntegratedCircuit(1)}, new FluidStack[]{Materials.Radon.getGas(1000)},
                new FluidStack[]{Materials.OilHeavy.getFluid(500), Materials.Ethanol.getFluid(300),
                        Materials.EnrichedBacterialSludge.getFluid(200)},
                new ItemStack[]{Materials.AlienOrganic.getDust(1)}, 500, 500000);
        GT_Values.RA.addMultiblockChemicalRecipe(
                new ItemStack[]{CoreItems.getRecipe(35, 1), GT_Utility.getIntegratedCircuit(1)},
                new FluidStack[]{Materials.Radon.getGas(1000)},
                new FluidStack[]{Materials.OilMedium.getFluid(500), Materials.Methanol.getFluid(350),
                        Materials.EnrichedBacterialSludge.getFluid(150)},
                new ItemStack[]{Materials.AlienOrganic.getDust(1)}, 500, 500000);

        GT_Values.RA.addChemicalRecipe(Materials.Yttrium.getDust(2), GT_Utility.getIntegratedCircuit(6),
                Materials.Oxygen.getGas(3000), null, Itemstack(Core_Items.getInstance(), 1, 40), null, 400,
                30);
        //NO2
        GT_Values.RA.addMultiblockChemicalRecipe(
                Utilits.arrayIS(GT_Utility.getIntegratedCircuit(3)),
                Utilits.arrayFS(Materials.Nitrogen.getGas(1000L), Materials.Oxygen.getGas(2000L)),
                Utilits.arrayFS(Materials.NitrogenDioxide.getGas(3000L)),
                null, 8 * 20, 30
        );
    }

    private void bath() {
        // --- White Concrete
        GT_Values.RA.addChemicalBathRecipe(Blockstack(UtilBlock, 1, 0),
                new FluidStack(FluidRegistry.getFluid("dye.chemical.dyewhite"), 18),
                Blockstack(UtilBlock, 1, 2), GT_Values.NI, GT_Values.NI, new int[]{10000}, 64, 2);
        GT_Values.RA.addChemicalBathRecipe(Blockstack(UtilBlock, 1, 0),
                new FluidStack(FluidRegistry.getFluid("dye.watermixed.dyewhite"), 18),
                Blockstack(UtilBlock, 1, 2), GT_Values.NI, GT_Values.NI, new int[]{10000}, 64, 2);

//Lens
        GT_Values.RA.addChemicalBathRecipe(
                GT_OreDictUnificator.get(OrePrefixes.lens, Materials.ReinforcedGlass, 1L),
                Materials.Chlorine.getGas(100L),
                CoreItems2.getRecipe(RefinedReinforcedGlassLense.getMetaID(), 1), GT_Values.NI,
                GT_Values.NI, null, 600, 16);
        GT_Values.RA
                .addChemicalBathRecipe(CoreItems2.getRecipe(RefinedReinforcedGlassLense.getMetaID(), 1),
                        Materials.Radon.getGas(250), CoreItems2.getRecipe(ChargedGlassLense.getMetaID(), 1),
                        null, null, null, 384, 480);
        GT_Values.RA
                .addChemicalBathRecipe(CoreItems2.getRecipe(HugeRefinedReinforcedGlassLense.getMetaID(), 1),
                        Materials.Radon.getGas(1250),
                        CoreItems2.getRecipe(HugeChargedGlassLense.getMetaID(), 1), null, null, null, 384,
                        1920);
        GT_Values.RA
                .addLaserEngraverRecipe(CoreItems2.getRecipe(RefinedReinforcedGlassLense.getMetaID(), 3),
                        GT_Utility
                                .copyAmount(0, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Diamond, 1)),
                        CoreItems2.getRecipe(HugeRefinedReinforcedGlassLense.getMetaID(), 1), 2400, 2000,
                        false);

        for (int i = 1; i <= 15; i++) {
            if (i != 0) {
                GT_Values.RA.addChemicalBathRecipe(Blockstack(IGlassBlock, 1, i), Materials.Chlorine.getGas(50L), Blockstack(IGlassBlock, 0, 0), GT_Values.NI, GT_Values.NI, null, 200, 2);
            }
        }

        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j < Dyes.VALUES[i].getSizeOfFluidList(); j++) {
                if (i != 15) {
                    GT_Values.RA.addChemicalBathRecipe(Blockstack(IGlassBlock, 1, 0), Dyes.VALUES[i].getFluidDye(j, 18L), Blockstack(IGlassBlock, 1, (15 - i)), GT_Values.NI, GT_Values.NI, null, 200, 2);
                }
            }
        }

    }

    private void ciruit() {
        for (Materials tMat : Materials.values()) {
            if (tMat.mStandardMoltenFluid != null && tMat.contains(SubTag.SOLDERING_MATERIAL) &&
                    !(GregTech_API.mUseOnlyGoodSolderingMaterials && !tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD))) {
                int tMultiplier = tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD) ? 1 : tMat.contains(SubTag.SOLDERING_MATERIAL_BAD) ? 4 : 2;

                //Rocket Circuits
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                                GT_ModHandler.getModItem("GalacticraftCore", "item.heavyPlating", 1L, 0),
                                GT_ItemList.spacebox1.get(1)}, tMat.getMolten(288L * tMultiplier / 2L),
                        CoreItems2.getRecipe(0, 1), 1000, 256);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 1L),
                                GT_ModHandler.getModItem("GalacticraftMars", "item.null", 1L, 3),
                                GT_ItemList.spacebox2.get(1)}, tMat.getMolten(576L * tMultiplier / 2L),
                        CoreItems2.getRecipe(1, 1), 1600, 480);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 1L),
                                GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L, 0),
                                GT_ItemList.spacebox3.get(2)}, tMat.getMolten(1152L * tMultiplier / 2L),
                        CoreItems2.getRecipe(2, 1), 2200, 1920);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 1L),
                                CoreItems2.getRecipe(11, 1), GT_ItemList.spacebox4.get(2)},
                        tMat.getMolten(2304L * tMultiplier / 2L), CoreItems2.getRecipe(3, 1), 2800, 4096);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 1L),
                                CoreItems2.getRecipe(12, 1), GT_ItemList.spacebox5.get(4)},
                        tMat.getMolten(4608L * tMultiplier / 2L), CoreItems2.getRecipe(4, 1), 3400, 16384);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 1L),
                                CoreItems2.getRecipe(13, 1), GT_ItemList.spacebox6.get(4)},
                        tMat.getMolten(9216L * tMultiplier / 2L), CoreItems2.getRecipe(5, 1), 4000, 65536);
                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{
                                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Superconductor, 1L),
                                CoreItems2.getRecipe(14, 1), GT_ItemList.spacebox7.get(8)},
                        tMat.getMolten(18432L * tMultiplier / 2L), CoreItems2.getRecipe(6, 1), 4600, 262144);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Infinite, 1L),
                                CoreItems2.getRecipe(15, 1), GT_ItemList.spacebox8.get(8)},
                        tMat.getMolten(36864L * tMultiplier / 2L), CoreItems2.getRecipe(7, 1), 5200, 1048576);

                //Farm Circuits
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                                GT_ModHandler.getModItem("minecraft", "sapling", 64L, 0)},
                        tMat.getMolten(144L * tMultiplier / 2L), CoreItems2.getRecipe(OakScheme.getMetaID(), 1),
                        200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                                GT_ModHandler.getModItem("minecraft", "sapling", 64L, 1)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        CoreItems2.getRecipe(SpruceScheme.getMetaID(), 1), 200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                                GT_ModHandler.getModItem("minecraft", "sapling", 64L, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        CoreItems2.getRecipe(BirchScheme.getMetaID(), 1), 200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                                GT_ModHandler.getModItem("minecraft", "sapling", 64L, 3)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        CoreItems2.getRecipe(JungleScheme.getMetaID(), 1), 200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                                GT_ModHandler.getModItem("minecraft", "sapling", 64L, 4)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        CoreItems2.getRecipe(AcaciaScheme.getMetaID(), 1), 200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                                GT_ModHandler.getModItem("minecraft", "sapling", 64L, 5)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        CoreItems2.getRecipe(DarkOakScheme.getMetaID(), 1), 200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                                GT_ModHandler.getModItem("IC2", "blockRubSapling", 64L, 0)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        CoreItems2.getRecipe(RubberScheme.getMetaID(), 1), 200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Bio, 1L),
                                GT_ModHandler.getModItem("GalaxySpace", "barnardaCsapling", 64L, 1)},
                        tMat.getMolten(1152L * tMultiplier / 2L),
                        CoreItems2.getRecipe(BarnardaCScheme.getMetaID(), 1), 1000, 8000000);


            }
        }
    }

    private void assemblyLine() {
        //UpgradeCasingT2
        GT_Values.RA.addAssemblylineRecipe(GT_ItemList.UpgradeCasingT1.get(1L), 144000, new Object[]{
                        ItemList.Hull_LuV.get(1L),
                        GT_ModHandler.getModItem("extracells", "craftingstorage", 1, 0),
                        GT_ItemList.UpgradeCasingT1.get(4L),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HastelloyN, 16),
                        ItemList.Electric_Motor_LuV.get(4L),
                        ItemList.Electric_Piston_LuV.get(4L),
                        ItemList.Conveyor_Module_LuV.get(4L),
                        ItemList.Robot_Arm_LuV.get(4L),
                        new Object[]{OrePrefixes.circuit.get(Materials.Master), 8},
                        GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.YttriumBariumCuprate, 16),
                        GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.Chrome, 16),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 32)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(1152),
                        Materials.Lubricant.getFluid(1000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 1000)
                },
                GT_ItemList.UpgradeCasingT2.get(1L), 120 * 20, 30720);

        //UpgradeCasingT3
        GT_Values.RA.addAssemblylineRecipe(GT_ItemList.UpgradeCasingT2.get(1L), 288000, new Object[]{
                        ItemList.Hull_ZPM.get(1L),
                        GT_ModHandler.getModItem("extracells", "craftingstorage", 1, 1),
                        GT_ItemList.UpgradeCasingT2.get(4L),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Lafium, 16),
                        ItemList.Electric_Motor_ZPM.get(4L),
                        ItemList.Electric_Piston_ZPM.get(4L),
                        ItemList.Conveyor_Module_ZPM.get(4L),
                        ItemList.Robot_Arm_ZPM.get(4L),
                        new Object[]{OrePrefixes.circuit.get(Materials.Ultimate), 8},
                        GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Naquadah, 16),
                        GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.Iridium, 16),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 48)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(2304),
                        Materials.Lubricant.getFluid(2000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 2000)
                },
                GT_ItemList.UpgradeCasingT3.get(1L), 160 * 20, 122880);

        //UpgradeCasingT4
        GT_Values.RA.addAssemblylineRecipe(GT_ItemList.UpgradeCasingT3.get(1L), 576000, new Object[]{
                        ItemList.Hull_UV.get(1L),
                        GT_ModHandler.getModItem("extracells", "craftingstorage", 1, 2),
                        GT_ItemList.UpgradeCasingT3.get(4L),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.CinobiteA243, 16),
                        ItemList.Electric_Motor_UV.get(4L),
                        ItemList.Electric_Piston_UV.get(4L),
                        ItemList.Conveyor_Module_UV.get(4L),
                        ItemList.Robot_Arm_UV.get(4L),
                        new Object[]{OrePrefixes.circuit.get(Materials.Superconductor), 8},
                        GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.NaquadahAlloy, 16),
                        GT_OreDictUnificator.get(OrePrefixes.itemCasing, Materials.Osmium, 16),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 64)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(4608),
                        Materials.Lubricant.getFluid(4000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 4000)
                },
                GT_ItemList.UpgradeCasingT4.get(1L), 200 * 20, 500000);

        //Naquadah Chamber Casing
        GT_Values.RA.addAssemblylineRecipe(CoreItems2.getRecipe(163, 1), 144000, new Object[]{
                        GT_ItemList.NqCasing.get(1),
                        CoreItems2.getRecipe(163, 6),
                        ItemList.Electric_Pump_LuV.get(4L),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Europium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Plutonium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Lead, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.NaquadahAlloy, 10),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Desh, 16)
                },
                new FluidStack[]{
                        Materials.Trinium.getMolten(1296),
                        Materials.Osmium.getMolten(1296),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 2000),
                        Materials.Argon.getGas(1000)
                },
                new ItemStack(InsideBlock, 1, 0), 120 * 20, 10000);

        //Tether Core
        GT_Values.RA.addAssemblylineRecipe(CoreItems2.getRecipe(162, 1), 156000, new Object[]{
                        CoreItems2.getRecipe(162, 6),
                        ItemList.Electric_Piston_LuV.get(8L),
                        ItemList.Emitter_LuV.get(8L),
                        ItemList.Sensor_LuV.get(8L),
                        CoreItems2.getRecipe(50, 10),
                        new Object[]{OrePrefixes.circuit.get(Materials.Master), 16},
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.NaquadahAlloy, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.NaquadahAlloy, 8),
                        GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.Diamond, 16),
                        GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.Diamond, 16)
                },
                new FluidStack[]{
                        Materials.Duranium.getMolten(1296),
                        Materials.Osmiridium.getMolten(1296),
                        Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.getMolten(1296),
                        Materials.NiobiumTitanium.getMolten(1296)
                },
                new ItemStack(NqTetherBlock, 1, 0), 160 * 20, 14576);

        //Heavy Metal Cyclon
        GT_Values.RA.addAssemblylineRecipe(
                GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.Inconel792, 1), 156000,
                new Object[]{
                        ItemList.Hull_LuV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 4),
                        new Object[]{OrePrefixes.circuit.get(Materials.Master), 4},
                        GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                        ItemList.Electric_Motor_LuV.get(4L),
                        ItemList.Electric_Pump_LuV.get(4L),
                        ItemList.Conveyor_Module_LuV.get(4L),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Inconel792, 8),
                        GT_OreDictUnificator.get(OrePrefixes.stickLong, Materials.HSSS, 4),
                        GT_OreDictUnificator.get(OrePrefixes.gear, Materials.TiBetaC, 8),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.TiBetaC, 8),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.HSSS, 8),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSG, 16)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(1152),
                        Materials.Lubricant.getFluid(1000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 1000),
                        Materials.Osmiridium.getMolten(1152)
                },
                GT_ItemList.Heavy_Metal_Cyclone.get(1L), 160 * 20, 30720);

        //Naquadah Generator
        GT_Values.RA.addAssemblylineRecipe(
                GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.MaragingSteel300, 1), 172000,
                new Object[]{
                        GT_ModHandler.getModItem("impact", "impact_inside_block", 1),
                        GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.MaragingSteel300, 4),
                        ItemList.Electric_Pump_LuV.get(4L),
                        ItemList.Field_Generator_LuV.get(4L),
                        ItemList.Sensor_LuV.get(4L),
                        new Object[]{OrePrefixes.circuit.get(Materials.Master), 4L},
                        GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.SuperconductorLuV, 8),
                        GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Ruby, 8)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(1152),
                        Materials.Lubricant.getFluid(1000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 1000),
                        Materials.Trinium.getMolten(1152)
                },
                GT_ItemList.Naquadah_Liquid_multi.get(1L), 240 * 20, 26780);

        //Naquadah Enriched Generator
        GT_Values.RA.addAssemblylineRecipe(
                GT_OreDictUnificator.get(OrePrefixes.pipeHuge, Materials.Inconel690, 1), 256000,
                new Object[]{
                        GT_ModHandler.getModItem("impact", "impact_nqtether_block", 1),
                        GT_OreDictUnificator.get(OrePrefixes.pipeLarge, Materials.Inconel690, 6),
                        ItemList.Electric_Pump_ZPM.get(6L),
                        ItemList.Field_Generator_ZPM.get(8L),
                        ItemList.Sensor_ZPM.get(8L),
                        new Object[]{OrePrefixes.circuit.get(Materials.Ultimate), 8},
                        GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.SuperconductorZPM, 16),
                        GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Sapphire, 16)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(2304),
                        Materials.Lubricant.getFluid(2000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 2000),
                        Materials.Oriharukon.getMolten(2304)
                },
                GT_ItemList.Naquadah_Liquid_Enriched.get(1L), 320 * 20, 118236);

        //Parallel Supercomputer
        GT_Values.RA.addAssemblylineRecipe(
                GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockController", 1), 172000,
                new Object[]{
                        GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockController", 1),
                        new Object[]{OrePrefixes.circuit.get(Materials.Elite), 4},
                        ItemList.Tool_DataOrb.get(1L),
                        GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.SuperconductorIV, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Duraluminium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSG, 16),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 16)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(2304),
                        Materials.Lubricant.getFluid(2000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 2000),
                        Materials.Hydrogen.getGas(2000)
                },
                GT_ItemList.Parallel_Computer.get(1L), 100 * 20, 30720);
    }

    public void wireassembler() {
        // --- Space Elevator Hawser
        RA.addWireAssemblerRecipe(new ItemStack[]{
                        GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.HSLA, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Steel, 64L),
                        GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Vanadium, 64L)}, null,
                new ItemStack(SpaceElevatorBlock, 1, 0), 80 * 20, 1024, false);
    }

    private void disassembler() {
        //Parallel Hatch 4P IN
        RA.addDisassemblerRecipe(
                GT_ItemList.Parallel_Hatch_IN4.get(1), new ItemStack[]{ItemList.Hull_IV.get(1),
                        GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 1),
                        ItemList.Sensor_IV.get(1), ItemList.Circuit_Elite.get(4)}, 6000, 7680);
        //Parallel Hatch 4P OUT
        RA.addDisassemblerRecipe(
                GT_ItemList.Parallel_Hatch_OUT4.get(1), new ItemStack[]{ItemList.Hull_IV.get(1),
                        GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 1),
                        ItemList.Emitter_IV.get(1), ItemList.Circuit_Elite.get(4)}, 6000, 7680);
        //Parallel Hatch 16P IN
        RA.addDisassemblerRecipe(
                GT_ItemList.Parallel_Hatch_IN16.get(1), new ItemStack[]{ItemList.Hull_LuV.get(1),
                        GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 2),
                        ItemList.Sensor_LuV.get(1), ItemList.Circuit_Master.get(4)}, 8000, 30720);
        //Parallel Hatch 16P OUT
        RA.addDisassemblerRecipe(
                GT_ItemList.Parallel_Hatch_OUT16.get(1), new ItemStack[]{ItemList.Hull_LuV.get(1),
                        GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 2),
                        ItemList.Emitter_LuV.get(1), ItemList.Circuit_Master.get(4)}, 8000, 30720);
        //Parallel Hatch 64P IN
        RA.addDisassemblerRecipe(
                GT_ItemList.Parallel_Hatch_IN64.get(1), new ItemStack[]{ItemList.Hull_ZPM.get(1),
                        GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 3),
                        ItemList.Sensor_ZPM.get(1), ItemList.Circuit_Quantummainframe.get(4)}, 10000, 122880);
        //Parallel Hatch 64P OUT
        RA.addDisassemblerRecipe(
                GT_ItemList.Parallel_Hatch_OUT64.get(1), new ItemStack[]{ItemList.Hull_ZPM.get(1),
                        GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockCraftingStorage", 1L, 3),
                        ItemList.Emitter_ZPM.get(1), ItemList.Circuit_Quantummainframe.get(4)}, 10000, 122880);
        //Parallel Hatch 256P IN
        RA.addDisassemblerRecipe(
                GT_ItemList.Parallel_Hatch_IN256.get(1), new ItemStack[]{ItemList.Hull_UV.get(1),
                        GT_ModHandler.getModItem("extracells", "craftingstorage", 1L),
                        ItemList.Sensor_UV.get(1), ItemList.Circuit_Crystalmainframe.get(4L)}, 12000, 500000);
        //Parallel Hatch 256P OUT
        RA.addDisassemblerRecipe(
                GT_ItemList.Parallel_Hatch_OUT256.get(1), new ItemStack[]{ItemList.Hull_UV.get(1),
                        GT_ModHandler.getModItem("extracells", "craftingstorage", 1L),
                        ItemList.Emitter_UV.get(1), ItemList.Circuit_Crystalmainframe.get(4L)}, 12000, 500000);

        //SolarPanel
        RA.addDisassemblerRecipe(
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 0),
                new ItemStack[]{ItemList.Cover_SolarPanel_8V.get(1L), GT_ItemList.ULVRobotArm.get(1L),
                        ItemList.Large_Fluid_Cell_Steel.get(1L), ItemList.Sensor_LV.get(1L),
                        GT_ModHandler.getModItem("IC2", "itemPartCircuit", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Silicon, 6),
                        ItemList.Battery_Buffer_2by2_ULV.get(1L)}, 1000, 30);
        RA.addDisassemblerRecipe(
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 1),
                new ItemStack[]{ItemList.Cover_SolarPanel_LV.get(1L), ItemList.Robot_Arm_LV.get(1L),
                        ItemList.Large_Fluid_Cell_Aluminium.get(1L), ItemList.Sensor_MV.get(1L),
                        ItemList.Circuit_Good.get(4), GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Silicon, 6),
                        ItemList.Battery_Buffer_2by2_LV.get(1L)}, 2000, 120);
        RA.addDisassemblerRecipe(
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 2),
                new ItemStack[]{ItemList.Cover_SolarPanel_MV.get(1L), ItemList.Robot_Arm_MV.get(1L),
                        ItemList.Large_Fluid_Cell_StainlessSteel.get(1L), ItemList.Sensor_HV.get(1L),
                        GT_ModHandler.getModItem("IC2", "itemPartCircuitAdv", 6L),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Silicon, 6),
                        ItemList.Battery_Buffer_2by2_MV.get(1L)}, 3000, 480);
        RA.addDisassemblerRecipe(
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 3),
                new ItemStack[]{ItemList.Cover_SolarPanel_HV.get(1L), ItemList.Robot_Arm_HV.get(1L),
                        ItemList.Large_Fluid_Cell_Titanium.get(1L), ItemList.Sensor_EV.get(1L),
                        ItemList.Circuit_Data.get(8), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.GalliumArsenide, 8),
                        ItemList.Battery_Buffer_2by2_HV.get(1L)}, 4000, 1920);
        RA.addDisassemblerRecipe(
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 4),
                new ItemStack[]{ItemList.Cover_SolarPanel_EV.get(1L), ItemList.Robot_Arm_EV.get(1L),
                        ItemList.Large_Fluid_Cell_TungstenSteel.get(1L), ItemList.Sensor_IV.get(1L),
                        ItemList.Circuit_Elite.get(10), GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.GalliumArsenide, 8),
                        ItemList.Battery_Buffer_2by2_EV.get(1L)}, 5000, 7680);
        RA.addDisassemblerRecipe(
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 5),
                new ItemStack[]{ItemList.Cover_SolarPanel_IV.get(1L), ItemList.Robot_Arm_IV.get(1L),
                        ItemList.Large_Fluid_Cell_Chrome.get(1L), ItemList.Sensor_LuV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 12),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.GalliumArsenide, 8),
                        ItemList.Battery_Buffer_2by2_IV.get(1L)}, 6000, 30720);
        RA.addDisassemblerRecipe(
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 6),
                new ItemStack[]{ItemList.Cover_SolarPanel_LuV.get(1L), ItemList.Robot_Arm_LuV.get(1L),
                        ItemList.Large_Fluid_Cell_Iridium.get(1L), ItemList.Sensor_ZPM.get(1L),
                        ItemList.Circuit_Quantummainframe.get(14),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Sunnarium, 10),
                        ItemList.Battery_Buffer_2by2_LuV.get(1L)}, 7000, 122880);
        RA.addDisassemblerRecipe(
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 7),
                new ItemStack[]{ItemList.Cover_SolarPanel_ZPM.get(1L), ItemList.Robot_Arm_ZPM.get(1L),
                        ItemList.Large_Fluid_Cell_Osmium.get(1L), ItemList.Sensor_UV.get(1L),
                        ItemList.Circuit_Crystalmainframe.get(16L),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Sunnarium, 10),
                        ItemList.Battery_Buffer_2by2_ZPM.get(1L)}, 8000, 500000);
        RA.addDisassemblerRecipe(
                GT_ModHandler.getModItem("impact", "BlockAdvSolarPanel", 1L, 8),
                new ItemStack[]{ItemList.Cover_SolarPanel_UV.get(1L), ItemList.Robot_Arm_UV.get(1L),
                        ItemList.Large_Fluid_Cell_Neutronium.get(1L), ItemList.Sensor_UHV.get(1L),
                        ItemList.Circuit_Wetwaremainframe.get(18),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Sunnarium, 10),
                        ItemList.Battery_Buffer_2by2_UV.get(1L)}, 10000, 500000);

        //LapotronicCapacitorIV
        RA.addDisassemblerRecipe(
                new ItemStack(lscLapotronicEnergyUnit, 1, 1),
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_LapotronicOrb.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Platinum, 8),
                ItemList.Circuit_Chip_PIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.TungstenSteel, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HastelloyC276, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSG, 64)}, 1000 * 20, 7680);

        //Energium Orb Capacitor
        RA.addDisassemblerRecipe(
                new ItemStack(lscLapotronicEnergyUnit, 1, 6),
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.EnergyCrystal_IV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Platinum, 8),
                ItemList.Circuit_Chip_PIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.TungstenSteel, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HastelloyC276, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSG, 64)}, 1000 * 20, 7680);

        //LapotronicCapacitorLuV
        RA.addDisassemblerRecipe(
                new ItemStack(lscLapotronicEnergyUnit, 1, 2),
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_LapotronicOrb2.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NiobiumTitanium, 8),
                ItemList.Circuit_Chip_HPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.YttriumBariumCuprate, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HastelloyN, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSE, 64)}, 1200 * 20, 30720);

        //LapotronicCapacitorZPM
        RA.addDisassemblerRecipe(
                new ItemStack(lscLapotronicEnergyUnit, 1, 3),
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_Module.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Osmiridium, 8),
                ItemList.Circuit_Chip_UHPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Naquadah, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Lafium, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSS, 64)}, 1400 * 20, 122880);

        //LapotronicCapacitorUV
        RA.addBasicLineRecipe(new ItemStack[]{
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.Energy_Cluster.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NaquadahAlloy, 8),
                ItemList.Circuit_Chip_NPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Duranium, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.CinobiteA243, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Tritanium, 64)
        }, new ItemStack(lscLapotronicEnergyUnit, 1, 4), null, 1600 * 20, 500000);

        //LapotronicCapacitorUHV
        RA.addDisassemblerRecipe(
                new ItemStack(lscLapotronicEnergyUnit, 1, 5),
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.ZPM2.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Americium, 8),
                ItemList.Circuit_Chip_PPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Europium, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Pikyonium64B, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Neutronium, 64)}, 1800 * 20, 500000);

        //Mysterious Crystal Orb Capacitor
        RA.addDisassemblerRecipe(
                new ItemStack(lscLapotronicEnergyUnit, 1, 7),
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.MysteriousCrystalOrb.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Americium, 8),
                ItemList.Circuit_Chip_PPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Europium, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Pikyonium64B, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Neutronium, 64)}, 1800 * 20, 500000);

        //Mysterious Crystal Module Capacitor
        RA.addDisassemblerRecipe(
                new ItemStack(lscLapotronicEnergyUnit, 1, 8),
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Inconel792, 1),
                ItemList.MysteriousCrystalModule.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Neutronium, 8),
                ItemList.Circuit_Chip_QPIC.get(12L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Draconium, 32),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Quantum, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Phoenixite, 64)}, 2000 * 20, 500000);

        //Dynamo Hatches IV-UHV
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti2_EV.get(1), new ItemStack[]{ItemList.Hatch_Dynamo_EV.get(1L),
                        ItemList.EV_Coil.get(1), GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.BlackSteel, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.BT6, 1)}, 500, 1920);

        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti2_IV.get(1), new ItemStack[]{ItemList.Hatch_Dynamo_IV.get(1L),
                        ItemList.IV_Coil.get(1), GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.TungstenSteel, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Nitinol, 1)}, 500, 7680);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti4_IV.get(1), new ItemStack[]{ItemList.Transformer_LuV_IV.get(1L),
                        CustomItemList.eM_dynamoMulti2_IV.get(1L), ItemList.Circuit_Chip_HPIC.get(2L),
                        ItemList.IV_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.TungstenSteel, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Nitinol, 1)}, 1000, 7680);

        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti2_LuV.get(1), new ItemStack[]{ItemList.Hatch_Dynamo_LuV.get(1),
                        ItemList.LuV_Coil.get(1), GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.VanadiumGallium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.HastelloyN, 1)}, 500, 30720);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti4_LuV.get(1), new ItemStack[]{ItemList.Transformer_ZPM_LuV.get(1L),
                        CustomItemList.eM_dynamoMulti2_LuV.get(1), ItemList.Circuit_Chip_UHPIC.get(2),
                        ItemList.LuV_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.VanadiumGallium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.HastelloyN, 1)}, 1000, 30720);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti16_LuV.get(1), new ItemStack[]{ItemList.Transformer_HA_ZPM_LuV.get(1L),
                        CustomItemList.eM_dynamoMulti4_LuV.get(1), ItemList.Circuit_Chip_UHPIC.get(4),
                        ItemList.LuV_Coil.get(4), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.VanadiumGallium, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.HastelloyN, 2)}, 2000, 30720);

        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti2_ZPM.get(1), new ItemStack[]{ItemList.Hatch_Dynamo_ZPM.get(1),
                        ItemList.ZPM_Coil.get(1), GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.Naquadah, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lafium, 1)}, 500, 122880);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti4_ZPM.get(1), new ItemStack[]{ItemList.Transformer_UV_ZPM.get(1L),
                        CustomItemList.eM_dynamoMulti2_ZPM.get(1), ItemList.Circuit_Chip_NPIC.get(2),
                        ItemList.ZPM_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Naquadah, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Lafium, 1)}, 1000, 122880);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti16_ZPM.get(1), new ItemStack[]{ItemList.Transformer_HA_UV_ZPM.get(1L),
                        CustomItemList.eM_dynamoMulti4_ZPM.get(1), ItemList.Circuit_Chip_NPIC.get(4),
                        ItemList.ZPM_Coil.get(4), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Naquadah, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Lafium, 2)}, 2000, 122880);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti64_ZPM.get(1), new ItemStack[]{ItemList.WetTransformer_UV_ZPM.get(1L),
                        CustomItemList.eM_dynamoMulti16_ZPM.get(1), ItemList.Circuit_Chip_NPIC.get(6),
                        ItemList.ZPM_Coil.get(8), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.Naquadah, 32),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Lafium, 4)}, 4000, 122880);

        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti2_UV.get(1), new ItemStack[]{ItemList.Hatch_Dynamo_UV.get(1),
                        ItemList.UV_Coil.get(1), GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.ElectrumFlux, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.CinobiteA243, 1)}, 500, 500000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti4_UV.get(1), new ItemStack[]{ItemList.Transformer_MAX_UV.get(1L),
                        CustomItemList.eM_dynamoMulti2_UV.get(1), ItemList.Circuit_Chip_PPIC.get(2),
                        ItemList.UV_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.ElectrumFlux, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.CinobiteA243, 1)}, 1000, 500000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti16_UV.get(1), new ItemStack[]{ItemList.Transformer_HA_UHV_UV.get(1L),
                        CustomItemList.eM_dynamoMulti4_UV.get(1), ItemList.Circuit_Chip_PPIC.get(4),
                        ItemList.UV_Coil.get(4), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.ElectrumFlux, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.CinobiteA243, 2)}, 2000, 500000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti64_UV.get(1), new ItemStack[]{ItemList.WetTransformer_UHV_UV.get(1L),
                        CustomItemList.eM_dynamoMulti16_UV.get(1), ItemList.Circuit_Chip_PPIC.get(6),
                        ItemList.UV_Coil.get(8), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.ElectrumFlux, 32),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.CinobiteA243, 4)}, 4000, 500000);

        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti2_UHV.get(1), new ItemStack[]{ItemList.Hatch_Dynamo_MAX.get(1),
                        ItemList.UHV_Coil.get(1), GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.Europium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Pikyonium64B, 1)}, 500, 2000000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti4_UHV.get(1), new ItemStack[]{ItemList.Transformer_UEV_UHV.get(1L),
                        CustomItemList.eM_dynamoMulti2_UHV.get(1), ItemList.Circuit_Chip_QPIC.get(2),
                        ItemList.UHV_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Europium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Pikyonium64B, 1)}, 1000, 2000000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti16_UHV.get(1), new ItemStack[]{ItemList.Transformer_HA_UEV_UHV.get(1L),
                        CustomItemList.eM_dynamoMulti4_UHV.get(1), ItemList.Circuit_Chip_QPIC.get(4),
                        ItemList.UHV_Coil.get(4), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Europium, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Pikyonium64B, 2)}, 2000, 2000000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_dynamoMulti64_UHV.get(1), new ItemStack[]{ItemList.WetTransformer_UEV_UHV.get(1L),
                        CustomItemList.eM_dynamoMulti16_UHV.get(1), ItemList.Circuit_Chip_QPIC.get(6),
                        ItemList.UHV_Coil.get(8), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.Europium, 32),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Pikyonium64B, 4)}, 4000, 2000000);

        //Energy Hatches 4A-64A  IV-UHV
        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti4_IV.get(1), new ItemStack[]{ItemList.Transformer_LuV_IV.get(1L),
                        ItemList.Hatch_Energy_IV.get(1), ItemList.Circuit_Chip_HPIC.get(2),
                        ItemList.IV_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.TungstenSteel, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Nitinol, 1)}, 1000, 7680);

        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti4_LuV.get(1), new ItemStack[]{ItemList.Transformer_ZPM_LuV.get(1L),
                        ItemList.Hatch_Energy_LuV.get(1), ItemList.Circuit_Chip_UHPIC.get(2),
                        ItemList.LuV_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.VanadiumGallium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.HastelloyN, 1)}, 1000, 30720);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti16_LuV.get(1), new ItemStack[]{ItemList.Transformer_HA_ZPM_LuV.get(1L),
                        CustomItemList.eM_energyMulti4_LuV.get(1), ItemList.Circuit_Chip_UHPIC.get(4),
                        ItemList.LuV_Coil.get(4), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.VanadiumGallium, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.HastelloyN, 2)}, 2000, 30720);

        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti4_ZPM.get(1), new ItemStack[]{ItemList.Transformer_UV_ZPM.get(1L),
                        ItemList.Hatch_Energy_ZPM.get(1), ItemList.Circuit_Chip_NPIC.get(2),
                        ItemList.ZPM_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Naquadah, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Lafium, 1)}, 1000, 122880);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti16_ZPM.get(1), new ItemStack[]{ItemList.Transformer_HA_UV_ZPM.get(1L),
                        CustomItemList.eM_energyMulti4_ZPM.get(1), ItemList.Circuit_Chip_NPIC.get(4),
                        ItemList.ZPM_Coil.get(4), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Naquadah, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Lafium, 2)}, 2000, 122880);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti64_ZPM.get(1), new ItemStack[]{ItemList.WetTransformer_UV_ZPM.get(1L),
                        CustomItemList.eM_energyMulti16_ZPM.get(1), ItemList.Circuit_Chip_NPIC.get(6),
                        ItemList.ZPM_Coil.get(8), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.Naquadah, 32),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Lafium, 4)}, 4000, 122880);

        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti4_UV.get(1), new ItemStack[]{ItemList.Transformer_MAX_UV.get(1L),
                        ItemList.Hatch_Energy_UV.get(1), ItemList.Circuit_Chip_PPIC.get(2),
                        ItemList.UV_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.ElectrumFlux, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.CinobiteA243, 1)}, 1000, 500000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti16_UV.get(1), new ItemStack[]{ItemList.Transformer_HA_UHV_UV.get(1L),
                        CustomItemList.eM_energyMulti4_UV.get(1), ItemList.Circuit_Chip_PPIC.get(4),
                        ItemList.UV_Coil.get(4), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.ElectrumFlux, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.CinobiteA243, 2)}, 2000, 500000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti64_UV.get(1), new ItemStack[]{ItemList.WetTransformer_UHV_UV.get(1L),
                        CustomItemList.eM_energyMulti16_UV.get(1), ItemList.Circuit_Chip_PPIC.get(6),
                        ItemList.UV_Coil.get(8), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.ElectrumFlux, 32),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.CinobiteA243, 4)}, 4000, 500000);

        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti4_UHV.get(1), new ItemStack[]{ItemList.Transformer_UEV_UHV.get(1L),
                        ItemList.Hatch_Energy_MAX.get(1), ItemList.Circuit_Chip_QPIC.get(2),
                        ItemList.UHV_Coil.get(2), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Europium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Pikyonium64B, 1)}, 1000, 2000000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti16_UHV.get(1), new ItemStack[]{ItemList.Transformer_HA_UEV_UHV.get(1L),
                        CustomItemList.eM_energyMulti4_UHV.get(1), ItemList.Circuit_Chip_QPIC.get(4),
                        ItemList.UHV_Coil.get(4), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Europium, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Pikyonium64B, 2)}, 2000, 2000000);
        RA.addDisassemblerRecipe(
                CustomItemList.eM_energyMulti64_UHV.get(1), new ItemStack[]{ItemList.WetTransformer_UEV_UHV.get(1L),
                        CustomItemList.eM_energyMulti16_UHV.get(1), ItemList.Circuit_Chip_QPIC.get(6),
                        ItemList.UHV_Coil.get(8), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.Europium, 32),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Pikyonium64B, 4)}, 4000, 2000000);

        //Nuclear Reactor I
        RA.addDisassemblerRecipe(
                GT_ItemList.Nuclear_Reactor_I.get(1), new ItemStack[]{ItemList.Hull_EV.get(1L),
                        ItemList.Robot_Arm_EV.get(1L), GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Titanium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 4),
                        GT_ModHandler.getModItem("IC2", "reactorPlatingExplosive", 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 8)}, 30 * 20, 1920);

        //Nuclear Reactor II
        RA.addDisassemblerRecipe(
                GT_ItemList.Nuclear_Reactor_II.get(1), new ItemStack[]{ItemList.Hull_IV.get(1L),
                        ItemList.Robot_Arm_IV.get(2L), GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Titanium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 6),
                        GT_ModHandler.getModItem("IC2", "reactorPlatingExplosive", 8), CoreItems2.getRecipe(141, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 10)}, 50 * 20, 7680);

        //Nuclear Reactor III
        RA.addDisassemblerRecipe(
                GT_ItemList.Nuclear_Reactor_III.get(1), new ItemStack[]{ItemList.Hull_LuV.get(1L),
                        ItemList.Robot_Arm_LuV.get(4L), GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Titanium, 8),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.TungstenSteel, 8), CoreItems2.getRecipe(142, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 12)}, 80 * 20, 30720);
    }
}
