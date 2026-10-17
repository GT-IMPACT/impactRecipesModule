package com.impactrecipes.recipes.impact

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactUpgradeCasingPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                AE2Items.Item64kCraftingStorage.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.GumMetal,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Nitinol,
                    count = 16,
                ),
                GregTechItems.ElectricMotorIV.get(amount = 4),
                GregTechItems.ElectricPistonIV.get(amount = 4),
                GregTechItems.ConveyorModuleIV.get(amount = 4),
                GregTechItems.RobotArmIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Graphene,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.TungstenSteel,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            output = ImpactItems.UpgradeCasingT1.get(),
            fluidInputs = null,
            ticks = 80 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                AE2Items.Item256kCraftingStorage.get(),
                ImpactItems.UpgradeCasingT1.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HastelloyN,
                    count = 16,
                ),
                GregTechItems.ElectricMotorLuV.get(amount = 4),
                GregTechItems.ElectricPistonLuV.get(amount = 4),
                GregTechItems.ConveyorModuleLuV.get(amount = 4),
                GregTechItems.RobotArmLuV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.YttriumBariumCuprate,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Chrome,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 32,
                ),
            ),
            output = ImpactItems.UpgradeCasingT2.get(),
            fluidInputs = null,
            ticks = 120 * 20,
            eu = 30720,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                AE2Items.Item256kCraftingStorage.get(),
                ImpactItems.UpgradeCasingT1.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HastelloyN,
                    count = 16,
                ),
                GregTechItems.ElectricMotorUV.get(),
                GregTechItems.ElectricPistonUV.get(),
                GregTechItems.ConveyorModuleUV.get(),
                GregTechItems.RobotArmUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorUV,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Chrome,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 32,
                ),
            ),
            output = ImpactItems.UpgradeCasingT2.get(),
            fluidInputs = null,
            ticks = 90 * 20,
            eu = 2000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                AE2Items.Item1024kCraftingStorage.get(),
                ImpactItems.UpgradeCasingT2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Lafium,
                    count = 16,
                ),
                GregTechItems.ElectricMotorZPM.get(amount = 4),
                GregTechItems.ElectricPistonZPM.get(amount = 4),
                GregTechItems.ConveyorModuleZPM.get(amount = 4),
                GregTechItems.RobotArmZPM.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Naquadah,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Iridium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 48,
                ),
            ),
            output = ImpactItems.UpgradeCasingT3.get(),
            fluidInputs = null,
            ticks = 160 * 20,
            eu = 122880,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                AE2Items.Item1024kCraftingStorage.get(),
                ImpactItems.UpgradeCasingT2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Lafium,
                    count = 16,
                ),
                GregTechItems.ElectricMotorUHV.get(),
                GregTechItems.ElectricPistonUHV.get(),
                GregTechItems.ConveyorModuleUHV.get(),
                GregTechItems.RobotArmUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Superconductor,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Iridium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 48,
                ),
            ),
            output = ImpactItems.UpgradeCasingT3.get(),
            fluidInputs = null,
            ticks = 120 * 20,
            eu = 8000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                AE2Items.Item4096kCraftingStorage.get(),
                ImpactItems.UpgradeCasingT3.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.CinobiteA243,
                    count = 16,
                ),
                GregTechItems.ElectricMotorUV.get(amount = 4),
                GregTechItems.ElectricPistonUV.get(amount = 4),
                GregTechItems.ConveyorModuleUV.get(amount = 4),
                GregTechItems.RobotArmUV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.NaquadahAlloy,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Osmium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 64,
                ),
            ),
            output = ImpactItems.UpgradeCasingT4.get(),
            fluidInputs = null,
            ticks = 200 * 20,
            eu = 500000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                AE2Items.Item4096kCraftingStorage.get(),
                ImpactItems.UpgradeCasingT3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.CinobiteA243,
                    count = 16,
                ),
                GregTechItems.ElectricMotorUEV.get(),
                GregTechItems.ElectricPistonUEV.get(),
                GregTechItems.ConveyorModuleUEV.get(),
                GregTechItems.RobotArmUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Nano,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorUEV,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Osmium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 64,
                ),
            ),
            output = ImpactItems.UpgradeCasingT4.get(),
            fluidInputs = null,
            ticks = 150 * 20,
            eu = 32000000,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                AE2Items.MEProcessingPatternTerminal.get(),
                GregTechItems.CoverItemDetector.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nitinol,
                    count = 8,
                ),
                GregTechItems.RobotArmIV.get(amount = 8),
                ImpactItems.DDDPrinterCasing3x3.get(amount = 9),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.TungstenSteel,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.GumMetal,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 64,
                ),
            ),
            output = ImpactItems.DDDPrinterCasing4x4.get(amount = 16),
            fluidInputs = null,
            ticks = 200 * 20,
            eu = 1920,
        )
    }
}
