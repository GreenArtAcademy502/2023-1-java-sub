package com.green.javasub.ch04;

public class ForQuiz5 {
    public static void main(String[] args) {
        int dan = 6;
        printGugudan(dan);
        System.out.println();

        int sDan = 2, eDan = 8;
        printGugudan(sDan, eDan);
    }

    static void printGugudan(int sDan, int eDan) {
        for(int i=sDan; i<=eDan; i++) {
            printGugudan(i);
            System.out.println();
        }
    }

    static void printGugudan(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
        }
    }


}
