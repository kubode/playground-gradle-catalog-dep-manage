plugins {
    `java-platform`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform(kotlin("bom", "1.4.30")))
    api(platform("io.ktor:ktor-bom:1.4.0"))
    constraints {
        api("junit:junit:4.12")
    }
    api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")
    api("io.reactivex.rxjava3:rxjava:3.0.0")
}
