package com.impactrecipes.recipes.jabba

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.JabbaItems
import com.impactrecipes.items.ProjectRedTransmissionItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class JabbaUtilityCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.VoidUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "STS",
                "PVP",
                "SRS",
                'P',
                OrePrefixes.itemCasing.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'V',
                ExtraUtilitiesItems.TrashCan.get(),
                'R',
                ProjectRedTransmissionItems.RedAlloyWire.get(),
                'T',
                JabbaItems.StorageUpgrade.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.BarrelHammer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IPI",
                "STS",
                "hTd",
                'I',
                OrePrefixes.ingot.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'T',
                OrePrefixes.stick.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.Dolly.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "TTR",
                "TwR",
                "OPO",
                'R',
                OrePrefixes.round.get(Materials.Rubber),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                OrePrefixes.stick.get(Materials.Iron),
                'O',
                GregTechItems.ComponentMinecartWheelsIron.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StorageUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "SDS",
                " d ",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                VanillaItems.Piston.get(),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )
    }
}
