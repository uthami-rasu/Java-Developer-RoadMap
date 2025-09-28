package com.conditional_control;

public class ConditionalStatements {



    enum Cities {
        TENKASI, MADURAI, TRICHY
    }

    public static  void switchExample(){

    String city = "TENKASI";

    switch (city){

        case "TENKASI":
            System.out.println("matched tenkasi city");
            break;
        default:
            System.out.println("no mathches found");
            break;


    }

 ///  multi case statements
    switch (city){

        case "TENKASI":
        case "APR":
            System.out.println("City is Either Tenkasi or Apr");
            break;
        default:
            System.out.println("No matched found");
            break;
    }




    }





    public static void main(String[] args) {
        // conditional statements are basically used to make descision

        ///  there are 3 types of condirional statetments

        // 1. if statements
        // 2. if-else statements
        // 3. else if ladder statements
        // switch statements


        // let us see the example


        var city = "Tenkasi" ;

        if(city == "Tenkasi" ){

            System.out.println("City is : "+ city );
        } else if (city == "Chennai") {

            System.out.println("City is : "+ city);

        } else{

            System.out.println("Unknown City");
        }



        switchExample();
    }


}
