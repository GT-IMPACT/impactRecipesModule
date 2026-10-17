package com.impactrecipes.recipes.gravisuite

import com.impactrecipes.items.GraviSuiteItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GraviSuiteArmorPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ModItemVariant(
                    item = IC2Items.QuantumChestplate,
                    meta = GT_Values.W.toInt(),
                ).get(),
                GregTechItems.TransformerZPMLuV.get(),
                ModItemVariant(
                    item = GraviSuiteItems.UltimateLappack,
                    meta = GT_Values.W.toInt(),
                ).get(),
                GraviSuiteItems.Superconductor.get(amount = 6),
                GraviSuiteItems.CoolingCore.get(amount = 2),
                GraviSuiteItems.GravitationEngine.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Duranium,
                    count = 2,
                ),
                GregTechItems.EnergyLapotronicOrb2.get(),
                GregTechItems.FieldGeneratorIV.get(amount = 2),
                GregTechItems.ElectricMotorZPM.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Duranium,
                    count = 4,
                ),
            ),
            output = GraviSuiteItems.GraviChestPlate27.get(),
            fluidInputs = null,
            ticks = 50 * 20,
            eu = 30720,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ModItemVariant(
                    item = GraviSuiteItems.GraviChestPlate,
                    meta = GT_Values.W.toInt(),
                ).get(),
                GregTechItems.TransformerUVZPM.get(),
                ModItemVariant(
                    item = GraviSuiteItems.EpicLappack,
                    meta = GT_Values.W.toInt(),
                ).get(),
                GraviSuiteItems.Superconductor.get(amount = 8),
                ImpactItems.AdvancedCoolingCore.get(amount = 4),
                GraviSuiteItems.AdvancedGravitationEngine.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Tritanium,
                    count = 2,
                ),
                GregTechItems.EnergyModule.get(),
                GregTechItems.FieldGeneratorLuV.get(amount = 2),
                GregTechItems.ElectricMotorUV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Tritanium,
                    count = 8,
                ),
            ),
            output = GraviSuiteItems.KpChestPlate27.get(),
            fluidInputs = null,
            ticks = 60 * 20,
            eu = 122880,
        )
    }
}
