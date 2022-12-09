pluginManagement {
    includeBuild("../mcve-convention-plugin")
    repositories.mavenLocal()
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}


plugins {
    id("mcve-convention-plugin")
}

rootProject.name = "consumerKotlin"