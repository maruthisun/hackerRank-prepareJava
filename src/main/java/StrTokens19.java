package main.java;

import java.util.Scanner;

public class StrTokens19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        String[] outArr = s.split("[^A-Za-z0-9]+");
        if(!s.isEmpty()){
            System.out.println(outArr.length);

            for(String str : outArr){
                System.out.println(str);
            }
        }
        else{
            System.out.println(0);
        }
        //Arrays.stream(outArr).forEach(System.out::println);
        scan.close();
    }
}
