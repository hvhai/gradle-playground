plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3:3.9")
}