package com.green.javasub.ch02;

public class PrintEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f;
        float f2 = 0.10f;
        double d = 1.23456789;

        System.out.printf("f1=%f\n", f1);
        System.out.printf("f2=%f\n", f2);
        System.out.printf("d=%f\n", d);
        System.out.printf("d=[%14.10f]\n", d);
        System.out.printf("d=[%-14.10f]\n", d);
        System.out.printf("d=[%.3f]\n", d);

        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%-20s]\n", url);
        System.out.printf("[%.8s]\n", url);
    }
}
