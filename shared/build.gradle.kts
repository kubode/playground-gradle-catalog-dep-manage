plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.ksp)
    id("com.github.kubode.gradle.plugin")
}

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlin.stdlib)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.bundles.kotlin.test)
            }
        }
    }
}

dependencies {
    commonMainImplementation(platform(libs.kotlin.bom))
}
