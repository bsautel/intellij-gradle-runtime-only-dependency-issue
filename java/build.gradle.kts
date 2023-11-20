plugins {
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":api"))
    runtimeOnly(project(":implementation"))
}

application {
    mainClass = "org.example.java.Application"
}
