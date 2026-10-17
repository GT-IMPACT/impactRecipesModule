package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_OreDictUnificator

internal class ImpactComponentPressingRecipes {

    internal fun register() {
        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(GregTechItems.CircuitPartsCrystalChipMaster.get()),
            secondaryInput = ImpactItems.RedstonePulsatingChipset.get(),
            output = ImpactItems.PulsatingSpatialCoreChip.get(),
            ticks = 300,
            eu = 7680,
        )

        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(GregTechItems.CircuitPartsCrystalChipMaster.get()),
            secondaryInput = ImpactItems.RedstoneGoldChipset.get(),
            output = ImpactItems.GoldFluidCoreChip.get(),
            ticks = 300,
            eu = 1024,
        )

        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(GregTechItems.CircuitPartsCrystalChipMaster.get()),
            secondaryInput = ImpactItems.RedstoneDiamondChipset.get(),
            output = ImpactItems.DiamondFluidCoreChip.get(),
            ticks = 300,
            eu = 1920,
        )

        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(GregTechItems.CircuitPartsCrystalChipMaster.get()),
            secondaryInput = ImpactItems.RedstoneEmeraldChipset.get(),
            output = ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
            ticks = 300,
            eu = 4096,
        )

        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(ImpactItems.EngravedGoldChip.get()),
            secondaryInput = ImpactItems.RedstoneGoldChipset.get(),
            output = ImpactItems.GoldCoreChip.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(ImpactItems.EngravedDiamondCrystalChip.get()),
            secondaryInput = ImpactItems.RedstoneDiamondChipset.get(),
            output = ImpactItems.DiamondCoreChip.get(),
            ticks = 300,
            eu = 1920,
        )

        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(ImpactItems.EngravedEnergyChip.get()),
            secondaryInput = ImpactItems.RedstoneEmeraldChipset.get(),
            output = ImpactItems.EmeraldAdvancedCoreChip.get(),
            ticks = 300,
            eu = 4096,
        )

        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(ImpactItems.EngravedQuantumChip.get()),
            secondaryInput = ImpactItems.RedstoneEmeraldChipset.get(),
            output = ImpactItems.EmeraldHighAdvancedCoreChip.get(),
            ticks = 300,
            eu = 7680,
        )

        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(GregTechItems.CircuitPartsCrystalChipElite.get()),
            secondaryInput = ImpactItems.RedstonePulsatingChipset.get(),
            output = ImpactItems.GeneticCircuit.get(),
            ticks = 300,
            eu = 7680,
        )

        MachineRecipes.formingPress(
            input = GT_OreDictUnificator.get(GregTechItems.CircuitPartsCrystalChipElite.get()),
            secondaryInput = ImpactItems.RedstoneDiamondChipset.get(),
            output = ImpactItems.EnvironmentalCircuit.get(),
            ticks = 300,
            eu = 7680,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.EnderPearl,
                count = 1,
            ),
            secondaryInput = ImpactItems.RedstoneRedChipset.get(),
            output = ImpactItems.RedstonePulsatingChipset.get(amount = 2),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.NetherQuartz,
                count = 1,
            ),
            secondaryInput = ImpactItems.RedstoneRedChipset.get(),
            output = ImpactItems.RedstoneQuartzChipset.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 1,
            ),
            secondaryInput = ImpactItems.RedstoneRedChipset.get(),
            output = ImpactItems.RedstoneIronChipset.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Gold,
                count = 1,
            ),
            secondaryInput = ImpactItems.RedstoneRedChipset.get(),
            output = ImpactItems.RedstoneGoldChipset.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Diamond,
                count = 1,
            ),
            secondaryInput = ImpactItems.RedstoneRedChipset.get(),
            output = ImpactItems.RedstoneDiamondChipset.get(),
            ticks = 100,
            eu = 480,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Emerald,
                count = 1,
            ),
            secondaryInput = ImpactItems.RedstoneRedChipset.get(),
            output = ImpactItems.RedstoneEmeraldChipset.get(),
            ticks = 150,
            eu = 480,
        )

        MachineRecipes.formingPress(
            input = ImpactItems.CallistoIceDust.get(amount = 4),
            secondaryInput = GregTechItems.ShapeExtruderIngot.get(amount = 0),
            output = ImpactItems.CallistoIceIngot.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.MysteriousCrystal,
                count = 4,
            ),
            secondaryInput = GregTechItems.ShapeExtruderIngot.get(amount = 0),
            output = ImpactItems.MysteriousCrystalIngot.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Aluminium,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = ImpactItems.AluminiumIronPlate.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Titanium,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = ImpactItems.TitaniumIronPlate.get(),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Tungsten,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = ImpactItems.TungstenIronPlate.get(),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.TungstenSteel,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = ImpactItems.TungstenSteelIronPlate.get(),
            ticks = 600,
            eu = 7680,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Chrome,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = ImpactItems.ChromeIronPlate.get(),
            ticks = 600,
            eu = 30720,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iridium,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = ImpactItems.IridiumIronPlate.get(),
            ticks = 600,
            eu = 122880,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Naquadria,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = ImpactItems.NaquadriaIronPlate.get(),
            ticks = 600,
            eu = 500000,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Neutronium,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = ImpactItems.NeutroniumIronPlate.get(),
            ticks = 600,
            eu = 2000000,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.Rubber,
                count = 4,
            ),
            secondaryInput = GregTechItems.ShapeMoldPlate.get(amount = 0),
            output = VanillaItems.Leather.get(),
            ticks = 800,
            eu = 16,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.StyreneButadieneRubber,
                count = 4,
            ),
            secondaryInput = GregTechItems.ShapeMoldPlate.get(amount = 0),
            output = VanillaItems.Leather.get(),
            ticks = 800,
            eu = 16,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.Silicone,
                count = 4,
            ),
            secondaryInput = GregTechItems.ShapeMoldPlate.get(amount = 0),
            output = VanillaItems.Leather.get(),
            ticks = 800,
            eu = 16,
        )

        MachineRecipes.formingPress(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Plastic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Graphite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Copper,
                    count = 1,
                ),
            ),
            output = ImpactItems.RTRMFoil.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.formingPress(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Polytetrafluoroethylene,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Graphite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Copper,
                    count = 4,
                ),
            ),
            output = ImpactItems.RTRMFoil.get(amount = 4),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.formingPress(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Polybenzimidazole,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Graphite,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Copper,
                    count = 16,
                ),
            ),
            output = ImpactItems.RTRMFoil.get(amount = 16),
            ticks = 800,
            eu = 480,
        )
    }
}
