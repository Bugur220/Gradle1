plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation(":db")
    implementation(":service")
}

tasks.test {
    useJUnitPlatform()
}