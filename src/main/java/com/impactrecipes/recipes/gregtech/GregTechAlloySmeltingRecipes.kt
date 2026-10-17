package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.ItemList
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechAlloySmeltingRecipes {

    internal fun register() {
        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Cobalt.item(OrePrefixes.dust).get(),
                Materials.Molybdenum.item(OrePrefixes.dust).get(amount = 8),
                Materials.Tungsten.item(OrePrefixes.dust).get(),
                Materials.Copper.item(OrePrefixes.dust).get(),
                Materials.Chrome.item(OrePrefixes.dust).get(amount = 7),
                Materials.Nickel.item(OrePrefixes.dust).get(amount = 32),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.HastelloyC276.getMoltenHot((144L * 50)),
            ticks = (500 * 20),
            eu = 7680,
            temperature = 3666,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Titanium.item(OrePrefixes.dust).get(),
                Materials.Niobium.item(OrePrefixes.dust).get(amount = 23),
                Materials.Tantalum.item(OrePrefixes.dust).get(),
                Materials.Zirconium.item(OrePrefixes.dust).get(amount = 2),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.GumMetal.getMoltenHot((144L * 27)),
            ticks = (270 * 20),
            eu = 7680,
            temperature = 3777,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    2L,
                ),
                Materials.Titanium.item(OrePrefixes.dust).get(),
                Materials.Niobium.item(OrePrefixes.dust).get(),
                Materials.Tantalum.item(OrePrefixes.dust).get(),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Titaniolum.getMoltenHot((144L * 3)),
            ticks = (30 * 20),
            eu = 7680,
            temperature = 3888,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Steel.item(OrePrefixes.dust).get(amount = 5),
                Materials.Manganese.item(OrePrefixes.dust).get(amount = 2),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Mangalloy.getMoltenHot((144L * 7)),
            ticks = (70 * 20),
            eu = 7680,
            temperature = 3940,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Aluminium.item(OrePrefixes.dust).get(amount = 4),
                Materials.Copper.item(OrePrefixes.dust).get(amount = 3),
                Materials.Magnesium.item(OrePrefixes.dust).get(),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Zamak.getMoltenHot((144L * 8)),
            ticks = (80 * 20),
            eu = 7680,
            temperature = 3999,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Iron.item(OrePrefixes.dust).get(amount = 5),
                Materials.Nickel.item(OrePrefixes.dust).get(amount = 3),
                Materials.Cobalt.item(OrePrefixes.dust).get(amount = 2),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Kovar.getMoltenHot((144L * 10)),
            ticks = (80 * 20),
            eu = 7680,
            temperature = 4002,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    2L,
                ),
                Materials.Aluminium.item(OrePrefixes.dust).get(amount = 3),
                Materials.Copper.item(OrePrefixes.dust).get(amount = 3),
                Materials.Magnesium.item(OrePrefixes.dust).get(),
                Materials.Manganese.item(OrePrefixes.dust).get(),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Duraluminium.getMoltenHot((144L * 8)),
            ticks = (64 * 20),
            eu = 7680,
            temperature = 4111,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Chrome.item(OrePrefixes.dust).get(),
                Materials.Niobium.item(OrePrefixes.dust).get(amount = 2),
                Materials.Molybdenum.item(OrePrefixes.dust).get(amount = 2),
                Materials.Nichrome.item(OrePrefixes.dust).get(),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Inconel690.getMoltenHot((144L * 6)),
            ticks = (48 * 20),
            eu = 7680,
            temperature = 4222,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Titanium.item(OrePrefixes.dust).get(),
                Materials.Nickel.item(OrePrefixes.dust).get(),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Nitinol.getMoltenHot((144L * 2)),
            ticks = (16 * 20),
            eu = 7680,
            temperature = 4333,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Nickel.item(OrePrefixes.dust).get(amount = 2),
                Materials.Niobium.item(OrePrefixes.dust).get(),
                Materials.Aluminium.item(OrePrefixes.dust).get(amount = 2),
                Materials.Nichrome.item(OrePrefixes.dust).get(),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Inconel792.getMoltenHot((144L * 6)),
            ticks = (48 * 20),
            eu = 7680,
            temperature = 4444,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Titanium.item(OrePrefixes.dust).get(amount = 2),
                Materials.Aluminium.item(OrePrefixes.dust).get(amount = 3),
                Materials.Vanadium.item(OrePrefixes.dust).get(amount = 8),
                Materials.Chrome.item(OrePrefixes.dust).get(amount = 6),
                Materials.Molybdenum.item(OrePrefixes.dust).get(amount = 4),
                Materials.Zirconium.item(OrePrefixes.dust).get(amount = 4),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.TiBetaC.getMoltenHot((144L * 27)),
            ticks = (161 * 20),
            eu = 7680,
            temperature = 4555,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Titanium.item(OrePrefixes.dust).get(amount = 9),
                Materials.Carbon.item(OrePrefixes.dust).get(amount = 9),
                Materials.Kalium.item(OrePrefixes.dust).get(amount = 9),
                Materials.Lithium.item(OrePrefixes.dust).get(amount = 9),
                Materials.Sulfur.item(OrePrefixes.dust).get(amount = 9),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Grisium.getMoltenHot((144L * 45)),
            ticks = (315 * 20),
            eu = 7680,
            temperature = 4601,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    2L,
                ),
                Materials.Steel.item(OrePrefixes.dust).get(amount = 16),
                Materials.Titanium.item(OrePrefixes.dust).get(),
                Materials.Aluminium.item(OrePrefixes.dust).get(),
                Materials.Nickel.item(OrePrefixes.dust).get(amount = 4),
                Materials.Cobalt.item(OrePrefixes.dust).get(amount = 2),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.MaragingSteel250.getMoltenHot((144L * 24)),
            ticks = (168 * 20),
            eu = 7680,
            temperature = 4666,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Cobalt.item(OrePrefixes.dust).get(amount = 4),
                Materials.Chrome.item(OrePrefixes.dust).get(amount = 3),
                Materials.Phosphor.item(OrePrefixes.dust).get(amount = 2),
                Materials.Molybdenum.item(OrePrefixes.dust).get(),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Talonite.getMoltenHot((144L * 10)),
            ticks = (70 * 20),
            eu = 7680,
            temperature = 4770,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    4L,
                ),
                Materials.Titanium.item(OrePrefixes.dust).get(amount = 3),
                Materials.Nickel.item(OrePrefixes.dust).get(amount = 2),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Nitinol60.getMoltenHot((144L * 5)),
            ticks = (35 * 20),
            eu = 7680,
            temperature = 4701,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    3L,
                ),
                Materials.Steel.item(OrePrefixes.dust).get(amount = 16),
                Materials.Aluminium.item(OrePrefixes.dust).get(),
                Materials.Titanium.item(OrePrefixes.dust).get(),
                Materials.Nickel.item(OrePrefixes.dust).get(amount = 4),
                Materials.Cobalt.item(OrePrefixes.dust).get(amount = 2),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.MaragingSteel300.getMoltenHot((144L * 24)),
            ticks = (192 * 20),
            eu = 7680,
            temperature = 4300,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    2L,
                ),
                Materials.Chrome.item(OrePrefixes.dust).get(amount = 3),
                Materials.Cobalt.item(OrePrefixes.dust).get(amount = 7),
                Materials.Phosphor.item(OrePrefixes.dust).get(amount = 2),
                Materials.Molybdenum.item(OrePrefixes.dust).get(),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Stellite.getMoltenHot((144L * 13)),
            ticks = (104 * 20),
            eu = 7680,
            temperature = 4121,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Chrome.item(OrePrefixes.dust).get(amount = 26),
                Materials.Nickel.item(OrePrefixes.dust).get(amount = 6),
                Materials.Molybdenum.item(OrePrefixes.dust).get(amount = 4),
                Materials.Copper.item(OrePrefixes.dust).get(amount = 20),
                Materials.Tungsten.item(OrePrefixes.dust).get(amount = 4),
                Materials.Steel.item(OrePrefixes.dust).get(amount = 40),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Zeron100.getMoltenHot((144L * 100)),
            ticks = (600 * 20),
            eu = 7680,
            temperature = 5100,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Zeron100.item(OrePrefixes.dust).get(amount = 16),
                Materials.Gadolinium.item(OrePrefixes.dust).get(amount = 5),
                Materials.Aluminium.item(OrePrefixes.dust).get(amount = 3),
                Materials.Tin.item(OrePrefixes.dust).get(amount = 2),
                Materials.Titanium.item(OrePrefixes.dust).get(amount = 12),
                Materials.Osmiridium.item(OrePrefixes.dust).get(amount = 6),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.CinobiteA243.getMoltenHot((144L * 44)),
            ticks = (264 * 20),
            eu = 122880,
            temperature = 7350,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    3L,
                ),
                Materials.Yttrium.item(OrePrefixes.dust).get(amount = 8),
                Materials.Molybdenum.item(OrePrefixes.dust).get(amount = 16),
                Materials.Chrome.item(OrePrefixes.dust).get(amount = 8),
                Materials.Titanium.item(OrePrefixes.dust).get(amount = 8),
                Materials.Nickel.item(OrePrefixes.dust).get(amount = 60),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.HastelloyN.getMoltenHot((144L * 100)),
            ticks = (800 * 20),
            eu = 7680,
            temperature = 4350,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.HastelloyN.item(OrePrefixes.dust).get(amount = 8),
                Materials.Samarium.item(OrePrefixes.dust).get(amount = 2),
                Materials.Tungsten.item(OrePrefixes.dust).get(amount = 4),
                Materials.Aluminium.item(OrePrefixes.dust).get(amount = 6),
                Materials.Nickel.item(OrePrefixes.dust).get(amount = 8),
                Materials.Carbon.item(OrePrefixes.dust).get(amount = 2),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Lafium.getMoltenHot((144L * 30)),
            ticks = (180 * 20),
            eu = 30720,
            temperature = 6105,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Stellite.item(OrePrefixes.dust).get(amount = 15),
                Materials.EnergeticAlloy.item(OrePrefixes.dust).get(amount = 5),
                Materials.Carbon.item(OrePrefixes.dust).get(amount = 5),
                Materials.Gallium.item(OrePrefixes.dust).get(amount = 5),
                Materials.Americium.item(OrePrefixes.dust).get(amount = 5),
                Materials.Palladium.item(OrePrefixes.dust).get(amount = 5),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Quantum.getMoltenHot((144L * 40)),
            ticks = (240 * 20),
            eu = 2000000,
            temperature = 12000,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    2L,
                ),
                Materials.Stellite.item(OrePrefixes.dust).get(amount = 15),
                Materials.Inconel792.item(OrePrefixes.dust).get(amount = 16),
                Materials.EglinSteel.item(OrePrefixes.dust).get(amount = 10),
                Materials.NaquadahEnriched.item(OrePrefixes.dust).get(amount = 8),
                Materials.Cerium.item(OrePrefixes.dust).get(amount = 6),
                Materials.Antimony.item(OrePrefixes.dust).get(amount = 4),
                Materials.Platinum.item(OrePrefixes.dust).get(amount = 4),
                Materials.TungstenSteel.item(OrePrefixes.dust).get(amount = 8),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.Pikyonium64B.getMoltenHot((144L * 71)),
            ticks = (336 * 20),
            eu = 500000,
            temperature = 9900,
        )

        MachineRecipes.blastSmelter(
            inputs = arrayOf<ItemStack?>(
                ItemList.Circuit_Integrated.getWithDamage(
                    0L,
                    1L,
                ),
                Materials.Iron.item(OrePrefixes.dust).get(amount = 3),
                Materials.Carbon.item(OrePrefixes.dust).get(),
                Materials.Vanadium.item(OrePrefixes.dust).get(amount = 5),
                Materials.Titan.item(OrePrefixes.dust).get(amount = 40),
                Materials.Aluminium.item(OrePrefixes.dust).get(amount = 6),
            ),
            output = null,
            fluidInput = null,
            fluidOutput = Materials.BT6.getMoltenHot((144L * 55)),
            ticks = (300 * 20),
            eu = 1920,
            temperature = 3200,
        )
    }
}
