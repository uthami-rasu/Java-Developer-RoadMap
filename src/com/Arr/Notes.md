
## 1️⃣ **What is an Array in Java?**

* An **array** is a **container object** that holds a **fixed number of values** of the **same type**.
* Once created, the **size cannot change**.
* Arrays are **indexed** starting at **0**.

Example:

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // 1
System.out.println(numbers[4]); // 5
```

---

## 2️⃣ **How Arrays are Stored**

* Arrays are **objects in Java**, even primitive type arrays.
* The array variable stores a **reference** (memory address) to the array object on the **heap**.
* Each element is stored in **contiguous memory** internally, making index access O(1).
* Example memory layout:

```
int[] arr = {10, 20, 30};
arr → [10][20][30] (stored in heap)
```

* `arr` itself is a **reference variable** stored in the stack.

---

## 3️⃣ **Array Declaration / Creation**

1. **Declaration + Initialization together:**

```java
int[] arr = {1, 2, 3, 4};
```

2. **Declaration first, then allocation:**

```java
int[] arr;
arr = new int[5]; // default values 0 for int
```

3. **Multidimensional array:**

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(matrix[1][2]); // 6
```

---

## 4️⃣ **Accessing Array Elements (Indexing)**

* **Index starts at 0**, last element is at `length - 1`.

```java
int[] arr = {10, 20, 30, 40};
System.out.println(arr[0]); // 10
System.out.println(arr[arr.length - 1]); // 40
```

* Accessing out-of-bounds → `ArrayIndexOutOfBoundsException`.

---

## 5️⃣ **Important Array Properties / Methods**

| Feature               | Example / Method                 | Notes                       |
| --------------------- | -------------------------------- | --------------------------- |
| **Length**            | `arr.length`                     | Not a method, property      |
| **Iterate**           | `for (int i=0;i<arr.length;i++)` | Classic for-loop            |
| **Enhanced For-Loop** | `for (int x : arr)`              | No index, just values       |
| **Sort**              | `Arrays.sort(arr)`               | From `java.util.Arrays`     |
| **Binary Search**     | `Arrays.binarySearch(arr, key)`  | Array must be sorted        |
| **Fill**              | `Arrays.fill(arr, 0)`            | Fill array with same value  |
| **Copy**              | `Arrays.copyOf(arr, newLength)`  | Copy/resize array           |
| **Equals**            | `Arrays.equals(arr1, arr2)`      | Compares contents           |
| **To String**         | `Arrays.toString(arr)`           | Convert to printable string |

---

### 6️⃣ **Example with Methods**

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};

        System.out.println("Original: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        int idx = Arrays.binarySearch(arr, 4);
        System.out.println("Index of 4: " + idx);

        int[] copy = Arrays.copyOf(arr, 7);
        System.out.println("Copied: " + Arrays.toString(copy));
    }
}
```

**Output:**

```
Original: [5, 3, 1, 4, 2]
Sorted: [1, 2, 3, 4, 5]
Index of 4: 3
Copied: [1, 2, 3, 4, 5, 0, 0]
```

---

### 7️⃣ **Key Points to Remember**

* Arrays in Java are **fixed-size**; use **ArrayList** if you want dynamic size.
* Arrays are **type-specific** (all elements same type).
* Multi-dimensional arrays are arrays of arrays (`int[][]`).

---

