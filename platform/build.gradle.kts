plugins {
    id("java-platform")
}

group = "com.example.gradle.platform"


dependencies.constraints {
    api("mcve-java-plugin-kotlin:mcve-java-plugin-kotlin.gradle.plugin:1.0.0-SNAPSHOT")
}