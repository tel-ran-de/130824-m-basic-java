package org.example;

public class Utils {
    public static int[] getNumbers() {
        int[] arr = {1, 2, 3};
        return arr;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
