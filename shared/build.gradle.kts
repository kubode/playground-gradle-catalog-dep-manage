plugins {
    kotlin("multiplatform")
    alias(libs.plugins.kotlin.plugin.serialization)
}

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlin.stdlib)
                implementation(libs.ktor.client)
                implementation(libs.bundles.kotlinx.serialization)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.bundles.kotlin.test)
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(libs.rxjava3)
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(libs.junit)
            }
        }
    }
}

dependencies {
    commonMainImplementation(platform(libs.kotlin.bom))
    commonMainImplementation(platform(libs.ktor.bom))
}
