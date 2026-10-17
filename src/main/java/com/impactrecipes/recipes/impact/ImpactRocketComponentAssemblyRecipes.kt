package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactRocketComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GalacticraftMarsItems.ItemHeavyNoseCone.get(),
                ImpactItems.HeavyDutyPlateTier4.get(),
                ImpactItems.IceCompressedPlate.get(amount = 3),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = Materials.Osmiridium.getMolten(36),
            output = ImpactItems.HeavyDutyNoseConeTier4.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.HeavyDutyNoseConeTier4.get(),
                ImpactItems.HeavyDutyPlateTier5.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.NaquadahAlloy,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = Materials.Duranium.getMolten(36),
            output = ImpactItems.HeavyDutyNoseConeTier5.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.HeavyDutyNoseConeTier5.get(),
                ImpactItems.HeavyDutyPlateTier6.get(),
                ImpactItems.MysteriousCrystalCompressedPlate.get(amount = 3),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = Materials.Tritanium.getMolten(36),
            output = ImpactItems.HeavyDutyNoseConeTier6.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.HeavyDutyNoseConeTier6.get(),
                ImpactItems.HeavyDutyPlateTier7.get(),
                ImpactItems.QuantiumCompressedPlate.get(amount = 3),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = Materials.Neutronium.getMolten(36),
            output = ImpactItems.HeavyDutyNoseConeTier7.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.HeavyDutyNoseConeTier7.get(),
                ImpactItems.HeavyDutyPlateTier8.get(),
                ImpactItems.BlackPlutoniumCompressedPlate.get(amount = 3),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = Materials.Phoenixite.getMolten(36),
            output = ImpactItems.HeavyDutyNoseConeTier8.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.IridiumAlloyDualCompressedPlate.get(),
                ImpactItems.HeavyDutyPlateTier4.get(amount = 2),
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.HeavyDutyRocketFinsTier4.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.IceDualCompressedPlate.get(),
                ImpactItems.HeavyDutyPlateTier5.get(amount = 2),
                ImpactItems.HeavyDutyPlateTier4.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.HeavyDutyRocketFinsTier5.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.MysteriousCrystalDualCompressedPlate.get(),
                ImpactItems.HeavyDutyPlateTier6.get(amount = 2),
                ImpactItems.HeavyDutyPlateTier5.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.HeavyDutyRocketFinsTier6.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.QuantiumDualCompressedPlate.get(),
                ImpactItems.HeavyDutyPlateTier7.get(amount = 2),
                ImpactItems.HeavyDutyPlateTier6.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.HeavyDutyRocketFinsTier7.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Adamantium,
                    count = 1,
                ),
                ImpactItems.HeavyDutyPlateTier8.get(amount = 2),
                ImpactItems.HeavyDutyPlateTier7.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.HeavyDutyRocketFinsTier8.get(),
            ticks = 50,
            eu = 12,
        )
    }
}
