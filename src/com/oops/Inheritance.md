

## 🧩 1. What is Inheritance?

**Inheritance** means **acquiring properties and behaviors** of one class into another.
It allows **code reuse** and establishes a **relationship** between classes (a *“is-a”* relationship).

### 🔹 Example

```java
class Parent {
    void speak() {
        System.out.println("Parent speaks politely.");
    }
}

class Child extends Parent {
    void play() {
        System.out.println("Child plays football.");
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.speak(); // inherited from Parent
        c.play();  // defined in Child
    }
}
```

✅ **Output:**

```
Parent speaks politely.
Child plays football.
```

---

## 🧱 2. Syntax

```java
class Parent {
    // fields and methods
}

class Child extends Parent {
    // child-specific fields and methods
}
```

---

## 🧬 3. Why Use Inheritance?

| Benefit               | Description                                              |
| --------------------- | -------------------------------------------------------- |
| **Code Reusability**  | You don’t have to rewrite same code in multiple classes. |
| **Method Overriding** | Child can redefine parent methods.                       |
| **Polymorphism**      | Parent reference can point to child object.              |
| **Extensibility**     | You can easily extend behavior in subclasses.            |

---

## 🌳 4. Types of Inheritance in Java

Java **does not** support *multiple inheritance* with classes (to avoid ambiguity),
but supports *multiple inheritance* with **interfaces**.

| Type             | Description                                     | Example                                   |
| ---------------- | ----------------------------------------------- | ----------------------------------------- |
| **Single**       | One class inherits another                      | `Child extends Parent`                    |
| **Multilevel**   | Class inherits a class which inherits another   | `GrandSon → Father → GrandFather`         |
| **Hierarchical** | Multiple classes inherit the same parent        | `Son` and `Daughter` both extend `Parent` |
| **Multiple**     | Not allowed with classes (only with interfaces) | `class A implements X, Y`                 |

---

### 🔹 Example – Multilevel Inheritance

```java
class GrandFather {
    void land() {
        System.out.println("Grandfather has land.");
    }
}

class Father extends GrandFather {
    void car() {
        System.out.println("Father owns a car.");
    }
}

class Son extends Father {
    void bike() {
        System.out.println("Son rides a bike.");
    }
}

public class Family {
    public static void main(String[] args) {
        Son s = new Son();
        s.land(); // from GrandFather
        s.car();  // from Father
        s.bike(); // from Son
    }
}
```

✅ Output:

```
Grandfather has land.
Father owns a car.
Son rides a bike.
```

---

## ⚙️ 5. `super` Keyword

Used to refer to the **immediate parent class**.

| Use                     | Example              |
| ----------------------- | -------------------- |
| Call parent constructor | `super(args)`        |
| Access parent method    | `super.methodName()` |
| Access parent variable  | `super.variableName` |

```java
class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }
    void greet() { System.out.println("Hello from Parent"); }
}

class Child extends Parent {
    Child() {
        super(); // calls Parent()
        System.out.println("Child constructor called");
    }
    void greet() {
        super.greet(); // call parent method
        System.out.println("Hello from Child");
    }
}
```

---

## 🧠 6. Constructor Chaining in Inheritance

When you create a child object →
**Parent constructor executes first**, then **Child’s constructor**.

```java
class A {
    A() { System.out.println("A constructor"); }
}

class B extends A {
    B() { System.out.println("B constructor"); }
}

public class Test {
    public static void main(String[] args) {
        new B();
    }
}
```

✅ Output:

```
A constructor
B constructor
```

---

## ⚔️ 7. Method Overriding

Child class can redefine a parent’s method.

### Rules:

* Must have **same name, same parameters**.
* Return type must be **same or covariant**.
* Child cannot reduce **visibility** (e.g., `public` → `private`).
* Use `@Override` annotation (optional but recommended).

```java
class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show()");
    }
}
```

✅ Output:

```
Child show()
```

---

## 🧩 8. `final` and `inheritance`

| Keyword          | Meaning              |
| ---------------- | -------------------- |
| `final class`    | cannot be inherited  |
| `final method`   | cannot be overridden |
| `final variable` | cannot be changed    |

```java
final class A {}
// class B extends A {} ❌ Error
```

---

## 🧰 9. Access Modifiers in Inheritance

| Modifier    | Child Access (Same Package) | Child Access (Different Package) |
| ----------- | --------------------------- | -------------------------------- |
| `public`    | ✅                           | ✅                                |
| `protected` | ✅                           | ✅ (through inheritance)          |
| *(default)* | ✅                           | ❌                                |
| `private`   | ❌                           | ❌                                |

---

## 🎭 10. Polymorphism with Inheritance

Parent reference can hold a child object:

```java
Parent p = new Child();
p.show(); // calls Child's show() due to runtime polymorphism
```

✅ Output depends on **actual object**, not **reference type**.

---

## 🧩 11. Real-life Example

```java
class Animal {
    void eat() { System.out.println("Animals eat food"); }
}

class Dog extends Animal {
    @Override
    void eat() { System.out.println("Dog eats bones"); }
    void bark() { System.out.println("Dog barks"); }
}

public class Zoo {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcasting
        a.eat(); // calls Dog's eat()
        // a.bark(); ❌ not accessible via Animal reference
    }
}
```

✅ Output:

```
Dog eats bones
```

---

## 🚫 12. Multiple Inheritance Issue

Not allowed with classes:

```java
class A { void show() {} }
class B { void show() {} }
class C extends A, B {} // ❌ ERROR
```

✅ Solution → Use **interfaces**:

```java
interface A { void show(); }
interface B { void show(); }

class C implements A, B {
    public void show() { System.out.println("Resolved!"); }
}
```

---

## 🏁 Summary Table

| Concept                 | Keyword                          | Example                    |
| ----------------------- | -------------------------------- | -------------------------- |
| Basic Inheritance       | `extends`                        | `class Son extends Father` |
| Parent Constructor Call | `super()`                        | inside child constructor   |
| Access Parent Method    | `super.method()`                 | inside child               |
| Override Method         | `@Override`                      | redefine parent behavior   |
| Prevent Inheritance     | `final`                          | `final class`              |
| Access Parent Fields    | `super.field`                    | inside child               |
| Type of Inheritance     | Single, Multilevel, Hierarchical | varies                     |
| Not Supported           | Multiple (with classes)          | —                          |

---

