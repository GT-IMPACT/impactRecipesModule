package com.impactrecipes.items

import com.impactrecipes.util.RecipeItems
import mods.railcraft.common.blocks.detector.EnumDetector
import mods.railcraft.common.blocks.machine.alpha.EnumMachineAlpha
import mods.railcraft.common.blocks.machine.delta.EnumMachineDelta
import mods.railcraft.common.blocks.machine.epsilon.EnumMachineEpsilon
import mods.railcraft.common.blocks.machine.gamma.EnumMachineGamma
import mods.railcraft.common.blocks.signals.EnumSignal
import mods.railcraft.common.blocks.signals.ItemSignalBlockSurveyor
import mods.railcraft.common.blocks.signals.ItemSignalTuner
import mods.railcraft.common.blocks.tracks.EnumTrack
import mods.railcraft.common.carts.EnumCart
import mods.railcraft.common.items.IItemMetaEnum
import mods.railcraft.common.items.ItemCrowbar
import mods.railcraft.common.items.ItemCrowbarReinforced
import mods.railcraft.common.items.ItemElectricMeter
import mods.railcraft.common.items.ItemRail
import mods.railcraft.common.items.ItemRailbed
import mods.railcraft.common.items.ItemTicket
import mods.railcraft.common.items.ItemTicketGold
import mods.railcraft.common.items.ItemTie
import mods.railcraft.common.items.ItemWhistleTuner
import mods.railcraft.common.items.RailcraftItem
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.block.Block
import net.minecraft.item.ItemStack

