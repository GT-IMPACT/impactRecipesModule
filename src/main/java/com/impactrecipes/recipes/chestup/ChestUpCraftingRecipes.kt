package com.impactrecipes.recipes.chestup

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ChestUpCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.WroughtIronChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.WroughtIron),
                'P',
                OrePrefixes.plateDouble.get(Materials.WroughtIron),
                'C',
                VanillaItems.Chest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.SteelChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                OrePrefixes.plateDouble.get(Materials.Steel),
                'C',
                ChestUpItems.WroughtIronChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.AluminiumChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'P',
                OrePrefixes.plateDouble.get(Materials.Aluminium),
                'C',
                ChestUpItems.SteelChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.HSLAChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.HSLA),
                'P',
                OrePrefixes.plateDouble.get(Materials.HSLA),
                'C',
                ChestUpItems.AluminiumChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.TitaniumChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Titanium),
                'P',
                OrePrefixes.plateDouble.get(Materials.Titanium),
                'C',
                ChestUpItems.HSLAChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.TungstenSteelChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.TungstenSteel),
                'P',
                OrePrefixes.plateDouble.get(Materials.TungstenSteel),
                'C',
                ChestUpItems.TitaniumChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.ChromeChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Chrome),
                'P',
                OrePrefixes.plateDouble.get(Materials.Chrome),
                'C',
                ChestUpItems.TungstenSteelChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.IridiumChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Iridium),
                'P',
                OrePrefixes.plateDouble.get(Materials.Iridium),
                'C',
                ChestUpItems.ChromeChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.OsmiumChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Osmium),
                'P',
                OrePrefixes.plateDouble.get(Materials.Osmium),
                'C',
                ChestUpItems.IridiumChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChestUpItems.NeutroniumChest.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "PCP",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Neutronium),
                'P',
                OrePrefixes.plateDouble.get(Materials.Neutronium),
                'C',
                ChestUpItems.OsmiumChest.get(),
            ),
        )
    }
}
