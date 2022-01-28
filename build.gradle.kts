import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxjava
    implementation("io.reactivex.rxjava2:rxjava:2.2.21")
// https://mvnrepository.com/artifact/io.reactivex/rxkotlin
    implementation("io.reactivex:rxkotlin:2.0.0-RC1")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}