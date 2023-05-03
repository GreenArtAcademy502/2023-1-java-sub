package com.green.javasub.ch05;

import java.util.Arrays;

public class ArrayStudy2 {
    public static void main(String[] args) {
        String[] strArr = { "비행기", "기차", "배" };

        System.out.printf("* %s", strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            System.out.printf(", %s", strArr[i]);
        }
        System.out.println(" *");

        System.out.println("------");

        System.out.print("* ");
        for (int i = 0; i < strArr.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(strArr[i]);
        }
        System.out.println(" *");

        System.out.println("------");

        String r = Arrays.toString(strArr)
                .replace("[", "* ")
                .replace("]", " *");
        System.out.println(r);
       // * 비행기, 기차, 배 *
    }
}
