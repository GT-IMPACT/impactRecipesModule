package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactMachineDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorSemiTurbineULV.get(),
            outputs = arrayOf(
                GregTechItems.HullULV.get(),
                ImpactItems.ULVPiston.get(amount = 2),
                ImpactItems.ULVMotor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Lead,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.WroughtIron,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorSteamTurbineULV.get(),
            outputs = arrayOf(
                GregTechItems.HullULV.get(),
                ImpactItems.ULVMotor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Lead,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Lead,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeSmall,
                    material = Materials.Lead,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorDieselULV.get(),
            outputs = arrayOf(
                GregTechItems.HullULV.get(),
                ImpactItems.ULVPiston.get(amount = 2),
                ImpactItems.ULVMotor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Lead,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.WroughtIron,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorGasTurbineULV.get(),
            outputs = arrayOf(
                GregTechItems.HullULV.get(),
                ImpactItems.ULVMotor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Lead,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Lead,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.MachineULVAssembler.get(),
            outputs = arrayOf(
                GregTechItems.HullULV.get(),
                ImpactItems.ULVRobotArm.get(amount = 2),
                ImpactItems.ULVConveyorModule.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Lead,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.CasingCokeOvenBrick.get(),
            outputs = arrayOf(
                ImpactItems.CokeOvenBrick.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.HatchOutputPrim.get(),
            outputs = arrayOf(
                GregTechItems.CasingCokeOvenBrick.get(),
                VanillaItems.StoneSlab.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.BusInputPrim.get(),
            outputs = arrayOf(
                GregTechItems.CasingCokeOvenBrick.get(),
                VanillaItems.Chest.get(),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.BusOutputPrim.get(),
            outputs = arrayOf(
                GregTechItems.CasingCokeOvenBrick.get(),
                VanillaItems.Chest.get(),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.MachineCokeOven.get(),
            outputs = arrayOf(
                ImpactItems.CokeOvenBrick.get(amount = 4),
                RecipeItems.ore(
                    name = "craftingFurnace",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorSemiTurbineLV.get(),
            outputs = arrayOf(
                GregTechItems.HullLV.get(),
                GregTechItems.ElectricPistonLV.get(amount = 2),
                GregTechItems.ElectricMotorLV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorSemiTurbineMV.get(),
            outputs = arrayOf(
                GregTechItems.HullMV.get(),
                GregTechItems.ElectricPistonMV.get(amount = 2),
                GregTechItems.ElectricMotorMV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorSemiTurbineHV.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                GregTechItems.ElectricPistonHV.get(amount = 2),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.MachineMultiFarm.get(),
            outputs = arrayOf(
                GregTechItems.HullMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                GregTechItems.ElectricPumpMV.get(amount = 2),
                GregTechItems.RobotArmMV.get(amount = 2),
                RecipeItems.ore(
                    name = "craftingDiamondBlade",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorSemiTurbineEV.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricPistonEV.get(amount = 2),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Titanium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorSteamTurbineEV.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Titanium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.GeneratorDieselEV.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                GregTechItems.ElectricPistonEV.get(amount = 2),
                GregTechItems.ElectricMotorEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Titanium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }
}
