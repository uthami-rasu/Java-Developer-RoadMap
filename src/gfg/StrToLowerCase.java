package gfg;

public class StrToLowerCase {


        static String toLower(String s) {
            // code here

            // number ->
            char[] arr = new char[s.length()];
            int index = 0 ;
            for(char  c: s.toCharArray()){

                if(c >=65 && c<91 ){

                    c = (char)( c + 32);
                    arr[index++] = c;

                }
                else{
                    arr[index++] = c;


                }
            }
            // return String.valueOf(arr);
            return new String(arr);
        }


    static String toLower2(String s) {
        // code here

        // number ->
        char[] arr = new char[s.length()];

        for(int i = 0; i< s.length() ; i++){

            char c = s.charAt(i);


            if(c >=65 && c<91 ){

                    c = (char)( c + 32);
                arr[i] = c;

            }
            else{
                arr[i] = c;


            }
        }
        // return String.valueOf(arr);
        return new String(arr);
    }




    public static void main(String[] args) {
        System.out.println(toLower("raZz"));
        System.out.println(toLower2("raZz"));


    }
}
