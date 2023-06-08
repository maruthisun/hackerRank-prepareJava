package main.java;

import java.util.Scanner;

public class StrReverse17 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer sb = new StringBuffer();
        for(int i=A.length()-1;i>=0;i--){
            sb.append(A.charAt(i));
        }
        if(A.compareTo(sb.toString()) == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
