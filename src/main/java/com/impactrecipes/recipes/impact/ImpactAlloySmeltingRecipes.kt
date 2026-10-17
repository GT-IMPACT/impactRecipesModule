package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes

internal class ImpactAlloySmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = VanillaItems.ClayBall.get(amount = 3),
            secondaryInput = VanillaItems.Sand.get(amount = 5),
            output = ImpactItems.CokeOvenBrick.get(amount = 3),
            ticks = 130,
            eu = 3,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.ClayBall.get(),
            secondaryInput = GregTechItems.ShapeMoldIngot.get(amount = 0),
            output = VanillaItems.Brick.get(),
            ticks = 130,
            eu = 3,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.ClayBall.get(amount = 3),
            secondaryInput = VanillaItems.Sand.get(amount = 5),
            output = ImpactItems.CokeOvenBrick.get(amount = 3),
            ticks = 390,
            eu = 3,
        )

        MachineRecipes.alloySmelter(
            input = IC2Items.IridiumPlate.get(amount = 2),
            secondaryInput = GregTechItems.ShapeMoldCasing.get(amount = 0),
            output = ImpactItems.IridiumAlloyItemCasing.get(amount = 3),
            ticks = 1200,
            eu = 250,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.ClayBall.get(),
            secondaryInput = GregTechItems.ShapeMoldIngot.get(amount = 0),
            output = VanillaItems.Brick.get(),
            ticks = 130,
            eu = 3,
        )

        MachineRecipes.alloySmelter(
            input = ImpactItems.ClearGlassDust.get(),
            secondaryInput = GregTechItems.ShapeMoldBall.get(amount = 0),
            output = GregTechItems.CircuitPartsGlassTube.get(),
            ticks = 120,
            eu = 16,
        )
    }
}
