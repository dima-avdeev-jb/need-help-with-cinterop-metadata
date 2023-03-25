pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
    plugins {
        kotlin("multiplatform").version("1.8.10")
    }
}
include(":lib1")
include(":lib2")
include(":lib3")
