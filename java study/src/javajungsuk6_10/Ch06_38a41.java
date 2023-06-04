package javajungsuk6_10;

public class Ch06_38a41 {
    
    public static void main(String[] args) {
        // 6-38 ~ 6-41 변수의 초기화, 멤버변수의 초기화

        // 지역변수는 수동으로 초기화를 해야한다.
        // 1. 명시적 초기화 (=): 대입연산자를 이용한 간단 초기화
        // 2. 인스턴스 초기화 - {} / static 초기화 - satic {}: 블럭을 이용한 복잡 초기화
        // 3. 생성자(iv)초기화

        Test test = new Test(); // 생성자에 있는 인스턴스의 x의 값을 출력하고 싶어서 객체를 생성했다.

        System.out.println("포인트 : 초기화의 순서 - cv >> iv >> 자동 >> 간단 >> 복잡으로 외우기");
        System.out.println("인스턴스 변수 : 유지력이 높기 때문에 자동 초기화를 한다.");
        System.out.println("지역변수 : 재사용이 빈번하면 성능이 떨어지기 때문에 자동 초기화를 하지 않는다.");
        System.out.println("참조형 변수가 가질 수 있는 값은 null과 객체주소다. null은 초기화를 한 것이 아니라 기본값이기 때문에 객체주소를 대입해준다.");
        System.out.println(Test.z); // 7
        System.out.println(test.x); // 10
    } // main의 끝
}

class Test {
    // 인스턴스 변수는 기본값으로 자동 초기화를 해주기 때문에 대입을 해도 에러가 나지 않는다.
    int x;
    int y = x;
    static int z = 5; // 클래스 변수의 명시적 초기화
    static {z = 7;} // 클래스 변수의 복잡 초기화
    {x = 1;} // 인스턴스 변수의 복잡 초기화

    // 생성자 초기화
    Test() {
        x = 10;
    }

    void method() {
        // int x; 지역변수는 메서드 호출 수행 시에만 존재하기 때문에 수명이 짧아 이것을 자동초기화를 하지는 않는다. 어떤 값인지 모르기 때문에 대입이 불가능하고 에러가 난다.

        // 올바른 예시
        int lvx = 10; // 값을 초기화 해주기
        int lvy =lvx; // 지역변수이지만 값을 초기화 해줬기때문에 대입이 가능해진다.
        System.out.println(lvy);
    }
} // class의 끝

class Reset {
    int a = 3; // 기본형 변수의 초기화
    Test lv = new Test(); // 참조형 변수의 초기화
}
