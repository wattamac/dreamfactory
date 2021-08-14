buildscript {
    repositories {
        maven("https://repo.linecorp.com/repository/plugins.gradle.org")
    }
}

plugins {
    `kotlin-dsl`
}

repositories {
    repositories {
        maven("https://repo.linecorp.com/repository/releases/")
    }
}
dependencies {
    implementation(gradleApi())
    implementation("org.asciidoctor:asciidoctor-gradle-jvm:3.3.2")

    implementation("org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:3.3")
    implementation("org.jacoco:org.jacoco.core:0.8.7")

    implementation("org.ajoberstar.grgit:grgit-gradle:4.1.0")
    implementation("gradle.plugin.com.google.cloud.tools:jib-gradle-plugin:3.0.0")
}