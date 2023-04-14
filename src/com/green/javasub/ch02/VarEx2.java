package com.green.javasub.ch02;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20, temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x : " + x); //20
        System.out.println("y : " + y); //10

    }
}
