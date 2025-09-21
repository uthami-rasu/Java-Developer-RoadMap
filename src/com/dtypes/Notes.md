Absolutely! Let’s go **completely detailed** about **data types in Java**, step by step. I’ll also include examples and use cases.

---

# **1. Overview**

In Java, **data types** define the type of data a variable can hold. Java is **statically typed**, which means every variable must have a declared data type.

Java has **two main categories** of data types:

1. **Primitive Data Types**
2. **Non-Primitive (Reference) Data Types**

---

# **2. Primitive Data Types**

There are **8 primitive data types** in Java. These are **predefined by Java** and are **not objects**.

| Type      | Size    | Default Value | Example                | Description                                      |
| --------- | ------- | ------------- | ---------------------- | ------------------------------------------------ |
| `byte`    | 1 byte  | 0             | `byte b = 100;`        | Stores small integers (-128 to 127)              |
| `short`   | 2 bytes | 0             | `short s = 1000;`      | Stores medium-range integers (-32,768 to 32,767) |
| `int`     | 4 bytes | 0             | `int i = 100000;`      | Most common integer type (-2³¹ to 2³¹-1)         |
| `long`    | 8 bytes | 0L            | `long l = 100000L;`    | Large integer (-2⁶³ to 2⁶³-1)                    |
| `float`   | 4 bytes | 0.0f          | `float f = 10.5f;`     | Decimal number, single-precision                 |
| `double`  | 8 bytes | 0.0d          | `double d = 20.99;`    | Decimal number, double-precision                 |
| `char`    | 2 bytes | '\u0000'      | `char c = 'A';`        | Single Unicode character                         |
| `boolean` | 1 bit   | false         | `boolean flag = true;` | True/false values                                |

---

## **Details & Notes:**

1. **byte, short, int, long**

    * Use depending on the range you need.
    * Example: For counting 1–100, use `byte`; for population, use `long`.

2. **float vs double**

    * `float` has **\~7 digits precision**.
    * `double` has **\~15 digits precision**.
    * Always use `double` for accuracy unless memory is constrained.

3. **char**

    * Stores a **single character** in single quotes `'A'`.
    * Supports **Unicode**, e.g., `char ch = '\u00A9';` → ©

4. **boolean**

    * Used for **conditional logic**.
    * Only `true` or `false`.

---

# **3. Non-Primitive (Reference) Data Types**

These store **references** (memory addresses) to objects.

* **Examples:** `String`, Arrays, Classes, Interfaces, Enums.
* **Characteristics:**

    1. Default value is `null`.
    2. Methods can be called on these types (e.g., `String.length()`).

### **Example: String**

```java
String name = "Uthami";
System.out.println(name.length()); // Output: 6
```

