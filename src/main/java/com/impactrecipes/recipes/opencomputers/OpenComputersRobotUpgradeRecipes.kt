package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersRobotUpgradeRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                OpenComputersItems.ControlUnitCU.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.ComponentBusTier1.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.ControlUnitCU.get(amount = 2),
                OpenComputersItems.MemoryTier2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.ComponentBusTier2.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                OpenComputersItems.ControlUnitCU.get(amount = 4),
                OpenComputersItems.MemoryTier3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Diamond,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.ComponentBusTier3.get(),
            ticks = 250,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                OpenComputersItems.HardDiskDriveTier14MB.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.DatabaseUpgradeTier1.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Birmabright,
                    count = 1,
                ),
                OpenComputersItems.HardDiskDriveTier28MB.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.DatabaseUpgradeTier2.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                OpenComputersItems.HardDiskDriveTier316MB.get(),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.DatabaseUpgradeTier3.get(),
            ticks = 250,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                OpenComputersItems.Analyzer.get(),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Emerald,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.ExperienceUpgrade.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLV.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                GregTechItems.CoverCrafting.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.CraftingUpgrade.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.GeneratorDieselLV.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.GeneratorUpgrade.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.ControlUnitCU.get(),
                VanillaItems.Lead.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.LeashUpgrade.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.LinkedCard.get(amount = 2),
                OpenComputersItems.Chamelium.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lapis,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.MFU.get(),
            ticks = 250,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullMV.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                VanillaItems.Compass.get(),
                VanillaItems.FilledMap.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cell,
                    material = Materials.Water,
                    count = 1,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.NavigationUpgrade.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.ElectricPistonMV.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.PistonUpgrade.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                GregTechItems.DyeSquidInk.get(),
                VanillaItems.Sign.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.SignIOUpgrade.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                GregTechItems.CoverSolarPanel8V.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Titanium,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.SolarGeneratorUpgrade.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Capacitor.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier3.get(),
                GregTechItems.ElectricPistonHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.IronMagnetic,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Copper,
                    count = 16,
                ),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.TractorBeamUpgrade.get(),
            ticks = 250,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 3,
                ),
                GregTechItems.ElectricPistonMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Emerald,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.TradingUpgrade.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Capacitor.get(),
                OpenComputersItems.DroneCaseTier1.get(),
                OpenComputersItems.HoverUpgradeTier2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                GregTechItems.ElectricPistonMV.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = ModItemVariant(
                item = OpenComputersItems.HoverBoots,
                meta = GT_Values.W.toInt(),
            ).get(),
            ticks = 350,
            eu = 250,
        )
    }
}
