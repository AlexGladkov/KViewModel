plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
    id("maven-publish")
}

group = libs.versions.packageName.get()
version = libs.versions.packageVersion.get()

android {
    namespace = "io.github.alexgladkov.kviewmodel.odyssey"
}

kotlin {
    androidTarget()

    sourceSets {
        commonMain {
            dependencies {
                api(projects.kviewmodel)
                implementation(libs.odyssey.core)
                implementation(libs.odyssey.compose)
            }
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.freeCompilerArgs += "-Xexplicit-api=strict"
    }
}

configureMavenPublication(
    groupId = libs.versions.packageName.get(),
    artifactId = "kviewmodel-odyssey",
    name = "Extensions for Odyssey"
)