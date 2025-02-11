package com.impactrecipes

import com.impactrecipes.loader.ModsLoader
import net.minecraft.command.CommandBase
import net.minecraft.command.ICommandSender
import net.minecraft.server.MinecraftServer
import net.minecraft.util.ChunkCoordinates
import net.minecraft.util.IChatComponent
import net.minecraft.world.World

class DebugCommand : CommandBase(), ICommandSender {
    override fun getRequiredPermissionLevel(): Int = 0
    override fun getCommandSenderName(): String? = "server"
    override fun func_145748_c_(): IChatComponent? = null
    override fun addChatMessage(message: IChatComponent?) = Unit
    override fun canCommandSenderUseCommand(permissionLevel: Int, command: String?): Boolean = true
    override fun getPlayerCoordinates(): ChunkCoordinates? = null
    override fun getEntityWorld(): World? = null
    override fun getCommandName(): String? = "recipeDebug"
    override fun getCommandUsage(sender: ICommandSender?): String? = "recipeDebug"

    override fun processCommand(sender: ICommandSender?, args: Array<out String>) {
        val prefix = when {
            args.isEmpty() -> return
            args.contains("push") -> return debugRecipeAdder()
            args.contains("all") -> "all"
            args.contains("clear") -> ""
            else -> return
        }
        MinecraftServer.getServer().commandManager.executeCommand(this, "rr $prefix")
    }
}

fun debugRecipeAdder() {
    ModsLoader.loader()
}
