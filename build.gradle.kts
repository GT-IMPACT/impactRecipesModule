plugins {
    id("minecraft-setup")
    id("publish-setup")
}

impactMod {
    modId.set("impact-recipesModule")
    modName.set("Impact | Recipes Module")
    modGroup.set("com.impactrecipes")
    mavenGroup.set("space.impact")
    mavenUrl.set("https://maven.accident.space/repository/maven-releases/")
}

val modId = impactMod.modId.get()
val modName = impactMod.modName.get()
val modGroup = impactMod.modGroup.get()

buildConfig {
    packageName("com.impactrecipes")
    buildConfigField("String", "MODID", "\"${modId}\"")
    buildConfigField("String", "MODNAME", "\"${modName}\"")
    buildConfigField("String", "VERSION", "\"${project.version}\"")
    buildConfigField("String", "GROUPNAME", "\"${modGroup}\"")
    useKotlinOutput {
        topLevelConstants = true
        internalVisibility = false
    }
}

dependencies {
    // impact
    implementation("space.impact:Forgelin:2.1.1")
    implementation("space.impact:gregtech-impact:5.09.36.1:dev") { isTransitive = false }
    implementation("space.impact:Impact-Core:1.1.1.0:dev") {
        exclude(group = "space.impact", module = "VirtualWorld")
    }
    implementation("space.impact:VirtualWorld:2.0.4:dev") { isTransitive = false }

    // maven impact
    implementation("com.github.GTNewHorizons:EnderCore:0.2.7:dev")

    // other
    implementation("net.industrial-craft:industrialcraft-2:2.2.828-experimental:dev")

    implementation(fileTree(mapOf("dir" to "libRun/", "include" to listOf("*.jar"))))
    compileOnly(fileTree(mapOf("dir" to "libNotRun", "include" to listOf("*.jar"))))
}
