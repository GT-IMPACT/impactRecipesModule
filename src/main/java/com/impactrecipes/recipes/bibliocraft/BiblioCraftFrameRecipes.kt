package com.impactrecipes.recipes.bibliocraft

import com.impactrecipes.items.BiblioCraftItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class BiblioCraftFrameRecipes {

    internal fun register() {
        MachineRecipes.cutter(
            input = GregTechItems.PlankOak.get(),
            output = BiblioCraftItems.FramingSheet.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 4,
        )

        MachineRecipes.cutter(
            input = GregTechItems.PlankSpruce.get(),
            output = BiblioCraftItems.FramingSheet.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 4,
        )

        MachineRecipes.cutter(
            input = GregTechItems.PlankBirch.get(),
            output = BiblioCraftItems.FramingSheet.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 4,
        )

        MachineRecipes.cutter(
            input = GregTechItems.PlankJungle.get(),
            output = BiblioCraftItems.FramingSheet.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 4,
        )

        MachineRecipes.cutter(
            input = GregTechItems.PlankAcacia.get(),
            output = BiblioCraftItems.FramingSheet.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 4,
        )

        MachineRecipes.cutter(
            input = GregTechItems.PlankDarkOak.get(),
            output = BiblioCraftItems.FramingSheet.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 4,
        )

        MachineRecipes.cutter(
            input = BiblioCraftItems.FramingSheet.get(),
            output = BiblioCraftItems.FramingBoard.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 4,
        )
    }
}
