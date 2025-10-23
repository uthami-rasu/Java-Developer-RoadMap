package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyHashSet<T> {

    // hash set basically used to store unique elements




    public static void main(String[] args) {


        HashSet<Integer> unique = new HashSet<>();



        unique.add(1);
        unique.add(11);
        unique.add(12);
        unique.add(13);
        unique.add(14);


        unique.addAll(new HashSet<>(Arrays.asList(1,2,3,4)));


        unique.remove(3);


        unique.removeIf((e)-> e == 1);


        unique.removeAll(unique.stream().filter(e -> e % 2 == 0 ).toList());


        System.out.println(unique.contains(2));


        System.out.println(unique);








    }
}
