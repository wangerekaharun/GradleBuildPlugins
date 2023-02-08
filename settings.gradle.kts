pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }

    plugins {
        id("com.android.application") version "7.4.1"
        id("org.jetbrains.kotlin.android") version "1.8.10"
        id("com.android.library") version "7.4.1"
        id("com.google.firebase.crashlytics") version "2.5.2"
    }
}
include("app")
rootProject.name = "GradlePlugins"