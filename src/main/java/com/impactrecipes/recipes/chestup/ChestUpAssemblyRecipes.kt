package com.impactrecipes.recipes.chestup

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ChestUpAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.WroughtIron,
                    count = 8,
                ),
                VanillaItems.Chest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.WroughtIronChest.get(),
            ticks = 80,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 8,
                ),
                ChestUpItems.WroughtIronChest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.SteelChest.get(),
            ticks = 90,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Aluminium,
                    count = 8,
                ),
                ChestUpItems.SteelChest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.AluminiumChest.get(),
            ticks = 100,
            eu = 64,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSLA,
                    count = 8,
                ),
                ChestUpItems.AluminiumChest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.HSLAChest.get(),
            ticks = 110,
            eu = 256,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 8,
                ),
                ChestUpItems.HSLAChest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.TitaniumChest.get(),
            ticks = 120,
            eu = 1024,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TungstenSteel,
                    count = 8,
                ),
                ChestUpItems.TitaniumChest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.TungstenSteelChest.get(),
            ticks = 130,
            eu = 4096,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Chrome,
                    count = 8,
                ),
                ChestUpItems.TungstenSteelChest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.ChromeChest.get(),
            ticks = 140,
            eu = 16384,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Iridium,
                    count = 8,
                ),
                ChestUpItems.ChromeChest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.IridiumChest.get(),
            ticks = 150,
            eu = 65536,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Osmium,
                    count = 8,
                ),
                ChestUpItems.IridiumChest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.OsmiumChest.get(),
            ticks = 160,
            eu = 262144,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Neutronium,
                    count = 8,
                ),
                ChestUpItems.OsmiumChest.get(),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChestUpItems.NeutroniumChest.get(),
            ticks = 170,
            eu = 1048576,
        )
    }
}
