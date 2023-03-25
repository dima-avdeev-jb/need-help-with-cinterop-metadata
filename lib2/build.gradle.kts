plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

kotlin {
    ios()
    sourceSets {
        val iosMain by getting {
            dependencies {
                implementation("org.example:lib1:0.0.1")
            }
        }
    }
}

group = "org.example"
version = "0.0.1"
publishing {
    repositories {
        mavenLocal()
    }
}
