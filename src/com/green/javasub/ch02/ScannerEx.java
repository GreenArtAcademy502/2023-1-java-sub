package com.green.javasub.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두 자리 정수를 입력해 주세요 > ");
        String input = scan.nextLine();
        System.out.println("input : " + input);
        System.out.println(input + input);

        long l = 100L;
        int ii = (int)l;
        String s = "10";
        //int ii2 = (int)s;

        int num = Integer.parseInt(input);
        System.out.println(num + num);
    }
}
