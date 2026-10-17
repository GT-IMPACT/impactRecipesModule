package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OreDictNames
import gregtech.api.enums.OrePrefixes

internal class ImpactTankAndHatchCraftingRecipes {

    internal fun register() {
        val singleTankRecipe = arrayOf<Any?>(
            "HFH",
            "PVP",
            "CFC",
            'H',
            OrePrefixes.pipeMedium.get(Materials.StainlessSteel),
            'F',
            GregTechItems.FieldGeneratorLV.get(),
            'P',
            GregTechItems.ElectricPumpMV.get(),
            'V',
            GregTechItems.HullMV.get(),
            'C',
            OrePrefixes.circuit.get(Materials.Data),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.SingleTank.get(),
            flags = 0L,
            recipe = singleTankRecipe,
        )

        val tankHatchRecipe = arrayOf<Any?>(
            "PRP",
            "UFU",
            "PRP",
            'P',
            RecipeItems.ore(
                prefix = OrePrefixes.pipeHuge,
                material = Materials.Titanium,
                count = 1,
            ),
            'R',
            GregTechItems.HatchOutputEV.get(),
            'U',
            GregTechItems.HatchInputEV.get(),
            'F',
            GregTechItems.ElectricPumpHV.get(),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.TankHatch.get(),
            flags = 0L,
            recipe = tankHatchRecipe,
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ULVConveyorModule.get(),
            flags = ImpactRecipeFlags.componentCrafting,
            recipe = arrayOf<Any?>(
                "PPP",
                "MWM",
                "PPP",
                'P',
                VanillaItems.Leather.get(),
                'M',
                ImpactItems.ULVMotor.get(),
                'W',
                OrePrefixes.cableGt01.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ULVConveyorModule.get(),
            flags = ImpactRecipeFlags.componentCrafting,
            recipe = arrayOf<Any?>(
                "PPP",
                "MWM",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'M',
                ImpactItems.ULVMotor.get(),
                'W',
                OrePrefixes.cableGt01.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ULVPump.get(),
            flags = ImpactRecipeFlags.componentCrafting,
            recipe = arrayOf<Any?>(
                "SXO",
                "dPw",
                "OMS",
                'M',
                ImpactItems.ULVMotor.get(),
                'O',
                OrePrefixes.ring.get(Materials.Paper),
                'X',
                OrePrefixes.rotor.get(Materials.Lead),
                'S',
                OrePrefixes.screw.get(Materials.Lead),
                'P',
                OrePrefixes.pipeMedium.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ULVPump.get(),
            flags = ImpactRecipeFlags.componentCrafting,
            recipe = arrayOf<Any?>(
                "SXO",
                "dPw",
                "OMS",
                'M',
                ImpactItems.ULVMotor.get(),
                'O',
                OrePrefixes.ring.get(Materials.Rubber),
                'X',
                OrePrefixes.rotor.get(Materials.Lead),
                'S',
                OrePrefixes.screw.get(Materials.Lead),
                'P',
                OrePrefixes.pipeMedium.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ULVPump.get(),
            flags = ImpactRecipeFlags.componentCrafting,
            recipe = arrayOf<Any?>(
                "SXO",
                "dPw",
                "OMS",
                'M',
                ImpactItems.ULVMotor.get(),
                'O',
                OrePrefixes.ring.get(Materials.StyreneButadieneRubber),
                'X',
                OrePrefixes.rotor.get(Materials.Lead),
                'S',
                OrePrefixes.screw.get(Materials.Lead),
                'P',
                OrePrefixes.pipeMedium.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ULVMotor.get(),
            flags = ImpactRecipeFlags.componentCrafting,
            recipe = arrayOf<Any?>(
                "CWR",
                "WIW",
                "RWC",
                'I',
                OrePrefixes.bolt.get(Materials.IronMagnetic),
                'R',
                OrePrefixes.stick.get(Materials.Iron),
                'W',
                OrePrefixes.wireFine.get(Materials.Tin),
                'C',
                OrePrefixes.cableGt01.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ULVRobotArm.get(),
            flags = ImpactRecipeFlags.componentCrafting,
            recipe = arrayOf<Any?>(
                "CCC",
                "MSM",
                "PES",
                'S',
                OrePrefixes.stick.get(Materials.WroughtIron),
                'M',
                ImpactItems.ULVMotor.get(),
                'P',
                ImpactItems.ULVPiston.get(),
                'E',
                OrePrefixes.circuit.get(Materials.Primitive),
                'C',
                OrePrefixes.cableGt01.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ULVPiston.get(),
            flags = ImpactRecipeFlags.componentCrafting,
            recipe = arrayOf<Any?>(
                "CPP",
                "dSS",
                "CMG",
                'P',
                OrePrefixes.plate.get(Materials.WroughtIron),
                'S',
                OrePrefixes.stick.get(Materials.WroughtIron),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.WroughtIron),
                'M',
                ImpactItems.ULVMotor.get(),
                'C',
                OrePrefixes.screw.get(Materials.WroughtIron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorSemiTurbineULV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "GCG",
                "EME",
                "PWP",
                'M',
                GregTechItems.HullULV.get(),
                'P',
                ImpactItems.ULVPiston.get(),
                'E',
                ImpactItems.ULVMotor.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Primitive),
                'W',
                OrePrefixes.cableGt01.get(Materials.Lead),
                'G',
                OrePrefixes.gearGt.get(Materials.WroughtIron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorSteamTurbineULV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "PCP",
                "RHR",
                "EWE",
                'H',
                GregTechItems.HullULV.get(),
                'E',
                ImpactItems.ULVMotor.get(),
                'R',
                OrePrefixes.rotor.get(Materials.Lead),
                'C',
                OrePrefixes.circuit.get(Materials.Primitive),
                'W',
                OrePrefixes.cableGt01.get(Materials.Lead),
                'P',
                OrePrefixes.pipeSmall.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorDieselULV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "PCP",
                "EME",
                "GWG",
                'M',
                GregTechItems.HullULV.get(),
                'P',
                ImpactItems.ULVPiston.get(),
                'E',
                ImpactItems.ULVMotor.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Primitive),
                'W',
                OrePrefixes.cableGt01.get(Materials.Lead),
                'G',
                OrePrefixes.gearGt.get(Materials.WroughtIron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorGasTurbineULV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "CRC",
                "RHR",
                "EWE",
                'H',
                GregTechItems.HullULV.get(),
                'E',
                ImpactItems.ULVMotor.get(),
                'R',
                OrePrefixes.rotor.get(Materials.Lead),
                'C',
                OrePrefixes.circuit.get(Materials.Primitive),
                'W',
                OrePrefixes.cableGt01.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.MachineULVAssembler.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "RCR",
                "OMO",
                "WCW",
                'M',
                GregTechItems.HullULV.get(),
                'R',
                ImpactItems.ULVRobotArm.get(),
                'O',
                ImpactItems.ULVConveyorModule.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Primitive),
                'W',
                OrePrefixes.cableGt01.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CasingCokeOvenBrick.get(),
            flags = ImpactRecipeFlags.reversible,
            recipe = arrayOf<Any?>(
                "BB",
                "BB",
                'B',
                ImpactItems.CokeOvenBrick.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HatchOutputPrim.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "CBC",
                " C ",
                'B',
                GregTechItems.CasingCokeOvenBrick.get(),
                'C',
                VanillaItems.StoneSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.BusInputPrim.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "C",
                "B",
                'B',
                GregTechItems.CasingCokeOvenBrick.get(),
                'C',
                VanillaItems.Chest32767.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.BusOutputPrim.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "B",
                "C",
                'B',
                GregTechItems.CasingCokeOvenBrick.get(),
                'C',
                VanillaItems.Chest32767.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.MachineCokeOven.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                " B ",
                "BFB",
                " B ",
                'B',
                ImpactItems.CokeOvenBrick.get(),
                'F',
                OreDictNames.craftingFurnace,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorSemiTurbineLV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "GCG",
                "EME",
                "PWP",
                'M',
                GregTechItems.HullLV.get(),
                'P',
                GregTechItems.ElectricPistonLV.get(),
                'E',
                GregTechItems.ElectricMotorLV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'W',
                OrePrefixes.cableGt01.get(Materials.Tin),
                'G',
                OrePrefixes.gearGt.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorSemiTurbineMV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "GCG",
                "EME",
                "PWP",
                'M',
                GregTechItems.HullMV.get(),
                'P',
                GregTechItems.ElectricPistonMV.get(),
                'E',
                GregTechItems.ElectricMotorMV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'W',
                OrePrefixes.cableGt01.get(Materials.Copper),
                'G',
                OrePrefixes.gearGt.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorSemiTurbineHV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "GCG",
                "EME",
                "PWP",
                'M',
                GregTechItems.HullHV.get(),
                'P',
                GregTechItems.ElectricPistonHV.get(),
                'E',
                GregTechItems.ElectricMotorHV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'W',
                OrePrefixes.cableGt01.get(Materials.Gold),
                'G',
                OrePrefixes.gearGt.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.MachineMultiFarm.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "ROR",
                "CHC",
                "PWP",
                'H',
                GregTechItems.HullMV.get(),
                'W',
                OrePrefixes.cableGt02.get(Materials.Copper),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'P',
                GregTechItems.ElectricPumpMV.get(),
                'R',
                GregTechItems.RobotArmMV.get(),
                'O',
                OreDictNames.craftingDiamondBlade,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorSemiTurbineEV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "GCG",
                "EME",
                "PWP",
                'M',
                GregTechItems.HullEV.get(),
                'P',
                GregTechItems.ElectricPistonEV.get(),
                'E',
                GregTechItems.ElectricMotorEV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'W',
                OrePrefixes.cableGt01.get(Materials.Aluminium),
                'G',
                OrePrefixes.gearGt.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorSteamTurbineEV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "PCP",
                "RHR",
                "EWE",
                'H',
                GregTechItems.HullEV.get(),
                'E',
                GregTechItems.ElectricMotorEV.get(),
                'R',
                OrePrefixes.rotor.get(Materials.StainlessSteel),
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'W',
                OrePrefixes.cableGt01.get(Materials.Aluminium),
                'P',
                OrePrefixes.pipeLarge.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.GeneratorDieselEV.get(),
            flags = ImpactRecipeFlags.dismantleable,
            recipe = arrayOf<Any?>(
                "PCP",
                "EME",
                "GWG",
                'M',
                GregTechItems.HullEV.get(),
                'P',
                GregTechItems.ElectricPistonEV.get(),
                'E',
                GregTechItems.ElectricMotorEV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'W',
                OrePrefixes.cableGt01.get(Materials.Aluminium),
                'G',
                OrePrefixes.gearGt.get(Materials.Titanium),
            ),
        )
    }
}
