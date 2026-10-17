package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GraviSuiteItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GalacticraftExplorationCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.TileWalkway.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PhP",
                " B ",
                "PwP",
                'P',
                OrePrefixes.plate.get(Materials.Desh),
                'B',
                OrePrefixes.frameGt.get(Materials.Desh),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.TileWalkwayWire.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PhP",
                "WBW",
                "PwP",
                'W',
                GalacticraftCoreItems.TileAluminumWire1.get(),
                'P',
                OrePrefixes.plate.get(Materials.Desh),
                'B',
                OrePrefixes.frameGt.get(Materials.Desh),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.TileWalkwayOxygenPipe.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PhP",
                "WBW",
                "PwP",
                'W',
                GalacticraftCoreItems.TileOxygenPipe.get(),
                'P',
                OrePrefixes.plate.get(Materials.Desh),
                'B',
                OrePrefixes.frameGt.get(Materials.Desh),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemStandardWrench.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PsP",
                "SIS",
                "dIf",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'I',
                OrePrefixes.stick.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.ItemItemBasicAsteroids1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PIP",
                "PEP",
                "BOB",
                'P',
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(),
                'B',
                GalacticraftCoreItems.ItemEngine1.get(),
                'O',
                GalacticraftCoreItems.ItemEngine.get(),
                'E',
                GregTechItems.ElectricPistonIV.get(),
                'I',
                OrePrefixes.pipeTiny.get(Materials.TungstenSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.ItemHeavyNoseCone.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dNh",
                "SDS",
                "DPD",
                'D',
                GalacticraftMarsItems.ItemNull5.get(),
                'P',
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(),
                'N',
                GalacticraftCoreItems.ItemNoseCone.get(),
                'S',
                OrePrefixes.screw.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.ItemItemBasicAsteroids8.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RPR",
                "PLP",
                "RPR",
                'P',
                GalacticraftCoreItems.ItemBasicItem11.get(),
                'R',
                OrePrefixes.ring.get(Materials.RedAlloy),
                'L',
                OrePrefixes.lens.get(Materials.Diamond),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.TileBeamReflector.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RBR",
                " S ",
                "PLP",
                'B',
                GalacticraftMarsItems.ItemItemBasicAsteroids8.get(),
                'R',
                OrePrefixes.ring.get(Materials.Desh),
                'S',
                OrePrefixes.stick.get(Materials.Desh),
                'P',
                OrePrefixes.plate.get(Materials.Desh),
                'L',
                OrePrefixes.block.get(Materials.Desh),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.TileBeamReceiver.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RPR",
                "PBP",
                "RPR",
                'R',
                GalacticraftCoreItems.ItemBasicItem7.get(),
                'P',
                OrePrefixes.ring.get(Materials.Desh),
                'B',
                GalacticraftMarsItems.ItemItemBasicAsteroids8.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.TileMarsMachine4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RCR",
                "PBP",
                "ROR",
                'P',
                GalacticraftMarsItems.ItemNull3.get(),
                'R',
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(),
                'C',
                GraviSuiteItems.CoolingCore.get(),
                'B',
                CarpentersBlocksItems.Bed.get(),
                'O',
                VanillaItems.Clock.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.TileMarsMachine.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "COC",
                "PGP",
                "MTI",
                'C',
                GalacticraftMarsItems.ItemItemBasicAsteroids6.get(),
                'O',
                GalacticraftCoreItems.ItemOxygenConcentrator.get(),
                'T',
                ImpactItems.PortableTankHV.get(),
                'G',
                GregTechItems.CasingGearboxTitanium.get(),
                'M',
                GregTechItems.ElectricMotorHV.get(),
                'I',
                GregTechItems.ElectricPumpHV.get(),
                'P',
                OrePrefixes.plate.get(Materials.Desh),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.TileMarsMachine8.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SME",
                "PHP",
                "CWC",
                'S',
                GregTechItems.SensorHV.get(),
                'E',
                GregTechItems.EmitterHV.get(),
                'W',
                OrePrefixes.circuit.get(Materials.Advanced),
                'M',
                GalacticraftCoreItems.ItemBasicItem19.get(),
                'H',
                GregTechItems.HullHV.get(),
                'P',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'C',
                OrePrefixes.cableGt02.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.ItemGrapple.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "  B",
                "WWW",
                "R  ",
                'R',
                OrePrefixes.ring.get(Materials.MeteoricSteel),
                'W',
                OrePrefixes.wireFine.get(Materials.MeteoricIron),
                'B',
                OrePrefixes.bolt.get(Materials.MeteoricSteel),
            ),
        )
    }
}
