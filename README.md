This repository demonstrates a Gradle issue when extending configurations from another project.

In order to test it, run

```shell
./gradlew copyJars
```

Observe that the build directory contains only libraries of the project "consumer" and not of "lib".