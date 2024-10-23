package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = Utils.getNumbers();
        System.out.println(Arrays.toString(arr));

        int[] arrNew = {0, -10, 1200, 20};
        System.out.println(Utils.findMax(arrNew));
    }
}