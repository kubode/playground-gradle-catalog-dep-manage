plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version "1.4.30"
}

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}

dependencies {
    commonMainImplementation(platform(project(":platform")))
    commonMainImplementation("io.ktor:ktor-client")
    commonMainImplementation("org.jetbrains.kotlinx:kotlinx-serialization-json")
    "jvmTestImplementation"("junit:junit")
}
