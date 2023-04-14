package com.green.javasub.ch02;

//p.25
public class Naming {
    public static void main(String[] args) {
        //단어가 1개 NAMING
        //단어가 2개 SUPER NAMING
        //단어가 3개 SUPER ULTRA NAMING

        // 카멜 케이스 기법 (변수명, 메소드명)
        // naming
        // superNaming
        // superUltraNaming

        // 파스칼 케이스 기법 (클래스명)
        // Naming
        // SuperNaming
        // SuperUltraNaming

        // 스네이크 케이스 기법 + all 대문자 (상수명)
        // NAMING
        // SUPER_NAMING
        // SUPER_ULTRA_NAMING

        // 규칙
        // 1. 대소문자 구분, 길이 제한 없음.
        int aaa, aaA, aAa, Aaa, aaaaaaaaaaaaaaaaaaaaaaaaaaa;

        // 2.예약어는 이름으로 사용 X
        // int int;
        // int public;

        // 3.숫자로 시작하면 X
        //int 3aa;
        int a3a, aa3; //두번째 자리부터는 숫자 가능

        // 4.특수기호는 _, $만 가능
        int _12, $12, _aaaa, aaa_aa, fff$ff;

    }
}
