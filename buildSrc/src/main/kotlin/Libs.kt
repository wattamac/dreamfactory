object Versions {
    const val springBoot = "2.5.2"
    const val kotlin = "1.5.21"
    const val springCloud = "2020.0.3"
    const val testcontainers = "1.16.0"
    const val liquibase = "2.0.4"
    const val openApi = "1.5.8"

    const val springAutoRestDocs = "2.0.11"
    const val springRestDocs = "2.0.5.RELEASE"
    const val kotest = "4.6.1"
}

object Libs {
    const val koltin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect"

    // SpringBoot
    const val springBootBom = "org.springframework.boot:spring-boot-dependencies:${Versions.springBoot}"
    const val springBootStarter = "org.springframework.boot:spring-boot-starter"
    const val springBootTest = "org.springframework.boot:spring-boot-starter-test"
    const val springBootActuator = "org.springframework.boot:spring-boot-starter-actuator"
    const val springBootConfigurationProcessor = "org.springframework.boot:spring-boot-configuration-processor"
    const val springBootWebflux = "org.springframework.boot:spring-boot-starter-webflux"
    const val springBootSecurity = "org.springframework.boot:spring-boot-starter-security"
    const val springBootAop = "org.springframework.boot:spring-boot-starter-aop"
    const val springBootR2dbc = "org.springframework.boot:spring-boot-starter-data-r2dbc"
    const val springBootCache = "org.springframework.boot:spring-boot-starter-cache"
    const val springBootBatch = "org.springframework.boot:spring-boot-starter-batch"
    const val springBootValidation = "org.springframework.boot:spring-boot-starter-validation"
    const val springBootJasypt = "com.github.ulisesbocchio:jasypt-spring-boot-starter:3.0.3"
    const val springBootJson = "org.springframework.boot:spring-boot-starter-json"

    // Spring Cloud
    const val springCloudBom = "org.springframework.cloud:spring-cloud-dependencies:${Versions.springCloud}"
    const val springCloud = "org.springframework.cloud:spring-cloud-starter"
    const val springCloudFeign = "org.springframework.cloud:spring-cloud-starter-openfeign"
    const val springCloudContractStubRunner = "org.springframework.cloud:spring-cloud-starter-contract-stub-runner"
    const val springCloudConsul = "org.springframework.cloud:spring-cloud-starter-consul-config"

    val springWebfluxOpenApi = listOf(
        "org.springdoc:springdoc-openapi-webflux-ui:${Versions.openApi}",
        "org.springdoc:springdoc-openapi-kotlin:${Versions.openApi}"
    )

    val openFeign = listOf(
        springCloudFeign,
        "io.github.openfeign:feign-okhttp:11.2",
        "com.squareup.okhttp3:logging-interceptor:4.9.1",
        "com.squareup.okhttp3:okhttp:4.9.1"
    )

    const val jackson = "com.fasterxml.jackson.module:jackson-module-kotlin"

    const val mysql = "mysql:mysql-connector-java:8.0.25"
    const val r2dbc = "dev.miku:r2dbc-mysql"
    val liquibaseRuntime = listOf(
        "org.liquibase:liquibase-core:4.4.1",
        mysql
    )

    //test
    object TestContainers {
        const val junit = "org.testcontainers:junit-jupiter"
        const val kafka = "org.testcontainers:kafka"
        const val mysql = "org.testcontainers:mysql"
    }

    const val springSecurityTest = "org.springframework.security:spring-security-test"

    val webTestClientRestDocs = listOf(
        "org.springframework.restdocs:spring-restdocs-webtestclient:${Versions.springRestDocs}",
        "capital.scalable:spring-auto-restdocs-json-doclet-jdk9:${Versions.springAutoRestDocs}",
        "capital.scalable:spring-auto-restdocs-core:${Versions.springAutoRestDocs}",
        "org.springframework.restdocs:spring-restdocs-core:${Versions.springRestDocs}"
    )

    const val springmockk = "com.ninja-squad:springmockk:3.0.1"
    const val mockk = "io.mockk:mockk:1.12.0"

    val kotest = listOf(
        "io.kotest:kotest-runner-junit5:${Versions.kotest}",
        "io.kotest:kotest-assertions-core:${Versions.kotest}",
        "io.kotest:kotest-property:${Versions.kotest}"
    )
}