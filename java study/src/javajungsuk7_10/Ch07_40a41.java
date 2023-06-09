package javajungsuk7_10;

public class Ch07_40a41 {
    
    public static void main(String[] args) {
        // 7-40 ~ 7-41 디폴트(default)메서드와 static메서드

        // 인터페이스에 추가된 기능 default, static메서드 (jdk 1.8부터)
        // 인터페이스에 새로운 추상메서드를 추가하기 어렵다.

        System.out.println("만약 인터페이스에 추상메서드를 추가하려면 클래스를 만들어서 그 메서드를 구현을 해야하는데 널리쓰이는 인터페이스일수록 파장이 크기 때문에 해결하려고 만들어진 것이 default메서드다.");
        System.out.println("인터페이스의 구현가 없는 추상메서드를 사용한 이유는 충돌을 없애기 위함이였지만, default는 구현부를 만들어줘서 충돌위험이 있다.");
        System.out.println("그 충돌을 해결하기 위한 방법 : 직접 오버라이딩을 해주면 해결된다."); // default간의 충돌발생 or 조상클래스의 메서드와 충돌발생(조상이 우선)
    }
}

interface MyInterface {
    void method(); // 추상메서드
    default void newMethod() {}; // default메서드는 인터페이스 규칙 위반이지만 예외로 가능하다.
}
