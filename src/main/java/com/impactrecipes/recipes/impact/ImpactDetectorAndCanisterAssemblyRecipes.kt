package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactDetectorAndCanisterAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.HeavyWeightedPressurePlate32767.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Birmabright,
                count = 1,
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.AdvancedFluidDetectorBoundModeCover.get(),
            ticks = 600,
            eu = 96,
        )

        MachineRecipes.assembler(
            input = IC2Items.EcMeter.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Birmabright,
                count = 1,
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.AdvancedEnergyDetectorBoundModeCover.get(),
            ticks = 600,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalaxySpaceItems.ItemModules3.get(),
                ImpactItems.DeshDualCompressedPlate.get(),
                ImpactItems.TitaniumDualCompressedPlate.get(),
            ),
            fluid = Materials.HastelloyC276.getMolten(72),
            output = ImpactItems.MediumFuelCanister.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.MediumFuelCanister.get(),
                ImpactItems.IridiumAlloyDualCompressedPlate.get(),
                ImpactItems.IceDualCompressedPlate.get(),
            ),
            fluid = Materials.Lafium.getMolten(72),
            output = ImpactItems.LargeFuelCanister.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.LargeFuelCanister.get(),
                ImpactItems.QuantiumDualCompressedPlate.get(),
                ImpactItems.MysteriousCrystalDualCompressedPlate.get(),
            ),
            fluid = Materials.Neutronium.getMolten(72),
            output = ImpactItems.ExtraLargeFuelCanister.get(),
            ticks = 50,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Iron,
                    count = 1,
                ),
                VanillaItems.Chest.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Iron,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Iron.getMolten(72),
            output = GregTechItems.MinerDrillHatch.get(),
            ticks = 50,
            eu = 12,
        )
    }
}
