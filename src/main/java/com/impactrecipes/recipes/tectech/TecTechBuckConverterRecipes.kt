package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.TecTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class TecTechBuckConverterRecipes {

    internal fun register() {
        registerConverter(
            transformer = GregTechItems.TransformerLuVIV,
            converter = TecTechItems.BuckConverterIV,
            circuit = Materials.Elite,
            plate = Materials.HastelloyC276,
            wire = Materials.TungstenSteel,
            bolt = Materials.TungstenSteel,
            eu = 7_680,
        )
        registerConverter(
            transformer = GregTechItems.TransformerZPMLuV,
            converter = TecTechItems.BuckConverterLuV,
            circuit = Materials.Master,
            plate = Materials.HastelloyN,
            wire = Materials.NiobiumTitanium,
            bolt = Materials.Chrome,
            eu = 30_720,
        )
        registerConverter(
            transformer = GregTechItems.TransformerUVZPM,
            converter = TecTechItems.BuckConverterZPM,
            circuit = Materials.Ultimate,
            plate = Materials.Lafium,
            wire = Materials.Naquadah,
            bolt = Materials.Iridium,
            eu = 122_880,
        )
        registerConverter(
            transformer = GregTechItems.TransformerMAXUV,
            converter = TecTechItems.BuckConverterUV,
            circuit = Materials.Superconductor,
            plate = Materials.CinobiteA243,
            wire = Materials.NaquadahAlloy,
            bolt = Materials.Osmium,
            eu = 500_000,
        )
        registerConverter(
            transformer = GregTechItems.TransformerUEVUHV,
            converter = TecTechItems.BuckConverterUHV,
            circuit = Materials.Infinite,
            plate = Materials.Pikyonium64B,
            wire = Materials.Europium,
            bolt = Materials.Neutronium,
            eu = 2_000_000,
        )
        registerConverter(
            transformer = GregTechItems.TransformerUIVUEV,
            converter = TecTechItems.BuckConverterUEV,
            circuit = Materials.Bio,
            plate = Materials.Phoenixite,
            wire = Materials.Diamericiumtitanium,
            bolt = Materials.Phoenixite,
            eu = 8_000_000,
        )
    }

    private fun registerConverter(
        transformer: GregTechItems,
        converter: TecTechItems,
        circuit: Materials,
        plate: Materials,
        wire: Materials,
        bolt: Materials,
        eu: Int,
    ) {
        MachineRecipes.assembler(
            inputs = arrayOf(
                transformer.get(),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = circuit,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = plate,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = wire,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = bolt,
                    count = 16,
                ),
            ),
            fluid = null,
            output = converter.get(),
            ticks = 100,
            eu = eu,
        )
    }
}
