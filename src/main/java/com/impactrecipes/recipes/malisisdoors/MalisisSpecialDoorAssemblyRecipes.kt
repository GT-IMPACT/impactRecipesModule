package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class MalisisSpecialDoorAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.WoodenDoor.get(),
            secondaryInput = VanillaItems.GlassPane.get(),
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorAcacia.get(),
            secondaryInput = VanillaItems.GlassPane.get(),
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorBirch.get(),
            secondaryInput = VanillaItems.GlassPane.get(),
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorDarkOak.get(),
            secondaryInput = VanillaItems.GlassPane.get(),
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorJungle.get(),
            secondaryInput = VanillaItems.GlassPane.get(),
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorSpruce.get(),
            secondaryInput = VanillaItems.GlassPane.get(),
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.IronDoor.get(),
            secondaryInput = VanillaItems.GlassPane.get(),
            output = MalisisDoorsItems.ItemIronSlidingDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.IronDoor.get(),
            secondaryInput = ImpactItems.SteelBars.get(amount = 2),
            output = MalisisDoorsItems.ItemJailDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.WoodenDoor.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Steel,
                count = 2,
            ),
            output = MalisisDoorsItems.ItemLaboratoryDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorAcacia.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Steel,
                count = 2,
            ),
            output = MalisisDoorsItems.ItemLaboratoryDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorBirch.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Steel,
                count = 2,
            ),
            output = MalisisDoorsItems.ItemLaboratoryDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorDarkOak.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Steel,
                count = 2,
            ),
            output = MalisisDoorsItems.ItemLaboratoryDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorJungle.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Steel,
                count = 2,
            ),
            output = MalisisDoorsItems.ItemLaboratoryDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.ItemDoorSpruce.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Steel,
                count = 2,
            ),
            output = MalisisDoorsItems.ItemLaboratoryDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.IronDoor.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 2,
            ),
            output = MalisisDoorsItems.ItemFactoryDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Paper.get(amount = 2),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Wood,
                count = 2,
            ),
            output = MalisisDoorsItems.ItemShojiDoor.get(),
            ticks = 400,
            eu = 4,
        )
    }
}
