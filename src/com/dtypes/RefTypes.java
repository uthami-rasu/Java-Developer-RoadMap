package com.dtypes;

public class RefTypes {


    public static void main(String[] args) {


        // 1. Strings

        /*
        Strings are nothing but a sequence of characters

        1. we can access the elements by using indexing
         */

        String name = "Uthami";

        System.out.println(name);
        System.out.println("2nd Index: " + name.charAt(1));

        // we will see some important string methods in Mid Level Base


        // 2. Arrays

        // declare array

        int[] arr = {1,2,3,4,5};
        System.out.println(arr);// it will print the memory address of that object(not exactly the same address)

        // loop through the array

        for(int i : arr){
            System.out.println(i);
        }

        enum Cities {
            TENKASI, APR
        }

        System.out.println(Cities.TENKASI);

        String c = "TENKASI";

        System.out.println(Cities.TENKASI.name() instanceof  String);// true
        System.out.println(Cities.TENKASI.name().equals(c));
        System.out.println(Cities.TENKASI.valueOf(Cities.TENKASI.name()) instanceof Enum);


    }
}
