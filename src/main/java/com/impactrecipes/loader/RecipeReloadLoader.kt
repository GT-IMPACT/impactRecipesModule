package com.impactrecipes.loader

/** GregTech's /rr command instantiates a no-argument Runnable for each selected loader. */
public class RecipeReloadLoader : Runnable {

    public override fun run() {
        ModsLoader.loader()
    }
}
