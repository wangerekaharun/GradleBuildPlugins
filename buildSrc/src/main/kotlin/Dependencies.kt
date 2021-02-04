object Versions {

    //Version codes for all the libraries
    const val kotlin = "1.4.21"
    const val buildToolsVersion = "4.1.1"
    const val appCompat = "1.3.0-beta01"
    const val constraintLayout = "2.1.0-alpha2"
    const val ktx = "1.5.0-beta01"
    const val material = "1.3.0-rc01"

    //Version codes for all the test libraries
    const val junit4 = "4.13.1"
    const val testRunner = "1.3.1-alpha03"
    const val espresso = "3.4.0-alpha03"
    const val annotation = "1.2.0-beta01"

    // Gradle Plugins
    const val ktlint = "9.4.1"
    const val detekt = "1.14.2"
    const val spotless = "5.9.0"
    const val dokka = "1.4.20"
    const val gradleVersionsPlugin = "0.36.0"
    const val jacoco = "0.8.4"
}

object BuildPlugins {
    //All the build plugins are added here
    const val androidLibrary = "com.android.library"
    const val ktlintPlugin = "org.jlleitschuh.gradle.ktlint"
    const val detektPlugin = "io.gitlab.arturbosch.detekt"
    const val spotlessPlugin = "com.diffplug.spotless"
    const val dokkaPlugin = "org.jetbrains.dokka"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinParcelizePlugin = "org.jetbrains.kotlin.plugin.parcelize"
    const val gradleVersionsPlugin = "com.github.ben-manes.versions"
    const val jacocoAndroid = "com.hiya.jacoco-android"
}

object Libraries {
    //Any Library is added here
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val materialComponents = "com.google.android.material:material:${Versions.material}"
}

object TestLibraries {
    //any test library is added here
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val annotation = "androidx.annotation:annotation:${Versions.annotation}"
}


object AndroidSdk {
    const val minSdkVersion = 21
    const val compileSdkVersion = 30
    const val targetSdkVersion = compileSdkVersion
    const val versionCode = 1
    const val versionName = "1.0"
}