package com.xiaobang.generics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        String[] arr1 = {"aaaa", "bbbb", "cccc"};
        Integer[] arr2 = {10, 20, 30};
        Double[] arr3 = {1.1, 2.1, 3.1, 4.1};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

    }

    public static <T> void printArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}


