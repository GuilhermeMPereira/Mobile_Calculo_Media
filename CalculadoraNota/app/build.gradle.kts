plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.calculadoranota"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.calculadoranota"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)  // Versão atualizada
    implementation(libs.material)  // Dependência do Material Design
    implementation(libs.androidx.activity)  // Atualizado para androidx.activity 1.10.1
    implementation(libs.androidx.constraintlayout)  // ConstraintLayout
    testImplementation(libs.junit)  // Dependência para testes unitários
    androidTestImplementation(libs.androidx.junit)  // Testes Android com JUnit
    androidTestImplementation(libs.androidx.espresso.core)  // Dependência para Espresso (testes UI)
    implementation ("de.hdodenhof:circleimageview:3.1.0")
}
