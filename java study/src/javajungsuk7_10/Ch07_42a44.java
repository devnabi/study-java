package javajungsuk7_10;

public class Ch07_42a44 {
    
    public static void main(String[] args) {
        // 7-42 ~ 7-44 내부 클래스의 종류, 특징, 선언

        // 내부 클래스(inner class) : 클래스 안에 클래스
        // 내부 클래스의 장점 : 1. 객체생성을 하지 않고도 외부 클래스의 멤버에 쉽게 접근할 수 있다. / 2. 코드의 복잡성을 줄일 수 있다.(캡슐화)

        // 내부 클래스의 종류와 특징
        System.out.println("포인트 : 변수(iv, cv, lv)와 각 클래스의 특징이 같다고 보면 된다.");
        System.out.println("내부 클래스의 종류와 유효범위는 변수(iv, cv, lv)와 같다.");
        System.out.println("인스턴스 클래스, Static 클래스, 지역 클래스, 익명 클래스가 있다.");
        System.out.println("익명 클래스 : 클래스의 선언과 객체 생성을 동시에 하는 이름없는 일회용 클래스다."); // 많이 쓰지는 않지만 이벤트처리할 때 많이 쓴다는 것은 알아두자.
    } // main의 끝
}

class A1 {
    B1 b1 = new B1();
    int a = 10;
    
    class B1 {
        void Method() {
            System.out.println(a); // 객체생성없이 외부클래스 멤버에 접근 가능
        }
    } // 내부 클래스의 끝
} // 외부 클래스의 끝

// class C1 {
//     B1 b1 = new B1(); B1은 내부 클래스기때문에 다른 클래스에서는 접근 불가
// }
