package main.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class BigDecimal25 {

    public static void main(String[] args) {
        //Input`ZX
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        s = Arrays.stream(s).filter(str -> (str != null && str.length() > 0))
                .sorted((s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1))).toArray(String[]::new);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
