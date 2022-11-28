plugins {
    id("mcve-convention-plugin")
}

apply(plugin = "mcve-java-plugin-kotlin")

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.5")

}

