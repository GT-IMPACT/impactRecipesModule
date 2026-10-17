package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.oredict.OreDictionary

internal class VanillaOreDictionaryRecipes {

    internal fun register() {
        OreDictionary.registerOre(
            "dyeBlack",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Coal,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeBlack",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Charcoal,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeBlack",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DarkAshes,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeBlack",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Magnetite,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeGray",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ashes,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeGreen",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Malachite,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeGreen",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glauconite,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeGreen",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Garnierite,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeWhite",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Calcite,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeWhite",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Zincite,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeWhite",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Barite,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeWhite",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Quicklime,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeWhite",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.AntimonyTrioxide,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeRed",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Cinnabar,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeRed",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.BandedIron,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeYellow",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Massicot,
                count = 1,
            ),
        )

        OreDictionary.registerOre(
            "dyeBrown",
            RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lignite,
                count = 1,
            ),
        )

        for (i in 0 until 6) {
            OreDictionary.registerOre(
                "plankWood",
                VanillaItems.Planks.get(amount = i),
            )
        }

        OreDictionary.registerOre(
            "slimeball",
            IC2Items.Resin.get(),
        )
    }
}
