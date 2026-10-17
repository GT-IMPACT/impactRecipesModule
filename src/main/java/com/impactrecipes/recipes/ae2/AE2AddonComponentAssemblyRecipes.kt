package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.AE2WirelessCraftingTerminalItems
import com.impactrecipes.items.ExtraCellsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class AE2AddonComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NeodymiumMagnetic,
                    count = 2,
                ),
                AE2Items.AdvancedCard.get(),
                AE2Items.EngineeringProcessor.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HastelloyN,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Inconel792,
                    count = 24,
                ),
            ),
            fluid = null,
            output = AE2WirelessCraftingTerminalItems.MagnetCard.get(),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.WirelessBooster.get(amount = 64),
                GregTechItems.FieldGeneratorUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CinobiteA243,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Quantium,
                    count = 24,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Osmium,
                    count = 64,
                ),
            ),
            fluid = null,
            output = AE2WirelessCraftingTerminalItems.InfinityBoosterCard.get(),
            ticks = 4000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.FluidStorageHousing.get(),
            secondaryInput = VanillaItems.Bucket.get(),
            output = ExtraCellsItems.PatternFluid.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2Items.LevelEmitter.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Lapis,
                count = 1,
            ),
            output = AE2FCItems.PartFluidLevelEmitter.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEAnnihilationPlane.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Lapis,
                count = 3,
            ),
            output = ExtraCellsItems.PartBase5.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEFormationPlane.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Lapis,
                count = 3,
            ),
            output = ExtraCellsItems.PartBase6.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEDrive.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.StainlessSteel,
                count = 1,
            ),
            output = ExtraCellsItems.PartBase7.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2Items.EnergyCell.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.StainlessSteel,
                count = 1,
            ),
            output = ExtraCellsItems.PartBase8.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.GlassPane.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CertusQuartz,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.VanadiumSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Quartzite,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2Items.MEStorageHousing.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.MEStorageHousing.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.ReinforcedGlass,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Iridium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2Items.MEAdvancedStorageHousing.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.GlassPane.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CertusQuartz,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.RedSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.NetherQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2FCItems.FluidStorageHousing.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2FCItems.FluidStorageHousing.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.ReinforcedGlass,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Stellite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2FCItems.MEAdvancedFluidStorageHousing.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.GlassPane.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CertusQuartz,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Birmabright,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.NetherQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2FCItems.MEMultiFluidStorageHousing.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2FCItems.MEMultiFluidStorageHousing.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.ReinforcedGlass,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Grisium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2FCItems.MEAdvancedMultiFluidStorageHousing.get(),
            ticks = 200,
            eu = 96,
        )
    }
}
