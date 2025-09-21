# Automation Testing with Selenium & Cucumber (Java)

## Project Overview

This project demonstrates **automation testing of web applications** using **Selenium WebDriver** integrated with **Cucumber** for **Behavior-Driven Development (BDD)** in **Java**. Test scenarios are written in **plain English (Gherkin syntax)** and automated using Selenium.

---

## Features Tested

* Login functionality
* Form submission
* Navigation between pages
* Validation of page elements
* Positive and negative test scenarios

---

## Tools & Technologies

* **Programming Language:** Java
* **Automation Tool:** Selenium WebDriver
* **BDD Framework:** Cucumber
* **Test Runner:** JUnit
* **Build Tool:** Maven
* **IDE:** Eclipse / IntelliJ IDEA
* **Browser:** Chrome / Firefox

---

## Project Structure

```
src/test/java
│
├── features
│   └── login.feature
│
├── stepDefinitions
│   └── LoginSteps.java
│
└── runners
    └── TestRunner.java
```

* `features` → Contains all `.feature` files (test scenarios in Gherkin).
* `stepDefinitions` → Contains Java methods corresponding to Gherkin steps.
* `runners` → Test runner class to execute feature files.

---

## Setup Instructions

1. **Clone the Repository**

```bash
git clone <repository_url>
```

2. **Install Java & Maven**

   * Ensure **Java JDK 8+** is installed
   * Ensure **Maven** is installed and configured

3. **Install Browser Driver**

   * Download **ChromeDriver** / **GeckoDriver**
   * Set the path in your step definition class

4. **Install Dependencies**

```bash
mvn clean install
```

5. **Run Tests**

   * Right-click `TestRunner.java` → **Run as → JUnit Test**
   * Or via Maven:

```bash
mvn test
```

---

## Sample Scenario

**Feature: Login Functionality**

```gherkin
Scenario: Successful login with valid credentials
  Given User is on the login page
  When User enters valid username and password
  And User clicks on login button
  Then User should be redirected to the homepage
```

**Step Definition Sample**

```java
@Given("User is on the login page")
public void user_is_on_login_page() {
    driver.get("https://example.com/login");
}
```

---

## Reports

* Test execution reports generated in HTML format:
  `target/cucumber-reports.html`

---

## Best Practices

* Use **Page Object Model (POM)** for scalable automation
* Keep feature files **clean and readable**
* Reuse step definitions across scenarios
* Maintain proper **naming conventions** for steps and methods

---

## Author

Hari Suresh
