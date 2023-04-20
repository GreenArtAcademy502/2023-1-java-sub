package com.green.javasub.ch03;

public class OperatorEx16 {
    public static void main(String[] args) {
        double val = 12.345678;
        System.out.printf("%.1f\n", val);

        String result = String.format("%.1f\n", val);
        System.out.println("result : " + result);
    }
}
