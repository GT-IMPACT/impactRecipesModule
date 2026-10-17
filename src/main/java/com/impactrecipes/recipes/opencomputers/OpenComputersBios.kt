package com.impactrecipes.recipes.opencomputers

internal object OpenComputersBios {

    internal fun readBytes(): ByteArray {
        val resource = OpenComputersBios::class.java.getResourceAsStream("/assets/impactrecipes/oc/lua-bios.lua")
            ?: error("Missing OpenComputers Lua BIOS resource")
        return resource.use {
            it.readBytes()
        }
    }
}
