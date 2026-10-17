package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ChiselLaboratorySmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glass,
                count = 1,
            ),
            output = ChiselItems.Holystone.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glass,
                count = 1,
            ),
            output = ChiselItems.Holystone.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = ImpactItems.ClearGlassDust.get(),
            output = ChiselItems.Holystone.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = ImpactItems.ClearGlassDust.get(),
            output = ChiselItems.Holystone.get(amount = 64),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.CertusQuartz,
                count = 1,
            ),
            output = ChiselItems.Laboratoryblock.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.NetherQuartz,
                count = 1,
            ),
            output = ChiselItems.Laboratoryblock.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Quartzite,
                count = 1,
            ),
            output = ChiselItems.Laboratoryblock.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.CertusQuartz,
                count = 1,
            ),
            output = ChiselItems.Laboratoryblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.NetherQuartz,
                count = 1,
            ),
            output = ChiselItems.Laboratoryblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Quartzite,
                count = 1,
            ),
            output = ChiselItems.Laboratoryblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Stone.get(amount = 8),
            secondaryInput = ImpactItems.ChargedQuartzDust.get(),
            output = ChiselItems.Laboratoryblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.alloySmelter(
            input = GregTechItems.LightConcrete.get(amount = 8),
            secondaryInput = ImpactItems.ChargedQuartzDust.get(),
            output = ChiselItems.Laboratoryblock.get(amount = 64),
            ticks = 100,
            eu = 8,
        )
    }
}
