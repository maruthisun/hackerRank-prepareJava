package main.java;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List33 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int q = in.nextInt();
        int l = 0;
        while (l++ < q) {
            String operation = in.next();
            if (operation.equalsIgnoreCase("Insert")) {
                int insPos = in.nextInt();
                int num = in.nextInt();
                list.add(insPos, num);
            } else if (operation.equalsIgnoreCase("Delete")) {
                int delPos = in.nextInt();
                list.remove(delPos);
            }
        }
        list.stream().forEach(e -> System.out.print(e + " "));
        in.close();
    }
}
