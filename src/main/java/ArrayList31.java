package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList31 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int noFLines = in.nextInt();
        List<List<Integer>> mainList = new ArrayList<>();
        for (int i = 0; i < noFLines; i++) {
            int size = in.nextInt();
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                int num = in.nextInt();
                subList.add(num);
            }
            mainList.add(subList);
        }

        int nOfQueries = in.nextInt();
        for (int q = 0; q < nOfQueries; q++) {
            int row = in.nextInt();
            int col = in.nextInt();

            try {
                System.out.println(mainList.get(row - 1).get(col - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}
