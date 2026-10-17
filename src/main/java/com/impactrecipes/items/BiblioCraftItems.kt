package com.impactrecipes.items

public enum class BiblioCraftItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    Chase(
        registryName = "item.BiblioChase",
        meta = 0,
    ),
    FramingSaw(
        registryName = "item.FramingSaw",
        meta = 0,
    ),
    FramingSheet(
        registryName = "item.FramingSheet",
        meta = 0,
    ),
    FramingBoard(
        registryName = "item.FramingBoard",
        meta = 0,
    ),
    MapTool(
        registryName = "item.BiblioMapTool",
        meta = 0,
    ),
    WayPointCompass(
        registryName = "item.BiblioWayPointCompass",
        meta = 0,
    ),
    Glasses(
        registryName = "item.BiblioGlasses",
        meta = 0,
    ),
    Glasses2(
        registryName = "item.BiblioGlasses",
        meta = 2,
    ),
    PlumbLine(
        registryName = "item.PlumbLine",
        meta = 0,
    ),
    HandDrill(
        registryName = "item.HandDrill",
        meta = 0,
    ),
    Drill(
        registryName = "item.BiblioDrill",
        meta = 0,
    ),
    Tape(
        registryName = "item.tape",
        meta = 0,
    ),
    TapeMeasure(
        registryName = "item.tapeMeasure",
        meta = 0,
    ),
    Clipboard(
        registryName = "item.BiblioClipboard",
        meta = 0,
    ),
    SlottedBook(
        registryName = "item.SlottedBook",
        meta = 0,
    ),
    AtlasBook(
        registryName = "item.AtlasBook",
        meta = 0,
    ),
    TesterItem(
        registryName = "item.TesterItem",
        meta = 0,
    ),

    // Blocks

    PrintingPress(
        registryName = "Printing Press",
        meta = 0,
    ),
    TypesettingMachine(
        registryName = "Typesetting Machine",
        meta = 0,
    ),
    FramedChest(
        registryName = "tile.BiblioFramedChest",
        meta = 0,
    ),
    PaintPressBlock(
        registryName = "BiblioPaintPress",
        meta = 0,
    ),
    Lantern(
        registryName = "BiblioLantern",
        meta = 0,
    ),
    IronLantern(
        registryName = "BiblioIronLantern",
        meta = 0,
    ),
    Lamp(
        registryName = "BiblioLamp",
        meta = 0,
    ),
    IronLamp(
        registryName = "BiblioIronLamp",
        meta = 0,
    ),
    ArmorStand(
        registryName = "Armor Stand",
        meta = 0,
    ),
    Bell(
        registryName = "BiblioBell",
        meta = 0,
    ),
    Stuffs(
        registryName = "BiblioStuffs",
        meta = 0,
    ),
    Stuffs2(
        registryName = "BiblioStuffs",
        meta = 2,
    ),
    Clock(
        registryName = "BiblioClock",
        meta = 0,
    ),
    Label6(
        registryName = "BiblioLabel",
        meta = 6,
    ),
    Paneler(
        registryName = "BiblioPaneler",
        meta = 0,
    ),
    Paneler1(
        registryName = "BiblioPaneler",
        meta = 1,
    ),
    Paneler2(
        registryName = "BiblioPaneler",
        meta = 2,
    ),
    Paneler3(
        registryName = "BiblioPaneler",
        meta = 3,
    ),
    Paneler4(
        registryName = "BiblioPaneler",
        meta = 4,
    ),
    Paneler5(
        registryName = "BiblioPaneler",
        meta = 5,
    ),
    Paneler6(
        registryName = "BiblioPaneler",
        meta = 6,
    ),
    Clock6(
        registryName = "BiblioClock",
        meta = 6,
    );

    public override val modId: String = "BiblioCraft"
}
