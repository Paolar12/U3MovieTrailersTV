plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id'kotlin-parcel'
}

android {
    namespace = "com.example.movietrailerstv"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.movietrailerstv"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.leanback)
    implementation(libs. glide)
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.6.0'

    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.3'
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'



}