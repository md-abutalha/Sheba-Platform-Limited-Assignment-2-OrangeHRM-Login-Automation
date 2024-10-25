# Sheba-Platform-Limited-Assignment-2-OrangeHRM-Login-Automation
# OrangeHRM Login Testing

## Overview
This project is a basic implementation of automated test cases to validate the login functionality of the **OrangeHRM** web application. The testing was conducted using both manual and automated methods to assess the system's login operations under various scenarios. Due to assignment time constraints and resource limitations, a simplified approach was used to ensure efficient test execution without an extensive automation framework.

### Technologies Used
- **Java**: Primary programming language for the test script.
- **Selenium WebDriver**: Used for browser automation.
- **TestNG**: Test framework for structuring and managing test cases.

## Getting Started
### Prerequisites
To execute this project locally, ensure you have the following installed:
- **Java Development Kit (JDK)**
- **Selenium WebDriver**
- **TestNG**
- **Maven** (for dependency management, if needed)

### Installation
1. Clone or download the repository to your local machine.
2. Import the project into your IDE (such as IntelliJ IDEA or Eclipse).
3. Download the necessary dependencies for Selenium and TestNG, or configure **Maven** to manage dependencies.

## Project Structure
The project contains the following main components:
- **DriverSetUp**: Handles the initialization and configuration of the WebDriver for the browser used in testing.
- **OrangeHrmLoginTest**: Main test class with various test methods for different login scenarios.

## Test Cases

This project implements test cases for different login scenarios to ensure that the login functionality is secure, robust, and reliable. Here are the test cases covered:

1. **Verify Login with Valid Credentials**:
   - **Description**: Tests that a user with correct credentials can successfully log into the dashboard.
   - **Expected Outcome**: Redirects to the dashboard page.
   
2. **Verify Login with Invalid Username**:
   - **Description**: Tests login attempt with an incorrect username.
   - **Expected Outcome**: Displays an error message indicating invalid credentials.
   
3. **Verify Login with Invalid Password**:
   - **Description**: Tests login attempt with an incorrect password.
   - **Expected Outcome**: Displays an error message indicating invalid credentials.
   
4. **Verify Login with Blank Username**:
   - **Description**: Tests login attempt without entering a username.
   - **Expected Outcome**: Error message appears, stating that the username is required.
   
5. **Verify Login with Blank Password**:
   - **Description**: Tests login attempt without entering a password.
   - **Expected Outcome**: Error message appears, stating that the password is required.
   
6. **Verify Password Masking**:
   - **Description**: Ensures that the password is masked (hidden) as users type it.
   - **Expected Outcome**: The password input field hides characters as they are typed.
   
7. **Verify 'Forgot Your Password?' Link Functionality**:
   - **Description**: Tests the functionality of the "Forgot Your Password?" link to ensure it redirects to the password recovery page.
   - **Expected Outcome**: Navigates to the password recovery page.

## Code Explanation

### OrangeHrmLoginTest.java

The `OrangeHrmLoginTest` class is the main test class containing various test cases for login functionality.

#### Key Methods

- `testLoginWithValidCredentials()`: Tests login functionality using valid username and password and verifies navigation to the dashboard.
- `testLoginWithInvalidCredentials()`: Tests login with both invalid username and password to validate that the system correctly restricts access.
- `testLoginWithInvalidUsername()`: Uses an invalid username to ensure the system displays an appropriate error message.
- `testLoginWithBlankPassword()`: Tests login attempt with only the username filled to check if the application prompts for a missing password.
- `testForgotPasswordLink()`: Clicks on the "Forgot Your Password?" link to verify if it redirects correctly to the password reset page.

### Error Handling
Each test case includes assertions to validate the expected outcome. If a test fails, it logs the outcome and an appropriate message, assisting in identifying functionality issues.

## Execution
To run the tests:
1. Open the test file in your preferred IDE.
2. Execute tests using the TestNG framework by running the test class directly or configuring a **TestNG.xml** file for more controlled execution.

## Conclusion
The tests provide an automated approach to validating the login functionality of OrangeHRM, ensuring that common use cases and edge cases are handled effectively. The project demonstrates proficiency in Selenium and TestNG for basic UI test automation, focusing on reliability and ease of use given the limited timeframe.

