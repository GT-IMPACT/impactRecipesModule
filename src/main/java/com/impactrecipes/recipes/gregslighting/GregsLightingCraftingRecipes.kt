package com.impactrecipes.recipes.gregslighting

import com.impactrecipes.items.GregsLightingItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregsLightingCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shaped(
            output = GregsLightingItems.BonemealAndCharcoal.get(),
            recipe = arrayOf(
                "CB",
                "M ",
                'C',
                OrePrefixes.gem.get(Materials.Charcoal),
                'B',
                OrePrefixes.dust.get(Materials.Bone),
                'M',
                "craftingToolMortar",
            ),
        )

        CraftingRecipes.shaped(
            output = GregsLightingItems.BonemealAndCharcoal.get(),
            recipe = arrayOf(
                "BC",
                "M ",
                'B',
                OrePrefixes.dust.get(Materials.Bone),
                'C',
                OrePrefixes.gem.get(Materials.Coal),
                'M',
                "craftingToolMortar",
            ),
        )

        CraftingRecipes.shaped(
            output = GregsLightingItems.Ic2FilamentAssembly.get(),
            recipe = arrayOf(
                "SWS",
                "SCS",
                "PTP",
                'S',
                OrePrefixes.stick.get(Materials.Iron),
                'W',
                OrePrefixes.wireFine.get(Materials.Electrum),
                'C',
                "craftingToolWireCutter",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'T',
                OrePrefixes.wireGt01.get(Materials.Tin),
            ),
        )

        CraftingRecipes.shaped(
            output = GregsLightingItems.Ic2ElectricFloodlight.get(),
            recipe = arrayOf(
                "PLP",
                "CBC",
                "PWP",
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
                'L',
                OrePrefixes.lens.get(Materials.Glass),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'B',
                GregsLightingItems.GlowstoneBulb.get(),
                'W',
                OrePrefixes.wireGt01.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shaped(
            output = GregsLightingItems.Floodlight.get(),
            recipe = arrayOf(
                "PLP",
                "CIC",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'L',
                OrePrefixes.lens.get(Materials.Diamond),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'I',
                GregsLightingItems.GlowingIngot.get(),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shaped(
            output = GregsLightingItems.CarbideFloodlight.get(),
            recipe = arrayOf(
                "PTP",
                "BNB",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                GregTechItems.CircuitPartsGlassTube.get(),
                'B',
                VanillaItems.IronBars.get(),
                'N',
                GregsLightingItems.GasNozzle.get(),
                'C',
                GregTechItems.CasingFireboxSteel.get(),
            ),
        )

        CraftingRecipes.shaped(
            output = GregsLightingItems.GasNozzle.get(amount = 2),
            recipe = arrayOf(
                " R ",
                "FPH",
                " B ",
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'F',
                "craftingToolFile",
                'P',
                OrePrefixes.pipeSmall.get(Materials.Steel),
                'H',
                "craftingToolHardHammer",
                'B',
                VanillaItems.IronBars.get(),
            ),
        )
    }
}
