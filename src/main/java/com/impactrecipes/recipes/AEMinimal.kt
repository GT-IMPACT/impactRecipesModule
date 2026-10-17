package com.impactrecipes.recipes

import com.impact.mods.gregtech.GT_ItemList
import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2StuffItems
import com.impactrecipes.util.CraftingRecipes.removeCraftingRecipesByOutput
import com.impactrecipes.util.CraftingRecipes.shapeless
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems.item
import com.impactrecipes.util.RecipeItems.ore
import gregtech.api.enums.ItemList
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

/** AE2/AE2FC update; keeps the existing network and computing progression. */
public object AEMinimal {

    @JvmStatic
    public fun run(): Unit {
        removeCraftingRecipesByOutput(output = AE2FCItems.EnergyCard.get())
        removeCraftingRecipesByOutput(output = AE2FCItems.InfinityWaterStorageCell.get())
        cards()
        monitors()
        interfaceTunnels()
        tools()
        wirelessNetwork()
        patternMachines()
        spatialNetwork()
        replenishers()
        fluidAutoFiller()
        fluidVoidCell()
        universeCells()
    }

    private fun cards(): Unit {
        // Locking Card
        AE2Items.LockingCard.get()?.let { output ->
            shapeless(
                output = output,
                ingredients = arrayOf(
                    AE2Items.AdvancedCard.get(),
                    AE2Items.BlankPattern.get(),
                    AE2Items.EngineeringProcessor.get(),
                ),
            )
        }
        // Fake Crafting Card
        AE2Items.FakeCraftingCard.get()?.let { output ->
            shapeless(
                output = output,
                ingredients = arrayOf(
                    AE2Items.AdvancedCard.get(),
                    AE2Items.EngineeringProcessor.get(),
                    AE2Items.LogicProcessor.get(),
                    item(
                        mod = "gregtech",
                        name = "gt.metaitem.01",
                        meta = 32744,
                    ),
                ),
            )
        }
        // Equal Distribution Card
        AE2Items.EqualDistributionCard.get()?.let { output ->
            shapeless(
                output = output,
                ingredients = arrayOf(
                    AE2Items.AdvancedCard.get(),
                    AE2Items.EngineeringProcessor.get(),
                    AE2Items.LogicProcessor.get(),
                    item(
                        mod = "gregtech",
                        name = "gt.blockmachines",
                        meta = 9324,
                    ),
                ),
            )
        }
        // Superluminal Acceleration Card
        AE2Items.SuperluminalAccelerationCard.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.meSystemProvider(
                inputs = arrayOf(
                    AE2Items.HyperAccelerationCard.get(amount = 4),
                    AE2Items.EngineeringProcessor.get(),
                    ItemList.Emitter_UV.get(1),
                    ItemList.Sensor_UV.get(1),
                    ore(
                        prefix = OrePrefixes.circuit,
                        material = Materials.Superconductor,
                        count = 2,
                    ),
                    ore(
                        prefix = OrePrefixes.plate,
                        material = Materials.Neutronium,
                        count = 4,
                    ),
                ),
                output = output,
                ticks = 60 * 20,
                eu = 2_000_000,
                particles = 8000,
            )
        }
    }

    private fun wirelessNetwork(): Unit {
        AE2Items.WirelessConnector.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            shapeless(
                output = output,
                ingredients = arrayOf(
                    AE2StuffItems.WirelessConnector.get(),
                    AE2Items.WirelessReceiver.get(),
                    AE2Items.EngineeringProcessor.get(),
                ),
            )
        }
        AE2Items.WirelessHub.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.assembler(
                inputs = arrayOf(
                    AE2Items.WirelessConnector.get(amount = 8),
                    ItemList.Emitter_LuV.get(1),
                ),
                fluid = Materials.SolderingAlloy.getMolten(576),
                output = output,
                ticks = 30 * 20,
                eu = 122_880,
            )
        }
    }

    private fun patternMachines(): Unit {
        AE2Items.PatternOptimizationMatrix.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.meSystemProvider(
                inputs = arrayOf(
                    AE2Items.CraftingUnit.get(),
                    AE2Items.EngineeringProcessor.get(amount = 4),
                    AE2Items.LogicProcessor.get(amount = 4),
                    AE2Items.BlankPattern.get(amount = 16),
                    ore(
                        prefix = OrePrefixes.circuit,
                        material = Materials.Elite,
                        count = 2,
                    ),
                ),
                output = output,
                ticks = 40 * 20,
                eu = 7680,
                particles = 2000,
            )
        }
        AE2Items.StorageReshuffle.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.assembler(
                inputs = arrayOf(
                    ItemList.Hull_EV.get(1),
                    AE2Items.IOPort.get(amount = 2),
                    AE2Items.AccelerationCard.get(amount = 4),
                    ore(
                        prefix = OrePrefixes.circuit,
                        material = Materials.Master,
                        count = 2,
                    ),
                ),
                fluid = Materials.SolderingAlloy.getMolten(576),
                output = output,
                ticks = 60 * 20,
                eu = 500_000,
            )
        }
        // ME Pattern Repeater
        AE2Items.PatternRepeater.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.meSystemProvider(
                inputs = arrayOf(
                    AE2FCItems.DualInterface.get(),
                    AE2Items.StorageBus.get(),
                    AE2FCItems.FluidStorageBus.get(),
                    AE2Items.AdvancedCraftingUnit.get(),
                ),
                output = output,
                ticks = 60 * 20,
                eu = 500_000,
                particles = 8000,
            )
        }
    }

    private fun spatialNetwork(): Unit {
        AE2Items.SpatialLinkChamber.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.meSystemProvider(
                inputs = arrayOf(
                    AE2Items.QuantumLinkChamber.get(),
                    AE2Items.SpatialIOPort.get(),
                    AE2Items.SpatialComponent128.get(),
                    ItemList.Field_Generator_IV.get(1),
                    ore(
                        prefix = OrePrefixes.plateDouble,
                        material = Materials.NiobiumTitanium,
                        count = 4,
                    ),
                ),
                output = output,
                ticks = 60 * 20,
                eu = 30_720,
                particles = 4000,
            )
        }
        AE2Items.SpatialNetworkRelay.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.meSystemProvider(
                inputs = arrayOf(
                    AE2Items.SpatialPylon.get(),
                    AE2Items.WirelessReceiver.get(),
                    AE2Items.EngineeringProcessor.get(amount = 4),
                    ore(
                        prefix = OrePrefixes.circuit,
                        material = Materials.Elite,
                        count = 2,
                    ),
                    ore(
                        prefix = OrePrefixes.plate,
                        material = Materials.NiobiumTitanium,
                        count = 4,
                    ),
                ),
                output = output,
                ticks = 40 * 20,
                eu = 7680,
                particles = 2000,
            )
        }
    }

    private fun replenishers(): Unit {
        AE2FCItems.SuperStockReplenisher.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.meSystemProvider(
                inputs = arrayOf(
                    AE2Items.ExportBus.get(),
                    AE2FCItems.FluidExportBus.get(),
                    AE2Items.Controller.get(),
                    AE2Items.Chest.get(),
                    AE2Items.CapacityCard.get(amount = 4),
                    AE2Items.HyperAccelerationCard.get(amount = 4),
                    ore(
                        prefix = OrePrefixes.plate,
                        material = Materials.Naquadria,
                        count = 4,
                    ),
                ),
                output = output,
                ticks = 120 * 20,
                eu = 2_000_000,
                particles = 16_000,
            )
        }
        AE2Items.SuperMEReplenisher.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.meSystemProvider(
                inputs = arrayOf(
                    AE2FCItems.SuperStockReplenisher.get(),
                    AE2Items.StorageComponent16384k.get(amount = 2),
                    ore(
                        prefix = OrePrefixes.circuit,
                        material = Materials.Infinite,
                        count = 2,
                    ),
                    AE2Items.HyperAccelerationCard.get(amount = 2),
                    AE2FCItems.FluidStorageComponent1k.get(amount = 2),
                    ore(
                        prefix = OrePrefixes.plate,
                        material = Materials.Neutronium,
                        count = 4,
                    ),
                ),
                output = output,
                ticks = 180 * 20,
                eu = 8_000_000,
                particles = 32_000,
            )
        }
    }

    private fun monitors(): Unit {
        // ME Throughput Monitor
        AE2Items.ThroughputMonitor.get()?.let { output ->
            MachineRecipes.assembler(
                inputs = arrayOf(
                    AE2Items.StorageMonitor.get(),
                    AE2Items.LevelEmitter.get(),
                    ore(
                        prefix = OrePrefixes.plate,
                        material = Materials.NetherQuartz,
                        count = 3,
                    ),
                    ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.CertusQuartz,
                        count = 2,
                    ),
                ),
                fluid = null,
                output = output,
                ticks = 10 * 20,
                eu = 96,
            )
        }
        // ME Advanced Level Emitter
        AE2Items.AdvancedLevelEmitter.get()?.let { output ->
            MachineRecipes.assembler(
                inputs = arrayOf(
                    AE2Items.LevelEmitter.get(),
                    ore(
                        prefix = OrePrefixes.circuit,
                        material = Materials.Data,
                    ),
                    AE2Items.CalculationProcessor.get(),
                ),
                fluid = null,
                output = output,
                ticks = 15 * 20,
                eu = 1920,
            )
        }
    }

    private fun interfaceTunnels(): Unit {
        // P2P Tunnel - ME Interface
        AE2Items.P2PTunnelMEInterface.get()?.let { output ->
            // Accept both block and part interfaces, as in the GTNH conversion.
            shapeless(
                output = output,
                ingredients = arrayOf(
                    AE2Items.P2PTunnelME.get(),
                    AE2Items.InterfaceBlock.get(),
                ),
            )
            shapeless(
                output = output.copy(),
                ingredients = arrayOf(
                    AE2Items.P2PTunnelME.get(),
                    AE2Items.InterfacePart.get(),
                ),
            )
        }
    }

    private fun tools(): Unit {
        AE2Items.Colorizer.get()?.let { output ->
            shapeless(
                output = output,
                ingredients = arrayOf(
                    AE2Items.IlluminatedPanel.get(),
                    "dyeRed",
                    "dyeGreen",
                    "dyeBlue",
                ),
            )
        }
        AE2Items.WirelessKit.get()?.let { output ->
            shapeless(
                output = output,
                ingredients = arrayOf(
                    AE2StuffItems.WirelessKit.get(),
                    AE2Items.IlluminatedPanel.get(),
                    AE2Items.EngineeringProcessor.get(),
                ),
            )
        }
        AE2Items.NetworkVisualiser.get()?.let { output ->
            shapeless(
                output = output,
                ingredients = arrayOf(
                    AE2StuffItems.NetworkVisualiser.get(),
                    AE2Items.WirelessReceiver.get(),
                    AE2Items.EngineeringProcessor.get(),
                ),
            )
        }
    }

    private fun fluidAutoFiller(): Unit {
        AE2FCItems.FluidAutoFiller.get()?.let { output ->
            MachineRecipes.meSystemProvider(
                inputs = arrayOf(
                    AE2FCItems.DualInterface.get(),
                    AE2FCItems.LevelTerminal.get(),
                    AE2Items.LevelEmitter.get(),
                    GT_ItemList.EngineeringProcessorFluidDiamondCore.get(1),
                    ore(
                        prefix = OrePrefixes.plate,
                        material = Materials.MaragingSteel300,
                        count = 4,
                    ),
                ),
                output = output,
                ticks = 20 * 20,
                eu = 1920,
                particles = 1000,
            )
        }
    }

    private fun fluidVoidCell(): Unit {
        AE2FCItems.FluidVoidCell.get()?.let { output ->
            removeCraftingRecipesByOutput(output = output)
            MachineRecipes.assembler(
                inputs = arrayOf(
                    AE2FCItems.FluidStorageHousing.get(),
                    item(
                        mod = "ExtraUtilities",
                        name = "trashcan",
                        meta = 1,
                    ),
                ),
                fluid = null,
                output = output,
                ticks = 5 * 20,
                eu = 120,
            )
        }
    }

    private fun universeCells(): Unit {
        AE2Items.UniverseStorageCell.get()?.let { output ->
            universe(
                output = output,
                singularities = AE2Items.SingularityStorageCell.get(amount = 4),
            )
        }
        AE2FCItems.UniverseFluidStorageCell.get()?.let { output ->
            universe(
                output = output,
                singularities = AE2FCItems.SingularityFluidStorageCell.get(amount = 4),
            )
        }
    }

    private fun universe(
        output: ItemStack,
        singularities: ItemStack?,
    ): Unit {
        removeCraftingRecipesByOutput(output = output)
        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                singularities,
                ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Piko,
                    count = 4,
                ),
                ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Infinity,
                    count = 8,
                ),
            ),
            output = output,
            ticks = 480 * 20,
            eu = 32_000_000,
            particles = 100_000,
        )
    }

}
