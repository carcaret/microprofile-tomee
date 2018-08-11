# Introduction
Microprofile Hello World using TomEE

## Gradle

### Build
```
$ ./gradlew clean shadowJar
```

### Run
```
$ java -jar build/libs/<artifactId>-<version>-bundle.jar
```

## Maven

### Build
```
$ mvn clean package
```

### Run
```
$ java -jar target/<artifactId>-<version>-exec.jar