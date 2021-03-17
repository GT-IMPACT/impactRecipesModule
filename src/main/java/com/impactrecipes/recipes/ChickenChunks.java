package com.impactrecipes.recipes;

import gregtech.api.enums.GT_Values;
import gregtech.api.util.GT_ModHandler;

public class ChickenChunks implements Runnable {

    @Override
    public void run() {
        GT_Values.RA.addCutterRecipe(GT_ModHandler.getModItem("ChickenChunks", "chickenChunkLoader", 1L, 0),
                GT_ModHandler.getModItem("ChickenChunks", "chickenChunkLoader", 9L, 1), GT_Values.NI, 50, 8);
    }
}
