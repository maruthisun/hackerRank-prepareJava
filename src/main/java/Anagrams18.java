package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams18 {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        /*char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return (Arrays.equals(arrA, arrB));*/

        if(a.length()!=b.length()){
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        for(int i =0; i<a.length();i++){
            char x = a.charAt(i);
            long countA = a.chars().filter(c -> c == x).count();
            long countB = b.chars().filter(c -> c == x).count();
            if(countA!=countB){
                return false;
            }
        }
                return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
