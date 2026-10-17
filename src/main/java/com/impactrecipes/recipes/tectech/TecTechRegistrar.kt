package com.impactrecipes.recipes.tectech

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class TecTechRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("tectech")
        }

    public override fun register() {
        TecTechMultiblockRecipes().register()
        TecTechMotorAndPumpRecipes().register()
        TecTechMechanicalComponentRecipes().register()
        TecTechEmitterAndSensorRecipes().register()
        TecTechBiowareCircuitRecipes().register()
        TecTechAdvancedProcessorRecipes().register()
        TecTechExoticCircuitRecipes().register()
        TecTechBatteryRecipes().register()
        TecTechEnergyInfrastructureRecipes().register()
        TecTechEnergyHatchRecipes().register()
        TecTechStargateAndUtilityRecipes().register()
    }
}
