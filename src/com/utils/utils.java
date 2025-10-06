package com.utils;

public class utils {

    public  static <T> void print(T... vargs){

        for (T args: vargs){

                System.out.print(args);


        }
        System.out.println();
    }
// ...restPa
    public  static <T> void printn(T... vargs){

        for (T args: vargs){

                System.out.println(args);


        }
        System.out.println();
    }


    public static void main(String[] args) {

        print("Razz",20);
    }
}
