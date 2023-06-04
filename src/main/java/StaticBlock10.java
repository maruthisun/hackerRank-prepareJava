package main.java;

import java.util.Scanner;

public class StaticBlock10 {
    public static int breadth;
    public static int height;
    static boolean positive;

    static{

        Scanner scanner = new Scanner(System.in);

        breadth = scanner.nextInt();
        height = scanner.nextInt();

        if(breadth > 0 && height > 0)
            positive = true;
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        scanner.close();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        if(positive)
            System.out.println(breadth * height);
    }
}
