package javajungsuk7_10;

public class Ch07_35a37 {
    
    public static void main(String[] args) {
        // 7-35 ~ 7-37 인터페이스의 선언, 상속, 구현

        // 인터페이스(interface) : 추상메서드의 집합
        // 핵심은 구현된 것이 전혀없는 설계도, 껍데기다. (모든 멤버가 public)
        // 추상메서드를 완성하는 것이 구현이다.
        System.out.println("중요 포인트 : 추상클래스와 인터페이스의 차이점은 인터페이스는 iv를 가질 수 없고 추상메서드를 포함한다. 추상클래스는 생성자, iv 가능하다.");
        System.out.println("인터페이스의 조상은 인터페이스만 가능하다. object X");
        System.out.println("추상클래스와 다르게 다중상속이 가능하다. 추상메서드는 충돌해도 문제가 없다. 선언부가 일치하고 구현부가 없는 경우 가능하다.");
    }
}

interface Interface {
    public static final int test = 3; // 상수 : public static final 생략가능
    public abstract String test2(); // 추상메서드 : public abstract 생략가능
    void move(int x, int y);
    void attack(Unit u);
}

// 생략가능 확인
interface Interface2 {
    int test = 3;
    String test2();
}

// 인터페이스를 상속받으려면 implements(구현)을 써야한다. / 일부만 구현하는 경우 앞에 추상클래스와 동일하게 abstract를 붙여야 한다.
abstract class Fightable implements Interface {
    public void move(int x, int y){
        System.out.println("x = " + x + ", y = " + y);
    };
    public void attack(Unit u){
        System.out.println("");
    };
}
