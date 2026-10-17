package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.ComputronicsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.OpenPeripheralItems
import com.impactrecipes.items.OpenSecurityItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersComputronicsPeripheralRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.WirelessNetworkCardTier2.get(),
                OpenComputersItems.MicrochipTier3.get(),
                OpenComputersItems.Keyboard.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = OpenPeripheralItems.WirelessKeyboard.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.NiobiumTitanium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.ChromiumDioxide,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.StainlessSteel,
                    count = 8,
                ),
            ),
            fluid = Materials.Argon.getGas(1000),
            output = ComputronicsItems.ChromiumDioxideTapeReel.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                ComputronicsItems.Camera.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Gold,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.CameraUpgrade.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                ComputronicsItems.ChatBox.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Silver,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.ChatUpgrade.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                ComputronicsItems.Radar.get(),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.RadarUpgrade.get(),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.ArithmeticLogicUnitALU.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                ImpactItems.RedstonePulsatingChipset.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.ParticleEffectsCard.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.NetworkCard.get(),
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 2),
                OpenComputersItems.ControlUnitCU.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.MemoryTier15.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.SpoofingCard.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 2),
                OpenComputersItems.ControlUnitCU.get(),
                OpenComputersItems.MicrochipTier1.get(),
                ComputronicsItems.Speaker.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.BeepCard.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.RedstoneCardTier1.get(),
                OpenComputersItems.ControlUnitCU.get(),
                IC2Items.IndustrialTnt.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.SelfDestructingCard.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                ComputronicsItems.ColorfulLamp.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.Chamelium.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Gold,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.ColorfulUpgrade.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                ComputronicsItems.BeepCard.get(),
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 2),
                OpenComputersItems.ControlUnitCU.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.MemoryTier1.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = ComputronicsItems.NoiseCard.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                ComputronicsItems.NoiseCard.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.CentralProcessingUnitCPUTier1.get(),
                OpenComputersItems.MemoryTier3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Diamond,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.SoundCard.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                ComputronicsItems.ColorfulLamp.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = ComputronicsItems.LightBoard.get(),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                ComputronicsItems.SelfDestructingCard.get(amount = 2),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = ComputronicsItems.ServerSelfDestructor.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                OpenComputersItems.Capacitor.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Gold,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.RackCapacitor.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenSecurityItems.SwitchableHub.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = ComputronicsItems.SwitchBoard.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                ComputronicsItems.SpeechBox.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Gold,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = ComputronicsItems.SpeechUpgrade.get(),
            ticks = 250,
            eu = 120,
        )
    }
}
