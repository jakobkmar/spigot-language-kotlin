plugins {
    kotlin("jvm") version "1.5.0"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "net.axay"
version = "0.0.1"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.16.5-R0.1-SNAPSHOT")

    api(kotlin("stdlib"))
    api(kotlin("stdlib-jdk8"))
    api(kotlin("reflect"))

    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.5.0")
    api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
}

tasks {
    processResources {
        inputs.property("version", project.version)

        filesMatching("plugin.yml") {
            expand("version" to project.version)
        }
    }

    compileJava {
        options.release.set(11)
        options.encoding = "UTF-8"
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}
