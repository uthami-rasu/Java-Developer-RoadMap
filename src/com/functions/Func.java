package com.functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Func {


    // Basic :
    // 1. void without params, void with params, with return statement
    // 2. No Parameters , With Paramters
    // 3. static methods, instance methods

    // Advance Concepts
    // 4. method overloading , method overriding
    // 5. behaviour of access modifiers in methods
    // 6. Recursion


    static  void justPrint( ){

        System.out.println("hello i am `justPrint` method");

    }

    static  void justPrint(String name){
        System.out.println("The Name is : "+ name);
    }


    public static <T> T getValue(T val){ // known as generic methods
       //  System.out.println(val);
        return val;
    }

    // variable length arguments
    public static <T> void print(T... vargs) {
        for (T item : vargs) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        /*
        1. if you dont want to return any value from method you could use void

        void means the method does not return any value.

        1. void with paramter
        2. void without paramter

         */
        // let us see the example

        justPrint();

        justPrint("Razz");


        /*
            2.with return statement

            i. return statement basically used to return  a value from  the method.
            ii. it exists from the function

         */

        System.out.println("Given Value: " + getValue(10));
        System.out.println("Given Value: " + getValue("Razz"));
        System.out.println("Given Value: " + getValue(true));
        System.out.println("Given Value: " + getValue('c'));
        System.out.println(
                "Given Value: " + getValue(new ArrayList<>(Arrays.asList(1, 2, 3)))
        );



        // custom print method

        print("Rasu");

        print("Array: " , Arrays.asList(1,2,3,4,5));


        // will see other types while learning classes
    }
}
