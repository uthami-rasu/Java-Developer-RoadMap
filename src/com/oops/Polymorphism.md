

## 🧠 1. What is Polymorphism?

**Polymorphism** literally means **“many forms.”**

👉 In Java OOP, it means **the same object or method can behave differently based on the context**.

---

### 💡 Simple Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // same type reference, different object
        Animal a2 = new Cat();

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
    }
}
```

✅ **Output:**

```
Dog barks
Cat meows
```

👉 **Same method name (`sound()`)**, but different behavior depending on the **actual object type**.
This is called **runtime polymorphism**.

---

## 🧩 2. Types of Polymorphism in Java

| Type                      | When Decided             | Example                |
| ------------------------- | ------------------------ | ---------------------- |
| **Compile-time (Static)** | During compilation       | **Method Overloading** |
| **Runtime (Dynamic)**     | During program execution | **Method Overriding**  |

---

## ⚙️ 3. Compile-time Polymorphism (Method Overloading)

Occurs when **multiple methods have the same name but different parameters** (number or type).

### 🧾 Example:

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Test {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));        // calls add(int, int)
        System.out.println(c.add(2.5, 3.5));    // calls add(double, double)
        System.out.println(c.add(1, 2, 3));     // calls add(int, int, int)
    }
}
```

✅ **Output:**

```
5
6.0
6
```

📌 **Decided at compile time** based on argument types — that’s why it’s called **static polymorphism**.

---

## ⚔️ 4. Runtime Polymorphism (Method Overriding)

Occurs when a **child class provides its own version** of a method already defined in the parent.

### 🧾 Example:

```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Painter {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();  // Drawing a circle
        s2.draw();  // Drawing a rectangle
    }
}
```

✅ **Output depends on the actual object**, not reference type.
This is **runtime polymorphism**.

---

## 🧭 5. Key Rules for Runtime Polymorphism

1. **Parent reference** can point to a **child object**:

   ```java
   Parent p = new Child();
   ```

2. The **method call** is resolved at **runtime**.

3. **Overridden methods only** participate in runtime polymorphism (not overloaded ones).

4. **Static methods, private methods, and constructors** are **not polymorphic**.

---

## 🚫 6. Non-Polymorphic Elements

| Keyword      | Why Not Polymorphic     |
| ------------ | ----------------------- |
| `static`     | Bound at compile-time   |
| `private`    | Not visible in subclass |
| `final`      | Cannot be overridden    |
| Constructors | Not inherited           |

---

## 🧩 7. Real-world Example — Vehicle Polymorphism

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a button");
    }
}

public class Garage {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.start(); // Car version

        v = new Bike();
        v.start(); // Bike version
    }
}
```

✅ Output:

```
Car starts with a key
Bike starts with a button
```

---

## ⚡ 8. Upcasting and Downcasting

### 🔹 Upcasting:

Assigning a **child object to a parent reference**
👉 Allowed & common in runtime polymorphism.

```java
Vehicle v = new Car(); // Upcasting
v.start(); // Car's method runs
```

### 🔹 Downcasting:

Assigning a **parent reference back to a child type**
👉 Must be done manually (use `instanceof` check).

```java
if (v instanceof Car) {
    Car c = (Car) v;
    c.start();
}
```

---

## 🔥 9. Real-world Analogy

Imagine:

> You have a **remote** (reference) for an “ElectronicDevice” (parent),
> but the **actual object** could be a TV, Fan, or AC (child).

When you press `turnOn()`:

* The **TV** turns on differently than a **Fan**,
* But your code uses the same **reference type** — `ElectronicDevice`.

That’s polymorphism 💪

---

## 🏁 10. Summary Table

| Type                          | Decided When    | Achieved By        | Example                                          | Keyword     |
| ----------------------------- | --------------- | ------------------ | ------------------------------------------------ | ----------- |
| **Compile-time Polymorphism** | At compile time | Method Overloading | `add(int a, int b)` vs `add(double a, double b)` | —           |
| **Runtime Polymorphism**      | At runtime      | Method Overriding  | `Vehicle.start()` → `Car.start()`                | `@Override` |

---

## ⚙️ Bonus: Polymorphism + Inheritance Example

```java
class Father {
    void work() { System.out.println("Father works in office"); }
}

class Son extends Father {
    @Override
    void work() { System.out.println("Son is studying in college"); }
}

public class Family {
    public static void main(String[] args) {
        Father f1 = new Father();
        Father f2 = new Son(); // polymorphic behavior

        f1.work(); // Father works in office
        f2.work(); // Son is studying in college
    }
}
```

✅ Output:

```
Father works in office
Son is studying in college
```
