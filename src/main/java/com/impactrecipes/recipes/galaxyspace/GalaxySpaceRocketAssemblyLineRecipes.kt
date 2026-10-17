package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class GalaxySpaceRocketAssemblyLineRecipes {

    internal fun register() {
        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = ImpactItems.SchematicsTier4.get(),
            researchTicks = 144000,
            inputs = arrayOf<Any?>(
                ImpactItems.HeavyDutyNoseConeTier4.get(),
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(amount = 4),
                ImpactItems.HeavyDutyPlateTier4.get(amount = 14),
                ImpactItems.HeavyDutyRocketFinsTier4.get(amount = 6),
                ImpactItems.Tier4Booster.get(amount = 4),
                ImpactItems.MediumFuelCanister.get(amount = 4),
                ImpactItems.HeavyDutyRocketEngineTier4.get(amount = 2),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(576),
                Materials.Lubricant.getFluid(500),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    500,
                ),
            ),
            output = GalaxySpaceItems.ItemTier4Rocket.get(),
            ticks = 3000,
            eu = 16324,
        )

        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = ImpactItems.SchematicsTier5.get(),
            researchTicks = 288000,
            inputs = arrayOf<Any?>(
                ImpactItems.HeavyDutyNoseConeTier5.get(),
                ImpactItems.HeavyDutyPlateTier4.get(amount = 6),
                ImpactItems.HeavyDutyPlateTier5.get(amount = 16),
                ImpactItems.HeavyDutyRocketFinsTier5.get(amount = 6),
                ImpactItems.Tier5Booster.get(amount = 4),
                ImpactItems.LargeFuelCanister.get(amount = 2),
                ImpactItems.HeavyDutyRocketEngineTier5.get(amount = 3),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1152),
                Materials.Lubricant.getFluid(1000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    1000,
                ),
                Materials.Duranium.getMolten(576),
            ),
            output = GalaxySpaceItems.ItemTier5Rocket.get(),
            ticks = 4000,
            eu = 65524,
        )

        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = ImpactItems.SchematicsTier6.get(),
            researchTicks = 432000,
            inputs = arrayOf<Any?>(
                ImpactItems.HeavyDutyNoseConeTier6.get(),
                ImpactItems.HeavyDutyPlateTier5.get(amount = 8),
                ImpactItems.HeavyDutyPlateTier6.get(amount = 18),
                ImpactItems.HeavyDutyRocketFinsTier6.get(amount = 8),
                ImpactItems.Tier6Booster.get(amount = 6),
                ImpactItems.LargeFuelCanister.get(amount = 4),
                ImpactItems.HeavyDutyRocketEngineTier6.get(amount = 4),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2304),
                Materials.Lubricant.getFluid(2000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    2000,
                ),
                Materials.Tritanium.getMolten(1152),
            ),
            output = GalaxySpaceItems.ItemTier6Rocket.get(),
            ticks = 5000,
            eu = 262132,
        )

        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = ImpactItems.SchematicsTier7.get(),
            researchTicks = 576000,
            inputs = arrayOf<Any?>(
                ImpactItems.HeavyDutyNoseConeTier7.get(),
                ImpactItems.HeavyDutyPlateTier6.get(amount = 10),
                ImpactItems.HeavyDutyPlateTier7.get(amount = 20),
                ImpactItems.HeavyDutyRocketFinsTier7.get(amount = 10),
                ImpactItems.Tier7Booster.get(amount = 8),
                ImpactItems.ExtraLargeFuelCanister.get(amount = 2),
                ImpactItems.HeavyDutyRocketEngineTier7.get(amount = 5),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(4608),
                Materials.Lubricant.getFluid(4000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    4000,
                ),
                Materials.Neutronium.getMolten(2304),
            ),
            output = GalaxySpaceItems.ItemTier7Rocket.get(),
            ticks = 6000,
            eu = 1000000,
        )

        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = ImpactItems.SchematicsTier8.get(),
            researchTicks = 1152000,
            inputs = arrayOf<Any?>(
                ImpactItems.HeavyDutyNoseConeTier8.get(),
                ImpactItems.HeavyDutyPlateTier7.get(amount = 12),
                ImpactItems.HeavyDutyPlateTier8.get(amount = 24),
                ImpactItems.HeavyDutyRocketFinsTier8.get(amount = 12),
                ImpactItems.Tier8Booster.get(amount = 10),
                ImpactItems.ExtraLargeFuelCanister.get(amount = 4),
                ImpactItems.HeavyDutyRocketEngineTier8.get(amount = 6),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(9216),
                Materials.Lubricant.getFluid(8000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    8000,
                ),
                Materials.Phoenixite.getMolten(4608),
            ),
            output = GalaxySpaceItems.ItemTier8Rocket.get(),
            ticks = 7000,
            eu = 4000000,
        )
    }
}
