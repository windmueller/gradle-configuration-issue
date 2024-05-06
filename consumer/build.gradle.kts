plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation(libs.guava)
}

evaluationDependsOn(":lib")

val conf: Configuration by configurations.creating {
    extendsFrom(project(":lib").configurations.implementation.get())
}

println(conf.files)

val copyJars by tasks.registering(Copy::class) {
    from(conf.files)
    into(layout.buildDirectory.dir("copy-target"))
}