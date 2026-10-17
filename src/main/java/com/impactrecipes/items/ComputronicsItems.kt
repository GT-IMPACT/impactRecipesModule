package com.impactrecipes.items

public enum class ComputronicsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    CipherBlock(
        registryName = "computronics.cipher",
        meta = 0,
    ),
    SpeechBox(
        registryName = "computronics.speechBox",
        meta = 0,
    ),
    IronNoteBlock(
        registryName = "computronics.ironNoteBlock",
        meta = 0,
    ),
    Radar(
        registryName = "computronics.radar",
        meta = 0,
    ),
    ChromiumDioxideTapeReel(
        registryName = "computronics.gt_parts",
        meta = 0,
    ),
    CameraUpgrade(
        registryName = "computronics.ocParts",
        meta = 0,
    ),
    ChatUpgrade(
        registryName = "computronics.ocParts",
        meta = 1,
    ),
    RadarUpgrade(
        registryName = "computronics.ocParts",
        meta = 2,
    ),
    ParticleEffectsCard(
        registryName = "computronics.ocParts",
        meta = 3,
    ),
    SpoofingCard(
        registryName = "computronics.ocParts",
        meta = 4,
    ),
    BeepCard(
        registryName = "computronics.ocParts",
        meta = 5,
    ),
    SelfDestructingCard(
        registryName = "computronics.ocParts",
        meta = 6,
    ),
    ColorfulUpgrade(
        registryName = "computronics.ocParts",
        meta = 7,
    ),
    NoiseCard(
        registryName = "computronics.ocParts",
        meta = 8,
    ),
    SoundCard(
        registryName = "computronics.ocParts",
        meta = 9,
    ),
    LightBoard(
        registryName = "computronics.ocParts",
        meta = 10,
    ),
    ServerSelfDestructor(
        registryName = "computronics.ocParts",
        meta = 11,
    ),
    RackCapacitor(
        registryName = "computronics.ocParts",
        meta = 12,
    ),
    SwitchBoard(
        registryName = "computronics.ocParts",
        meta = 13,
    ),
    SpeechUpgrade(
        registryName = "computronics.ocParts",
        meta = 14,
    ),
    Speaker(
        registryName = "computronics.speaker",
        meta = 0,
    ),
    Camera(
        registryName = "computronics.camera",
        meta = 0,
    ),
    ChatBox(
        registryName = "computronics.chatBox",
        meta = 0,
    ),
    ColorfulLamp(
        registryName = "computronics.colorfulLamp",
        meta = 0,
    );

    public override val modId: String = "computronics"
}
