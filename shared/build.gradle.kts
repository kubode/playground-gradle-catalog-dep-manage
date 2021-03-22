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
                implementation("io.ktor:ktor-client")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("io.reactivex.rxjava3:rxjava")
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation("junit:junit")
            }
        }
    }
}

dependencies {
    commonMainImplementation(platform(project(":platform")))
}
