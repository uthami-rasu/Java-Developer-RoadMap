package com.Str;

import static com.utils.utils.* ;
public class str {

    // A String in Java is a sequence of characters enclosed in double quotes.
    // Example: "java" is a sequence of characters 'j', 'a', 'v', 'a'.

    // String literals are stored in the String Constant Pool (SCP), a special area of the heap.
    // Only one copy of each literal is kept to save memory.

    // Strings are immutable, meaning once created, their value cannot change.
    // This immutability makes String objects thread-safe.

    // If you need mutable (modifiable) strings, use:
    // - StringBuilder (faster, not thread-safe)
    // - StringBuffer  (slower, thread-safe)

    public static char negIndex(String s,int i ) throws Exception {

        int len = s.length();


        if(i > len){

            throw new Exception("Index out of Range");
        }

        if(i < 0){
            i = i + len ;
        }



        return  s.charAt(i);
    }


    public static void main(String[] args) throws Exception {

        // declare and initialize string

        String a = "Razz";


        // access values in a string


        // indexing and negative indexing

        print(a.charAt(a.length() -1 ),a.charAt(a.length() -2));

        String b = a  +" Kutty";

        print(b);


        // perform custom negative indexing


        print(
                negIndex(a,1), negIndex(a,-1), negIndex(a,-2), negIndex(a,-3), negIndex(a,-4)
        );

        // slice


        printn(
                a.substring(1),
                a.substring(2,4)
        );


        // comparison


        printn(
                a.equals(b),
                a.contains("S"),
                a.equals("Razz"),
                a.equalsIgnoreCase("raZz"),
                a.contentEquals(new String("Razz")),
                a.equals(new String("Razz")),
                a == new String("Razz")
        );


        // most important split and join

        printn(
                a.split(""),

                String.join("-",a.split(" "))
        );

    }
}
