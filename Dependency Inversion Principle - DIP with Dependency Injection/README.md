
# Indian Cooking System with SOLID Principles and Design Patterns

## Overview
This project simulates a **traditional Indian cooking system** for a **village feast**, demonstrating the implementation of **SOLID Principles** and **Design Patterns** using a practical scenario. The system is modular, scalable, and adheres to software design best practices.

---

## Key Concepts

### SOLID Principles
**SOLID principles** are a set of design guidelines that help create maintainable, flexible, and scalable software systems. Here's a detailed explanation of each:

1. **Single Responsibility Principle (SRP):**
   - **Definition**: A class should have only one reason to change. Each class should focus on a single responsibility or functionality.
   - **Example in the Code**: 
     - `Dish` class is responsible only for representing a dish.
     - `VillageHead` class manages the feast but does not handle the cooking logic.

2. **Open-Closed Principle (OCP):**
   - **Definition**: Classes should be open for extension but closed for modification. You should be able to add new functionality without changing existing code.
   - **Example in the Code**: 
     - New cooking methods like `DumCooking` can be added without modifying existing `VillageHead` or `Cooking` implementations.

3. **Liskov Substitution Principle (LSP):**
   - **Definition**: Objects of a superclass (or interface) should be replaceable with objects of its subclass (or implementation) without affecting the correctness of the program.
   - **Example in the Code**: 
     - The `VillageHead` works seamlessly with any implementation of `Cooking` (e.g., `TandoorCooking`, `ChulhaCooking`, etc.).

4. **Interface Segregation Principle (ISP):**
   - **Definition**: A class should not be forced to implement interfaces it does not use. Interfaces should be small and focused on specific functionalities.
   - **Example in the Code**:
     - The `Cooking` interface only defines the `cookDish` method, keeping it simple and relevant to all cooking styles.

5. **Dependency Inversion Principle (DIP):**
   - **Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions.
   - **Example in the Code**:
     - `VillageHead` depends on the `Cooking` interface (abstraction) rather than specific implementations like `TandoorCooking`.

---

### Design Patterns
**Design patterns** are reusable solutions to common software design problems. This project demonstrates:

1. **Factory Pattern**:
   - **Definition**: A creational design pattern that provides a method to create objects without specifying their exact class.
   - **Example in the Code**:
     - `DishFactory` creates instances of `Dish` objects.

2. **Dependency Injection (DI)**:
   - **Definition**: A design pattern where a class receives its dependencies from an external source rather than creating them itself.
   - **Example in the Code**:
     - Spring Framework injects `Cooking` implementations into `VillageHead` at runtime.

---

## Features
- **Multiple Cooking Styles**: Implements various cooking methods like `TandoorCooking`, `ChulhaCooking`, and `KadhaiCooking`.
- **Dynamic Cooking**: The cooking method can be changed at runtime.
- **Extensible and Maintainable**: Adheres to SOLID principles and allows easy addition of new features.

---

## Folder Structure
```
src/
└── main/
    └── java/
        └── com/
            └── example/
                ├── config/
                │   └── AppConfig.java  // Spring configuration class
                ├── cookingMethods/
                │   ├── Cooking.java    // Interface for cooking methods
                │   ├── TandoorCooking.java
                │   ├── ChulhaCooking.java
                │   ├── KadhaiCooking.java
                ├── feast/
                │   ├── VillageHead.java // High-level module for managing the feast
                ├── dishes/
                │   ├── Dish.java        // Class representing dishes
                │   ├── DishFactory.java // Factory class for creating dishes
                └── Main.java            // Entry point of the application
```

---

## How It Works
1. **Define Abstraction**: 
   - The `Cooking` interface defines a common contract for all cooking methods.
2. **Implement Abstraction**:
   - Concrete classes like `TandoorCooking`, `ChulhaCooking`, and `KadhaiCooking` implement the `Cooking` interface.
3. **Inject Dependencies**:
   - The `VillageHead` depends on the `Cooking` interface, and Spring injects the required implementation at runtime.
4. **Dynamic Cooking**:
   - The cooking method can be dynamically switched using the `setCookingMethod` method.

---

## Example Output
```
Village Head orders the preparation of: Butter Naan
Cooking Butter Naan in the tandoor for a smoky flavor!
Dish preparation completed!

Village Head orders the preparation of: Khichdi
Cooking Khichdi on the chulha for an earthy taste!
Dish preparation completed!

Village Head orders the preparation of: Paneer Butter Masala
Cooking Paneer Butter Masala in the kadhai for a rich flavor!
Dish preparation completed!
```

---

# Thank You 😀
