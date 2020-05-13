package com.example.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import java.util.*

class FLintPlugin : Plugin<Project> {
    override fun apply(p0: Project) {
        println("插件执行")
    }
}