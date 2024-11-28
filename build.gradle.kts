/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.11.1/samples
 */
plugins {
    java
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["main-Class"] = "com.gradlehero.languageapp.SayHello"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

// tasks.named<Test>("test") {
//     useJUnitPlatform()
// }