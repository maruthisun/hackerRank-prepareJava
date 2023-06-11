package main.java;

public class Generics37 {

    public static void main(String[] args) {

        Integer[] iArr = {1, 2, 3};
        String[] sArr = {"Hello", "World"};

        printArray(iArr);
        printArray(sArr);
    }

    static <T> void printArray(T[] array) {
        for (T elements : array) {
            System.out.println(elements);
        }
    }
}
