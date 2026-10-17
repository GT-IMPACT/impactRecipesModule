package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechSolarPanelRecipes {

    internal fun register() {
        //Solar Panel LV 32 EU
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                Materials.Carbon.item(OrePrefixes.plateAlloy).get(),
                Materials.Polytetrafluoroethylene.item(OrePrefixes.plate).get(amount = 2),
                Materials.Good.item(OrePrefixes.circuit).get(amount = 4),
                GregTechItems.CircuitSiliconWafer2.get(amount = 4),
                ImpactItems.IrradiantReinforcedAluminiumPlate.get(amount = 4),
                Materials.SuperconductorMV.item(OrePrefixes.wireGt01).get(amount = 4),
            ),
            output = GregTechItems.CoverSolarPanelLV.get(),
            fluidInputs = null,
            ticks = (20 * 20),
            eu = 120,
        )

        //Solar Panel MV 128 EU
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelLV.get(),
                Materials.Epoxid.item(OrePrefixes.plate).get(amount = 2),
                GregTechItems.CircuitChipULPIC.get(amount = 2),
                Materials.Carbon.item(OrePrefixes.plateAlloy).get(amount = 2),
                Materials.Advanced.item(OrePrefixes.circuit).get(amount = 4),
                GregTechItems.CircuitSiliconWafer2.get(amount = 4),
                ImpactItems.IrradiantReinforcedTitaniumPlate.get(amount = 4),
                Materials.SuperconductorHV.item(OrePrefixes.wireGt01).get(amount = 4),
            ),
            output = GregTechItems.CoverSolarPanelMV.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 480,
        )

        //Solar Panel HV 512 EU
        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelMV.get(),
                Materials.IndiumGalliumPhosphide.item(OrePrefixes.plate).get(amount = 2),
                GregTechItems.CircuitChipLPIC.get(amount = 2),
                Materials.Carbon.item(OrePrefixes.plateAlloy).get(amount = 4),
                Materials.Data.item(OrePrefixes.circuit).get(amount = 6),
                GregTechItems.CircuitSiliconWafer2.get(amount = 4),
                ImpactItems.IrradiantReinforcedTungstenPlate.get(amount = 4),
                Materials.Silicon.item(OrePrefixes.plate).get(amount = 4),
                Materials.SuperconductorEV.item(OrePrefixes.wireGt02).get(amount = 6),
            ),
            output = GregTechItems.CoverSolarPanelHV.get(),
            fluidInputs = null,
            ticks = (60 * 20),
            eu = 1920,
        )

        //Solar Panel EV 2048 EU
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelHV.get(),
                Materials.Polybenzimidazole.item(OrePrefixes.plate).get(amount = 4),
                GregTechItems.CircuitChipPIC.get(amount = 4),
                Materials.Carbon.item(OrePrefixes.plateAlloy).get(amount = 6),
                Materials.Elite.item(OrePrefixes.circuit).get(amount = 6),
                GregTechItems.CircuitSiliconWafer4.get(amount = 4),
                ImpactItems.IrradiantReinforcedTungstenSteelPlate.get(amount = 4),
                Materials.Silicon.item(OrePrefixes.plateDouble).get(amount = 4),
                Materials.SuperconductorIV.item(OrePrefixes.wireGt02).get(amount = 6),
            ),
            output = GregTechItems.CoverSolarPanelEV.get(),
            fluidInputs = null,
            ticks = (80 * 20),
            eu = 7680,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelHV.get(amount = 4),
                Materials.IndiumGalliumPhosphide.item(OrePrefixes.plateDouble).get(amount = 4),
                Materials.Elite.item(OrePrefixes.circuit).get(amount = 4),
                ImpactItems.ReinforcedTungstenSteelIronPlate.get(amount = 2),
                Materials.Silicon.item(OrePrefixes.foil).get(amount = 16),
            ),
            output = GregTechItems.CoverSolarPanelEV.get(),
            fluidInputs = null,
            ticks = (10 * 20),
            eu = 480,
        )

        //Solar Panel IV 8192 EU
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelEV.get(),
                Materials.Polybenzimidazole.item(OrePrefixes.plate).get(amount = 6),
                GregTechItems.CircuitChipHPIC.get(amount = 4),
                Materials.Carbon.item(OrePrefixes.plateAlloy).get(amount = 8),
                Materials.Master.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CircuitSiliconWafer3.get(amount = 6),
                ImpactItems.IrradiantReinforcedChromePlate.get(amount = 4),
                Materials.Silicon.item(OrePrefixes.plateTriple).get(amount = 6),
                Materials.SuperconductorLuV.item(OrePrefixes.wireGt04).get(amount = 8),
            ),
            output = GregTechItems.CoverSolarPanelIV.get(),
            fluidInputs = null,
            ticks = (100 * 20),
            eu = 30720,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelEV.get(amount = 4),
                Materials.Polybenzimidazole.item(OrePrefixes.plateDouble).get(amount = 4),
                Materials.Master.item(OrePrefixes.circuit).get(amount = 4),
                ImpactItems.ReinforcedChromeIronPlate.get(amount = 2),
                Materials.Silicon.item(OrePrefixes.foil).get(amount = 24),
            ),
            output = GregTechItems.CoverSolarPanelIV.get(),
            fluidInputs = null,
            ticks = (20 * 20),
            eu = 1920,
        )

        //Solar Panel LuV 32768 EU
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelIV.get(),
                Materials.Polybenzimidazole.item(OrePrefixes.plateDouble).get(amount = 8),
                GregTechItems.CircuitChipUHPIC.get(amount = 6),
                Materials.Carbon.item(OrePrefixes.plateAlloy).get(amount = 10),
                Materials.Ultimate.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CircuitSiliconWafer7.get(amount = 8),
                ImpactItems.IrradiantReinforcedIridiumPlate.get(amount = 6),
                Materials.Silicon.item(OrePrefixes.plateQuadruple).get(amount = 6),
                Materials.SuperconductorZPM.item(OrePrefixes.wireGt04).get(amount = 8),
            ),
            output = GregTechItems.CoverSolarPanelLuV.get(),
            fluidInputs = null,
            ticks = (120 * 20),
            eu = 122880,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelIV.get(amount = 4),
                Materials.VanadiumGallium.item(OrePrefixes.plateDouble).get(amount = 4),
                Materials.Ultimate.item(OrePrefixes.circuit).get(amount = 6),
                ImpactItems.ReinforcedIridiumIronPlate.get(amount = 4),
                Materials.Silicon.item(OrePrefixes.foil).get(amount = 32),
            ),
            output = GregTechItems.CoverSolarPanelLuV.get(),
            fluidInputs = null,
            ticks = (30 * 20),
            eu = 7680,
        )

        //Solar Panel ZPM 131072 EU
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelLuV.get(),
                Materials.Polybenzimidazole.item(OrePrefixes.plateTriple).get(amount = 10),
                GregTechItems.CircuitChipQPIC.get(amount = 8),
                Materials.Carbon.item(OrePrefixes.plateAlloy).get(amount = 12),
                Materials.Superconductor.item(OrePrefixes.circuit).get(amount = 10),
                GregTechItems.CircuitSiliconWafer8.get(amount = 10),
                ImpactItems.IrradiantReinforcedNaquadriaPlate.get(amount = 6),
                Materials.Silicon.item(OrePrefixes.plateQuintuple).get(amount = 8),
                Materials.SuperconductorUV.item(OrePrefixes.wireGt08).get(amount = 10),
            ),
            output = GregTechItems.CoverSolarPanelZPM.get(),
            fluidInputs = null,
            ticks = (140 * 20),
            eu = 500000,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelLuV.get(amount = 4),
                Materials.NaquadahAlloy.item(OrePrefixes.plateTriple).get(amount = 4),
                Materials.Superconductor.item(OrePrefixes.circuit).get(amount = 6),
                ImpactItems.ReinforcedNaquadriaIronPlate.get(amount = 4),
                Materials.Silicon.item(OrePrefixes.foil).get(amount = 48),
            ),
            output = GregTechItems.CoverSolarPanelZPM.get(),
            fluidInputs = null,
            ticks = (40 * 20),
            eu = 30720,
        )

        //Solar Panel UV 524288 EU
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelZPM.get(),
                Materials.Polybenzimidazole.item(OrePrefixes.plateQuadruple).get(amount = 12),
                GregTechItems.CircuitChipFPIC.get(amount = 10),
                Materials.Carbon.item(OrePrefixes.plateAlloy).get(amount = 14),
                Materials.Infinite.item(OrePrefixes.circuit).get(amount = 10),
                GregTechItems.CircuitSiliconWafer10.get(amount = 12),
                ImpactItems.IrradiantReinforcedNeutroniumPlate.get(amount = 8),
                Materials.Silicon.item(OrePrefixes.plateDense).get(amount = 8),
                Materials.Superconductor.item(OrePrefixes.wireGt12).get(amount = 12),
            ),
            output = GregTechItems.CoverSolarPanelUV.get(),
            fluidInputs = null,
            ticks = (160 * 20),
            eu = 2000000,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CoverSolarPanelZPM.get(amount = 4),
                Materials.ElectrumFlux.item(OrePrefixes.plateTriple).get(amount = 4),
                Materials.Infinite.item(OrePrefixes.circuit).get(amount = 8),
                ImpactItems.ReinforcedNeutroniumIronPlate.get(amount = 4),
                Materials.Silicon.item(OrePrefixes.foil).get(amount = 64),
            ),
            output = GregTechItems.CoverSolarPanelUV.get(),
            fluidInputs = null,
            ticks = (50 * 20),
            eu = 122880,
        )
    }
}
