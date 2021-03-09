plugins {
    `java-platform`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform(kotlin("bom", "1.4.30")))
    api(platform("io.ktor:ktor-bom:1.5.0"))
    constraints {
        api("junit:junit:4.12")
    }
}
