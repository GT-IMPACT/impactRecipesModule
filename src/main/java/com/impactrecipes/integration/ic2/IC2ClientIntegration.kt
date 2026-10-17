package com.impactrecipes.integration.ic2

import com.impactrecipes.items.IC2Items
import cpw.mods.fml.common.eventhandler.SubscribeEvent
import cpw.mods.fml.common.registry.LanguageRegistry
import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.relauncher.SideOnly
import gregtech.api.util.GT_Utility
import net.minecraft.client.Minecraft
import net.minecraft.client.resources.IReloadableResourceManager
import net.minecraft.client.resources.IResourceManager
import net.minecraft.client.resources.IResourceManagerReloadListener
import net.minecraft.util.EnumChatFormatting
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.entity.player.ItemTooltipEvent

@SideOnly(Side.CLIENT)
internal object IC2ClientIntegration : IResourceManagerReloadListener {

    internal fun register() {
        MinecraftForge.EVENT_BUS.register(this)
        val resourceManager = Minecraft.getMinecraft().resourceManager as IReloadableResourceManager
        resourceManager.registerReloadListener(this)
    }

    public override fun onResourceManagerReload(resourceManager: IResourceManager) {
        val languageManager = Minecraft.getMinecraft().languageManager
        val language = languageManager.currentLanguage.languageCode
        val registry = LanguageRegistry.instance()
        registry.addStringLocalization(
            "ic2.itemCellBiomass",
            language,
            "Industrial Biomass Cell",
        )
        registry.addStringLocalization(
            "ic2.fluidBiomass",
            language,
            "Industrial Biomass",
        )
        languageManager.onResourceManagerReload(resourceManager)
    }

    @SubscribeEvent
    public fun onItemTooltip(event: ItemTooltipEvent) {
        val coefficient = when {
            GT_Utility.areStacksEqual(
                event.itemStack,
                IC2Items.KineticGenerator.get(),
                true,
            ) -> {
                "x2.5"
            }
            GT_Utility.areStacksEqual(
                event.itemStack,
                IC2Items.WindMill.get(),
                true,
            ) -> {
                "x5"
            }
            else -> {
                return
            }
        }
        event.toolTip.add("${EnumChatFormatting.GRAY}Coefficient: ${EnumChatFormatting.RED}$coefficient")
    }
}
