plugins {
    java
    application
}

group = "com.example"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    // Crypto Dependencies
    implementation("org.bouncycastle:bcprov-jdk18on:1.79")
    implementation("io.jsonwebtoken:jjwt-api:0.12.5")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.12.5")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.12.5")
    implementation("com.nimbusds:nimbus-jose-jwt:9.40")

    // Non-Crypto Dependencies
    implementation("org.slf4j:slf4j-api:2.0.12")
    runtimeOnly("org.slf4j:slf4j-simple:2.0.12")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.2")

    // Test Dependencies
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

application {
    mainClass.set("com.example.crypto.GradleCryptoApp")
}

tasks.test {
    useJUnitPlatform()
}
