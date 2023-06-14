package main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeChecker_56 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(bufferedReader.readLine());
            int n2 = Integer.parseInt(bufferedReader.readLine());
            int n3 = Integer.parseInt(bufferedReader.readLine());
            int n4 = Integer.parseInt(bufferedReader.readLine());
            int n5 = Integer.parseInt(bufferedReader.readLine());

            Prime prime = new Prime();
            prime.checkPrime(String.valueOf(n1));
            prime.checkPrime(String.valueOf(n1), String.valueOf(n2));
            prime.checkPrime(String.valueOf(n1), String.valueOf(n2), String.valueOf(n3));
            prime.checkPrime(String.valueOf(n1), String.valueOf(n2), String.valueOf(n3), String.valueOf(n4), String.valueOf(n5));

            bufferedReader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Prime {
    void checkPrime(String... nums) {
        for (String snum : nums) {
            if (new BigInteger(snum).isProbablePrime(100)) {
                System.out.print(snum + " ");
            }
        }
        System.out.println();
    }
}