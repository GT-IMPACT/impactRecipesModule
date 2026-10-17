package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class GregTechCoolingRecipes {

    internal fun register() {
        MachineRecipes.vacuumFreezer(
            input = Materials.Pentacadmiummagnesiumhexaoxid.item(OrePrefixes.ingotHot).get(),
            output = Materials.Pentacadmiummagnesiumhexaoxid.item(OrePrefixes.ingot).get(),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Titaniumonabariumdecacoppereikosaoxid.item(OrePrefixes.ingotHot).get(),
            output = Materials.Titaniumonabariumdecacoppereikosaoxid.item(OrePrefixes.ingot).get(),
            ticks = 500,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Uraniumtriplatinid.item(OrePrefixes.ingotHot).get(),
            output = Materials.Uraniumtriplatinid.item(OrePrefixes.ingot).get(),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Vanadiumtriindinid.item(OrePrefixes.ingotHot).get(),
            output = Materials.Vanadiumtriindinid.item(OrePrefixes.ingot).get(),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.item(OrePrefixes.ingotHot).get(),
            output = Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.item(OrePrefixes.ingot).get(),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Tetranaquadahdiindiumhexaplatiumosminid.item(OrePrefixes.ingotHot).get(),
            output = Materials.Tetranaquadahdiindiumhexaplatiumosminid.item(OrePrefixes.ingot).get(),
            ticks = 720,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Neutronium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Neutronium.item(OrePrefixes.ingot).get(),
            ticks = 780,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Longasssuperconductornameforuvwire.item(OrePrefixes.ingotHot).get(),
            output = Materials.Longasssuperconductornameforuvwire.item(OrePrefixes.ingot).get(),
            ticks = 500,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Longasssuperconductornameforuhvwire.item(OrePrefixes.ingotHot).get(),
            output = Materials.Longasssuperconductornameforuhvwire.item(OrePrefixes.ingot).get(),
            ticks = 550,
            eu = 122880,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Longasssuperconductornameforuevwire.item(OrePrefixes.ingotHot).get(),
            output = Materials.Longasssuperconductornameforuevwire.item(OrePrefixes.ingot).get(),
            ticks = 600,
            eu = 500000,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Diamericiumtitanium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Diamericiumtitanium.item(OrePrefixes.ingot).get(),
            ticks = 480,
            eu = 122880,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Naquadah.item(OrePrefixes.ingotHot).get(),
            output = Materials.Naquadah.item(OrePrefixes.ingot).get(),
            ticks = 420,
            eu = 7860,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Europiumoxide.item(OrePrefixes.ingotHot).get(),
            output = Materials.Europiumoxide.item(OrePrefixes.ingot).get(),
            ticks = 420,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Tritanium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Tritanium.item(OrePrefixes.ingot).get(),
            ticks = 736,
            eu = 7860,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Americium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Americium.item(OrePrefixes.ingot).get(),
            ticks = 592,
            eu = 4092,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Platinum.item(OrePrefixes.ingotHot).get(),
            output = Materials.Platinum.item(OrePrefixes.ingot).get(),
            ticks = 466,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Iridium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Iridium.item(OrePrefixes.ingot).get(),
            ticks = 424,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Osmiridium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Osmiridium.item(OrePrefixes.ingot).get(),
            ticks = 437,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Osmium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Osmium.item(OrePrefixes.ingot).get(),
            ticks = 458,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Tungsten.item(OrePrefixes.ingotHot).get(),
            output = Materials.Tungsten.item(OrePrefixes.ingot).get(),
            ticks = 419,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Europium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Europium.item(OrePrefixes.ingot).get(),
            ticks = 377,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.HSSS.item(OrePrefixes.ingotHot).get(),
            output = Materials.HSSS.item(OrePrefixes.ingot).get(),
            ticks = 220,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Enderium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Enderium.item(OrePrefixes.ingot).get(),
            ticks = 245,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.TungstenSteel.item(OrePrefixes.ingotHot).get(),
            output = Materials.TungstenSteel.item(OrePrefixes.ingot).get(),
            ticks = 231,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Palladium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Palladium.item(OrePrefixes.ingot).get(),
            ticks = 216,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.HSSG.item(OrePrefixes.ingotHot).get(),
            output = Materials.HSSG.item(OrePrefixes.ingot).get(),
            ticks = 186,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.NaquadahAlloy.item(OrePrefixes.ingotHot).get(),
            output = Materials.NaquadahAlloy.item(OrePrefixes.ingot).get(),
            ticks = 220,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Naquadria.item(OrePrefixes.ingotHot).get(),
            output = Materials.Naquadria.item(OrePrefixes.ingot).get(),
            ticks = 197,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.NaquadahEnriched.item(OrePrefixes.ingotHot).get(),
            output = Materials.NaquadahEnriched.item(OrePrefixes.ingot).get(),
            ticks = 188,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Adamantium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Adamantium.item(OrePrefixes.ingot).get(),
            ticks = 173,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.ElectrumFlux.item(OrePrefixes.ingotHot).get(),
            output = Materials.ElectrumFlux.item(OrePrefixes.ingot).get(),
            ticks = 168,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.TungstenCarbide.item(OrePrefixes.ingotHot).get(),
            output = Materials.TungstenCarbide.item(OrePrefixes.ingot).get(),
            ticks = 215,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.HSSE.item(OrePrefixes.ingotHot).get(),
            output = Materials.HSSE.item(OrePrefixes.ingot).get(),
            ticks = 194,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.NiobiumTitanium.item(OrePrefixes.ingotHot).get(),
            output = Materials.NiobiumTitanium.item(OrePrefixes.ingot).get(),
            ticks = 152,
            eu = 4092,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Nichrome.item(OrePrefixes.ingotHot).get(),
            output = Materials.Nichrome.item(OrePrefixes.ingot).get(),
            ticks = 108,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.VanadiumGallium.item(OrePrefixes.ingotHot).get(),
            output = Materials.VanadiumGallium.item(OrePrefixes.ingot).get(),
            ticks = 109,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.YttriumBariumCuprate.item(OrePrefixes.ingotHot).get(),
            output = Materials.YttriumBariumCuprate.item(OrePrefixes.ingot).get(),
            ticks = 96,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Desh.item(OrePrefixes.ingotHot).get(),
            output = Materials.Desh.item(OrePrefixes.ingot).get(),
            ticks = 87,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Titanium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Titanium.item(OrePrefixes.ingot).get(),
            ticks = 75,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Draconium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Draconium.item(OrePrefixes.ingot).get(),
            ticks = 213,
            eu = 7860,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.DraconiumAwakened.item(OrePrefixes.ingotHot).get(),
            output = Materials.DraconiumAwakened.item(OrePrefixes.ingot).get(),
            ticks = 224,
            eu = 31440,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Infuscolium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Infuscolium.item(OrePrefixes.ingot).get(),
            ticks = 398,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Quantium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Quantium.item(OrePrefixes.ingot).get(),
            ticks = 280,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.BlackPlutonium.item(OrePrefixes.ingotHot).get(),
            output = Materials.BlackPlutonium.item(OrePrefixes.ingot).get(),
            ticks = 300,
            eu = 122880,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Adamantium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Adamantium.item(OrePrefixes.ingot).get(),
            ticks = 490,
            eu = 30720,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Trinium.item(OrePrefixes.ingotHot).get(),
            output = Materials.Trinium.item(OrePrefixes.ingot).get(),
            ticks = 294,
            eu = 7860,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.BT6.item(OrePrefixes.ingotHot).get(),
            output = Materials.BT6.item(OrePrefixes.ingot).get(),
            ticks = 164,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.CosmicNeutronium.item(OrePrefixes.ingotHot).get(),
            output = Materials.CosmicNeutronium.item(OrePrefixes.ingot).get(),
            ticks = 400,
            eu = 122880,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.InfinityCatalyst.item(OrePrefixes.ingotHot).get(),
            output = Materials.InfinityCatalyst.item(OrePrefixes.ingot).get(),
            ticks = 500,
            eu = 500000,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Infinity.item(OrePrefixes.ingotHot).get(),
            output = Materials.Infinity.item(OrePrefixes.ingot).get(),
            ticks = 500,
            eu = 2000000,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Oriharukon.item(OrePrefixes.ingotHot).get(),
            output = Materials.Oriharukon.item(OrePrefixes.ingot).get(),
            ticks = 386,
            eu = 7680,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Mytryl.item(OrePrefixes.ingotHot).get(),
            output = Materials.Mytryl.item(OrePrefixes.ingot).get(),
            ticks = 324,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            input = ImpactItems.CallistoIceIngot.get(),
            output = ImpactItems.CallistoIceColdIngot.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = Materials.Ledox.item(OrePrefixes.ingot).get(),
            output = ImpactItems.LedoxColdIngot.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.vacuumFreezer(
            input = ImpactItems.MysteriousCrystalIngot.get(),
            output = ImpactItems.MysteriousCrystalColdIngot.get(),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.vacuumFreezer(
            fluidInput = FluidStack(
                FluidRegistry.getFluid("ic2hotcoolant"),
                1000,
            ),
            fluidOutput = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                1000,
            ),
            ticks = 300,
            eu = 120,
        )
    }

    internal fun solidification() {
        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.HastelloyC276.getMoltenHot(144L),
            output = Materials.HastelloyC276.item(OrePrefixes.ingot).get(),
            ticks = (10 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.GumMetal.getMoltenHot(144L),
            output = Materials.GumMetal.item(OrePrefixes.ingot).get(),
            ticks = (12 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Titaniolum.getMoltenHot(144L),
            output = Materials.Titaniolum.item(OrePrefixes.ingot).get(),
            ticks = (14 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Zamak.getMoltenHot(144L),
            output = Materials.Zamak.item(OrePrefixes.ingot).get(),
            ticks = (16 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Duraluminium.getMoltenHot(144L),
            output = Materials.Duraluminium.item(OrePrefixes.ingot).get(),
            ticks = (18 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Inconel690.getMoltenHot(144L),
            output = Materials.Inconel690.item(OrePrefixes.ingot).get(),
            ticks = (19 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Nitinol.getMoltenHot(144L),
            output = Materials.Nitinol.item(OrePrefixes.ingot).get(),
            ticks = (20 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Inconel792.getMoltenHot(144L),
            output = Materials.Inconel792.item(OrePrefixes.ingot).get(),
            ticks = (22 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.TiBetaC.getMoltenHot(144L),
            output = Materials.TiBetaC.item(OrePrefixes.ingot).get(),
            ticks = (24 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.MaragingSteel250.getMoltenHot(144L),
            output = Materials.MaragingSteel250.item(OrePrefixes.ingot).get(),
            ticks = (27 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Talonite.getMoltenHot(144L),
            output = Materials.Talonite.item(OrePrefixes.ingot).get(),
            ticks = (28 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Grisium.getMoltenHot(144L),
            output = Materials.Grisium.item(OrePrefixes.ingot).get(),
            ticks = (26 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Nitinol60.getMoltenHot(144L),
            output = Materials.Nitinol60.item(OrePrefixes.ingot).get(),
            ticks = (27 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Kovar.getMoltenHot(144L),
            output = Materials.Kovar.item(OrePrefixes.ingot).get(),
            ticks = (17 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Mangalloy.getMoltenHot(144L),
            output = Materials.Mangalloy.item(OrePrefixes.ingot).get(),
            ticks = (15 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.MaragingSteel300.getMoltenHot(144L),
            output = Materials.MaragingSteel300.item(OrePrefixes.ingot).get(),
            ticks = (24 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Stellite.getMoltenHot(144L),
            output = Materials.Stellite.item(OrePrefixes.ingot).get(),
            ticks = (10 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Zeron100.getMoltenHot(144L),
            output = Materials.Zeron100.item(OrePrefixes.ingot).get(),
            ticks = (20 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.CinobiteA243.getMoltenHot(144L),
            output = Materials.CinobiteA243.item(OrePrefixes.ingot).get(),
            ticks = (30 * 20),
            eu = 30720,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.HastelloyN.getMoltenHot(144L),
            output = Materials.HastelloyN.item(OrePrefixes.ingot).get(),
            ticks = (26 * 20),
            eu = 7680,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Lafium.getMoltenHot(144L),
            output = Materials.Lafium.item(OrePrefixes.ingot).get(),
            ticks = (26 * 20),
            eu = 122880,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.BT6.getMoltenHot(144L),
            output = Materials.BT6.item(OrePrefixes.ingot).get(),
            ticks = (10 * 20),
            eu = 1920,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Pikyonium64B.getMoltenHot(144L),
            output = Materials.Pikyonium64B.item(OrePrefixes.ingot).get(),
            ticks = (40 * 20),
            eu = 500000,
        )

        MachineRecipes.freezerSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = FluidRegistry.getFluidStack(
                "ic2coolant",
                125,
            ),
            secondaryFluidInput = Materials.Quantum.getMoltenHot(144L),
            output = Materials.Quantum.item(OrePrefixes.ingot).get(),
            ticks = (50 * 20),
            eu = 2000000,
        )
    }
}
