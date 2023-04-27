package com.green.javasub.ch04;

public class ForQuiz2 {
    public static void main(String[] args) {
        int star = 5;
        final int ROW_CNT = 5;
        int max = star * star;
        for (int i = 1; i <= max; i++) {
            System.out.print("*");
            if(i % ROW_CNT == 0) {
                System.out.println();
            }
        }


        System.out.println("---------------");
        for (int i = 0; i < star; i++) {
            for (int z = 0; z < star; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //25번 반복되는 for문 작성
        //*****
        //*****
        //*****
        //*****
        //*****
    }
}
