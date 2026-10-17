package com.impactrecipes.items

import com.github.technus.tectech.thing.CustomItemList
import com.impactrecipes.util.RecipeItems
import net.minecraft.item.ItemStack

public enum class TecTechItems(
    private val item: CustomItemList?,
    private val registryName: String?,
    private val meta: Int,
) : IModItem {

    // Items

    ItemEmConstructable(
        registryName = "item.em.constructable",
        meta = 0,
    ),

    // Blocks

    MachineMultiEMToEssentia(item = CustomItemList.Machine_Multi_EMToEssentia),
    MachineMultiEMToMatter(item = CustomItemList.Machine_Multi_EMToMatter),
    MachineMultiEMjunction(item = CustomItemList.Machine_Multi_EMjunction),
    MachineMultiEssentiaToEM(item = CustomItemList.Machine_Multi_EssentiaToEM),
    MachineMultiMatterToEM(item = CustomItemList.Machine_Multi_MatterToEM),
    MachineMultiResearch(item = CustomItemList.Machine_Multi_Research),
    MachineMultiScanner(item = CustomItemList.Machine_Multi_Scanner),
    MachineMultiTransformer(item = CustomItemList.Machine_Multi_Transformer),
    EMComputerBus(item = CustomItemList.eM_Computer_Bus);

    public val modId: String = "tectech"

    constructor(item: CustomItemList) : this(
        item = item,
        registryName = null,
        meta = 0,
    )

    constructor(
        registryName: String,
        meta: Int = 0,
    ) : this(
        item = null,
        registryName = registryName,
        meta = meta,
    )

    public override fun get(amount: Int): ItemStack? {
        if (item != null) {
            return item.get(amount.toLong())?.copy()
        }
        val name = registryName ?: return null
        return RecipeItems.item(
            mod = modId,
            name = name,
            meta = meta,
            count = amount,
        )
    }
}
