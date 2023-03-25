plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

kotlin {
//    metadata {
//        compilations.all {
//            compileTaskProvider.configure {
//                enabled = false
//            }
//        }
//    }
    ios() {
        compilations.getByName("main") {
            val objcInterop by cinterops.creating {
                defFile("src/nativeInterop/cinterop/objcInterop.def")
                packageName("org.example.lib1.objc")
            }
        }
    }
    sourceSets {
        val iosMain by getting {

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
