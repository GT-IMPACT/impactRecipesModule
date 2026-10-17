package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.CatwalksItems
import com.impactrecipes.items.ComputeryItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import cpw.mods.fml.common.Loader
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class RailcraftDetectorAndNfcTrackAssemblyRecipes {

    internal fun register() {
        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                VanillaItems.StonePressurePlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = VanillaItems.DetectorRail.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                VanillaItems.StonePressurePlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = VanillaItems.DetectorRail.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                VanillaItems.StonePressurePlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = VanillaItems.DetectorRail.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                VanillaItems.RedstoneTorch.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = VanillaItems.ActivatorRail.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                VanillaItems.RedstoneTorch.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = VanillaItems.ActivatorRail.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                VanillaItems.RedstoneTorch.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = VanillaItems.ActivatorRail.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                ComputeryItems.MetaItem3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = ComputeryItems.NfcTrack.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                ComputeryItems.MetaItem3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = ComputeryItems.NfcTrack.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                ComputeryItems.MetaItem3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = ComputeryItems.NfcTrack.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        if (Loader.isModLoaded("catwalks")) {
            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(8),
                    RailcraftItems.RailbedWood.get(),
                    RailcraftItems.RailStandard.get(amount = 2),
                    CatwalksItems.Steelgrate.get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Iron,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRail.get(amount = 8),
                ticks = 200,
                eu = 6,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(8),
                    RailcraftItems.RailbedStone.get(),
                    RailcraftItems.RailStandard.get(amount = 4),
                    CatwalksItems.Steelgrate.get(amount = 4),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Steel,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRail.get(amount = 16),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(8),
                    ImpactItems.ConcreteRailbed.get(),
                    RailcraftItems.RailStandard.get(amount = 6),
                    CatwalksItems.Steelgrate.get(amount = 6),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Steel,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRail.get(amount = 32),
                ticks = 400,
                eu = 12,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(9),
                    RailcraftItems.RailbedWood.get(),
                    RailcraftItems.RailAdvanced.get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.plate,
                        material = Materials.RedAlloy,
                        count = 1,
                    ),
                    CatwalksItems.Steelgrate.get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Steel,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRailPowered.get(amount = 4),
                ticks = 200,
                eu = 6,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(9),
                    RailcraftItems.RailbedStone.get(),
                    RailcraftItems.RailAdvanced.get(amount = 4),
                    RecipeItems.ore(
                        prefix = OrePrefixes.stick,
                        material = Materials.RedAlloy,
                        count = 1,
                    ),
                    CatwalksItems.Steelgrate.get(amount = 4),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Steel,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRailPowered.get(amount = 8),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(9),
                    ImpactItems.ConcreteRailbed.get(),
                    RailcraftItems.RailAdvanced.get(amount = 6),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.RedAlloy,
                        count = 1,
                    ),
                    CatwalksItems.Steelgrate.get(amount = 6),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.HSLA,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRailPowered.get(amount = 16),
                ticks = 400,
                eu = 12,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(10),
                    RailcraftItems.RailbedWood.get(),
                    RailcraftItems.RailStandard.get(amount = 2),
                    VanillaItems.RedstoneTorch.get(),
                    CatwalksItems.Steelgrate.get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Iron,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRailActivator.get(amount = 4),
                ticks = 200,
                eu = 6,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(10),
                    RailcraftItems.RailbedStone.get(),
                    RailcraftItems.RailStandard.get(amount = 4),
                    VanillaItems.RedstoneTorch.get(),
                    CatwalksItems.Steelgrate.get(amount = 4),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Iron,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRailActivator.get(amount = 8),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(10),
                    ImpactItems.ConcreteRailbed.get(),
                    RailcraftItems.RailStandard.get(amount = 6),
                    VanillaItems.RedstoneTorch.get(),
                    CatwalksItems.Steelgrate.get(amount = 6),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Steel,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRailActivator.get(amount = 16),
                ticks = 400,
                eu = 12,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(10),
                    RailcraftItems.RailbedWood.get(),
                    RailcraftItems.RailStandard.get(amount = 2),
                    VanillaItems.StonePressurePlate.get(),
                    CatwalksItems.Steelgrate.get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Iron,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRailDetector.get(amount = 4),
                ticks = 200,
                eu = 6,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(10),
                    RailcraftItems.RailbedStone.get(),
                    RailcraftItems.RailStandard.get(amount = 4),
                    VanillaItems.StonePressurePlate.get(),
                    CatwalksItems.Steelgrate.get(amount = 4),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Iron,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRailDetector.get(amount = 8),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.trackAssembler(
                inputs = arrayOf(
                    GT_Utility.getIntegratedCircuit(10),
                    ImpactItems.ConcreteRailbed.get(),
                    RailcraftItems.RailStandard.get(amount = 6),
                    VanillaItems.StonePressurePlate.get(),
                    CatwalksItems.Steelgrate.get(amount = 6),
                    RecipeItems.ore(
                        prefix = OrePrefixes.bolt,
                        material = Materials.Steel,
                        count = 2,
                    ),
                ),
                output = CatwalksItems.SturdyRailDetector.get(amount = 16),
                ticks = 400,
                eu = 12,
            )
        }
    }
}
