plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.apache.httpcomponents:httpclient:4.5.12")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.1")
//    implementation("com.googlecode.json-simple:json-simple:1.1.1")
//    implementation("com.google.code.gson:gson:2.8.2")

}

tasks.test {
    useJUnitPlatform()
}