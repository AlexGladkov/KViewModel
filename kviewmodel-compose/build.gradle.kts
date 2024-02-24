plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
    id("com.vanniktech.maven.publish")
}

android {
    namespace = "com.adeo.kviewmodel.compose"
}

kotlin {
    androidTarget()

    sourceSets {
        commonMain {
            dependencies {
                api(projects.kviewmodel)
            }
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.freeCompilerArgs += "-Xexplicit-api=strict"
    }
}