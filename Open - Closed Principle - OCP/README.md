## Open/Closed Principle (OCP)

The Open/Closed Principle (OCP) states that software entities (classes, modules, functions) should be open for extension but closed for modification. This means you should be able to add new functionality to a class without altering the existing code.

### Code Example with Multiple Files

Let’s consider a payroll system that calculates employee bonuses. Initially, we might have only two types of employees: Manager and Developer. But as the company grows, we may add more roles, such as Designer.

Using OCP, we can extend the system without modifying existing code by adding new classes for each employee type. This allows us to avoid altering the core bonus calculation logic.

### BonusStrategy.java

Explanation: This is the base interface for calculating bonuses. Each employee type (Manager, Developer, etc.) will implement this interface to define their specific bonus calculation logic.

### ManagerBonus.java

Explanation: This class implements the BonusStrategy interface for managers. Managers get a fixed bonus of 5000.

### DeveloperBonus.java

Explanation: This class implements the BonusStrategy interface for developers. Developers get a fixed bonus of 3000.

### BonusCalculator.java

Explanation: The BonusCalculator class accepts any implementation of the BonusStrategy interface and calculates the bonus accordingly. This allows us to extend the system by adding new employee types (without modifying this class) and still calculate their bonuses.

### Main.java

Explanation: In the Main class, we create different types of employees and calculate their bonuses using the BonusCalculator. When a new role (like Designer) is introduced, we can simply create a new class implementing BonusStrategy without modifying the existing BonusCalculator or employee classes.

### Extending the System: Adding a Designer Bonus

If the company decides to add bonuses for designers, we simply create a new DesignerBonus class that implements BonusStrategy:

### Explanation of the Open/Closed Principle (OCP):

1. Open for extension: You can add new functionality (e.g., new employee roles like Designer) by creating new classes that implement the BonusStrategy interface.
2. Closed for modification: You don't need to modify existing classes (BonusCalculator, ManagerBonus, DeveloperBonus) to add new functionality. The existing code remains unchanged, preventing unintended side effects.

Scenario: Payment Gateway System
You are building an e-commerce platform that integrates multiple payment methods. Initially, the platform only supports credit card payments. Later, the company decides to add support for PayPal, Google Pay, and other payment gateways.

Without OCP:
Initially, the PaymentService class has hardcoded logic for handling credit card payments. Every time a new payment method is added, the existing PaymentService needs to be modified to support it. This approach violates OCP because you are repeatedly modifying the class.
With OCP:
Using the Open/Closed Principle, you design a system where the PaymentService relies on an interface PaymentMethod. Each payment method (e.g., CreditCardPayment, PayPalPayment, GooglePayPayment) implements the PaymentMethod interface. Now, when you need to add a new payment gateway, you simply add a new class implementing the interface. The core PaymentService code remains unchanged, adhering to OCP.