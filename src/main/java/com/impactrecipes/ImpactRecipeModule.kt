import com.impactrecipes.DebugCommand
import com.impactrecipes.MODID
import com.impactrecipes.loader.ModsLoader
import com.impactrecipes.util.RecipeDebugConfig
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.client.ClientCommandHandler

@Mod(
    name = "Impact | Recipes Module",
    version = "MC1710",
    modid = MODID,
    modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter",
    dependencies = "required-after:forgelin; required-after:Forge; after:impact; " +
        "after:appliedenergistics2; after:ae2fc; after:IC2; after:gregtech; after:tectech; after:EnderIO;",
)
public object ImpactRecipeModule {

    @Mod.InstanceFactory
    public fun instance(): ImpactRecipeModule {
        return ImpactRecipeModule
    }

    @Mod.EventHandler
    public fun preInit(event: FMLPreInitializationEvent): Unit {
        RecipeDebugConfig.load(configDirectory = event.modConfigurationDirectory)
    }

    @Mod.EventHandler
    public fun init(event: FMLInitializationEvent): Unit {
    }

    @Mod.EventHandler
    public fun postInit(event: FMLPostInitializationEvent): Unit {
        ClientCommandHandler.instance.registerCommand(DebugCommand())
        ModsLoader.loader()
    }
}
