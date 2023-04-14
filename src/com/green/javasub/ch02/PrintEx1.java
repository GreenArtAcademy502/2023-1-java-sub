package com.green.javasub.ch02;

public class PrintEx1 {
    public static void main(String[] args) {
        byte b = 1;
        char c = 'B';
        String s = "B";
        int finger = 11;
        long big = 100_000_000_000L;
        long big2 = 100000000000L;

        System.out.printf("b = %d\n", b);
        System.out.println("b = " + b);

        System.out.printf("b = %d, c = %c\n", b, c);
        System.out.println("b = " + b + ", c = " + c);

        System.out.printf("c = %c, %d\n", c, (int)c);
        System.out.printf("finger=[%d]\n", finger);
        System.out.printf("finger=[%5d]\n", finger);
        System.out.printf("finger=[%-5d]\n", finger);
        System.out.printf("finger=[%-5d]\n", 123456);
        System.out.printf("finger=[%05d]\n", 111);

        System.out.printf("mon=[%02d]\n", 1);
        System.out.printf("mon=[%02d]\n", 12);

        System.out.printf("%4d-%02d-%02d\n", 2023, 1, 2);
        System.out.printf("%4d-%02d-%02d\n", 2023, 10, 22);

        System.out.printf("%d\n", big2);
        System.out.printf("%,d\n", big2);

    }
}
