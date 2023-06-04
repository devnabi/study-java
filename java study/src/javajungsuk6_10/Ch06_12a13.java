package javajungsuk6_10;

public class Ch06_12a13 {

    public static void main(String[] args) {
        // 6-12 ~ 6-13 클래스 변수, 인스턴스 변수

        // 개별 : 객체마다 다르게 유지되어야 하는 값
        // 공통 : 공통속성이 유지되어야 하는 값
        // cv는 클래스의 이름으로 사용하여야 하며, 객체생성을 하지 않아도 자동으로 생성이 된다.

        Card c = new Card();
        c.kind = "Heart";
        c.number = 5;

        // 참조변수를 사용하는 이 방법이 틀린 것은 아니지만 권장하는 방법은 아니다.
        // c.width = 150;

        // static 변수를 사용할 때는 클래스의 이름으로 사용하는 것이 좋다.
        Card.width = 100; // 폭을 100으로 따로 변경해주었다.

        System.out.println(" 이 카드의 무늬는 " + c.kind + "이며, " + "숫자는 " + c.number + "입니다.");
        System.out.println(" 폭은 " + Card.width + "이며, " + "높이는 " + Card.height + "입니다.");


    } // main의 끝

}

class Card {
    // 개별
    String kind; // 무늬
    int number; // 숫자

    // 공통
    static int width = 150; // 폭
    static int height = 250; // 높이

}
