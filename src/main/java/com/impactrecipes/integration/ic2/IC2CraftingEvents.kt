package com.impactrecipes.integration.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import cpw.mods.fml.common.eventhandler.SubscribeEvent
import cpw.mods.fml.common.gameevent.PlayerEvent
import gregtech.api.util.GT_Utility

internal object IC2CraftingEvents {

    @SubscribeEvent
    public fun onItemCrafted(event: PlayerEvent.ItemCraftedEvent) {
        val electricWrench = IC2Items.ElectricWrench.get() ?: return
        if (event.crafting.item != electricWrench.item) {
            return
        }

        val wrench = GregTechItems.ToolWrench.get() ?: return
        val powerUnit = IC2Items.SmallPowerUnit.get() ?: return
        var wrenchSlot = -1
        var powerUnitFound = false
        var occupiedSlots = 0
        for (slot in 0 until event.craftMatrix.sizeInventory) {
            val ingredient = event.craftMatrix.getStackInSlot(slot) ?: continue
            occupiedSlots++
            val isWrench = GT_Utility.areStacksEqual(
                ingredient,
                wrench,
                true,
            )
            val isPowerUnit = GT_Utility.areStacksEqual(
                ingredient,
                powerUnit,
                true,
            )
            if (isWrench) {
                wrenchSlot = slot
            } else if (isPowerUnit) {
                powerUnitFound = true
            }
        }

        if (occupiedSlots == 2 && wrenchSlot >= 0 && powerUnitFound) {
            // Forge fires this event before SlotCrafting returns tool containers.
            // Consume this wrench now to preserve the script's noReturn() transformer.
            event.craftMatrix.setInventorySlotContents(
                wrenchSlot,
                null,
            )
        }
    }
}
