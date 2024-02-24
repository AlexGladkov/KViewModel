@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

include(":kviewmodel", ":kviewmodel-compose", ":kviewmodel-odyssey")
include(":common-example-compose", ":common-example")
include(":android", ":desktop")