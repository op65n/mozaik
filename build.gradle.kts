group = "org.op65n"
version = "0.0.0"

plugins {
    id("java")
    id("com.github.johnrengelman.shadow").version("7.1.2").apply(false)
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(17))
    }
}