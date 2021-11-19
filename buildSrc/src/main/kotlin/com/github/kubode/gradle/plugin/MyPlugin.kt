package com.github.kubode.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        println("test")
    }
}
