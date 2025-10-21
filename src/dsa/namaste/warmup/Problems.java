package dsa.namaste.warmup;

import java.util.Arrays;

public class Problems {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(searchElement(arr, 5, 1)); // linear search
        System.out.println(searchElement(arr, 5, 0)); // binary search
    }

    static int searchElement(int[] array, int searchElem, int algo) {
        int index = -1;

        if (algo != 1 && algo != 0) {
            throw new RuntimeException("Invalid Option Provided. It should be only '0' or '1'.");
        }

        if (algo == 1) {
            // Linear search
            for (int i = 0; i < array.length; i++) {
                if (array[i] == searchElem) {
                    return i;
                }
            }
            return -1;
        }

        // Binary search
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == searchElem) {
                return mid;
            } else if (array[mid] < searchElem) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
