package javajungsuk6_10;

public class Ch06_23 {
    
    public static void main(String[] args) {
        // 6-23 기본형 매개변수

        // flash 동영상 참고
        // 이번 강의하고 다음 강의 굉장히 중요하다! 2개 다 보고 비교해가면서 여러번 다시 보기 / 예제 그림그리는 연습
        System.out.println("기본형 매개변수 : 변수의 값을 읽기만 하고 변경은 할 수 없다.");
        
        Data d = new Data(); //객체 생성
        d.x = 10; // 참조변수 d가 가리키는 x객체에 10을 넣겠다.
        System.out.println("main : " + d.x);

        Data.change(d.x); // change 메서드 호출
        System.out.println("After change(d.x)");
        System.out.println("main : " + d.x);

    } // main의 끝
}

class Data {
    int x;

    static void change (int x) { // static이기때문에 자동으로 객체생성을 해준다.
        x = 1000; // change메서드 안에 있는 x변수는 지역변수다. d.x와 다른 x이다.
        System.out.println("change x : " + x); // 지역변수 x는 1000이 출력된다.
    }
}
