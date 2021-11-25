pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

rootProject.name = "Redux-Kotlin-Select"

include(
    ":reduxkotlin-select",
    ":sample"
)
// this is an annoying workaround since the Maven plugin seems to use the Gradle project name as
// artifact id instead of the id defined in the plugin configuration so now the Gradle project name
// just matches the artifact id (see also: https://github.com/gradle/gradle/issues/15731
// -> issue is closed, why...?)
project(":reduxkotlin-select").projectDir = file("./select")
