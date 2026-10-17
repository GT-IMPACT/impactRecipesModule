package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import net.minecraft.item.ItemStack

internal class GregTechStorageUpgradeRecipes {

    internal fun register() {
        val inHatches = arrayOf<ItemStack?>(
            ImpactItems.HatchInputUEV.get(),
            ImpactItems.HatchInputUIV.get(),
            ImpactItems.HatchInputUMV.get(),
            ImpactItems.HatchInputUXV.get(),
            ImpactItems.HatchInputOPV.get(),
            ImpactItems.HatchInputMAX.get(),
        )

        val outHatches = arrayOf<ItemStack?>(
            ImpactItems.HatchOutputUEV.get(),
            ImpactItems.HatchOutputUIV.get(),
            ImpactItems.HatchOutputUMV.get(),
            ImpactItems.HatchOutputUXV.get(),
            ImpactItems.HatchOutputOPV.get(),
            ImpactItems.HatchOutputMAX.get(),
        )

        val flInputs = Array(6) {
            arrayOfNulls<ItemStack>(3)
        }

        val flInputs2 = Array(6) {
            arrayOfNulls<ItemStack>(3)
        }

        val tanks = arrayOf<ItemStack?>(
            GregTechItems.SuperTankHV.get(),
            GregTechItems.SuperTankEV.get(),
            GregTechItems.SuperTankIV.get(),
            GregTechItems.QuantumTankLV.get(),
            GregTechItems.QuantumTankMV.get(),
            GregTechItems.QuantumTankHV.get(),
        )

        val hulls = arrayOf<ItemStack?>(
            GregTechItems.CasingUEV.get(),
            GregTechItems.CasingUIV.get(),
            GregTechItems.CasingUMV.get(),
            GregTechItems.CasingUXV.get(),
            GregTechItems.CasingOPV.get(),
            GregTechItems.CasingMAXV.get(),
        )

        for (i in 0 until 6) {
            flInputs[i] = arrayOf<ItemStack?>(
                hulls[i]?.copy(),
                tanks[i]?.copy(),
                IntegratedCircuit(1).get(amount = 0),
            )

            flInputs2[i] = arrayOf<ItemStack?>(
                hulls[i]?.copy(),
                tanks[i]?.copy(),
                IntegratedCircuit(2).get(amount = 0),
            )
        }

        //10-15 since MAX crashes., change to 16 somwhen the NEI handler is fixed and MAX is optainable
        for (aTier in 10 until 15) {
            MachineRecipes.assembler(
                inputs = flInputs[(aTier - 10)],
                fluidInput = Materials.PerroxPolymer.getMolten(
                    ((2.25 * Math.pow(
                        2.toDouble(),
                        (aTier - 9).toDouble(),
                    ))).toLong(),
                ),
                output = inHatches[(aTier - 10)],
                ticks = 480,
                eu = ((30 * Math.pow(
                    4.toDouble(),
                    (aTier - 1).toDouble(),
                ))).toInt(),
                cleanroom = false,
            )

            MachineRecipes.assembler(
                inputs = flInputs2[(aTier - 10)],
                fluidInput = Materials.PerroxPolymer.getMolten(
                    ((2.25 * Math.pow(
                        2.toDouble(),
                        (aTier - 9).toDouble(),
                    ))).toLong(),
                ),
                output = outHatches[(aTier - 10)],
                ticks = 480,
                eu = ((30 * Math.pow(
                    4.toDouble(),
                    (aTier - 1).toDouble(),
                ))).toInt(),
                cleanroom = false,
            )
        }

        val inBuses = arrayOf<ItemStack?>(
            ImpactItems.BusInputUEV.get(),
            ImpactItems.BusInputUIV.get(),
            ImpactItems.BusInputUMV.get(),
            ImpactItems.BusInputUXV.get(),
            ImpactItems.BusInputOPV.get(),
            ImpactItems.BusInputMAX.get(),
        )

        val outBuses = arrayOf<ItemStack?>(
            ImpactItems.BusOutputUEV.get(),
            ImpactItems.BusOutputUIV.get(),
            ImpactItems.BusOutputUMV.get(),
            ImpactItems.BusOutputUXV.get(),
            ImpactItems.BusOutputOPV.get(),
            ImpactItems.BusOutputMAX.get(),
        )

        val itInputs = Array(6) {
            arrayOfNulls<ItemStack>(3)
        }

        val itInputs2 = Array(6) {
            arrayOfNulls<ItemStack>(3)
        }

        val chests = arrayOf<ItemStack?>(
            GregTechItems.SuperChestHV.get(),
            GregTechItems.SuperChestEV.get(),
            GregTechItems.SuperChestIV.get(),
            GregTechItems.QuantumChestHV.get(),
            GregTechItems.QuantumChestEV.get(),
            GregTechItems.QuantumChestIV.get(),
        )

        for (i in 0 until 6) {
            itInputs[i] = arrayOf<ItemStack?>(
                hulls[i]?.copy(),
                chests[i]?.copy(),
                IntegratedCircuit(1).get(amount = 0),
            )

            itInputs2[i] = arrayOf<ItemStack?>(
                hulls[i]?.copy(),
                chests[i]?.copy(),
                IntegratedCircuit(2).get(amount = 0),
            )
        }

        for (aTier in 10 until 15) {
            MachineRecipes.assembler(
                inputs = itInputs[(aTier - 10)],
                fluidInput = Materials.PerroxPolymer.getMolten(
                    ((2.25 * Math.pow(
                        2.toDouble(),
                        (aTier - 9).toDouble(),
                    ))).toLong(),
                ),
                output = inBuses[(aTier - 10)],
                ticks = 480,
                eu = ((30 * Math.pow(
                    4.toDouble(),
                    (aTier - 1).toDouble(),
                ))).toInt(),
                cleanroom = false,
            )

            MachineRecipes.assembler(
                inputs = itInputs2[(aTier - 10)],
                fluidInput = Materials.PerroxPolymer.getMolten(
                    ((2.25 * Math.pow(
                        2.toDouble(),
                        (aTier - 9).toDouble(),
                    ))).toLong(),
                ),
                output = outBuses[(aTier - 10)],
                ticks = 480,
                eu = ((30 * Math.pow(
                    4.toDouble(),
                    (aTier - 1).toDouble(),
                ))).toInt(),
                cleanroom = false,
            )
        }
    }
}
