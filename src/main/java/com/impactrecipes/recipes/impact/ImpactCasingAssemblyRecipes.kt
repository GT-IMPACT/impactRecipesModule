package com.impactrecipes.recipes.impact

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactCasingAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.GumMetal,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titaniolum,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.PBECasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Zamak,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Duraluminium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.EngraverCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel690,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Nitinol,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.AssemblerCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TiBetaC,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.CentrifugeCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Zamak,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.ElectrolyzerCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titaniolum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Inconel690,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.WireFactoryCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.MaragingSteel250,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Inconel792,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.SupplyProductionCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nitinol,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.UtilityMachineCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Talonite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Grisium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.BrewmenterCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nitinol,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Inconel690,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.ElectromagneticCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nitinol60,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Kovar,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.ArcCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.TiBetaC,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Talonite,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.ExtradificationCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titaniolum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel250,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.MixingCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Mangalloy,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.MacerationCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.MaragingSteel300,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Stellite,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.CuttingCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.MachineHVPrinter.get(),
                GregTechItems.CoverCrafting.get(),
                GregTechItems.ConveyorModuleHV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.BlackSteel,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.StainlessSteel,
                    count = 16,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(288),
            output = ImpactItems.MachineDDDPrinter.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.VanadiumSteel,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 8,
                ),
            ),
            fluid = null,
            output = ImpactItems.DDDPrinterCasing.get(amount = 2),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.MEPatternTerminal.get(),
                GregTechItems.CoverItemDetector.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 4,
                ),
                GregTechItems.RobotArmHV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.BlackSteel,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 24,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.BlueSteel,
                    count = 32,
                ),
            ),
            fluid = null,
            output = ImpactItems.DDDPrinterCasing3x3.get(amount = 9),
            ticks = 800,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.GumMetal,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Naquadah,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Desh,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.TungstenSteel,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.TungstenSteel,
                    count = 12,
                ),
                GregTechItems.FieldGeneratorMV.get(),
            ),
            fluid = null,
            output = ImpactItems.NqCasing.get(amount = 2),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel300,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlackSteel,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSS,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSG.getMolten(288),
            output = ImpactItems.CycloneCasing.get(amount = 2),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titaniolum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TiBetaC,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.HugeCasingTurbine.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )
    }
}
