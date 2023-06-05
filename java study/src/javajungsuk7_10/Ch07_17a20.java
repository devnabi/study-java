package javajungsuk7_10;

public class Ch07_17a20 {
    
    public static void main(String[] args) {
        // 7-17 ~ 7-20 제어자, static, final, abstract

        // 제어자(modifier) : 클래스와 클래스의 멤버에 부가적인 의미 부여 / 형용사 + 명사를 생각하면 쉽다.
        // 접근 제어자는 다음 7-21에서 설명

        System.out.println("// 하나의 대상에 여러 제어자를 같이 사용가능하다. / '접근 제어자'는 4개 중 하나만 사용가능하다.");
        System.out.println("제어자의 순서는 상관없지만 관례적으로는 접근 제어자를 가장 왼쪽에 쓴다."); // final보다는 static을 더 먼저 쓴다.

        // AbstractTest test = new AbstractTest();
        System.out.println("추상 클래스는 미완성된 설계도다. 따로 완성을 시켜주고 난 뒤 객체(제품)생성이 가능하다.");
        System.out.println("구상(구체) 클래스 : 추상 클래스를 상속받아서 완전한 클래스(설계도)를 만들어주는 클래스다."); // 상속을 통해 완성을 시킨 후 객체 생성 가능
    }
}

// static : 클래스의, 공통적인
class StaticTest {
    static int iv = 3; // 명시적 초기화 / 인스턴스 변수(iv) + static = static(클래스) 변수 cv가 된다.

    static {} // 복잡 초기화

    static int max(int a, int b) { // 객체 생성 x / 객체 생성이 필요한 인스턴스 멤버 사용불가
        return a > b ? a : b;
    }
} // class의 끝

// final : 마지막의, 변경될 수 없는
final class FinalTest { // 조상이 될 수 없는 마지막 클래스
    final int MAX = 100; // 상수 : 값을 변경할 수 없는 변수

    // final void getMaxSize() { // 오버라이딩을 할 수 없는 메서드(변경불가)
    //     final int Lv = MAX; // 값을 변경할 수 없는 지역변수(상수)
    //     return MAX;
    // }
} // class의 끝

// abstract : 추상의, 미완성의
abstract class AbstractTest { // 추상 클래스 : 미완성된 클래스 >> 미완성된 메서드를 포함한 클래스를 말하는 것
    abstract void move(); // 추상 메서드 : 미완성된 메서드 >> 선언부는 있지만 구현부{}는 없는 메서드를 말하는 것
} // class의 끝