### **Example: Array**

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // Output: 1
```

---

# **4. Type Conversion / Casting**

Sometimes, you need to **convert one data type to another**.

## **Widening (Automatic)**

* Converting **smaller to larger type**.

```java
int i = 100;
long l = i;  // int → long
float f = i; // int → float
```

## **Narrowing (Manual)**

* Converting **larger to smaller type**.

```java
double d = 100.04;
int i = (int) d;  // double → int, fractional part lost
```

---

# **5. Literal Suffixes**

* `L` → long literal (`100L`)
* `f` → float literal (`10.5f`)
* `d` → double literal (optional, `10.5d`)

---

# **6. Wrapper Classes**

Each primitive type has a **corresponding class**:

| Primitive | Wrapper Class |
| --------- | ------------- |
| byte      | Byte          |
| short     | Short         |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       |

**Why wrappers?**

* Needed for **Collections** (like `ArrayList<Integer>`).
* Provides **methods** like `Integer.parseInt("123")`.

```java
Integer num = 10;
int x = num.intValue();
```

---

# **7. Summary Table**

| Category      | Data Types                                           | Example                                   | Default Value        |
| ------------- | ---------------------------------------------------- | ----------------------------------------- | -------------------- |
| Primitive     | byte, short, int, long, float, double, char, boolean | int i = 10; float f = 2.5f;               | 0 / false / '\u0000' |
| Non-Primitive | String, Arrays, Classes, Interfaces                  | String s = "Hello"; int\[] arr = {1,2,3}; | null                 |

---

# **8. Quick Tips**

1. Use `int` for general-purpose integers.
2. Use `double` for decimal calculations.
3. Use `boolean` for flags and conditions.
4. Use `String` for text.
5. Prefer **widening conversions**; narrow carefully with casting.

---

# **1. Primitive Data Types**

### **What?**

* These are **basic, predefined data types** in Java: `int, byte, short, long, float, double, char, boolean`.
* They **store actual values** directly in memory.

### **Why?**

1. **Performance:**

    * Primitives are **fast** because they directly hold values in memory (stack).
    * No overhead of objects.
2. **Memory Efficient:**

    * Primitives use **fixed, small memory**.
3. **Simplicity:**

    * For simple numbers, characters, and true/false logic, you don’t need complex structures.

---

# **2. Non-Primitive (Reference) Data Types**

### **What?**

* Everything else: `String, Arrays, Classes, Interfaces`.
* These **store references (memory addresses) to objects**, not the actual data itself.

### **Why?**

1. **Flexibility:**

    * Can represent **complex data structures** and objects.
    * Example: `String` stores multiple characters and has methods (`length()`, `substring()`).
2. **Methods & Functionality:**

    * Non-primitives provide **built-in methods** for manipulating data.
3. **Dynamic Size:**

    * Objects can grow/shrink dynamically in memory (unlike primitives).

---

# **3. Key Differences**

| Feature       | Primitive            | Non-Primitive (Reference)   |
| ------------- | -------------------- | --------------------------- |
| Stores        | Actual value         | Memory address/reference    |
| Size          | Fixed (1–8 bytes)    | Depends on object size      |
| Default Value | 0 / false / '\u0000' | null                        |
| Methods       | None                 | Many (e.g., String methods) |
| Memory        | Stack                | Heap                        |

---

✅ **In short:**

* **Primitives** → small, fast, simple values.
* **Non-primitives** → objects with behavior and dynamic data handling.

---




# Java Type Casting

Type casting is converting a variable from one data type to another.  
In Java, there are **three main types of type casting**:

---

## 1. Widening Casting (Automatic / Implicit)

- **Definition:** Converting a smaller data type to a larger data type automatically.  
- **Safety:** Always safe, no data loss occurs.  
- **Hierarchy:**  
```

byte → short → int → long → float → double
char → int → long → float → double

````
- **Example:**
```java
int i = 100;
long l = i;      // int → long
float f = l;     // long → float
double d = f;    // float → double
````

---

## 2. Narrowing Casting (Manual / Explicit)

* **Definition:** Converting a larger data type to a smaller data type manually using `(type)`.
* **Safety:** May lose data or precision.
* **Example:**

  ```java
  double d = 9.78;
  int i = (int) d; // double → int, fractional part lost
  System.out.println(i); // Output: 9
  ```

---

## 3. Object Casting (Reference Type Casting)

* **Definition:** Converting between compatible object types (classes or interfaces).

* **Two types:**

   1. **Upcasting (Automatic)**

      * Child object → Parent type
      * Safe and automatic
   2. **Downcasting (Manual)**

      * Parent reference → Child type
      * Requires explicit cast, may throw `ClassCastException` if invalid

* **Example:**

  ```java
  class Animal {}
  class Dog extends Animal {}

  Animal a = new Dog();     // Upcasting, automatic
  Dog d = (Dog) a;          // Downcasting, explicit
  ```

---

### **Summary Table**

| Type           | Example             | Automatic / Manual | Risk of Data Loss |
| -------------- | ------------------- | ------------------ | ----------------- |
| Widening       | int → long          | Automatic          | No                |
| Narrowing      | double → int        | Manual             | Yes               |
| Object Casting | Dog → Animal (up)   | Automatic          | No                |
|                | Animal → Dog (down) | Manual             | Yes, may fail     |

