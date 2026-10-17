package com.impactrecipes.recipes.opencomputers


internal class OpenComputersFloppySoftwareRecipes {

    internal fun register() {
        OpenComputersBootMediaRecipes.floppy(
            displayName = "OpenOS (Operating System)",
            name = "openos",
            color = 2,
            circuit = 1,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "Plan9k (Operating System)",
            name = "plan9k",
            color = 1,
            circuit = 2,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "Network (Network Stack)",
            name = "network",
            color = 10,
            circuit = 3,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "Data Card Software",
            name = "data",
            color = 9,
            circuit = 4,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "OpenLoader (Boot Loader)",
            name = "openloader",
            color = 13,
            circuit = 5,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "Builder",
            name = "builder",
            color = 11,
            circuit = 6,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "Generator",
            name = "generator",
            color = 5,
            circuit = 7,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "OPPM (Package Manager)",
            name = "oppm",
            color = 6,
            circuit = 8,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "Digger",
            name = "dig",
            color = 3,
            circuit = 9,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "Mazer",
            name = "maze",
            color = 14,
            circuit = 10,
        )

        OpenComputersBootMediaRecipes.floppy(
            displayName = "OpenIRC (IRC Client)",
            name = "irc",
            color = 12,
            circuit = 11,
        )
    }
}
