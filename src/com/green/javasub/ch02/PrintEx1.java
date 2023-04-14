package com.green.javasub.ch02;

public class PrintEx1 {
    public static void main(String[] args) {
        byte b = 1;
        char c = 'B';
        int finger = 10;
        long big = 100_000_000_000L;
        long big2 = 100000000000L;

        System.out.printf("b = %d\n", b);
        System.out.println("b = " + b);

        System.out.printf("b = %d, c = %c\n", b, c);
        System.out.println("b = " + b + ", c = " + c);

        System.out.printf("c = %c, %d\n", c, (int)c);

    }
}
