package main.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor24
{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            boolean matchFound = false;
            Matcher matcher = Pattern.compile("<(.+)>([^<]+)</\\1>").matcher(line);

            while(matcher.find()){
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if(! matchFound){
                System.out.println("None");
            }

            testCases--;
        }
        in.close();
    }
}
