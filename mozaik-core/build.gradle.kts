dependencies {
    implementation(project(":mozaik-api"))

    // clients
    implementation("io.sentry:sentry:5.7.3")

    // utilities
    implementation("com.google.guava:guava:31.1-jre")
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("org.jetbrains:annotations:23.0.0")
    implementation("org.tomlj:tomlj:1.0.0")

    // logging
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.17.2")
    implementation("org.apache.logging.log4j:log4j-core:2.17.2")

    // testing
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}