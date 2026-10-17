package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack
import net.minecraftforge.fluids.FluidStack

internal class GregTechMotorAssemblyRecipes {

    internal fun register() {
        //Motors
        MachineRecipes.assemblyLine(
            researchItem = GregTechItems.ElectricMotorIV.get(),
            researchTicks = 144000,
            inputs = arrayOf<ItemStack?>(
                Materials.NeodymiumMagnetic.item(OrePrefixes.stickLong).get(),
                Materials.HSSS.item(OrePrefixes.stickLong).get(amount = 2),
                Materials.MeteoricSteel.item(OrePrefixes.ring).get(amount = 4),
                Materials.MeteoricSteel.item(OrePrefixes.round).get(amount = 16),
                Materials.AnnealedCopper.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.AnnealedCopper.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.AnnealedCopper.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.AnnealedCopper.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.YttriumBariumCuprate.item(OrePrefixes.cableGt01).get(amount = 2),
            ),
            fluidInputs = arrayOf<FluidStack?>(
                Materials.SolderingAlloy.getMolten(144),
                Materials.Lubricant.getFluid(250),
            ),
            output = GregTechItems.ElectricMotorLuV.get(),
            ticks = 600,
            eu = 6000,
        )

        MachineRecipes.assemblyLine(
            researchItem = GregTechItems.ElectricMotorLuV.get(),
            researchTicks = 144000,
            inputs = arrayOf<ItemStack?>(
                Materials.EuropiumoxideMagnetic.item(OrePrefixes.stick).get(),
                Materials.Osmiridium.item(OrePrefixes.stickLong).get(amount = 4),
                Materials.Desh.item(OrePrefixes.ring).get(amount = 6),
                Materials.Desh.item(OrePrefixes.round).get(amount = 24),
                Materials.NaquadahAlloy.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.NaquadahAlloy.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.NaquadahAlloy.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.NaquadahAlloy.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.Naquadah.item(OrePrefixes.cableGt04).get(amount = 2),
            ),
            fluidInputs = arrayOf<FluidStack?>(
                Materials.SolderingAlloy.getMolten(288),
                Materials.Lubricant.getFluid(750),
            ),
            output = GregTechItems.ElectricMotorZPM.get(),
            ticks = 600,
            eu = 24000,
        )

        MachineRecipes.assemblyLine(
            researchItem = GregTechItems.ElectricMotorZPM.get(),
            researchTicks = 288000,
            inputs = arrayOf<ItemStack?>(
                Materials.EuropiumoxideMagnetic.item(OrePrefixes.stick).get(),
                Materials.Tritanium.item(OrePrefixes.stickLong).get(amount = 6),
                Materials.Oriharukon.item(OrePrefixes.ring).get(amount = 8),
                Materials.Oriharukon.item(OrePrefixes.round).get(amount = 32),
                Materials.Americium.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.Americium.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.Americium.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.Americium.item(OrePrefixes.wireFine).get(amount = 64),
                Materials.NaquadahAlloy.item(OrePrefixes.cableGt04).get(amount = 2),
            ),
            fluidInputs = arrayOf<FluidStack?>(
                Materials.SolderingAlloy.getMolten(1296),
                Materials.Lubricant.getFluid(2000),
                Materials.Naquadria.getMolten(1296),
            ),
            output = GregTechItems.ElectricMotorUV.get(),
            ticks = 600,
            eu = 100000,
        )
    }
}
