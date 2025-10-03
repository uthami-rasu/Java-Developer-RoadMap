package com.dtypes;

public class DataTypes {
    // There are two types of Data type available in java
    /*
    1.Primitive
        - 8 variants
        -- Number  -> byte, short, int, long
        -- Decimal -> float, double
        -- Boolean -> bool
        -- Character -> char
    2.Non Primitive -> Reference
        -- Strings
        -- Array
        -- Classes
        -- Interfaces
        -- Enums
     */

/* The big question we might have in mind:
   Why data types are categorized into two types?

   1. Primitive types:
      - Used for quick access, e.g., int age = 10;
      - The actual value is stored directly in memory (stack memory) for fast access.

   2. Reference types:
      - Hold the memory address of an object, not the actual value.
            ex: Dog tommy = new Dog(); -> tommy stores reference(memory) of new Dog()
      - Provide methods and other functionalities.
      - The actual object is stored in heap memory.
*/

    public static void main(String[] args) {


        // Declaring Primitive Type Values

        byte age = 10;

        System.out.println(age);


        // we cant redecalre a variable with diff datatype
        // byte age = 10;

        // java allow us to reassign value for a variable
        age = 50;

        System.out.println(age);


        // Type Casting
        // 1. Widening -> small to big size
        // 2. Narrowing -> big to small size (lose data)
        // 3. Object Cast -> see docs

        // Widening
        int amount = 100 ;
        float interest = 10.11f;

        float totalAmount = amount ;

        System.out.println(amount); // 100 -> int type
        System.out.println(totalAmount); // 100.0 -> result is automatically converted into float


        // Explicit Conversion
        float fullAmountWithPaise = (amount * interest); // -> here implicit conversion happening
        int fullAmountWithoutPaise  = (int) (amount * interest); // explicitly convert the big dtype to low type


        System.out.println(fullAmountWithPaise); // 1010.99994
        System.out.println(fullAmountWithoutPaise); // 1010


        // Object Casting
        // will see about this at Mid Level base



    }
}
