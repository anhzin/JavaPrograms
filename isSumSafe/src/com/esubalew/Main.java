package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSumSafe(new int[]{5, -5, 0}));
        System.out.println(isSumSafe(new int[]{5, -2, 1}));
        System.out.println(isSumSafe(new int[]{}));
    }

    static int isSumSafe(int[] a) {
        if (a.length == 0)
            return 0;

        int sum = 0;

        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }

        for (int i=0; i<a.length; i++) {
            if (a[i] == sum)
                return 0;
        }

        return 1;
    }
}
