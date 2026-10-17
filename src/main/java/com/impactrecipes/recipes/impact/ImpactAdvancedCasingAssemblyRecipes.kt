package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactAdvancedCasingAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Iridium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.NiobiumTitanium,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Palladium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HastelloyC276,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            fluid = null,
            output = ImpactItems.LSCC.get(),
            ticks = 600,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSLA,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 8,
                ),
            ),
            fluid = null,
            output = ImpactItems.SpaceSatelliteCasing.get(amount = 2),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Ultimet,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 8,
                ),
            ),
            fluid = null,
            output = ImpactItems.TowerCasing.get(amount = 2),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Zamak,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel300,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Cobalt,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Copper,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
            ),
            fluid = Materials.HSSE.getMolten(288),
            output = ImpactItems.ComputerCasing.get(amount = 2),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 8,
                ),
            ),
            fluid = null,
            output = ImpactItems.InsideBlock2.get(amount = 2),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.HSLA,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Vanadium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.BlueSteel,
                    count = 8,
                ),
            ),
            fluid = null,
            output = ImpactItems.SpaceElevatorCasing.get(amount = 2),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.QuantumPartHelmet.get(),
                ImpactItems.QuantumCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GregTechItems.EnergyLapotronicOrb.get(),
                GregTechItems.SensorIV.get(),
                GregTechItems.FieldGeneratorEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = Materials.Titanium.getMolten(1728),
            output = ModItemVariant(
                item = IC2Items.QuantumHelmet,
                meta = 26,
            ).get(),
            ticks = 1500,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.QuantumPartChestplate.get(),
                ImpactItems.QuantumCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 6,
                ),
                GregTechItems.EnergyLapotronicOrb.get(),
                GregTechItems.FieldGeneratorEV.get(amount = 3),
                GregTechItems.ElectricMotorIV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(11),
            ),
            fluid = Materials.Titanium.getMolten(2880),
            output = ModItemVariant(
                item = IC2Items.QuantumChestplate,
                meta = 26,
            ).get(),
            ticks = 1500,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.QuantumPartLeggings.get(),
                ImpactItems.QuantumCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 6,
                ),
                GregTechItems.EnergyLapotronicOrb.get(),
                GregTechItems.FieldGeneratorEV.get(amount = 2),
                GregTechItems.ElectricMotorIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(12),
            ),
            fluid = Materials.Titanium.getMolten(2304),
            output = ModItemVariant(
                item = IC2Items.QuantumLeggings,
                meta = 26,
            ).get(),
            ticks = 1500,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.QuantumPartBoots.get(),
                ImpactItems.QuantumCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GregTechItems.EnergyLapotronicOrb.get(),
                GregTechItems.FieldGeneratorEV.get(),
                GregTechItems.ElectricPistonIV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(12),
            ),
            fluid = Materials.Titanium.getMolten(1440),
            output = ModItemVariant(
                item = IC2Items.QuantumBoots,
                meta = 26,
            ).get(),
            ticks = 1500,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.Glass,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Tin,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = ImpactItems.TenKCell.get(),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = ImpactItems.TenKCell.get(amount = 3),
            secondaryInput = GT_Utility.getIntegratedCircuit(3),
            output = ImpactItems.ThirtyKCell.get(),
            ticks = 300,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = ImpactItems.ThirtyKCell.get(amount = 2),
            secondaryInput = GT_Utility.getIntegratedCircuit(2),
            output = ImpactItems.SixtyKCell.get(),
            ticks = 600,
            eu = 90,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateAlloy,
                material = Materials.Carbon,
                count = 5,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(5),
            output = ImpactItems.CarbonPartHelmet.get(),
            ticks = 500,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateAlloy,
                material = Materials.Carbon,
                count = 8,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(8),
            output = ImpactItems.CarbonPartChestplate.get(),
            ticks = 800,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateAlloy,
                material = Materials.Carbon,
                count = 7,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(7),
            output = ImpactItems.CarbonPartLeggings.get(),
            ticks = 700,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateAlloy,
                material = Materials.Carbon,
                count = 4,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(4),
            output = ImpactItems.CarbonPartBoots.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = ImpactItems.CarbonPartHelmet.get(),
            secondaryInput = ModItemVariant(
                item = IC2Items.NightvisionGoggles,
                meta = GT_Values.W.toInt(),
            ).get(),
            output = ImpactItems.CarbonPartHelmetNightVision.get(),
            ticks = 600,
            eu = 250,
        )
    }
}
