package com.github.nashikhmin.testjreplugin.services

import com.github.nashikhmin.testjreplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
