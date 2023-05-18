package com.green.javasub.ch06;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        User u1 = new User();

        //랜덤한 카드객체 주소값 리턴,
        //리턴값 카드객체 주소값은 cardList에서 삭제해 주세요.
        Card c1 = cd.pick();
        u1.receiveCard(c1);
        u1.receiveCard(cd.pick());

        //내가 가지고 있는 카드 점수
        //출력
        //카드 리스트 출력
        //점수 : 23
        u1.showTotalNum();
    }
}
