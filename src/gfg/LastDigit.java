package gfg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LastDigit {


    // there is a formula for finding last digit (unit digit)

    // if num is 0, 5, 6, 1 -> this number^n is always that number; ex: 5^6 => 5

    // if num is 4 or 9 -> 4^odd => 4 , 4^even = 6 , 9^odd => 9 , 9^even => 1

    // if num is 2,3,7,8 ->
    // we need to divide the power by 4 untill it turns less than 4 then take that value as power ex : 43 -> 3
    // if power fully divided set power as 4
    //

    // Note:
    // take last 2 digits from power


   static Map<String, List<Integer>> cycles = new HashMap<>();

   static String cycle ;



static String getCycle(int base){




    cycles.forEach((key,values)->{


        if(values.contains(base)) {

            cycle = key;

        }
    });


    return cycle;


}


static  int handleCycle2(int base,int power){

    if(base == 4){

        if(OddOrEven.isEven(power)){
            return 6;
        }
        return  4;
    }


    // if base is 9

    if(OddOrEven.isEven(power)){

        return  1;
    }

    return 9;
}

static  int handleCycle3(int base, int power){

    int res = -1;
    int pow = power  ;

    // need to check if power is less than 4

    if (power < 4){
        return Integer.parseInt(String.valueOf((int) Math.pow(base,power)));
    }

    if(power % 4 == 0 ){
        return  String.valueOf((int) Math.pow(base,4)).charAt(String.valueOf((int) Math.pow(base,4)).length() -1 ) -'0';
    }

    int rem ;

    while(pow > 0 ){

        rem = pow % 4;

        if(rem < 4){
            res =  String.valueOf((int) Math.pow(base,rem)).charAt(String.valueOf((int) Math.pow(base,rem)).length() -1 ) -'0';
            break;

        }

        pow/=4;
    }

    return  res;
}

    static int getLastDigit(String a, String b) {
        if (a == null || b == null || b.equals("0")) {
            return 1;
        }

        int base = a.charAt(a.length() - 1) - '0';
        String powerStr = b.length() >= 2 ? b.substring(b.length() - 2) : b;
        int power = Integer.parseInt(powerStr);

        cycle = getCycle(base);
        System.out.println("Base Number: " + base + " power: " + power + " Cycle: " + cycle);

        switch (cycle) {
            case "cycle-1":
                return base;

            case "cycle-2":
                return handleCycle2(base, power);

            case "cycle-3":
                return handleCycle3(base, power);

            default:
                System.out.println("Something went wrong");
                return 0;
        }
    }

    public static void main(String[] args) {


        cycles.put("cycle-1", Arrays.asList(0,5,6,1));
        cycles.put("cycle-2", Arrays.asList(4));
        cycles.put("cycle-3",Arrays.asList(2,3,7,8));



        // cycle 1
        System.out.println(getLastDigit("1","1"));
        System.out.println(getLastDigit("0","10"));
        System.out.println(getLastDigit("5","111111"));
        System.out.println(getLastDigit("6","192992"));
        System.out.println(getLastDigit("66","192992"));


        // cycle 2
        System.out.println("------------");
        System.out.println(getLastDigit("4","3"));
        System.out.println(getLastDigit("4","4"));
        System.out.println(getLastDigit("9","4"));
        System.out.println(getLastDigit("9","3"));




        // cycle 2
        System.out.println("------------");
        System.out.println(getLastDigit("2","3"));
        System.out.println(getLastDigit("2","34"));
        System.out.println(getLastDigit("2","994"));
        System.out.println(getLastDigit("2","344"));

    }
}
