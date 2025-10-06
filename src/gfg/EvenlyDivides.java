package gfg;

public class EvenlyDivides {


    static int evenlyDivides(int n) {

        int original = n ;


        int count = 0 ;

        while(n > 0){

            int digit = n % 10;



            if(digit != 0 && n % digit == 0 ){
                count++;
            }


            n /=10;
        }

        return count;

    }

    public static void main(String[] args) {

        System.out.println(
                evenlyDivides(43)
        );
    }
}
