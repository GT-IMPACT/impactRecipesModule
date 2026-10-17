package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes

internal class MalisisCurtainAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.Carpet10.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainPurple.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet4.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainYellow.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet2.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainMagenta.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet6.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainPink.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainWhite.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet11.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainBlue.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet9.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainCyan.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet14.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainRed.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet7.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainGray.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet12.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainBrown.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet5.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainLime.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet1.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainOrange.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet8.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainSilver.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet13.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainGreen.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet3.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainLightBlue.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Carpet15.get(amount = 3),
            secondaryInput = VanillaItems.String.get(),
            output = MalisisDoorsItems.ItemCurtainBlack.get(),
            ticks = 400,
            eu = 4,
        )
    }
}
