pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
    plugins {
        kotlin("multiplatform").version("1.8.0")
    }
}
include(":lib1")
include(":lib2")
