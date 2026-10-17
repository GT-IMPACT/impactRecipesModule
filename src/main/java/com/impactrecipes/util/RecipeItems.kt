package com.impactrecipes.util

import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler
import gregtech.api.util.GT_OreDictUnificator
import net.minecraft.item.ItemStack

/** Missing ingredients return null and are reported; registration helpers skip incomplete recipes. */
public object RecipeItems {

    @JvmStatic
    @JvmOverloads
    public fun ore(
        name: String,
        count: Int = 1,
    ): ItemStack? {
        return GregTech_API.getStackofAmountFromOreDict(
            name,
            count,
        )
    }

    @JvmStatic
    @JvmOverloads
    public fun find(
        mod: String,
        name: String,
        meta: Int = 0,
        count: Int = 1,
    ): ItemStack? {
        if (count < 0) {
            RecipeDiagnostics.failure(
                id = "$mod:$name@$meta",
                reason = "Invalid count: $count",
            )
            return null
        }
        return GT_ModHandler.getModItem(
            mod,
            name,
            count.toLong(),
            meta,
        )?.copy()
    }

    @JvmStatic
    @JvmOverloads
    public fun item(
        mod: String,
        name: String,
        meta: Int = 0,
        count: Int = 1,
    ): ItemStack? {
        return find(
            mod = mod,
            name = name,
            meta = meta,
            count = count,
        ).also {
            if (it == null) {
                RecipeDiagnostics.failure(
                    id = "$mod:$name@$meta x$count",
                    reason = "Item not found. Check the mod and its version.",
                )
            }
        }
    }

    @JvmStatic
    @JvmOverloads
    public fun ore(
        prefix: OrePrefixes,
        material: Materials,
        count: Int = 1,
    ): ItemStack? {
        if (count < 0) {
            RecipeDiagnostics.failure(
                id = "$prefix$material",
                reason = "Invalid count: $count",
            )
            return null
        }
        return GT_OreDictUnificator.get(
            prefix,
            material,
            count.toLong(),
        )?.copy().also {
            if (it == null) {
                RecipeDiagnostics.failure(
                    id = "$prefix$material x$count",
                    reason = "Material not found in the ore dictionary.",
                )
            }
        }
    }
}
