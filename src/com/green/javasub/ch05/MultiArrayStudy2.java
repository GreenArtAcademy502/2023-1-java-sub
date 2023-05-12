package com.green.javasub.ch05;

public class MultiArrayStudy2 {
    public static void main(String[] args) {
        int[][] score = {
                { 90, 80, 70 },
                { 95, 33, 12 },
                { 100, 100, 88 },
                { 100, 100, 100 },
        };
        printArrAll(score);
        int sum = sumArrAll(score);
        System.out.println("sum : " + sum);
    }

    public static int sumArrAll(int[][] arrs) {
        int sum = 0;
        for(int[] arr : arrs) { sum += sumArr(arr); }
        return sum;
    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for(int val : arr) { sum += val; }
        return sum;
    }

    public static void printArrAll(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
           printArr(arr[i]);
        }
    }

    public static void printArr(int[] arr) {
        System.out.print("{ ");
        int innerArrLen = arr.length;
        if(innerArrLen > 0) {
            System.out.print(arr[0]);
            for(int z=1; z<arr.length; z++) {
                System.out.printf(", %d", arr[z]);
            }
        }
        System.out.println(" }, ");
    }
}
