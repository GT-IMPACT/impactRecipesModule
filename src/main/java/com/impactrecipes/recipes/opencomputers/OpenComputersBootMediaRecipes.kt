package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.util.GT_Utility
import net.minecraft.nbt.NBTTagCompound

internal object OpenComputersBootMediaRecipes {

    internal fun floppy(
        displayName: String,
        name: String,
        color: Int,
        circuit: Int,
    ) {
        val floppy = OpenComputersItems.FloppyDisk.get()
        val tag = NBTTagCompound()
        var subtag = NBTTagCompound()
        subtag.setString(
            "Name",
            displayName,
        )
        tag.setTag(
            "display",
            subtag,
        )
        subtag = NBTTagCompound()
        subtag.setString(
            "oc:fs.label",
            name,
        )
        tag.setTag(
            "oc:data",
            subtag,
        )
        tag.setInteger(
            "oc:color",
            color,
        )
        tag.setString(
            "oc:lootFactory",
            "OpenComputers:" + name,
        )
        floppy?.setTagCompound(tag)
        MachineRecipes.laserEngraver(
            input = OpenComputersItems.FloppyDisk.get(),
            lens = GT_Utility.getIntegratedCircuit(circuit),
            output = floppy,
            ticks = 200,
            eu = 120,
        )
    }

    internal fun luaBios() {
        val lua = OpenComputersItems.EEPROM.get()
        val tag = NBTTagCompound()
        val subtag = NBTTagCompound()
        subtag.setString(
            "oc:label",
            "EEPROM (Lua Bios)",
        )
        subtag.setBoolean(
            "oc:readonly",
            false,
        )
        val b = OpenComputersBios.readBytes()
        subtag.setByteArray(
            "oc:eeprom",
            b,
        )
        tag.setTag(
            "oc:data",
            subtag,
        )
        lua?.setTagCompound(tag)
        MachineRecipes.laserEngraver(
            input = OpenComputersItems.EEPROM.get(),
            lens = GT_Utility.getIntegratedCircuit(1),
            output = lua,
            ticks = 200,
            eu = 120,
        )
    }
}
