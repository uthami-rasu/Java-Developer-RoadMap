package com.conditional_control;

public class ControlStructure {

    public static void main(String[] args) {

        System.out.println("1️⃣ Classic for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\n2️⃣ Enhanced for loop (for-each):");
        String[] cities = {"TENKASI", "MADURAI", "TRICHY"};
        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("\n3️⃣ While loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\n4️⃣ Do-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        System.out.println("\n5️⃣ Using break and continue:");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                System.out.println("Skipping 3");
                continue;  // skips this iteration
            }
            if (x == 5) {
                System.out.println("Breaking at 5");
                break;     // exits the loop
            }
            System.out.println("x = " + x);
        }
    }
}
