package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.GregTech_API
import gregtech.api.enums.ItemList
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class GregTechOilRecipes {

    internal fun register() {
        MachineRecipes.distillationTower(
            fluidInput = Materials.Pollution.getFluid(1300),
            outputs = arrayOf<FluidStack?>(
                Materials.CarbonMonoxide.getGas(50L),
                Materials.CarbonDioxide.getGas(50L),
                Materials.HydricSulfide.getGas(50L),
                Materials.SulfuricAcid.getFluid(50L),
                Materials.NitrogenDioxide.getGas(50L),
                Materials.Methane.getGas(50L),
                Materials.Mercury.getFluid(1L),
            ),
            secondaryOutput = Materials.Ash.item(OrePrefixes.dust).get(),
            ticks = 600,
            eu = 480,
        )

        // --- Oils
        MachineRecipes.universalDistillation(
            fluidInput = Materials.OilLight.getFluid(150),
            outputs = arrayOf<FluidStack?>(
                Materials.SulfuricHeavyFuel.getFluid(10),
                Materials.SulfuricLightFuel.getFluid(20),
                Materials.SulfuricNaphtha.getFluid(30),
                Materials.SulfuricGas.getGas(240),
            ),
            secondaryOutput = ImpactItems.PetcokeDust.get(),
            ticks = 20,
            eu = 96,
        )

        MachineRecipes.universalDistillation(
            fluidInput = Materials.OilMedium.getFluid(100),
            outputs = arrayOf<FluidStack?>(
                Materials.SulfuricHeavyFuel.getFluid(15),
                Materials.SulfuricLightFuel.getFluid(50),
                Materials.SulfuricNaphtha.getFluid(20),
                Materials.SulfuricGas.getGas(60),
            ),
            secondaryOutput = ImpactItems.PetcokeDust.get(),
            ticks = 20,
            eu = 96,
        )

        MachineRecipes.universalDistillation(
            fluidInput = Materials.Oil.getFluid(50L),
            outputs = arrayOf<FluidStack?>(
                Materials.SulfuricHeavyFuel.getFluid(15),
                Materials.SulfuricLightFuel.getFluid(50),
                Materials.SulfuricNaphtha.getFluid(20),
                Materials.SulfuricGas.getGas(60),
            ),
            secondaryOutput = ImpactItems.PetcokeDust.get(),
            ticks = 20,
            eu = 96,
        )

        MachineRecipes.universalDistillation(
            fluidInput = Materials.OilHeavy.getFluid(100),
            outputs = arrayOf<FluidStack?>(
                Materials.SulfuricHeavyFuel.getFluid(250),
                Materials.SulfuricLightFuel.getFluid(45),
                Materials.SulfuricNaphtha.getFluid(15),
                Materials.SulfuricGas.getGas(60),
            ),
            secondaryOutput = ImpactItems.PetcokeDust.get(amount = 2),
            ticks = 20,
            eu = 288,
        )

        MachineRecipes.universalDistillation(
            fluidInput = FluidStack(
                ItemList.sOilExtraHeavy,
                100,
            ),
            outputs = arrayOf<FluidStack?>(
                Materials.SulfuricHeavyFuel.getFluid(750),
                Materials.SulfuricTar.getFluid(200),
                Materials.SulfuricLightFuel.getFluid(90),
                Materials.SulfuricNaphtha.getFluid(60),
                Materials.SulfuricGas.getGas(360),
            ),
            secondaryOutput = ImpactItems.PetcokeDust.get(amount = 4),
            ticks = 20,
            eu = 430,
        )

        if ((GregTech_API.sSpecialFile.get(
            "general",
            "EnableLagencyOilGalactiCraft",
            false,
        ) && (FluidRegistry.getFluid("oilgc") != null))) {
            MachineRecipes.universalDistillation(
                fluidInput = FluidStack(
                    FluidRegistry.getFluid("oilgc"),
                    50,
                ),
                outputs = arrayOf<FluidStack?>(
                    Materials.SulfuricHeavyFuel.getFluid(15),
                    Materials.SulfuricLightFuel.getFluid(50),
                    Materials.SulfuricNaphtha.getFluid(20),
                    Materials.SulfuricGas.getGas(60),
                ),
                secondaryOutput = ImpactItems.PetcokeDust.get(),
                ticks = 20,
                eu = 96,
            )
        }
    }

    internal fun tarExtraction() {
        // --- Tar from Coal Coke
        MachineRecipes.fluidExtractor(
            input = Materials.CokeCoal.item(OrePrefixes.gem).get(),
            remains = Materials.Ash.item(OrePrefixes.dust).get(),
            fluidOutput = Materials.Tar.getFluid(100L),
            chance = 2000,
            ticks = 30,
            eu = 12,
        )
    }
}
