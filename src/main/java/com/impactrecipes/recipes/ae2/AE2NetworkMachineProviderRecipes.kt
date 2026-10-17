package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2NetworkMachineProviderRecipes {

    internal fun register() {
        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.EnergyAcceptor.get(),
                AE2Items.EngineeringProcessor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Platinum,
                    count = 4,
                ),
                AE2Items.ItemItemMultiPart76.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 8,
                ),
            ),
            output = AE2Items.Controller.get(),
            ticks = 30 * 20,
            eu = 1920,
            particles = 8000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                ChestUpItems.HSLAChest.get(),
                AE2Items.METerminal.get(),
                AE2Items.ItemItemMultiPart16.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.EnergeticAlloy,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.VanadiumSteel,
                    count = 2,
                ),
                AE2Items.LogicProcessor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Vanadium,
                    count = 12,
                ),
            ),
            output = AE2Items.Chest.get(),
            ticks = 20 * 20,
            eu = 480,
            particles = 1000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.Chest.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.VibrantAlloy,
                    count = 2,
                ),
                AE2Items.EngineeringProcessor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.VanadiumSteel,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Vanadium,
                    count = 9,
                ),
            ),
            output = AE2Items.MEDrive.get(),
            ticks = 30 * 20,
            eu = 1920,
            particles = 1000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.MachineMVAssembler.get(),
                AE2Items.FormationCore.get(amount = 2),
                AE2Items.AnnihilationCore.get(amount = 2),
                AE2Items.CalculationProcessor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Vanadium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.VanadiumSteel,
                    count = 4,
                ),
                AE2Items.QuartzGlass.get(amount = 12),
            ),
            output = AE2Items.MolecularAssembler.get(),
            ticks = 30 * 20,
            eu = 1920,
            particles = 800,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.MachineHVAssembler.get(),
                AE2Items.FormationCore.get(amount = 4),
                AE2Items.AnnihilationCore.get(amount = 4),
                AE2Items.CalculationProcessor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.HSSG,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.VanadiumSteel,
                    count = 8,
                ),
                AE2Items.QuartzGlass.get(amount = 24),
            ),
            output = AE2Items.MolecularAssembler.get(amount = 4),
            ticks = 60 * 20,
            eu = 7680,
            particles = 3200,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.MachineEVAssembler.get(),
                AE2Items.FormationCore.get(amount = 8),
                AE2Items.AnnihilationCore.get(amount = 8),
                AE2Items.CalculationProcessor.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.YttriumBariumCuprate,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.VanadiumSteel,
                    count = 16,
                ),
                AE2Items.QuartzGlass.get(amount = 36),
            ),
            output = AE2Items.MolecularAssembler.get(amount = 16),
            ticks = 120 * 20,
            eu = 30720,
            particles = 12800,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.MachineIVAssembler.get(),
                AE2Items.FormationCore.get(amount = 16),
                AE2Items.AnnihilationCore.get(amount = 16),
                AE2Items.CalculationProcessor.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Osmiridium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.VanadiumSteel,
                    count = 32,
                ),
                AE2Items.QuartzGlass.get(amount = 48),
            ),
            output = AE2Items.MolecularAssembler.get(amount = 64),
            ticks = 240 * 20,
            eu = 122880,
            particles = 57600,
        )
    }
}
