package com.green.javasub.ch06;

public class ObjectStudy1 {
    public static void main(String[] args) {
        //클래스, 인스턴스(객체, object)

        //객체 > 필드, 메소드
        //필드 > 값 저장
        //메소드 > 동작
        Human h2 = new Human();
        h2.name = "이민용";
        h2.age = 33;

        Human h1 = new Human();
        h1.name = "홍길동";
        h1.age = 20;
        h1.introduce();

        h2.introduce();
    }
}

class Human {
    String name;
    int age;

    void introduce() {
        System.out.printf(
                "저의 이름은 %s이고 나이는 %d살 입니다.\n"
                , name, age);
    }
}
