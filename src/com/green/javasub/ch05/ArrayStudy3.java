package com.green.javasub.ch05;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        //for 10, 11, 12, 13 .... 19

        int n = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n++;
        }

        //원본 수정, 짝수인 값은 * 2 처리
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] *= 2;
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
