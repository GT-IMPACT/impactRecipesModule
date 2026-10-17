package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GalacticraftRocketComponentCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemEngine.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PEI",
                "SFS",
                "SRS",
                'S',
                GalacticraftCoreItems.ItemHeavyPlating.get(),
                'F',
                GalacticraftCoreItems.ItemAirVent.get(),
                'F',
                GregTechItems.CasingFireboxSteel.get(),
                'E',
                GregTechItems.ElectricPistonHV.get(),
                'I',
                OrePrefixes.pipeTiny.get(Materials.StainlessSteel),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'R',
                OrePrefixes.ring.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemEngine1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "HCH",
                "HVH",
                'P',
                GalacticraftCoreItems.ItemMeteoricIronIngot1.get(),
                'H',
                GalacticraftCoreItems.ItemHeavyPlating.get(),
                'V',
                GalacticraftCoreItems.ItemAirVent.get(),
                'C',
                GregTechItems.LargeFluidCellSteel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemNoseCone.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dPh",
                "SES",
                "PCP",
                'P',
                GalacticraftCoreItems.ItemHeavyPlating.get(),
                'E',
                GregTechItems.SensorHV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemOilExtractor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IdS",
                "SCP",
                "BPP",
                'P',
                GalacticraftCoreItems.ItemBasicItem10.get(),
                'C',
                GalacticraftCoreItems.ItemOilCanisterPartial1001.get(),
                'B',
                VanillaItems.StoneButton.get(),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'I',
                OrePrefixes.pipeTiny.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemBuggymat.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "RTR",
                "PRP",
                'P',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'T',
                GalacticraftMarsItems.ItemItemBasicAsteroids6.get(),
                'R',
                OrePrefixes.plate.get(Materials.Rubber),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemBuggymat1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " RP",
                "RRP",
                "PPP",
                'P',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'R',
                OrePrefixes.plate.get(Materials.Rubber),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemBuggymat2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "PCP",
                "PPP",
                'P',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'R',
                IC2Items.RubberTrampoline.get(),
                'C',
                ChestUpItems.SteelChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemBasicItem19.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "AEA",
                "WMW",
                "TBT",
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'T',
                GalacticraftCoreItems.ItemBasicItem7.get(),
                'W',
                OrePrefixes.circuit.get(Materials.Advanced),
                'M',
                ImpactItems.LargeScreen.get(),
                'E',
                GregTechItems.SensorHV.get(),
                'B',
                GregTechItems.BatteryREHVLithium.get(),
            ),
        )
    }
}
