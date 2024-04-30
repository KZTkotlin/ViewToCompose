plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.viewtocompose"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.viewtocompose"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("com.google.android.material:material:1.10.0")

    implementation(libs.bundles.androidx.base)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.splash)

    /** Compose */
    implementation(platform(libs.compose.bom))
    implementation(libs.bundles.androidx.compose)

    /** HTTP Connection */
    implementation(libs.bundles.http)

    /** Coroutines */
    implementation(libs.coroutines)

    /** Lottie */
    implementation(libs.compose.lottie)

    /** Timber */
    implementation(libs.timber)

    /** Debug */
    debugImplementation(libs.bundles.debug.compose)

    /** test */
    testImplementation(libs.bundles.test.all)

    /** androidTest */
    androidTestImplementation(libs.bundles.androidx.test.all)
    androidTestImplementation(platform(libs.compose.bom))

}
