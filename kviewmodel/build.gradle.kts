plugins {
    id("multiplatform-setup")
    id("android-setup")
    id("maven-publish")
}

group = libs.versions.packageName.get()
version = libs.versions.packageVersion.get()

android {
    namespace = "io.github.alexgladkov.kviewmodel"
}

kotlin {
    androidTarget()

    sourceSets {
        commonMain {
            dependencies {
                api(libs.coroutines.core)
            }
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.freeCompilerArgs += "-Xexplicit-api=strict"
    }
}

configureMavenPublication(
    groupId = libs.versions.packageName.get(),
    artifactId = "kviewmodel",
    name = "KViewModel Base Part"
)