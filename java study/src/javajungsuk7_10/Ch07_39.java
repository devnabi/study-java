package javajungsuk7_10;

public class Ch07_39 {
    
    public static void main(String[] args) {
        // 7-39 인터페이스의 장점(1) / 인터페이스의 장점(2)

        // 두 대상(객체)간의 연결, 대화, 소통을 돕는 '중간역할'을 한다.
        // inter : ~사이(between) / face : 얼굴 / 두 대상 사이
        // 선언(설계)과 구현을 분리시킬 수 있게 한다.

        A a = new A();
        a.method(new B());
        a.method(new C());

        System.out.println("기계와 소통(사용)하기 쉽게 하려고 만든 것이다. 기계를 다루려면 어렵고 인터페이스(껍데기)를 만들면 사용하기 쉽다.");
        System.out.println("컴퓨터의 GUI는 사람이 컴퓨터를 다루기 쉽게 하려고 만든 것이다. 컴퓨터가 바뀌어도 문제가 없고 변경에 유리하다.");
        System.out.println("자판기를 생각하면 쉽다. 사람이 자판기를 이용할 때 버튼(껍데기)만 있으면 사용가능하고 자판기 내부가 바뀌어도 상관이 없다.");
        System.out.println("개발 시간을 단축할 수 있다. 직접결합으로 코드를 짜면 사용자는 기다려야 하지만 인터페이스를 쓰면 기다리지 않아도 된다.");
        System.out.println("표준화가 가능하다.(JDBC(인터페이스 집합 : 껍데기)를 사용하면 코드를 변경하지 않고도 데이터를 줄 수 있다.)"); // 강의 DB설명 참고
        System.out.println("강의 7-39(2) 참고 : 서로 관계없는 클래스끼리도 관계를 맺어줄 수 있다."); // 어떤 관계없는 클래스들을 묶어서 같은 작업을 하게 하고 싶을 때, 인터페이스를 이용해서 관계를 맺어주고 사용하면 됟다.
    }
}

// 강한(직접) 결합
class A {
    public void method(I i) {
        i.method(); // B를 호출
    }
}

// 인터페이스 선언
interface I {
    public void method(); // A의 선언부만 떼어내기
}

//느슨한 결합
class B implements I { // 인터페이스를 선언하고 변경에 유리하도록 선언과 구현을 분리하여 완성시킨다.
    public void method() {
        System.out.println("B 인터페이스를 구현한 클래스의 객체만 가능하다. implements를 빼면 안 된다.");
    }
}

// 느슨한 결합 2
class C implements I { // 인터페이스를 선언하고 변경에 유리하도록 선언과 구현을 분리하여 완성시킨다.
    public void method() {
        System.out.println("C 인터페이스를 구현한 클래스의 객체만 가능하다. implements를 빼면 안 된다.");
    }
}
