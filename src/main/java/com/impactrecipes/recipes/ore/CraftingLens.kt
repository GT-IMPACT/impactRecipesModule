package com.impactrecipes.recipes.ore

public enum class CraftingLens(
    public val oreDictName: String,
) {

    Red(oreDictName = "craftingLensRed"),
    Green(oreDictName = "craftingLensGreen"),
    White(oreDictName = "craftingLensWhite"),
    Yellow(oreDictName = "craftingLensYellow"),
    Blue(oreDictName = "craftingLensBlue"),
    Purple(oreDictName = "craftingLensPurple");

    public companion object {

        public fun fromOreDictName(oreDictName: String): CraftingLens? {
            return entries.firstOrNull {
                it.oreDictName == oreDictName
            }
        }
    }
}
