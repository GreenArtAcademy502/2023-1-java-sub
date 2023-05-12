package com.green.javasub.ch05;

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = {
                { 90, 80, 70 },
                { 95, 33, 12 },
                { 100, 100, 88 },
                { 100, 100, 100 },
        };

        for(int i=0; i<score.length; i++) {
            System.out.print("{ ");
            int innerArrLen = score[i].length;
            if(innerArrLen > 0) {
                System.out.print(score[i][0]);
                for(int z=1; z<score[i].length; z++) {
                    System.out.printf(", %d", score[i][z]);
                }
            }
            System.out.println(" }, ");
        }

//        int[] t1 = score[1];
//        System.out.println(t1[1]);
//        System.out.println(score[1][1]);
//        System.out.println(score[2][2]);


    }
}
