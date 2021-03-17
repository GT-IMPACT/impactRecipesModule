package com.impactrecipes.recipes;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.util.GT_ModHandler;

public class BiblioCraft implements Runnable {


    @Override
    public void run() {
        cuttingSaw();
    }

    private void cuttingSaw() {
        // --- Frame Sheet
        GT_Values.RA.addCutterRecipe(ItemList.Plank_Oak.get(1L),
                GT_ModHandler.getModItem("BiblioCraft", "item.FramingSheet", 4L, 0), GT_Values.NI, 50, 4);
        GT_Values.RA.addCutterRecipe(ItemList.Plank_Spruce.get(1L),
                GT_ModHandler.getModItem("BiblioCraft", "item.FramingSheet", 4L, 0), GT_Values.NI, 50, 4);
        GT_Values.RA.addCutterRecipe(ItemList.Plank_Birch.get(1L),
                GT_ModHandler.getModItem("BiblioCraft", "item.FramingSheet", 4L, 0), GT_Values.NI, 50, 4);
        GT_Values.RA.addCutterRecipe(ItemList.Plank_Jungle.get(1L),
                GT_ModHandler.getModItem("BiblioCraft", "item.FramingSheet", 4L, 0), GT_Values.NI, 50, 4);
        GT_Values.RA.addCutterRecipe(ItemList.Plank_Acacia.get(1L),
                GT_ModHandler.getModItem("BiblioCraft", "item.FramingSheet", 4L, 0), GT_Values.NI, 50, 4);
        GT_Values.RA.addCutterRecipe(ItemList.Plank_DarkOak.get(1L),
                GT_ModHandler.getModItem("BiblioCraft", "item.FramingSheet", 4L, 0), GT_Values.NI, 50, 4);
        // --- Frame Board
        GT_Values.RA
                .addCutterRecipe(GT_ModHandler.getModItem("BiblioCraft", "item.FramingSheet", 1L, 0),
                        GT_ModHandler.getModItem("BiblioCraft", "item.FramingBoard", 4L, 0), GT_Values.NI, 50, 4);
    }
}
