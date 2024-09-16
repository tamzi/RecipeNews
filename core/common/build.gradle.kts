
plugins {
    alias(libs.plugins.recipenews.jvm.library)
    alias(libs.plugins.recipenews.hilt)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.turbine)
}