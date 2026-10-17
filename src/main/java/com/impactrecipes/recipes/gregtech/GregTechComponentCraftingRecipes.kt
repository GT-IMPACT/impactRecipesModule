package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.GT_Mod
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechComponentCraftingRecipes {

    internal fun register() {
        if (GT_Mod.gregtechproxy.mComponentAssembler) {
            CraftingRecipes.shapedWithFlags(
                output = ImpactItems.MachineLVComponentAssembler.get(),
                flags = GregTechRecipeFlags.dismantleable,
                recipe = arrayOf<Any?>(
                    "PCP",
                    "RHR",
                    "WCW",
                    'P',
                    ImpactItems.ULVPiston.get(),
                    'R',
                    ImpactItems.ULVRobotArm.get(),
                    'H',
                    GregTechItems.HullLV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Basic),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ImpactItems.MachineMVComponentAssembler.get(),
                flags = GregTechRecipeFlags.dismantleable,
                recipe = arrayOf<Any?>(
                    "PCP",
                    "RHR",
                    "WCW",
                    'P',
                    GregTechItems.ElectricPistonLV.get(),
                    'R',
                    GregTechItems.RobotArmLV.get(),
                    'H',
                    GregTechItems.HullMV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Good),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ImpactItems.MachineHVComponentAssembler.get(),
                flags = GregTechRecipeFlags.dismantleable,
                recipe = arrayOf<Any?>(
                    "PCP",
                    "RHR",
                    "WCW",
                    'P',
                    GregTechItems.ElectricPistonMV.get(),
                    'R',
                    GregTechItems.RobotArmMV.get(),
                    'H',
                    GregTechItems.HullHV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Advanced),
                    'W',
                    OrePrefixes.cableGt02.get(Materials.Gold),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ImpactItems.MachineEVComponentAssembler.get(),
                flags = GregTechRecipeFlags.dismantleable,
                recipe = arrayOf<Any?>(
                    "PCP",
                    "RHR",
                    "WCW",
                    'P',
                    GregTechItems.ElectricPistonHV.get(),
                    'R',
                    GregTechItems.RobotArmHV.get(),
                    'H',
                    GregTechItems.HullEV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Data),
                    'W',
                    OrePrefixes.cableGt02.get(Materials.Aluminium),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ImpactItems.MachineIVComponentAssembler.get(),
                flags = GregTechRecipeFlags.dismantleable,
                recipe = arrayOf<Any?>(
                    "PCP",
                    "RHR",
                    "WCW",
                    'P',
                    GregTechItems.ElectricPistonEV.get(),
                    'R',
                    GregTechItems.RobotArmEV.get(),
                    'H',
                    GregTechItems.HullIV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Elite),
                    'W',
                    OrePrefixes.cableGt04.get(Materials.TungstenSteel),
                ),
            )
        } else {
            //===Motors===\\
            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricMotorLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CWR",
                    "WIW",
                    "RWC",
                    'I',
                    OrePrefixes.stick.get(Materials.IronMagnetic),
                    'R',
                    OrePrefixes.stick.get(Materials.Iron),
                    'W',
                    OrePrefixes.wireGt01.get(Materials.Copper),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricMotorLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CWR",
                    "WIW",
                    "RWC",
                    'I',
                    OrePrefixes.stick.get(Materials.SteelMagnetic),
                    'R',
                    OrePrefixes.stick.get(Materials.Steel),
                    'W',
                    OrePrefixes.wireGt01.get(Materials.Copper),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricMotorMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CWR",
                    "WIW",
                    "RWC",
                    'I',
                    OrePrefixes.stick.get(Materials.SteelMagnetic),
                    'R',
                    OrePrefixes.stick.get(Materials.Aluminium),
                    'W',
                    OrePrefixes.wireGt02.get(Materials.Cupronickel),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricMotorHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CWR",
                    "WIW",
                    "RWC",
                    'I',
                    OrePrefixes.stick.get(Materials.SteelMagnetic),
                    'R',
                    OrePrefixes.stick.get(Materials.StainlessSteel),
                    'W',
                    OrePrefixes.wireGt02.get(Materials.Electrum),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Silver),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricMotorEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CWR",
                    "WIW",
                    "RWC",
                    'I',
                    OrePrefixes.stick.get(Materials.NeodymiumMagnetic),
                    'R',
                    OrePrefixes.stick.get(Materials.Titanium),
                    'W',
                    OrePrefixes.wireGt02.get(Materials.AnnealedCopper),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricMotorIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CWR",
                    "WIW",
                    "RWC",
                    'I',
                    OrePrefixes.stick.get(Materials.NeodymiumMagnetic),
                    'R',
                    OrePrefixes.stick.get(Materials.TungstenSteel),
                    'W',
                    OrePrefixes.wireGt02.get(Materials.Graphene),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tungsten),
                ),
            )

            //===Pumps===\\
            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorLV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Paper),
                    'X',
                    OrePrefixes.rotor.get(Materials.Tin),
                    'S',
                    OrePrefixes.screw.get(Materials.Tin),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Bronze),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorLV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Rubber),
                    'X',
                    OrePrefixes.rotor.get(Materials.Tin),
                    'S',
                    OrePrefixes.screw.get(Materials.Tin),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Bronze),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorLV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.StyreneButadieneRubber),
                    'X',
                    OrePrefixes.rotor.get(Materials.Tin),
                    'S',
                    OrePrefixes.screw.get(Materials.Tin),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Bronze),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorLV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Silicone),
                    'X',
                    OrePrefixes.rotor.get(Materials.Tin),
                    'S',
                    OrePrefixes.screw.get(Materials.Tin),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Bronze),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorMV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Rubber),
                    'X',
                    OrePrefixes.rotor.get(Materials.Bronze),
                    'S',
                    OrePrefixes.screw.get(Materials.Bronze),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Steel),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorMV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.StyreneButadieneRubber),
                    'X',
                    OrePrefixes.rotor.get(Materials.Bronze),
                    'S',
                    OrePrefixes.screw.get(Materials.Bronze),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Steel),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorMV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Silicone),
                    'X',
                    OrePrefixes.rotor.get(Materials.Bronze),
                    'S',
                    OrePrefixes.screw.get(Materials.Bronze),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Steel),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorHV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Rubber),
                    'X',
                    OrePrefixes.rotor.get(Materials.Steel),
                    'S',
                    OrePrefixes.screw.get(Materials.Steel),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Gold),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.StainlessSteel),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorHV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.StyreneButadieneRubber),
                    'X',
                    OrePrefixes.rotor.get(Materials.Steel),
                    'S',
                    OrePrefixes.screw.get(Materials.Steel),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Gold),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.StainlessSteel),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorHV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Silicone),
                    'X',
                    OrePrefixes.rotor.get(Materials.Steel),
                    'S',
                    OrePrefixes.screw.get(Materials.Steel),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Gold),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.StainlessSteel),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorEV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Rubber),
                    'X',
                    OrePrefixes.rotor.get(Materials.StainlessSteel),
                    'S',
                    OrePrefixes.screw.get(Materials.StainlessSteel),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Titanium),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorEV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.StyreneButadieneRubber),
                    'X',
                    OrePrefixes.rotor.get(Materials.StainlessSteel),
                    'S',
                    OrePrefixes.screw.get(Materials.StainlessSteel),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Titanium),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorEV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Silicone),
                    'X',
                    OrePrefixes.rotor.get(Materials.StainlessSteel),
                    'S',
                    OrePrefixes.screw.get(Materials.StainlessSteel),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.Titanium),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorIV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.StyreneButadieneRubber),
                    'X',
                    OrePrefixes.rotor.get(Materials.TungstenSteel),
                    'S',
                    OrePrefixes.screw.get(Materials.TungstenSteel),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tungsten),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.TungstenSteel),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPumpIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SXO",
                    "dPw",
                    "OMW",
                    'M',
                    GregTechItems.ElectricMotorIV.get(),
                    'O',
                    OrePrefixes.ring.get(Materials.Silicone),
                    'X',
                    OrePrefixes.rotor.get(Materials.TungstenSteel),
                    'S',
                    OrePrefixes.screw.get(Materials.TungstenSteel),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tungsten),
                    'P',
                    OrePrefixes.pipeMedium.get(Materials.TungstenSteel),
                ),
            )

            //===Conveyors===\\
            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorLV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                    'R',
                    OrePrefixes.plate.get(Materials.Rubber),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorLV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                    'R',
                    OrePrefixes.plate.get(Materials.StyreneButadieneRubber),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorLV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                    'R',
                    OrePrefixes.plate.get(Materials.Silicone),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorMV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                    'R',
                    OrePrefixes.plate.get(Materials.Rubber),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorMV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                    'R',
                    OrePrefixes.plate.get(Materials.StyreneButadieneRubber),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorMV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                    'R',
                    OrePrefixes.plate.get(Materials.Silicone),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorHV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Gold),
                    'R',
                    OrePrefixes.plate.get(Materials.Rubber),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorHV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Gold),
                    'R',
                    OrePrefixes.plate.get(Materials.StyreneButadieneRubber),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorHV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Gold),
                    'R',
                    OrePrefixes.plate.get(Materials.Silicone),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorEV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                    'R',
                    OrePrefixes.plate.get(Materials.Rubber),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorEV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                    'R',
                    OrePrefixes.plate.get(Materials.StyreneButadieneRubber),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorEV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                    'R',
                    OrePrefixes.plate.get(Materials.Silicone),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorIV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tungsten),
                    'R',
                    OrePrefixes.plate.get(Materials.StyreneButadieneRubber),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ConveyorModuleIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "RRR",
                    "MCM",
                    "RRR",
                    'M',
                    GregTechItems.ElectricMotorIV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tungsten),
                    'R',
                    OrePrefixes.plate.get(Materials.Silicone),
                ),
            )

            //===Pistons===\\
            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPistonLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "PPP",
                    "CSS",
                    "CMG",
                    'P',
                    OrePrefixes.plate.get(Materials.Steel),
                    'S',
                    OrePrefixes.stick.get(Materials.Steel),
                    'G',
                    OrePrefixes.gearGtSmall.get(Materials.Steel),
                    'M',
                    GregTechItems.ElectricMotorLV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPistonMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "PPP",
                    "CSS",
                    "CMG",
                    'P',
                    OrePrefixes.plate.get(Materials.Aluminium),
                    'S',
                    OrePrefixes.stick.get(Materials.Aluminium),
                    'G',
                    OrePrefixes.gearGtSmall.get(Materials.Aluminium),
                    'M',
                    GregTechItems.ElectricMotorMV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPistonHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "PPP",
                    "CSS",
                    "CMG",
                    'P',
                    OrePrefixes.plate.get(Materials.StainlessSteel),
                    'S',
                    OrePrefixes.stick.get(Materials.StainlessSteel),
                    'G',
                    OrePrefixes.gearGtSmall.get(Materials.StainlessSteel),
                    'M',
                    GregTechItems.ElectricMotorHV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Gold),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPistonEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "PPP",
                    "CSS",
                    "CMG",
                    'P',
                    OrePrefixes.plate.get(Materials.Titanium),
                    'S',
                    OrePrefixes.stick.get(Materials.Titanium),
                    'G',
                    OrePrefixes.gearGtSmall.get(Materials.Titanium),
                    'M',
                    GregTechItems.ElectricMotorEV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.ElectricPistonIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "PPP",
                    "CSS",
                    "CMG",
                    'P',
                    OrePrefixes.plate.get(Materials.TungstenSteel),
                    'S',
                    OrePrefixes.stick.get(Materials.TungstenSteel),
                    'G',
                    OrePrefixes.gearGtSmall.get(Materials.TungstenSteel),
                    'M',
                    GregTechItems.ElectricMotorIV.get(),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tungsten),
                ),
            )

            //===RobotArms===\\
            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.RobotArmLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CCC",
                    "MSM",
                    "PES",
                    'S',
                    OrePrefixes.stick.get(Materials.Steel),
                    'M',
                    GregTechItems.ElectricMotorLV.get(),
                    'P',
                    GregTechItems.ElectricPistonLV.get(),
                    'E',
                    OrePrefixes.circuit.get(Materials.Basic),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.RobotArmMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CCC",
                    "MSM",
                    "PES",
                    'S',
                    OrePrefixes.stick.get(Materials.Aluminium),
                    'M',
                    GregTechItems.ElectricMotorMV.get(),
                    'P',
                    GregTechItems.ElectricPistonMV.get(),
                    'E',
                    OrePrefixes.circuit.get(Materials.Good),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.RobotArmHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CCC",
                    "MSM",
                    "PES",
                    'S',
                    OrePrefixes.stick.get(Materials.StainlessSteel),
                    'M',
                    GregTechItems.ElectricMotorHV.get(),
                    'P',
                    GregTechItems.ElectricPistonHV.get(),
                    'E',
                    OrePrefixes.circuit.get(Materials.Advanced),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Gold),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.RobotArmEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CCC",
                    "MSM",
                    "PES",
                    'S',
                    OrePrefixes.stick.get(Materials.Titanium),
                    'M',
                    GregTechItems.ElectricMotorEV.get(),
                    'P',
                    GregTechItems.ElectricPistonEV.get(),
                    'E',
                    OrePrefixes.circuit.get(Materials.Data),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.RobotArmIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "CCC",
                    "MSM",
                    "PES",
                    'S',
                    OrePrefixes.stick.get(Materials.TungstenSteel),
                    'M',
                    GregTechItems.ElectricMotorIV.get(),
                    'P',
                    GregTechItems.ElectricPistonIV.get(),
                    'E',
                    OrePrefixes.circuit.get(Materials.Elite),
                    'C',
                    OrePrefixes.cableGt01.get(Materials.Tungsten),
                ),
            )

            //===Emitters===\\
            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.EmitterLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SSC",
                    "WQS",
                    "CWS",
                    'Q',
                    OrePrefixes.gem.get(Materials.CertusQuartz),
                    'S',
                    OrePrefixes.stick.get(Materials.Brass),
                    'C',
                    OrePrefixes.circuit.get(Materials.Basic),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.EmitterLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SSC",
                    "WQS",
                    "CWS",
                    'Q',
                    OrePrefixes.gem.get(Materials.Quartzite),
                    'S',
                    OrePrefixes.stick.get(Materials.Brass),
                    'C',
                    OrePrefixes.circuit.get(Materials.Basic),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tin),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.EmitterMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SSC",
                    "WQS",
                    "CWS",
                    'Q',
                    OrePrefixes.gem.get(Materials.NetherQuartz),
                    'S',
                    OrePrefixes.stick.get(Materials.Electrum),
                    'C',
                    OrePrefixes.circuit.get(Materials.Good),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Copper),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.EmitterHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SSC",
                    "WQS",
                    "CWS",
                    'Q',
                    OrePrefixes.gemFlawed.get(Materials.Emerald),
                    'S',
                    OrePrefixes.stick.get(Materials.Chrome),
                    'C',
                    OrePrefixes.circuit.get(Materials.Advanced),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Gold),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.EmitterEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SSC",
                    "WQS",
                    "CWS",
                    'Q',
                    ImpactItems.ChargedGlassLense.get(),
                    'S',
                    OrePrefixes.stick.get(Materials.Platinum),
                    'C',
                    OrePrefixes.circuit.get(Materials.Data),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Aluminium),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.EmitterIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "SSC",
                    "WQS",
                    "CWS",
                    'Q',
                    ImpactItems.HugeChargedGlassLense.get(),
                    'S',
                    OrePrefixes.stick.get(Materials.Iridium),
                    'C',
                    OrePrefixes.circuit.get(Materials.Elite),
                    'W',
                    OrePrefixes.cableGt01.get(Materials.Tungsten),
                ),
            )

            //===Sensors===\\
            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.SensorLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "P Q",
                    "PS ",
                    "CPP",
                    'Q',
                    OrePrefixes.gem.get(Materials.CertusQuartz),
                    'S',
                    OrePrefixes.stick.get(Materials.Brass),
                    'P',
                    OrePrefixes.plate.get(Materials.Steel),
                    'C',
                    OrePrefixes.circuit.get(Materials.Basic),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.SensorLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "P Q",
                    "PS ",
                    "CPP",
                    'Q',
                    OrePrefixes.gem.get(Materials.Quartzite),
                    'S',
                    OrePrefixes.stick.get(Materials.Brass),
                    'P',
                    OrePrefixes.plate.get(Materials.Steel),
                    'C',
                    OrePrefixes.circuit.get(Materials.Basic),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.SensorMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "P Q",
                    "PS ",
                    "CPP",
                    'Q',
                    OrePrefixes.gem.get(Materials.NetherQuartz),
                    'S',
                    OrePrefixes.stick.get(Materials.Electrum),
                    'P',
                    OrePrefixes.plate.get(Materials.Aluminium),
                    'C',
                    OrePrefixes.circuit.get(Materials.Good),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.SensorHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "P Q",
                    "PS ",
                    "CPP",
                    'Q',
                    OrePrefixes.gemFlawed.get(Materials.Emerald),
                    'S',
                    OrePrefixes.stick.get(Materials.Chrome),
                    'P',
                    OrePrefixes.plate.get(Materials.StainlessSteel),
                    'C',
                    OrePrefixes.circuit.get(Materials.Advanced),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.SensorEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "P Q",
                    "PS ",
                    "CPP",
                    'Q',
                    ImpactItems.ChargedGlassLense.get(),
                    'S',
                    OrePrefixes.stick.get(Materials.Platinum),
                    'P',
                    OrePrefixes.plate.get(Materials.Titanium),
                    'C',
                    OrePrefixes.circuit.get(Materials.Data),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.SensorIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "P Q",
                    "PS ",
                    "CPP",
                    'Q',
                    ImpactItems.HugeChargedGlassLense.get(),
                    'S',
                    OrePrefixes.stick.get(Materials.Iridium),
                    'P',
                    OrePrefixes.plate.get(Materials.TungstenSteel),
                    'C',
                    OrePrefixes.circuit.get(Materials.Elite),
                ),
            )

            //===FieldGenerators===\\
            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.FieldGeneratorLV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "WCW",
                    "CGC",
                    "WCW",
                    'G',
                    GregTechItems.EmitterLV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Good),
                    'W',
                    OrePrefixes.plate.get(Materials.RedSteel),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.FieldGeneratorMV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "WCW",
                    "CGC",
                    "WCW",
                    'G',
                    GregTechItems.EmitterMV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Advanced),
                    'W',
                    OrePrefixes.plate.get(Materials.BT6),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.FieldGeneratorHV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "WCW",
                    "CGC",
                    "WCW",
                    'G',
                    GregTechItems.EmitterHV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Data),
                    'W',
                    OrePrefixes.plateDouble.get(Materials.HSSG),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.FieldGeneratorEV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "WCW",
                    "CGC",
                    "WCW",
                    'G',
                    GregTechItems.EmitterEV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Elite),
                    'W',
                    OrePrefixes.plateDouble.get(Materials.NiobiumTitanium),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = GregTechItems.FieldGeneratorIV.get(),
                flags = GregTechRecipeFlags.componentCrafting,
                recipe = arrayOf<Any?>(
                    "WCW",
                    "CGC",
                    "WCW",
                    'G',
                    GregTechItems.EmitterIV.get(),
                    'C',
                    OrePrefixes.circuit.get(Materials.Master),
                    'W',
                    OrePrefixes.plateTriple.get(Materials.HSSS),
                ),
            )
        }
    }
}
