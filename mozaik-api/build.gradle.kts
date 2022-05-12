plugins {
    id("java-library").apply(true)
}

dependencies {
    // clients
    api("io.sentry:sentry:5.7.3")

    // utilities
    api("com.google.guava:guava:31.1-jre")
    api("com.google.code.gson:gson:2.9.0")
    api("org.jetbrains:annotations:23.0.0")
    api("org.tomlj:tomlj:1.0.0")

    // logging
    api("org.slf4j:slf4j-api:1.7.36")
}