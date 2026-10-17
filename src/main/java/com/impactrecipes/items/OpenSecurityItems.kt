package com.impactrecipes.items

public enum class OpenSecurityItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    MagneticStripCard(
        registryName = "opensecurity.magCard",
        meta = 0,
    ),
    RFIDCard(
        registryName = "opensecurity.rfidCard",
        meta = 0,
    ),
    RFIDReaderCard(
        registryName = "opensecurity.rfidReaderCard",
        meta = 0,
    ),
    SecureNetworkCard(
        registryName = "opensecurity.secureNetworkCard",
        meta = 0,
    ),
    SecurityDoor(
        registryName = "opensecurity.securityDoor",
        meta = 0,
    ),
    PrivateSecurityDoor(
        registryName = "opensecurity.securityDoorPrivate",
        meta = 0,
    ),
    DamageUpgrade(
        registryName = "opensecurity.damageUpgrade",
        meta = 0,
    ),
    CooldownUpgrade(
        registryName = "opensecurity.cooldownUpgrade",
        meta = 0,
    ),
    EnergyUpgrade(
        registryName = "opensecurity.energyUpgrade",
        meta = 0,
    ),
    MovementUpgrade(
        registryName = "opensecurity.movementUpgrade",
        meta = 0,
    ),

    // Blocks

    MagneticCardReader(
        registryName = "magreader",
        meta = 0,
    ),
    RFIDReader(
        registryName = "rfidreader",
        meta = 0,
    ),
    CardWriter(
        registryName = "rfidwriter",
        meta = 0,
    ),
    Alarm(
        registryName = "alarm",
        meta = 0,
    ),
    EntityDetector(
        registryName = "entitydetector",
        meta = 0,
    ),
    DoorController(
        registryName = "doorcontroller",
        meta = 0,
    ),
    DataBlock(
        registryName = "opensecurity.DataBlock",
        meta = 0,
    ),
    SwitchableHub(
        registryName = "opensecurity.SwitchableHub",
        meta = 0,
    ),
    KVMSwitch(
        registryName = "opensecurity.BlockKVM",
        meta = 0,
    ),
    EnergyTurret(
        registryName = "energyTurretBlock",
        meta = 0,
    ),
    Keypad(
        registryName = "keypadLock",
        meta = 0,
    ),
    BiometricReader(
        registryName = "biometricScanner",
        meta = 0,
    );

    public override val modId: String = "opensecurity"
}
