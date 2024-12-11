
# Indian Cooking System with SOLID Principles and Design Patterns

## Overview
This project simulates a **traditional Indian cooking system** for a **village feast**, demonstrating the implementation of **SOLID Principles** and **Factory Design Pattern** using a practical scenario. The system manages both dishes and their recipes in a modular and extendable way.

---

## Features
1. **Multiple Cooking Methods**:
   - Implements various cooking styles like `TandoorCooking`, `ChulhaCooking`, and `KadhaiCooking`.
2. **Dish Recipes**:
   - Dishes like `Khichdi` and `Paneer Butter Masala` include detailed ingredients and preparation steps.
3. **Dynamic Cooking**:
   - Cooking methods can be dynamically switched at runtime.
4. **Extensible and Maintainable**:
   - Easily add new dishes and cooking styles without modifying existing code.

---

## SOLID Principles
### 1. Single Responsibility Principle (SRP)
- **Definition**: A class should have only one reason to change.
- **Example**:
  - The `Dish` class focuses solely on representing a dish and its recipe.
  - The `VillageHead` class manages the preparation and delegation of cooking tasks.

### 2. Open-Closed Principle (OCP)
- **Definition**: Classes should be open for extension but closed for modification.
- **Example**:
  - New dishes (e.g., `DumAlooDish`) can be added by creating new classes without modifying the existing code.

### 3. Liskov Substitution Principle (LSP)
- **Definition**: Subclasses should be replaceable with their parent class without breaking the system.
- **Example**:
  - Any subclass of `Dish` (e.g., `KhichdiDish`, `PaneerButterMasalaDish`) can replace `Dish` without issues.

### 4. Interface Segregation Principle (ISP)
- **Definition**: A class should not be forced to implement methods it does not use.
- **Example**:
  - The `Cooking` interface defines only one method (`cookDish`), keeping it focused and relevant.

### 5. Dependency Inversion Principle (DIP)
- **Definition**: High-level modules should not depend on low-level modules; both should depend on abstractions.
- **Example**:
  - The `VillageHead` depends on the `Cooking` interface, not specific implementations like `TandoorCooking`.

---

### Design Patterns
**Design patterns** are reusable solutions to common software design problems. This project demonstrates:

1. **Factory Pattern**:
   - **Definition**: A creational design pattern that provides a method to create objects without specifying their exact class.
   - **Example in the Code**:
     - The `DishFactory` dynamically creates `Dish` objects based on the dish name.

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
                │   └── AppConfig.java           // Spring configuration class
                ├── cookingMethods/
                │   ├── ChulhaCooking.java
                │   ├── Cooking.java
                │   ├── KadhaiCooking.java
                │   ├── TandoorCooking.java
                ├── dishes/
                │   ├── Dish.java               // Represents both dishes and their recipes
                │   ├── DishFactory.java        // Factory for creating dishes and recipes
                │   ├── KhichdiDish.java        // Specific class for Khichdi
                │   ├── PaneerButterMasalaDish.java // Specific class for Paneer Butter Masala
                ├── feast/
                │   ├── VillageHead.java        // High-level module for managing the feast
                └── Main.java                   // Entry point of the application
```

---

## How It Works
1. **Define Abstraction**: 
   - The `Cooking` interface defines a common contract for all cooking methods.
2. **Implement Abstraction**:
   - Concrete classes like `TandoorCooking`, `ChulhaCooking`, and `KadhaiCooking` implement the `Cooking` interface.
   - The `Dish` class holds both the name and recipe details for dishes.
   - Subclasses (e.g., `KhichdiDish`, `PaneerButterMasalaDish`) provide specific ingredients and steps.
3. **Inject Dependencies**:
   - The `VillageHead` depends on the `Cooking` interface, and Spring injects the required implementation at runtime.
4. **Dynamic Cooking**:
   - The `VillageHead` uses `Cooking` implementations (e.g., `TandoorCooking`, `ChulhaCooking`) to prepare dishes.
   - The cooking method can be dynamically switched using the `setCookingMethod` method.

---

## Example Output
```
Village Head orders the preparation of: Khichdi

--- Recipe for Khichdi ---
Ingredients for Khichdi:
- Rice: 1 cup (the base of all greatness!)
- Yellow lentils (Moong Dal): 1/2 cup (protein boost!)
- Ghee: 2 tbsp (for that golden glow!)
- Vegetables: Peas, carrots, beans (mom said so!)
- Spices: Cumin, turmeric, salt (the essentials!)
Steps to prepare Khichdi:
1. Wash rice and lentils (clean is cool!).
2. Heat ghee and fry spices (let it sizzle!).
3. Add veggies and sauté (feel like a top chef for 2 minutes!).
4. Add rice, lentils, and water (mix it up!).
5. Cook until soft and serve hot (easy-peasy!).
Cooking Khichdi on the chulha for an earthy taste!
Dish preparation completed!

Village Head orders the preparation of: Paneer Butter Masala

--- Recipe for Paneer Butter Masala ---
Ingredients for Paneer Butter Masala:
- Paneer: 250g (the hero of the dish!)
- Butter: 3 tbsp (because why not!)
- Tomatoes: 4 (pureed to perfection!)
- Cream: 1/4 cup (make it rich!)
- Spices: Garam masala, turmeric, chili powder, salt (flavor bomb!)
Steps to prepare Paneer Butter Masala:
1. Heat butter and fry spices (start strong!).
2. Add tomato puree and simmer (keep it smooth!).
3. Stir in cream (creamy vibes only!).
4. Add paneer and cook (don?t overcook the star!).
5. Garnish and serve (show it off!).
Cooking Paneer Butter Masala in the kadhai for a rich flavor!
Dish preparation completed!
```

---

# Thank You 😀
