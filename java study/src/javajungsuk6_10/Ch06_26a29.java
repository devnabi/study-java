package javajungsuk6_10;

public class Ch06_26a29 {
    
    public static void main(String[] args) {
        // 6-26 ~ 6-29 static메서드와 인스턴스 메서드

        // 인스턴스 메서드 : 객체생성을 하고 '참조변수.메서드이름()'으로 호툴 / 메서드 내에서 iv 사용가능
        // static 메서드(클래스 메서드) : 객체생성없이 '클래스이름.메서드이름()'으로 호출 / 메서드 내에서 iv 사용불가

        // static을 언제 붙여야 할까?
        System.out.println("중요 : 속성(멤버 변수) 중에서 공통 속성에 붙이기");
        System.out.println("중요 : 인스턴스 멤버(iv, im)을 사용하지 않는 메서드에 붙인다."); // 메서드는 명령묶음

    } // main의 끝
}

 class MyMethod {
    long a, b;

    // 인스턴스 변수
    long add() {
        return a + b;
    }

    // 지역 변수
    static long add(long a, long b){
        return a + b;
    }
} // class의 끝

 class TestClass {
    int iv; // 인스턴스 변수 / 객체 생성 후 사용가능
    static int cv; // 클래스 변수 / 언제든 사용가능

    void ivtest() {
        System.out.println(iv); // 객체 생성 후 호출가능
        System.out.println(cv); // 언제든 호출가능
    }

    static void cvtest() {
        // System.out.println(iv); static메서드 내에서는 iv를 사용할 수 없다. 객체생성을 하지 않기 때문이고 iv는 객체생성이 꼭 필요하다.
        System.out.println(cv);
        System.out.println("중요 : static내에서 iv를 호출할 수 없는 이유는 객체가 있을지 없을지 모르기 때문에 에러가 난다.");

    }
}
