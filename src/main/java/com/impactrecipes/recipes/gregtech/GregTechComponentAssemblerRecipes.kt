package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.GT_Mod
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechComponentAssemblerRecipes {

    internal fun register() {
        if (GT_Mod.gregtechproxy.mComponentAssembler) {
            //Motors
            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.IronMagnetic.item(OrePrefixes.bolt).get(),
                    Materials.Iron.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Tin.item(OrePrefixes.wireFine).get(amount = 4),
                    Materials.Lead.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = ImpactItems.ULVMotor.get(),
                ticks = 40,
                eu = 8,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.IronMagnetic.item(OrePrefixes.stick).get(),
                    Materials.Iron.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Copper.item(OrePrefixes.wireGt01).get(amount = 4),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricMotorLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.SteelMagnetic.item(OrePrefixes.stick).get(),
                    Materials.Steel.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Copper.item(OrePrefixes.wireGt01).get(amount = 4),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricMotorLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.SteelMagnetic.item(OrePrefixes.stick).get(),
                    Materials.Aluminium.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Cupronickel.item(OrePrefixes.wireGt02).get(amount = 4),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricMotorMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.SteelMagnetic.item(OrePrefixes.stick).get(),
                    Materials.StainlessSteel.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Electrum.item(OrePrefixes.wireGt02).get(amount = 4),
                    Materials.Silver.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricMotorHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.NeodymiumMagnetic.item(OrePrefixes.stick).get(),
                    Materials.Titanium.item(OrePrefixes.stick).get(amount = 2),
                    Materials.AnnealedCopper.item(OrePrefixes.wireGt02).get(amount = 4),
                    Materials.Aluminium.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricMotorEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.NeodymiumMagnetic.item(OrePrefixes.stick).get(),
                    Materials.TungstenSteel.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Graphene.item(OrePrefixes.wireGt02).get(amount = 4),
                    Materials.Tungsten.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricMotorIV.get(),
                ticks = 200,
                eu = 7680,
            )

            //Pumps
            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.ULVMotor.get(),
                    Materials.Rubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Lead.item(OrePrefixes.rotor).get(),
                    Materials.Lead.item(OrePrefixes.screw).get(amount = 2),
                    Materials.Copper.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = ImpactItems.ULVPump.get(),
                ticks = 100,
                eu = 8,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorLV.get(),
                    Materials.Rubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Tin.item(OrePrefixes.rotor).get(),
                    Materials.Tin.item(OrePrefixes.screw).get(),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(),
                    Materials.Bronze.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorLV.get(),
                    Materials.Silicone.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Tin.item(OrePrefixes.rotor).get(),
                    Materials.Tin.item(OrePrefixes.screw).get(),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(),
                    Materials.Bronze.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorLV.get(),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Tin.item(OrePrefixes.rotor).get(),
                    Materials.Tin.item(OrePrefixes.screw).get(),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(),
                    Materials.Bronze.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorMV.get(),
                    Materials.Rubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Bronze.item(OrePrefixes.rotor).get(),
                    Materials.Bronze.item(OrePrefixes.screw).get(),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(),
                    Materials.Steel.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorMV.get(),
                    Materials.Silicone.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Bronze.item(OrePrefixes.rotor).get(),
                    Materials.Bronze.item(OrePrefixes.screw).get(),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(),
                    Materials.Steel.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorMV.get(),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Bronze.item(OrePrefixes.rotor).get(),
                    Materials.Bronze.item(OrePrefixes.screw).get(),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(),
                    Materials.Steel.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorHV.get(),
                    Materials.Rubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Steel.item(OrePrefixes.rotor).get(),
                    Materials.Steel.item(OrePrefixes.screw).get(),
                    Materials.Gold.item(OrePrefixes.cableGt01).get(),
                    Materials.StainlessSteel.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorHV.get(),
                    Materials.Silicone.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Steel.item(OrePrefixes.rotor).get(),
                    Materials.Steel.item(OrePrefixes.screw).get(),
                    Materials.Gold.item(OrePrefixes.cableGt01).get(),
                    Materials.StainlessSteel.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorHV.get(),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.Steel.item(OrePrefixes.rotor).get(),
                    Materials.Steel.item(OrePrefixes.screw).get(),
                    Materials.Gold.item(OrePrefixes.cableGt01).get(),
                    Materials.StainlessSteel.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorEV.get(),
                    Materials.Rubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.StainlessSteel.item(OrePrefixes.rotor).get(),
                    Materials.StainlessSteel.item(OrePrefixes.screw).get(),
                    Materials.Aluminium.item(OrePrefixes.cableGt01).get(),
                    Materials.Titanium.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorEV.get(),
                    Materials.Silicone.item(OrePrefixes.ring).get(amount = 2),
                    Materials.StainlessSteel.item(OrePrefixes.rotor).get(),
                    Materials.StainlessSteel.item(OrePrefixes.screw).get(),
                    Materials.Aluminium.item(OrePrefixes.cableGt01).get(),
                    Materials.Titanium.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorEV.get(),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.StainlessSteel.item(OrePrefixes.rotor).get(),
                    Materials.StainlessSteel.item(OrePrefixes.screw).get(),
                    Materials.Aluminium.item(OrePrefixes.cableGt01).get(),
                    Materials.Titanium.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorIV.get(),
                    Materials.Silicone.item(OrePrefixes.ring).get(amount = 2),
                    Materials.TungstenSteel.item(OrePrefixes.rotor).get(),
                    Materials.TungstenSteel.item(OrePrefixes.screw).get(),
                    Materials.Tungsten.item(OrePrefixes.cableGt01).get(),
                    Materials.TungstenSteel.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpIV.get(),
                ticks = 200,
                eu = 7680,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorIV.get(),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.ring).get(amount = 2),
                    Materials.TungstenSteel.item(OrePrefixes.rotor).get(),
                    Materials.TungstenSteel.item(OrePrefixes.screw).get(),
                    Materials.Tungsten.item(OrePrefixes.cableGt01).get(),
                    Materials.TungstenSteel.item(OrePrefixes.pipeMedium).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPumpIV.get(),
                ticks = 200,
                eu = 7680,
            )

            //Conveyors
            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.ULVMotor.get(amount = 2),
                    Materials.Rubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Lead.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = ImpactItems.ULVConveyorModule.get(),
                ticks = 40,
                eu = 4,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.ULVMotor.get(amount = 2),
                    Materials.Silicone.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Lead.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = ImpactItems.ULVConveyorModule.get(),
                ticks = 40,
                eu = 4,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.ULVMotor.get(amount = 2),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Lead.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = ImpactItems.ULVConveyorModule.get(),
                ticks = 40,
                eu = 4,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorLV.get(amount = 2),
                    Materials.Rubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorLV.get(amount = 2),
                    Materials.Silicone.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorLV.get(amount = 2),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorMV.get(amount = 2),
                    Materials.Rubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorMV.get(amount = 2),
                    Materials.Silicone.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorMV.get(amount = 2),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorHV.get(amount = 2),
                    Materials.Rubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Gold.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorHV.get(amount = 2),
                    Materials.Silicone.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Gold.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorHV.get(amount = 2),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Gold.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorEV.get(amount = 2),
                    Materials.Silicone.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Aluminium.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorEV.get(amount = 2),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Aluminium.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorIV.get(amount = 2),
                    Materials.Silicone.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Tungsten.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleIV.get(),
                ticks = 200,
                eu = 7680,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorIV.get(amount = 2),
                    Materials.StyreneButadieneRubber.item(OrePrefixes.plate).get(amount = 6),
                    Materials.Tungsten.item(OrePrefixes.cableGt01).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ConveyorModuleIV.get(),
                ticks = 200,
                eu = 7680,
            )

            //Pistons
            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.ULVMotor.get(),
                    Materials.WroughtIron.item(OrePrefixes.plate).get(amount = 2),
                    Materials.WroughtIron.item(OrePrefixes.stick).get(amount = 2),
                    Materials.WroughtIron.item(OrePrefixes.gearGtSmall).get(),
                ),
                fluidInput = GT_Values.NF,
                output = ImpactItems.ULVPiston.get(),
                ticks = 40,
                eu = 8,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorLV.get(),
                    Materials.Steel.item(OrePrefixes.plate).get(amount = 3),
                    Materials.Steel.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(amount = 2),
                    Materials.Steel.item(OrePrefixes.gearGtSmall).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPistonLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorMV.get(),
                    Materials.Aluminium.item(OrePrefixes.plate).get(amount = 3),
                    Materials.Aluminium.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(amount = 2),
                    Materials.Aluminium.item(OrePrefixes.gearGtSmall).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPistonMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorHV.get(),
                    Materials.StainlessSteel.item(OrePrefixes.plate).get(amount = 3),
                    Materials.StainlessSteel.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Gold.item(OrePrefixes.cableGt01).get(amount = 2),
                    Materials.StainlessSteel.item(OrePrefixes.gearGtSmall).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPistonHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorEV.get(),
                    Materials.Titanium.item(OrePrefixes.plate).get(amount = 3),
                    Materials.Titanium.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Aluminium.item(OrePrefixes.cableGt01).get(amount = 2),
                    Materials.Titanium.item(OrePrefixes.gearGtSmall).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPistonEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorIV.get(),
                    Materials.TungstenSteel.item(OrePrefixes.plate).get(amount = 3),
                    Materials.TungstenSteel.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Tungsten.item(OrePrefixes.cableGt01).get(amount = 2),
                    Materials.TungstenSteel.item(OrePrefixes.gearGtSmall).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.ElectricPistonIV.get(),
                ticks = 200,
                eu = 7680,
            )

            //Robot Arms
            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.ULVMotor.get(amount = 2),
                    ImpactItems.ULVPiston.get(),
                    Materials.WroughtIron.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Primitive.item(OrePrefixes.circuit).get(),
                    Materials.Lead.item(OrePrefixes.cableGt01).get(amount = 3),
                ),
                fluidInput = GT_Values.NF,
                output = ImpactItems.ULVRobotArm.get(),
                ticks = 40,
                eu = 8,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorLV.get(amount = 2),
                    GregTechItems.ElectricPistonLV.get(),
                    Materials.Steel.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Basic.item(OrePrefixes.circuit).get(),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(amount = 3),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.RobotArmLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorMV.get(amount = 2),
                    GregTechItems.ElectricPistonMV.get(),
                    Materials.Aluminium.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Good.item(OrePrefixes.circuit).get(),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(amount = 3),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.RobotArmMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorHV.get(amount = 2),
                    GregTechItems.ElectricPistonHV.get(),
                    Materials.StainlessSteel.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Advanced.item(OrePrefixes.circuit).get(),
                    Materials.Gold.item(OrePrefixes.cableGt01).get(amount = 3),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.RobotArmHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorEV.get(amount = 2),
                    GregTechItems.ElectricPistonEV.get(),
                    Materials.Titanium.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Data.item(OrePrefixes.circuit).get(),
                    Materials.Aluminium.item(OrePrefixes.cableGt01).get(amount = 3),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.RobotArmEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.ElectricMotorIV.get(amount = 2),
                    GregTechItems.ElectricPistonIV.get(),
                    Materials.TungstenSteel.item(OrePrefixes.stick).get(amount = 2),
                    Materials.Elite.item(OrePrefixes.circuit).get(),
                    Materials.Tungsten.item(OrePrefixes.cableGt01).get(amount = 3),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.RobotArmIV.get(),
                ticks = 200,
                eu = 7680,
            )

            //Emitter
            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.CertusQuartz.item(OrePrefixes.gem).get(),
                    Materials.Brass.item(OrePrefixes.stick).get(amount = 4),
                    Materials.Basic.item(OrePrefixes.circuit).get(amount = 2),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.EmitterLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.Quartzite.item(OrePrefixes.gem).get(),
                    Materials.Brass.item(OrePrefixes.stick).get(amount = 4),
                    Materials.Basic.item(OrePrefixes.circuit).get(amount = 2),
                    Materials.Tin.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.EmitterLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.NetherQuartz.item(OrePrefixes.gem).get(),
                    Materials.Electrum.item(OrePrefixes.stick).get(amount = 4),
                    Materials.Good.item(OrePrefixes.circuit).get(amount = 2),
                    Materials.Copper.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.EmitterMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.Emerald.item(OrePrefixes.gemFlawed).get(),
                    Materials.Chrome.item(OrePrefixes.stick).get(amount = 4),
                    Materials.Advanced.item(OrePrefixes.circuit).get(amount = 2),
                    Materials.Gold.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.EmitterHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.ChargedGlassLense.get(),
                    Materials.Platinum.item(OrePrefixes.stick).get(amount = 4),
                    Materials.Data.item(OrePrefixes.circuit).get(amount = 2),
                    Materials.Aluminium.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.EmitterEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.HugeChargedGlassLense.get(),
                    Materials.Iridium.item(OrePrefixes.stick).get(amount = 4),
                    Materials.Elite.item(OrePrefixes.circuit).get(amount = 2),
                    Materials.Tungsten.item(OrePrefixes.cableGt01).get(amount = 2),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.EmitterIV.get(),
                ticks = 200,
                eu = 7680,
            )

            //Sensor
            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.CertusQuartz.item(OrePrefixes.gem).get(),
                    Materials.Steel.item(OrePrefixes.plate).get(amount = 4),
                    Materials.Brass.item(OrePrefixes.stick).get(),
                    Materials.Basic.item(OrePrefixes.circuit).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.SensorLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.Quartzite.item(OrePrefixes.gem).get(),
                    Materials.Steel.item(OrePrefixes.plate).get(amount = 4),
                    Materials.Brass.item(OrePrefixes.stick).get(),
                    Materials.Basic.item(OrePrefixes.circuit).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.SensorLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.NetherQuartz.item(OrePrefixes.gem).get(),
                    Materials.Aluminium.item(OrePrefixes.plate).get(amount = 4),
                    Materials.Electrum.item(OrePrefixes.stick).get(),
                    Materials.Good.item(OrePrefixes.circuit).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.SensorMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    Materials.Emerald.item(OrePrefixes.gemFlawed).get(),
                    Materials.StainlessSteel.item(OrePrefixes.plate).get(amount = 4),
                    Materials.Chrome.item(OrePrefixes.stick).get(),
                    Materials.Advanced.item(OrePrefixes.circuit).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.SensorHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.ChargedGlassLense.get(),
                    Materials.Titanium.item(OrePrefixes.plate).get(amount = 4),
                    Materials.Platinum.item(OrePrefixes.stick).get(),
                    Materials.Data.item(OrePrefixes.circuit).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.SensorEV.get(),
                ticks = 180,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    ImpactItems.HugeChargedGlassLense.get(),
                    Materials.TungstenSteel.item(OrePrefixes.plate).get(amount = 4),
                    Materials.Iridium.item(OrePrefixes.stick).get(),
                    Materials.Elite.item(OrePrefixes.circuit).get(),
                ),
                fluidInput = GT_Values.NF,
                output = GregTechItems.SensorIV.get(),
                ticks = 200,
                eu = 7680,
            )

            //FieldGenerators
            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.EmitterLV.get(),
                    Materials.Good.item(OrePrefixes.circuit).get(amount = 4),
                    Materials.RedSteel.item(OrePrefixes.plate).get(amount = 4),
                ),
                fluidInput = null,
                output = GregTechItems.FieldGeneratorLV.get(),
                ticks = 80,
                eu = 30,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.EmitterMV.get(),
                    Materials.Advanced.item(OrePrefixes.circuit).get(amount = 4),
                    Materials.BT6.item(OrePrefixes.plate).get(amount = 4),
                ),
                fluidInput = null,
                output = GregTechItems.FieldGeneratorMV.get(),
                ticks = 120,
                eu = 120,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.EmitterHV.get(),
                    Materials.Data.item(OrePrefixes.circuit).get(amount = 4),
                    Materials.HSSG.item(OrePrefixes.plateDouble).get(amount = 4),
                ),
                fluidInput = null,
                output = GregTechItems.FieldGeneratorHV.get(),
                ticks = 160,
                eu = 480,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.EmitterEV.get(),
                    Materials.Elite.item(OrePrefixes.circuit).get(amount = 4),
                    Materials.NiobiumTitanium.item(OrePrefixes.plateDouble).get(amount = 4),
                ),
                fluidInput = null,
                output = GregTechItems.FieldGeneratorEV.get(),
                ticks = 160,
                eu = 1920,
            )

            MachineRecipes.componentAssembler(
                inputs = arrayOf<ItemStack?>(
                    GregTechItems.EmitterIV.get(),
                    Materials.Master.item(OrePrefixes.circuit).get(amount = 4),
                    Materials.HSSS.item(OrePrefixes.plateTriple).get(amount = 4),
                ),
                fluidInput = null,
                output = GregTechItems.FieldGeneratorIV.get(),
                ticks = 200,
                eu = 7680,
            )
        }
    }
}
