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
            includeGroupByRegex("space\\.impact\\..+")
        }
    }
}

dependencies {
    api("space.impact:Forgelin:2.0.3")
    api("space.impact:gregtech-impact:5.09.35.25:dev")
    api("net.industrial-craft:industrialcraft-2:2.2.828-experimental:dev")
    api("space.impact:Impact-core:1.1.0.21:dev")
    api("space.impact:VirtualWorld:1.4.2:dev")
    api("com.github.GTNewHorizons:Applied-Energistics-2-Unofficial:rv3-beta-307-GTNH:dev")

    implementation(fileTree(mapOf("dir" to "libRun/", "include" to listOf("*.jar"))))
    compileOnly(fileTree(mapOf("dir" to "libNotRun", "include" to listOf("*.jar"))))

}
