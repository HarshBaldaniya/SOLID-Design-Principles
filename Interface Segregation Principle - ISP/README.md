# Interface Segregation Principle (ISP): Superheroes at Work

## What is ISP?

The **Interface Segregation Principle (ISP)** is a design principle that states no class should be forced to implement methods it doesn’t need. Instead of using one large interface with many methods, you should divide it into smaller, more specific interfaces. This allows classes to only implement what they actually use.

## Why ISP?

By applying ISP, you keep your code modular and flexible. If you have a large interface that includes methods not relevant to all classes, it leads to bloated code. ISP helps avoid this problem by creating specific, targeted interfaces that different classes can implement according to their own needs.
