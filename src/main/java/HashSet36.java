package main.java;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet36 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> hashSet = new HashSet<>();
        for (int ai = 0; ai < pair_left.length; ai++) {
            hashSet.add(pair_left[ai] + " " + pair_right[ai]);
            System.out.println(hashSet.size());
        }
        s.close();
    }
}
