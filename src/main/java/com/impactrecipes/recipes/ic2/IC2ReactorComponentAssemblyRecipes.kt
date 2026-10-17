package com.impactrecipes.recipes.ic2

import com.impact.common.item.Core_List_Items.NeutronReflectorParts
import com.impact.common.item.Core_List_Items.NeutronReflectorSmallParts
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class IC2ReactorComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                GregTechItems.CircuitPartsCrystalChipMaster.get(amount = 12),
                ModItemVariant(
                    item = IC2Items.AdvancedHeatExchanger,
                    meta = 1,
                ).get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(1440),
            output = IC2Items.LapotronChargingCrystal.get(),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Tin,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Graphite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Steel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ModItemVariant(
                item = IC2Items.ReactorReflector,
                meta = 1,
            ).get(),
            ticks = 100,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TinAlloy,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Graphite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Beryllium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ModItemVariant(
                item = IC2Items.ReactorReflector,
                meta = 1,
            ).get(),
            ticks = 100,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Tin,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Graphite,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateAlloy,
                    material = Materials.Carbon,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Steel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.NeutronReflectorSmallParts.get(),
            ticks = 120,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TinAlloy,
                    count = 24,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Graphite,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateAlloy,
                    material = Materials.Carbon,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Beryllium,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.NeutronReflectorSmallParts.get(),
            ticks = 120,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.NeutronReflectorSmallParts.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Beryllium,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ModItemVariant(
                item = IC2Items.ReactorReflectorThick,
                meta = 1,
            ).get(),
            ticks = 600,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.NeutronReflectorSmallParts.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.TungstenCarbide,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ModItemVariant(
                item = IC2Items.ReactorReflectorThick,
                meta = 1,
            ).get(),
            ticks = 600,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Californium,
                    count = 1,
                ),
                ImpactItems.NeutronReflectorSmallParts.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Beryllium,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.NeutronReflectorParts.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Californium,
                    count = 1,
                ),
                ImpactItems.NeutronReflectorSmallParts.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.TungstenCarbide,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.NeutronReflectorParts.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.NeutronReflectorParts.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateAlloy,
                    material = Materials.Iridium,
                    count = 1,
                ),
            ),
            fluid = null,
            output = GregTechItems.NeutronReflector.get(),
            ticks = 1200,
            eu = 250,
        )
    }
}
