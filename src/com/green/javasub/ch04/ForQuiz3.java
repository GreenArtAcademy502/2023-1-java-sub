package com.green.javasub.ch04;

public class ForQuiz3 {
    public static void main(String[] args) {
        int star = 5;
        for (int i = 0; i < star; i++) {
            for (int z = 0; z <= i ; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
