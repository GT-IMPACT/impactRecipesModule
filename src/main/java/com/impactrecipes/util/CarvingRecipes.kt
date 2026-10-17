package com.impactrecipes.util

import com.cricketcraft.chisel.api.carving.CarvingUtils
import net.minecraft.block.Block
import team.chisel.carving.Carving

public object CarvingRecipes {

    public fun removeGroup(group: String) {
        Carving.chisel.removeGroup(group)
    }

    public fun addGroup(group: String) {
        Carving.chisel.addGroup(CarvingUtils.SimpleCarvingGroup(group))
    }

    public fun variation(
        group: String,
        block: Block?,
        meta: Int,
        sortOrder: Int,
    ) {
        Carving.chisel.addVariation(
            group,
            block,
            meta,
            sortOrder,
        )
    }

    public fun blockGroup(
        group: String,
        block: Block?,
        firstMeta: Int,
        untilMeta: Int,
    ) {
        addGroup(group)

        for (meta in firstMeta until untilMeta) {
            variation(
                group = group,
                block = block,
                meta = meta,
                sortOrder = 0,
            )
        }
    }
}
