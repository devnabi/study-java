package javajungsuk7_10;

public class Ch07_38 {
    
    public static void main(String[] args) {
        // 7-38 인터페이스와 다형성

        System.out.println("중요 포인트 : 매개변수가 인터페이스라는 것은 인터페이스를 구현한 클래스의 객체만 들어올 수 있다는 것이다.");
        System.out.println("인터페이스를 메서드의 리턴타입으로 지정할 수 있다."); // 인터페이스를 구현한 클래스의 객체를 반환하는 것이다.

        Fightable f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter()); // Fightable 인터페이스를 구현한 Fighter클래스의 객체
    }
}

interface Fightable {
    // 인터페이스의 모든 메서드는 public abstract 예외없이.
    void move(int x, int y);
    void attack(Fightable f);

}

// 7-33 ~ 7-34의 Unit을 가져옴
class Fighter extends Unit implements Fightable{
    // 오버라이딩 규칙 : 조상(public)보다 접근제어자 범위가 좁으면 안 된다. / public을 붙여주지 않으면 default라 범위가 좁아서 안 된다.
    public void move(int x, int y) {
        System.out.println("이동");
    }
    public void attack(Fightable f) {
        System.out.println("공격");
    }
    // 리턴타입
    Fightable method() {
        Fightable f = new Fighter();
        return f;
    }
}
