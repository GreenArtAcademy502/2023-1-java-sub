package com.green.javasub.ch04;

public class ForStudy1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("하하" + i);
        }
        System.out.println("----");
        for (int i = 1; i < 6; i++) {
            System.out.println("hello");
        }
        System.out.println("----");
        for (int i = 0; i < 8; i++) { //8번 반복
            //콘솔에 1~8까지 출력 숫자(개행)
            System.out.println(i + 1);
        }
        System.out.println("----");
        for (int i = 15; i < 23; i++) {
            //콘솔에 1~8까지 출력 숫자(개행)
            System.out.println(i-14);
        }

        System.out.println("----");
        for (int i = 30; i > 25 ; i--) {
            //콘솔에 5~1까지 출력 숫자(개행)
            System.out.println(i - 25);
        }
    }
}
