plugins {
    java
    id("org.springframework.boot") version "3.1.5"
}

apply(plugin = "io.spring.dependency-management")

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation(project(":api"))
    runtimeOnly(project(":implementation"))
}
