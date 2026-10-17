package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes

internal class ImpactComponentExtrusionRecipes {

    internal fun register() {
        MachineRecipes.extruder(
            input = ImpactItems.CallistoIceColdIngot.get(),
            mold = GregTechItems.ShapeExtruderPlate.get(amount = 0),
            output = ImpactItems.CallistoIcePlate.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.extruder(
            input = ImpactItems.LedoxColdIngot.get(),
            mold = GregTechItems.ShapeExtruderPlate.get(amount = 0),
            output = ImpactItems.LedoxColdPlate.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.extruder(
            input = ImpactItems.MysteriousCrystalColdIngot.get(),
            mold = GregTechItems.ShapeExtruderPlate.get(amount = 0),
            output = ImpactItems.MysteriousCrystalColdPlate.get(),
            ticks = 300,
            eu = 480,
        )
    }
}
