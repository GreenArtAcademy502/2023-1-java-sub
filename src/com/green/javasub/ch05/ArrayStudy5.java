package com.green.javasub.ch05;

import java.util.Arrays;

public class ArrayStudy5 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int n = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n++;
        }

        int[] arr2 = changeArrEvenMulti(arr, 2);
        //원본 건들지 않는다. 짝수인 값은 * 3처리

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    static int[] changeArrEvenMulti(int[] arr, int num) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i] % 2 == 0 ? arr[i] * num : arr[i];
        }
        return temp;
    }
}
