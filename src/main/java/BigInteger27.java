package main.java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger27 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
