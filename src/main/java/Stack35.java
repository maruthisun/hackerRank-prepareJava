package main.java;

import java.util.Scanner;
import java.util.Stack;

public class Stack35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            System.out.println(isBalanced(input));
        }
        sc.close();
    }
    private static boolean isBalanced(String s) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                charStack.push('(');
            } else if (s.charAt(i) == '{') {
                charStack.push('{');

            } else if (s.charAt(i) == '[') {
                charStack.push('[');

            } else if (s.charAt(i) == ')') {
                if (charStack.isEmpty()) return false;
                if (charStack.pop() != '(') return false;
            } else if (s.charAt(i) == '}') {
                if (charStack.isEmpty()) return false;
                if (charStack.pop() != '{') return false;
            } else if (s.charAt(i) == ']') {
                if (charStack.isEmpty()) return false;
                if (charStack.pop() != '[') return false;
            }
        }
        return charStack.isEmpty();
    }
}

