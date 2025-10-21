package kunal.arrays;


import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import static java.io.FileDescriptor.out;

public class MyArrayList {


    public static void main(String[] args) {



        normalArrays();

        // null is a speical type of literal used with ref types only;

        //multiDimensionArrays();


        // Dynamic Arrays


        // dynamicArrays();


        arrayProblems();

    }

    private static void arrayProblems() {


        // 1. Find the max element in the array


        ArrayList<Integer> arr = new ArrayList<>();


        arr.add(10);

        arr.add(20);



        arr.remove(1);



        arr.add(1,20);

        arr.addAll(Arrays.asList(10,20,30,40,50));



        /// insert the value

        System.out.println(arr);
        arr.set(1,100);


        System.out.println(arr);

        // remove the value by index
        arr.remove(1);
        System.out.println(arr);

        // remove by value
        arr.remove(Integer.valueOf(100));
        arr.remove((Integer) 3);

         // check if the value is present in the list

        System.out.println(arr.contains(100));

        // remove all the elements from the list
        arr.clear();
        System.out.println(arr);

        // check if list is empty or not

        System.out.println(arr.isEmpty());

        // get the index of the value

        arr.add(10);
        arr.add(10);

        System.out.println( arr.indexOf(10));


        // get the last index of the value

        System.out.println(arr.lastIndexOf(10)  );


        // basic methods


        // add, add by index,addAll, set
        // remove by index, remove by value
        // contains, clear, isEmpty,
        // indexOf, lastIndexOf

        // convert to other types
        //

        System.out.println("razz" + new HashSet<>(arr));


        /*
            1. basic methods

         */

        System.out.println(arr);
    }

    private static void dynamicArrays() {


        ArrayList<Integer> arr = new ArrayList<>(10);

        // add elements to the array
        arr.add(10);
        arr.add(20);
        arr.add(30);

        // print the array  list

        System.out.println(arr);



        /*
        1. size of the array is fixed here as well but by internally

        2. what will happend basically whenver the array grow. ex by 50% (assumed) it will create new arraylist
            and copies the all elements from the old list into new list and delete the old list from the memory.
         */


    }


    // 1. Normal Arrays

    static  void normalArrays(){

        // normal arrays are fixed size so it can't be scalable.

        // we can create array for primitive and non primtive type as well

        // it is a special value -> by default value for ref types variables

        // example

        int[] arr = new int[2];

        String[] names = {"Razz","Ram"};

        // for custom types

        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();

        animals[2] = new Animal() {

            @Override
            public  void sound(){
                // here we are creating an anonymous class
                // and create an object via this class
                System.out.println("sound from anonymous class!!");
            }

            @Override
            public String toString() {
                return "sound from anonymous class!!";
            }
        };


        for(Animal a:animals){
          if(a != null){
              a.sound();
          }
        }


        System.out.println(Arrays.toString(animals));
    }


    // 2. Multi Dimnesional arrays

    // 2d arrays are nothing but an arrays of arrays





    // how they are stored in the heap memory

    // assume we have an array with three rows and three columns

    // so basically the thing is the array actually stored in some part of the heap
    // and the first element of the array is a reference to the first row
    // the second element also stored somehwhere in the heap but the reference variables is pointing to the 1st index of the outer array.
    // and so on for the third element of the array which is a reference to the third row.

    static void multiDimensionArrays() {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Print static 2D array
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // --- Input Section ---
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows and Columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Integer[][] multiArrays = new Integer[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.println("Enter values for row " + (i + 1) + ":");
            // Read full line and split by spaces
            multiArrays[i] = Arrays.stream(sc.nextLine().trim().split(" "))
                    .map(e -> Integer.parseInt(e))
                    .toArray(Integer[]::new);
        }

        // --- Output Section ---
        System.out.println("Your 2D array is:");
        for (Integer[] row : multiArrays) {
            for (Integer col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
