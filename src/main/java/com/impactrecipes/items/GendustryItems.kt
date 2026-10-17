package com.impactrecipes.items

public enum class GendustryItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    Labware(
        registryName = "Labware",
        meta = 0,
    ),
    BeeReceptacle(
        registryName = "BeeReceptacle",
        meta = 0,
    ),
    PowerModule(
        registryName = "PowerModule",
        meta = 0,
    ),
    MutagenTank(
        registryName = "MutagenTank",
        meta = 0,
    ),
    GeneticsProcessor(
        registryName = "GeneticsProcessor",
        meta = 0,
    ),
    EnvProcessor(
        registryName = "EnvProcessor",
        meta = 0,
    ),
    UpgradeFrame(
        registryName = "UpgradeFrame",
        meta = 0,
    ),
    ClimateModule(
        registryName = "ClimateModule",
        meta = 0,
    ),
    ApiaryUpgrade(
        registryName = "ApiaryUpgrade",
        meta = 0,
    ),
    IndustrialGrafter(
        registryName = "IndustrialGrafter",
        meta = 0,
    ),
    IndustrialScoop(
        registryName = "IndustrialScoop",
        meta = 0,
    ),
    EjectCover(
        registryName = "EjectCover",
        meta = 0,
    ),
    ImportCover(
        registryName = "ImportCover",
        meta = 0,
    ),
    ErrorSensorCover(
        registryName = "ErrorSensorCover",
        meta = 0,
    ),
    ApiaryUpgrade17(
        registryName = "ApiaryUpgrade",
        meta = 17,
    ),
    ApiaryUpgrade11(
        registryName = "ApiaryUpgrade",
        meta = 11,
    ),
    ApiaryUpgrade2(
        registryName = "ApiaryUpgrade",
        meta = 2,
    ),
    ApiaryUpgrade20(
        registryName = "ApiaryUpgrade",
        meta = 20,
    ),
    ApiaryUpgrade5(
        registryName = "ApiaryUpgrade",
        meta = 5,
    ),
    ApiaryUpgrade4(
        registryName = "ApiaryUpgrade",
        meta = 4,
    ),
    ApiaryUpgrade13(
        registryName = "ApiaryUpgrade",
        meta = 13,
    ),
    ApiaryUpgrade16(
        registryName = "ApiaryUpgrade",
        meta = 16,
    ),
    ApiaryUpgrade18(
        registryName = "ApiaryUpgrade",
        meta = 18,
    ),
    ApiaryUpgrade21(
        registryName = "ApiaryUpgrade",
        meta = 21,
    ),
    ApiaryUpgrade7(
        registryName = "ApiaryUpgrade",
        meta = 7,
    ),
    ApiaryUpgrade14(
        registryName = "ApiaryUpgrade",
        meta = 14,
    ),
    ApiaryUpgrade22(
        registryName = "ApiaryUpgrade",
        meta = 22,
    ),
    ApiaryUpgrade1(
        registryName = "ApiaryUpgrade",
        meta = 1,
    ),
    ApiaryUpgrade10(
        registryName = "ApiaryUpgrade",
        meta = 10,
    ),
    ApiaryUpgrade19(
        registryName = "ApiaryUpgrade",
        meta = 19,
    ),
    ApiaryUpgrade3(
        registryName = "ApiaryUpgrade",
        meta = 3,
    ),
    ApiaryUpgrade12(
        registryName = "ApiaryUpgrade",
        meta = 12,
    ),
    ApiaryUpgrade6(
        registryName = "ApiaryUpgrade",
        meta = 6,
    ),
    ApiaryUpgrade15(
        registryName = "ApiaryUpgrade",
        meta = 15,
    ),
    IndustrialGrafter100(
        registryName = "IndustrialGrafter",
        meta = 100,
    ),
    IndustrialScoop100(
        registryName = "IndustrialScoop",
        meta = 100,
    ),

    // Blocks

    IndustrialApiary(
        registryName = "IndustrialApiary",
        meta = 0,
    ),
    MutagenProducer(
        registryName = "MutagenProducer",
        meta = 0,
    ),
    Mutatron(
        registryName = "Mutatron",
        meta = 0,
    ),
    Imprinter(
        registryName = "Imprinter",
        meta = 0,
    ),
    Sampler(
        registryName = "Sampler",
        meta = 0,
    ),
    MutatronAdv(
        registryName = "MutatronAdv",
        meta = 0,
    ),
    Liquifier(
        registryName = "Liquifier",
        meta = 0,
    ),
    Extractor(
        registryName = "Extractor",
        meta = 0,
    ),
    Transposer(
        registryName = "Transposer",
        meta = 0,
    ),
    Replicator(
        registryName = "Replicator",
        meta = 0,
    );

    public override val modId: String = "gendustry"
}
