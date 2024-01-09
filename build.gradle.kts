plugins {
    alias(libs.plugins.buildconfig)
    id("minecraft")
}

repositories {
    maven("https://maven.accident.space/repository/maven-public/")
    maven("http://jenkins.usrv.eu:8081/nexus/content/groups/public/") { isAllowInsecureProtocol = true }
    maven("https://jitpack.io")
    maven("https://cursemaven.com")
    maven("https://maven2.ic2.player.to/") { metadataSources { mavenPom(); artifact() } }
    mavenCentral()
    mavenLocal()
}

dependencies {

    api("space.impact:forgelin:2.0.+") { isChanging = true }
    api("space.impact:gregtech:5.09.35.14:dev") { isChanging = true; isTransitive = false }
    api("net.industrial-craft:industrialcraft-2:2.2.828-experimental:dev")
    api("space.impact:impact:1.1.0-dev-8:dev") {
        exclude("com.github.GTNewHorizons", "Applied-Energistics-2-Unofficial")
    }
    api("space.impact:impact_vw:1.3.4:dev") {
        exclude("io.github.legacymoddingmc")
        isChanging = true
    }

    api("com.github.GTNewHorizons:Applied-Energistics-2-Unofficial:rv3-beta-307-GTNH:dev")

    implementation(fileTree(mapOf("dir" to "libRun/", "include" to listOf("*.jar"))))
    compileOnly(fileTree(mapOf("dir" to "libNotRun", "include" to listOf("*.jar"))))

}
