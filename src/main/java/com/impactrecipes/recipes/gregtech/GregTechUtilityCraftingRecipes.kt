package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.item
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.ToolDictNames

internal class GregTechUtilityCraftingRecipes {

    internal fun register() {
        //GT Wood Ring
        CraftingRecipes.shapedWithFlags(
            output = Materials.Wood.item(OrePrefixes.ring).get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "k ",
                " S",
                'S',
                Materials.Wood.item(OrePrefixes.plank).get(),
            ),
        )

        //Stone Dust
        CraftingRecipes.shapeless(
            output = Materials.Stone.item(OrePrefixes.dust).get(),
            ingredients = arrayOf<Any?>(
                "stone",
                ToolDictNames.craftingToolMortar,
            ),
        )

        //Brick Dust
        CraftingRecipes.shapeless(
            output = Materials.Brick.item(OrePrefixes.dust).get(),
            ingredients = arrayOf<Any?>(
                VanillaItems.BrickBlock.get(),
                ToolDictNames.craftingToolMortar,
            ),
        )

        //Filter Casing
        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingVent.get(amount = 6),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "PPP",
                "SFS",
                "MIV",
                'P',
                ImpactItems.SteelBars.get(),
                'I',
                OrePrefixes.stick.get(Materials.StainlessSteel),
                'F',
                OrePrefixes.frameGt.get(Materials.VanadiumSteel),
                'M',
                GregTechItems.ElectricMotorHV.get(),
                'V',
                OrePrefixes.rotor.get(Materials.BlackSteel),
                'S',
                GregTechItems.ComponentFilter.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingVent.get(amount = 24),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "PSP",
                "GFR",
                "MIV",
                'P',
                ImpactItems.SteelBars.get(),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Titanium),
                'R',
                OrePrefixes.ring.get(Materials.Titanium),
                'I',
                OrePrefixes.stickLong.get(Materials.Titanium),
                'F',
                OrePrefixes.frameGt.get(Materials.Titanium),
                'M',
                GregTechItems.ElectricMotorEV.get(),
                'V',
                OrePrefixes.rotor.get(Materials.HSLA),
                'S',
                GregTechItems.ComponentFilter.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingVent.get(amount = 64),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "PSP",
                "GFR",
                "MIV",
                'P',
                EnderIOItems.BlockDarkIronBars.get(),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.TungstenSteel),
                'R',
                OrePrefixes.ring.get(Materials.TungstenSteel),
                'I',
                OrePrefixes.stickLong.get(Materials.TungstenSteel),
                'F',
                OrePrefixes.frameGt.get(Materials.MaragingSteel250),
                'M',
                GregTechItems.ElectricMotorIV.get(),
                'V',
                OrePrefixes.rotor.get(Materials.HastelloyC276),
                'S',
                GregTechItems.ComponentFilter.get(),
            ),
        )

        //Grate Machine Casing
        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingGrate.get(amount = 6),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "PVP",
                "PFP",
                "PMP",
                'P',
                ImpactItems.SteelBars.get(),
                'F',
                OrePrefixes.frameGt.get(Materials.VanadiumSteel),
                'M',
                GregTechItems.ElectricMotorHV.get(),
                'V',
                OrePrefixes.rotor.get(Materials.BlackSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingGrate.get(amount = 24),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "PVP",
                "PFP",
                "PMP",
                'P',
                ImpactItems.SteelBars.get(),
                'F',
                OrePrefixes.frameGt.get(Materials.Titanium),
                'M',
                GregTechItems.ElectricMotorEV.get(),
                'V',
                OrePrefixes.rotor.get(Materials.HSLA),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingGrate.get(amount = 64),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "PVP",
                "PFP",
                "PMP",
                'P',
                EnderIOItems.BlockDarkIronBars.get(),
                'F',
                OrePrefixes.frameGt.get(Materials.MaragingSteel250),
                'M',
                GregTechItems.ElectricMotorIV.get(),
                'V',
                OrePrefixes.rotor.get(Materials.HastelloyC276),
            ),
        )

        // --- Solar Panel
        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CoverSolarPanel.get(),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "SGS",
                "CPC",
                "TRT",
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'G',
                IC2Items.ReinforcedGlass.get(),
                'P',
                OrePrefixes.plateAlloy.get(Materials.Carbon),
                'S',
                GregTechItems.CircuitSiliconWafer.get(),
                'T',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'R',
                ImpactItems.AluminiumIronPlate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CoverSolarPanel8V.get(),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "GRG",
                "CAC",
                "GRG",
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'G',
                GregTechItems.CoverSolarPanel.get(),
                'R',
                OrePrefixes.plate.get(Materials.GalliumArsenide),
                'A',
                ImpactItems.ReinforcedAluminiumIronPlate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CoverSolarPanelLV.get(),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "GRG",
                "CAC",
                "GRG",
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'G',
                GregTechItems.CoverSolarPanel8V.get(),
                'R',
                OrePrefixes.plate.get(Materials.Plastic),
                'A',
                OrePrefixes.plateDouble.get(Materials.HSLA),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CoverSolarPanelMV.get(),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "GRG",
                "CAC",
                "GRG",
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'G',
                GregTechItems.CoverSolarPanelLV.get(),
                'R',
                OrePrefixes.plate.get(Materials.Polytetrafluoroethylene),
                'A',
                ImpactItems.ReinforcedTitaniumIronPlate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CoverSolarPanelHV.get(),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "GRG",
                "CAC",
                "GRG",
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'G',
                GregTechItems.CoverSolarPanelMV.get(),
                'R',
                OrePrefixes.plate.get(Materials.EpoxidFiberReinforced),
                'A',
                ImpactItems.ReinforcedTungstenIronPlate.get(),
            ),
        )

        // --- Air Filter
        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingAirFilterVent.get(amount = 2),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "PhP",
                "TFT",
                "PwP",
                'T',
                ImpactItems.SteelBars.get(),
                'F',
                OrePrefixes.frameGt.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingAirFilter.get(),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "SSS",
                "RVR",
                "MSM",
                'V',
                GregTechItems.CasingAirFilterVent.get(),
                'S',
                OrePrefixes.stickLong.get(Materials.StainlessSteel),
                'R',
                OrePrefixes.rotor.get(Materials.StainlessSteel),
                'M',
                GregTechItems.ElectricMotorHV.get(),
                'R',
                OrePrefixes.screw.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.MachineMultiAirFilter.get(),
            flags = GregTechRecipeFlags.buffered,
            recipe = arrayOf<Any?>(
                "RPR",
                "MBM",
                "CGC",
                'B',
                GregTechItems.HullHV.get(),
                'R',
                OrePrefixes.rotor.get(Materials.StainlessSteel),
                'P',
                GregTechItems.ElectricPumpHV.get(),
                'M',
                GregTechItems.ElectricMotorHV.get(),
                'C',
                OrePrefixes.cableGt01.get(Materials.Gold),
                'G',
                GregTechItems.CasingTurbine1.get(),
            ),
        )
    }
}
