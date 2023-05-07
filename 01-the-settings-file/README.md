# Understanding Gradle 

## 01 – The Settings File

* [Declaring Repositories](https://docs.gradle.org/current/userguide/declaring_repositories.html#sub:centralized-repository-declaration)
* [Plugin Repositories](https://docs.gradle.org/current/userguide/plugins.html#sec:custom_plugin_repositories)
* [Including Builds (Composite Builds)](https://docs.gradle.org/current/userguide/composite_builds.html)
* [Defining Subprojects (Multi-project builds)](https://docs.gradle.org/current/userguide/multi_project_builds.html)

## 02 – The Build Files

* [Applying plugins (Plugins DSL)](https://docs.gradle.org/current/userguide/plugins.html#sec:plugins_block)
* [The `java` Extension (as one example of an Extension added by a plugin)](https://docs.gradle.org/current/userguide/java_plugin.html#sec:java-extension)
* [Declaring Dependencies (other Subprojects)](https://docs.gradle.org/current/userguide/declaring_dependencies_between_subprojects.html)
* [Declaring Dependencies (Components)](https://docs.gradle.org/current/userguide/declaring_dependencies.html)

## 03 – Plugins

3 kind of plugin
- Gradle Core Plugin -> java-library
- Community plugin with own version -> org.jetbrains.kotlin.jvm version "1.5.21"
- Locally defined plugin -> my-java-library

##  04 – Tasks

* [Executing Tasks in Multi-Project Builds](https://docs.gradle.org/current/userguide/intro_multi_project_builds.html#sec:executing_tasks_by_fully_qualified_name)
* [Lifecycle Tasks](https://docs.gradle.org/current/userguide/more_about_tasks.html#sec:lifecycle_tasks)
* [Task Outcomes (UP-TO-DATE, FROM-CACHE, ...)](https://docs.gradle.org/current/userguide/more_about_tasks.html#sec:task_outcomes)
* [Tasks added by the Base Plugin](https://docs.gradle.org/current/userguide/base_plugin.html#sec:base_tasks)
* [Tasks added by the Java Plugin](https://docs.gradle.org/current/userguide/java_plugin.html#sec:java_tasks)
* [Enabling the Build Cache](https://docs.gradle.org/current/userguide/build_cache.html#sec:build_cache_enable)
* [Remote Build Cache setup](https://docs.gradle.org/current/userguide/build_cache.html#sec:build_cache_setup_http_backend)


```shell
./gradlew :app:tasks
## reused from previous build run
./gradlew :app:build --console=plain
## reused from build cached
./gradlew :app:build --console=plain --build-cache
```
