package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Array2D29 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Integer[][] intArr = arr.stream().map(l -> l.toArray(Integer[]::new)).toArray(Integer[][]::new);
        int sum = -81;
        for(int i = 0; i < 4; i++){
            for(int j=0;j<4;j++){
                int topRow = intArr[i][j] + intArr[i][j+1] + intArr[i][j+2];
                int midRow = intArr[i+1][j+1];
                int bottomRow = intArr[i+2][j] + intArr[i+2][j+1] + intArr[i+2][j+2];

                int rowSum = topRow + midRow + bottomRow;

                if(sum < rowSum){
                    sum = rowSum;
                }
            }
        }
        System.out.println(sum);
        bufferedReader.close();
    }
}
