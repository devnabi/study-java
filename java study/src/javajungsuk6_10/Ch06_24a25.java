package javajungsuk6_10;

public class Ch06_24a25 {
    
    public static void main(String[] args) {
        // 6-24 ~ 6-25 참조형 매개변수, 참조형 반환타입

        // flash 동영상 참고
        // 이전 강의와 비교하며 여러번 보기
        System.out.println("참조형 매개변수 : 변수의 값을 읽고 변경을 할 수 있다.");
        System.out.println("참조형 반환타입 : 복사한 객체의 주소를 반환한다.");
        
        // 참조형 매개변수 예제
        Data2 d = new Data2(); //객체 생성
        d.x = 10; // 참조변수 d가 가리키는 x객체에 10을 넣겠다.
        System.out.println("main : " + d.x); // x는 10이 출력된다.

        Data2.change(d); // change 메서드 호출
        System.out.println("After change(d.x)");
        System.out.println("main : " + d.x);

        // 참조형 반환타입 예제
        Data3 dd = new Data3();
        d.x = 10;

        Data3 d2 = Data3.copy(dd); // 같은 클래스에 위치하기 때문에 참조변수 없이 호출이 가능하다.
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);

    } // main의 끝
}

// 참조형 매개변수
class Data2 {
    int x;

    static void change (Data2 d) { // static이기때문에 자동으로 객체생성을 해준다.
        d.x = 1000; // change메서드 안에 있는 x변수는 지역변수다. d.x와 다른 x이다. 참조형 매개변수이기때문에  d.x를 변경하는 것이 가능하다.
        System.out.println("change x : " + d.x); // d.x값은 1000이 출력된다.
    }
} // class의 끝

// 참조형 반환타입
class Data3 {
    int x;

    static Data3 copy(Data3 dd) { // static이기때문에 자동으로 객체생성을 해준다.
        Data3 tmp = new Data3(); // 새로운 객체 tmp를 생성한다.
        tmp.x = dd.x; // d.x의 값을 tmp.x에 복사한다.
        return tmp; // 복사한 객체의 주소를 반환한다.
    }
} // class의 끝
