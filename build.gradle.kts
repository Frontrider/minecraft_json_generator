import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.3.11"
    application
}

group = "hu.frontrider.minecraft_json_generator"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()

}

dependencies {

    compile("org.jetbrains.kotlin:kotlin-script-runtime:1.3.11")
    compile("org.jetbrains.kotlin:kotlin-script-util:1.3.11")
    compile("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.3.11")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}