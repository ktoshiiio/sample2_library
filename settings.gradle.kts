pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//        maven {
//            url = uri("https://maven.pkg.github.com/ktoshiiio/sample_library")
//            credentials {
//                username = "ktoshiiio"
//                password = "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"
//            }
//        }
//    }
//}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "TestingLibrary"
include(":app")
include(":MathLibrary")
