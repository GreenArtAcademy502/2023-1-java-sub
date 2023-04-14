package com.green.javasub.ch02;

public class VarEx1 {
    public static void main(String[] args) {
        //int 데이터타입 > 정수형 (소수점이 없는 숫자)
        //a 변수명
        //int a; 변수 선언 > 타입에 맞는 값 저장
        int a;
        a = 10; //초기화 (젤 처음 값 넣는 행위)
        System.out.println(a);
        System.out.println(10);

        a = 20; //대입한다. 값 넣는다.
        System.out.println(a);
        System.out.println(20);

        System.out.println("-----------");

        int year = 0; //변수 선언, 초기화 동시에 가능
        int age = 14;

        System.out.println(year); //0
        System.out.println(0); //0

        year = age + 2000;
        System.out.println(year); //
        System.out.println(2014); //

        age = age + 5;
        System.out.println(age); //19

    }
}
