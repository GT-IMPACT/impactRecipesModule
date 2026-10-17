package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftRailExtrusionRecipes {

    internal fun register() {
        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Aluminium,
                count = 3,
            ),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailStandard.get(amount = 2),
            ticks = 100,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Iron,
                count = 3,
            ),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailStandard.get(amount = 4),
            ticks = 120,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.WroughtIron,
                count = 3,
            ),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailStandard.get(amount = 5),
            ticks = 130,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Bronze,
                count = 3,
            ),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailStandard.get(amount = 3),
            ticks = 110,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Steel,
                count = 3,
            ),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailStandard.get(amount = 8),
            ticks = 160,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.StainlessSteel,
                count = 3,
            ),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailStandard.get(amount = 12),
            ticks = 200,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Titanium,
                count = 3,
            ),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailStandard.get(amount = 16),
            ticks = 240,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.TungstenSteel,
                count = 3,
            ),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailStandard.get(amount = 20),
            ticks = 280,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Iridium,
                count = 3,
            ),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailStandard.get(amount = 24),
            ticks = 320,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = ImpactItems.AdvancedMixIngot.get(amount = 3),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailAdvanced.get(amount = 6),
            ticks = 100,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = ImpactItems.ElectricMixIngot.get(amount = 3),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailElectric.get(amount = 6),
            ticks = 100,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = ImpactItems.ReinforcedMixIngot.get(amount = 3),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailReinforced.get(amount = 6),
            ticks = 100,
            eu = 24,
        )

        MachineRecipes.extruder(
            input = ImpactItems.HSMixIngot.get(amount = 3),
            mold = ImpactItems.ExtruderShapeRail.get(amount = 0),
            output = RailcraftItems.RailSpeed.get(amount = 6),
            ticks = 100,
            eu = 24,
        )
    }
}
