# Assignment 1: Builder Pattern - GamingPC

## Project Overview
This project implements the Builder pattern in Java to assemble a Gaming PC. Instead of using a huge constructor with many parameters, the Builder helps configure required and optional PC parts step by step.

### Main Classes:
* **GamingPC**: Product class. Holds PC specifications (CPU, GPU, RAM, Storage, Cooling, RGB).
* **GamingPC.Builder**: Static inner class to build the PC step-by-step.
* **PCDirector**: Contains presets (`buildGamingPC`, `buildBudgetPC`).
* **Main**: Client class to test the builds and print results.

---

## Clean Code Principles (Section 3)

### 1. Meaningful Names
Variables and methods clearly state what they do without needing comments.
* Example: `setCpu()`, `buildGamingPC()`, `budgetPC`.

### 2. Small, Single-Purpose Methods
Each method in the builder just sets one field and returns `this`.

```java
public Builder setCpu(String cpu) {
    this.cpu = cpu;
    return this;
}
```

### 3. Validated Construction
The `build()` method checks essential components before creating the object:

```java
public GamingPC build() {
    if (cpu == null || gpu == null) {
        throw new IllegalStateException("CPU and GPU cannot be null");
    }
    return new GamingPC(this);
}
```

### 4. Immutability & Encapsulation
The `GamingPC` constructor is `private` (can only be made via Builder), and all fields are `final` so they cannot be changed after creation.

```java
private final String cpu;
private GamingPC(Builder builder) { ... }
```

### 5. Method Chaining (Fluent Interface)
Returning `this` in setters lets us chain calls cleanly instead of passing many `null` values into a constructor:

```java
GamingPC customPC = new GamingPC.Builder()
        .setCpu("Intel Core i7-14700K")
        .setGpu("NVIDIA RTX 4070 Ti")
        .setRamGb(32)
        .build();
```
