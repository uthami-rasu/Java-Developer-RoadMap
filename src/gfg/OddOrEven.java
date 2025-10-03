package gfg;


//
public class OddOrEven {


    public static boolean isEven(int n ){
        return  (n & 1) == 0 ? true : false;
    }


    public static void main(String[] args) {

        System.out.println(isEven(100)); // true
        System.out.println(isEven(1)); // false
    }

}
