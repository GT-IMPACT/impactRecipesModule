package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactCapacitorPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                GregTechItems.BatteryTurboCharger4by4IV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.HastelloyC276,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 8,
                ),
                GregTechItems.CircuitChipHPIC.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Platinum,
                    count = 16,
                ),
                GregTechItems.ReactorCoolantHe6.get(),
                GregTechItems.ReactorCoolantHe6.get(),
                GregTechItems.ElectricPumpIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeSmall,
                    material = Materials.Inconel690,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Kovar,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.TungstenSteel,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSE,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSG,
                    count = 64,
                ),
            ),
            output = ImpactItems.LapPowerStation.get(),
            fluidInputs = null,
            ticks = 200 * 20,
            eu = 4092,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
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
            output = ImpactItems.LscLapotronicEnergyUnit1.get(),
            fluidInputs = null,
            ticks = 100 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
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
            output = ImpactItems.LscLapotronicEnergyUnit6.get(),
            fluidInputs = null,
            ticks = 100 * 20,
            eu = 7680,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
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
            output = ImpactItems.LscLapotronicEnergyUnit2.get(),
            fluidInputs = null,
            ticks = 120 * 20,
            eu = 30720,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
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
            output = ImpactItems.LscLapotronicEnergyUnit3.get(),
            fluidInputs = null,
            ticks = 140 * 20,
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
            ticks = 160 * 20,
            eu = 500000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
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
            output = ImpactItems.LscLapotronicEnergyUnit7.get(),
            fluidInputs = null,
            ticks = 180 * 20,
            eu = 2000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                GregTechItems.MysteriousCrystalModule.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Americium,
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
            output = ImpactItems.LscLapotronicEnergyUnit8.get(),
            fluidInputs = null,
            ticks = 200 * 20,
            eu = 8000000,
        )
    }
}
