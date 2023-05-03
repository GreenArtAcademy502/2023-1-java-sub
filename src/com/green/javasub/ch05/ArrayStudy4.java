package com.green.javasub.ch05;

import java.util.Arrays;

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int n = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n++;
        }

        changeArrEvenMulti(arr, 3); //원본 건든다. 짝수인 값은 * 3처리

        System.out.println(Arrays.toString(arr));
    }

    static void changeArrEvenMulti(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] *= num;
            }
        }
    }
}
