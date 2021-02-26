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
    public final static String CHISEL = "chisel";
    public final static String BUILDCRAFT = "BuildCraft|Core";
    public final static String ENDERIO = "EnderIO";
    public final static String JABBA = "JABBA";
    public final static String OC = "OpenComputers";
    public final static String RAILCRAFT = "Railcraft";
    public final static String SFM = "StevesFactoryManager";
    public final static String SD = "StorageDrawers";
    public final static String TICO = "TConstruct";
    public final static String TECTECH = "tectech";
    public final static String PROJECTRED = "ProjRed|Core";
    public final static String OPENBLOCKS = "OpenBlocks";
}
