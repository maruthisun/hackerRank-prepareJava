package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class LoopsI6 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.rangeClosed(1, 10).forEach(num -> System.out.println(N + " x " + num + " = " + N * num)
        );
        bufferedReader.close();
    }
}