public enum class RailcraftItems(
    private val stack: ItemStack?,
    private val railcraftItem: RailcraftItem?,
    private val itemMeta: IItemMetaEnum?,
    private val registryName: String?,
    private val meta: Int,
) : IModItem {

    // Items

    MagnifyingGlass(
        registryName = "tool.magnifying.glass",
        meta = 0,
    ),
    IronBoreHead(
        registryName = "borehead.iron",
        meta = 0,
    ),
    SteelBoreHead(
        registryName = "borehead.steel",
        meta = 0,
    ),
    DiamondBoreHead(
        registryName = "borehead.diamond",
        meta = 0,
    ),
    PartCircuitController(
        registryName = "part.circuit.controller",
        meta = 0,
    ),
    PartCircuitSignal(
        registryName = "part.circuit.signal",
        meta = 2,
    ),
    PartCircuitReceiver(
        registryName = "part.circuit.receiver",
        meta = 1,
    ),
    StoneTie(
        registryName = "part.tie",
        meta = 1,
    ),
    WoodenRailbed(
        registryName = "part.railbed",
        meta = 0,
    ),
    StoneRailbed(
        registryName = "part.railbed",
        meta = 1,
    ),
    RebarRegistry(
        registryName = "part.rebar",
        meta = 0,
    ),
    CartWork(stack = EnumCart.WORK.getCartItem()),
    CartTank(stack = EnumCart.TANK.getCartItem()),
    CartCargo(stack = EnumCart.CARGO.getCartItem()),
    CartTrackRelayer(stack = EnumCart.TRACK_RELAYER.getCartItem()),
    CartUndercutter(stack = EnumCart.UNDERCUTTER.getCartItem()),
    CartTrackLayer(stack = EnumCart.TRACK_LAYER.getCartItem()),
    CartTrackRemover(stack = EnumCart.TRACK_REMOVER.getCartItem()),
    CartRedstoneFlux(stack = EnumCart.REDSTONE_FLUX.getCartItem()),
    CartLocoElectric(stack = EnumCart.LOCO_ELECTRIC.getCartItem()),
    CartLocoSteamSolid(stack = EnumCart.LOCO_STEAM_SOLID.getCartItem()),
    CartBore(stack = EnumCart.BORE.getCartItem()),
    CartEnergyBatbox(stack = EnumCart.ENERGY_BATBOX.getCartItem()),
    CartEnergyCesu(stack = EnumCart.ENERGY_CESU.getCartItem()),
    CartEnergyMfe(stack = EnumCart.ENERGY_MFE.getCartItem()),
    Crowbar(stack = ItemCrowbar.getItem()),
    CrowbarReinforced(stack = ItemCrowbarReinforced.getItem()),
    WhistleTuner(stack = ItemWhistleTuner.getItem()),
    ElectricMeter(stack = ItemElectricMeter.getItem()),
    SignalTuner(stack = ItemSignalTuner.getItem()),
    SignalBlockSurveyor(stack = ItemSignalBlockSurveyor.getItem()),
    Ticket(stack = ItemTicket.getTicket()),
    TicketGold(stack = ItemTicketGold.getTicket()),
    SignalLamp(
        item = RailcraftItem.signalLamp,
    ),
    RailWood(
        item = RailcraftItem.rail,
        itemMeta = ItemRail.EnumRail.WOOD,
    ),
    RailStandard(
        item = RailcraftItem.rail,
        itemMeta = ItemRail.EnumRail.STANDARD,
    ),
    RailAdvanced(
        item = RailcraftItem.rail,
        itemMeta = ItemRail.EnumRail.ADVANCED,
    ),
    RailElectric(
        item = RailcraftItem.rail,
        itemMeta = ItemRail.EnumRail.ELECTRIC,
    ),
    RailReinforced(
        item = RailcraftItem.rail,
        itemMeta = ItemRail.EnumRail.REINFORCED,
    ),
    RailSpeed(
        item = RailcraftItem.rail,
        itemMeta = ItemRail.EnumRail.SPEED,
    ),
    Rebar(
        item = RailcraftItem.rebar,
    ),
    RailbedWood(
        item = RailcraftItem.railbed,
        itemMeta = ItemRailbed.EnumRailbed.WOOD,
    ),
    TieWood(
        item = RailcraftItem.tie,
        itemMeta = ItemTie.EnumTie.WOOD,
    ),
    RailbedStone(
        item = RailcraftItem.railbed,
        itemMeta = ItemRailbed.EnumRailbed.STONE,
    ),
    TieStone(
        item = RailcraftItem.tie,
        itemMeta = ItemTie.EnumTie.STONE,
    ),
    TrackmanSGoggles(
        registryName = "armor.goggles",
        meta = 0,
    ),
    LapotronLoaderUpgrade(
        registryName = "upgrade.lapotron",
        meta = 0,
    ),
    ToolSteelSword(
        registryName = "tool.steel.sword",
        meta = 0,
    ),
    ToolSteelHovel(
        registryName = "tool.steel.hovel",
        meta = 0,
    ),
    ToolSteelPickaxe(
        registryName = "tool.steel.pickaxe",
        meta = 0,
    ),
    ToolSteelAxe(
        registryName = "tool.steel.axe",
        meta = 0,
    ),
    ToolSteelHoe(
        registryName = "tool.steel.hoe",
        meta = 0,
    ),

    // Blocks

    Cube(registryName = "cube"),
    WireSupportFrame(
        registryName = "frame",
        meta = 0,
    ),
    ElectricShuntingWire(
        registryName = "machine.delta",
        meta = 0,
    ),
    TrackControl(stack = EnumTrack.CONTROL.getItem()),
    TrackLocking(stack = EnumTrack.LOCKING.getItem()),
    TrackDisembark(stack = EnumTrack.DISEMBARK.getItem()),
    TrackLocomotive(stack = EnumTrack.LOCOMOTIVE.getItem()),
    TrackLimiter(stack = EnumTrack.LIMITER.getItem()),
    TrackBufferStop(stack = EnumTrack.BUFFER_STOP.getItem()),
    TrackElectric(stack = EnumTrack.ELECTRIC.getItem()),
    TrackSwitch(stack = EnumTrack.SWITCH.getItem()),
    TrackWye(stack = EnumTrack.WYE.getItem()),
    TrackOneway(stack = EnumTrack.ONEWAY.getItem()),
    TrackGated(stack = EnumTrack.GATED.getItem()),
    TrackDisposal(stack = EnumTrack.DISPOSAL.getItem()),
    TrackSlow(stack = EnumTrack.SLOW.getItem()),
    TrackSlowSwitch(stack = EnumTrack.SLOW_SWITCH.getItem()),
    TrackReinforcedJunction(stack = EnumTrack.REINFORCED_JUNCTION.getItem()),
    TrackElectricSwitch(stack = EnumTrack.ELECTRIC_SWITCH.getItem()),
    TrackSpeed(stack = EnumTrack.SPEED.getItem()),
    TrackSpeedTransition(stack = EnumTrack.SPEED_TRANSITION.getItem()),
    TrackSpeedSwitch(stack = EnumTrack.SPEED_SWITCH.getItem()),
    TrackPriming(stack = EnumTrack.PRIMING.getItem()),
    DetectorItem(stack = EnumDetector.ITEM.getItem()),
    DetectorAny(stack = EnumDetector.ANY.getItem()),
    DetectorEmpty(stack = EnumDetector.EMPTY.getItem()),
    DetectorMob(stack = EnumDetector.MOB.getItem()),
    DetectorPowered(stack = EnumDetector.POWERED.getItem()),
    DetectorPlayer(stack = EnumDetector.PLAYER.getItem()),
    DetectorExplosive(stack = EnumDetector.EXPLOSIVE.getItem()),
    DetectorAnimal(stack = EnumDetector.ANIMAL.getItem()),
    DetectorTank(stack = EnumDetector.TANK.getItem()),
    DetectorAdvanced(stack = EnumDetector.ADVANCED.getItem()),
    DetectorEnergy(stack = EnumDetector.ENERGY.getItem()),
    DetectorAge(stack = EnumDetector.AGE.getItem()),
    DetectorTrain(stack = EnumDetector.TRAIN.getItem()),
    DetectorSheep(stack = EnumDetector.SHEEP.getItem()),
    DetectorVillager(stack = EnumDetector.VILLAGER.getItem()),
    DetectorLocomotive(stack = EnumDetector.LOCOMOTIVE.getItem()),
    DetectorRouting(stack = EnumDetector.ROUTING.getItem()),
    MachineGammaItemLoader(stack = EnumMachineGamma.ITEM_LOADER.getItem()),
    MachineGammaItemUnloader(stack = EnumMachineGamma.ITEM_UNLOADER.getItem()),
    MachineGammaItemLoaderAdvanced(stack = EnumMachineGamma.ITEM_LOADER_ADVANCED.getItem()),
    MachineGammaItemUnloaderAdvanced(stack = EnumMachineGamma.ITEM_UNLOADER_ADVANCED.getItem()),
    MachineGammaFluidLoader(stack = EnumMachineGamma.FLUID_LOADER.getItem()),
    MachineGammaFluidUnloader(stack = EnumMachineGamma.FLUID_UNLOADER.getItem()),
    MachineGammaEnergyLoader(stack = EnumMachineGamma.ENERGY_LOADER.getItem()),
    MachineGammaEnergyUnloader(stack = EnumMachineGamma.ENERGY_UNLOADER.getItem()),
    MachineGammaDispenserCart(stack = EnumMachineGamma.DISPENSER_CART.getItem()),
    MachineGammaDispenserTrain(stack = EnumMachineGamma.DISPENSER_TRAIN.getItem()),
    MachineGammaRfLoader(stack = EnumMachineGamma.RF_LOADER.getItem()),
    MachineGammaRfUnloader(stack = EnumMachineGamma.RF_UNLOADER.getItem()),
    MachineEpsilonElectricFeeder(stack = EnumMachineEpsilon.ELECTRIC_FEEDER.getItem()),
    MachineEpsilonForceTrackEmitter(stack = EnumMachineEpsilon.FORCE_TRACK_EMITTER.getItem()),
    MachineEpsilonFluxTransformer(stack = EnumMachineEpsilon.FLUX_TRANSFORMER.getItem()),
    SignalBoxInterlock(stack = EnumSignal.BOX_INTERLOCK.getItem()),
    SignalDualHeadBlockSignal(stack = EnumSignal.DUAL_HEAD_BLOCK_SIGNAL.getItem()),
    SignalSwitchMotor(stack = EnumSignal.SWITCH_MOTOR.getItem()),
    SignalBlockSignal(stack = EnumSignal.BLOCK_SIGNAL.getItem()),
    SignalSwitchLever(stack = EnumSignal.SWITCH_LEVER.getItem()),
    SignalBoxSequencer(stack = EnumSignal.BOX_SEQUENCER.getItem()),
    SignalBoxCapacitor(stack = EnumSignal.BOX_CAPACITOR.getItem()),
    SignalBoxReceiver(stack = EnumSignal.BOX_RECEIVER.getItem()),
    SignalBoxController(stack = EnumSignal.BOX_CONTROLLER.getItem()),
    SignalBoxAnalogController(stack = EnumSignal.BOX_ANALOG_CONTROLLER.getItem()),
    SignalDistantSignal(stack = EnumSignal.DISTANT_SIGNAL.getItem()),
    SignalDualHeadDistantSignal(stack = EnumSignal.DUAL_HEAD_DISTANT_SIGNAL.getItem()),
    SignalBoxBlockRelay(stack = EnumSignal.BOX_BLOCK_RELAY.getItem()),
    MachineAlphaSteamTrapAuto(stack = EnumMachineAlpha.STEAM_TRAP_AUTO.getItem()),
    MachineAlphaSteamTrapManual(stack = EnumMachineAlpha.STEAM_TRAP_MANUAL.getItem()),
    MachineAlphaFeedStation(stack = EnumMachineAlpha.FEED_STATION.getItem()),
    MachineAlphaTradeStation(stack = EnumMachineAlpha.TRADE_STATION.getItem()),
    TrackEmbarking(stack = EnumTrack.EMBARKING.getItem()),
    TrackCoupler(stack = EnumTrack.COUPLER.getItem()),
    TrackWhistle(stack = EnumTrack.WHISTLE.getItem()),
    TrackRouting(stack = EnumTrack.ROUTING.getItem()),
    TrackDetectorDirection(stack = EnumTrack.DETECTOR_DIRECTION.getItem()),
    TrackGatedOneway(stack = EnumTrack.GATED_ONEWAY.getItem()),
    TrackSuspended(stack = EnumTrack.SUSPENDED.getItem()),
    TrackSlowBooster(stack = EnumTrack.SLOW_BOOSTER.getItem()),
    TrackSlowWye(stack = EnumTrack.SLOW_WYE.getItem()),
    TrackSlowJunction(stack = EnumTrack.SLOW_JUNCTION.getItem()),
    TrackReinforced(stack = EnumTrack.REINFORCED.getItem()),
    TrackReinforcedBooster(stack = EnumTrack.REINFORCED_BOOSTER.getItem()),
    TrackReinforcedSwitch(stack = EnumTrack.REINFORCED_SWITCH.getItem()),
    TrackReinforcedWye(stack = EnumTrack.REINFORCED_WYE.getItem()),
    TrackElectricWye(stack = EnumTrack.ELECTRIC_WYE.getItem()),
    TrackElectricJunction(stack = EnumTrack.ELECTRIC_JUNCTION.getItem()),
    TrackSpeedBoost(stack = EnumTrack.SPEED_BOOST.getItem()),
    TrackSpeedWye(stack = EnumTrack.SPEED_WYE.getItem()),
    TrackJunction(stack = EnumTrack.JUNCTION.getItem()),
    TrackLauncher(stack = EnumTrack.LAUNCHER.getItem()),
    MachineDeltaWire(stack = EnumMachineDelta.WIRE.getItem());

    public val modId: String = "Railcraft"

    constructor(stack: ItemStack?) : this(
        stack = stack,
        railcraftItem = null,
        itemMeta = null,
        registryName = null,
        meta = 0,
    )

    constructor(
        item: RailcraftItem,
        itemMeta: IItemMetaEnum? = null,
    ) : this(
        stack = null,
        railcraftItem = item,
        itemMeta = itemMeta,
        registryName = null,
        meta = 0,
    )

    constructor(
        registryName: String,
        meta: Int = 0,
    ) : this(
        stack = null,
        railcraftItem = null,
        itemMeta = null,
        registryName = registryName,
        meta = meta,
    )

    public override fun get(amount: Int): ItemStack? {
        if (railcraftItem != null) {
            if (itemMeta != null) {
                return railcraftItem.getStack(
                    amount,
                    itemMeta,
                )
            }
            return railcraftItem.getStack(amount)
        }
        val copy = stack?.copy()
        if (copy != null) {
            copy.stackSize = amount
            return copy
        }
        val name = registryName ?: return null
        return RecipeItems.item(
            mod = modId,
            name = name,
            meta = meta,
            count = amount,
        )
    }

    public override fun getBlock(): Block? {
        val name = registryName
        if (name != null) {
            return GameRegistry.findBlock(
                modId,
                name,
            )
        }
        return super<IModItem>.getBlock()
    }

    public fun recipeObject(): Any? {
        if (railcraftItem != null) {
            if (itemMeta != null) {
                return railcraftItem.getRecipeObject(itemMeta)
            }
            return railcraftItem.getRecipeObject()
        }
        return get()
    }
}
