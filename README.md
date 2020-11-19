# GradleBuildPlugins

👀 Sample project that shows you how to configure plugins. After generating the project from this template, remember that you need to customize detekt rules and spotless plugin, if needed:

- If you need to customize detekt rules, edit the detekt.yml on your root directory

- Inside the spotless folder, on your root directory - add your license file

- Remember to refactor the package name :rocket:

### Prerequisites

Before every commit, make sure you run the following commands:

```shell script
./codeAnalysis
```

To check for dependency updates, run the following command:

```shell script
./gradlew dependencyUpdate
```

Refer to this [issue](https://github.com/gradle/gradle/issues/10248), if you get any issues running the lint commands on the terminal :rocket:

## Tech-stack

* Gradle
    * [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html) - For reference purposes, here's an [article explaining the migration](https://medium.com/@evanschepsiror/migrating-to-kotlin-dsl-4ee0d6d5c977).
    * Plugins
        * [Ktlint](https://github.com/JLLeitschuh/ktlint-gradle) - creates convenient tasks in your Gradle project that run ktlint checks or do code auto format.
        * [Detekt](https://github.com/detekt/detekt) - a static code analysis tool for the Kotlin programming language.
        * [Spotless](https://github.com/diffplug/spotless) - format java, groovy, markdown and license headers using gradle.
        * [Dokka](https://github.com/Kotlin/dokka) - a documentation engine for Kotlin, performing the same function as javadoc for Java.
        * [jacoco](https://github.com/jacoco/jacoco) - a Code Coverage Library.
        * [Gradle Versions](https://github.com/ben-manes/gradle-versions-plugin) - provides a task to determine which dependencies have updates. Additionally, the plugin checks for updates to Gradle itself.
        
For reference, here's a detailed explanation of the approach of the plugin configuration in this project - [A Day with an Elephant in the Room: Configuring Gradle Plugins.](https://medium.com/@harunwangereka/a-day-with-an-elephant-in-the-room-configuring-gradle-plugins-3331b0be64c7)
