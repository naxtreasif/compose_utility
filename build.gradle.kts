// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {


    val compose_version by extra("1.0.1")

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}


plugins {
    id("io.github.gradle-nexus.publish-plugin").version("1.1.0")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

// Publish to Maven Central
nexusPublishing {
    repositories {
        sonatype {
            username.set("asif.naxtre")
            password.set("Sonatype#2022")
            stagingProfileId.set("20fe104519ea2")
        }
    }
}