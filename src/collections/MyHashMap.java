package collections;

import java.util.*;

public class MyHashMap {

    /*
     * HashMap internally uses an array (buckets) to store key-value pairs.
     *
     * For each key:
     * 1. It computes a hash code using the key's hashCode() method.
     * 2. Then applies a transformation (like hash & (n - 1)) to find the index in the array.
     *
     * If multiple keys map to the same index (collision), it handles them using chaining.
     *
     * Chaining: Each bucket stores a linked list (or a balanced tree for high collision cases).
     *
     * - Java uses chaining (LinkedList → TreeNode after threshold).
     * - Python’s dict uses open addressing.
     *
     * When the number of entries exceeds the load factor threshold (default 0.75),
     * the HashMap resizes — it creates a new array (typically double the size),
     * rehashes all existing entries, and copies them over.
     *
     * If the number of elements in a single bucket exceeds 8,
     * Java converts that linked list into a balanced Red-Black Tree
     * for faster lookup (from O(n) → O(log n)).
     */
    public static void main(String[] args) {

        Map<String,Object> students = new HashMap<>();



        // add elements in HashMap

        students.put(
                "marks",
                new ArrayList<Integer>(Arrays.asList(1,2,3,4,5))
        );


        // here we need to give key value pairs
//        students.putAll(
//        );


        System.out.println(students.get("marks"));

        System.out.println(students.getOrDefault("marks","no value"));



        // get keys only

        System.out.println(
                students.keySet() + " "  + (students.keySet() instanceof Set<String>)
        );


        System.out.println(
                students.values() + " "  + (students.values().getClass())
        );


        // conatins key


        System.out.println(students.containsKey("name"));


        students.put("roll",2);

        System.out.println(students.containsValue(2));


        // delete elems


        students.remove("roll");


        students.putIfAbsent("msg","hello");



        // iterate maps


        for(Map.Entry<String,Object> entry : students.entrySet()){
            System.out.println(
                    "Key: " + entry.getKey()
            );


            System.out.println(
                    "Value: "+ entry.getValue()
            );
        }


        System.out.println(students);









    }
}
