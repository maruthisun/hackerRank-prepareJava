package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array1D_P2_32 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nOfQueries = in.nextInt();

        for (int q = 0; q < nOfQueries; q++) {
            int size = in.nextInt();
            int leap = in.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = in.nextInt();
            }

            if (canWin(a, leap, 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    private static boolean canWin(int[] a, int leap, int index) {
        if (index >= a.length) {
            return true;
        }
        if (index < 0 || a[index] == 1) {
            return false;
        }
        a[index] = 1;
        return canWin(a, leap, index + 1) || canWin(a, leap, index - 1) || canWin(a, leap, index + leap);
    }
}
