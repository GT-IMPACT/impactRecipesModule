package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class IC2AutomationCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = IC2Items.OdScanner.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IPI",
                "ADA",
                "CBC",
                'I',
                OrePrefixes.itemCasing.get(Materials.Gold),
                'A',
                OrePrefixes.circuit.get(Materials.Advanced),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'C',
                OrePrefixes.cableGt01.get(Materials.Gold),
                'B',
                GregTechItems.EnergyCrystal.get(),
                'D',
                ImpactItems.LargeScreen.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.OvScanner.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IPI",
                "ADA",
                "CBC",
                'I',
                OrePrefixes.itemCasing.get(Materials.Titanium),
                'A',
                OrePrefixes.circuit.get(Materials.Data),
                'P',
                ModItemVariant(
                    item = IC2Items.OdScanner,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'C',
                OrePrefixes.cableGt01.get(Materials.Nichrome),
                'B',
                GregTechItems.LapotronCrystal.get(),
                'D',
                ImpactItems.LargeScreen.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.TradeOMat.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "COC",
                "hPd",
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'O',
                GregTechItems.HullLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.EnergyOMat.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "COC",
                "hPd",
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'P',
                IC2Items.RechargeableBattery.get(),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'O',
                GregTechItems.HullLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Itembuffer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "CHC",
                "PPP",
                'P',
                OrePrefixes.itemCasing.get(Materials.Iron),
                'H',
                GregTechItems.HullLV.get(),
                'C',
                VanillaItems.Chest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Sortingmachine.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "MHM",
                "PTP",
                'P',
                OrePrefixes.itemCasing.get(Materials.Iron),
                'H',
                GregTechItems.HullLV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                IC2Items.EjectorUpgrade.get(),
                'T',
                VanillaItems.Chest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Fluiddistributor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "MHM",
                "OTO",
                'P',
                OrePrefixes.itemCasing.get(Materials.Iron),
                'H',
                GregTechItems.HullLV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                IC2Items.FluidEjectorUpgrade.get(),
                'T',
                IC2Items.FluidCell.get(),
                'O',
                OrePrefixes.pipeLarge.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Fluidregulator.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "OHO",
                "TCT",
                'P',
                OrePrefixes.itemCasing.get(Materials.Iron),
                'H',
                GregTechItems.ElectricPumpMV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'T',
                AE2FCItems.CertusQuartzTank.get(),
                'O',
                OrePrefixes.pipeMedium.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.TeslaCoil.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "PEP",
                "SWS",
                'S',
                OrePrefixes.spring.get(Materials.SteelMagnetic),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'P',
                IC2Items.Coil.get(),
                'E',
                GregTechItems.TransformerHVMV.get(),
                'W',
                OrePrefixes.cableGt04.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Magnetizer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RPR",
                "SHS",
                "MCM",
                'S',
                OrePrefixes.spring.get(Materials.SteelMagnetic),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'P',
                OrePrefixes.itemCasing.get(Materials.Steel),
                'H',
                GregTechItems.HullLV.get(),
                'M',
                GregTechItems.ElectricMotorLV.get(),
            ),
        )
    }
}
