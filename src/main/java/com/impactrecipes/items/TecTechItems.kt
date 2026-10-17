package com.impactrecipes.items

import com.github.technus.tectech.thing.CustomItemList
import net.minecraft.item.ItemStack

public enum class TecTechItems(
    private val item: CustomItemList,
) : IModItem {

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

    public override fun get(amount: Int): ItemStack? {
        return item.get(amount.toLong())?.copy()
    }
}
