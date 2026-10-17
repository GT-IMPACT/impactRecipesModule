package com.impactrecipes.items

import crazypants.enderio.EnderIO
import crazypants.enderio.item.darksteel.DarkSteelItems
import com.impactrecipes.util.RecipeItems
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.ItemStack

public enum class EnderIOItems(
    private val item: Item?,
    private val registryName: String?,
    private val meta: Int,
) : IModItem {

    // Items

    DarkSteelHelmet(
        registryName = "darkSteel_helmet",
        meta = 0,
    ),
    DarkSteelChestplate(
        registryName = "darkSteel_chestplate",
        meta = 0,
    ),
    DarkSteelLeggings(
        registryName = "darkSteel_leggings",
        meta = 0,
    ),
    DarkSteelBoots(
        registryName = "darkSteel_boots",
        meta = 0,
    ),
    FunctionUpgrade(
        item = EnderIO.itemFunctionUpgrade,
        meta = 0,
    ),
    ItemConduit(
        item = EnderIO.itemItemConduit,
        meta = 0,
    ),
    LiquidConduit(
        item = EnderIO.itemLiquidConduit,
        meta = 0,
    ),
    YetaWench(
        item = EnderIO.itemYetaWench,
        meta = 0,
    ),
    BigFilterUpgrade(
        item = EnderIO.itemBigFilterUpgrade,
        meta = 0,
    ),
    BigFilterUpgrade1(
        item = EnderIO.itemBigFilterUpgrade,
        meta = 1,
    ),
    PowerItemFilter(
        item = EnderIO.itemPowerItemFilter,
        meta = 0,
    ),
    OCConduit(
        item = EnderIO.itemOCConduit,
        meta = 0,
    ),
    TravelStaff16(
        item = EnderIO.itemTravelStaff,
        meta = 16,
    ),
    Material2(
        item = EnderIO.itemMaterial,
        meta = 2,
    ),
    EnderFood(
        item = EnderIO.itemEnderFood,
        meta = 0,
    ),
    CoordSelector(
        item = EnderIO.itemCoordSelector,
        meta = 0,
    ),
    BasicCapacitor(
        item = EnderIO.itemBasicCapacitor,
        meta = 0,
    ),
    BasicCapacitor1(
        item = EnderIO.itemBasicCapacitor,
        meta = 1,
    ),
    BasicCapacitor2(
        item = EnderIO.itemBasicCapacitor,
        meta = 2,
    ),
    ConduitProbe(
        item = EnderIO.itemConduitProbe,
        meta = 0,
    ),
    XpTransfer(
        item = EnderIO.itemXpTransfer,
        meta = 0,
    ),
    SoulVessel(
        item = EnderIO.itemSoulVessel,
        meta = 0,
    ),
    BasicFilterUpgrade(
        item = EnderIO.itemBasicFilterUpgrade,
        meta = 0,
    ),
    BasicFilterUpgrade1(
        item = EnderIO.itemBasicFilterUpgrade,
        meta = 1,
    ),
    ModItemFilter(
        item = EnderIO.itemModItemFilter,
        meta = 0,
    ),
    RedstoneConduit(
        item = EnderIO.itemRedstoneConduit,
        meta = 0,
    ),
    RedstoneConduit1(
        item = EnderIO.itemRedstoneConduit,
        meta = 1,
    ),
    RedstoneConduit2(
        item = EnderIO.itemRedstoneConduit,
        meta = 2,
    ),
    PowerConduit(
        item = EnderIO.itemPowerConduit,
        meta = 0,
    ),
    PowerConduit1(
        item = EnderIO.itemPowerConduit,
        meta = 1,
    ),
    PowerConduit2(
        item = EnderIO.itemPowerConduit,
        meta = 2,
    ),
    LiquidConduit1(
        item = EnderIO.itemLiquidConduit,
        meta = 1,
    ),
    LiquidConduit2(
        item = EnderIO.itemLiquidConduit,
        meta = 2,
    ),
    MEConduit(
        item = EnderIO.itemMEConduit,
        meta = 0,
    ),
    MEConduit1(
        item = EnderIO.itemMEConduit,
        meta = 1,
    ),
    MachinePart1(
        item = EnderIO.itemMachinePart,
        meta = 1,
    ),
    Material7(
        item = EnderIO.itemMaterial,
        meta = 7,
    ),
    MachinePart(
        item = EnderIO.itemMachinePart,
        meta = 0,
    ),
    Material6(
        item = EnderIO.itemMaterial,
        meta = 6,
    ),
    Material5(
        item = EnderIO.itemMaterial,
        meta = 5,
    ),
    PowderIngot(
        item = EnderIO.itemPowderIngot,
        meta = 0,
    ),
    Material3(
        item = EnderIO.itemMaterial,
        meta = 3,
    ),
    Material4(
        item = EnderIO.itemMaterial,
        meta = 4,
    ),
    ExtractSpeedUpgrade(
        item = EnderIO.itemExtractSpeedUpgrade,
        meta = 0,
    ),
    ExtractSpeedUpgrade1(
        item = EnderIO.itemExtractSpeedUpgrade,
        meta = 1,
    ),
    Material1(
        item = EnderIO.itemMaterial,
        meta = 1,
    ),
    GliderWing(
        item = DarkSteelItems.itemGliderWing,
        meta = 0,
    ),
    GliderWing1(
        item = DarkSteelItems.itemGliderWing,
        meta = 1,
    ),
    Magnet16(
        item = DarkSteelItems.itemMagnet,
        meta = 16,
    ),
    YetaWrench(
        registryName = "itemYetaWrench",
        meta = 0,
    ),
    AdvancedItemFilter(
        registryName = "itemBasicFilterUpgrade",
        meta = 1,
    ),

    // Blocks

    TravelAnchor(
        registryName = "blockTravelAnchor",
        meta = 0,
    ),
    BasicCapacitorBank(
        registryName = "blockCapBank",
        meta = 1,
    ),
    BlockInventoryPanel(
        block = EnderIO.blockInventoryPanel,
        meta = 0,
    ),
    TravelPlatform(
        block = EnderIO.blockTravelPlatform,
        meta = 0,
    ),
    TelePad(
        block = EnderIO.blockTelePad,
        meta = 0,
    ),
    Transceiver(
        block = EnderIO.blockTransceiver,
        meta = 0,
    ),
    KillerJoe(
        block = EnderIO.blockKillerJoe,
        meta = 0,
    ),
    EnderRail(
        block = EnderIO.blockEnderRail,
        meta = 0,
    ),
    EnderIo(
        block = EnderIO.blockEnderIo,
        meta = 0,
    ),
    AlloySmelter(
        block = EnderIO.blockAlloySmelter,
        meta = 0,
    ),
    Crusher(
        block = EnderIO.blockCrusher,
        meta = 0,
    ),
    PowerMonitor(
        block = EnderIO.blockPowerMonitor,
        meta = 0,
    ),
    Vat(
        block = EnderIO.blockVat,
        meta = 0,
    ),
    WirelessCharger(
        block = EnderIO.blockWirelessCharger,
        meta = 0,
    ),
    ZombieGenerator(
        block = EnderIO.blockZombieGenerator,
        meta = 0,
    ),
    SolarPanel(
        block = EnderIO.blockSolarPanel,
        meta = 0,
    ),
    SolarPanel1(
        block = EnderIO.blockSolarPanel,
        meta = 1,
    ),
    SolarPanel2(
        block = EnderIO.blockSolarPanel,
        meta = 2,
    ),
    SpawnGuard(
        block = EnderIO.blockSpawnGuard,
        meta = 0,
    ),
    WeatherObelisk(
        block = EnderIO.blockWeatherObelisk,
        meta = 0,
    ),
    Buffer(
        block = EnderIO.blockBuffer,
        meta = 0,
    ),
    Buffer1(
        block = EnderIO.blockBuffer,
        meta = 1,
    ),
    Buffer2(
        block = EnderIO.blockBuffer,
        meta = 2,
    ),
    Buffer3(
        block = EnderIO.blockBuffer,
        meta = 3,
    ),
    ReinforcedObsidian(
        block = EnderIO.blockReinforcedObsidian,
        meta = 0,
    ),
    Enchanter(
        block = EnderIO.blockEnchanter,
        meta = 0,
    ),
    BlockDarkIronBars(
        block = EnderIO.blockDarkIronBars,
        meta = 0,
    ),
    DarkSteelPressurePlate(
        block = EnderIO.blockDarkSteelPressurePlate,
        meta = 0,
    ),
    VacuumChest(
        block = EnderIO.blockVacuumChest,
        meta = 0,
    ),
    CapBank1(
        block = EnderIO.blockCapBank,
        meta = 1,
    ),
    CapBank2(
        block = EnderIO.blockCapBank,
        meta = 2,
    ),
    CapBank3(
        block = EnderIO.blockCapBank,
        meta = 3,
    ),
    Painter(
        block = EnderIO.blockPainter,
        meta = 0,
    ),
    Crafter(
        block = EnderIO.blockCrafter,
        meta = 0,
    ),
    FarmStation(
        block = EnderIO.blockFarmStation,
        meta = 0,
    ),
    CombustionGenerator(
        block = EnderIO.blockCombustionGenerator,
        meta = 0,
    ),
    StirlingGenerator(
        block = EnderIO.blockStirlingGenerator,
        meta = 0,
    ),
    Reservoir(
        block = EnderIO.blockReservoir,
        meta = 0,
    ),
    ElectricLight(
        block = EnderIO.blockElectricLight,
        meta = 0,
    ),
    ElectricLight1(
        block = EnderIO.blockElectricLight,
        meta = 1,
    ),
    ElectricLight2(
        block = EnderIO.blockElectricLight,
        meta = 2,
    ),
    ElectricLight3(
        block = EnderIO.blockElectricLight,
        meta = 3,
    ),
    ElectricLight4(
        block = EnderIO.blockElectricLight,
        meta = 4,
    ),
    ElectricLight5(
        block = EnderIO.blockElectricLight,
        meta = 5,
    ),
    Attractor(
        block = EnderIO.blockAttractor,
        meta = 0,
    ),
    ExperianceOblisk(
        block = EnderIO.blockExperianceOblisk,
        meta = 0,
    ),
    SliceAndSplice(
        block = EnderIO.blockSliceAndSplice,
        meta = 0,
    ),
    SoulFuser(
        block = EnderIO.blockSoulFuser,
        meta = 0,
    ),
    PoweredSpawner(
        block = EnderIO.blockPoweredSpawner,
        meta = 0,
    ),
    Tank(
        block = EnderIO.blockTank,
        meta = 0,
    ),
    Tank1(
        block = EnderIO.blockTank,
        meta = 1,
    ),
    DarkSteelAnvil(
        block = EnderIO.blockDarkSteelAnvil,
        meta = 0,
    ),
    FrankenZombieGenerator(
        block = EnderIO.blockFrankenZombieGenerator,
        meta = 0,
    ),
    EnderGenerator(
        block = EnderIO.blockEnderGenerator,
        meta = 0,
    ),
    FusedQuartz(
        block = EnderIO.blockFusedQuartz,
        meta = 0,
    ),
    FusedQuartz2(
        block = EnderIO.blockFusedQuartz,
        meta = 2,
    ),
    FusedQuartz1(
        block = EnderIO.blockFusedQuartz,
        meta = 1,
    ),
    FusedQuartz3(
        block = EnderIO.blockFusedQuartz,
        meta = 3,
    );

    public val modId: String = "EnderIO"

    constructor(
        item: Item,
        meta: Int = 0,
    ) : this(
        item = item,
        registryName = null,
        meta = meta,
    )

    constructor(
        block: Block,
        meta: Int = 0,
    ) : this(
        item = Item.getItemFromBlock(block),
        meta = meta,
    )

    constructor(
        registryName: String,
        meta: Int = 0,
    ) : this(
        item = null,
        registryName = registryName,
        meta = meta,
    )

    public override fun get(amount: Int): ItemStack? {
        if (item != null) {
            return ItemStack(
                item,
                amount,
                meta,
            )
        }

        val name = registryName ?: return null
        return RecipeItems.item(
            mod = modId,
            name = name,
            meta = meta,
            count = amount,
        )
    }
}
