# JUnit-registration-form-automation-test
# Overview
This repository contains an automated test suite for the 'registration form automation test' using JUnit, a widely used testing framework for Java. The test suite is designed to ensure the correctness and reliability of the 'registration form automation test' codebase by automating unit tests.

# Features
* JUnit 5: Leverages the latest features and improvements in JUnit 5.
* Maven/Gradle Integration: Seamlessly integrated with Maven/Gradle for easy build and dependency management.
* Comprehensive Test Coverage: Includes unit tests for key components and functions of the project.

# Prerequisites
* Java: JDK 11 or higher
* Maven/Gradle: Ensure Maven or Gradle is installed for dependency management.
* Adding dependencies
    - For Gradle: // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.23.1'
    - For Maven: add the following dependency to your `pom.xml` file:

```xml
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.23.1</version>
</dependency>
```

* JUnit 5: The project is configured to use JUnit 5, which is included as a dependency.

# Project Structure

plaintext

├── src
│   ├── main
│   │   └── java                             
│   │                
│   └── test
│       └── java
│           └── project
│                 ├── MyJunit2
│                 └── Utils
├── .gitignore
├── build.gradle (or pom.xml)
└── README.md

* src/main/java: Contains the source code of the project. <br />
* src/test/java: Contains the JUnit test cases.<br />
* .gitignore: Contains .idea, .gradle, build, and gradle file<br />
* pom.xml/build.gradle: Build file that manages dependencies and project build lifecycle.

# Getting Started
## Cloning the Repository

### bash
git clone https://github.com/yourusername/your-repo-name.git <br />
cd your-repo-name

## Running the Tests
### Using Maven (in bash)
mvn test

### Using Gradle (in bash)
gradle test

# Test Results
Test results will be output to the console and can also be found in the target/surefire-reports (Maven) or build/reports/tests (Gradle) directory.

# Screenshot of Report
![junit test summary report2](https://i.postimg.cc/G38mDKdX/junit-test-summary-report-2.png)

# Record Video of JUnit Automation Test

https://github.com/user-attachments/assets/3b57b0ef-ebf0-445d-a5ff-0a25ca04cfd3 

