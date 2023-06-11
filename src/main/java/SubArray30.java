package main.java;

import java.util.Scanner;

public class SubArray30 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        int negCount = 0;

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum < 0) {
                    negCount++;
                }
            }
        }
        System.out.println(negCount);
    }
}
