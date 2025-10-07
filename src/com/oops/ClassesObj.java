package com.oops;

public class ClassesObj {


    // class is a like a template basically it holds the methods and variables

    // class is an example of encapsulation bcz it wraps the data & methods that is working together for.

    // object is instance of the class.
    // class itself does not take any memory , obj is basically created in-memory thats why we call that as real world object.


    class Student{
        String name;
        Student(String name){
            this.name = name;
        }


        void setName(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "[ Student name="+ this.name + "]";
        }
    }


    void instanceMethod(String name){
        Student s1 = new Student(name); // we can create student from here

        System.out.println(s1);
    }
    public static void main(String[] args) {



       // we cant create this bcz StudentClass itself depends on the object of ClassesObj
        // Student s1 = new Student("Razz");

        // Student s1 = new Student("Razz"); //we can make the Student class as Static so we can create object


        ClassesObj obj1 = new ClassesObj();
        ClassesObj obj2 = new ClassesObj();


        obj1.instanceMethod("Razz");



    }
}
