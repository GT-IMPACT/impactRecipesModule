package com.impactrecipes.items

import com.riciJak.Ztones.init.ModBlocks
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.block.Block

public enum class ZtonesItems(
    private val block: Block?,
    public override val registryName: String,
    public override val meta: Int,
) : IRegistryModItem {

    // Items

    Minicharcoal(
        registryName = "minicharcoal",
        meta = 0,
    ),
    Minicoal(
        registryName = "minicoal",
        meta = 0,
    ),
    Ofanix(
        registryName = "ofanix",
        meta = 0,
    ),
    DiamondZane(
        registryName = "diamondZane",
        meta = 0,
    ),
    SplatAxe(
        registryName = "splatAxe",
        meta = 0,
    ),
    TerrainEater(
        registryName = "terrainEater",
        meta = 0,
    ),

    // Blocks

    Myst(
        block = ModBlocks.mystBlock,
        registryName = "tile.mystBlock",
    ),
    StoneTile(
        registryName = "stoneTile",
        meta = 0,
    ),
    CleanDirt(
        registryName = "cleanDirt",
        meta = 0,
    ),
    Booster(
        registryName = "booster",
        meta = 0,
    ),
    Lampf(
        registryName = "lampf",
        meta = 0,
    ),
    Lampt(
        registryName = "lampt",
        meta = 0,
    ),
    Lampb(
        registryName = "lampb",
        meta = 0,
    ),
    Aurora(
        registryName = "auroraBlock",
        meta = 0,
    ),
    Korp(
        block = ModBlocks.korpBlock,
        registryName = "tile.korpBlock",
    ),
    Tank(
        block = ModBlocks.tankBlock,
        registryName = "tile.tankBlock",
    ),
    Sols(
        block = ModBlocks.solsBlock,
        registryName = "tile.solsBlock",
    ),
    Ztyl(
        block = ModBlocks.ztylBlock,
        registryName = "tile.ztylBlock",
    ),
    Vect(
        block = ModBlocks.vectBlock,
        registryName = "tile.vectBlock",
    ),
    Jelt(
        block = ModBlocks.jeltBlock,
        registryName = "tile.jeltBlock",
    ),
    Reed(
        block = ModBlocks.reedBlock,
        registryName = "tile.reedBlock",
    ),
    Vena(
        block = ModBlocks.venaBlock,
        registryName = "tile.venaBlock",
    ),
    Kryp(
        block = ModBlocks.krypBlock,
        registryName = "tile.krypBlock",
    ),
    Mint(
        block = ModBlocks.mintBlock,
        registryName = "tile.mintBlock",
    ),
    Ztyl4(
        registryName = "tile.ztylBlock",
        meta = 4,
    ),
    Zech(
        block = ModBlocks.zechBlock,
        registryName = "tile.zechBlock",
    ),
    Sync(
        block = ModBlocks.syncBlock,
        registryName = "tile.syncBlock",
    ),
    Ztyl10(
        registryName = "tile.ztylBlock",
        meta = 10,
    ),
    Zkul(
        block = ModBlocks.zkulBlock,
        registryName = "tile.zkulBlock",
    ),
    Lair(
        block = ModBlocks.lairBlock,
        registryName = "tile.lairBlock",
    ),
    Reds(
        block = ModBlocks.redsBlock,
        registryName = "tile.redsBlock",
    ),
    Ztyl8(
        registryName = "tile.ztylBlock",
        meta = 8,
    ),
    Iszm(
        block = ModBlocks.iszmBlock,
        registryName = "tile.iszmBlock",
    ),
    Roen(
        block = ModBlocks.roenBlock,
        registryName = "tile.roenBlock",
    ),
    Lave(
        block = ModBlocks.laveBlock,
        registryName = "tile.laveBlock",
    ),
    Ztyl11(
        registryName = "tile.ztylBlock",
        meta = 11,
    ),
    Zest(
        block = ModBlocks.zestBlock,
        registryName = "tile.zestBlock",
    ),
    Ztyl15(
        registryName = "tile.ztylBlock",
        meta = 15,
    ),
    Zyth(
        block = ModBlocks.zythBlock,
        registryName = "tile.zythBlock",
    ),
    Bitt(
        block = ModBlocks.bittBlock,
        registryName = "tile.bittBlock",
    ),
    Glaxx(
        block = ModBlocks.glaxx,
        registryName = "tile.glaxx",
    ),
    Agon(
        block = ModBlocks.agonBlock,
        registryName = "tile.agonBlock",
    ),
    Ztyl3(
        registryName = "tile.ztylBlock",
        meta = 3,
    ),
    Zone(
        block = ModBlocks.zoneBlock,
        registryName = "tile.zoneBlock",
    ),
    Ztyl14(
        registryName = "tile.ztylBlock",
        meta = 14,
    ),
    Zoea(
        block = ModBlocks.zoeaBlock,
        registryName = "tile.zoeaBlock",
    ),
    Ztyl13(
        registryName = "tile.ztylBlock",
        meta = 13,
    ),
    Zeta(
        block = ModBlocks.zetaBlock,
        registryName = "tile.zetaBlock",
    ),
    Cray(
        block = ModBlocks.crayBlock,
        registryName = "tile.crayBlock",
    ),
    Ztyl9(
        registryName = "tile.ztylBlock",
        meta = 9,
    ),
    Fort(
        block = ModBlocks.fortBlock,
        registryName = "tile.fortBlock",
    ),
    Ztyl7(
        registryName = "tile.ztylBlock",
        meta = 7,
    ),
    Zion(
        block = ModBlocks.zionBlock,
        registryName = "tile.zionBlock",
    ),
    Ztyl6(
        registryName = "tile.ztylBlock",
        meta = 6,
    ),
    Zome(
        block = ModBlocks.zomeBlock,
        registryName = "tile.zomeBlock",
    ),
    Ztyl12(
        registryName = "tile.ztylBlock",
        meta = 12,
    ),
    Zane(
        block = ModBlocks.zaneBlock,
        registryName = "tile.zaneBlock",
    ),
    Azur(
        block = ModBlocks.azurBlock,
        registryName = "tile.azurBlock",
    ),
    Ztyl5(
        registryName = "tile.ztylBlock",
        meta = 5,
    ),
    Zorg(
        block = ModBlocks.zorgBlock,
        registryName = "tile.zorgBlock",
    );

    public override val modId: String = "Ztones"

    constructor(
        registryName: String,
        meta: Int = 0,
    ) : this(
        block = null,
        registryName = registryName,
        meta = meta,
    )

    constructor(
        block: Block,
        registryName: String,
    ) : this(
        block = block,
        registryName = registryName,
        meta = 0,
    )

    public override fun getBlock(): Block? {
        if (block != null) {
            return block
        }
        return GameRegistry.findBlock(
            modId,
            registryName,
        )
    }
}
