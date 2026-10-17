package com.impactrecipes.recipes.gendustry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.GendustryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GendustryPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                GendustryItems.GeneticsProcessor.get(amount = 2),
                GendustryItems.BeeReceptacle.get(amount = 2),
                GendustryItems.PowerModule.get(amount = 2),
                GregTechItems.RobotArmLuV.get(amount = 2),
                GregTechItems.ElectricPumpLuV.get(amount = 4),
                GendustryItems.MutagenTank.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Trinium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Osmium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSS,
                    count = 32,
                ),
            ),
            output = GendustryItems.MutagenProducer.get(),
            fluidInputs = null,
            ticks = 100 * 20,
            eu = 65576,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                GendustryItems.GeneticsProcessor.get(amount = 2),
                GendustryItems.BeeReceptacle.get(amount = 2),
                GendustryItems.PowerModule.get(amount = 2),
                GregTechItems.RobotArmLuV.get(amount = 2),
                GendustryItems.MutagenTank.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Osmium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Naquadah,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSS,
                    count = 32,
                ),
            ),
            output = GendustryItems.Mutatron.get(),
            fluidInputs = null,
            ticks = 100 * 20,
            eu = 65576,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                GendustryItems.GeneticsProcessor.get(amount = 4),
                GendustryItems.BeeReceptacle.get(amount = 4),
                GendustryItems.PowerModule.get(amount = 4),
                GregTechItems.RobotArmZPM.get(amount = 4),
                GendustryItems.MutagenTank.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.NaquadahAlloy,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MysteriousCrystal,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSS,
                    count = 64,
                ),
            ),
            output = GendustryItems.MutatronAdv.get(),
            fluidInputs = null,
            ticks = 200 * 20,
            eu = 500000,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                ForestryItems.Apiculture.get(),
                ForestryItems.Alveary2.get(amount = 2),
                ForestryItems.Alveary3.get(amount = 2),
                ForestryItems.Alveary4.get(amount = 2),
                ForestryItems.Alveary5.get(amount = 2),
                ForestryItems.Alveary6.get(amount = 2),
                ForestryItems.Alveary7.get(amount = 2),
                ForestryItems.Alveary.get(amount = 4),
                GregTechItems.FieldGeneratorHV.get(amount = 4),
            ),
            output = GendustryItems.IndustrialApiary.get(),
            fluidInputs = null,
            ticks = 60 * 20,
            eu = 1024,
        )
    }
}
