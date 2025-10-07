
## 🧩 1. **String Creation and Basics**

```java
String s1 = "hello";
String s2 = new String("hello");
```

* `length()` → returns the number of characters.

  ```java
  s1.length(); // 5
  ```

* `charAt(int index)` → returns character at index.

  ```java
  s1.charAt(1); // 'e'
  ```

* `isEmpty()` / `isBlank()` → checks if string is empty or only spaces.

  ```java
  "".isEmpty(); // true
  " ".isBlank(); // true
  ```

---

## 🔍 2. **Comparison Methods**

* `equals(String other)` → compares content (case-sensitive).
* `equalsIgnoreCase(String other)` → ignores case.
* `compareTo(String other)` → lexicographic comparison (like dictionary order).
* `compareToIgnoreCase(String other)` → same but case-insensitive.

```java
"abc".equals("ABC"); // false
"abc".equalsIgnoreCase("ABC"); // true
"apple".compareTo("banana"); // negative value
```

---

## ✂️ 3. **Substring and Extraction**

* `substring(int beginIndex)`
* `substring(int beginIndex, int endIndex)`

```java
"programming".substring(3);      // "gramming"
"programming".substring(0, 4);   // "prog"
```

---

## 🔠 4. **Case Conversion**

* `toUpperCase()`
* `toLowerCase()`

```java
"java".toUpperCase(); // "JAVA"
```

---

## 🧮 5. **Searching & Checking**

* `contains(CharSequence seq)`
* `startsWith(String prefix)`
* `endsWith(String suffix)`
* `indexOf(String str)` / `lastIndexOf(String str)`

```java
"hello world".contains("world"); // true
"java".startsWith("ja"); // true
"java".endsWith("va"); // true
"banana".indexOf("a"); // 1
"banana".lastIndexOf("a"); // 5
```

---

## 🔄 6. **Replace & Remove**

* `replace(char oldChar, char newChar)`
* `replace(CharSequence old, CharSequence new)`
* `replaceAll(String regex, String replacement)`
* `replaceFirst(String regex, String replacement)`

```java
"apple".replace('p', 'b'); // "abble"
"abc123".replaceAll("\\d", ""); // "abc"
```

---

## 🧹 7. **Trimming and Cleaning**

* `trim()` → removes spaces from both ends.
* `strip()` / `stripLeading()` / `stripTrailing()` (Java 11+)

```java
"  hello  ".trim(); // "hello"
```

---

## 🧩 8. **Splitting and Joining**

* `split(String regex)` → returns `String[]`.
* `String.join(CharSequence delimiter, String... elements)`

```java
"java,python,c++".split(","); // ["java", "python", "c++"]
String.join("-", "one", "two", "three"); // "one-two-three"
```

---

## 🧠 9. **Conversion Methods**

* `toCharArray()` → converts to character array.
* `valueOf()` → converts other types to string.

```java
char[] arr = "abc".toCharArray(); // ['a','b','c']
String.valueOf(123); // "123"
```

---

## 🧾 10. **String Formatting**

* `format(String format, Object... args)`

```java
String msg = String.format("Hello %s, age %d", "Razz", 22);
// "Hello Razz, age 22"
```

---

## ⚙️ 11. **Interning and Hashing**

* `intern()` → puts string in string pool.
* `hashCode()` → returns hash value.

```java
String a = new String("hi");
String b = a.intern();
```

---

## 🔐 12. **Regular Expression Matching**

* `matches(String regex)`

```java
"abc123".matches("[a-z]+\\d+"); // true
```

---

## ⚡ Bonus — Useful Static Methods

* `String.valueOf(obj)`
* `String.join(delimiter, elements...)`
* `String.format(format, args...)`

---

### 🧾 Quick Reference Table

| Category         | Method Examples                                         |
| ---------------- | ------------------------------------------------------- |
| Length/Character | `length()`, `charAt()`                                  |
| Compare          | `equals()`, `compareTo()`, `equalsIgnoreCase()`         |
| Case             | `toUpperCase()`, `toLowerCase()`                        |
| Search           | `contains()`, `indexOf()`, `startsWith()`, `endsWith()` |
| Modify           | `replace()`, `replaceAll()`, `substring()`              |
| Split/Join       | `split()`, `join()`                                     |
| Trim             | `trim()`, `strip()`                                     |
| Convert          | `toCharArray()`, `valueOf()`                            |
| Format           | `format()`                                              |
| Regex            | `matches()`                                             |

---

Perfect timing, Razz ⚡ —
Let’s break down **StringBuilder** and **StringBuffer** in Java — both are used when you need **mutable strings** (unlike `String`, which is immutable).

---

## 🧠 Overview

