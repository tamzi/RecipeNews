plugins {
    alias(libs.plugins.recipenews.android.application)
    alias(libs.plugins.recipenews.android.application.compose)
}

android {
    namespace = "com.recipenews.rndsdemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.recipenews.rndsdemo"
        versionCode = 1
        versionName = "0.0.1" // X.Y.Z; X = Major, Y = minor, Z = Patch level
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
}

dependencies {
    implementation(libs.androidx.activity.compose)
    implementation(project(":rnds"))
}

dependencyGuard {
    configuration("releaseRuntimeClasspath")
}
