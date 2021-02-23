package com.impactrecipes.core;

/**
 * Класс для регистрации модов, чтобы делать удобную
 * интеграцию и каждый раз не писать текстовый вид
 *
 * If (Loader.isModLoaded("gregtech")) {} - не удобно!
 *
 * If (Loader.isModLoaded(GREGTECH)) {} - удобно!
 */
public class Reference {
    //Писать капсом все поля!
    public final static String GREGTECH = "gregtech";
    public final static String GALACTICRAFTCORE = "GalacticraftCore";
    public final static String GALACTICRAFTPLANETS = "GalacticraftMars";
    public final static String GALAXYSPACE = "GalaxySpace";
    public final static String AE2 = "appliedenergistics2";
    public final static String EC2 = "extracells";
}
