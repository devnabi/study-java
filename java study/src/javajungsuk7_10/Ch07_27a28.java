package javajungsuk7_10;

public class Ch07_27a28 {
    
    public static void main(String[] args) {
        // 7-27 ~ 7-28 매개변수 다형성

        // 매개변수의 다형성 : 메서드 호출 시, 자신과 같은 타입 or 자손 타입의 인스턴스를 넘겨줄 수 있다.

        //다형성의 장점2가지
        System.out.println("1. 다형적 매개변수 / 2. 하나의 배열로 여러종류 배열 다루기");

        
        // 다형성
        // 1. 자손 객체를 다루는 것
        // Wand w = new Star();
        // 2. 조상과 자식관계 / 참조변수 형변환
        // Wand w2 = (Wand)s;
        // 3. instanceof 연산자
        
        Star s = new Star();
        Marco m = new Marco();
        s.magic(m);
        System.out.println("Star의 나이는 " + s.age + "살이다.");
        System.out.println("Star의 자주 쓰는 마법은 " + s.rainbow);
    }
}

class Wand {
    int attackPower = 100;
    String rainbow = "Bling Bling Rainbow Punch!";
    String hornWhale = "Bling Bling Horn Whale Attack!";

    void magic(Wand w) { // 잘 모르겠다. 그냥 정리하면서 해봤다... 맞는지도 모르겠다.
        attackPower += w.attackPower;
    }
} // class의 끝

class Marco extends Wand {}
class Star extends Wand {
    int age = 14;
} // class의 끝
