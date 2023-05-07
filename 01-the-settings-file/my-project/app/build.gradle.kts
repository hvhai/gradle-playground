plugins {
//    id("base")
//    id("java-library")
    id("application")
}

application {
    mainClass.set("MyApplication")
}

dependencies {
    implementation(project(":business-logic"))
}