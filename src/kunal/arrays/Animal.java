package kunal.arrays;

public interface Animal {

    default void sound(){

        System.out.println("Some Sound!");
    };
}
