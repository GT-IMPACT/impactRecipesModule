package com.impactrecipes.integration.ic2

import cpw.mods.fml.common.FMLCommonHandler
import cpw.mods.fml.common.Loader

public object IC2Integration {

    private var registered = false

    public fun register() {
        if (registered || !Loader.isModLoaded("IC2")) {
            return
        }
        registered = true

        val handler = FMLCommonHandler.instance()
        handler.bus().register(IC2CraftingEvents)
        if (handler.side.isClient) {
            IC2ClientIntegration.register()
        }
    }
}
