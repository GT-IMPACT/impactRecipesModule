package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactCapacitorDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.LscLapotronicEnergyUnit1.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                GregTechItems.EnergyLapotronicOrb.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Platinum,
                    count = 8,
                ),
                GregTechItems.CircuitChipPIC.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.TungstenSteel,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HastelloyC276,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSG,
                    count = 64,
                ),
            ),
            ticks = 1000 * 20,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.LscLapotronicEnergyUnit6.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                GregTechItems.EnergyCrystalIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Platinum,
                    count = 8,
                ),
                GregTechItems.CircuitChipPIC.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.TungstenSteel,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HastelloyC276,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSG,
                    count = 64,
                ),
            ),
            ticks = 1000 * 20,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.LscLapotronicEnergyUnit2.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                GregTechItems.EnergyLapotronicOrb2.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.NiobiumTitanium,
                    count = 8,
                ),
                GregTechItems.CircuitChipHPIC.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.YttriumBariumCuprate,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HastelloyN,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 64,
                ),
            ),
            ticks = 1200 * 20,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.LscLapotronicEnergyUnit3.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                GregTechItems.EnergyModule.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Osmiridium,
                    count = 8,
                ),
                GregTechItems.CircuitChipUHPIC.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Naquadah,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Lafium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSS,
                    count = 64,
                ),
            ),
            ticks = 1400 * 20,
            eu = 122880,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                GregTechItems.EnergyCluster.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.NaquadahAlloy,
                    count = 8,
                ),
                GregTechItems.CircuitChipNPIC.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Duranium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CinobiteA243,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Tritanium,
                    count = 64,
                ),
            ),
            output = ImpactItems.LscLapotronicEnergyUnit4.get(),
            fluidInputs = null,
            ticks = 1600 * 20,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.LscLapotronicEnergyUnit7.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                GregTechItems.MysteriousCrystalOrb.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Americium,
                    count = 8,
                ),
                GregTechItems.CircuitChipPPIC.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Europium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Pikyonium64B,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Neutronium,
                    count = 64,
                ),
            ),
            ticks = 1800 * 20,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.LscLapotronicEnergyUnit8.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                GregTechItems.MysteriousCrystalModule.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Neutronium,
                    count = 8,
                ),
                GregTechItems.CircuitChipQPIC.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Draconium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Quantum,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Phoenixite,
                    count = 64,
                ),
            ),
            ticks = 2000 * 20,
            eu = 500000,
        )
    }
}
