package com.impactrecipes.util

import com.github.technus.tectech.recipe.TT_recipeAdder
import com.impact.common.te.TE_DryingRack
import com.impact.impact
import gregtech.api.enums.GT_Values.RA
import net.minecraft.item.ItemStack
import net.minecraftforge.fluids.FluidStack

/** Keeps positional machine APIs here so recipe definitions can use named Kotlin arguments. */
public object MachineRecipes {

    @JvmStatic
    public fun alloySmelter(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "alloy smelter") {
            RA.addAlloySmelterRecipe(
                input,
                secondaryInput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun forgeHammer(
        input: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "forge hammer") {
            RA.addForgeHammerRecipe(
                input,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun pulverizer(
        input: ItemStack?,
        outputs: Array<out ItemStack?>,
        chances: IntArray?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "pulverizer") {
            RA.addPulveriserRecipe(
                input,
                outputs,
                chances,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun spaceAutoclave(
        input: ItemStack?,
        fluid: FluidStack?,
        output: ItemStack?,
        chance: Int,
        ticks: Int,
        eu: Int,
        cleanroom: Boolean,
    ) {
        registerOperation(id = "space autoclave") {
            RA.addAutoclaveSpaceRecipe(
                input,
                fluid,
                output,
                chance,
                ticks,
                eu,
                cleanroom,
            )
        }
    }

    @JvmStatic
    public fun dryingRack(
        input: ItemStack?,
        ticks: Int,
        output: ItemStack?,
    ) {
        TE_DryingRack.DryingRackRecipes.addDryingRecipe(
            input,
            ticks,
            output,
        )
    }

    @JvmStatic
    public fun dryingOven(
        input: ItemStack?,
        outputs: Array<out ItemStack?>,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "drying oven") {
            impact.I_RA.addDryingOvenRecipe(
                input,
                outputs,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun laserEngraver(
        input: ItemStack?,
        lens: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
        cleanroom: Boolean,
    ) {
        registerOperation(id = "laser engraver") {
            RA.addLaserEngraverRecipe(
                input,
                lens,
                output,
                ticks,
                eu,
                cleanroom,
            )
        }
    }

    @JvmStatic
    public fun assembler(
        inputs: Array<out ItemStack?>,
        fluid: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        val id = "assembler: ${CraftingRecipes.describe(output = output)}"
        val isValid = CraftingRecipes.valid(
            id = id,
            output = output,
            ingredients = inputs,
        )
        if (!isValid) {
            return
        }

        RecipeDiagnostics.attempt(
            id = id,
            rejectedReason = "GregTech rejected the assembler recipe. Check inputs, fluid, time and EU/t.",
        ) {
            RA.addAssemblerRecipe(
                inputs,
                fluid,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun meSystemProvider(
        inputs: Array<out ItemStack?>,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
        particles: Int,
    ) {
        val id = "ME System Provider: ${CraftingRecipes.describe(output = output)}"
        val isValid = CraftingRecipes.valid(
            id = id,
            output = output,
            ingredients = inputs,
        )
        if (!isValid) {
            return
        }

        RecipeDiagnostics.attempt(
            id = id,
            rejectedReason = "IMPACT rejected the ME System Provider recipe. Check inputs, time, EU/t and particles.",
        ) {
            impact.I_RA.addMESPRecipes(
                inputs,
                output,
                ticks,
                eu,
                particles,
            )
        }
    }

    @JvmStatic
    public fun arcFurnace(
        input: ItemStack?,
        outputs: Array<out ItemStack?>?,
        chances: IntArray?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "arc furnace") {
            RA.addArcFurnaceRecipe(
                input,
                outputs,
                chances,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun assembler(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "assembler") {
            RA.addAssemblerRecipe(
                input,
                secondaryInput,
                fluidInput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun assembler(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "assembler") {
            RA.addAssemblerRecipe(
                input,
                secondaryInput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun assembler(
        inputs: Array<out ItemStack?>?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
        cleanroom: Boolean,
    ) {
        registerOperation(id = "assembler") {
            RA.addAssemblerRecipe(
                inputs,
                fluidInput,
                output,
                ticks,
                eu,
                cleanroom,
            )
        }
    }

    @JvmStatic
    public fun assemblyLine(
        researchItem: ItemStack?,
        researchTicks: Int,
        inputs: Array<out ItemStack?>?,
        fluidInputs: Array<out FluidStack?>?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "assembly line") {
            RA.addAssemblylineRecipe(
                researchItem,
                researchTicks,
                inputs,
                fluidInputs,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun printer3d4x4(
        inputs: Array<out ItemStack?>?,
        output: ItemStack?,
        fluidInputs: Array<out FluidStack?>?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "3D printer 4x4") {
            RA.addBasicLineRecipe(
                inputs,
                output,
                fluidInputs,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun blastFurnace(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        ticks: Int,
        eu: Int,
        temperature: Int,
    ) {
        registerOperation(id = "blast furnace") {
            RA.addBlastRecipe(
                input,
                secondaryInput,
                fluidInput,
                fluidOutput,
                output,
                secondaryOutput,
                ticks,
                eu,
                temperature,
            )
        }
    }

    @JvmStatic
    public fun blastSmelter(
        inputs: Array<out ItemStack?>?,
        output: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        ticks: Int,
        eu: Int,
        temperature: Int,
    ) {
        registerOperation(id = "blast smelter") {
            RA.addBlastSmelterRecipe(
                inputs,
                output,
                fluidInput,
                fluidOutput,
                ticks,
                eu,
                temperature,
            )
        }
    }

    @JvmStatic
    public fun brewing(
        ingredient: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        ticks: Int,
        eu: Int,
        hidden: Boolean,
    ) {
        registerOperation(id = "brewing") {
            RA.addBrewingRecipeCustom(
                ingredient,
                fluidInput,
                fluidOutput,
                ticks,
                eu,
                hidden,
            )
        }
    }

    @JvmStatic
    public fun canner(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "canner") {
            RA.addCannerRecipe(
                input,
                secondaryInput,
                output,
                secondaryOutput,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun centrifuge(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        output3: ItemStack?,
        output4: ItemStack?,
        output5: ItemStack?,
        output6: ItemStack?,
        chances: IntArray?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "centrifuge") {
            RA.addCentrifugeRecipe(
                input,
                secondaryInput,
                fluidInput,
                fluidOutput,
                output,
                secondaryOutput,
                output3,
                output4,
                output5,
                output6,
                chances,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun chemicalBath(
        input: ItemStack?,
        fluid: FluidStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        output3: ItemStack?,
        chances: IntArray?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "chemical bath") {
            RA.addChemicalBathRecipe(
                input,
                fluid,
                output,
                secondaryOutput,
                output3,
                chances,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun chemicalReactor(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "chemical reactor") {
            RA.addChemicalRecipe(
                input,
                secondaryInput,
                fluidInput,
                fluidOutput,
                output,
                secondaryOutput,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun circuitAssembler(
        inputs: Array<out ItemStack?>?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "circuit assembler") {
            RA.addCircuitAssemblerRecipe(
                inputs,
                fluidInput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun circuitAssembler(
        inputs: Array<out ItemStack?>?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
        cleanroom: Boolean,
    ) {
        registerOperation(id = "circuit assembler") {
            RA.addCircuitAssemblerRecipe(
                inputs,
                fluidInput,
                output,
                ticks,
                eu,
                cleanroom,
            )
        }
    }

    @JvmStatic
    public fun spaceCircuitAssembler(
        inputs: Array<out ItemStack?>?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
        cleanroom: Boolean,
    ) {
        registerOperation(id = "space circuit assembler") {
            RA.addCircuitAssemblerSpaceRecipe(
                inputs,
                fluidInput,
                output,
                ticks,
                eu,
                cleanroom,
            )
        }
    }

    @JvmStatic
    public fun componentAssembler(
        inputs: Array<out ItemStack?>?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "component assembler") {
            RA.addComponentAssemblerRecipe(
                inputs,
                fluidInput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun cutter(
        input: ItemStack?,
        circuit: ItemStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        ticks: Int,
        eu: Int,
        cleanroom: Boolean,
    ) {
        registerOperation(id = "cutter") {
            RA.addCutterRecipe(
                input,
                circuit,
                output,
                secondaryOutput,
                ticks,
                eu,
                cleanroom,
            )
        }
    }

    @JvmStatic
    public fun cutter(
        input: ItemStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "cutter") {
            RA.addCutterRecipe(
                input,
                output,
                secondaryOutput,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun distillationTower(
        fluidInput: FluidStack?,
        outputs: Array<out FluidStack?>?,
        secondaryOutput: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "distillation tower") {
            RA.addDistillationTowerRecipe(
                fluidInput,
                outputs,
                secondaryOutput,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun electrolyzer(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        output3: ItemStack?,
        output4: ItemStack?,
        output5: ItemStack?,
        output6: ItemStack?,
        chances: IntArray?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "electrolyzer") {
            RA.addElectrolyzerRecipe(
                input,
                secondaryInput,
                fluidInput,
                fluidOutput,
                output,
                secondaryOutput,
                output3,
                output4,
                output5,
                output6,
                chances,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun fluidCanner(
        input: ItemStack?,
        output: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
    ) {
        registerOperation(id = "fluid canner") {
            RA.addFluidCannerRecipe(
                input,
                output,
                fluidInput,
                fluidOutput,
            )
        }
    }

    @JvmStatic
    public fun fluidExtractor(
        input: ItemStack?,
        remains: ItemStack?,
        fluidOutput: FluidStack?,
        chance: Int,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "fluid extractor") {
            RA.addFluidExtractionRecipe(
                input,
                remains,
                fluidOutput,
                chance,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun fluidSolidifier(
        mold: ItemStack?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "fluid solidifier") {
            RA.addFluidSolidifierRecipe(
                mold,
                fluidInput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun freezerSolidifier(
        mold: ItemStack?,
        fluidInput: FluidStack?,
        secondaryFluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "freezer solidifier") {
            RA.addFreezerSolidifierRecipe(
                mold,
                fluidInput,
                secondaryFluidInput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun fusionReactor(
        fluidInput: FluidStack?,
        secondaryFluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        ticks: Int,
        eu: Int,
        startupEnergy: Int,
    ) {
        registerOperation(id = "fusion reactor") {
            RA.addFusionReactorRecipe(
                fluidInput,
                secondaryFluidInput,
                fluidOutput,
                ticks,
                eu,
                startupEnergy,
            )
        }
    }

    @JvmStatic
    public fun implosionCompressor(
        input: ItemStack?,
        secondaryInput: Int,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        chances: IntArray?,
    ) {
        registerOperation(id = "implosion compressor") {
            RA.addImplosionRecipe(
                input,
                secondaryInput,
                output,
                secondaryOutput,
                chances,
            )
        }
    }

    @JvmStatic
    public fun mixer(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        input3: ItemStack?,
        input4: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "mixer") {
            RA.addMixerRecipe(
                input,
                secondaryInput,
                input3,
                input4,
                fluidInput,
                fluidOutput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun mixer(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        input3: ItemStack?,
        input4: ItemStack?,
        input5: ItemStack?,
        input6: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "mixer") {
            RA.addMixerRecipe(
                input,
                secondaryInput,
                input3,
                input4,
                input5,
                input6,
                fluidInput,
                fluidOutput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun printer3d3x3(
        inputs: Array<out ItemStack?>?,
        output: ItemStack?,
        fluidInputs: Array<out FluidStack?>?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "3D printer 3x3") {
            RA.addPrimitiveLineRecipe(
                inputs,
                output,
                fluidInputs,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun sifter(
        input: ItemStack?,
        outputs: Array<out ItemStack?>?,
        chances: IntArray?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "sifter") {
            RA.addSifterRecipe(
                input,
                outputs,
                chances,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun tinyWormhole(
        input: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        output3: ItemStack?,
        output4: ItemStack?,
        output5: ItemStack?,
        output6: ItemStack?,
        chances: IntArray?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "tiny wormhole") {
            RA.addTinyWormHoleRecipe(
                input,
                fluidInput,
                fluidOutput,
                output,
                secondaryOutput,
                output3,
                output4,
                output5,
                output6,
                chances,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun universalDistillation(
        fluidInput: FluidStack?,
        outputs: Array<out FluidStack?>?,
        secondaryOutput: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "universal distillation") {
            RA.addUniversalDistillationRecipe(
                fluidInput,
                outputs,
                secondaryOutput,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun vacuumFreezer(
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "vacuum freezer") {
            RA.addVacuumFreezerRecipe(
                fluidInput,
                fluidOutput,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun vacuumFreezer(
        input: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "vacuum freezer") {
            RA.addVacuumFreezerRecipe(
                input,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun wireAssembler(
        inputs: Array<out ItemStack?>?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
        cleanroom: Boolean,
    ) {
        registerOperation(id = "wire assembler") {
            RA.addWireAssemblerRecipe(
                inputs,
                fluidInput,
                output,
                ticks,
                eu,
                cleanroom,
            )
        }
    }

    @JvmStatic
    public fun formingPress(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "forming press") {
            RA.addFormingPressRecipe(
                input,
                secondaryInput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun chemicalReactor(
        input: ItemStack?,
        secondaryInput: ItemStack?,
        fluidInput: FluidStack?,
        fluidOutput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
    ) {
        registerOperation(id = "chemical reactor") {
            RA.addChemicalRecipe(
                input,
                secondaryInput,
                fluidInput,
                fluidOutput,
                output,
                ticks,
            )
        }
    }

    @JvmStatic
    public fun assemblyLineWithOreInputs(
        researchItem: ItemStack?,
        researchTicks: Int,
        inputs: Array<out Any?>?,
        fluidInputs: Array<out FluidStack?>?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "assembly line") {
            RA.addAssemblylineRecipe(
                researchItem,
                researchTicks,
                inputs,
                fluidInputs,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun compressor(
        input: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "compressor") {
            RA.addCompressorRecipe(
                input,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun cutter(
        input: ItemStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        ticks: Int,
        eu: Int,
        cleanroom: Boolean,
    ) {
        registerOperation(id = "cutter") {
            RA.addCutterRecipe(
                input,
                output,
                secondaryOutput,
                ticks,
                eu,
                cleanroom,
            )
        }
    }

    @JvmStatic
    public fun wiremill(
        input: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "wiremill") {
            RA.addWiremillRecipe(
                input,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun extruder(
        input: ItemStack?,
        mold: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "extruder") {
            RA.addExtruderRecipe(
                input,
                mold,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun extractor(
        input: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "extractor") {
            RA.addExtractorRecipe(
                input,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun researchAssemblyLine(
        researchItem: ItemStack?,
        researchComputation: Int,
        computationPerSecond: Int,
        researchEu: Int,
        researchAmperage: Int,
        inputs: Array<out ItemStack?>?,
        fluidInputs: Array<out FluidStack?>?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "research assembly line") {
            TT_recipeAdder.addResearchableAssemblylineRecipe(
                researchItem,
                researchComputation,
                computationPerSecond,
                researchEu,
                researchAmperage,
                inputs,
                fluidInputs,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun researchAssemblyLineWithOreInputs(
        researchItem: ItemStack?,
        researchComputation: Int,
        computationPerSecond: Int,
        researchEu: Int,
        researchAmperage: Int,
        inputs: Array<out Any?>?,
        fluidInputs: Array<out FluidStack?>?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "research assembly line") {
            TT_recipeAdder.addResearchableAssemblylineRecipe(
                researchItem,
                researchComputation,
                computationPerSecond,
                researchEu,
                researchAmperage,
                inputs,
                fluidInputs,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun slicer(
        input: ItemStack?,
        blade: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "slicer") {
            RA.addSlicerRecipe(
                input,
                blade,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun autoclave(
        input: ItemStack?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        chance: Int,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "autoclave") {
            RA.addAutoclaveRecipe(
                input,
                fluidInput,
                output,
                chance,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun thermalCentrifuge(
        input: ItemStack?,
        outputs: Array<out ItemStack?>?,
        chances: IntArray?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "thermalCentrifuge") {
            RA.addThermalCentrifugeRecipe(
                input,
                outputs,
                chances,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun boxing(
        input: ItemStack?,
        schematic: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "boxing") {
            RA.addBoxingRecipe(
                input,
                schematic,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun disassembler(
        input: ItemStack?,
        outputs: Array<out ItemStack?>?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "disassembler") {
            RA.addDisassemblerRecipe(
                input,
                outputs,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun bender(
        input: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "bender") {
            RA.addBenderRecipe(
                input,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun unboxing(
        input: ItemStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "unboxing") {
            RA.addUnboxingRecipe(
                input,
                output,
                secondaryOutput,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun lathe(
        input: ItemStack?,
        output: ItemStack?,
        secondaryOutput: ItemStack?,
        chances: IntArray?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "lathe") {
            RA.addLatheRecipe(
                input,
                output,
                secondaryOutput,
                chances,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun laserEngraver(
        input: ItemStack?,
        lens: ItemStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "laser engraver") {
            RA.addLaserEngraverRecipe(
                input,
                lens,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun wireAssembler(
        inputs: Array<out ItemStack?>?,
        fluidInput: FluidStack?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "wireAssembler") {
            RA.addWireAssemblerRecipe(
                inputs,
                fluidInput,
                output,
                ticks,
                eu,
            )
        }
    }

    @JvmStatic
    public fun trackAssembler(
        inputs: Array<out ItemStack?>?,
        output: ItemStack?,
        ticks: Int,
        eu: Int,
    ) {
        registerOperation(id = "trackAssembler") {
            impact.I_RA.addTrackAssemblerRecipe(
                inputs,
                output,
                ticks,
                eu,
            )
        }
    }

    private fun registerOperation(
        id: String,
        action: () -> Boolean,
    ) {
        RecipeDiagnostics.attempt(
            id = id,
            rejectedReason = "GregTech rejected the recipe. Check its inputs, outputs and machine parameters.",
            action = action,
        )
    }
}
