package main.java;

import java.util.Scanner;

public class TryCatch_51 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (Exception ex) {
            System.out.println(ex.toString().contains("string") ? ex.toString().substring(0, ex.toString().indexOf(":")) : ex);
        }
        sc.close();
    }
}