| Feature           | `String`                               | `StringBuilder`                    | `StringBuffer`                |
| ----------------- | -------------------------------------- | ---------------------------------- | ----------------------------- |
| **Mutability**    | ❌ Immutable                            | ✅ Mutable                          | ✅ Mutable                     |
| **Thread Safety** | ❌ No                                   | ❌ No                               | ✅ Yes (synchronized)          |
| **Speed**         | Slowest (creates new object each time) | Fast                               | Slower (due to thread safety) |
| **Use Case**      | Fixed text                             | Fast text building (single thread) | Safe in multi-threaded code   |

---

## ⚙️ **Common Methods (Same for Both)**

All these methods are available in both **`StringBuilder`** and **`StringBuffer`** 👇

| Method                     | Description                            | Example                       |
| -------------------------- | -------------------------------------- | ----------------------------- |
| `append(data)`             | Adds text at the end                   | `sb.append("Java")`           |
| `insert(index, data)`      | Inserts at given index                 | `sb.insert(4, "Script")`      |
| `replace(start, end, str)` | Replaces chars from start→end with str | `sb.replace(0, 4, "Kava")`    |
| `delete(start, end)`       | Deletes chars from start→end           | `sb.delete(2, 5)`             |
| `deleteCharAt(index)`      | Deletes one char                       | `sb.deleteCharAt(0)`          |
| `reverse()`                | Reverses the sequence                  | `sb.reverse()`                |
| `setCharAt(index, ch)`     | Replaces one character                 | `sb.setCharAt(1, 'A')`        |
| `charAt(index)`            | Returns char at position               | `sb.charAt(0)`                |
| `length()`                 | Returns current length                 | `sb.length()`                 |
| `capacity()`               | Returns buffer size                    | `sb.capacity()`               |
| `ensureCapacity(n)`        | Expands capacity if needed             | `sb.ensureCapacity(50)`       |
| `substring(start, end)`    | Returns substring                      | `sb.substring(0, 4)`          |
| `toString()`               | Converts to immutable `String`         | `String str = sb.toString();` |

---

### 🧩 Example

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" Razz");
System.out.println(sb); // Hello Razz

sb.insert(6, "Mr. ");
System.out.println(sb); // Hello Mr. Razz

sb.replace(0, 5, "Hi");
System.out.println(sb); // Hi Mr. Razz

sb.delete(2, 5);
System.out.println(sb); // HiRazz

sb.reverse();
System.out.println(sb); // zzaRiH

System.out.println(sb.capacity()); // default 16 + initial length
```

---

## ⚡ **Performance Notes**

* `StringBuilder` is **faster** — ideal for single-threaded operations (e.g., loops, string concatenation).
* `StringBuffer` is **thread-safe** — use it only when multiple threads access the same buffer.

---

### 🧠 Capacity Formula

When you create a new buffer:

```java
StringBuilder sb = new StringBuilder("Razz");
```

* Default capacity = **16 + string length (4) = 20**
* When exceeded → new capacity = `(oldCapacity * 2) + 2`

---

### 🧾 Quick Summary

| Method Type        | Example Methods                        |
| ------------------ | -------------------------------------- |
| **Add / Insert**   | `append()`, `insert()`                 |
| **Edit / Replace** | `replace()`, `setCharAt()`, `delete()` |
| **Info**           | `length()`, `capacity()`               |
| **Convert**        | `toString()`                           |
| **Other**          | `reverse()`, `ensureCapacity()`        |

---

💡 **Rule of thumb**

> 🔹 Use `StringBuilder` → always, unless threads share it.
> 🔹 Use `StringBuffer` → only in multi-threaded code.

---

### 🧩 **Level 1 – Basics**

1. What’s the difference between

   ```java
   String s1 = "Java";
   String s2 = new String("Java");
   ```

   — in memory?

2. Is a `String` in Java mutable or immutable?
   Why was it designed that way?

3. What does this return?

   ```java
   "hello".length();
   ```

4. What’s the output of this?

   ```java
   String a = "razz";
   String b = "RAZZ";
   System.out.println(a.equalsIgnoreCase(b));
   ```

---

### ⚙️ **Level 2 – Operations**

5. What’s the output?

   ```java
   String s = "HelloWorld";
   System.out.println(s.substring(0, 5));
   System.out.println(s.substring(5));
   ```

6. What’s the difference between:

    * `s.trim()`
    * `s.strip()`
    * `s.stripLeading()`
    * `s.stripTrailing()`

7. What does this code print?

   ```java
   String x = "java";
   String y = "java";
   System.out.println(x == y);
   System.out.println(x.equals(y));
   ```

8. Why is `String` called *immutable* but `StringBuilder` is *mutable*?

---

### 🧠 **Level 3 – Tricky Ones**

9. What’s the output?

   ```java
   String str = "  Java  ";
   str.trim();
   System.out.println(">" + str + "<");
   ```

10. Predict the output:

    ```java
    String s1 = "abc";
    String s2 = "ab" + "c";
    String s3 = new String("abc");
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
    ```

11. What does this return?

    ```java
    "banana".replace('a', 'o');
    ```

12. What’s the difference between:

    ```java
    String.split()
    ```

    and

    ```java
    String.join()
    ```

---


