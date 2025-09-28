Got it, Razz — let’s go through **loops in Java** in a clear and structured way. Loops are used to **repeat a block of code** until a condition is true.

---

## 1️⃣ **`for` loop** (most common)

Used when you know **how many times** to iterate.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

* **Structure:** `for(initialization; condition; update)`
* Executes in this order: **init → check condition → body → update → repeat**

---

## 2️⃣ **`while` loop**

Used when you **don’t know in advance** how many times it will run — runs while condition is true.

```java
int i = 0;
while (i < 5) {
    System.out.println("i = " + i);
    i++;
}
```

* Condition is checked **before** executing the loop body.
* If condition is false initially, loop may **never run**.

---

## 3️⃣ **`do-while` loop**

Runs **at least once**, then repeats while condition is true.

```java
int i = 0;
do {
    System.out.println("i = " + i);
    i++;
} while (i < 5);
```

* The body executes **first**, then the condition is checked.

---

## 4️⃣ **Enhanced `for` loop (for-each)**

Used to iterate over **arrays or collections**.

```java
String[] cities = {"TENKASI", "MADURAI", "TRICHY"};

for (String city : cities) {
    System.out.println(city);
}
```

* `for (Type element : collection)`
* Cleaner than classic `for` when you just need each element.

---

## 5️⃣ **Loop control statements**

1. **`break`** → exit the loop immediately.
2. **`continue`** → skip current iteration and go to next.
3. **`return`** → exits the loop and the method.

```java
for (int i = 0; i < 5; i++) {
    if (i == 3) break;      // stops loop at 3
    if (i == 1) continue;   // skips 1
    System.out.println(i);
}
```

---

✅ **Summary Table**

| Loop Type  | Condition Checked | Executes At Least Once | Use Case                        |
| ---------- | ----------------- | ---------------------- | ------------------------------- |
| `for`      | Before            | Not guaranteed         | Known iteration count           |
| `while`    | Before            | Not guaranteed         | Unknown iteration count         |
| `do-while` | After             | ✅ Always once          | Must execute at least once      |
| `for-each` | N/A               | ✅ Always once          | Iterate over arrays/collections |

---

If you want, I can also make a **small flow diagram of all loops in Java** — very handy for quick understanding.

Do you want me to do that?
