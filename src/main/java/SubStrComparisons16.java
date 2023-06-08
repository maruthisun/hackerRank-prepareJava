package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubStrComparisons16 {

    public static String getSmallestAndLargest(String s, int k) {
//        String current = s.substring(0, k);
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

       /* for(int i = 1; i <= s.length()-k; i++){
            current = s.substring(i, i+k);
            if(current.compareTo(smallest) < 0) {
                smallest = current;
            }
            else if(current.compareTo(largest) > 0){
                largest = current;
            }
        }*/

        List<String> strList = new ArrayList<>();
        for(int i=0; i<=s.length()-k;i++){
            strList.add(s.substring(i, i+k));
        }

        smallest = strList.stream().min(String::compareToIgnoreCase).get();
        largest = strList.stream().max(String::compareToIgnoreCase).get();

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
