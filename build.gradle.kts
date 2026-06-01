import settings.getVersionMod

plugins {
    alias(libs.plugins.setup.minecraft)
    alias(libs.plugins.setup.publish)
    id(libs.plugins.buildconfig.get().pluginId)
}

val modId: String by extra
val modName: String by extra
val modGroup: String by extra

extra.set("modVersion", getVersionMod())

buildConfig {
    packageName("com.impactrecipes")
    buildConfigField("String", "MODID", "\"${modId}\"")
    buildConfigField("String", "MODNAME", "\"${modName}\"")
    buildConfigField("String", "VERSION", "\"${getVersionMod()}\"")
    buildConfigField("String", "GROUPNAME", "\"${modGroup}\"")
    useKotlinOutput { topLevelConstants = true }
}

repositories {
    maven("https://maven.accident.space/repository/maven-public/") {
        mavenContent {
            includeGroup("space.impact")
            includeGroup("com.github.GTNewHorizons")
            includeGroup("com.github.Azanor")
            includeGroupByRegex("space\\.impact\\..+")
        }
        credentials {
            username = System.getenv("MAVEN_USER") ?: "NONE"
            password = System.getenv("MAVEN_PASSWORD") ?: "NONE"
        }
    }
}

dependencies {
    // impact
    implementation("space.impact:Forgelin:2.1.1")
    implementation("space.impact:gregtech-impact:5.09.35.32:dev") { isTransitive = false }
    implementation("space.impact:Impact-Core:1.1.0.27:dev")

    // maven impact
    implementation("com.github.GTNewHorizons:EnderCore:0.2.7:dev")

    // other
    implementation("net.industrial-craft:industrialcraft-2:2.2.828-experimental:dev")

    implementation(fileTree(mapOf("dir" to "libRun/", "include" to listOf("*.jar"))))
    compileOnly(fileTree(mapOf("dir" to "libNotRun", "include" to listOf("*.jar"))))
}
