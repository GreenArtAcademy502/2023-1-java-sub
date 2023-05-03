package com.green.javasub.ch05;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStudy6 {
    public static void main(String[] args) {

        //                   배열크기, 랜덤값 최소값, 랜덤값 최대값
        //int[] arr = getRandomArr(7, 6, 9); //중복허용.
        //System.out.println(Arrays.toString(arr));

        int[] arr2 = getRandomNoDuplicatedArr(6, 1, 6);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] getRandomNoDuplicatedArr(int len, int sVal, int eVal) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (eVal - sVal + 1)) + sVal;
            for (int z=0; z<i; z++) {
                if(arr[i] == arr[z]){
                    i--;
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] getRandomArr(int len, int sVal, int eVal) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (eVal - sVal + 1)) + sVal;
        }
        return arr;
    }
}
