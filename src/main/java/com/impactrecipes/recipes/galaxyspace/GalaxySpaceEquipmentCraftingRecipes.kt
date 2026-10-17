package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GalaxySpaceEquipmentCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemModules3.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "CMC",
                "ShS",
                'C',
                GalaxySpaceItems.ItemCompressedPlates4.get(),
                'S',
                OrePrefixes.screw.get(Materials.HSLA),
                'M',
                GalaxySpaceItems.ItemBasicItems.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemBasicItems.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "PwP",
                "PRP",
                'P',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'R',
                OrePrefixes.ring.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.AdvFuelLoader.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SWS",
                "PTM",
                "AIA",
                'I',
                OrePrefixes.pipeMedium.get(Materials.TungstenSteel),
                'S',
                GalacticraftMarsItems.ItemNull5.get(),
                'A',
                ImpactItems.IceCompressedPlate.get(),
                'W',
                OrePrefixes.circuit.get(Materials.Elite),
                'M',
                GregTechItems.ElectricMotorIV.get(),
                'P',
                GregTechItems.ElectricPumpIV.get(),
                'T',
                GregTechItems.LargeFluidCellTungstenSteel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.Gravitationmoduleon.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PLP",
                "CFC",
                "IHI",
                'L',
                OrePrefixes.lens.get(Materials.Diamond),
                'C',
                OrePrefixes.cableGt02.get(Materials.Aluminium),
                'I',
                OrePrefixes.circuit.get(Materials.Data),
                'F',
                GregTechItems.FieldGeneratorHV.get(),
                'H',
                GregTechItems.HullEV.get(),
                'P',
                GalaxySpaceItems.ItemCompressedPlates4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.Radiationstabiliser.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ACA",
                "WHF",
                "SCS",
                'A',
                OrePrefixes.compressed.get(Materials.Aluminium),
                'S',
                OrePrefixes.compressed.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'W',
                OrePrefixes.cableGt02.get(Materials.Aluminium),
                'F',
                GregTechItems.EVCoil.get(),
                'H',
                GregTechItems.HullEV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemOxygentankT410800.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "PCP",
                "PPP",
                'P',
                ImpactItems.MeitneriumCompressedPlate.get(),
                'C',
                GregTechItems.LargeFluidCellChrome.get(),
                'T',
                GalacticraftCoreItems.TileOxygenPipe.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemOxygentankT512600.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "PCP",
                "PPP",
                'P',
                ImpactItems.MysteriousCrystalCompressedPlate.get(),
                'C',
                GregTechItems.LargeFluidCellIridium.get(),
                'T',
                GalacticraftCoreItems.TileOxygenPipe.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemOxygentankT614400.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "PCP",
                "PPP",
                'P',
                ImpactItems.QuantiumCompressedPlate.get(),
                'C',
                GregTechItems.LargeFluidCellOsmium.get(),
                'T',
                GalacticraftCoreItems.TileOxygenPipe.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemBasicItems14.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "PIP",
                "RFR",
                'S',
                OrePrefixes.stick.get(Materials.ElectricalSteel),
                'P',
                OrePrefixes.plate.get(Materials.ElectricalSteel),
                'R',
                OrePrefixes.ring.get(Materials.ElectricalSteel),
                'I',
                OrePrefixes.circuit.get(Materials.Advanced),
                'F',
                GregTechItems.FieldGeneratorMV.get(),
                'C',
                GregTechItems.HVCoil.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemBasicItems15.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "PIP",
                "RFR",
                'S',
                OrePrefixes.stick.get(Materials.VanadiumSteel),
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'R',
                OrePrefixes.ring.get(Materials.VanadiumSteel),
                'I',
                OrePrefixes.circuit.get(Materials.Advanced),
                'F',
                GregTechItems.FieldGeneratorMV.get(),
                'C',
                GregTechItems.ElectricPumpHV.get(),
            ),
        )
    }
}
