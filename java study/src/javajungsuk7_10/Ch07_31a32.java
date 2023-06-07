package javajungsuk7_10;

public class Ch07_31a32 {
    
    public static void main(String[] args) {
        // 7-31 ~ 7-32 추상 클래스, 추상 메서드

        // 7-17 ~ 7-20 참고
        System.out.println("추상 클래스는 미완성된 설계도다. 따로 완성을 시켜주고 난 뒤 객체(제품)생성이 가능하다.");
        System.out.println("구상(구체) 클래스 : 추상 클래스를 상속받아서 완전한 클래스(설계도)를 만들어주는 클래스다."); // 상속을 통해 완성을 시킨 후 객체 생성 가능

        // 순서
        System.out.println("1. 상속을 통해 자손클래스 완성 / 2. 객체 생성 / 3. 호출");

        GamePlayer gp = new GamePlayer();
        gp.Teemo();
        gp.Ari();
        System.out.println(gp);
    }
}

// 추상클래스
abstract class Player {
    abstract void Teemo();
    abstract void Ari();
}

// 객체생성을 위해 만들어주는 클래스 : 추상클래스를 상속받아서 완성을 시켜줘야 한다.
class GamePlayer extends Player{
    // 추상클래스를 구현 : 구현부{}를 만들어주면 완성된 클래스가 되어 객체를 생성할 수 있게 된다.
    void Teemo() {
        String line = "Teemo : 티모 대위, 명을 받들겠습니다!";
        System.out.println(line);
    };

    void Ari() {
        String line = "Ari : 똑똑한 여우는 절대 잡히지 않거든.";
        System.out.println(line);
    };
}
