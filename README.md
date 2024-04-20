# ktlint / Issue using standard suppression

## Overview

As per the following Slack channel discussion, an error was detected using **ktlint 1.2.1** after adding a suppression for standard rule `property-naming`
to a source file:
https://kotlinlang.slack.com/archives/CKS3XG0LS/p1713411650318459.

## Requirements
In order to build and run the test, the following is required:

- Java 17 JDK (I used [Amazon Corretto](https://aws.amazon.com/corretto/) **17.0.11-amzn**). To install the said JDK using [SDKMAN](https://sdkman.io/) first clone this project and
  then run this in a console:
  ```shell
  $ sdk env install
  ```
- A working Internet connection (to download all library dependencies required to build the project using [Gradle](https://gradle.org/)). The build script requires access to Maven Central
  and the Gradle Plugins repository.

## Running the tests

### Default Dependencies
* [Kotlin 1.9.10](https://kotlinlang.org/docs/releases.html#release-details)
* [Ktlint Gradle Plugin 12.1.0](https://github.com/JLLeitschuh/ktlint-gradle/releases)
* [ktlint 1.2.1](https://github.com/pinterest/ktlint/releases)

To run the test using default library dependencies, simply execute the following command at a terminal prompt:
```shell
$ ./gradlew clean test --stacktrace
```

### Test using different dependency versions
All the library dependencies listed above can be changed without modifying the actual source code by simply specifying a different
version via one of the following Gradle properties:
* `kotlinVersion`
* `ktlintPluginVersion`
* `ktlintVersion`

For example:
   ```shell
   $ ./gradlew clean test -PktlintVersion=1.2.0 -PkotlinVersion=1.9.23
   ```
