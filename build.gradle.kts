import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.ir.backend.js.compile
import kotlin.script.experimental.jvm.util.KotlinJars.stdlib


plugins {
    kotlin("jvm") version "1.7.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //compile(org.jetbrains.kotlin:kotlin stdlib jdk8)
    testImplementation(kotlin("test"))
//    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.1'
    //implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3'
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}


