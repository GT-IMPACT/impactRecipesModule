package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftLoaderCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaItemLoader.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LCL",
                'L',
                "cobblestone",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.DetectorItem.get(),
                'C',
                VanillaItems.Chest.get(),
                'T',
                VanillaItems.Hopper.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaItemUnloader.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCL",
                "PIP",
                "LTL",
                'L',
                "cobblestone",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.DetectorItem.get(),
                'C',
                VanillaItems.Chest.get(),
                'T',
                VanillaItems.Hopper.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaItemLoaderAdvanced.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LCL",
                'L',
                OrePrefixes.plate.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.DetectorAny.get(),
                'C',
                VanillaItems.Chest.get(),
                'T',
                VanillaItems.Hopper.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaItemUnloaderAdvanced.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCL",
                "PIP",
                "LTL",
                'L',
                OrePrefixes.plate.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.DetectorAny.get(),
                'C',
                VanillaItems.Chest.get(),
                'T',
                VanillaItems.Hopper.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaFluidLoader.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "UIM",
                "LCL",
                'L',
                "paneGlass",
                'T',
                OrePrefixes.pipeMedium.get(Materials.Steel),
                'I',
                RailcraftItems.DetectorTank.get(),
                'C',
                AE2FCItems.CertusQuartzTank.get(),
                'U',
                GregTechItems.ElectricPumpLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaFluidUnloader.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCL",
                "UIM",
                "LTL",
                'L',
                "paneGlass",
                'T',
                OrePrefixes.pipeMedium.get(Materials.Steel),
                'I',
                RailcraftItems.DetectorTank.get(),
                'C',
                AE2FCItems.CertusQuartzTank.get(),
                'U',
                GregTechItems.ElectricPumpLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaEnergyLoader.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LCL",
                'L',
                OrePrefixes.plate.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.DetectorEnergy.get(),
                'C',
                GregTechItems.BatteryREMVLithium.get(),
                'T',
                OrePrefixes.cableGt01.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaEnergyUnloader.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCL",
                "PIP",
                "LTL",
                'L',
                OrePrefixes.plate.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.DetectorEnergy.get(),
                'C',
                GregTechItems.BatteryREMVLithium.get(),
                'T',
                OrePrefixes.cableGt01.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaDispenserCart.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "DMT",
                " C ",
                'D',
                VanillaItems.Dispenser.get(),
                'M',
                VanillaItems.Minecart.get(),
                'T',
                VanillaItems.Rail.get(),
                'C',
                RailcraftItems.Crowbar.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineGammaDispenserTrain.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "CPC",
                "PDP",
                "CPC",
                'D',
                RailcraftItems.MachineGammaDispenserCart.get(),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'C',
                RailcraftItems.Crowbar.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineEpsilonElectricFeeder.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCL",
                "PIP",
                "LCL",
                'L',
                OrePrefixes.plate.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.DetectorEnergy.get(),
                'C',
                OrePrefixes.wireGt02.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineEpsilonFluxTransformer.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCL",
                "PIP",
                "LTL",
                'L',
                OrePrefixes.plate.get(Materials.Bronze),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.DetectorEnergy.get(),
                'T',
                RailcraftItems.MachineDeltaWire.get(),
                'C',
                OrePrefixes.wireGt01.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineEpsilonForceTrackEmitter.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LCL",
                "EIE",
                "WCW",
                'L',
                OrePrefixes.lens.get(Materials.Diamond),
                'W',
                OrePrefixes.cableGt01.get(Materials.Gold),
                'E',
                GregTechItems.EmitterHV.get(),
                'I',
                GregTechItems.HullHV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
            ),
        )
    }
}
