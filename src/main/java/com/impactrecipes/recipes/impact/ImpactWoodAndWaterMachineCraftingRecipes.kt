package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ImpactWoodAndWaterMachineCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.SawMillConveyor.get(amount = 5),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "BLB",
                "BdB",
                'S',
                OrePrefixes.screw.get(Materials.WroughtIron),
                'B',
                OrePrefixes.frameGt.get(Materials.Wood),
                'L',
                OrePrefixes.slab.get(Materials.Wood),
                'C',
                ImpactItems.ULVConveyorModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.SawCase.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SrS",
                "SBS",
                "SsS",
                'S',
                OrePrefixes.slab.get(Materials.Wood),
                'B',
                OrePrefixes.frameGt.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.SawMill.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SBd",
                "MCM",
                "LWL",
                'S',
                OrePrefixes.screw.get(Materials.WroughtIron),
                'B',
                OrePrefixes.toolHeadBuzzSaw.get(Materials.Iron),
                'L',
                OrePrefixes.circuit.get(Materials.Primitive),
                'W',
                OrePrefixes.wireGt01.get(Materials.Lead),
                'M',
                ImpactItems.ULVMotor.get(),
                'C',
                ImpactItems.SawCase.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Pyrolyse.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PQW",
                "CHC",
                "ICW",
                'Q',
                OrePrefixes.pipeNonuple.get(Materials.Bronze),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'W',
                OrePrefixes.wireGt08.get(Materials.Cupronickel),
                'P',
                GregTechItems.ElectricPumpLV.get(),
                'I',
                GregTechItems.ElectricPistonLV.get(),
                'H',
                GregTechItems.HullLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.PrimitiveWaterPumpCase.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SWS",
                "dCr",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'W',
                OrePrefixes.plank.get(Materials.Wood),
                'C',
                OrePrefixes.slab.get(Materials.Cobblestone),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.BasicWaterPump.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RPS",
                "OWd",
                "CHC",
                'O',
                OrePrefixes.rotor.get(Materials.Iron),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'P',
                OrePrefixes.pipeMedium.get(Materials.Wood),
                'H',
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Wood,
                    count = 1,
                ),
                'W',
                OrePrefixes.plank.get(Materials.Wood),
                'C',
                OrePrefixes.slab.get(Materials.Cobblestone),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HatchOutputPump.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SRd",
                "WHW",
                "CRC",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'H',
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Wood,
                    count = 1,
                ),
                'W',
                OrePrefixes.plank.get(Materials.Wood),
                'C',
                OrePrefixes.slab.get(Materials.Cobblestone),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.WaterDrill.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BDB",
                "GPG",
                "CHC",
                'B',
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                'D',
                RecipeItems.ore(
                    prefix = OrePrefixes.toolHeadDrill,
                    material = Materials.Steel,
                    count = 1,
                ),
                'G',
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                'P',
                OrePrefixes.pipeHuge.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'H',
                GregTechItems.HullMV.get(),
            ),
        )
    }
}
