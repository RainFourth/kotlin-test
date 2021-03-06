import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    application

    // For annotation processing
    //id("com.google.devtools.ksp") version "1.6.21-1.0.5"
}



group = "com.rrain"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    //gradlePluginPortal()
}


dependencies {
    testImplementation(kotlin("test"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")

    // https://mvnrepository.com/artifact/org.apache.poi/poi
    implementation("org.apache.poi:poi:5.2.2")
    implementation("org.apache.poi:poi-ooxml:5.2.2")

    // Apache Log4j
    // https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core
    implementation("org.apache.logging.log4j:log4j-core:2.17.2")
    implementation(kotlin("reflect"))


    // Annotation Processing:
    //compile("de.jensklingenberg:mpapt-runtime:0.8.7")
    //implementation(project(":annotations"))
    // Code generation library for kotlin, highly recommended
    //implementation("com.squareup:kotlinpoet:0.7.0")
    // configuration generator for service providers
    //implementation("com.google.auto.service:auto-service:1.0-rc4")
    //kapt("com.google.auto.service:auto-service:1.0-rc4")

    // Kotlin Symbol Processing
    // view new versions: https://search.maven.org/artifact/com.google.devtools.ksp/symbol-processing-api
    //implementation("com.google.devtools.ksp:symbol-processing-api:1.6.21-1.0.5")


    //implementation(kotlin("stdlib"))
    //implementation("com.squareup:javapoet:1.13.0")
    // Kotlin Symbol Processing
    // view new versions: https://search.maven.org/artifact/com.google.devtools.ksp/symbol-processing-api
    //implementation("com.google.devtools.ksp:symbol-processing-api:1.6.21-1.0.5")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

application {
    mainClass.set("MainKt")
}



/*kotlin {
    sourceSets.all {
        languageSettings.apply {
            languageVersion = "1.7"
        }
    }
}*/
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    languageVersion = "1.7"
}