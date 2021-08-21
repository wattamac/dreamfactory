import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("com.github.node-gradle.node") version "3.0.1"
}

val jar: Jar by tasks
val bootJar: BootJar by tasks

bootJar.enabled = false
jar.enabled = true

tasks.register<com.github.gradle.node.npm.task.NpmTask>("npmInstalls") {
    workingDir.set(file("${project.projectDir}/frontend"))
    args.set(listOf("install"))
}
tasks.register<com.github.gradle.node.npm.task.NpmTask>("npmBuild") {
    workingDir.set(file("${project.projectDir}/frontend"))
    args.set(listOf("run", "build"))
//    setWorkingDir(file("${project.projectDir}/frontend"))
//    setArgs(listOf("run", "build:${profile}"))
}.get().dependsOn("npmInstalls")

//tasks.processResources.get().dependsOn("npmBuild")

tasks {
    clean {
        doFirst {
            delete("${project.projectDir}/src/main/resources/static")
        }
    }
}