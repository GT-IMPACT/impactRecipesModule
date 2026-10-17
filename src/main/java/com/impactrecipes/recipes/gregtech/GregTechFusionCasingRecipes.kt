package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GraviSuiteItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechFusionCasingRecipes {

    internal fun register() {
        //Fusion Casing MK1
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorLuV.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.HastelloyN.item(OrePrefixes.frameGt).get(amount = 4),
                GraviSuiteItems.Superconductor.get(amount = 4),
                ImpactItems.NeutronReflectorParts.get(amount = 4),
                Materials.TungstenSteel.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Master.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingLuV.get(amount = 8),
                Materials.Europium.item(OrePrefixes.plateDouble).get(amount = 12),
                Materials.HSSG.item(OrePrefixes.bolt).get(amount = 16),
            ),
            output = GregTechItems.CasingFusion.get(amount = 8),
            fluidInputs = null,
            ticks = (50 * 20),
            eu = 30720,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorZPM.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 6),
                Materials.Lafium.item(OrePrefixes.frameGt).get(amount = 6),
                GraviSuiteItems.Superconductor.get(amount = 6),
                ImpactItems.NeutronReflectorParts.get(amount = 6),
                Materials.HSSS.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Ultimate.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingLuV.get(amount = 20),
                Materials.Americium.item(OrePrefixes.plateDouble).get(amount = 16),
                Materials.HSSG.item(OrePrefixes.bolt).get(amount = 32),
            ),
            output = GregTechItems.CasingFusion.get(amount = 20),
            fluidInputs = null,
            ticks = (100 * 20),
            eu = 122880,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorUV.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 8),
                Materials.CinobiteA243.item(OrePrefixes.frameGt).get(amount = 8),
                GraviSuiteItems.Superconductor.get(amount = 8),
                ImpactItems.NeutronReflectorParts.get(amount = 8),
                Materials.Osmiridium.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Superconductor.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingLuV.get(amount = 60),
                Materials.Neutronium.item(OrePrefixes.plateDouble).get(amount = 20),
                Materials.HSSG.item(OrePrefixes.bolt).get(amount = 64),
            ),
            output = GregTechItems.CasingFusion.get(amount = 60),
            fluidInputs = null,
            ticks = (200 * 20),
            eu = 500000,
        )

        //Fusion Casing MK2
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorZPM.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.Lafium.item(OrePrefixes.frameGt).get(amount = 4),
                GraviSuiteItems.Superconductor.get(amount = 4),
                GregTechItems.NeutronReflector.get(amount = 4),
                Materials.Osmiridium.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Ultimate.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingFusion.get(amount = 8),
                Materials.Americium.item(OrePrefixes.plateDouble).get(amount = 12),
                Materials.HSSS.item(OrePrefixes.bolt).get(amount = 16),
            ),
            output = GregTechItems.CasingFusion2.get(amount = 8),
            fluidInputs = null,
            ticks = (50 * 20),
            eu = 122880,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorUV.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 6),
                Materials.CinobiteA243.item(OrePrefixes.frameGt).get(amount = 6),
                GraviSuiteItems.Superconductor.get(amount = 6),
                GregTechItems.NeutronReflector.get(amount = 6),
                Materials.Duranium.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Superconductor.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingFusion.get(amount = 20),
                Materials.Neutronium.item(OrePrefixes.plateDouble).get(amount = 16),
                Materials.HSSS.item(OrePrefixes.bolt).get(amount = 32),
            ),
            output = GregTechItems.CasingFusion2.get(amount = 20),
            fluidInputs = null,
            ticks = (100 * 20),
            eu = 500000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorUHV.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 8),
                Materials.Pikyonium64B.item(OrePrefixes.frameGt).get(amount = 8),
                GraviSuiteItems.Superconductor.get(amount = 8),
                GregTechItems.NeutronReflector.get(amount = 8),
                Materials.ElectrumFlux.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Infinite.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingFusion.get(amount = 60),
                Materials.Phoenixite.item(OrePrefixes.plateDouble).get(amount = 20),
                Materials.HSSS.item(OrePrefixes.bolt).get(amount = 64),
            ),
            output = GregTechItems.CasingFusion2.get(amount = 60),
            fluidInputs = null,
            ticks = (200 * 20),
            eu = 2000000,
        )

        //Fusion Casing MK3
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorUV.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.CinobiteA243.item(OrePrefixes.frameGt).get(amount = 4),
                GraviSuiteItems.Superconductor.get(amount = 4),
                GregTechItems.NeutronReflector.get(amount = 8),
                Materials.Duranium.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Superconductor.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingFusion2.get(amount = 8),
                Materials.Neutronium.item(OrePrefixes.plateDouble).get(amount = 12),
                Materials.Adamantium.item(OrePrefixes.bolt).get(amount = 16),
            ),
            output = GregTechItems.CasingFusion3.get(amount = 8),
            fluidInputs = null,
            ticks = (50 * 20),
            eu = 500000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorUHV.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 6),
                Materials.Pikyonium64B.item(OrePrefixes.frameGt).get(amount = 6),
                GraviSuiteItems.Superconductor.get(amount = 6),
                GregTechItems.NeutronReflector.get(amount = 10),
                Materials.ElectrumFlux.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Infinite.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingFusion2.get(amount = 20),
                Materials.Phoenixite.item(OrePrefixes.plateDouble).get(amount = 16),
                Materials.Adamantium.item(OrePrefixes.bolt).get(amount = 32),
            ),
            output = GregTechItems.CasingFusion3.get(amount = 20),
            fluidInputs = null,
            ticks = (100 * 20),
            eu = 2000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorUEV.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 8),
                Materials.Quantum.item(OrePrefixes.frameGt).get(amount = 8),
                GraviSuiteItems.Superconductor.get(amount = 8),
                Materials.Neutronium.item(OrePrefixes.plateDense).get(amount = 4),
                Materials.BlackPlutonium.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Bio.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingFusion2.get(amount = 60),
                Materials.CosmicNeutronium.item(OrePrefixes.plateDouble).get(amount = 20),
                Materials.Adamantium.item(OrePrefixes.bolt).get(amount = 64),
            ),
            output = GregTechItems.CasingFusion3.get(amount = 60),
            fluidInputs = null,
            ticks = (200 * 20),
            eu = 8000000,
        )

        //Fusion Casing MK4
        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorUHV.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 4),
                Materials.Pikyonium64B.item(OrePrefixes.frameGt).get(amount = 4),
                GraviSuiteItems.Superconductor.get(amount = 4),
                Materials.Neutronium.item(OrePrefixes.plateDense).get(amount = 4),
                Materials.Quantium.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Infinite.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingFusion3.get(amount = 8),
                Materials.Phoenixite.item(OrePrefixes.plateDouble).get(amount = 12),
                Materials.DraconiumAwakened.item(OrePrefixes.bolt).get(amount = 16),
            ),
            output = GregTechItems.CasingFusion4.get(amount = 8),
            fluidInputs = null,
            ticks = (50 * 20),
            eu = 2000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.FieldGeneratorUEV.get(),
                Materials.Superconductor.item(OrePrefixes.pipeMedium).get(amount = 6),
                Materials.Quantum.item(OrePrefixes.frameGt).get(amount = 6),
                GraviSuiteItems.Superconductor.get(amount = 6),
                Materials.Neutronium.item(OrePrefixes.plateDense).get(amount = 6),
                Materials.BlackPlutonium.item(OrePrefixes.plateQuadruple).get(amount = 8),
                Materials.Bio.item(OrePrefixes.circuit).get(amount = 8),
                GregTechItems.CasingFusion3.get(amount = 20),
                Materials.CosmicNeutronium.item(OrePrefixes.plateDouble).get(amount = 16),
                Materials.DraconiumAwakened.item(OrePrefixes.bolt).get(amount = 32),
            ),
            output = GregTechItems.CasingFusion4.get(amount = 20),
            fluidInputs = null,
            ticks = (100 * 20),
            eu = 8000000,
        )
    }
}
