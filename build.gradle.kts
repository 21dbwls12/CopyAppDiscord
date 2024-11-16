// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    // ktor serialization
    id ("org.jetbrains.kotlin.plugin.serialization") version "2.0.20"
    // hilt
    id("com.google.dagger.hilt.android") version "2.44" apply false
    // kotlin compose compiler
    alias(libs.plugins.compose.compiler) apply false
}