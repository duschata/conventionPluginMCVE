pluginManagement {
    includeBuild("../mcve-convention-plugin")
    repositories.mavenLocal()
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}



rootProject.name = "consumerKotlin"