plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.example.mathlibrary"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

//allprojects {
//    repositories {
//        maven {
//            url =  uri("https://jitpack.io")
//        }
//    }
//}


//publishing {
//    publications {
//        create("bar", MavenPublication::class.java) {
//            groupId = "co.jp.empolio"
//            artifactId = "mathlibrary"
//            version = "0.1.0"
//            artifact("$buildDir/outputs/aar/Mathlibrary-release.aar")
//        }
//    }
//    repositories {
//        maven {
//            name = "GithubPackages"
//            url = uri("https://maven.pkg.github.com/ktoshiiio/sample2_library")
//            credentials {
//                username = "ktoshiiio"
//                password = "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"
//            }
//        }
//    }
//}

afterEvaluate{
    publishing{
        publications {
        create("release", MavenPublication::class.java) {
            groupId = "co.jp.empolio"
            artifactId = "sample2_library"
            version = "0.1.3"
            artifact("$buildDir/outputs/aar/Mathlibrary-release.aar")
        }
    }
    }
}


dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("com.github.ktoshiiio:sample2_library:Tag")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}