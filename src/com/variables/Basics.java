package com.variables;


import java.util.ArrayList;

class StaticVariable{

    public static int age = 18;

    @Override
    public String toString() {
        return "Static Variable[age = " + age + "]";
    }
}

class Cat{

    String name;


    Cat(){

    }
    Cat(String name){
        this.name = name;
    }


    public String getName(){
     return  this.name;
    }

    public  void setName(String name ){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat [name="+ name+"]";
    }


}
public class Basics {

    static  int age = 10;
    static  void staticVariablesFn(){
        // static variables are variables which does not depeneds on any object
        // static variables are shared across all instances of the class
        // if any instance change or mutate the static varibale it reflect on all object bcz it share the same memory


        // let us see the example



        StaticVariable s1 = new StaticVariable();
        StaticVariable s2 = new StaticVariable();


        System.out.println(s1); // Static Variable[age = 18]
        System.out.println(s2); // Static Variable[age = 18]

        // let me change the value of s1's age

        s1.age = 25 ;

        System.out.println(s1); // Static Variable[age = 25]
        System.out.println(s2); // Static Variable[age = 25]


        // here in above scenario it will print like 25; bcz static variables shared across all instances







    }

    static  void instanceVariableFn(){



        // instance variables are basically depends on the instance of the class.

        // each instance have its own copy of the instance variabless

        // updates on the one instance does not affet other instance


        // let us see the example

        Cat tommy = new Cat("Tommy");

        Cat riya = new Cat("Riya");


        System.out.println(tommy);// Cat [name=Tommy]

        System.out.println(riya );// Cat [name=Riya]


        ///  change the name of the 'Tommy to Tom'

        tommy.setName("Tom"); // it only affect the tommy object


        System.out.println(tommy);// Cat [name=Tom]

        System.out.println(riya );// Cat [name=Riya]






    }



    static  void localVariables(){

        // local variables are variables which are only available within the method and it will remove from the
        // memory once the function executes

        // example

        int age = 18 ; // will purged and not accessible outside of the Fn

        var x = 10 ;


        // only for local variable we can declare like these
        System.out.println(x);// here we can declare a variable without specify the dtype


        var arr = new ArrayList<Integer>();

        arr.add(10);


        System.out.println(
                "Array: " + arr
        );



        System.out.println("age: "+age  );
    }
    public static void main(String[] args) {


        System.out.println("Hello this is variable!");


        // types of variables
            staticVariablesFn();
        // static variables

        // instance variables
        instanceVariableFn();

        // local variables

        localVariables();
    }
}
