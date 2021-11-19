plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stdlib)
}

gradlePlugin {
    plugins {
        create("myplugin") {
            id = "com.github.kubode.gradle.plugin"
            implementationClass = "com.github.kubode.gradle.plugin.MyPlugin"
        }
    }
}
