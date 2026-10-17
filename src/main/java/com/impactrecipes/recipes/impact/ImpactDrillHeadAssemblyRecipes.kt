package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.get
import com.impactrecipes.util.toEuPercent
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactDrillHeadAssemblyRecipes {

    internal fun register() {
        val circuit3 = GT_Utility.getIntegratedCircuit(3)

        val materials = arrayOf(
            Materials.Iron,
            Materials.Steel,
            Materials.StainlessSteel,
            Materials.Titanium,
            Materials.TungstenSteel,
            Materials.Inconel690,
            Materials.Iridium,
            Materials.Neutronium,
        )

        val drillHeads = arrayOf(
            ImpactItems.IronDrillHead,
            ImpactItems.SteelDrillHead,
            ImpactItems.StainlessSteelDrillHead,
            ImpactItems.TitaniumDrillHead,
            ImpactItems.TungstenSteelDrillHead,
            ImpactItems.Inconel690DrillHead,
            ImpactItems.IridiumDrillHead,
            ImpactItems.NeutroniumDrillHead,
        )

        materials.forEachIndexed { index, material ->
            val drill = drillHeads[index].get()
            val prefixPlate = if (material == Materials.Steel || material == Materials.Iron) {
                OrePrefixes.plateDouble
            } else {
                OrePrefixes.plateDense
            }
            MachineRecipes.assembler(
                inputs = arrayOf(
                    material.get(
                        prefixes = prefixPlate,
                        amount = 3,
                    ),
                    material.get(prefixes = OrePrefixes.frameGt),
                    circuit3,
                ),
                fluid = null,
                output = drill,
                ticks = 20 * 10,
                eu = 25.toEuPercent(tier = index + 1),
            )
        }
    }
}
