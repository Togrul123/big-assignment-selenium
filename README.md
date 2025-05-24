# Selenium AutomationTestStore Tests

## Overview
This project contains automated tests for https://automationteststore.com using Selenium WebDriver in Java.

## Included Tests
- Login functionality test
- Logout functionality test
- Static page content verification
- Complex XPath usage test
- Advanced tests: JavaScriptExecutor, browser back navigation

## How to Run
1. Ensure you have Java 17+ and Maven/Gradle installed.
2. Run tests using your IDE or command line:
3. Tests use ChromeDriver. Make sure ChromeDriver executable path is set correctly in `BaseTest.java`.

## Project Structure
- `pages/` - Page Object classes following POM pattern
- `tests/` - JUnit test classes
