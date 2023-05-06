// name your gralde build
rootProject.name = "my-project"

// repositories and localtion of other builds for gradle plugin
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    includeBuild("../my-build-logic")
}

// repositories and location of other builds for libraries
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    includeBuild("../my-other-project")
}

// structure of the build - subprojects
include("app")
include("business-logic")
include("data-model")

// script code in the setting file
//rootDir.listFiles().filter { it.isDirectory && !it.isHidden }.forEach{
//    include(it.name)
//}
