package com.impactrecipes.items

import com.impact.common.item.Core_List_Items
import com.impact.loader.ItemRegistery.IGlassBlock
import com.impact.mods.gregtech.GT_ItemList
import net.minecraft.block.Block
import net.minecraft.item.ItemStack

public enum class ImpactItems(
    private val coreItem: Core_List_Items?,
    private val machineItem: GT_ItemList?,
    private val blockItem: Block?,
    private val meta: Int,
) : IModItem {

    // Items

    AdvancedMiner(item = GT_ItemList.AdvancedMiner),
    PistonPlate(item = Core_List_Items.PistonPlate),
    IridiumAlloyItemCasing(item = Core_List_Items.IridiumAlloyItemCasing),
    IndustryFrame(item = Core_List_Items.IndustryFrame),
    GeneticCircuit(item = GT_ItemList.GeneticCircuit),
    EnvironmentalCircuit(item = GT_ItemList.EnvironmentalCircuit),
    ClearGlassDust(item = Core_List_Items.ClearGlassDust),
    ChargedQuartzDust(item = Core_List_Items.ChargedQuartzDust),
    LargeScreen(item = Core_List_Items.LargeScreen),
    StargateCrystalDust(item = Core_List_Items.StargateCrystalDust),
    StargateShieldingFoil(item = Core_List_Items.StargateShieldingFoil),
    StargateFramePart(item = Core_List_Items.StargateFramePart),
    StargateChevron(item = Core_List_Items.StargateChevron),
    QuantumCrystal(item = Core_List_Items.QuantumCrystal),
    NanoCrystal(item = Core_List_Items.NanoCrystal),
    MicrochipBoard1(item = Core_List_Items.MicrochipBoard1),
    MicrochipBoard2(item = Core_List_Items.MicrochipBoard2),
    MicrochipBoard3(item = Core_List_Items.MicrochipBoard3),
    FlawedFluixCrystal(item = Core_List_Items.FlawedFluixCrystal),
    FlawlessFluixCrystal(item = Core_List_Items.FlawlessFluixCrystal),
    RedstoneRedChipset(item = GT_ItemList.RedstoneRedChipset),
    EngravedEnergyChip(item = GT_ItemList.EngravedEnergyChip),
    EngravedDiamondCrystalChip(item = GT_ItemList.EngravedDiamondCrystalChip),
    EngravedQuantumChip(item = GT_ItemList.EngravedQuantumChip),
    EngravedGoldChip(item = GT_ItemList.EngravedGoldChip),
    AluminiumIronPlate(item = Core_List_Items.AluminiumIronPlate),
    BarnardaCBiochaff(item = Core_List_Items.BarnardaCBiochaff),
    BarnardaCBiomass(item = Core_List_Items.BarnardaCBiomass),
    BlankGeneSampleRaw(item = Core_List_Items.BlankGeneSampleRaw),
    CallistoIceColdIngot(item = Core_List_Items.CallistoIceColdIngot),
    CallistoIceDust(item = Core_List_Items.CallistoIceDust),
    CallistoIceIngot(item = Core_List_Items.CallistoIceIngot),
    ChargedGlassLense(item = Core_List_Items.ChargedGlassLense),
    ConcreteDust(item = Core_List_Items.ConcreteDust),
    Empty1080SpCell(item = Core_List_Items.Empty1080SpCell),
    Empty180SpCell(item = Core_List_Items.Empty180SpCell),
    Empty360SpCell(item = Core_List_Items.Empty360SpCell),
    Empty540SpCell(item = Core_List_Items.Empty540SpCell),
    EuropaIceDust(item = Core_List_Items.EuropaIceDust),
    GeneticTemplateRaw(item = Core_List_Items.GeneticTemplateRaw),
    HugeChargedGlassLense(item = Core_List_Items.HugeChargedGlassLense),
    IrradiantReinforcedAluminiumPlate(item = Core_List_Items.IrradiantReinforcedAluminiumPlate),
    IrradiantReinforcedChromePlate(item = Core_List_Items.IrradiantReinforcedChromePlate),
    IrradiantReinforcedIridiumPlate(item = Core_List_Items.IrradiantReinforcedIridiumPlate),
    IrradiantReinforcedNaquadriaPlate(item = Core_List_Items.IrradiantReinforcedNaquadriaPlate),
    IrradiantReinforcedNeutroniumPlate(item = Core_List_Items.IrradiantReinforcedNeutroniumPlate),
    IrradiantReinforcedTitaniumPlate(item = Core_List_Items.IrradiantReinforcedTitaniumPlate),
    IrradiantReinforcedTungstenPlate(item = Core_List_Items.IrradiantReinforcedTungstenPlate),
    IrradiantReinforcedTungstenSteelPlate(item = Core_List_Items.IrradiantReinforcedTungstenSteelPlate),
    LedoxColdIngot(item = Core_List_Items.LedoxColdIngot),
    MysteriousCrystalColdIngot(item = Core_List_Items.MysteriousCrystalColdIngot),
    MysteriousCrystalIngot(item = Core_List_Items.MysteriousCrystalIngot),
    NANDArray(item = Core_List_Items.NANDArray),
    NaquadahENuclearFuel(item = Core_List_Items.NaquadahENuclearFuel),
    NaquadahNuclearFuel(item = Core_List_Items.NaquadahNuclearFuel),
    NeutronReflectorParts(item = Core_List_Items.NeutronReflectorParts),
    PetcokeDust(item = Core_List_Items.PetcokeDust),
    RawNeutroniumDust(item = Core_List_Items.RawNeutroniumDust),
    ReinforcedAluminiumIronPlate(item = Core_List_Items.ReinforcedAluminiumIronPlate),
    ReinforcedChromeIronPlate(item = Core_List_Items.ReinforcedChromeIronPlate),
    ReinforcedIridiumIronPlate(item = Core_List_Items.ReinforcedIridiumIronPlate),
    ReinforcedNaquadriaIronPlate(item = Core_List_Items.ReinforcedNaquadriaIronPlate),
    ReinforcedNeutroniumIronPlate(item = Core_List_Items.ReinforcedNeutroniumIronPlate),
    ReinforcedTitaniumIronPlate(item = Core_List_Items.ReinforcedTitaniumIronPlate),
    ReinforcedTungstenIronPlate(item = Core_List_Items.ReinforcedTungstenIronPlate),
    ReinforcedTungstenSteelIronPlate(item = Core_List_Items.ReinforcedTungstenSteelIronPlate),
    SixtyKCell(item = Core_List_Items.SixtyKCell),
    SteelBars(item = Core_List_Items.SteelBars),
    SunnariumPiece(item = Core_List_Items.SunnariumPiece),
    TenKCell(item = Core_List_Items.TenKCell),
    ThirtyKCell(item = Core_List_Items.ThirtyKCell),
    ThoriumMOXFuel(item = Core_List_Items.ThoriumMOXFuel),
    ThoriumNuclearFuel(item = Core_List_Items.ThoriumNuclearFuel),
    Zircon(item = Core_List_Items.Zircon),
    PackAsteroids(item = GT_ItemList.packAsteroids),
    PackBarnardaE(item = GT_ItemList.packBarnardaE),
    PackBarnardaF(item = GT_ItemList.packBarnardaF),
    PackCallisto(item = GT_ItemList.packCallisto),
    PackCentauriA(item = GT_ItemList.packCentauriA),
    PackCeres(item = GT_ItemList.packCeres),
    PackDeimos(item = GT_ItemList.packDeimos),
    PackEarth(item = GT_ItemList.packEarth),
    PackEris(item = GT_ItemList.packEris),
    PackEuropa(item = GT_ItemList.packEuropa),
    PackGanymed(item = GT_ItemList.packGanymed),
    PackHaumea(item = GT_ItemList.packHaumea),
    PackIapetus(item = GT_ItemList.packIapetus),
    PackMakeMake(item = GT_ItemList.packMakeMake),
    PackMars(item = GT_ItemList.packMars),
    PackMercury(item = GT_ItemList.packMercury),
    PackMoon(item = GT_ItemList.packMoon),
    PackOberon(item = GT_ItemList.packOberon),
    PackPhobos(item = GT_ItemList.packPhobos),
    PackPluto(item = GT_ItemList.packPluto),
    PackProteus(item = GT_ItemList.packProteus),
    PackTCetiE(item = GT_ItemList.packTCetiE),
    PackTitan(item = GT_ItemList.packTitan),
    PackTriton(item = GT_ItemList.packTriton),
    PackVegaB(item = GT_ItemList.packVegaB),
    PackVenus(item = GT_ItemList.packVenus),
    ULVConveyorModule(item = GT_ItemList.ULVConveyorModule),
    ULVMotor(item = GT_ItemList.ULVMotor),
    ULVPiston(item = GT_ItemList.ULVPiston),
    ULVPump(item = GT_ItemList.ULVPump),
    ULVRobotArm(item = GT_ItemList.ULVRobotArm),

    // Blocks

    BusInputMAX(item = GT_ItemList.Bus_Input_MAX),
    BusInputOPV(item = GT_ItemList.Bus_Input_OPV),
    BusInputUEV(item = GT_ItemList.Bus_Input_UEV),
    BusInputUIV(item = GT_ItemList.Bus_Input_UIV),
    BusInputUMV(item = GT_ItemList.Bus_Input_UMV),
    BusInputUXV(item = GT_ItemList.Bus_Input_UXV),
    BusOutputMAX(item = GT_ItemList.Bus_Output_MAX),
    BusOutputOPV(item = GT_ItemList.Bus_Output_OPV),
    BusOutputUEV(item = GT_ItemList.Bus_Output_UEV),
    BusOutputUIV(item = GT_ItemList.Bus_Output_UIV),
    BusOutputUMV(item = GT_ItemList.Bus_Output_UMV),
    BusOutputUXV(item = GT_ItemList.Bus_Output_UXV),
    HatchInputMAX(item = GT_ItemList.Hatch_Input_MAX),
    HatchInputOPV(item = GT_ItemList.Hatch_Input_OPV),
    HatchInputUEV(item = GT_ItemList.Hatch_Input_UEV),
    HatchInputUIV(item = GT_ItemList.Hatch_Input_UIV),
    HatchInputUMV(item = GT_ItemList.Hatch_Input_UMV),
    HatchInputUXV(item = GT_ItemList.Hatch_Input_UXV),
    HatchOutputMAX(item = GT_ItemList.Hatch_Output_MAX),
    HatchOutputOPV(item = GT_ItemList.Hatch_Output_OPV),
    HatchOutputUEV(item = GT_ItemList.Hatch_Output_UEV),
    HatchOutputUIV(item = GT_ItemList.Hatch_Output_UIV),
    HatchOutputUMV(item = GT_ItemList.Hatch_Output_UMV),
    HatchOutputUXV(item = GT_ItemList.Hatch_Output_UXV),
    MachineEVComponentAssembler(item = GT_ItemList.Machine_EV_ComponentAssembler),
    MachineHVComponentAssembler(item = GT_ItemList.Machine_HV_ComponentAssembler),
    MachineIVComponentAssembler(item = GT_ItemList.Machine_IV_ComponentAssembler),
    MachineLVComponentAssembler(item = GT_ItemList.Machine_LV_ComponentAssembler),
    MachineMVComponentAssembler(item = GT_ItemList.Machine_MV_ComponentAssembler),
    NonupleInputHatch(item = GT_ItemList.Nonuple_Input_Hatch),
    QuadrupleInputHatch(item = GT_ItemList.Quadruple_Input_Hatch),
    IndustrialGlass0(
        block = IGlassBlock,
        meta = 0,
    );

    constructor(item: Core_List_Items) : this(
        coreItem = item,
        machineItem = null,
        blockItem = null,
        meta = 0,
    )

    constructor(item: GT_ItemList) : this(
        coreItem = null,
        machineItem = item,
        blockItem = null,
        meta = 0,
    )

    constructor(
        block: Block,
        meta: Int,
    ) : this(
        coreItem = null,
        machineItem = null,
        blockItem = block,
        meta = meta,
    )

    public override fun get(amount: Int): ItemStack? {
        if (coreItem != null) {
            return coreItem.get(amount)?.copy()
        }
        if (machineItem != null) {
            return machineItem.get(amount.toLong())?.copy()
        }
        if (blockItem != null) {
            return ItemStack(
                blockItem,
                amount,
                meta,
            )
        }
        return null
    }
}
