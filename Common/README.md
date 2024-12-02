
# User Registration System with SOLID Principles

## Overview

This project demonstrates a **User Registration System** designed following the **SOLID principles** and implementing multiple **design patterns** such as Dependency Injection, Factory Method, and Adapter Pattern. It includes dynamic analytics integrations and notification services while maintaining a clean and extensible architecture.

---

## Features

1. **User Registration**:
   - Validates user information.
   - Saves user details to the database.
   - Sends multiple types of notifications (Email, SMS, Push).

2. **Dynamic Analytics Integration**:
   - Supports multiple analytics adapters (e.g., Google Analytics, Adobe Analytics).
   - Includes functionality to dynamically enable or disable adapters globally.
   - Allows runtime conditions to determine adapter execution.

3. **Clean and Extensible Architecture**:
   - Adheres to the **SOLID principles**.
   - Implements design patterns for modular and scalable code.

---

## How SOLID Principles Work in This Project

### 1. Single Responsibility Principle (SRP)
- **Definition**: A class should have only one responsibility.
- **Application**:
  - Each class handles a distinct task:
    - `UserValidator` validates user data.
    - `UserRepository` manages database interactions.
    - `NotificationManager` sends notifications.
    - `AnalyticsManager` handles analytics adapters.
  - By separating responsibilities, the system is easier to maintain and extend.

---

### 2. Open/Closed Principle (OCP)
- **Definition**: A class/module should be open for extension but closed for modification.
- **Application**:
  - The `AnalyticsAdapter` interface allows new analytics adapters (e.g., Matomo) to be added without modifying existing code.
  - The `NotificationService` interface enables adding new notification methods (e.g., WhatsApp) without changing the core logic.

---

### 3. Liskov Substitution Principle (LSP)
- **Definition**: Subtypes must be replaceable by their base types.
- **Application**:
  - All adapters implement the `AnalyticsAdapter` interface, ensuring they can be substituted without affecting the `AnalyticsManager`.
  - The `NotificationService` implementations (e.g., `EmailNotificationService`) can be replaced with other services, maintaining consistency.

---

### 4. Interface Segregation Principle (ISP)
- **Definition**: A class should not be forced to implement methods it does not use.
- **Application**:
  - The `AnalyticsAdapter` and `NotificationService` interfaces define minimal, specific methods (`notifyUserRegistration`, `sendNotification`) to avoid unnecessary dependencies.

---

### 5. Dependency Inversion Principle (DIP)
- **Definition**: High-level modules should not depend on low-level modules; both should depend on abstractions.
- **Application**:
  - The `UserRegistrationService` depends on abstract interfaces (`NotificationManager`, `AnalyticsManager`, etc.) instead of concrete implementations.
  - This decouples the high-level logic from specific implementations, making the system more flexible and testable.

---

## Design Patterns Used

### 1. Dependency Injection
- **What**: Passes dependencies (e.g., services) into constructors instead of creating them directly.
- **Where**: In `UserRegistrationService`.
- **Why**: Decouples code, promotes testability, and allows for easier swapping of implementations.

### 2. Factory Method
- **What**: Encapsulates object creation in a central place.
- **Where**: In `ServiceFactory`.
- **Why**: Simplifies object management and enables centralized configuration.

### 3. Adapter Pattern
- **What**: Provides a unified interface for integrating different analytics services.
- **Where**: In `AnalyticsAdapter` and its implementations (e.g., `GoogleAnalyticsAdapter`).
- **Why**: Decouples the core system from external analytics APIs, making integrations more flexible.

### 4. Composite-Like Behavior
- **What**: Combines multiple analytics adapters into a single manageable unit.
- **Where**: In `AnalyticsManager`.
- **Why**: Simplifies handling multiple adapters and supports dynamic execution.

---

## How It Works

### 1. User Registration Flow
- A `User` instance is created with details like name, email, and phone number.
- The `UserRegistrationService`:
  - Validates the user using `UserValidator`.
  - Saves the user to the database using `UserRepository`.
  - Sends notifications through `NotificationManager` (Email, SMS, Push).
  - Notifies analytics services using `AnalyticsManager`.

### 2. AnalyticsManager
- Manages multiple `AnalyticsAdapter` implementations.
- Dynamically determines which adapters to execute based on:
  - **Global State**: Controlled via `isEnabled()` for each adapter.
  - **Runtime Conditions**: Controlled via `shouldRun(User user)` for each adapter.

---

## Project Structure

```
src/
├── Main.java
├── models/
│   └── User.java
├── services/
│   ├── EmailNotificationService.java
│   ├── SMSNotificationService.java
│   ├── PushNotificationService.java
│   ├── NotificationManager.java
│   ├── LoggerService.java
│   ├── UserValidator.java
│   ├── UserRegistrationService.java
|   ├── NotificationService.java
├── repository/
│   └── UserRepository.java
├── adapters/
│   ├── AnalyticsAdapter.java
│   ├── GoogleAnalyticsAdapter.java
│   ├── AdobeAnalyticsAdapter.java
│   └── AnalyticsManager.java
├── factory/
│   └── ServiceFactory.java
```

---

## How to Run

1. **Clone the repository**:
   ```bash
   git clone <repository_url>
   ```

2. **Compile the project**:
   ```bash
   javac -d out src/**/*.java
   ```

3. **Run the application**:
   ```bash
   java -cp out Main
   ```

---

## Example Output

**For a user with:**
- Name: `Harsh Baldaniya`
- Email: `harshkumar.baldaniya@gmail.com`

```plaintext
Saving user Harsh Baldaniya to the database.
Sending welcome email to harshkumar.baldaniya@gmail.com
Sending welcome SMS to 9876543210
Sending push notification to user Harsh Baldaniya
Notifying Google Analytics about user registration: harshkumar.baldaniya@gmail.com
AdobeAnalyticsAdapter is disabled and will not run.
User Harsh Baldaniya registered successfully.
```

---

## Problem Statement with Real-Life Scenario

### Problem Statement:
Design a **User Registration System** for a SaaS platform that:
1. Handles user data validation and persistence.
2. Sends multiple types of notifications dynamically based on configuration.
3. Integrates with various analytics platforms to track user registrations.
4. Allows enabling/disabling analytics integrations without modifying code.
5. Follows the **SOLID principles** and maintains a modular, extensible architecture.

### Real-Life Scenario:
Imagine a SaaS company offering an education platform. When a user registers:
1. The platform must validate and save their details securely.
2. Notifications like a welcome email, SMS, and app push notification should be sent.
3. User activity must be tracked in analytics tools like Google Analytics or Adobe Analytics.
4. The company should be able to dynamically enable or disable certain analytics tools or notification types based on business needs.

This system solves the problem by implementing:
- **Modular notifications and analytics**: Easily add or remove integrations without affecting existing functionality.
- **Dynamic execution**: Enable or disable parts of the system without code changes.
- **Extensibility**: Future integrations can be added with minimal effort.

---

## Contact
For any questions or feedback, please reach out to `harshkumar.baldaniya@gmail.com`.
